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


public class FragmentCodeElt5fed extends Fragment {

    public FragmentCodeElt5fed() {
        // Required empty public constructor
    }


    public static FragmentCodeElt5fed newInstance(String param1, String param2) {
        FragmentCodeElt5fed fragment = new FragmentCodeElt5fed();
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
    Button cancel,send;
    TextView label;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_code_elt5fed, container, false);
        cancel=view.findViewById(R.id.cancel2);
        send=view.findViewById(R.id.button16);
        label=view.findViewById(R.id.textView12);

        Typeface face = Typeface.createFromAsset(getActivity().getAssets(),"font1.otf");
        Typeface face1 = Typeface.createFromAsset(getActivity().getAssets(),"font2.otf");
        label.setTypeface(face1);
        send.setTypeface(face);
        cancel.setTypeface(face);

        mDrawerLayout = (DrawerLayout)getActivity().findViewById(R.id.drawer_layout);
        cancel= view.findViewById(R.id.cancel2);
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentCatsMain newGamefragment = new FragmentCatsMain();
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.frame, newGamefragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
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



