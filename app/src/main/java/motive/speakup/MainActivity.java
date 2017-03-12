package motive.speakup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    String user = "";
    String pass = "";
    EditText username_field, password_field;
    ImageView logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        InitButtons();
    }

    void InitButtons() {
        Button register = (Button) findViewById(R.id.registerBtn);
        Button login = (Button) findViewById(R.id.login_button);

        //Login button
        login.setOnClickListener (new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Button login = (Button)findViewById(R.id.login_button);
                username_field = (EditText)findViewById(R.id.username_field);
                password_field = (EditText)findViewById(R.id.password_field);

                if(username_field.getText().toString().equals(user) && password_field.getText().toString().equals(pass)){
                    Intent intent = new Intent(MainActivity.this, FeelActivity.class);
                    startActivity(intent);
                }
            }
        });

        //Register button
        register.setOnClickListener (new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent intent = new Intent(MainActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });

    }
}
