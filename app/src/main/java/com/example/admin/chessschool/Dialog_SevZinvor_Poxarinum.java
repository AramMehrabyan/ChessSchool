package com.example.admin.chessschool;


import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

public class Dialog_SevZinvor_Poxarinum extends android.app.DialogFragment implements View.OnClickListener {
    private int result=0;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        getDialog().requestWindowFeature(Window.FEATURE_NO_TITLE);
        View view=inflater.inflate(R.layout.dialog_sevzinvor_poxarinum,null);

        view.findViewById(R.id.img_tag).setOnClickListener(this);
        view.findViewById(R.id.img_nav).setOnClickListener(this);
        view.findViewById(R.id.img_pix).setOnClickListener(this);
        view.findViewById(R.id.img_dzi).setOnClickListener(this);
        view.setRotation(180);

        return view;
    }

    @Override
    public void onCancel(DialogInterface dialog) {
        super.onCancel(dialog);
        GetDialogResultZinvorPoxarinumListner activity=(GetDialogResultZinvorPoxarinumListner) getActivity();
        activity.getResultZinvorPoxarinum(1);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.img_tag:
                result=1;
                break;
            case R.id.img_nav:
                result=2;
                break;
            case R.id.img_pix:
                result=3;
                break;
            case R.id.img_dzi:
                result=4;
                break;
        }
        GetDialogResultZinvorPoxarinumListner activity=(GetDialogResultZinvorPoxarinumListner) getActivity();
        activity.getResultZinvorPoxarinum(result);
        dismiss();
    }
}

