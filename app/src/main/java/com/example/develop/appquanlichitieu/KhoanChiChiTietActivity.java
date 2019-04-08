package com.example.develop.appquanlichitieu;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.develop.appquanlichitieu.Common.Common;

import java.text.DecimalFormat;

public class KhoanChiChiTietActivity extends AppCompatActivity {
    TextView ngay,taikhoan,sotien,loaithu,mota;


    CollapsingToolbarLayout collapsingToolbarLayout;
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_khoan_chi_chi_tiet);
        ngay=findViewById(R.id.ngay);
        taikhoan=findViewById(R.id.taikhoan);
        sotien=findViewById(R.id.sotien);
        loaithu=findViewById(R.id.loaithu);
        mota=findViewById(R.id.mota);


        collapsingToolbarLayout=findViewById(R.id.collapsing);
        collapsingToolbarLayout.setExpandedTitleTextAppearance(R.style.ExpandedAppbar);
        collapsingToolbarLayout.setCollapsedTitleTextAppearance(R.style.CollapsedAppbar);

        collapsingToolbarLayout.setTitle(Common.khoangChi_chon.getLoaiChi());

        toolbar=findViewById(R.id.toolbar_order);
        setSupportActionBar(toolbar);
        if(getSupportActionBar() !=null)
        {
            Drawable drawable= ResourcesCompat.getDrawable(this.getResources(), R.drawable.ic_arrow_back_black_24dp, null);

            //custom color
            drawable.setColorFilter(ResourcesCompat.getColor(this.getResources(), R.color.colorAccent, null), PorterDuff.Mode.SRC_IN);
            ActionBar actionBar = getSupportActionBar();
            actionBar.setHomeButtonEnabled(true);
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setHomeAsUpIndicator(drawable);

        }
        ngay.setText(Common.khoangChi_chon.getNgayChi());
        taikhoan.setText(Common.khoangChi_chon.getTaiKhoanChi());

        sotien.setText(new DecimalFormat("###,###,###").format(Common.khoangChi_chon.getSoTienChi()) +" VND");

        loaithu.setText(Common.khoangChi_chon.getLoaiChi());
        mota.setText(Common.khoangChi_chon.getMoTaChi());

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        if (id == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
