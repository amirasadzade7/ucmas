package ir.ateam.ucmas;

import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.widget.VideoView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class PromoActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_promo);
        SharedPreferences.Editor editor = getSharedPreferences("myPref", MODE_PRIVATE).edit();
        SharedPreferences prefs = getSharedPreferences("myPref", MODE_PRIVATE);
        boolean isLoggedin = prefs.getBoolean("isLoggedin", false);
        if (prefs.getInt("isFirst", 0) == 0) {
            VideoView videoView = findViewById(R.id.vv1);
            Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.backateam);
            videoView.setVideoURI(uri);
            videoView.start();
            videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    mp.stop();
                    startActivity(new Intent(PromoActivity.this, SignupActivity.class));
                    finish();
                }
            });
            editor.putInt("isFirst", 1);
            editor.apply();
        } else {
            if (isLoggedin)
            {
                startActivity(new Intent(PromoActivity.this, MainActivity.class));
                finish();
            }
            else {
                startActivity(new Intent(PromoActivity.this, SignupActivity.class));
                finish();
            }
        }
    }
}
