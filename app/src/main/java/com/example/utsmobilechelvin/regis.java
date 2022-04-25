package com.example.utsmobilechelvin;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.service.autofill.SavedDatasetsInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class regis extends AppCompatActivity {
    EditText username,password,email;
    Button Simpan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regis);
        username = (EditText) findViewById(R.id.usernameRegis);
        password = (EditText) findViewById(R.id.passwordRegis);
        email =(EditText) findViewById(R.id.emailRegis);
        Simpan= (Button) findViewById(R.id.buttonSimpan);
        Simpan.setOnClickListener(new View.OnClickListener() {
            private void Save(String username, String password, String email){
            }
            public void onClick(View view) {
                String usernameRegister=username.getText().toString();
                String passwordRegister=password.getText().toString();
                String email1Register=email.getText().toString();
                SavedDatasetsInfo email,password,username;
                Toast.makeText(regis.this, "your username is "+usernameRegister,Toast.LENGTH_SHORT).show();
                Intent intent =new Intent(regis.this,MainActivity.class);
                regis.this.startActivity(intent);
            }
        });

    }
}