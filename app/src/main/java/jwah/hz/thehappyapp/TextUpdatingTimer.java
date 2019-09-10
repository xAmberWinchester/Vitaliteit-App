package jwah.hz.thehappyapp;

import android.os.CountDownTimer;
import android.util.Log;
import android.widget.TextView;

public class TextUpdatingTimer extends CountDownTimer
{
    private TextView _textView;
    private String _text;

    public TextUpdatingTimer(TextView textView, String text, long millisInFuture, long countDownInterval) {
        super(millisInFuture, countDownInterval);

        _textView = textView;
        _text = text;
    }

    @Override
    public void onTick(long l) {
        Log.d("RUNNING","tick");
        setText(l / 1000);
    }

    @Override
    public void onFinish() {
        setText(0);
    }


    private void setText(Object... args)
    {
        _textView.setText(String.format(
                _text,
                args
        ));
    }
}
