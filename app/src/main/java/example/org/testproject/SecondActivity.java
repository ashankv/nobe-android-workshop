package example.org.testproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by ashank on 2/28/18.
 */

public class SecondActivity extends AppCompatActivity {

    TextView nameTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        Bundle extras = getIntent().getExtras();
        String name = extras.getString("NAME");

        nameTextView = (TextView) findViewById(R.id.name_text_view);

        nameTextView.setText("You entered the name: " + name);


    }


}
