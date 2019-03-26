package yusto.programer.estate;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

public class HouseViewAdapter extends RecyclerView.Adapter<HouseViewAdapter.MyViewHolder> {
    private Context context;
    private List<Houses> house;

    public HouseViewAdapter(Context context, List<Houses> house) {
        this.context = context;
        this.house = house;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(context).inflate(R.layout.house_item,viewGroup,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder myViewHolder, int i) {

       myViewHolder.Hname.setText(house.get(i).getRegion());
      myViewHolder.Hno.setText(house.get(i).getNoOfHouses() );
        Glide.with(context).load(house.get(i).getThumbnail()).into(myViewHolder.Himage);

    }

    @Override
    public int getItemCount() {
        return house.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        private TextView Hname,Hno;
        private ImageView Himage;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            Hname=itemView.findViewById(R.id.House_region_id);
            Himage=itemView.findViewById(R.id.thumbnail_id);
            Hno=itemView.findViewById(R.id.House_no);


        }
    }
}
