package shubham.sharma.ri12;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;


/**
 * A simple {@link Fragment} subclass.
 */
public class zip extends Fragment {
String zipd[]={"Star Health","HDFC Life","GO Digit","Reliagre Health Insurance","Kotak General Insurance","HDFC ERGO Gerneral Insurance"};


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.fragment_zip,container,false);
        ListView listView= (ListView) view.findViewById(R.id.zip);
        ArrayAdapter<String> webaggregator=new ArrayAdapter<String>
                (
                        getActivity(),android.R.layout.simple_list_item_1,zipd);
        listView.setAdapter(webaggregator);
        return view;
    }

}
