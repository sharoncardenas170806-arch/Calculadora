package com.example.calculadora;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SumaRestaActivity extends AppCompatActivity {

    EditText num1, num2;
    Button btnSumar, btnRestar, btnSiguiente;
    TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suma_resta);

        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        btnSumar = findViewById(R.id.btnSumar);
        btnRestar = findViewById(R.id.btnRestar);
        btnSiguiente = findViewById(R.id.btnSiguiente);
        tvResultado = findViewById(R.id.tvResultado);

        btnSumar.setOnClickListener(v -> {
            if (num1.getText().toString().isEmpty() || num2.getText().toString().isEmpty()) {
                Toast.makeText(this, "Ingrese ambos números", Toast.LENGTH_SHORT).show();
                return;
            }

            double n1 = Double.parseDouble(num1.getText().toString());
            double n2 = Double.parseDouble(num2.getText().toString());
            double resultado = n1 + n2;

            tvResultado.setText("Resultado: " + resultado);
        });

        btnRestar.setOnClickListener(v -> {
            if (num1.getText().toString().isEmpty() || num2.getText().toString().isEmpty()) {
                Toast.makeText(this, "Ingrese ambos números", Toast.LENGTH_SHORT).show();
                return;
            }

            double n1 = Double.parseDouble(num1.getText().toString());
            double n2 = Double.parseDouble(num2.getText().toString());
            double resultado = n1 - n2;

            tvResultado.setText("Resultado: " + resultado);
        });

        btnSiguiente.setOnClickListener(v -> {
            Toast.makeText(this, "Aquí continúa la parte de multiplicación y división", Toast.LENGTH_SHORT).show();
        });
    }
}