package com.example.develop.appquanlichitieu.ViewHolder;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.develop.appquanlichitieu.Common.Common;
import com.example.develop.appquanlichitieu.Common.ItemOnClickListener;
import com.example.develop.appquanlichitieu.KhoanChiChiTietActivity;
import com.example.develop.appquanlichitieu.Model.KhoangChi;
import com.example.develop.appquanlichitieu.R;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Develop on 5/6/2018.
 */
class KhoanChiViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{


    public TextView txt_KhoangThu,txt_SoTien,txtNgay;
    public List<KhoangChi> list=new ArrayList<>();
    public Context context;
    private ItemOnClickListener itemOnClickListener;

    public ItemOnClickListener getItemOnClickListener() {
        return itemOnClickListener;
    }

    public void setItemOnClickListener(ItemOnClickListener itemOnClickListener) {
        this.itemOnClickListener = itemOnClickListener;
    }

    public KhoanChiViewHolder(View itemView, Context context, List<KhoangChi> list) {
        super(itemView);
        this.list=list;
        this.context=context;
        txt_KhoangThu=itemView.findViewById(R.id.txtLoaiThu);
        txt_SoTien=itemView.findViewById(R.id.txtSoTien);
        txtNgay=itemView.findViewById(R.id.txtNgay);
        itemView.setOnClickListener(this);
        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        itemOnClickListener.onClick(view,getAdapterPosition());
    }
}
public class KhoanChiAdapter extends RecyclerView.Adapter<KhoanChiViewHolder>{

    private List<KhoangChi> listData= new ArrayList<>();
    private Context context;

    public KhoanChiAdapter(List<KhoangChi> listData, Context context) {
        this.listData = listData;
        this.context = context;
    }


    @Override
    public KhoanChiViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(context);
        View itemView=inflater.inflate(R.layout.item_khoan_chi,parent,false);
        return new KhoanChiViewHolder(itemView,context,listData);
    }
    @Override
    public void onBindViewHolder(KhoanChiViewHolder holder, int position) {
        DecimalFormat decimalFormat=new DecimalFormat("###,###,###");
        holder.txt_KhoangThu.setText(listData.get(position).getLoaiChi());

        holder.txt_SoTien.setText(decimalFormat.format(listData.get(position).getSoTienChi()) + " đ");

        holder.txtNgay.setText(listData.get(position).getNgayChi());
        holder.setItemOnClickListener(new ItemOnClickListener() {
            @Override
            public void onClick(View view, int position) {
                Common.khoangChi_chon=listData.get(position);
                context.startActivity(new Intent(context,KhoanChiChiTietActivity.class));
            }
        });
    }

    @Override
    public int getItemCount() {
        return listData.size();
    }
}
