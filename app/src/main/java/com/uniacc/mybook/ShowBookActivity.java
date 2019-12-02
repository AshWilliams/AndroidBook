package com.uniacc.mybook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;



public class ShowBookActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_book);

        Bundle Extra = getIntent().getExtras();
        String titulo = Extra.getString("Titulo");

        final TextView txtTitulo = findViewById(R.id.titulo);
        final TextView txtAutor = findViewById(R.id.autor);
        final TextView txtResumen = findViewById(R.id.resumen);
        final TextView txtIsbn = findViewById(R.id.isbn);

        txtTitulo.setText(titulo);
        txtAutor.setText(Extra.getString("Autor"));
        txtResumen.setText(Extra.getString("Resumen"));
        txtIsbn.setText(Extra.getString("isbn"));
    }
}
