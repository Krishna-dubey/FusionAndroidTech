package com.example.krishna.fusionandroidtech;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class AboutUsFragment extends Fragment {


    public AboutUsFragment() {
        // Required empty public constructor
    }

    TextView t1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_about_us, container, false);
        t1=view.findViewById(R.id.text1);
        String str="ABOUT US\n"+"Amarpushp Educational & Welfare Society (AEWS) is a non-profit organization registered under the Societies' Registration Act of 1860. We were set up in May 2011 and since then have been raising resources for girls education and health care.\n" +
                "\n" +
                "AEWS is a group of hard working members who are working for the sustainable development of the society by providing necessary facilities to the needy Child.";
        t1.setText(str);
        // Inflate the layout for this fragment

        return view;
    }

}
