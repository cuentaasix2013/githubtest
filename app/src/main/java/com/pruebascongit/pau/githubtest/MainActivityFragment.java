package com.pruebascongit.pau.githubtest;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment implements View.OnClickListener{

    private Button mas, menos, muli;
    private TextView txt;
    int i = 0;
    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);

        mas = (Button) view.findViewById(R.id.button);
        menos = (Button) view.findViewById(R.id.btn2);
        muli = (Button) view.findViewById(R.id.multi);
        txt = (TextView) view.findViewById(R.id.textView);

        mas.setOnClickListener(this);
        menos.setOnClickListener(this);
        muli.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.button:
                i++;
                txt.setText(String.valueOf(i));
                break;
            case R.id.btn2:
                i--;
                txt.setText(String.valueOf(i));
                break;
            case R.id.multi:
                i *= 2;
                txt.setText(String.valueOf(i));
                break;
        }
    }
}
