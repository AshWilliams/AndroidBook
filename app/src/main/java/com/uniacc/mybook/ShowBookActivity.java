package com.uniacc.mybook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;



public class ShowBookActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_book);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Bundle Extra = getIntent().getExtras();
        String titulo = Extra.getString("Titulo");

        final TextView txtTitulo = findViewById(R.id.titulo);
        final TextView txtAutor = findViewById(R.id.autor);
        final TextView txtResumen = findViewById(R.id.resumen);
        final TextView txtIsbnNumber = findViewById(R.id.isbn);

        txtTitulo.setText(titulo);
        txtAutor.setText(Extra.getString("Autor"));
        txtResumen.setText(Extra.getString("Resumen"));
        txtIsbnNumber.setText(Extra.getString("ISBN"));
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
