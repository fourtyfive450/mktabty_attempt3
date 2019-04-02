package com.example.mktabty_attempt3.Fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mktabty_attempt3.CatMainAdapter;
import com.example.mktabty_attempt3.R;

import java.util.ArrayList;
import java.util.List;

import io.github.luizgrp.sectionedrecyclerviewadapter.SectionParameters;
import io.github.luizgrp.sectionedrecyclerviewadapter.SectionedRecyclerViewAdapter;
import io.github.luizgrp.sectionedrecyclerviewadapter.StatelessSection;


public class FragmentCatsMain extends Fragment {

    public FragmentCatsMain() {
        // Required empty public constructor
    }


    public static FragmentCatsMain newInstance(String param1, String param2) {
        FragmentCatsMain fragment = new FragmentCatsMain();
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
    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_cats_main, container, false);

        Button freebooks= view.findViewById(R.id.button9);
        freebooks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment = null;
                Class fragmentClass =  FragmentBooksForFree.class;
                try {
                    fragment = (Fragment) fragmentClass.newInstance();
                } catch (Exception e) {
                    e.printStackTrace();
                }// Insert the fragment by replacing any existing fragment
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.frame, fragment).commit();

            }
        });
        Button salesbooks= view.findViewById(R.id.button8);
        salesbooks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment = null;
                Class fragmentClass =  FragmentBooksForSale.class;
                try {
                    fragment = (Fragment) fragmentClass.newInstance();
                } catch (Exception e) {
                    e.printStackTrace();
                }// Insert the fragment by replacing any existing fragment
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.frame, fragment).commit();

            }
        });
        Button suberBooks = view.findViewById(R.id.button7);
        suberBooks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment = null;
                Class fragmentClass =  FragmentBooksForSuber.class;
                try {
                    fragment = (Fragment) fragmentClass.newInstance();
                } catch (Exception e) {
                    e.printStackTrace();
                }// Insert the fragment by replacing any existing fragment
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.frame, fragment).commit();

            }
        });

        mDrawerLayout = (DrawerLayout)getActivity().findViewById(R.id.drawer_layout);
        Button drawerButton = view.findViewById(R.id.b4);

        drawerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                ((Main2Activity)getActivity()).openDrawer();
                mDrawerLayout.openDrawer(Gravity.END);
            }
        });

        Button authors = view.findViewById(R.id.button6);
        authors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment = null;
                Class fragmentClass =  FragmentAutMain.class;
                try {
                    fragment = (Fragment) fragmentClass.newInstance();
                } catch (Exception e) {
                    e.printStackTrace();
                }// Insert the fragment by replacing any existing fragment
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.frame, fragment).commit();
            }
        });


//        List<String> TwistedFate= new ArrayList<>();
//        TwistedFate.add("Lose");
//        TwistedFate.add("Yourself");
//        sectionAdapter.addSection(new ContactsSection("LOOK!", TwistedFate));
//        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerviewCatMain);
//        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
//        recyclerView.setAdapter(sectionAdapter);

        initImageBitmaps();
        RecyclerView recyclerView = view.findViewById(R.id.recyclerviewCatMain);
        CatMainAdapter adapter = new CatMainAdapter(this, mNames);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        mDrawerLayout.closeDrawer(GravityCompat.END);

        return view;
    }

    private void initImageBitmaps(){
//        mImageUrls.add("https://c1.staticflickr.com/5/4636/25316407448_de5fbf183d_o.jpg");
        mNames.add("Havasu Falls");

//        mImageUrls.add("https://i.redd.it/tpsnoz5bzo501.jpg");
        mNames.add("Trondheim");

//        mImageUrls.add("https://i.redd.it/qn7f9oqu7o501.jpg");
        mNames.add("Portugal");

//        mImageUrls.add("https://i.redd.it/j6myfqglup501.jpg");
        mNames.add("Rocky Mountain National Park");


//        mImageUrls.add("https://i.redd.it/0h2gm1ix6p501.jpg");
        mNames.add("Mahahual");

//        mImageUrls.add("https://i.redd.it/k98uzl68eh501.jpg");
        mNames.add("Frozen Lake");


//        mImageUrls.add("https://i.redd.it/glin0nwndo501.jpg");
        mNames.add("White Sands Desert");

//        mImageUrls.add("https://i.redd.it/obx4zydshg601.jpg");
        mNames.add("Austrailia");

//        mImageUrls.add("https://i.imgur.com/ZcLLrkY.jpg");
        mNames.add("Washington");
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

    }

    @Override
    public void onDetach() {
        super.onDetach();
    }


//    private class ContactsSection extends StatelessSection {
//
//        String title;
//        List<String> list;
//        String price;
//
//        ContactsSection(String title, List<String> list) {
//            super(SectionParameters.builder()
//                    .itemResourceId(R.layout.cat_home_item)
//                    .headerResourceId(R.layout.no_header_home)
//                    .build());
//
//            this.title = title;
//            this.list = list;
//        }
//
//
//        @Override
//        public int getContentItemsTotal() {
//            return list.size();
//        }
//
//        @Override
//        public RecyclerView.ViewHolder getItemViewHolder(View view) {
//            return new ItemViewHolder(view);
//        }
//
//        @Override
//        public void onBindItemViewHolder(RecyclerView.ViewHolder holder, int position) {
//            final ItemViewHolder itemHolder = (ItemViewHolder) holder;
//
//            String name = list.get(position);
//
//            itemHolder.tvItem.setText(name);
////            itemHolder.imgItem.setImageResource(name.hashCode() % 2 == 0 ? R.drawable.ic_face_black_48dp : R.drawable.ic_tag_faces_black_48dp);
//
//            itemHolder.rootView.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    Toast.makeText(getContext(),
//                            String.format("Clicked on position #%s of Section %s",
//                                    sectionAdapter.getPositionInSection(itemHolder.getAdapterPosition()),
//                                    title),
//                            Toast.LENGTH_SHORT).show();
//
//                    Fragment fragment = null;
//                    Class fragmentClass =  FragmentSubCat.class;
//                    try {
//                        fragment = (Fragment) fragmentClass.newInstance();
//                    } catch (Exception e) {
//                        e.printStackTrace();
//                    }// Insert the fragment by replacing any existing fragment
//                    FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
//                    fragmentManager.beginTransaction().replace(R.id.frame, fragment).commit();
//                }
//            });
//        }
//
//        @Override
//        public RecyclerView.ViewHolder getHeaderViewHolder(View view) {
//            return new HeaderViewHolder(view);
//        }
//
//        @Override
//        public void onBindHeaderViewHolder(RecyclerView.ViewHolder holder) {
//            HeaderViewHolder headerHolder = (HeaderViewHolder) holder;
//
//            headerHolder.tvTitle.setText(title);
//        }
//    }
//
//    private class HeaderViewHolder extends RecyclerView.ViewHolder {
//
//        private final TextView tvTitle;
//
//        HeaderViewHolder(View view) {
//            super(view);
//
//            tvTitle = (TextView) view.findViewById(R.id.tvTitle);
//        }
//    }
//
//    private class ItemViewHolder extends RecyclerView.ViewHolder {
//
//        private final View rootView;
//        private final ImageView imgItem;
//        private final TextView tvItem;
//        ItemViewHolder(View view) {
//            super(view);
//
//            rootView = view;
//            imgItem = (ImageView) view.findViewById(R.id.imgItem);
//            tvItem = (TextView) view.findViewById(R.id.tvItem);
//        }
//    }
}



