package com.example.customlistviewusingvolley;

import android.content.Context;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class JsonAdapter extends BaseAdapter {

    Context context;
    List<ModelClass> modelClassList=new ArrayList<>();
    LayoutInflater layoutInflater;

    public JsonAdapter(Context context, List<ModelClass> modelClassList) {
        this.context = context;
        this.modelClassList = modelClassList;
        layoutInflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

    @Override
    public int getCount() {
        return modelClassList.size();
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup parent) {

        View root =layoutInflater.inflate(R.layout.custom_list,null);

        TextView userId,id,title,body;
        userId=root.findViewById(R.id.UserID);
        id=root.findViewById(R.id.ID);
        title=root.findViewById(R.id.Title);
        body=root.findViewById(R.id.Body);

        userId.setText(""+modelClassList.get(i).getUserid());
        id.setText(""+modelClassList.get(i).getId());
        title.setText(""+modelClassList.get(i).getTitle());
        body.setText(""+modelClassList.get(i).getBody());




        return root;
    }
}
