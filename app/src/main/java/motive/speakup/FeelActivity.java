package motive.speakup;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class FeelActivity extends AppCompatActivity {

    private String whichName;
    private int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feel);

        Intent intent = getIntent(); // gets the previously created intent
        whichName = intent.getStringExtra("name");
        count = intent.getIntExtra("count", count);
        TextView feelText = (TextView) findViewById(R.id.feelText);
        feelText.setText("How are you feeling today, " + whichName + "?");

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
                Intent intent = new Intent(FeelActivity.this, TabActivity.class);
                intent.putExtra("mood", "happy");
                intent.putExtra("name", whichName);
                startActivity(intent);
            }
        });

        // Neutral button
        neutral.setOnClickListener (new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent intent = new Intent(FeelActivity.this, TabActivity.class);
                intent.putExtra("mood", "happy");
                intent.putExtra("name", whichName);
                startActivity(intent);
            }
        });

        // Bad button
        bad.setOnClickListener (new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent intent = new Intent(FeelActivity.this, Define_Feeling.class);
                intent.putExtra("mood", "sad");
                intent.putExtra("name", whichName);
                count ++;
                intent.putExtra("count", count);
                startActivity(intent);

            }
        });

    }
}
