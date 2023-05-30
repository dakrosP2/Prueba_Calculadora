package com.example.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

public class MainActivity extends AppCompatActivity() {

    EditText et1, et2;
    TextView tv1;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        et1 = (EditText) findViewById (R.Id.txt_num1)

    }
}