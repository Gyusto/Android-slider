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

public class LandViewAdapter extends RecyclerView.Adapter<LandViewAdapter.MyViewHolder> {
    private Context context;
    private List<Land> land;

    public LandViewAdapter(Context context, List<Land> land) {
        this.context = context;
        this.land = land;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(context).inflate(R.layout.land_item,viewGroup,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        myViewHolder.location.setText(land.get(i).getLocation());
        myViewHolder.acres.setText(land.get(i).getRent_amout());
        Glide.with(context).load(land.get(i).getThumbNail()).into(myViewHolder.imageView);
    }

    @Override
    public int getItemCount() {
        return land.size();
    }


    public class MyViewHolder extends RecyclerView.ViewHolder{

        private TextView location,acres;
        private ImageView imageView;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            location=itemView.findViewById(R.id.land_location_id);
            acres=itemView.findViewById(R.id.land_acre_id);
            imageView=itemView.findViewById(R.id.land_thumbnail_id);


        }
    }
}
