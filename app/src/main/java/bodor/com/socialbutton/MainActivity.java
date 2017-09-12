package bodor.com.socialbutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.shaishavgandhi.loginbuttons.GooglePlusButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GooglePlusButton button = (GooglePlusButton) findViewById(R.id.google);

    }
}
