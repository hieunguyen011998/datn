package com.example.datn.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.datn.R;

public class Register_Customer extends AppCompatActivity {
    EditText edtPhone,edtPassword,edtRepassword;
    TextView txtRedirectLogin;
    Button btnRegister;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register__customer);
        addControls();
        addEvents();
    }
    public void addControls()
    {
        edtPhone = (EditText) findViewById(R.id.ActivityRegisterCustomer_edtPhone);
        edtPassword = (EditText) findViewById(R.id.ActivityRegisterCustomer_edtPass);
        edtPhone = (EditText) findViewById(R.id.ActivityRegisterCustomer_edtRePass);
        txtRedirectLogin = (TextView) findViewById(R.id.ActivityRegisterCustomer_txtRedirectLogin);
        btnRegister = (Button) findViewById(R.id.ActivityRegisterCustomer_btnRegister);
    }
    public void registerUser()
    {
        String phone = edtPhone.getText().toString().trim();
        //String password = edtPassword.getText().toString().trim();
        //String rePassword = edtRepassword.getText().toString().trim();
        Intent intent = new Intent(Register_Customer.this,OTP_Customer.class);
        intent.putExtra("phoneNo",phone);
        startActivity(intent);
    }
    public void addEvents()
    {
         btnRegister.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 registerUser();
             }
         });
    }
}
