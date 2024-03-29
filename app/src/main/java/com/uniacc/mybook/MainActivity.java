package com.uniacc.mybook;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        final EditText titulo =  findViewById(R.id.titulo);
        final EditText autor =  findViewById(R.id.autor);
        final EditText resumen =  findViewById(R.id.resumen);
        final EditText isbn =  findViewById(R.id.isbn);
        final Button ingresarButton = findViewById(R.id.guardar);

        ingresarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String title = titulo.getText().toString();
                String author = autor.getText().toString();
                String resume = resumen.getText().toString();
                String isbnumber = isbn.getText().toString();
                Intent ShowBookActivityIntent = new Intent(getApplicationContext(), ShowBookActivity.class);
                ShowBookActivityIntent.putExtra("Titulo", title);
                ShowBookActivityIntent.putExtra("Autor",author);
                ShowBookActivityIntent.putExtra("Resumen",resume);
                ShowBookActivityIntent.putExtra("ISBN",isbnumber);
                startActivity(ShowBookActivityIntent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
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
