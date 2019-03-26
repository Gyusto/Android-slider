package yusto.programer.estate;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private TabLayout tabLayout;
    private ViewPager Tabpage;
    private HomeViewFragmentAdapter HomepageAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        tabLayout = (TabLayout) findViewById(R.id.tab_id);
        Tabpage = (ViewPager) findViewById(R.id.view_pager_id);
        HomepageAdapter = new HomeViewFragmentAdapter(getSupportFragmentManager());

        HomepageAdapter.AddFragment(new HomeFragment(), "");
        HomepageAdapter.AddFragment(new RentFragment(), "");
        HomepageAdapter.AddFragment(new OnsaleFragment(), "");
        HomepageAdapter.AddFragment(new ProfileFragment(), "");
        Tabpage.setAdapter(HomepageAdapter);
        tabLayout.setupWithViewPager(Tabpage);
        tabLayout.getTabAt(0).setIcon(R.drawable.ic_home_black_24dp);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_003_rent_1);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_money);
        tabLayout.getTabAt(3).setIcon(R.drawable.ic_account_circle_black_24dp);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setElevation(0);




    }
}
