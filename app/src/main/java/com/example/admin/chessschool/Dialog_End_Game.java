package com.example.admin.chessschool;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;

public class Dialog_End_Game extends android.app.DialogFragment implements View.OnClickListener {
    private String result="";
    private TextView textView;

    public void setResult(String result) {
        this.result=result;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        getDialog().requestWindowFeature(Window.FEATURE_NO_TITLE);
        View view=inflater.inflate(R.layout.dialog_end_game,null);

        view.findViewById(R.id.btnNewGAme).setOnClickListener(this);
        view.findViewById(R.id.btnMenu).setOnClickListener(this);
        textView=view.findViewById(R.id.textView1);
        textView.setText(result);

        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnNewGAme:
                getActivity().finish();
                Intent intent=new Intent(getActivity(),Game.class);
                startActivity(intent);
                break;
            case R.id.btnMenu:
                getActivity().finish();
                break;
        }
        dismiss();
    }
}


