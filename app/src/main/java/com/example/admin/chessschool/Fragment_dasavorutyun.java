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


public class Fragment_dasavorutyun extends Fragment {

    private RelativeLayout rLayout;
    private RelativeLayout.LayoutParams params_images;
    private DisplayMetrics displayMetrics;
    private int widthLayoutMatrix, heigthLayoutMatrix;
    private ImageView imageBoard;
    private ImageView tagavor_spitak,tagavor_sev,
            taguhi_spitak, taguhi_sev, navak_spitak_1,navak_spitak_2, navak_sev_1,navak_sev_2,
            pix_spitak_1,pix_spitak_2, pix_sev_1,pix_sev_2, dzi_spitak_1,dzi_spitak_2, dzi_sev_1,dzi_sev_2,
            zinvor_spitak_1,zinvor_spitak_2,zinvor_spitak_3,zinvor_spitak_4,zinvor_spitak_5,zinvor_spitak_6,
            zinvor_spitak_7,zinvor_spitak_8, zinvor_sev_1,zinvor_sev_2,zinvor_sev_3,zinvor_sev_4,zinvor_sev_5,
            zinvor_sev_6,zinvor_sev_7,zinvor_sev_8;
    private TextView text_dasavorutyun_view;
    private ImageView imagePapirus;
    private ScrollView scrollView;
    private ImageView hand, hand2;
    private boolean isAnimate=false;
    private boolean isAnimate2=false;
    private final static int SHOW_DURATION=2000;
    private static int n=0;
    private static int n2=0;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_dasavorutyun,container,false);


        rLayout=view.findViewById(R.id.rLayoutDasavorutyunFragment);
        displayMetrics=new DisplayMetrics();
        getActivity().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        widthLayoutMatrix=displayMetrics.widthPixels;
        heigthLayoutMatrix=displayMetrics.heightPixels;

        //----------bord------------------------------
        imageBoard=view.findViewById(R.id.bordId_dasavorutyun);
        imageBoard.getLayoutParams().height=widthLayoutMatrix;

        //-----------spitak_zinvorner-----------------------------------
        zinvor_spitak_1=new ImageView(getContext());
        zinvor_spitak_1.setImageResource(R.drawable.zinvor_spitak);
        params_images=new RelativeLayout.LayoutParams(widthLayoutMatrix/8-20,widthLayoutMatrix/8-20);
        params_images.setMargins(10,6*widthLayoutMatrix/8+10,0,0);
        rLayout.addView(zinvor_spitak_1,params_images);

        zinvor_spitak_2=new ImageView(getContext());
        zinvor_spitak_2.setImageResource(R.drawable.zinvor_spitak);
        params_images=new RelativeLayout.LayoutParams(widthLayoutMatrix/8-20,widthLayoutMatrix/8-20);
        params_images.setMargins(10+widthLayoutMatrix/8,6*widthLayoutMatrix/8+10,0,0);
        rLayout.addView(zinvor_spitak_2,params_images);

        zinvor_spitak_3=new ImageView(getContext());
        zinvor_spitak_3.setImageResource(R.drawable.zinvor_spitak);
        params_images=new RelativeLayout.LayoutParams(widthLayoutMatrix/8-20,widthLayoutMatrix/8-20);
        params_images.setMargins(10+2*widthLayoutMatrix/8,6*widthLayoutMatrix/8+10,0,0);
        rLayout.addView(zinvor_spitak_3,params_images);

        zinvor_spitak_4=new ImageView(getContext());
        zinvor_spitak_4.setImageResource(R.drawable.zinvor_spitak);
        params_images=new RelativeLayout.LayoutParams(widthLayoutMatrix/8-20,widthLayoutMatrix/8-20);
        params_images.setMargins(10+3*widthLayoutMatrix/8,6*widthLayoutMatrix/8+10,0,0);
        rLayout.addView(zinvor_spitak_4,params_images);

        zinvor_spitak_5=new ImageView(getContext());
        zinvor_spitak_5.setImageResource(R.drawable.zinvor_spitak);
        params_images=new RelativeLayout.LayoutParams(widthLayoutMatrix/8-20,widthLayoutMatrix/8-20);
        params_images.setMargins(10+4*widthLayoutMatrix/8,6*widthLayoutMatrix/8+10,0,0);
        rLayout.addView(zinvor_spitak_5,params_images);

        zinvor_spitak_6=new ImageView(getContext());
        zinvor_spitak_6.setImageResource(R.drawable.zinvor_spitak);
        params_images=new RelativeLayout.LayoutParams(widthLayoutMatrix/8-20,widthLayoutMatrix/8-20);
        params_images.setMargins(10+5*widthLayoutMatrix/8,6*widthLayoutMatrix/8+10,0,0);
        rLayout.addView(zinvor_spitak_6,params_images);

        zinvor_spitak_7=new ImageView(getContext());
        zinvor_spitak_7.setImageResource(R.drawable.zinvor_spitak);
        params_images=new RelativeLayout.LayoutParams(widthLayoutMatrix/8-20,widthLayoutMatrix/8-20);
        params_images.setMargins(10+6*widthLayoutMatrix/8,6*widthLayoutMatrix/8+10,0,0);
        rLayout.addView(zinvor_spitak_7,params_images);

        zinvor_spitak_8=new ImageView(getContext());
        zinvor_spitak_8.setImageResource(R.drawable.zinvor_spitak);
        params_images=new RelativeLayout.LayoutParams(widthLayoutMatrix/8-20,widthLayoutMatrix/8-20);
        params_images.setMargins(10+7*widthLayoutMatrix/8,6*widthLayoutMatrix/8+10,0,0);
        rLayout.addView(zinvor_spitak_8,params_images);

        // ----spitak_navakner
        navak_spitak_1=new ImageView(getContext());
        navak_spitak_1.setImageResource(R.drawable.navak_spitak);
        params_images=new RelativeLayout.LayoutParams(widthLayoutMatrix/8-20,widthLayoutMatrix/8-20);
        params_images.setMargins(10,7*widthLayoutMatrix/8+10,0,0);
        rLayout.addView(navak_spitak_1,params_images);

        navak_spitak_2=new ImageView(getContext());
        navak_spitak_2.setImageResource(R.drawable.navak_spitak);
        params_images=new RelativeLayout.LayoutParams(widthLayoutMatrix/8-20,widthLayoutMatrix/8-20);
        params_images.setMargins(10+7*widthLayoutMatrix/8,7*widthLayoutMatrix/8+10,0,0);
        rLayout.addView(navak_spitak_2,params_images);

        //-----spitak_dzier
        dzi_spitak_1=new ImageView(getContext());
        dzi_spitak_1.setImageResource(R.drawable.dzi_spitak);
        params_images=new RelativeLayout.LayoutParams(widthLayoutMatrix/8-20,widthLayoutMatrix/8-20);
        params_images.setMargins(10+widthLayoutMatrix/8,7*widthLayoutMatrix/8+10,0,0);
        rLayout.addView(dzi_spitak_1,params_images);

        dzi_spitak_2=new ImageView(getContext());
        dzi_spitak_2.setImageResource(R.drawable.dzi_spitak);
        params_images=new RelativeLayout.LayoutParams(widthLayoutMatrix/8-20,widthLayoutMatrix/8-20);
        params_images.setMargins(10+6*widthLayoutMatrix/8,7*widthLayoutMatrix/8+10,0,0);
        rLayout.addView(dzi_spitak_2,params_images);

        //-----spitak_pxer
        pix_spitak_1=new ImageView(getContext());
        pix_spitak_1.setImageResource(R.drawable.pix_spitak);
        params_images=new RelativeLayout.LayoutParams(widthLayoutMatrix/8-20,widthLayoutMatrix/8-20);
        params_images.setMargins(10+2*widthLayoutMatrix/8,7*widthLayoutMatrix/8+10,0,0);
        rLayout.addView(pix_spitak_1,params_images);

        pix_spitak_2=new ImageView(getContext());
        pix_spitak_2.setImageResource(R.drawable.pix_spitak);
        params_images=new RelativeLayout.LayoutParams(widthLayoutMatrix/8-20,widthLayoutMatrix/8-20);
        params_images.setMargins(10+5*widthLayoutMatrix/8,7*widthLayoutMatrix/8+10,0,0);
        rLayout.addView(pix_spitak_2,params_images);

        //-----spitak_taguhi
        taguhi_spitak=new ImageView(getContext());
        taguhi_spitak.setImageResource(R.drawable.taguhi_spitak);
        params_images=new RelativeLayout.LayoutParams(widthLayoutMatrix/8-20,widthLayoutMatrix/8-20);
        params_images.setMargins(10+3*widthLayoutMatrix/8,7*widthLayoutMatrix/8+10,0,0);
        rLayout.addView(taguhi_spitak,params_images);

        //------spitak_tagavor
        tagavor_spitak=new ImageView(getContext());
        tagavor_spitak.setImageResource(R.drawable.tagavor_spitak);
        params_images=new RelativeLayout.LayoutParams(widthLayoutMatrix/8-20,widthLayoutMatrix/8-20);
        params_images.setMargins(10+4*widthLayoutMatrix/8,7*widthLayoutMatrix/8+10,0,0);
        rLayout.addView(tagavor_spitak,params_images);

        //------sev_zinvorner----------------------------------------
        zinvor_sev_1=new ImageView(getContext());
        zinvor_sev_1.setImageResource(R.drawable.zinvor_sev);
        params_images=new RelativeLayout.LayoutParams(widthLayoutMatrix/8-20,widthLayoutMatrix/8-20);
        params_images.setMargins(10,widthLayoutMatrix/8+10,0,0);
        rLayout.addView(zinvor_sev_1,params_images);

        zinvor_sev_2=new ImageView(getContext());
        zinvor_sev_2.setImageResource(R.drawable.zinvor_sev);
        params_images=new RelativeLayout.LayoutParams(widthLayoutMatrix/8-20,widthLayoutMatrix/8-20);
        params_images.setMargins(10+widthLayoutMatrix/8,widthLayoutMatrix/8+10,0,0);
        rLayout.addView(zinvor_sev_2,params_images);

        zinvor_sev_3=new ImageView(getContext());
        zinvor_sev_3.setImageResource(R.drawable.zinvor_sev);
        params_images=new RelativeLayout.LayoutParams(widthLayoutMatrix/8-20,widthLayoutMatrix/8-20);
        params_images.setMargins(10+2*widthLayoutMatrix/8,widthLayoutMatrix/8+10,0,0);
        rLayout.addView(zinvor_sev_3,params_images);

        zinvor_sev_4=new ImageView(getContext());
        zinvor_sev_4.setImageResource(R.drawable.zinvor_sev);
        params_images=new RelativeLayout.LayoutParams(widthLayoutMatrix/8-20,widthLayoutMatrix/8-20);
        params_images.setMargins(10+3*widthLayoutMatrix/8,widthLayoutMatrix/8+10,0,0);
        rLayout.addView(zinvor_sev_4,params_images);

        zinvor_sev_5=new ImageView(getContext());
        zinvor_sev_5.setImageResource(R.drawable.zinvor_sev);
        params_images=new RelativeLayout.LayoutParams(widthLayoutMatrix/8-20,widthLayoutMatrix/8-20);
        params_images.setMargins(10+4*widthLayoutMatrix/8,widthLayoutMatrix/8+10,0,0);
        rLayout.addView(zinvor_sev_5,params_images);

        zinvor_sev_6=new ImageView(getContext());
        zinvor_sev_6.setImageResource(R.drawable.zinvor_sev);
        params_images=new RelativeLayout.LayoutParams(widthLayoutMatrix/8-20,widthLayoutMatrix/8-20);
        params_images.setMargins(10+5*widthLayoutMatrix/8,widthLayoutMatrix/8+10,0,0);
        rLayout.addView(zinvor_sev_6,params_images);

        zinvor_sev_7=new ImageView(getContext());
        zinvor_sev_7.setImageResource(R.drawable.zinvor_sev);
        params_images=new RelativeLayout.LayoutParams(widthLayoutMatrix/8-20,widthLayoutMatrix/8-20);
        params_images.setMargins(10+6*widthLayoutMatrix/8,widthLayoutMatrix/8+10,0,0);
        rLayout.addView(zinvor_sev_7,params_images);

        zinvor_sev_8=new ImageView(getContext());
        zinvor_sev_8.setImageResource(R.drawable.zinvor_sev);
        params_images=new RelativeLayout.LayoutParams(widthLayoutMatrix/8-20,widthLayoutMatrix/8-20);
        params_images.setMargins(10+7*widthLayoutMatrix/8,widthLayoutMatrix/8+10,0,0);
        rLayout.addView(zinvor_sev_8,params_images);

        //-----sev_navakner
        navak_sev_1=new ImageView(getContext());
        navak_sev_1.setImageResource(R.drawable.navak_sev);
        params_images=new RelativeLayout.LayoutParams(widthLayoutMatrix/8-20,widthLayoutMatrix/8-20);
        params_images.setMargins(10,10,0,0);
        rLayout.addView(navak_sev_1,params_images);

        navak_sev_2=new ImageView(getContext());
        navak_sev_2.setImageResource(R.drawable.navak_sev);
        params_images=new RelativeLayout.LayoutParams(widthLayoutMatrix/8-20,widthLayoutMatrix/8-20);
        params_images.setMargins(10+7*widthLayoutMatrix/8,10,0,0);
        rLayout.addView(navak_sev_2,params_images);

        //----------sev_dzier
        dzi_sev_1=new ImageView(getContext());
        dzi_sev_1.setImageResource(R.drawable.dzi_sev);
        params_images=new RelativeLayout.LayoutParams(widthLayoutMatrix/8-20,widthLayoutMatrix/8-20);
        params_images.setMargins(10+widthLayoutMatrix/8,10,0,0);
        rLayout.addView(dzi_sev_1,params_images);

        dzi_sev_2=new ImageView(getContext());
        dzi_sev_2.setImageResource(R.drawable.dzi_sev);
        params_images=new RelativeLayout.LayoutParams(widthLayoutMatrix/8-20,widthLayoutMatrix/8-20);
        params_images.setMargins(10+6*widthLayoutMatrix/8,10,0,0);
        rLayout.addView(dzi_sev_2,params_images);

        //--------sev_pxer
        pix_sev_1=new ImageView(getContext());
        pix_sev_1.setImageResource(R.drawable.pix_sev);
        params_images=new RelativeLayout.LayoutParams(widthLayoutMatrix/8-20,widthLayoutMatrix/8-20);
        params_images.setMargins(10+2*widthLayoutMatrix/8,10,0,0);
        rLayout.addView(pix_sev_1,params_images);

        pix_sev_2=new ImageView(getContext());
        pix_sev_2.setImageResource(R.drawable.pix_sev);
        params_images=new RelativeLayout.LayoutParams(widthLayoutMatrix/8-20,widthLayoutMatrix/8-20);
        params_images.setMargins(10+5*widthLayoutMatrix/8,10,0,0);
        rLayout.addView(pix_sev_2,params_images);

        //--------sev_taguhi
        taguhi_sev=new ImageView(getContext());
        taguhi_sev.setImageResource(R.drawable.taguhi_sev);
        params_images=new RelativeLayout.LayoutParams(widthLayoutMatrix/8-20,widthLayoutMatrix/8-20);
        params_images.setMargins(10+3*widthLayoutMatrix/8,10,0,0);
        rLayout.addView(taguhi_sev,params_images);

        //-------tagavor_sev
        tagavor_sev=new ImageView(getContext());
        tagavor_sev.setImageResource(R.drawable.tagavor_sev);
        params_images=new RelativeLayout.LayoutParams(widthLayoutMatrix/8-20,widthLayoutMatrix/8-20);
        params_images.setMargins(10+4*widthLayoutMatrix/8,10,0,0);
        rLayout.addView(tagavor_sev,params_images);


        imagePapirus=new ImageView(getContext());
        imagePapirus.setImageResource(R.drawable.papirus);
        params_images=new RelativeLayout.LayoutParams(widthLayoutMatrix, (int)(1.3*widthLayoutMatrix));
        params_images.setMargins(0,widthLayoutMatrix+5,0,-((int)(1.3*widthLayoutMatrix)-heigthLayoutMatrix+widthLayoutMatrix));
        rLayout.addView(imagePapirus,params_images);

//-------------------text--------------------------------
        text_dasavorutyun_view=new TextView(getContext());
        text_dasavorutyun_view.setText(R.string.text_dasavorutyun);
        text_dasavorutyun_view.setTextColor(Color.parseColor("#0d0d0d"));
        text_dasavorutyun_view.setPadding(0,0,10,0);
        params_images=new RelativeLayout.LayoutParams(widthLayoutMatrix-230,(int)(1.3*widthLayoutMatrix)-50);
        params_images.setMargins(125,widthLayoutMatrix+widthLayoutMatrix/7+heigthLayoutMatrix/100,0,0);

        scrollView=new ScrollView(getContext());
        scrollView.addView(text_dasavorutyun_view);
        rLayout.addView(scrollView,params_images);


            //----------------------hand--------------------------------------------------------
            hand = new ImageView(getContext());
            hand.setImageResource(R.drawable.hand);
            params_images = new RelativeLayout.LayoutParams(3 * widthLayoutMatrix / 8, 3 * widthLayoutMatrix / 8);
            params_images.setMargins(5 * widthLayoutMatrix / 8, 3 * widthLayoutMatrix / 8, 0, 0);
            rLayout.addView(hand, params_images);
            //hand2-----------------------------------------------

            hand2 = new ImageView(getContext());
            hand2.setImageResource(R.drawable.hand);
            hand2.setRotation(270);
            params_images = new RelativeLayout.LayoutParams(3 * widthLayoutMatrix / 8, 3 * widthLayoutMatrix / 8);
            params_images.setMargins(3 * widthLayoutMatrix / 8, heigthLayoutMatrix - 2 * widthLayoutMatrix / 8, 0, 0);
            rLayout.addView(hand2, params_images);




        return view;
    }

    @Override
    public void onResume() {
        super.onResume();

        if (n!=0)
            hand.setVisibility(View.GONE);
        else
            likeAnimation(hand, widthLayoutMatrix);

        if (n2!=0)
            hand2.setVisibility(View.GONE);
        else
            likeAnimation2(hand2, widthLayoutMatrix);


    }


    public void likeAnimation(final ImageView view, final int w) {
        if (view != null && !isAnimate) {
            AnimatorSet set = new AnimatorSet();
            if (n<3) {
                set.playSequentially(
                        transtationAnimatorSet1(view, w),
                        transtationAnimatorSet2(view, w));
                set.addListener(getLikeEndListener(view,w));

                set.start();
            }
            else  {
                set.cancel();
                view.setVisibility(View.GONE);
            }
        }
    }

    private AnimatorListenerAdapter getLikeEndListener(final ImageView view, final int w) {
        return new AnimatorListenerAdapter() {
            @Override
            public void onAnimationStart(Animator animation) {
                super.onAnimationStart(animation);
                isAnimate = true;
                n++;
            }

            @Override
            public void onAnimationEnd(Animator animation) {
                super.onAnimationEnd(animation);
                isAnimate = false;
                likeAnimation(view,w);
            }
        };
    }

    private AnimatorSet transtationAnimatorSet1(View view, int w) {
        AnimatorSet set = new AnimatorSet();


            set.setDuration(SHOW_DURATION).playTogether(
                    ObjectAnimator.ofFloat(view, View.TRANSLATION_X, -4*w/8),
                    ObjectAnimator.ofFloat(view, View.SCALE_X, 1f, 0.5f),
                    ObjectAnimator.ofFloat(view, View.SCALE_Y, 1f, 0.5f)

            );

        return set;
    }


    private AnimatorSet transtationAnimatorSet2(View view, int w) {
        AnimatorSet set = new AnimatorSet();


        set.setDuration(SHOW_DURATION).playTogether(
                ObjectAnimator.ofFloat(view, View.TRANSLATION_X, 0),
                ObjectAnimator.ofFloat(view, View.SCALE_X, 0.5f, 1f),
                ObjectAnimator.ofFloat(view, View.SCALE_Y, 0.5f, 1f)

        );

        return set;
    }




    public void likeAnimation2(final ImageView view, final int w) {
        if (view != null && !isAnimate2) {
            AnimatorSet set = new AnimatorSet();
            if (n2<3) {
                set.playSequentially(
                        transtationAnimatorSet12(view, w),
                        transtationAnimatorSet22(view, w));
                set.addListener(getLikeEndListener2(view,w));

                set.start();
            }
            else  {
                set.cancel();
                view.setVisibility(View.GONE);
            }
        }
    }

    private AnimatorListenerAdapter getLikeEndListener2(final ImageView view, final int w) {
        return new AnimatorListenerAdapter() {
            @Override
            public void onAnimationStart(Animator animation) {
                super.onAnimationStart(animation);
                isAnimate2 = true;
                n2++;
            }

            @Override
            public void onAnimationEnd(Animator animation) {
                super.onAnimationEnd(animation);
                isAnimate2 = false;
                likeAnimation2(view,w);
            }
        };
    }

    private AnimatorSet transtationAnimatorSet12(View view, int w) {
        AnimatorSet set = new AnimatorSet();


        set.setDuration(SHOW_DURATION).playTogether(
                ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, -3*w/8),
                ObjectAnimator.ofFloat(view, View.SCALE_X, 1f, 0.5f),
                ObjectAnimator.ofFloat(view, View.SCALE_Y, 1f, 0.5f)

        );

        return set;
    }


    private AnimatorSet transtationAnimatorSet22(View view, int w) {
        AnimatorSet set = new AnimatorSet();


        set.setDuration(SHOW_DURATION).playTogether(
                ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, 0),
                ObjectAnimator.ofFloat(view, View.SCALE_X, 0.5f, 1f),
                ObjectAnimator.ofFloat(view, View.SCALE_Y, 0.5f, 1f)

        );

        return set;
    }


}

