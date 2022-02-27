package com.example.btvn_buoi4.pdf;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.btvn_buoi4.R;

import java.util.ArrayList;
import java.util.List;

public class Activity_pdf extends AppCompatActivity {
    private RecyclerView rcv_pdf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf);
        rcv_pdf = findViewById(R.id.rcv_pdf);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplication(),RecyclerView.VERTICAL, false);
        PdfAdapter adapter = new PdfAdapter(setListPdf());
        rcv_pdf.setLayoutManager(linearLayoutManager);
        rcv_pdf.setAdapter(adapter);

        setToolbar();

    }

    private void setToolbar() {
        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.inflateMenu(R.menu.menu_item_pdf);
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()){
                    case R.id.search:
                        Toast.makeText(Activity_pdf.this, "This is menu search", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.option:
                        Toast.makeText(Activity_pdf.this, "This is menu option", Toast.LENGTH_SHORT).show();
                        break;
                }
                return true;
            }
        });

        getWindow().setStatusBarColor(getColor(R.color.color_status_bar));
    }

    private List<Pdf> setListPdf() {
        List<Pdf> pdfList = new ArrayList<>();

        pdfList.add(new Pdf("To skill a Mockingbird"));
        pdfList.add(new Pdf("To skill a Mockingbird"));
        pdfList.add(new Pdf("To skill a Mockingbird"));
        pdfList.add(new Pdf("To skill a Mockingbird"));
        pdfList.add(new Pdf("To skill a Mockingbird"));
        return pdfList;
    }
}