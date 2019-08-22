package shubham.sharma.ri12;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class MyAdapter extends ArrayAdapter<Load>
{
private static final String TAG="myadapter";
private Context mcontext;
private int mResource;
TextView name;
TextView phone;
TextView product;

public MyAdapter(Context context, int resource, ArrayList<Load> objects )
{
    super(context,resource,objects);
    mcontext=context;
    mResource=resource;
}
public View getview(int position , View view, ViewGroup parent)
{
   String name=getItem(position).getName();
   String phone=getItem(position).getPhone();
   String product=getItem(position).getProduct();
   String vechile=getItem(position).getVechileno();
   Load load=new Load(name,phone,product,vechile);
   final  View result;
    ViewHolder holder;
    if(view==null)
    {
        LayoutInflater inflater=LayoutInflater.from(mcontext);
        view=inflater.inflate(mResource,parent,false);

    }
    return view ;
}
}
