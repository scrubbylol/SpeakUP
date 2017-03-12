package motive.speakup;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.support.v7.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity {

    static boolean anonymous = false;
    private String uName;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

    }

    public static void onCheckboxClicked(View view){
        boolean checked = ((CheckBox) view).isChecked();
        switch(view.getId()) {
            case R.id.checkbox_anon:
                if (checked)
                    anonymous = true;
        }
    }

    public void checkCondition(View view) {
        CheckBox checkBox = (CheckBox) findViewById(R.id.checkbox_conditions);
        EditText name = (EditText)findViewById(R.id.username_field);
        EditText pass = (EditText)findViewById(R.id.password_field);
        EditText phone = (EditText)findViewById(R.id.phonenumber_field);

        uName = name.getText().toString();

        final Intent intent = new Intent(this, FeelActivity.class);

        if(name.getText().toString().equals("") || pass.getText().toString().equals("") || phone.getText().toString().equals("")){
            AlertDialog.Builder dlgAlert = new AlertDialog.Builder(this);

            dlgAlert.setMessage("One of the required fields is missing.");
            dlgAlert.setTitle("Error");
            dlgAlert.setPositiveButton("OK", null);
            dlgAlert.setCancelable(true);
            dlgAlert.create().show();
        }else if (checkBox.isChecked()) {
            AlertDialog.Builder dlgAlert = new AlertDialog.Builder(this);

            dlgAlert.setMessage("You have been successfully registered!");
            dlgAlert.setTitle("Success");
            dlgAlert.setPositiveButton("OK", new DialogInterface.OnClickListener() {

                public void onClick(DialogInterface dialog, int which) {
                    // Do nothing but close the dialog
                    intent.putExtra("name", uName);
                    startActivity(intent);
                    dialog.dismiss();
                }
            });
            dlgAlert.setCancelable(true);
            dlgAlert.create().show();




        } else {
            AlertDialog.Builder dlgAlert = new AlertDialog.Builder(this);

            dlgAlert.setMessage("You must agree to the terms and conditions to continue.");
            dlgAlert.setTitle("Error");
            dlgAlert.setPositiveButton("OK", null);
            dlgAlert.setCancelable(true);
            dlgAlert.create().show();
        }
    }

}
