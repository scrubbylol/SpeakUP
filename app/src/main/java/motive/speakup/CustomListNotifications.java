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

public class CustomListNotifications extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] desc;
    private final String[] dates;
    private final int[] imagePic;

    public CustomListNotifications(Activity context,
                       String[] desc, String[] dates, int[] imagePic) {
        super(context, R.layout.listmessages, desc);
        this.context = context;
        this.desc = desc;
        this.dates = dates;
        this.imagePic = imagePic;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();

        View rowView = inflater.inflate(R.layout.listnotifications, null, true);

        TextView descView = (TextView) rowView.findViewById(R.id.txtDesc);
        TextView datesView = (TextView) rowView.findViewById(R.id.txtDate);
        ImageView imgView = (ImageView) rowView.findViewById(R.id.imagePic);

        descView.setText(desc[position]);
        datesView.setText(dates[position]);
        imgView.setImageResource(imagePic[position]);
        return rowView;
    }
}
