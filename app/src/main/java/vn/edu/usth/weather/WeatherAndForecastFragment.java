package vn.edu.usth.weather;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class WeatherAndForecastFragment extends Fragment {

    public WeatherAndForecastFragment() {
    }

    public static WeatherAndForecastFragment newInstance() {
        WeatherAndForecastFragment fragment = new WeatherAndForecastFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_weather_and_forecast, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState){
        WeatherFragment fragment1 = new WeatherFragment();
        ForecastFragment fragment2 = new ForecastFragment();
        getChildFragmentManager().beginTransaction().add(R.id.child_fragment_container, fragment1).add(R.id.child_fragment_container, fragment2).commit();
    }
}