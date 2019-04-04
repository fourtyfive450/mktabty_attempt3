package com.example.mktabty_attempt3.Fragments;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.widget.RecyclerView;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mktabty_attempt3.R;

import io.github.luizgrp.sectionedrecyclerviewadapter.SectionedRecyclerViewAdapter;


public class FragmentSubscribeMF extends Fragment {

    public FragmentSubscribeMF() {
        // Required empty public constructor
    }


    public static FragmentSubscribeMF newInstance(String param1, String param2) {
        FragmentSubscribeMF fragment = new FragmentSubscribeMF();
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
    TextView label,loongtext;
    Button avtivate,policy;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_subscribe_mf, container, false);
        Typeface face1 = Typeface.createFromAsset(getActivity().getAssets(),"font2.otf");
        Typeface face = Typeface.createFromAsset(getActivity().getAssets(),"font2.otf");
        label = view.findViewById(R.id.textView3);
        label.setTypeface(face1);
        avtivate = view.findViewById(R.id.button17);
        policy=view.findViewById(R.id.button18);
        loongtext=view.findViewById(R.id.textView234);
        loongtext.setTypeface(face);
        avtivate.setTypeface(face);
        policy.setTypeface(face);
        mDrawerLayout = (DrawerLayout)getActivity().findViewById(R.id.drawer_layout);
        Button button = view.findViewById(R.id.b4);
        policy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentPrivacyPolicy newGamefragment = new FragmentPrivacyPolicy();
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.frame, newGamefragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                ((Main2Activity)getActivity()).openDrawer();
                mDrawerLayout.openDrawer(Gravity.END);

            }
        });
        mDrawerLayout.closeDrawer(GravityCompat.END);

        ImageView back = view.findViewById(R.id.back_img);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment = null;
                Class fragmentClass =  FragmentSubCat.class;
                try {
                    fragment = (Fragment) fragmentClass.newInstance();
                } catch (Exception e) {
                    e.printStackTrace();
                }// Insert the fragment by replacing any existing fragment
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.frame, fragment).commit();
            }
        });

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



