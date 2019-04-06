package com.example.personal.radiantchittagong;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends Activity {
    EditText usernameET, passwordET;
    Button login;
    LoginDatabaseHelper db;
    boolean count = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        login = (Button) findViewById(R.id.login);
        usernameET = (EditText) findViewById(R.id.username);
        passwordET = (EditText) findViewById(R.id.password);

        db = new LoginDatabaseHelper(this);

    }



    public void EnterPassword(View v) {
        String username = usernameET.getText().toString();
        String password = passwordET.getText().toString();
        if(username.equals("") || password.equals("")){
            Toast.makeText(getApplicationContext(),"Empty Field",Toast.LENGTH_SHORT).show();
        }
        else{
            boolean result = db.select(username, password);
            System.out.println(username+" "+password);
            if(result == true){
                Intent intent1 = new Intent(Login.this, NavActivity.class);
                startActivity(intent1);
            }
           else {
              Toast.makeText(getApplicationContext(),"Invalid Input",Toast.LENGTH_SHORT).show();
           }
        }
    }

    public void insertItem(View v) {
        Button signup = (Button) findViewById(R.id.signup);
        if(count == true ){
            signup.setEnabled(true);
            String username = usernameET.getText().toString();
            String password = passwordET.getText().toString();
            if (username.equals("") || password.equals("")) {
                Toast.makeText(getApplicationContext(), "Empty Feild", Toast.LENGTH_SHORT).show();
            } else {
                LoginItems login = new LoginItems(username,password);
                db.insertItem(login);
                System.out.println(username + " " + password);
                Toast.makeText(getApplicationContext(), "Insert Successful", Toast.LENGTH_SHORT).show();
            }
            count = false;
        }
        else{
            signup.setEnabled(false);
            Toast.makeText(getApplicationContext(), "Signed Up before", Toast.LENGTH_SHORT).show();
        }
    }
    @Override
    protected void onPause(){
        super.onPause();
        finish();
    }

    @Override
    protected void onStop(){
        super.onStop();
        finish();
    }


   /* public void invisibleTexts(View v){
        passwordET.setVisibility(View.GONE);
        usernameET.setVisibility(View.GONE);
        passwordET.setTextColor(this.getResources().getColor(R.color.white));
        usernameET.setTextColor(this.getResources().getColor(R.color.white));
    }*/
}
