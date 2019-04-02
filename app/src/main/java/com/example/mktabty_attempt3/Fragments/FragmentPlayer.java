package com.example.mktabty_attempt3.Fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.BottomSheetBehavior;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mktabty_attempt3.Adapters.PlayerRecyclerViewAdapter;
import com.example.mktabty_attempt3.R;

import java.util.ArrayList;


public class FragmentPlayer extends Fragment {

    public FragmentPlayer() {
        // Required empty public constructor
    }


    public static FragmentPlayer newInstance(String param1, String param2) {
        FragmentPlayer fragment = new FragmentPlayer();
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
    BottomSheetBehavior bottomSheetBehavior;
    Button open, collapse, hide,zeby;
    TextView heading;
    ImageView showparts;

    //vars
    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_player, container, false);
        View bottomSheet = view.findViewById(R.id.bottom_sheet);
        heading = (TextView) view.findViewById(R.id.heading);
        showparts = (ImageView) view.findViewById(R.id.showparts);
        showparts.setImageResource(R.drawable.up_arrow);

        bottomSheetBehavior = BottomSheetBehavior.from(bottomSheet);

        setup();
        initImageBitmaps();
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recyclerv_view);
        PlayerRecyclerViewAdapter adapter = new PlayerRecyclerViewAdapter(getContext(), mNames, mImageUrls);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

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

    private void initImageBitmaps(){

        mImageUrls.add("https://c1.staticflickr.com/5/4636/25316407448_de5fbf183d_o.jpg");
        mNames.add("Take A Look");

        mImageUrls.add("https://i.redd.it/tpsnoz5bzo501.jpg");
        mNames.add("around");

        mImageUrls.add("https://i.redd.it/qn7f9oqu7o501.jpg");
        mNames.add("everything");

        mImageUrls.add("https://i.redd.it/j6myfqglup501.jpg");
        mNames.add("You");


        mImageUrls.add("https://i.redd.it/0h2gm1ix6p501.jpg");
        mNames.add("See");

        mImageUrls.add("https://i.redd.it/k98uzl68eh501.jpg");
        mNames.add("is a");


        mImageUrls.add("https://i.redd.it/glin0nwndo501.jpg");
        mNames.add("Twisted");

        mImageUrls.add("https://i.redd.it/obx4zydshg601.jpg");
        mNames.add("Version");

        mImageUrls.add("https://i.imgur.com/ZcLLrkY.jpg");
        mNames.add("Of Reality");


    }

    private void initRecyclerView(){

    }

    private void setup() {
//        open = (Button) findViewById(R.id.open);
//        collapse = (Button) findViewById(R.id.collapse);
//        hide = (Button) findViewById(R.id.hide);
//
//        //Handling movement of bottom sheets from buttons
//        open.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                bottomSheetBehavior.setState(BottomSheetBehavior.STATE_EXPANDED);
//                heading.setText("Welcome");
//                heading.setTextColor(ContextCompat.getColor(MainActivity.this, R.color.colorPrimary));
//            }
//        });
//
//        collapse.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                bottomSheetBehavior.setState(BottomSheetBehavior.STATE_COLLAPSED);
//                heading.setText("Collapsed");
//                heading.setTextColor(ContextCompat.getColor(MainActivity.this, R.color.colorAccent));
//            }
//        });
//
//        hide.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                bottomSheetBehavior.setState(BottomSheetBehavior.STATE_HIDDEN);
//            }
//        });

        //Handling movement of bottom sheets from sliding
        bottomSheetBehavior.setBottomSheetCallback(new BottomSheetBehavior.BottomSheetCallback() {
            @Override
            public void onStateChanged(View bottomSheet, int newState) {
                if (newState == BottomSheetBehavior.STATE_COLLAPSED) {
//                    heading.setText("Collapsed");
                    showparts.setImageResource(R.drawable.up_arrow);
//                    heading.setTextColor(ContextCompat.getColor(getContext(), R.color.colorAccent));
                } else if (newState == BottomSheetBehavior.STATE_EXPANDED) {
//                    heading.setText("Welcome");
                    showparts.setImageResource(R.drawable.down_arrow);
//                    heading.setTextColor(ContextCompat.getColor(getContext(), R.color.colorPrimary));
                }else if(newState == BottomSheetBehavior.STATE_HIDDEN){
                    bottomSheetBehavior.setState(BottomSheetBehavior.STATE_COLLAPSED);
                }
            }

            @Override
            public void onSlide(View bottomSheet, float slideOffset) {
            }
        });


    }

}



