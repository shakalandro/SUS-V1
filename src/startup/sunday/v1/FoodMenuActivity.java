package startup.sunday.v1;

import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;

public class FoodMenuActivity extends FragmentActivity {
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        LinearLayout layout = (LinearLayout) findViewById(R.id.menu_groups);
        for (int i = 0; i < 3; i++) {
	        // ViewPager and its adapters use support library
	        // fragments, so use getSupportFragmentManager.
        	MenuGroupStatePagerAdapter menuGroupAdapter =
        		new MenuGroupStatePagerAdapter(getSupportFragmentManager());
	        ViewPager menuPager = new ViewPager(this);
	        if (Build.VERSION.SDK_INT > Build.VERSION_CODES.JELLY_BEAN) {
	        	menuPager.setId(View.generateViewId());
	        } else {
	        	menuPager.setId(10 + i);
	        }
	        menuPager.setAdapter(menuGroupAdapter);
	        menuPager.setLayoutParams(
	        	new LayoutParams(
                    LayoutParams.MATCH_PARENT, 510));
	        layout.addView(menuPager);
        }
    }
}