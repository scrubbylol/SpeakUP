package motive.speakup;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    String pass = "pass";
    EditText username_field, password_field;
    ImageView logo;
    private int count = 0;
    private boolean showDlg = false;

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

                if((username_field.getText().toString().equals("ryan") || username_field.getText().toString().equals("anon")) && password_field.getText().toString().equals(pass)){
                    String sendName = username_field.getText().toString();
                    Intent intent = new Intent(MainActivity.this, FeelActivity.class);
                    intent.putExtra("name", sendName);
                    startActivity(intent);
                }
                else {
                    CreateFailDlg();

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

    void CreateFailDlg() {
        AlertDialog.Builder dlgAlert = new AlertDialog.Builder(this);

        dlgAlert.setMessage("Incorrect username or password!");
        dlgAlert.setTitle("Error");
        dlgAlert.setPositiveButton("OK", null);
        dlgAlert.setCancelable(true);
        dlgAlert.create().show();

    }
}
