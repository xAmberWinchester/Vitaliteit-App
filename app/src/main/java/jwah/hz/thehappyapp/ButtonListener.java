package jwah.hz.thehappyapp;

import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class ButtonListener implements View.OnClickListener {

    private final TextUpdatingTimer _timer;

    ButtonListener(final TextView textView, final String text, final long duration, final long interval)
    {
        Log.d("CREATION","Button listener attached!");

        _timer = new TextUpdatingTimer(
            textView,
            text,
            duration,
            interval
        );
    }


    public void onClick(View view) {
        Log.d("RUNNING","Button clicked");

        // cancel to prevent running double timers
        _timer.cancel();

        _timer.start();
    }
}
