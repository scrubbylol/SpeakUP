package motive.speakup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class PMActivity extends AppCompatActivity {

    private String[] messageWho = new String[12];
    private String[] messageDesc = new String[12];
    private String[] messageDate = new String[12];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pm);

        Intent intent = getIntent(); // gets the previously created intent
        String name = intent.getStringExtra("name");
        String desc = intent.getStringExtra("desc");
        String date = intent.getStringExtra("date");
        int picNum = intent.getIntExtra("pic", 0);

        getSupportActionBar().setTitle(name);

        messageWho[0] = "You";
        messageDesc[0] = "Hey, I was wondering if you could assist me with my stress problem I've been having lately?";
        messageDate[0] = date;

        messageWho[1] = name;
        messageDesc[1] = "Sure friend! What did you wanna talk about?";
        messageDate[1] = date;

        messageWho[2] = "You";
        messageDesc[2] = "So, I'm currently in school right.. and a lot of assignments and exams have been hitting me all at once and im going crazy";
        messageDate[2] = date;

        messageWho[3] = name;
        messageDesc[3] = "Well you shouldn't have left it to the last second haha";
        messageDate[3] = date;

        messageWho[4] = "You";
        messageDesc[4] = "I know but its really stressful right now";
        messageDate[4] = date;

        messageWho[5] = name;
        messageDesc[5] = "It's okay man, keep your head up high and slowly plug away! You'll be get through them all one way or another";
        messageDate[5] = date;

        messageWho[6] = "You";
        messageDesc[6] = "But its alot of work...";
        messageDate[6] = date;

        messageWho[7] = name;
        messageDesc[7] = "Thats part of being in school which is a part of life";
        messageDate[7] = date;

        messageWho[8] = "You";
        messageDesc[8] = "Well.. yeah i guess";
        messageDate[8] = date;

        messageWho[9] = name;
        messageDesc[9] = "Ive been through it man. Its tough, but trust me it'll be worth it in the end (hopefully) :)";
        messageDate[9] = date;

        messageWho[10] = "You";
        messageDesc[10] = "LOL ur funny";
        messageDate[10] = date;

        messageWho[11] = name;
        messageDesc[11] = desc;
        messageDate[11] = date;


        ListView listView = (ListView)findViewById(R.id.pmList);

        CustomListPM adapter = new CustomListPM(this, messageWho, messageDesc, messageDate);
        listView.setAdapter(adapter);
    }
}
