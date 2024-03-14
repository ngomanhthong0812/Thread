package com.example.thread.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.fragment.app.Fragment;

import com.example.thread.MainActivity;
import com.example.thread.R;


public class VnexpressFragment extends Fragment {
    LinearLayout btnQuanSu, btnDuLich, btnBongDa, btnGiaoDuc, btnGiaiTri, btnPhapLuat, btnSucKhoe;

    public VnexpressFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_vnexpress, container, false);
        btnQuanSu = view.findViewById(R.id.btnQuanSu);
        btnDuLich = view.findViewById(R.id.btnDuLich);
        btnBongDa = view.findViewById(R.id.btnBongDa);
        btnGiaiTri = view.findViewById(R.id.btnGiaiTri);
        btnPhapLuat = view.findViewById(R.id.btnPhapLuat);
        btnSucKhoe = view.findViewById(R.id.btnSucKhoe);

        btnQuanSu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), MainActivity.class);
                intent.putExtra("link", "https://vnexpress.net/rss/quan-su.rss");
                startActivity(intent);
            }
        });
        btnDuLich.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), MainActivity.class);
                intent.putExtra("link", "https://vnexpress.net/rss/du-lich.rss");
                startActivity(intent);

            }
        });
        btnBongDa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), MainActivity.class);
                intent.putExtra("link", "https://vnexpress.net/rss/the-thao.rss");
                startActivity(intent);
            }
        });
        btnGiaiTri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), MainActivity.class);
                intent.putExtra("link", "https://vnexpress.net/rss/giai-tri.rss");
                startActivity(intent);
            }
        });
        btnSucKhoe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), MainActivity.class);
                intent.putExtra("link", "https://vnexpress.net/rss/suc-khoe.rss");
                startActivity(intent);
            }
        });
        btnPhapLuat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), MainActivity.class);
                intent.putExtra("link", "https://vnexpress.net/rss/phap-luat.rss");
                startActivity(intent);
            }
        });

        // Inflate the layout for this fragment
        return view;
    }
}