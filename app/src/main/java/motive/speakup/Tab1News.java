package motive.speakup;

import android.content.Intent;
import android.os.StrictMode;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

/**
 * Created by randy on 2017-03-11.
 */

public class Tab1News extends Fragment {
    private String[] name = new String[4];
    private String[] content = new String[4];
    private String[] date = new String[4];
    private int[] support = new int[4];
    private int[] profilepic = new int[4];
    private int[] commentpic = new int[4];
    private String mood;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab1news, container, false);

        Intent intent = getActivity().getIntent(); // gets the previously created intent
        this.mood = intent.getStringExtra("name");
        mood = intent.getStringExtra("mood");

        if(mood.equals("happy")) {
            profilepic[0] = R.drawable.pic0;
            name[0] = "Randy Nguyen";
            support[0] = 3;
            date[0] = "2017-03-11 @ 4:10PM";
            content[0] = "This is my cat! Isn't she such a cute cat? Her name is Cat and she's a wonderful cat.";
            commentpic[0] = R.drawable.cat;

            profilepic[1] = R.drawable.pic8;
            name[1] = "Anon2817283";
            support[1] = 0;
            date[1] = "2017-03-11 @ 3:59PM";
            content[1] = "I just finished my exam! I feel so relieved right now... Anyone have time to talk? :)";
            commentpic[1] = 0;

            profilepic[2] = R.drawable.pic8;
            name[2] = "Anon1829181";
            support[2] = 0;
            date[2] = "2017-03-11 @ 3:53PM";
            content[2] = "Im so happy right now! Let's pass some good vibes.";
            commentpic[2] = 0;

            profilepic[3] = R.drawable.pic7;
            name[3] = "Michelle29381";
            support[3] = 9;
            date[3] = "2017-03-11 @ 3:52PM";
            content[3] = "Extremely excited for the Guelph Mental Hackathon tomorrow, anyone wanna team up?";
            commentpic[3] = 0;
        }else{
            profilepic[0] = R.drawable.pic8;
            name[0] = "Anon823923";
            support[0] = 0;
            date[0] = "2017-03-11 @ 4:10PM";
            content[0] = "I feel like I'm going to fail my midterm... is there anyone who's in the same boat as me? I need someone to talk to... ";
            commentpic[0] = 0;

            profilepic[1] = R.drawable.pic2;
            name[1] = "Ryan Haque";
            support[1] = 47;
            date[1] = "2017-03-11 @ 3:59PM";
            content[1] = "For the people who are struggling with school or just need someone to talk to, please feel free to message me!";
            commentpic[1] = 0;

            profilepic[2] = R.drawable.pic4;
            name[2] = "Aftab Ahmad";
            support[2] = 32;
            date[2] = "2017-03-11 @ 3:59PM";
            content[2] = "I just talked to this amazing person through this app... They made me realize that there are people who care about you from all around the world.";
            commentpic[2] = 0;

            profilepic[3] = R.drawable.pic5;
            name[3] = "Matt249"; support[3] = 6;
            date[3] = "2017-03-11 @ 3:29PM";
            content[3] = "I caught this cat staring at me today... I think I'm gonna get bad luck :(";
            commentpic[3] = R.drawable.cat2;
        }


        ListView listView = (ListView)rootView.findViewById(R.id.acList);

        CustomListNews adapter = new CustomListNews(getActivity(), name, content, date, support, profilepic, commentpic);
        listView.setAdapter(adapter);

        return rootView;
    }
}
