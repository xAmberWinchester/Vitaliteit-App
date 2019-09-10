package jwah.hz.thehappyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int getInteger(int resId)
    {
        return getApplicationContext().getResources().getInteger(resId);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.button);

        btn.setOnClickListener(new ButtonListener(
            (TextView) findViewById(R.id.textView),
                getString(R.string.timer_text),
                getInteger(R.integer.coffee_timer_duration),
                getInteger(R.integer.coffee_timer_interval)
        ));
    }
}
