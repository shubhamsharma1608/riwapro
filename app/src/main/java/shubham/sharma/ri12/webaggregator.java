package shubham.sharma.ri12;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class webaggregator extends Fragment {

String webag[]={"Riskovery Insurance","Coverfox"};
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

            View view =inflater.inflate(R.layout.fragment_webagg,container,false);
ListView listView= (ListView) view.findViewById(R.id.web);
        final ArrayAdapter<String> webaggregator=new ArrayAdapter<String>
                (
                getActivity(),android.R.layout.simple_list_item_1,webag);
        listView.setAdapter(webaggregator);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                if(position==0)
                {
                    Intent intent = new Intent(getActivity(), riskovery.class);
                    startActivity(intent);
                }
                if(position==1)
                {
                    Intent intent=new Intent(getActivity(),coverfox.class);
                    startActivity(intent);
                }
            }
        });
            return view;
    }

    }

