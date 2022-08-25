package br.unigran.agenda;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    EditText nome, numero;
    List dados;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nome = findViewById(R.id.nomeId);
        numero = findViewById(R.id.numeroId);
        dados = new ArrayList();
    }

    public void salvar(View view){
        Contato contato = new Contato();
        contato.setNome(nome.getText().toString());
        contato.setTelefone(numero.getText().toString());
        dados.add(contato);
        Toast.makeText(this, "Salvo com sucesso!", Toast.LENGTH_SHORT).show();
    }
}