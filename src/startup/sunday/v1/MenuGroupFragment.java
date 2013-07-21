package startup.sunday.v1;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

public class MenuGroupFragment extends Fragment {
	public static final String ARG_PAGE_NUM = "page";

    @Override
    public View onCreateView(LayoutInflater inflater,
            ViewGroup container, Bundle savedInstanceState) {
        // The last two arguments ensure LayoutParams are inflated properly.        
        View rootView = inflater.inflate(R.layout.menu_group, container, false);
        rootView.setId(View.generateViewId());
        
        Bundle args = getArguments();
        ((TextView) rootView.findViewById(R.id.menu_group_title)).setText(
                Integer.toString(args.getInt(ARG_PAGE_NUM)));
        
        GridView gridview = (GridView) rootView.findViewById(R.id.gridview);
        gridview.setAdapter(new MenuItemAdapter(getActivity().getApplicationContext()));

        gridview.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                Toast.makeText(getActivity(), "" + position, Toast.LENGTH_SHORT).show();
            }
        });
        
        return rootView;
    }
}
