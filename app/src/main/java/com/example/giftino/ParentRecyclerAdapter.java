package com.example.giftino;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;


public class ParentRecyclerAdapter extends RecyclerView.Adapter<ParentRecyclerAdapter.HomeVieHolder> {

    ArrayList<String> homeArrayList;
    Context context;
    ArrayList<String> textArrayList = new ArrayList<>();



    public ParentRecyclerAdapter(ArrayList<String> homeArrayList, Context context) {
        this.homeArrayList = homeArrayList;
        this.context = context;
    }

    public ParentRecyclerAdapter(ArrayList<String> itemsArrayList) {

    }

    public ParentRecyclerAdapter(List<ItemHome> itemsArrayList, FragmentActivity activity) {
    }

    @NonNull
    @Override
    public HomeVieHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
        return new HomeVieHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HomeVieHolder holder, int position) {
    holder.ItemName.setText(homeArrayList.get(position));
    RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(context,
            LinearLayoutManager.HORIZONTAL,
            false);
    holder.ChildRV.setLayoutManager(layoutManager);
    holder.ChildRV.setHasFixedSize(true);
    textArrayList.clear();
    String[] texts = {"خانم", "اقا", "کودک", "مناسبت"};
    for (int i=0 ; i<texts.length;i++){
        textArrayList.add(texts[i]);
    }
    ChildRecyclerAdapter childRecyclerAdapter=new ChildRecyclerAdapter(textArrayList);
    holder.ChildRV.setAdapter(childRecyclerAdapter);
    childRecyclerAdapter.notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        return homeArrayList.size();
    }

    public class HomeVieHolder extends RecyclerView.ViewHolder {
        TextView ItemName;
        RecyclerView ChildRV;

        public HomeVieHolder(@NonNull View itemView) {
            super(itemView);
            ItemName = itemView.findViewById(R.id.itemname);
            ChildRV = itemView.findViewById(R.id.childRV);

        }
    }
}
