package com.prabhunathan.cs478_hw2_gridview;
/**
 * Created by Prabhunathan Gnanasekaran on 9/28/2016.
 */
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.view.ContextMenu;
//custom adater class for displaying grid view
public class CustomAdapter extends BaseAdapter{
    String [] result;
    Context context;
    int [] imageId;
    private static LayoutInflater inflater=null;
    public CustomAdapter(MainActivity mainActivity, String[] carNames, int[] carImages) {
        result=carNames;
        context=mainActivity;
        imageId=carImages;
        inflater = ( LayoutInflater )context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        return result.length;
    }
    @Override
    public Object getItem(int position) {
        return position;
    }
    @Override
    public long getItemId(int position) {
        return position;
    }
    //holder class to store image and text in an item
    public class Holder
    {
        TextView tv; ImageView img;
    }
    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        Holder holder=new Holder();
        final View rowView;
        rowView = inflater.inflate(R.layout.griditems, null);
        holder.tv=(TextView) rowView.findViewById(R.id.cartext);
        holder.img=(ImageView) rowView.findViewById(R.id.carimage);
        holder.tv.setText(result[position]);
        holder.img.setImageResource(imageId[position]);
        rowView.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                //onclick when clicking on image, opens new activity with image
                Intent intent = new Intent(context, CarBigView.class);
                intent.putExtra("carName", result[position]);
                context.startActivity(intent);
            }
        });
        return rowView;
    }
}
