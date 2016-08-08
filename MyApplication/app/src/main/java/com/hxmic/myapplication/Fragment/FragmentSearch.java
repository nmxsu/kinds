package com.hxmic.myapplication.Fragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.hxmic.myapplication.R;

public class FragmentSearch extends Fragment {
    private TextView tv;
    private Button bu1, bu2,bu3;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_search, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        tv = (TextView) getView().findViewById(R.id.titleTv);
        tv.setText("搜索");
        bu1 = (Button) getView().findViewById(R.id.button1);
        bu1.setOnClickListener(new View.OnClickListener() {

            //getActivity 获取当前Fragment，intent.class为要跳转的activity
            @Override
            public void onClick(View view) {
                Intent in = new Intent(getActivity(), intent.class);
                startActivity(in);

            }
        });

        bu2 = (Button) getView().findViewById(R.id.button2);
        bu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inten=new Intent(getActivity(),MainVisibility.class);
                startActivity(inten);
            }
        });

        bu3=(Button)getView().findViewById(R.id.button3);
        bu3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(),MainWebview.class);
                startActivity(intent);
            }
        });



    }

    @Override
    public void onPause() {
        super.onPause();
    }

}
