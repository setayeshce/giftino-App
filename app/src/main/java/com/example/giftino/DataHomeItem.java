package com.example.giftino;

import android.content.Context;

import androidx.core.content.res.ResourcesCompat;

import com.example.giftino.ItemHome;
import com.example.giftino.R;

import java.util.ArrayList;
import java.util.List;



public class DataHomeItem {
    public static List<ItemHome> getItem(Context context) {
        List<ItemHome> items = new ArrayList<>();

        for (int i = 1; i <= 4; i++) {
            ItemHome item = new ItemHome();
            switch (i) {
                case 1:
                    item.setTitle("اقایون");
                    item.setImage(ResourcesCompat.getDrawable(context.getResources(), R.drawable.men, null));
                    break;
                case 2:
                    item.setTitle("بانوان");
                    item.setImage(ResourcesCompat.getDrawable(context.getResources(), R.drawable.women, null));
                    break;
                case 3:
                    item.setTitle("کودک");
                    item.setImage(ResourcesCompat.getDrawable(context.getResources(), R.drawable.child, null));
                    break;
                case 4:
                    item.setTitle("مناسبت");
                    item.setImage(ResourcesCompat.getDrawable(context.getResources(), R.drawable.calender, null));
                    break;
            }
            items.add(item);
        }
        return items;
    }
}
