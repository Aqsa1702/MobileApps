package com.example.week02_32922;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.text.Editable;

public class MainActivity extends AppCompatActivity {
    EditText angka1, angka2;
    TextView hasil;
    Button btnTambah, btnKurang, btnKali, btnBagi;
    private TextWatcher btnTambahTextWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int before, int count){

        }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            String Masukanangka1 = angka1.getText().toString();
            String Masukanangka2 = angka2.getText().toString();

            btnTambah.setEnabled(!Masukanangka1.isEmpty() && !Masukanangka2.isEmpty());
        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    };
    private TextWatcher btnKurangTextWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int before, int count){

        }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            String Masukanangka1 = angka1.getText().toString();
            String Masukanangka2 = angka2.getText().toString();

            btnKurang.setEnabled(!Masukanangka1.isEmpty() && !Masukanangka2.isEmpty());
        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    };
    private TextWatcher btnKaliTextWatcher= new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int before, int count){

        }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            String Masukanangka1 = angka1.getText().toString();
            String Masukanangka2 = angka2.getText().toString();

            btnKali.setEnabled(!Masukanangka1.isEmpty() && !Masukanangka2.isEmpty());
        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    };
    private TextWatcher btnBagiTextWatcher= new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int before, int count){

        }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            String Masukanangka1 = angka1.getText().toString();
            String Masukanangka2 = angka2.getText().toString();

            btnBagi.setEnabled(!Masukanangka1.isEmpty() && !Masukanangka2.isEmpty());
        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        angka1 = (EditText) this.findViewById(R.id.angka1);
        angka2 = (EditText) this.findViewById(R.id.angka2);
        hasil = (TextView) this.findViewById(R.id.hasil);
        btnTambah = (Button) this.findViewById(R.id.btnTambah);
        btnKurang = (Button) this.findViewById(R.id.btnKurang);
        btnKali = (Button) this.findViewById(R.id.btnKali);
        btnBagi = (Button) this.findViewById(R.id.btnBagi);

        angka1.addTextChangedListener(btnTambahTextWatcher);
        angka1.addTextChangedListener(btnKurangTextWatcher);
        angka1.addTextChangedListener(btnKaliTextWatcher);
        angka1.addTextChangedListener(btnBagiTextWatcher);
        angka2.addTextChangedListener(btnTambahTextWatcher);
        angka2.addTextChangedListener(btnKurangTextWatcher);
        angka2.addTextChangedListener(btnKaliTextWatcher);
        angka2.addTextChangedListener(btnBagiTextWatcher);

        btnTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { hitung('+'); } } );


        btnKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { hitung('-'); } } );

        btnKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { hitung('*'); } } );

        btnBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { hitung('/'); } } );

    }
    protected void hitung(char operator){
        double operand1 = Double.parseDouble(angka1.getText().toString());
        double operand2 = Double.parseDouble(angka2.getText().toString());
        double result = 0.0;
        switch(operator){
            case('+') : result = operand1 + operand2; break;
            case('-') : result = operand1 - operand2; break;
            case('*') : result = operand1 * operand2; break;
            case('/') : result = operand1 / operand2; break;
        }
        hasil.setText(String.valueOf(result));
    }
}