package motive.speakup;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class NotificationsActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private String[] messageDesc = new String[6];
    private String[] messageDate = new String[6];
    private int[] messagePic = new int[6];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);

        getSupportActionBar().setTitle("Notificiations");

        messagePic[0] = R.drawable.pic0;
        messageDesc[0] = "Randy Nguyen has created a post.";
        messageDate[0] = "Just Now";

        messagePic[1] = R.drawable.pic6;
        messageDesc[1] = "Jacky Chen has given you support! :)";
        messageDate[1] = "2 Minutes Ago";

        messagePic[2] = R.drawable.pic0;
        messageDesc[2] = "Randy Nguyen has created a post.";
        messageDate[2] = "3 Minutes Ago";

        messagePic[3] = R.drawable.pic8;
        messageDesc[3] = "Anon9381727 has given you support! :)";
        messageDate[3] = "25 Minutes Ago";

        messagePic[4] = R.drawable.pic3;
       // messageNames[4] = "NoRealName";
        messageDesc[4] = "It's okay buddy, you can do this";
        messageDate[4] = "2013-11-12 @ 11:52AM";

        messagePic[5] = R.drawable.pic4;
       // messageNames[5] = "Guy Name2";
        messageDesc[5] = "That's great!";
        messageDate[5] = "2009-02-12 @ 9:34PM";

        messagePic[6] = R.drawable.pic5;
      //  messageNames[6] = "Guy Name3";
        messageDesc[6] = "Hello there";
        messageDate[6] = "2014-04-04 @ 8:29AM";

        ListView listView = (ListView)findViewById(R.id.msgList);

        CustomListNotifications adapter = new CustomListNotifications(this, messageDesc, messageDate, messagePic);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        String sendDesc = messageDesc[(int)id];
        String sendDate = messageDate[(int)id];
        int sendPic = messagePic[(int)id];

        Intent intent = new Intent (this, PMActivity.class);
        intent.putExtra("desc", sendDesc);
        intent.putExtra("date", sendDate);
        intent.putExtra("pic", sendPic);
        startActivity(intent);
    }
}
