package com.example.mktabty_attempt3.Adapters;

import android.support.constraint.ConstraintLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.mktabty_attempt3.Fragments.FragmentCatsMain;
import com.example.mktabty_attempt3.Fragments.FragmentSubCat;
import com.example.mktabty_attempt3.R;

import java.util.ArrayList;

/**
 * Created by User on 1/1/2018.
 */

public class CatMainAdapter extends RecyclerView.Adapter<CatMainAdapter.ViewHolder>{

    private static final String TAG = "CatMainAdapter";

    private ArrayList<String> mImageNames = new ArrayList<>();
    private FragmentCatsMain mContext;

    public CatMainAdapter(FragmentCatsMain context, ArrayList<String> imageNames) {
        mImageNames = imageNames;
        mContext = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cat_home_item, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        Log.d(TAG, "onBindViewHolder: called.");

//        Glide.with(mContext)
//                .asBitmap()
//                .load(mImages.get(position))
//                .into(holder.image);

        holder.imageName.setText(mImageNames.get(position));

        holder.parentLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: clicked on: " + mImageNames.get(position));
//
//                Toast.makeText(mContext, mImageNames.get(position), Toast.LENGTH_SHORT).show();
//
//                Intent intent = new Intent(mContext, GalleryActivity.class);
//                intent.putExtra("image_url", mImages.get(position));
//                intent.putExtra("image_name", mImageNames.get(position));
//                mContext.startActivity(intent);



//
//                FragmentSubCat newGamefragment = new FragmentSubCat();
//                FragmentTransaction fragmentTransaction = mContext.getFragmentManager().beginTransaction();
//                fragmentTransaction.replace(R.id.frame, newGamefragment);
//                fragmentTransaction.addToBackStack(null);
//                fragmentTransaction.commit();


                Fragment fragment = null;
                Class fragmentClass =  FragmentSubCat.class;
                try {
                    fragment = (Fragment) fragmentClass.newInstance();
                } catch (Exception e) {
                    e.printStackTrace();
                }// Insert the fragment by replacing any existing fragment
                FragmentManager fragmentManager = mContext.getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.frame, fragment).commit();

            }
        });
    }

    @Override
    public int getItemCount() {
        return mImageNames.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView imageName;
        ConstraintLayout parentLayout;

        public ViewHolder(View itemView) {
            super(itemView);
            imageName = itemView.findViewById(R.id.image_name);
            parentLayout = itemView.findViewById(R.id.parent_layout);
        }
    }
}















