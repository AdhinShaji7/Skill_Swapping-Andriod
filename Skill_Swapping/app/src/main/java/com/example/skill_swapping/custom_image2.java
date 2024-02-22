package com.example.skill_swapping;


import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class custom_image2 extends BaseAdapter {
    private Context context;

    String [] date,upload,preq_id;

    public custom_image2(Context con, String[]date, String[]upload)

    {
//        this.preq_id=pid;
        this.context=con;

        this.date=date;

        this.upload=upload;




    }
    @Override
    public int getCount() {
        return date.length  ;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }


    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflator=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View gridView;
        if(view==null)
        {
            gridView=new View(context);
            gridView=inflator.inflate(R.layout.activity_custom_image2,null);

        }
        else
        {
            gridView=(View)view;

        }
        TextView labourname1=(TextView)gridView.findViewById(R.id.na);















//        ImageView im=(ImageView)gridView.findViewById(R.id.imageView4);

        labourname1.setTextColor(Color.BLACK);
//        labourname2.setTextColor(Color.BLACK);
//        labourname3.setTextColor(Color.BLACK);
//        fphone.setTextColor(Color.BLACK);
//        femail.setTextColor(Color.BLACK);
//        edistrict.setTextColor(Color.BLACK);




        labourname1.setText("Date :"+date[i]);
//        labourname2.setText("\nGender : "+gender[i]);
//        labourname3.setText("\n\nPlace : "+place[i]);
//        fphone.setText("\n\n\nPhone : "+phone[i]);
//        femail.setText("\n\n\n\nEmail : "+email[i]);
//        edistrict.setText("\n\n\n\n\nDistrict : "+district[i]);



        ImageView im=(ImageView) gridView.findViewById(R.id.imgss);
        SharedPreferences sh= PreferenceManager.getDefaultSharedPreferences(context);
        String ip=sh.getString("ip","");
        String url="http://"+ ip +"/"+upload[i];

        Log.d("+++",url);

        Picasso.with(context).load(url).into(im);

        return gridView;
    }
}


