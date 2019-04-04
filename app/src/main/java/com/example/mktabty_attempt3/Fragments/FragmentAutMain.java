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
import android.widget.TextView;

import com.example.mktabty_attempt3.Adapters.RecyclerViewAdapter;
import com.example.mktabty_attempt3.Cabs.Authors;
import com.example.mktabty_attempt3.R;

import java.util.ArrayList;
import java.util.List;



public class FragmentAutMain extends Fragment {

    public FragmentAutMain() {
        // Required empty public constructor
    }
    public static FragmentAutMain newInstance(String param1, String param2) {
        FragmentAutMain fragment = new FragmentAutMain();
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
    List<Authors> lstBook ;
    DrawerLayout mDrawerLayout;
    Button authers;
    TextView label;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_aut_main, container, false);
        Typeface face = Typeface.createFromAsset(getActivity().getAssets(),"font1.otf");
        Typeface face1 = Typeface.createFromAsset(getActivity().getAssets(),"font2.otf");
        authers= view.findViewById(R.id.button6);
        label= view.findViewById(R.id.textView3);
        label.setTypeface(face1);
        authers.setTypeface(face1);
        lstBook = new ArrayList<>();
        lstBook.add(new Authors("FML","Categorie Book","Description book",R.drawable.mypointofview));
        lstBook.add(new Authors("m7amad m7ros","Categorie Book","Description book",R.drawable.mypointofview));
        lstBook.add(new Authors("3adel shakal","Categorie Book","Description book",R.drawable.mypointofview));
        lstBook.add(new Authors("koook","Categorie Book","Description book",R.drawable.mypointofview));
        lstBook.add(new Authors("He Died with...","Categorie Book","Description book",R.drawable.mypointofview));
        lstBook.add(new Authors("kaaak","Categorie Book","Description book",R.drawable.mypointofview));
        lstBook.add(new Authors("The Wild Robot","Categorie Book","Description book",R.drawable.mypointofview));
        lstBook.add(new Authors("eda eda eda eda ","Categorie Book","Description book",R.drawable.mypointofview));
        lstBook.add(new Authors("FOUR","Categorie Book","Description book",R.drawable.mypointofview));
        lstBook.add(new Authors("He Died with...","Categorie Book","Description book",R.drawable.mypointofview));
        lstBook.add(new Authors("هخه","Categorie Book","Description book",R.drawable.mypointofview));
        lstBook.add(new Authors("wla wla 7aseb yala","Categorie Book","Description book",R.drawable.mypointofview));
        lstBook.add(new Authors("SMFMS","Categorie Book","Description book",R.drawable.mypointofview));
        lstBook.add(new Authors("hwa3ayez eh yfao2","Categorie Book","Description book",R.drawable.mypointofview));
        lstBook.add(new Authors("He Died with...","Categorie Book","Description book",R.drawable.mypointofview));

        RecyclerView myrv = (RecyclerView) view.findViewById(R.id.recyclerview_id);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this,lstBook);
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
        Button cate = view.findViewById(R.id.button5);
        cate.setTypeface(face);
        cate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment = null;
                Class fragmentClass =  FragmentCatsMain.class;
                try {
                    fragment = (Fragment) fragmentClass.newInstance();
                } catch (Exception e) {
                    e.printStackTrace();
                }// Insert the fragment by replacing any existing fragment
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.frame, fragment).commit();
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
