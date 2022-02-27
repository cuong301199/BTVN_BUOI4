package com.example.btvn_buoi4.folder;

import static com.example.btvn_buoi4.R.menu.menu_item_folder;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.Toast;


import com.example.btvn_buoi4.R;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;
import java.util.List;

public class Activity_folder extends AppCompatActivity {
    private RecyclerView rcv_holder;
    private List<Folder> folderList;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_folder);

        rcv_holder = findViewById(R.id.rcv_folder);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplication(),RecyclerView.VERTICAL,false);
        FolderAdapter adapter = new FolderAdapter(setListFolder());

        rcv_holder.setLayoutManager(linearLayoutManager);
        rcv_holder.setAdapter(adapter);


        setToolbar();


    }

    private void setToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        toolbar.setNavigationIcon(R.drawable.icon_back);

        toolbar.setNavigationOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        toolbar.inflateMenu(menu_item_folder);
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()){
                    case R.id.add_menu:
                        Toast.makeText(Activity_folder.this, "This is menu add", Toast.LENGTH_SHORT).show();
                }
                return true;
            }
        });

        getWindow().setStatusBarColor(getColor(R.color.color_status_bar));
    }

    private List<Folder> setListFolder() {
        folderList = new ArrayList<>();
        folderList.add(new Folder("Video"));
        folderList.add(new Folder("Android"));
        folderList.add(new Folder("Applock"));
        folderList.add(new Folder("Books"));
        folderList.add(new Folder("Map"));
        folderList.add(new Folder("Authenticate Using Google..."));
        folderList.add(new Folder("New Folder"));
        folderList.add(new Folder("New Folder 1"));
        return folderList;
    }


//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_item_folder, menu);
//        return true;
//    }

}