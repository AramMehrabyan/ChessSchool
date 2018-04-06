package com.example.admin.chessschool;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;

public class Dialog_Clock extends android.app.DialogFragment implements View.OnClickListener {

    private String clock="30 : 00";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        getDialog().requestWindowFeature(Window.FEATURE_NO_TITLE);
        View view=inflater.inflate(R.layout.dialog_clock,null);

        view.findViewById(R.id.r3).setOnClickListener(this);
        view.findViewById(R.id.r5).setOnClickListener(this);
        view.findViewById(R.id.r10).setOnClickListener(this);
        view.findViewById(R.id.r15).setOnClickListener(this);
        view.findViewById(R.id.r20).setOnClickListener(this);
        view.findViewById(R.id.r25).setOnClickListener(this);
        view.findViewById(R.id.r30).setOnClickListener(this);
        view.findViewById(R.id.r35).setOnClickListener(this);
        view.findViewById(R.id.r40).setOnClickListener(this);
        view.findViewById(R.id.r45).setOnClickListener(this);
        view.findViewById(R.id.r50).setOnClickListener(this);
        view.findViewById(R.id.r55).setOnClickListener(this);
        view.findViewById(R.id.r60).setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.r3 || v.getId()==R.id.r5) {
            String s=((TextView) v).getText().toString().substring(0,1);
            clock="0"+s+" : "+"00";
        }
        else {
            String s=((TextView) v).getText().toString().substring(0,2);
            clock=s+" : "+"00";
        }
        GetDialogClockResultListner activity=(GetDialogClockResultListner) getActivity();
        activity.getResultClock(clock);
        dismiss();
    }

    @Override
    public void onCancel(DialogInterface dialog) {
        super.onCancel(dialog);
        getActivity().finish();
    }
}
