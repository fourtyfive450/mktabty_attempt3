package com.example.mktabty_attempt3.Fragments;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
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
import android.widget.TextView;

import com.example.mktabty_attempt3.Adapters.BooksForFreeAdapter;
import com.example.mktabty_attempt3.Cabs.BooksForSaleCaps;
import com.example.mktabty_attempt3.R;

import java.util.ArrayList;
import java.util.List;

import io.github.luizgrp.sectionedrecyclerviewadapter.SectionedRecyclerViewAdapter;


public class FragmentBooksForFree extends Fragment {

    public FragmentBooksForFree() {
        // Required empty public constructor
    }


    public static FragmentBooksForFree newInstance(String param1, String param2) {
        FragmentBooksForFree fragment = new FragmentBooksForFree();
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
    List<BooksForSaleCaps> lstSubCatCabs;
    TextView label;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_books_for_free, container, false);
        label=view.findViewById(R.id.textView3);
        Typeface face1 = Typeface.createFromAsset(getActivity().getAssets(),"font2.otf");
        label.setTypeface(face1);
        lstSubCatCabs = new ArrayList<>();
        lstSubCatCabs.add(new BooksForSaleCaps("A Taste OF dastiny u search 4","Categorie BooksForSaleCaps","Description book",R.drawable.ukara));
        lstSubCatCabs.add(new BooksForSaleCaps("The Wild Robot","Categorie BooksForSaleCaps","Description book",R.drawable.ukara));
        lstSubCatCabs.add(new BooksForSaleCaps("Maria Semples","Categorie BooksForSaleCaps","Description book",R.drawable.ukara));
        lstSubCatCabs.add(new BooksForSaleCaps("The Martian","Categorie BooksForSaleCaps","Description book",R.drawable.ukara));
        lstSubCatCabs.add(new BooksForSaleCaps("He Died with...","Categorie BooksForSaleCaps","Description book",R.drawable.ukara));
        lstSubCatCabs.add(new BooksForSaleCaps("The Vegitarian","Categorie BooksForSaleCaps","Description book",R.drawable.ukara));
        lstSubCatCabs.add(new BooksForSaleCaps("The Wild Robot","Categorie BooksForSaleCaps","Description book",R.drawable.ukara));
        lstSubCatCabs.add(new BooksForSaleCaps("Maria Semples","Categorie BooksForSaleCaps","Description book",R.drawable.ukara));
        lstSubCatCabs.add(new BooksForSaleCaps("The Martian","Categorie BooksForSaleCaps","Description book",R.drawable.ukara));
        lstSubCatCabs.add(new BooksForSaleCaps("He Died with...","Categorie BooksForSaleCaps","Description book",R.drawable.ukara));
        lstSubCatCabs.add(new BooksForSaleCaps("The Vegitarian","Categorie BooksForSaleCaps","Description book",R.drawable.ukara));
        lstSubCatCabs.add(new BooksForSaleCaps("The Wild Robot","Categorie BooksForSaleCaps","Description book",R.drawable.ukara));
        lstSubCatCabs.add(new BooksForSaleCaps("Maria Semples","Categorie BooksForSaleCaps","Description book",R.drawable.ukara));
        lstSubCatCabs.add(new BooksForSaleCaps("The Martian","Categorie BooksForSaleCaps","Description book",R.drawable.ukara));
        lstSubCatCabs.add(new BooksForSaleCaps("He Died with...","Categorie BooksForSaleCaps","Description book",R.drawable.ukara));

        RecyclerView myrv = (RecyclerView) view.findViewById(R.id.recyclerview_books4free);
        BooksForFreeAdapter myAdapter = new BooksForFreeAdapter(this, lstSubCatCabs);
        myrv.setLayoutManager(new GridLayoutManager(getContext(),3));
        myrv.setAdapter(myAdapter);


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



