package techkshetra18.appster.appstererror;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;

    TextView textView2222;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        TODO: change application name to "Appster Error Debugging"


        textView2222 = findViewById(R.id.hi);

//        TODO error in declaring typeface
        Typeface bebas = Typeface.createFromAsset(getAssets(),  "font/bebasneue.ttf");

//        TODO assign the created typeface to text view;


        sharedPreferences = getApplicationContext().getSharedPreferences("MyPref", MODE_PRIVATE);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                if(sharedPreferences.getBoolean("isFirstLogin",true)){


                    firstLogin(true);


                }else{


                    Intent homeIntent = new Intent(MainActivity.this,Home.this);
                    startActivity(homeIntent);
                    finish();


                }


            }
        },3000);
    }



    public void firstLogin(){
        Intent firstIntent = new Intent(this,Login.this);
        startActivity(firstIntent);
        finish();

        return null;

    }
}
