package com.example.ccnapreparation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class PdfQus extends AppCompatActivity {
    ListView pdfListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf_qus);

        pdfListView = (ListView) findViewById(R.id.pdfQus);

    }
}