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
    Button btnSumar, btnRestar, btnMultiplica, btnDivide;
    TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suma_resta);

        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        btnSumar = findViewById(R.id.btnSumar);
        btnRestar = findViewById(R.id.btnRestar);
        btnMultiplica = findViewById(R.id.btnMultiplica);
        btnDivide = findViewById(R.id.btnDivide);
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

        btnMultiplica.setOnClickListener(v -> {
            if (num1.getText().toString().isEmpty() || num2.getText().toString().isEmpty()) {
                Toast.makeText(this, "Ingrese ambos números", Toast.LENGTH_SHORT).show();
                return;
            }

            double n1 = Double.parseDouble(num1.getText().toString());
            double n2 = Double.parseDouble(num2.getText().toString());
            double resultado = n1 * n2;

            tvResultado.setText("Resultado: " + resultado);
        });

        btnDivide.setOnClickListener(v -> {
            if (num1.getText().toString().isEmpty() || num2.getText().toString().isEmpty()) {
                Toast.makeText(this, "Ingrese ambos números", Toast.LENGTH_SHORT).show();
                return;
            }

            double n1 = Double.parseDouble(num1.getText().toString());
            double n2 = Double.parseDouble(num2.getText().toString());

            if (n2 == 0) {
                Toast.makeText(this, "No se puede dividir entre cero", Toast.LENGTH_SHORT).show();
                return;
            }

            double resultado = n1 / n2;
            tvResultado.setText("Resultado: " + resultado);
        });



    }
}