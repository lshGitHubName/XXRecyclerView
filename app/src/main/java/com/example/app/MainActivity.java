package com.example.app;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.lsh.XXRecyclerview.CommonRecyclerAdapter;
import com.lsh.XXRecyclerview.CommonViewHolder;
import com.lsh.XXRecyclerview.MultiTypeSupport;
import com.lsh.XXRecyclerview.PullRefreshRecycleView;
import com.lsh.XXRecyclerview.XXRecycleView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private XXRecycleView rv;

    private ArrayList<String> datas = new ArrayList<>();
    Handler mHandler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv = (XXRecycleView) findViewById(R.id.rv);
//        View emptyView = findViewById(R.id.main_empty);
        ViewGroup rootView = (ViewGroup) rv.getRootView();
        View emptyView = LayoutInflater.from(this).inflate(R.layout.empty_view, rootView, false);
        datas.add("aa");
        datas.add("bb");
        datas.add("cc");
        datas.add("dd");
        datas.add("aa");
        datas.add("bb");
        datas.add("cc");
        datas.add("dd");
        datas.add("aa");
        datas.add("bb");
        datas.add("cc");
        datas.add("dd");
        datas.add("aa");
        datas.add("bb");
        datas.add("cc");
        datas.add("dd");
        datas.add("aa");
        datas.add("bb");
        datas.add("cc");
        datas.add("dd");
        datas.add("aa");
        datas.add("bb");
        datas.add("cc");
        datas.add("dd");
        datas.add("aa");
        datas.add("bb");
        datas.add("cc");
        datas.add("dd");
        datas.add("aa");
        datas.add("bb");
        datas.add("cc");
        datas.add("dd");
        datas.add("aa");
        datas.add("bb");
        datas.add("cc");
        datas.add("dd");
        datas.add("aa");
        datas.add("bb");
        datas.add("cc");
        datas.add("dd");
        datas.add("aa");
        datas.add("bb");
        datas.add("cc");
        datas.add("dd");
        datas.add("aa");
        datas.add("bb");
        datas.add("cc");
        datas.add("dd");
//        rv.setLayoutManager(new GridLayoutManager(this, 2, GridLayoutManager.VERTICAL, false));
//        rv.setAdapter(new CommonRecyclerAdapter<String>(this, datas,android.R.layout.simple_list_item_1) {
//            @Override
//            public void convert(CommonViewHolder helper, String item, int position, boolean itemChanged) {
//                helper.setText(android.R.id.text1, item);
//            }
//
//        });
//        Toast.makeText(this, "设置适配器", Toast.LENGTH_SHORT).show();
        MultiTypeSupport<String> multiTypeSupport = new MultiTypeSupport<String>() {
            @Override
            public int getLayoutId(String item, int position) {
                if (position % 2 == 0) return android.R.layout.simple_list_item_1;
                return android.R.layout.simple_list_item_2;
            }
        };
        CommonRecyclerAdapter<String> adapter = new CommonRecyclerAdapter<String>(this, datas, multiTypeSupport) {
            @Override
            public void convert(CommonViewHolder holder, String s, int position, boolean isChanged) {
                if (position % 2 == 0) {
                    holder.setText(android.R.id.text1, s);
                } else {
                    holder.setText(android.R.id.text1, s);
                    holder.setText(android.R.id.text2, s);
                }

            }

        };
        rv.setAdapter(adapter);
        adapter.getDatas();
        adapter.getItemCount();

        adapter.setOnItemClickListener(new CommonRecyclerAdapter.OnItemClickListener() {
            @Override
            public void onItemClickListener(CommonViewHolder commonViewHolder, int position) {

            }
        });
        adapter.setOnItemLongClickListener(new CommonRecyclerAdapter.OnItemLongClickListener() {
            @Override
            public void onItemLongClickListener(CommonViewHolder commonViewHolder, int position) {

            }
        });
        rv.setEmptyView(emptyView);
        rv.setLoadMoreEnabled(true);
        rv.setPullRefreshEnabled(true);
//        WrapRecyclerAdapter wrapRecyclerAdapter = new WrapRecyclerAdapter(adapter);
        TextView headerView1 = new TextView(this);
        headerView1.setText("这是头部1");
//        TextView headerView2 = new TextView(this);
//        headerView2.setText("这是头部2");
//        wrapRecyclerAdapter.addHeaderView(headerView);
//        TextView footerView1 = new TextView(this);
//        footerView1.setText("这是脚部1");
//        TextView footerView2 = new TextView(this);
//        footerView2.setText("这是脚部2");
//        wrapRecyclerAdapter.addFooterView(footerView);
//        rv.addHeaderView(headerView2);
//        rv.addFooterView(footerView1);
//        rv.addFooterView(footerView2);
//        rv.setPullRefreshEnabled(true);
//        rv.addRefreshViewCreator(new DefaultRefreshCreator());
//        rv.addHeaderView(headerView1);
//        rv.addFooterView(footerView1);
//        rv.addLoadViewCreator(new DefaultLoadCreator());
        rv.setLoadMoreEnabled(true);
//        rv.setLoadMoreEnabled(false,false,myLoadViewCreator);
        rv.setOnLoadMoreListener(new XXRecycleView.OnLoadMoreListener() {
            @Override
            public void onLoad() {
                rv.stopRefresh();
            }

            @Override
            public void loadEnd() {
            }
        });
        rv.setOnRefreshListener(new PullRefreshRecycleView.OnRefreshListener() {
            @Override
            public void onRefresh() {
            }
            @Override
            public void refreshEnd() {
            }
        });
//        adapter.setOnItemClickListener(new CommonRecyclerAdapter.OnItemClickListener() {
//            @Override
//            public void onItemClickListener(CommonViewHolder commonViewHolder, int position) {
//                Toast.makeText(MainActivity.this, "position:" + position, Toast.LENGTH_SHORT).show();
//            }
//        });
    }
}
