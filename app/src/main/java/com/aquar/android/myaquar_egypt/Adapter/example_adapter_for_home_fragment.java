package com.aquar.android.myaquar_egypt.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.androidnetworking.interfaces.Parser;
import com.aquar.android.myaquar_egypt.Model.modle_home_fragment;
import com.aquar.android.myaquar_egypt.R;

import java.util.ArrayList;

public class example_adapter_for_home_fragment extends RecyclerView.Adapter<example_adapter_for_home_fragment.ExampleViewHolder> {
    /////
    private ArrayList<modle_home_fragment> mExampleList;
    private Context context;

    private OnItemClickListener mListener;




    public interface OnItemClickListener {

void intent_to_detales(int pos,ImageView imageView);
void make_love(int pos,ImageView img);


    }


    public void setOnItemClickListener(OnItemClickListener listener) {
        mListener = listener;
    }
    /////
    public static class ExampleViewHolder extends RecyclerView.ViewHolder {

        private TextView textView_1, textView_2,textView_start,textView_end;

        private ImageView
                imageView_one_one;


        public ExampleViewHolder(@NonNull View itemView, final OnItemClickListener listener) {
            super(itemView);

            /////
            imageView_one_one=itemView.findViewById(R.id.image_pro);
            textView_1=itemView.findViewById(R.id.text_one_id);
          textView_2  =itemView.findViewById(R.id.text_two_id);
           textView_start =itemView.findViewById(R.id.number_start_id);
            textView_end=itemView.findViewById(R.id.number_end_id);

            /*
            textView_1_2_type = itemView.findViewById(R.id.type_of_project_one_two);
            textView_1_2_price = itemView.findViewById(R.id.price_home_one_two);
            textView_1_2_number = itemView.findViewById(R.id.number_Of_year_one_two);
            love=itemView.findViewById(R.id.love_button);
*/


/*

            love.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (listener != null) {
                        int position = getAdapterPosition();
                        if (position != RecyclerView.NO_POSITION) {
                            listener.make_love(position,love);
                        }
                    }
                }
            });

*/
            imageView_one_one.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (listener != null) {
                        int position = getAdapterPosition();
                        if (position != RecyclerView.NO_POSITION) {
                            listener.intent_to_detales(position, imageView_one_one);
                        }
                    } }
            });


        }
    }

    public example_adapter_for_home_fragment(Context applicationContext, ArrayList<modle_home_fragment> exampleList) {
        mExampleList = exampleList;
        context=applicationContext;
    }


    @NonNull
    @Override
    public ExampleViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_exampl_home_one,viewGroup,false);

        return new ExampleViewHolder(v,mListener);
    }

    @Override
    public void onBindViewHolder(@NonNull ExampleViewHolder exampleViewHolder,final int i) {
        modle_home_fragment currentitem = mExampleList.get(i);
////
        exampleViewHolder.imageView_one_one.setImageResource(currentitem.getImage());
////



        exampleViewHolder.textView_1.setText((CharSequence) currentitem.getText_one());
        exampleViewHolder.textView_2.setText((CharSequence) currentitem.getText_two());
        exampleViewHolder.textView_start.setText( ((CharSequence)  currentitem.getStart()).toString());
        exampleViewHolder.textView_end.setText((CharSequence) currentitem.getEnd());

        ///


    }

    @Override
    public int getItemCount() {

        return mExampleList.size();
    }


}
