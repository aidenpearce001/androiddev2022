package vn.edu.usth.weather;

import android.os.Bundle;
import android.media.Image;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;



public class ForecastFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        LinearLayout firstLinearLayout = new LinearLayout(getActivity());
        firstLinearLayout.setBackgroundColor(0x20FF0000);
        firstLinearLayout.setOrientation(LinearLayout.VERTICAL);

        TextView thursday = new TextView(getActivity());
        thursday.setText("Thursday is stormy");

//        ImageView lightning = new ImageView(getActivity());
//        lightning.setImageResource(R.drawable.lightning);
//
//        ImageView sunny = new ImageView(getActivity());
//        sunny.setImageResource(R.drawable.sunny);
//
//        firstLinearLayout.addView(thursday);
//        firstLinearLayout.addView(lightning);
//        firstLinearLayout.addView(sunny);

        return firstLinearLayout;
    }
}