package lawanco.com.alfobe;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent sherko = new Intent(SplashScreen.this , MainActivity.class);
                startActivity(sherko);

                finish();

            }
        },2300);
    }
}
