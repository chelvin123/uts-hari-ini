package com.example.utsmobilechelvin;


import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.service.autofill.SavedDatasetsInfoCallback;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText username,password;
    Button buttonLogin, buttonreg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = (EditText) findViewById(R.id.editUsername);
        password = (EditText) findViewById(R.id.editPassword);
        buttonLogin = (Button) findViewById(R.id.ButtonLogin);
        buttonreg= (Button) findViewById(R.id.ButtonRegister);

        buttonreg.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"mengalihkan ke form register", Toast.LENGTH_SHORT).show();
                Intent intent =new Intent(MainActivity.this,regis.class);
                MainActivity.this.startActivity(intent);
            }
        });
        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usernameKey= username.getText().toString();
                String passwordKey= password.getText().toString();

                if (usernameKey.equals("user")&& passwordKey.equals("pass") ){
                    //jika login berhasil
                    SavedDatasetsInfoCallback email,password,username;
                    Toast.makeText(getApplicationContext(),"Cie sukses", Toast.LENGTH_SHORT).show();
                    Intent intent =new Intent(MainActivity.this,login.class);
                    MainActivity.this.startActivity(intent);
                    finish();
                }else {
                    //jika login gagal
                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                    builder.setMessage("Username atau passwordnya antum Na'am thu")
                            .setNegativeButton("Retry",null).create().show();
                }

            }
        });
    }
}
