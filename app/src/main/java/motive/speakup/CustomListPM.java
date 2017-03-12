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

public class CustomListPM extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] who;
    private final String[] desc;
    private final String[] dates;

    public CustomListPM(Activity context,
                        String[] who, String[] desc, String[] dates) {
        super(context, R.layout.listmessages, who);
        this.context = context;
        this.who = who;
        this.desc = desc;
        this.dates = dates;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();

        View rowView = inflater.inflate(R.layout.listpm, null, true);

        TextView whoView = (TextView) rowView.findViewById(R.id.txtWho);
        TextView descView = (TextView) rowView.findViewById(R.id.txtDesc);
        TextView datesView = (TextView) rowView.findViewById(R.id.txtDate);

        whoView.setText(who[position]);
        descView.setText(desc[position]);
        datesView.setText(dates[position]);

        if (who[position].equals("You")) {
            descView.setPadding(300, 0, 0, 0);
            descView.setTextAlignment(View.TEXT_ALIGNMENT_VIEW_END);
        }


        return rowView;
    }
}
