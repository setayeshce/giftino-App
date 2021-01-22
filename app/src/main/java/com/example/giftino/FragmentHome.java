package com.example.giftino;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class FragmentHome extends Fragment {
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private RecyclerView.Adapter adapter;
//    ArrayList<String> itemsArrayList = new ArrayList<>();
    List<ItemHome> itemsArrayList = new ArrayList<>();

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home_app, container, false);
        recyclerView = view.findViewById(R.id.rc_homeGiftino);
        layoutManager = new LinearLayoutManager(getActivity().getApplicationContext(), RecyclerView.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        adapter = new ParentRecyclerAdapter(itemsArrayList,getActivity());
        recyclerView.setAdapter(adapter);
        String [] items={"اقایان","خانم","کودکان","مناسبت"};
        for (int i = 1; i <= 4; i++) {
            ItemHome item = new ItemHome();
            switch (i) {
                case 1:
                    item.setTitle("اقایون");
                    item.setImage(ResourcesCompat.getDrawable(getContext().getResources(), R.drawable.men, null));
                    break;
                case 2:
                    item.setTitle("بانوان");
                    item.setImage(ResourcesCompat.getDrawable(getContext().getResources(), R.drawable.women, null));
                    break;
                case 3:
                    item.setTitle("کودک");
                    item.setImage(ResourcesCompat.getDrawable(getContext().getResources(), R.drawable.child, null));
                    break;
                case 4:
                    item.setTitle("مناسبت");
                    item.setImage(ResourcesCompat.getDrawable(getContext().getResources(), R.drawable.calender, null));
                    break;
            }
            itemsArrayList.add(item);
        }
        return (View) itemsArrayList;
    }


}

