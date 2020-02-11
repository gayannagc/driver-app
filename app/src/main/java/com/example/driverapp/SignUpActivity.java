package com.example.driverapp;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;


public class SignUpActivity extends AppCompatActivity {
    private Button mSignUpButton;
    private EditText mretypePassword,msignupPassword, msignUpEmail, msignUpPhoneNo,mNationalIDNo, mLastName, mFirstName;

    private static final String TAG = "SignUpActivity";
    private static final String FIRST_NAME = "first name";
    private static final String LAST_NAME = "last name";
    private static final String EMAIL_ADD = "email address";
    private static final String NID = "national ID";
    private static final String PHONE_NO = "phone no";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);


        mSignUpButton = (Button) findViewById(R.id.SignUp);

        mretypePassword = (EditText) findViewById(R.id.retypePassword);
        msignupPassword = (EditText) findViewById(R.id.signupPassword);
        msignUpEmail = (EditText) findViewById(R.id.signUpEmail);
        msignUpPhoneNo = (EditText) findViewById(R.id.signUpPhoneNo);
        mNationalIDNo = (EditText) findViewById(R.id.NationalIdNo);
        mLastName = (EditText) findViewById(R.id.LastName);
        mFirstName = (EditText) findViewById(R.id.FirstName);

        mSignUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();


    }

    @Override
    protected void onStop() {
        super.onStop();

    }
}
