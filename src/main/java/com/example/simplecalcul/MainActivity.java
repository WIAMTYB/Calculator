package com.example.simplecalcul;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    private EditText editText1;
    private EditText editText2;
    private EditText editTextResult;
    private RadioGroup radioGroup;
    private Button buttonReset;
    private Button buttonEquals;
    private Button buttonQuit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar = getSupportActionBar();


        if (actionBar != null) {
            // Titre de l'application
            actionBar.setTitle("Calculette");

            // Image (étiquette) à afficher à gauche du titre
            actionBar.setHomeAsUpIndicator(R.drawable.calcul1); // Remplacez ic_custom_label par votre image
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
    }


    public void Quitter(View view) {
        // Quitter l'application lors du clic sur le bouton "Quitter"
        finish();


    }
}