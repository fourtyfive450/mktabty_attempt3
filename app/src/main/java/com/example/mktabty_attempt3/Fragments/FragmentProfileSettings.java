package com.example.mktabty_attempt3.Fragments;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.widget.RecyclerView;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.mktabty_attempt3.R;

import io.github.luizgrp.sectionedrecyclerviewadapter.SectionedRecyclerViewAdapter;


public class FragmentProfileSettings extends Fragment {

    public FragmentProfileSettings() {
        // Required empty public constructor
    }


    public static FragmentProfileSettings newInstance(String param1, String param2) {
        FragmentProfileSettings fragment = new FragmentProfileSettings();
        Bundle args = new Bundle();

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }
    private SectionedRecyclerViewAdapter sectionAdapter;

    RecyclerView recyclerView;
    DrawerLayout mDrawerLayout;
    TextView label,t1,t2,t3,t4,t5,t6;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_profile_settings, container, false);
        Typeface face = Typeface.createFromAsset(getActivity().getAssets(),"font1.otf");
        Typeface face1 = Typeface.createFromAsset(getActivity().getAssets(),"font2.otf");
        label= view.findViewById(R.id.textView3);
        t1=view.findViewById(R.id.pt1);
        t2=view.findViewById(R.id.pt2);
        t3=view.findViewById(R.id.pt3);
        t4=view.findViewById(R.id.pt4);
        t5=view.findViewById(R.id.pt5);
        t6=view.findViewById(R.id.pt6);
        label.setTypeface(face1);
        t1.setTypeface(face);
        t2.setTypeface(face);
        t3.setTypeface(face);
        t4.setTypeface(face);
        t5.setTypeface(face);
        t6.setTypeface(face);
        mDrawerLayout = (DrawerLayout)getActivity().findViewById(R.id.drawer_layout);
        Button button = view.findViewById(R.id.b4);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                ((Main2Activity)getActivity()).openDrawer();
                mDrawerLayout.openDrawer(Gravity.END);

            }
        });
        mDrawerLayout.closeDrawer(GravityCompat.END);



        return view;
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

    }

    @Override
    public void onDetach() {
        super.onDetach();
    }



}



