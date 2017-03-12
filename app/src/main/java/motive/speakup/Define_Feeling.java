package motive.speakup;

import android.os.Bundle;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by ryanhaque on 2017-03-12.
 */

public class Define_Feeling extends AppCompatActivity {

    private String mood;
    private String whichName;
    private int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_define_feeling);

        Intent intent = getIntent(); // gets the previously created intent
        mood = intent.getStringExtra("mood");
        count = intent.getIntExtra("count", count);
        whichName = intent.getStringExtra("name");

        if(count == 4) {
            AlertDialog.Builder dlgAlert = new AlertDialog.Builder(this);

            dlgAlert.setMessage("We noticed that you've been sad lately. Would you like to talk?\nGood2Talk: 1-866-925-5454");
            dlgAlert.setNegativeButton("OK", null);
            dlgAlert.setTitle("Hey " + whichName + ",");
            dlgAlert.setPositiveButton("CALL", null);
            dlgAlert.setCancelable(true);
            dlgAlert.create().show();
        }

        System.out.println(count);

        // Submit button
        Button submit = (Button) findViewById(R.id.button23);
        submit.setOnClickListener (new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent intent = new Intent (Define_Feeling.this, TabActivity.class);
                intent.putExtra("mood", "sad");
                intent.putExtra("name", whichName);
                startActivity(intent);
            }
        });

    }
}
