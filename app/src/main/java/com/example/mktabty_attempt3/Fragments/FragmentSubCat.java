package com.example.mktabty_attempt3.Fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.example.mktabty_attempt3.R;
import com.example.mktabty_attempt3.SubCatAdapter;
import com.example.mktabty_attempt3.SubCatCaps;

import java.util.ArrayList;
import java.util.List;

import io.github.luizgrp.sectionedrecyclerviewadapter.SectionedRecyclerViewAdapter;


public class FragmentSubCat extends Fragment {

    public FragmentSubCat() {
        // Required empty public constructor
    }


    public static FragmentSubCat newInstance(String param1, String param2) {
        FragmentSubCat fragment = new FragmentSubCat();
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
    ImageView BookImage;
    List<SubCatCaps> lstSubCatCabs;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_book_info, container, false);

        mDrawerLayout = (DrawerLayout)getActivity().findViewById(R.id.drawer_layout);
        Button button = view.findViewById(R.id.b4);

        lstSubCatCabs = new ArrayList<>();
        lstSubCatCabs.add(new SubCatCaps("A Taste OF dastiny u search 4","Categorie SubCatCaps","Description book",R.drawable.jhin));
        lstSubCatCabs.add(new SubCatCaps("The Wild Robot","Categorie SubCatCaps","Description book",R.drawable.bitchlazanya));
        lstSubCatCabs.add(new SubCatCaps("Maria Semples","Categorie SubCatCaps","Description book",R.drawable.bitchlazanya));
        lstSubCatCabs.add(new SubCatCaps("The Martian","Categorie SubCatCaps","Description book",R.drawable.bitchlazanya));
        lstSubCatCabs.add(new SubCatCaps("He Died with...","Categorie SubCatCaps","Description book",R.drawable.bitchlazanya));
        lstSubCatCabs.add(new SubCatCaps("The Vegitarian","Categorie SubCatCaps","Description book",R.drawable.bitchlazanya));
        lstSubCatCabs.add(new SubCatCaps("The Wild Robot","Categorie SubCatCaps","Description book",R.drawable.bitchlazanya));
        lstSubCatCabs.add(new SubCatCaps("Maria Semples","Categorie SubCatCaps","Description book",R.drawable.bitchlazanya));
        lstSubCatCabs.add(new SubCatCaps("The Martian","Categorie SubCatCaps","Description book",R.drawable.bitchlazanya));
        lstSubCatCabs.add(new SubCatCaps("He Died with...","Categorie SubCatCaps","Description book",R.drawable.bitchlazanya));
        lstSubCatCabs.add(new SubCatCaps("The Vegitarian","Categorie SubCatCaps","Description book",R.drawable.bitchlazanya));
        lstSubCatCabs.add(new SubCatCaps("The Wild Robot","Categorie SubCatCaps","Description book",R.drawable.bitchlazanya));
        lstSubCatCabs.add(new SubCatCaps("Maria Semples","Categorie SubCatCaps","Description book",R.drawable.bitchlazanya));
        lstSubCatCabs.add(new SubCatCaps("The Martian","Categorie SubCatCaps","Description book",R.drawable.bitchlazanya));
        lstSubCatCabs.add(new SubCatCaps("He Died with...","Categorie SubCatCaps","Description book",R.drawable.bitchlazanya));

        RecyclerView myrv = (RecyclerView) view.findViewById(R.id.recyclerview_subcat);
        SubCatAdapter myAdapter = new SubCatAdapter(this, lstSubCatCabs);
        myrv.setLayoutManager(new GridLayoutManager(getContext(),3));
        myrv.setAdapter(myAdapter);


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



