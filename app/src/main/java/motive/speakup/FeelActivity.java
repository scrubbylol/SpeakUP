package motive.speakup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FeelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feel);
        InitialStart();
    }

    private void InitialStart() {
        Button good = (Button) findViewById(R.id.goodBtn);
        Button neutral = (Button) findViewById(R.id.neutralBtn);
        Button bad = (Button) findViewById(R.id.badBtn);

        // Good button
        good.setOnClickListener (new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent intent = new Intent (FeelActivity.this, TabActivity.class);
                startActivity(intent);
            }
        });

        // Neutral button
        neutral.setOnClickListener (new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent intent = new Intent (FeelActivity.this, TabActivity.class);
                startActivity(intent);
            }
        });

        // Bad button
        bad.setOnClickListener (new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent intent = new Intent (FeelActivity.this, TabActivity.class);
                startActivity(intent);
            }
        });

    }

}
