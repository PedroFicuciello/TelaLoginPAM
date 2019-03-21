package com.example.aluno.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

    private EditText USUARIO;
    private EditText SENHA;
    private Button BOTAO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        USUARIO = (EditText) findViewById(R.id.Login);
        SENHA = (EditText) findViewById(R.id.Senha);
        BOTAO = (Button) findViewById(R.id.btnEntrar);

        BOTAO.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {
                String txt = USUARIO.getText().toString();
                String pass = SENHA.getText().toString();
                String user = "PedroFicuciello";
                String senha = "Pedro";

                if(txt.equals(user)&& pass.equals(senha)) {
                    Toast.makeText(MainActivity.this, "Login realizado com sucesso!", Toast.LENGTH_LONG).show();
                }

                else {
                    Toast.makeText(MainActivity.this,"Usuário ou senha incorretos. Tente novamente!",Toast.LENGTH_LONG).show();
                }
            }
        });
        }
}
