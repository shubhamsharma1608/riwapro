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


public class sat extends Fragment {
String sat1[]={"HDFC Ergo"};
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view1 =inflater.inflate(R.layout.fragment_sat,container,false);
        ListView listView= (ListView) view1.findViewById(R.id.sat2);
        ArrayAdapter<String> webaggregator=new ArrayAdapter<String>
                (
                        getActivity(),android.R.layout.simple_list_item_1,sat1);
        listView.setAdapter(webaggregator);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                if(position==0)
                {
                    Intent intent = new Intent(getActivity(), HDFC_S.class);
                    startActivity(intent);
                }
            }
        });
        return view1;
    }

}
