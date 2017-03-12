package motive.speakup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        InitialStart();
    }

    private void InitialStart() {
        Button login = (Button) findViewById(R.id.loginBtn);

        //Login button
        login.setOnClickListener (new View.OnClickListener()
        {
            public void onClick(View v)
            {
               /* StatusObject statObj = new StatusObject("none");
                Login(statObj);
                if(statObj.getStatus().equals("ok"))
                {
                    setContentView(R.layout.activity_main);
                    StartMain();
                }
                else
                {
                    incorrect.setText("Incorrect email or password!");
                }*/

                //setContentView(R.layout.activity_feel);
                Intent intent = new Intent (MainActivity.this, FeelActivity.class);
                startActivity(intent);
            }
        });
    }

    private void StartFeel() {
        Button good = (Button) findViewById(R.id.goodBtn);
        Button neutral = (Button) findViewById(R.id.neutralBtn);
        Button bad = (Button) findViewById(R.id.badBtn);

        // Good button
        good.setOnClickListener (new View.OnClickListener()
        {
            public void onClick(View v)
            {
                setContentView(R.layout.activity_tab);
                StartMain("good");
            }
        });

        // Neutral button
        neutral.setOnClickListener (new View.OnClickListener()
        {
            public void onClick(View v)
            {
                setContentView(R.layout.activity_tab);
                StartMain("neutral");
            }
        });

        // Bad button
        bad.setOnClickListener (new View.OnClickListener()
        {
            public void onClick(View v)
            {
                setContentView(R.layout.activity_tab);
                StartMain("bad");
            }
        });
    }

    private void StartMain(String feel) {

    }
}
