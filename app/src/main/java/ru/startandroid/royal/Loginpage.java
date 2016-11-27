package ru.startandroid.royal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.MenuItem;
import android.view.Menu;
import android.widget.Button;
import android.widget.TextView;


public class Loginpage extends AppCompatActivity {
    Button Login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loginpage);
        Login= (Button)findViewById(R.id.Login);

        View.OnClickListener onclbtlogin =new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(Loginpage.this,Homepage.class);
                startActivity(intent);
            }
        };
        Login.setOnClickListener(onclbtlogin);
    }
}
