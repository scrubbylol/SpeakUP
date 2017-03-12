package motive.speakup;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by randy on 2017-03-11.
 */

public class CustomListNews extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] name;
    private final String[] content;
    private final String[] date;
    private final int[] support;
    private final int[] profilepic;
    private final int[] commentpic;

    public CustomListNews(Activity context,
                          String[] name, String[] content, String[] date, int[] support, int[] profilepic, int[] commentpic) {
        super(context, R.layout.listnews, name);
        this.context = context;
        this.name = name;
        this.content = content;
        this.date = date;
        this.support = support;
        this.profilepic = profilepic;
        this.commentpic = commentpic;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();

        View rowView = inflater.inflate(R.layout.listnews, null, true);

        TextView nameView = (TextView) rowView.findViewById(R.id.newsname);
        ImageView profilepicView = (ImageView) rowView.findViewById(R.id.profilepic);
        TextView supportView = (TextView) rowView.findViewById(R.id.support);
        TextView newscontentView = (TextView) rowView.findViewById(R.id.newscontent);
        ImageView newspicView = (ImageView) rowView.findViewById(R.id.newspic);
        TextView datesView = (TextView) rowView.findViewById(R.id.newsdate);
        //dates

        nameView.setText(name[position]);
        profilepicView.setImageResource(profilepic[position]);
        supportView.setText("Supporters: " + Integer.toString(support[position]));
        newscontentView.setText(content[position]);
        if(commentpic[position] != 0)
            newspicView.setImageResource(commentpic[position]);
        datesView.setText(date[position]);
        return rowView;
    }
}
