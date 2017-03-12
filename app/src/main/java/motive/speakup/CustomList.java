package motive.speakup;

import android.app.Activity;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by randy on 2017-03-11.
 */

public class CustomList extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] names;
    private final String[] desc;
    private final String[] dates;
    private final int[] imagePic;


    public CustomList(Activity context,
                      String[] names, String[] desc, String[] dates, int[] imagePic) {
        super(context, R.layout.listmessages, names);
        this.context = context;
        this.names = names;
        this.desc = desc;
        this.dates = dates;
        this.imagePic = imagePic;

    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.listmessages, null, true);

        TextView nameView = (TextView) rowView.findViewById(R.id.txtName);
        TextView descView = (TextView) rowView.findViewById(R.id.txtDesc);
        TextView datesView = (TextView) rowView.findViewById(R.id.txtDate);
        ImageView imgView = (ImageView) rowView.findViewById(R.id.imagePic);

        nameView.setText(names[position]);
        descView.setText(desc[position]);
        datesView.setText(dates[position]);
        imgView.setImageResource(imagePic[position]);
        return rowView;
    }
}
