package com.example.easilyapp;
import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.view.*;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
//import android.widget.AdapterView.OnLi;

public class AlunoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aluno);

        ConstraintLayout constraintLayout = findViewById(R.id.layout_disciplina_aluno);
        constraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AlunoActivity.this, DisciplinaAlunoActivity.class);
                startActivity(intent);
            }
        });
   }
}