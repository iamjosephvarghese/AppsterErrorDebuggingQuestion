package techkshetra18.appster.appstererror;

import android.content.Intent;
import android.os.Handler;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.sql.Date;


public class Home extends AppCompatActivity {

    TextView textView;
    Integer string_one = 100;

    Button b1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                getDate();

            }
        });




        textView.setText(Integer.parseInt(Integer.toString(string_one)));
        textView = findViewById(R.id.txt);
        b1 = findViewById(R.id.button1);







    }




    public void getDate(){
//        TODO to fetch current timestamp and show in snackbar
        String date = new Date().toString();
        Snackbar.make(findViewById(R.id.view),date,Snackbar.LENGTH_SHORT).show();


//        the handler is for a delay of 5000 milliseconds

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent next = new Intent(Home.this,ViewList.class);
                startActivity(next);
                finish();

            }
        },5000);





    }
}
