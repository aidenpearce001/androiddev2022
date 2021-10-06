package vn.edu.usth.weather;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;
import android.os.Bundle;

public class WeatherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
//        TextView textView = (TextView)findViewById(R.id.text_message);
//        textView.setText("Hello World");

        ForecastFragment firstFragment = new ForecastFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.container, firstFragment).commit();
    }
    public void onPause(){

        super.onPause();
    }
    public void onResume(){

        super.onResume();
    }
    public void onStart(){

        super.onStart();
    }
    public void onStop(){

        super.onStop();
    }
    public void onDestroy(){
        
        super.onDestroy();
    }
}