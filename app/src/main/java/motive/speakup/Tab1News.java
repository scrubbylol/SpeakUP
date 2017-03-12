package motive.speakup;

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
    private String[] name = new String[2];
    private String[] content = new String[2];
    private String[] date = new String[2];
    private int[] support = new int[2];
    private int[] profilepic = new int[2];
    private int[] commentpic = new int[2];

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab1news, container, false);

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

        ListView listView = (ListView)rootView.findViewById(R.id.acList);

        CustomListNews adapter = new CustomListNews(getActivity(), name, content, date, support, profilepic, commentpic);
        listView.setAdapter(adapter);

        getActivity().setTitle("Moments");

        return rootView;
    }
}
