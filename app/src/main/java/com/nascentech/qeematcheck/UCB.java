package com.nascentech.qeematcheck;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.nascentech.qeematcheck.adapters.CategoryAdapter;

import java.util.ArrayList;


public class UCB extends Fragment{
    public UCB() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.fragment_ucb, container, false);
        // instantiate our ItemAdapter class
        try {

        }
        catch (Exception e1)
        {
            String msg=e1.getLocalizedMessage();
            Toast.makeText(getContext(), e1.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
        }
            return v;

    }

}