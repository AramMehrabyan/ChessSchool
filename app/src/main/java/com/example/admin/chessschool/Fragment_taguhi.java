package com.example.admin.chessschool;


import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class Fragment_taguhi extends Fragment {

    private RelativeLayout rLayout;
    private RelativeLayout.LayoutParams params_images;
    private DisplayMetrics displayMetrics;
    private int widthLayoutMatrix;
    private int heigthLayoutMatrix;
    private ImageView imageBoard;
    private ImageView taguhi;
    private TextView text_taguhi_view;
    private boolean isAnimate=false;
    private final static int SHOW_DURATION=1200;
    private final static int SCALE_DURATION=700;
    private final static int STOP_DELAY=1000;
    private int n=0;
    private boolean stop_start=true;
    private ImageView imagePapirus, pause_play;
    private ImageView animation_typeIcon, animation_type;
    private ScrollView scrollView;
    private A a;
    private boolean firstOpen=true;
    private ImageView r_horiz1, r_horiz2,r_horiz3,r_horiz4,r_horiz5,r_horiz6,r_horiz_start1,r_horiz_start2,r_horiz_start3,
            r_horiz_end1,r_horiz_end2,r_horiz_end3;
    private ImageView r_uxx1, r_uxx2,r_uxx3,r_uxx4,r_uxx5,r_uxx6,r_uxx_start1,r_uxx_start2,r_uxx_start3,
            r_uxx_end1,r_uxx_end2,r_uxx_end3;
    private ImageView r_glx1, r_glx2,r_glx3,r_glx4,r_glx5,r_glx_start1,r_glx_start2,r_glx_start3,
            r_glx_end1,r_glx_end2,r_glx_end3;
    private ImageView r_oj1, r_oj2,r_oj3,r_oj4,r_oj5,r_oj6, r_oj_start1,r_oj_start2,r_oj_start3,
            r_oj_end1,r_oj_end2,r_oj_end3;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_taguhi,container,false);

        rLayout=view.findViewById(R.id.rLayoutTaguhi);
        displayMetrics=new DisplayMetrics();
        getActivity().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        heigthLayoutMatrix=displayMetrics.heightPixels;
        widthLayoutMatrix=displayMetrics.widthPixels;

        //----------bord------------------------------
        imageBoard=view.findViewById(R.id.bordId_taguhi);
        imageBoard.getLayoutParams().height=widthLayoutMatrix;

        //------------------------ramkaner-------------------
        r_horiz1=new ImageView(getContext());
        r_horiz1.setImageResource(R.drawable.ramka);
        params_images=new RelativeLayout.LayoutParams(widthLayoutMatrix/8,widthLayoutMatrix/8);
        params_images.setMargins(widthLayoutMatrix/8,
                widthLayoutMatrix/2,0,0);
        rLayout.addView(r_horiz1,params_images);
        r_horiz1.setVisibility(View.INVISIBLE);

        r_horiz2=new ImageView(getContext());
        r_horiz2.setImageResource(R.drawable.ramka);
        params_images=new RelativeLayout.LayoutParams(widthLayoutMatrix/8,widthLayoutMatrix/8);
        params_images.setMargins(2*widthLayoutMatrix/8,
                widthLayoutMatrix/2,0,0);
        rLayout.addView(r_horiz2,params_images);
        r_horiz2.setVisibility(View.INVISIBLE);

        r_horiz3=new ImageView(getContext());
        r_horiz3.setImageResource(R.drawable.ramka);
        params_images=new RelativeLayout.LayoutParams(widthLayoutMatrix/8,widthLayoutMatrix/8);
        params_images.setMargins(3*widthLayoutMatrix/8,
                widthLayoutMatrix/2,0,0);
        rLayout.addView(r_horiz3,params_images);
        r_horiz3.setVisibility(View.INVISIBLE);

        r_horiz4=new ImageView(getContext());
        r_horiz4.setImageResource(R.drawable.ramka);
        params_images=new RelativeLayout.LayoutParams(widthLayoutMatrix/8,widthLayoutMatrix/8);
        params_images.setMargins(4*widthLayoutMatrix/8,
                widthLayoutMatrix/2,0,0);
        rLayout.addView(r_horiz4,params_images);
        r_horiz4.setVisibility(View.INVISIBLE);

        r_horiz5=new ImageView(getContext());
        r_horiz5.setImageResource(R.drawable.ramka);
        params_images=new RelativeLayout.LayoutParams(widthLayoutMatrix/8,widthLayoutMatrix/8);
        params_images.setMargins(5*widthLayoutMatrix/8,
                widthLayoutMatrix/2,0,0);
        rLayout.addView(r_horiz5,params_images);
        r_horiz5.setVisibility(View.INVISIBLE);

        r_horiz6=new ImageView(getContext());
        r_horiz6.setImageResource(R.drawable.ramka);
        params_images=new RelativeLayout.LayoutParams(widthLayoutMatrix/8,widthLayoutMatrix/8);
        params_images.setMargins(6*widthLayoutMatrix/8,
                widthLayoutMatrix/2,0,0);
        rLayout.addView(r_horiz6,params_images);
        r_horiz6.setVisibility(View.INVISIBLE);

        r_horiz_start1=new ImageView(getContext());
        r_horiz_start1.setImageResource(R.drawable.ramka_start);
        params_images=new RelativeLayout.LayoutParams(widthLayoutMatrix/8,widthLayoutMatrix/8);
        params_images.setMargins(0,
                widthLayoutMatrix/2,0,0);
        rLayout.addView(r_horiz_start1,params_images);
        r_horiz_start1.setVisibility(View.INVISIBLE);

        r_horiz_start2=new ImageView(getContext());
        r_horiz_start2.setImageResource(R.drawable.ramka_start);
        params_images=new RelativeLayout.LayoutParams(widthLayoutMatrix/8,widthLayoutMatrix/8);
        params_images.setMargins(4*widthLayoutMatrix/8,
                widthLayoutMatrix/2,0,0);
        rLayout.addView(r_horiz_start2,params_images);
        r_horiz_start2.setVisibility(View.INVISIBLE);

        r_horiz_start3=new ImageView(getContext());
        r_horiz_start3.setImageResource(R.drawable.ramka_start);
        params_images=new RelativeLayout.LayoutParams(widthLayoutMatrix/8,widthLayoutMatrix/8);
        params_images.setMargins(7*widthLayoutMatrix/8,
                widthLayoutMatrix/2,0,0);
        rLayout.addView(r_horiz_start3,params_images);
        r_horiz_start3.setVisibility(View.INVISIBLE);

        r_horiz_end1=new ImageView(getContext());
        r_horiz_end1.setImageResource(R.drawable.ramka_end);
        params_images=new RelativeLayout.LayoutParams(widthLayoutMatrix/8,widthLayoutMatrix/8);
        params_images.setMargins(0,
                widthLayoutMatrix/2,0,0);
        rLayout.addView(r_horiz_end1,params_images);
        r_horiz_end1.setVisibility(View.INVISIBLE);

        r_horiz_end2=new ImageView(getContext());
        r_horiz_end2.setImageResource(R.drawable.ramka_end);
        params_images=new RelativeLayout.LayoutParams(widthLayoutMatrix/8,widthLayoutMatrix/8);
        params_images.setMargins(4*widthLayoutMatrix/8,
                widthLayoutMatrix/2,0,0);
        rLayout.addView(r_horiz_end2,params_images);
        r_horiz_end2.setVisibility(View.INVISIBLE);

        r_horiz_end3=new ImageView(getContext());
        r_horiz_end3.setImageResource(R.drawable.ramka_end);
        params_images=new RelativeLayout.LayoutParams(widthLayoutMatrix/8,widthLayoutMatrix/8);
        params_images.setMargins(7*widthLayoutMatrix/8,
                widthLayoutMatrix/2,0,0);
        rLayout.addView(r_horiz_end3,params_images);
        r_horiz_end3.setVisibility(View.INVISIBLE);

        r_uxx1=new ImageView(getContext());
        r_uxx1.setImageResource(R.drawable.ramka);
        params_images=new RelativeLayout.LayoutParams(widthLayoutMatrix/8,widthLayoutMatrix/8);
        params_images.setMargins(4*widthLayoutMatrix/8,
                widthLayoutMatrix/8,0,0);
        rLayout.addView(r_uxx1,params_images);
        r_uxx1.setVisibility(View.INVISIBLE);

        r_uxx2=new ImageView(getContext());
        r_uxx2.setImageResource(R.drawable.ramka);
        params_images=new RelativeLayout.LayoutParams(widthLayoutMatrix/8,widthLayoutMatrix/8);
        params_images.setMargins(4*widthLayoutMatrix/8,
                2*widthLayoutMatrix/8,0,0);
        rLayout.addView(r_uxx2,params_images);
        r_uxx2.setVisibility(View.INVISIBLE);

        r_uxx3=new ImageView(getContext());
        r_uxx3.setImageResource(R.drawable.ramka);
        params_images=new RelativeLayout.LayoutParams(widthLayoutMatrix/8,widthLayoutMatrix/8);
        params_images.setMargins(4*widthLayoutMatrix/8,
                3*widthLayoutMatrix/8,0,0);
        rLayout.addView(r_uxx3,params_images);
        r_uxx3.setVisibility(View.INVISIBLE);

        r_uxx4=new ImageView(getContext());
        r_uxx4.setImageResource(R.drawable.ramka);
        params_images=new RelativeLayout.LayoutParams(widthLayoutMatrix/8,widthLayoutMatrix/8);
        params_images.setMargins(4*widthLayoutMatrix/8,
                4*widthLayoutMatrix/8,0,0);
        rLayout.addView(r_uxx4,params_images);
        r_uxx4.setVisibility(View.INVISIBLE);

        r_uxx5=new ImageView(getContext());
        r_uxx5.setImageResource(R.drawable.ramka);
        params_images=new RelativeLayout.LayoutParams(widthLayoutMatrix/8,widthLayoutMatrix/8);
        params_images.setMargins(4*widthLayoutMatrix/8,
                5*widthLayoutMatrix/8,0,0);
        rLayout.addView(r_uxx5,params_images);
        r_uxx5.setVisibility(View.INVISIBLE);

        r_uxx6=new ImageView(getContext());
        r_uxx6.setImageResource(R.drawable.ramka);
        params_images=new RelativeLayout.LayoutParams(widthLayoutMatrix/8,widthLayoutMatrix/8);
        params_images.setMargins(4*widthLayoutMatrix/8,
                6*widthLayoutMatrix/8,0,0);
        rLayout.addView(r_uxx6,params_images);
        r_uxx6.setVisibility(View.INVISIBLE);

        r_uxx_start1=new ImageView(getContext());
        r_uxx_start1.setImageResource(R.drawable.ramka_start);
        params_images=new RelativeLayout.LayoutParams(widthLayoutMatrix/8,widthLayoutMatrix/8);
        params_images.setMargins(4*widthLayoutMatrix/8,
                0,0,0);
        rLayout.addView(r_uxx_start1,params_images);
        r_uxx_start1.setVisibility(View.INVISIBLE);

        r_uxx_start2=new ImageView(getContext());
        r_uxx_start2.setImageResource(R.drawable.ramka_start);
        params_images=new RelativeLayout.LayoutParams(widthLayoutMatrix/8,widthLayoutMatrix/8);
        params_images.setMargins(4*widthLayoutMatrix/8,
                4*widthLayoutMatrix/8,0,0);
        rLayout.addView(r_uxx_start2,params_images);
        r_uxx_start2.setVisibility(View.INVISIBLE);

        r_uxx_start3=new ImageView(getContext());
        r_uxx_start3.setImageResource(R.drawable.ramka_start);
        params_images=new RelativeLayout.LayoutParams(widthLayoutMatrix/8,widthLayoutMatrix/8);
        params_images.setMargins(4*widthLayoutMatrix/8,
                7*widthLayoutMatrix/8,0,0);
        rLayout.addView(r_uxx_start3,params_images);
        r_uxx_start3.setVisibility(View.INVISIBLE);

        r_uxx_end1=new ImageView(getContext());
        r_uxx_end1.setImageResource(R.drawable.ramka_end);
        params_images=new RelativeLayout.LayoutParams(widthLayoutMatrix/8,widthLayoutMatrix/8);
        params_images.setMargins(4*widthLayoutMatrix/8,
                0,0,0);
        rLayout.addView(r_uxx_end1,params_images);
        r_uxx_end1.setVisibility(View.INVISIBLE);

        r_uxx_end2=new ImageView(getContext());
        r_uxx_end2.setImageResource(R.drawable.ramka_end);
        params_images=new RelativeLayout.LayoutParams(widthLayoutMatrix/8,widthLayoutMatrix/8);
        params_images.setMargins(4*widthLayoutMatrix/8,
                4*widthLayoutMatrix/8,0,0);
        rLayout.addView(r_uxx_end2,params_images);
        r_uxx_end2.setVisibility(View.INVISIBLE);

        r_uxx_end3=new ImageView(getContext());
        r_uxx_end3.setImageResource(R.drawable.ramka_end);
        params_images=new RelativeLayout.LayoutParams(widthLayoutMatrix/8,widthLayoutMatrix/8);
        params_images.setMargins(4*widthLayoutMatrix/8,
                7*widthLayoutMatrix/8,0,0);
        rLayout.addView(r_uxx_end3,params_images);
        r_uxx_end3.setVisibility(View.INVISIBLE);

        r_glx1=new ImageView(getContext());
        r_glx1.setImageResource(R.drawable.ramka);
        params_images=new RelativeLayout.LayoutParams(widthLayoutMatrix/8,widthLayoutMatrix/8);
        params_images.setMargins(2*widthLayoutMatrix/8,
                widthLayoutMatrix/2+2*widthLayoutMatrix/8,0,0);
        rLayout.addView(r_glx1,params_images);
        r_glx1.setVisibility(View.INVISIBLE);

        r_glx2=new ImageView(getContext());
        r_glx2.setImageResource(R.drawable.ramka);
        params_images=new RelativeLayout.LayoutParams(widthLayoutMatrix/8,widthLayoutMatrix/8);
        params_images.setMargins(3*widthLayoutMatrix/8,
                widthLayoutMatrix/2+widthLayoutMatrix/8,0,0);
        rLayout.addView(r_glx2,params_images);
        r_glx2.setVisibility(View.INVISIBLE);

        r_glx3=new ImageView(getContext());
        r_glx3.setImageResource(R.drawable.ramka);
        params_images=new RelativeLayout.LayoutParams(widthLayoutMatrix/8,widthLayoutMatrix/8);
        params_images.setMargins(4*widthLayoutMatrix/8,
                widthLayoutMatrix/2,0,0);
        rLayout.addView(r_glx3,params_images);
        r_glx3.setVisibility(View.INVISIBLE);

        r_glx4=new ImageView(getContext());
        r_glx4.setImageResource(R.drawable.ramka);
        params_images=new RelativeLayout.LayoutParams(widthLayoutMatrix/8,widthLayoutMatrix/8);
        params_images.setMargins(5*widthLayoutMatrix/8,
                widthLayoutMatrix/2-widthLayoutMatrix/8,0,0);
        rLayout.addView(r_glx4,params_images);
        r_glx4.setVisibility(View.INVISIBLE);

        r_glx5=new ImageView(getContext());
        r_glx5.setImageResource(R.drawable.ramka);
        params_images=new RelativeLayout.LayoutParams(widthLayoutMatrix/8,widthLayoutMatrix/8);
        params_images.setMargins(6*widthLayoutMatrix/8,
                widthLayoutMatrix/2-2*widthLayoutMatrix/8,0,0);
        rLayout.addView(r_glx5,params_images);
        r_glx5.setVisibility(View.INVISIBLE);

        r_glx_start1=new ImageView(getContext());
        r_glx_start1.setImageResource(R.drawable.ramka_start);
        params_images=new RelativeLayout.LayoutParams(widthLayoutMatrix/8,widthLayoutMatrix/8);
        params_images.setMargins(widthLayoutMatrix/8,
                widthLayoutMatrix/2+3*widthLayoutMatrix/8,0,0);
        rLayout.addView(r_glx_start1,params_images);
        r_glx_start1.setVisibility(View.INVISIBLE);

        r_glx_start2=new ImageView(getContext());
        r_glx_start2.setImageResource(R.drawable.ramka_start);
        params_images=new RelativeLayout.LayoutParams(widthLayoutMatrix/8,widthLayoutMatrix/8);
        params_images.setMargins(4*widthLayoutMatrix/8,
                widthLayoutMatrix/2,0,0);
        rLayout.addView(r_glx_start2,params_images);
        r_glx_start2.setVisibility(View.INVISIBLE);

        r_glx_start3=new ImageView(getContext());
        r_glx_start3.setImageResource(R.drawable.ramka_start);
        params_images=new RelativeLayout.LayoutParams(widthLayoutMatrix/8,widthLayoutMatrix/8);
        params_images.setMargins(7*widthLayoutMatrix/8,
                widthLayoutMatrix/8,0,0);
        rLayout.addView(r_glx_start3,params_images);
        r_glx_start3.setVisibility(View.INVISIBLE);

        r_glx_end1=new ImageView(getContext());
        r_glx_end1.setImageResource(R.drawable.ramka_end);
        params_images=new RelativeLayout.LayoutParams(widthLayoutMatrix/8,widthLayoutMatrix/8);
        params_images.setMargins(widthLayoutMatrix/8,
                widthLayoutMatrix/2+3*widthLayoutMatrix/8,0,0);
        rLayout.addView(r_glx_end1,params_images);
        r_glx_end1.setVisibility(View.INVISIBLE);

        r_glx_end2=new ImageView(getContext());
        r_glx_end2.setImageResource(R.drawable.ramka_end);
        params_images=new RelativeLayout.LayoutParams(widthLayoutMatrix/8,widthLayoutMatrix/8);
        params_images.setMargins(4*widthLayoutMatrix/8,
                widthLayoutMatrix/2,0,0);
        rLayout.addView(r_glx_end2,params_images);
        r_glx_end2.setVisibility(View.INVISIBLE);

        r_glx_end3=new ImageView(getContext());
        r_glx_end3.setImageResource(R.drawable.ramka_end);
        params_images=new RelativeLayout.LayoutParams(widthLayoutMatrix/8,widthLayoutMatrix/8);
        params_images.setMargins(7*widthLayoutMatrix/8,
                widthLayoutMatrix/8,0,0);
        rLayout.addView(r_glx_end3,params_images);
        r_glx_end3.setVisibility(View.INVISIBLE);

        r_oj1=new ImageView(getContext());
        r_oj1.setImageResource(R.drawable.ramka);
        params_images=new RelativeLayout.LayoutParams(widthLayoutMatrix/8,widthLayoutMatrix/8);
        params_images.setMargins(widthLayoutMatrix/8,
                widthLayoutMatrix/8,0,0);
        rLayout.addView(r_oj1,params_images);
        r_oj1.setVisibility(View.INVISIBLE);

        r_oj2=new ImageView(getContext());
        r_oj2.setImageResource(R.drawable.ramka);
        params_images=new RelativeLayout.LayoutParams(widthLayoutMatrix/8,widthLayoutMatrix/8);
        params_images.setMargins(2*widthLayoutMatrix/8,
                2*widthLayoutMatrix/8,0,0);
        rLayout.addView(r_oj2,params_images);
        r_oj2.setVisibility(View.INVISIBLE);

        r_oj3=new ImageView(getContext());
        r_oj3.setImageResource(R.drawable.ramka);
        params_images=new RelativeLayout.LayoutParams(widthLayoutMatrix/8,widthLayoutMatrix/8);
        params_images.setMargins(3*widthLayoutMatrix/8,
                3*widthLayoutMatrix/8,0,0);
        rLayout.addView(r_oj3,params_images);
        r_oj3.setVisibility(View.INVISIBLE);

        r_oj4=new ImageView(getContext());
        r_oj4.setImageResource(R.drawable.ramka);
        params_images=new RelativeLayout.LayoutParams(widthLayoutMatrix/8,widthLayoutMatrix/8);
        params_images.setMargins(4*widthLayoutMatrix/8,
                4*widthLayoutMatrix/8,0,0);
        rLayout.addView(r_oj4,params_images);
        r_oj4.setVisibility(View.INVISIBLE);

        r_oj5=new ImageView(getContext());
        r_oj5.setImageResource(R.drawable.ramka);
        params_images=new RelativeLayout.LayoutParams(widthLayoutMatrix/8,widthLayoutMatrix/8);
        params_images.setMargins(5*widthLayoutMatrix/8,
                5*widthLayoutMatrix/8,0,0);
        rLayout.addView(r_oj5,params_images);
        r_oj5.setVisibility(View.INVISIBLE);

        r_oj6=new ImageView(getContext());
        r_oj6.setImageResource(R.drawable.ramka);
        params_images=new RelativeLayout.LayoutParams(widthLayoutMatrix/8,widthLayoutMatrix/8);
        params_images.setMargins(6*widthLayoutMatrix/8,
                6*widthLayoutMatrix/8,0,0);
        rLayout.addView(r_oj6,params_images);
        r_oj6.setVisibility(View.INVISIBLE);

        r_oj_start1=new ImageView(getContext());
        r_oj_start1.setImageResource(R.drawable.ramka_start);
        params_images=new RelativeLayout.LayoutParams(widthLayoutMatrix/8,widthLayoutMatrix/8);
        params_images.setMargins(0,
                0,0,0);
        rLayout.addView(r_oj_start1,params_images);
        r_oj_start1.setVisibility(View.INVISIBLE);

        r_oj_start2=new ImageView(getContext());
        r_oj_start2.setImageResource(R.drawable.ramka_start);
        params_images=new RelativeLayout.LayoutParams(widthLayoutMatrix/8,widthLayoutMatrix/8);
        params_images.setMargins(4*widthLayoutMatrix/8,
                4*widthLayoutMatrix/8,0,0);
        rLayout.addView(r_oj_start2,params_images);
        r_oj_start2.setVisibility(View.INVISIBLE);

        r_oj_start3=new ImageView(getContext());
        r_oj_start3.setImageResource(R.drawable.ramka_start);
        params_images=new RelativeLayout.LayoutParams(widthLayoutMatrix/8,widthLayoutMatrix/8);
        params_images.setMargins(7*widthLayoutMatrix/8,
                7*widthLayoutMatrix/8,0,0);
        rLayout.addView(r_oj_start3,params_images);
        r_oj_start3.setVisibility(View.INVISIBLE);

        r_oj_end1=new ImageView(getContext());
        r_oj_end1.setImageResource(R.drawable.ramka_end);
        params_images=new RelativeLayout.LayoutParams(widthLayoutMatrix/8,widthLayoutMatrix/8);
        params_images.setMargins(0,
                0,0,0);
        rLayout.addView(r_oj_end1,params_images);
        r_oj_end1.setVisibility(View.INVISIBLE);

        r_oj_end2=new ImageView(getContext());
        r_oj_end2.setImageResource(R.drawable.ramka_end);
        params_images=new RelativeLayout.LayoutParams(widthLayoutMatrix/8,widthLayoutMatrix/8);
        params_images.setMargins(4*widthLayoutMatrix/8,
                4*widthLayoutMatrix/8,0,0);
        rLayout.addView(r_oj_end2,params_images);
        r_oj_end2.setVisibility(View.INVISIBLE);

        r_oj_end3=new ImageView(getContext());
        r_oj_end3.setImageResource(R.drawable.ramka_end);
        params_images=new RelativeLayout.LayoutParams(widthLayoutMatrix/8,widthLayoutMatrix/8);
        params_images.setMargins(7*widthLayoutMatrix/8,
                7*widthLayoutMatrix/8,0,0);
        rLayout.addView(r_oj_end3,params_images);
        r_oj_end3.setVisibility(View.INVISIBLE);

//-----------taguhi-----------------------------------
        taguhi=new ImageView(getContext());
        taguhi.setImageResource(R.drawable.taguhi_spitak);
        params_images=new RelativeLayout.LayoutParams(widthLayoutMatrix/8-20,widthLayoutMatrix/8-20);
        params_images.setMargins(10+widthLayoutMatrix/2,widthLayoutMatrix/2+10,0,0);
        rLayout.addView(taguhi,params_images);

        imagePapirus=new ImageView(getContext());
        imagePapirus.setImageResource(R.drawable.papirus);
        params_images=new RelativeLayout.LayoutParams(5*widthLayoutMatrix/8+50,(int)(1.3*(5*widthLayoutMatrix/8+50)));
        params_images.setMargins(0,widthLayoutMatrix+5,0,-((int)(1.3*(5*widthLayoutMatrix/8+50))-heigthLayoutMatrix+widthLayoutMatrix));
        rLayout.addView(imagePapirus,params_images);

//-------------------text--------------------------------
        text_taguhi_view=new TextView(getContext());
        text_taguhi_view.setText(R.string.text_taguhi);
        text_taguhi_view.setTextColor(Color.parseColor("#0d0d0d"));
        text_taguhi_view.setPadding(0,0,10,0);
        params_images=new RelativeLayout.LayoutParams(5*widthLayoutMatrix/8-100,(int)(1.3*(5*widthLayoutMatrix/8+50))-50);
        params_images.setMargins(90,widthLayoutMatrix+widthLayoutMatrix/7-widthLayoutMatrix/36,0,0);

        scrollView=new ScrollView(getContext());
        scrollView.addView(text_taguhi_view);
        rLayout.addView(scrollView,params_images);

        pause_play=new ImageView(getContext());
        if (firstOpen) {
            firstOpen=false;
            pause_play.setImageResource(R.drawable.pause);
        }
        else
            pause_play.setImageResource(R.drawable.play);

        params_images=new RelativeLayout.LayoutParams(widthLayoutMatrix/4-40,widthLayoutMatrix/4-40);
        params_images.setMargins(widthLayoutMatrix-widthLayoutMatrix/4-10, widthLayoutMatrix+30,0,0);
        rLayout.addView(pause_play,params_images);

        animation_typeIcon=new ImageView(getContext());
        animation_typeIcon.setImageResource(R.drawable.animation_typeicon);
        params_images=new RelativeLayout.LayoutParams(widthLayoutMatrix/4,widthLayoutMatrix/4);
        params_images.setMargins(widthLayoutMatrix-widthLayoutMatrix/4-30, widthLayoutMatrix+
                (heigthLayoutMatrix-widthLayoutMatrix)/2-widthLayoutMatrix/8+50,0,0);
        rLayout.addView(animation_typeIcon,params_images);

        animation_type=new ImageView(getContext());
        animation_type.setImageResource(R.drawable.taguhi_spitak);
        params_images=new RelativeLayout.LayoutParams(widthLayoutMatrix/8,widthLayoutMatrix/8);
        params_images.setMargins(widthLayoutMatrix-widthLayoutMatrix/4-30+widthLayoutMatrix/8-widthLayoutMatrix/16,
                widthLayoutMatrix+
                        (heigthLayoutMatrix-widthLayoutMatrix)/2-widthLayoutMatrix/16+50,0,0);
        rLayout.addView(animation_type,params_images);

        a=new A();
        pause_play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (stop_start) {
                    stop_start=false;
                    pause_play.setImageResource(R.drawable.play);
                }
                else {
                    stop_start = true;
                    pause_play.setImageResource(R.drawable.pause);
                    a.likeAnimation(taguhi,widthLayoutMatrix);
                }
            }
        });

        n=0;
        a.likeAnimation(taguhi,widthLayoutMatrix);

        return view;
    }

    @Override
    public void onPause() {
        super.onPause();
        stop_start=false;
        pause_play.setImageResource(R.drawable.play);
    }

    private class A {

        public void likeAnimation(final ImageView view, final int widthLayoutMatrix) {
            if (view != null && !isAnimate) {
                AnimatorSet set = new AnimatorSet();
                if (stop_start) {
                    set.playSequentially(
                            transtationAnimatorSet1(view, widthLayoutMatrix),
                            scaleAnimatorSet1(view),
                            stopAnimatorSet1(view));
                    set.addListener(getLikeEndListener(view, widthLayoutMatrix));
                    set.start();
                }
                else set.cancel();
            }
        }

        private AnimatorListenerAdapter getLikeEndListener(final ImageView view, final int widthLayoutMatrix) {
            return new AnimatorListenerAdapter() {
                @Override
                public void onAnimationStart(Animator animation) {
                    super.onAnimationStart(animation);
                    isAnimate = true;
                }

                @Override
                public void onAnimationEnd(Animator animation) {
                    super.onAnimationEnd(animation);
                    isAnimate = false;

                    r_horiz1.setVisibility(View.INVISIBLE);
                    r_horiz2.setVisibility(View.INVISIBLE);
                    r_horiz3.setVisibility(View.INVISIBLE);
                    r_horiz4.setVisibility(View.INVISIBLE);
                    r_horiz5.setVisibility(View.INVISIBLE);
                    r_horiz6.setVisibility(View.INVISIBLE);
                    r_horiz_start1.setVisibility(View.INVISIBLE);
                    r_horiz_start2.setVisibility(View.INVISIBLE);
                    r_horiz_start3.setVisibility(View.INVISIBLE);
                    r_horiz_end1.setVisibility(View.INVISIBLE);
                    r_horiz_end2.setVisibility(View.INVISIBLE);
                    r_horiz_end3.setVisibility(View.INVISIBLE);

                    r_uxx1.setVisibility(View.INVISIBLE);
                    r_uxx2.setVisibility(View.INVISIBLE);
                    r_uxx3.setVisibility(View.INVISIBLE);
                    r_uxx4.setVisibility(View.INVISIBLE);
                    r_uxx5.setVisibility(View.INVISIBLE);
                    r_uxx6.setVisibility(View.INVISIBLE);
                    r_uxx_start1.setVisibility(View.INVISIBLE);
                    r_uxx_start2.setVisibility(View.INVISIBLE);
                    r_uxx_start3.setVisibility(View.INVISIBLE);
                    r_uxx_end1.setVisibility(View.INVISIBLE);
                    r_uxx_end2.setVisibility(View.INVISIBLE);
                    r_uxx_end3.setVisibility(View.INVISIBLE);

                    r_glx1.setVisibility(View.INVISIBLE);
                    r_glx2.setVisibility(View.INVISIBLE);
                    r_glx3.setVisibility(View.INVISIBLE);
                    r_glx4.setVisibility(View.INVISIBLE);
                    r_glx5.setVisibility(View.INVISIBLE);
                    r_glx_start1.setVisibility(View.INVISIBLE);
                    r_glx_start2.setVisibility(View.INVISIBLE);
                    r_glx_start3.setVisibility(View.INVISIBLE);
                    r_glx_end1.setVisibility(View.INVISIBLE);
                    r_glx_end2.setVisibility(View.INVISIBLE);
                    r_glx_end3.setVisibility(View.INVISIBLE);

                    r_oj1.setVisibility(View.INVISIBLE);
                    r_oj2.setVisibility(View.INVISIBLE);
                    r_oj3.setVisibility(View.INVISIBLE);
                    r_oj4.setVisibility(View.INVISIBLE);
                    r_oj5.setVisibility(View.INVISIBLE);
                    r_oj6.setVisibility(View.INVISIBLE);
                    r_oj_start1.setVisibility(View.INVISIBLE);
                    r_oj_start2.setVisibility(View.INVISIBLE);
                    r_oj_start3.setVisibility(View.INVISIBLE);
                    r_oj_end1.setVisibility(View.INVISIBLE);
                    r_oj_end2.setVisibility(View.INVISIBLE);
                    r_oj_end3.setVisibility(View.INVISIBLE);

                    likeAnimation(view,widthLayoutMatrix);
                }
            };
        }

        private AnimatorSet transtationAnimatorSet1(View view, int w) {
            AnimatorSet set = new AnimatorSet();
            if (n==0) {
                n++;

                r_horiz5.setVisibility(View.VISIBLE);
                r_horiz6.setVisibility(View.VISIBLE);
                r_horiz_start2.setVisibility(View.VISIBLE);
                r_horiz_end3.setVisibility(View.VISIBLE);

                set.setDuration(SHOW_DURATION).playTogether(
                        ObjectAnimator.ofFloat(view, View.TRANSLATION_X, 3*w/8),
                        ObjectAnimator.ofFloat(view, View.SCALE_X, 1f, 1.5f),
                        ObjectAnimator.ofFloat(view, View.SCALE_Y, 1f, 1.5f)
                );
            }
            else if (n==1) {
                n++;

                r_horiz1.setVisibility(View.VISIBLE);
                r_horiz2.setVisibility(View.VISIBLE);
                r_horiz3.setVisibility(View.VISIBLE);
                r_horiz4.setVisibility(View.VISIBLE);
                r_horiz5.setVisibility(View.VISIBLE);
                r_horiz6.setVisibility(View.VISIBLE);
                r_horiz_start3.setVisibility(View.VISIBLE);
                r_horiz_end1.setVisibility(View.VISIBLE);

                set.setDuration(SHOW_DURATION).playTogether(
                        ObjectAnimator.ofFloat(view, View.TRANSLATION_X, -4*w/8),
                        ObjectAnimator.ofFloat(view, View.SCALE_X, 1f, 1.5f),
                        ObjectAnimator.ofFloat(view, View.SCALE_Y, 1f, 1.5f)
                );
            }
            else if (n==2) {
                n++;

                r_horiz1.setVisibility(View.VISIBLE);
                r_horiz2.setVisibility(View.VISIBLE);
                r_horiz3.setVisibility(View.VISIBLE);
                r_horiz_start1.setVisibility(View.VISIBLE);
                r_horiz_end2.setVisibility(View.VISIBLE);

                set.setDuration(SHOW_DURATION).playTogether(
                        ObjectAnimator.ofFloat(view, View.TRANSLATION_X, 0),
                        ObjectAnimator.ofFloat(view, View.SCALE_X, 1f, 1.5f),
                        ObjectAnimator.ofFloat(view, View.SCALE_Y, 1f, 1.5f)
                );
            }
            else if (n==3) {
                n++;

                r_glx4.setVisibility(View.VISIBLE);
                r_glx5.setVisibility(View.VISIBLE);
                r_glx_start2.setVisibility(View.VISIBLE);
                r_glx_end3.setVisibility(View.VISIBLE);

                set.setDuration(SHOW_DURATION).playTogether(
                        ObjectAnimator.ofFloat(view, View.TRANSLATION_X, 3*w/8),
                        ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, -3*w/8),
                        ObjectAnimator.ofFloat(view, View.SCALE_X, 1f, 1.5f),
                        ObjectAnimator.ofFloat(view, View.SCALE_Y, 1f, 1.5f)
                );
            }
            else if (n==4) {
                n++;

                r_glx1.setVisibility(View.VISIBLE);
                r_glx2.setVisibility(View.VISIBLE);
                r_glx3.setVisibility(View.VISIBLE);
                r_glx4.setVisibility(View.VISIBLE);
                r_glx5.setVisibility(View.VISIBLE);
                r_glx_start3.setVisibility(View.VISIBLE);
                r_glx_end1.setVisibility(View.VISIBLE);

                set.setDuration(SHOW_DURATION).playTogether(
                        ObjectAnimator.ofFloat(view, View.TRANSLATION_X, -3*w/8),
                        ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, 3*w/8),
                        ObjectAnimator.ofFloat(view, View.SCALE_X, 1f, 1.5f),
                        ObjectAnimator.ofFloat(view, View.SCALE_Y, 1f, 1.5f)
                );
            }
            else if (n==5) {
                n++;

                r_glx1.setVisibility(View.VISIBLE);
                r_glx2.setVisibility(View.VISIBLE);
                r_glx_start1.setVisibility(View.VISIBLE);
                r_glx_end2.setVisibility(View.VISIBLE);

                set.setDuration(SHOW_DURATION).playTogether(
                        ObjectAnimator.ofFloat(view, View.TRANSLATION_X, 0),
                        ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, 0),
                        ObjectAnimator.ofFloat(view, View.SCALE_X, 1f, 1.5f),
                        ObjectAnimator.ofFloat(view, View.SCALE_Y, 1f, 1.5f)
                );
            }
            else if (n==6) {
                n++;

                r_uxx5.setVisibility(View.VISIBLE);
                r_uxx6.setVisibility(View.VISIBLE);
                r_uxx_start2.setVisibility(View.VISIBLE);
                r_uxx_end3.setVisibility(View.VISIBLE);

                set.setDuration(SHOW_DURATION).playTogether(
                        ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, 3*w/8),
                        ObjectAnimator.ofFloat(view, View.SCALE_X, 1f, 1.5f),
                        ObjectAnimator.ofFloat(view, View.SCALE_Y, 1f, 1.5f)
                );
            }
            else if (n==7) {
                n++;

                r_uxx1.setVisibility(View.VISIBLE);
                r_uxx2.setVisibility(View.VISIBLE);
                r_uxx3.setVisibility(View.VISIBLE);
                r_uxx4.setVisibility(View.VISIBLE);
                r_uxx5.setVisibility(View.VISIBLE);
                r_uxx6.setVisibility(View.VISIBLE);
                r_uxx_start3.setVisibility(View.VISIBLE);
                r_uxx_end1.setVisibility(View.VISIBLE);

                set.setDuration(SHOW_DURATION).playTogether(
                        ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, -4*w/8),
                        ObjectAnimator.ofFloat(view, View.SCALE_X, 1f, 1.5f),
                        ObjectAnimator.ofFloat(view, View.SCALE_Y, 1f, 1.5f)
                );
            }
            else if (n==8) {
                n++;

                r_uxx1.setVisibility(View.VISIBLE);
                r_uxx2.setVisibility(View.VISIBLE);
                r_uxx3.setVisibility(View.VISIBLE);
                r_uxx_start1.setVisibility(View.VISIBLE);
                r_uxx_end2.setVisibility(View.VISIBLE);

                set.setDuration(SHOW_DURATION).playTogether(
                        ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, 0),
                        ObjectAnimator.ofFloat(view, View.SCALE_X, 1f, 1.5f),
                        ObjectAnimator.ofFloat(view, View.SCALE_Y, 1f, 1.5f)
                );
            }
            else if (n==9) {
                n++;

                r_oj1.setVisibility(View.VISIBLE);
                r_oj2.setVisibility(View.VISIBLE);
                r_oj3.setVisibility(View.VISIBLE);
                r_oj_start2.setVisibility(View.VISIBLE);
                r_oj_end1.setVisibility(View.VISIBLE);

                set.setDuration(SHOW_DURATION).playTogether(
                        ObjectAnimator.ofFloat(view, View.TRANSLATION_X, -4*w/8),
                        ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, -4*w/8),
                        ObjectAnimator.ofFloat(view, View.SCALE_X, 1f, 1.5f),
                        ObjectAnimator.ofFloat(view, View.SCALE_Y, 1f, 1.5f)
                );
            }
            else if (n==10) {
                n++;

                r_oj1.setVisibility(View.VISIBLE);
                r_oj2.setVisibility(View.VISIBLE);
                r_oj3.setVisibility(View.VISIBLE);
                r_oj4.setVisibility(View.VISIBLE);
                r_oj5.setVisibility(View.VISIBLE);
                r_oj6.setVisibility(View.VISIBLE);
                r_oj_start1.setVisibility(View.VISIBLE);
                r_oj_end3.setVisibility(View.VISIBLE);

                set.setDuration(SHOW_DURATION).playTogether(
                        ObjectAnimator.ofFloat(view, View.TRANSLATION_X, 3*w/8),
                        ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, 3*w/8),
                        ObjectAnimator.ofFloat(view, View.SCALE_X, 1f, 1.5f),
                        ObjectAnimator.ofFloat(view, View.SCALE_Y, 1f, 1.5f)
                );
            }
            else if (n==11) {
                n=0;

                r_oj5.setVisibility(View.VISIBLE);
                r_oj6.setVisibility(View.VISIBLE);
                r_oj_start3.setVisibility(View.VISIBLE);
                r_oj_end2.setVisibility(View.VISIBLE);

                set.setDuration(SHOW_DURATION).playTogether(
                        ObjectAnimator.ofFloat(view, View.TRANSLATION_X, 0),
                        ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, 0),
                        ObjectAnimator.ofFloat(view, View.SCALE_X, 1f, 1.5f),
                        ObjectAnimator.ofFloat(view, View.SCALE_Y, 1f, 1.5f)
                );
            }
            return set;
        }

        private AnimatorSet scaleAnimatorSet1(View view) {
            AnimatorSet set = new AnimatorSet();
            set.setDuration(SCALE_DURATION).playTogether(
                    ObjectAnimator.ofFloat(view, View.SCALE_X, 1.5f, 1f),
                    ObjectAnimator.ofFloat(view, View.SCALE_Y, 1.5f, 1f)
            );
            return set;
        }

        private AnimatorSet stopAnimatorSet1(View view) {
            AnimatorSet set = new AnimatorSet();
            set.setDuration(STOP_DELAY).playTogether(
                    ObjectAnimator.ofFloat(view, View.SCALE_X, 1f, 1f),
                    ObjectAnimator.ofFloat(view, View.SCALE_Y, 1f, 1f)
            );
            return set;
        }
    }
}

