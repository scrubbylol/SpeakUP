package motive.speakup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MessageActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private String[] messageNames = new String[8];
    private String[] messageDesc = new String[8];
    private String[] messageDate = new String[8];
    private int[] messagePic = new int[10];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);

        getSupportActionBar().setTitle("Messages");

        messagePic[0] = R.drawable.pic0;
        messageNames[0] = "Randy Nguyen";
        messageDesc[0] = "Hi kind friend";
        messageDate[0] = "2017-03-11 @ 4:10PM";

        messagePic[1] = R.drawable.pic2;
        messageNames[1] = "Ryan Haque";
        messageDesc[1] = "I love this app!!!";
        messageDate[1] = "2010-01-01 @ 5:10PM";

        messagePic[2] = R.drawable.pic6;
        messageNames[2] = "Jacky Chen";
        messageDesc[2] = "Feel free to chat with me more";
        messageDate[2] = "2012-05-05 @ 6:10PM";

        messagePic[3] = R.drawable.pic1;
        messageNames[3] = "Girl Name1";
        messageDesc[3] = "Thanks alot for your help :)";
        messageDate[3] = "2011-01-10 @ 3:19PM";

        messagePic[4] = R.drawable.pic3;
        messageNames[4] = "Guy Name1";
        messageDesc[4] = "It's okay buddy, you can do this";
        messageDate[4] = "2013-11-12 @ 11:52AM";

        messagePic[5] = R.drawable.pic4;
        messageNames[5] = "Guy Name2";
        messageDesc[5] = "That's great!";
        messageDate[5] = "2009-02-12 @ 9:34PM";

        messagePic[6] = R.drawable.pic5;
        messageNames[6] = "Guy Name3";
        messageDesc[6] = "Hello there";
        messageDate[6] = "2014-04-04 @ 8:29AM";

        messagePic[7] = R.drawable.pic7;
        messageNames[7] = "Guy Name4";
        messageDesc[7] = "Hey, you feeling ok?";
        messageDate[7] = "2017-07-07 @ 1:37AM";

        ListView listView = (ListView)findViewById(R.id.msgList);

        CustomList adapter = new CustomList(this, messageNames, messageDesc, messageDate, messagePic);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intent = new Intent (this, PMActivity.class);
        startActivity(intent);
    }
}
