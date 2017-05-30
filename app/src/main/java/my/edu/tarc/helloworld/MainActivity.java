package my.edu.tarc.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textViewMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Display UI
        //R is Resources class
        setContentView(R.layout.activity_main);
        //LINKBFJKSABFJKAGSBKFUgbbbbbbbye
        textViewMessage = (TextView) findViewById(R.id.textViewMessage);

    }

    public void showMsg (View v) {

            textViewMessage.setText("io Arcana");

    }

    public void rstrMsg (View v) {

        textViewMessage.setText(getString(R.string.app_name));

    }

    public void clrMsg (View v) {

        textViewMessage.setText(" ");

    }

}
