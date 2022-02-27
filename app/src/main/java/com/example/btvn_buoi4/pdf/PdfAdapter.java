package com.example.btvn_buoi4.pdf;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.btvn_buoi4.R;

import java.util.List;

public class PdfAdapter extends  RecyclerView.Adapter{

    private List<Pdf> pdfList;

    public PdfAdapter(List<Pdf> pdfList) {
        this.pdfList = pdfList;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.pdf_layout_item,parent, false);
        return new PdfViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Pdf pdf = pdfList.get(position);
        ((PdfViewHolder) holder).tv_name_pdf.setText(pdf.getName());
    }

    @Override
    public int getItemCount() {
        return pdfList.size();
    }

    public class PdfViewHolder extends RecyclerView.ViewHolder{
        private TextView tv_name_pdf;

        public PdfViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_name_pdf = itemView.findViewById(R.id.tv_name_pdf);

        }
    }
}
