package yusto.programer.estate;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class HomeFragment extends Fragment {
    private List<Slider> listSlider;
    private ViewPager slidepage;
    private TabLayout indicator;
    private RecyclerView reyclerViews;
    private  List<Houses> houseslist;
    private  List<Land> Landlist;
    private RecyclerView reyclerLandViews;
    private  View view;
    public HomeFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.home_fragment,container,false);
        slidepage=view.findViewById(R.id.slider_page);
        reyclerViews=view.findViewById(R.id.House_recycler);
        reyclerLandViews=view.findViewById(R.id.Land_recycler);
        indicator=view.findViewById(R.id.indicator);
        //slider
        SlidePagerAdapter adapter=new SlidePagerAdapter(getContext(), listSlider);
        slidepage.setAdapter(adapter);
        //house
        HouseViewAdapter adapter2=new HouseViewAdapter(getContext(),houseslist);
        reyclerViews.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL,false));
        reyclerViews.setAdapter(adapter2);
        //land
        LandViewAdapter adapter3=new LandViewAdapter(getContext(),Landlist);
        reyclerLandViews.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL,false));
        reyclerLandViews.setAdapter(adapter3);


        getIndicator();
        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



   getSlider();
   HouseRecycler();
   LandRecycler();

    }

    public void getSlider(){
        listSlider =new ArrayList<>();
        listSlider.add(new Slider(R.drawable.car1,"Get an Amazing Car"));
        listSlider.add(new Slider(R.drawable.car2,"Get an Amazing Car"));
        listSlider.add(new Slider(R.drawable.house1,"Living in a Better House"));
        listSlider.add(new Slider(R.drawable.house,"Dream House"));
        Timer timer=new Timer();
        timer.scheduleAtFixedRate(new HomeFragment.SliderTask(),4000,6000);

    }


    public void getIndicator(){
        indicator.setupWithViewPager(slidepage,true);

    }


    public void HouseRecycler(){
     houseslist=new ArrayList<>();
        houseslist.add(new Houses("Dar es Saalam","50",R.drawable.house3));
        houseslist.add(new Houses("Arusha","43",R.drawable.house4));
        houseslist.add(new Houses("Moshi","32",R.drawable.house5));
        houseslist.add(new Houses("Mwanza","41",R.drawable.house7));
        houseslist.add(new Houses("Dodoma","22",R.drawable.house8));
        houseslist.add(new Houses("Tanga","13",R.drawable.house7));
        houseslist.add(new Houses("Morogoro","50",R.drawable.house8));


    }

    public void LandRecycler(){
        Landlist=new ArrayList<>();
        Landlist.add(new Land("Dar es Saalam",R.drawable.land,"Tsh70000"));
        Landlist.add(new Land("Dar es Saalam",R.drawable.land1,"Tsh50000"));
        Landlist.add(new Land("Tanga",R.drawable.land2,"Tsh37477"));
        Landlist.add(new Land("Tanga",R.drawable.land3,"Tsh65000"));
        Landlist.add(new Land("Arusha",R.drawable.land4,"Tsh100000"));
        Landlist.add(new Land("Tanga",R.drawable.land5,"Tsh80000"));
        Landlist.add(new Land("Singida",R.drawable.land6,"Tsh150000"));
    }

    class SliderTask extends TimerTask {



        @Override
        public void run() {
            if (getActivity() == null) {
                return;
            }
            getActivity().runOnUiThread(new Runnable(){
                @Override
                public void run() {
                    if(slidepage.getCurrentItem()<listSlider.size()-1){
                        slidepage.setCurrentItem(slidepage.getCurrentItem()+1);
                    }else
                        slidepage.setCurrentItem(0);

                }
            });

        }
    }
    //Disable swipe listener



}


