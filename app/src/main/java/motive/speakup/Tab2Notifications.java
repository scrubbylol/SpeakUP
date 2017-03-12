package motive.speakup;

import android.app.Activity;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v4.media.MediaDescriptionCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

/**
 * Created by randy on 2017-03-11.
 */

public class Tab2Notifications extends Fragment {

    private String[] messageDesc = new String[7];
    private String[] messageDate = new String[7];
    private int[] messagePic = new int[7];

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab1news, container, false);

        messagePic[0] = R.drawable.pic0;
        messageDesc[0] = "Randy Nguyen has created a new post.";
        messageDate[0] = "Just Now";

        messagePic[1] = R.drawable.pic6;
        messageDesc[1] = "Jacky Chen has given you support! :)";
        messageDate[1] = "2 Minutes Ago";

        messagePic[2] = R.drawable.pic0;
        messageDesc[2] = "Randy Nguyen has created a new post.";
        messageDate[2] = "3 Minutes Ago";

        messagePic[3] = R.drawable.pic8;
        messageDesc[3] = "Anon9381727 has given you support! :)";
        messageDate[3] = "25 Minutes Ago";

        messagePic[4] = R.drawable.pic8;
        messageDesc[4] = "Anon2817283 has reacted to your post.";
        messageDate[4] = "2 Hours Ago";

        messagePic[5] = R.drawable.pic4;
        messageDesc[5] = "Guy Name2 has created a new post.";
        messageDate[5] = "3 Hours Ago";

        messagePic[6] = R.drawable.pic2;
        messageDesc[6] = "NoRealName has commented on your post.";
        messageDate[6] = "1 Day Ago";

        ListView listView = (ListView)rootView.findViewById(R.id.notificationsList);

        CustomListNotifications adapter = new CustomListNotifications(this.getActivity(), messageDesc, messageDate, messagePic);
        listView.setAdapter(adapter);

        return rootView;
    }



}