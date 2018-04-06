package com.example.admin.chessschool;


import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.DrawableRes;
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

public class Fragment_zinvor extends Fragment {

    private RelativeLayout rLayout;
    private RelativeLayout.LayoutParams params_images;
    private DisplayMetrics displayMetrics;
    private int widthLayoutMatrix;
    private int hetgthLayoutMatrix;
    private ImageView imageBoard;
    private ImageView zinvor;
    private TextView text_zinvor_view;
    private boolean isAnimate=false;
    private final static int SHOW_DURATION=1200;
    private final static int SCALE_DURATION=700;
    private final static int STOP_DELAY=1000;
    private int n=0;
    private boolean stop_start=true;
    private boolean tarberak1_tarberak2=true;
    private ImageView imagePapirus, pause_play;
    private ImageView animation_typeIcon, animation_type;
    private ScrollView scrollView;
    private A a;
    private boolean firstOpen=true;
    private ImageView ramka1, r_start1, r_start2, r_start3, r_start4, r_start5, r_start6,
    r_end1,r_end2,r_end3,r_end4,r_end5,r_end6;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_zinvor,container,false);

        rLayout=view.findViewById(R.id.rLayoutZinvorFragment);
        displayMetrics=new DisplayMetrics();
        getActivity().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        widthLayoutMatrix=displayMetrics.widthPixels;
        hetgthLayoutMatrix=displayMetrics.heightPixels;

        //----------bord------------------------------
        imageBoard=view.findViewById(R.id.bordId);
        imageBoard.getLayoutParams().height=widthLayoutMatrix;

        //--------------------------ramkaner--------------------------------
       ramka1=new ImageView(getContext());
        ramka1.setImageResource(R.drawable.ramka);
        params_images=new RelativeLayout.LayoutParams(widthLayoutMatrix/8,widthLayoutMatrix/8);
        params_images.setMargins(3*widthLayoutMatrix/8,5*widthLayoutMatrix/8,0,0);
        rLayout.addView(ramka1,params_images);
        ramka1.setVisibility(View.INVISIBLE);

        r_start1=new ImageView(getContext());
        r_start1.setImageResource(R.drawable.ramka_start);
        params_images=new RelativeLayout.LayoutParams(widthLayoutMatrix/8,widthLayoutMatrix/8);
        params_images.setMargins(3*widthLayoutMatrix/8,widthLayoutMatrix/8,0,0);
        rLayout.addView(r_start1,params_images);
        r_start1.setVisibility(View.INVISIBLE);

        r_start2=new ImageView(getContext());
        r_start2.setImageResource(R.drawable.ramka_start);
        params_images=new RelativeLayout.LayoutParams(widthLayoutMatrix/8,widthLayoutMatrix/8);
        params_images.setMargins(3*widthLayoutMatrix/8,2*widthLayoutMatrix/8,0,0);
        rLayout.addView(r_start2,params_images);
        r_start2.setVisibility(View.INVISIBLE);

        r_start3=new ImageView(getContext());
        r_start3.setImageResource(R.drawable.ramka_start);
        params_images=new RelativeLayout.LayoutParams(widthLayoutMatrix/8,widthLayoutMatrix/8);
        params_images.setMargins(3*widthLayoutMatrix/8,3*widthLayoutMatrix/8,0,0);
        rLayout.addView(r_start3,params_images);
        r_start3.setVisibility(View.INVISIBLE);

        r_start4=new ImageView(getContext());
        r_start4.setImageResource(R.drawable.ramka_start);
        params_images=new RelativeLayout.LayoutParams(widthLayoutMatrix/8,widthLayoutMatrix/8);
        params_images.setMargins(3*widthLayoutMatrix/8,4*widthLayoutMatrix/8,0,0);
        rLayout.addView(r_start4,params_images);
        r_start4.setVisibility(View.INVISIBLE);

        r_start5=new ImageView(getContext());
        r_start5.setImageResource(R.drawable.ramka_start);
        params_images=new RelativeLayout.LayoutParams(widthLayoutMatrix/8,widthLayoutMatrix/8);
        params_images.setMargins(3*widthLayoutMatrix/8,5*widthLayoutMatrix/8,0,0);
        rLayout.addView(r_start5,params_images);
        r_start5.setVisibility(View.INVISIBLE);

        r_start6=new ImageView(getContext());
        r_start6.setImageResource(R.drawable.ramka_start);
        params_images=new RelativeLayout.LayoutParams(widthLayoutMatrix/8,widthLayoutMatrix/8);
        params_images.setMargins(3*widthLayoutMatrix/8,6*widthLayoutMatrix/8,0,0);
        rLayout.addView(r_start6,params_images);
        r_start6.setVisibility(View.INVISIBLE);

        r_end1=new ImageView(getContext());
        r_end1.setImageResource(R.drawable.ramka_end);
        params_images=new RelativeLayout.LayoutParams(widthLayoutMatrix/8,widthLayoutMatrix/8);
        params_images.setMargins(3*widthLayoutMatrix/8,0,0,0);
        rLayout.addView(r_end1,params_images);
        r_end1.setVisibility(View.INVISIBLE);

        r_end2=new ImageView(getContext());
        r_end2.setImageResource(R.drawable.ramka_end);
        params_images=new RelativeLayout.LayoutParams(widthLayoutMatrix/8,widthLayoutMatrix/8);
        params_images.setMargins(3*widthLayoutMatrix/8,widthLayoutMatrix/8,0,0);
        rLayout.addView(r_end2,params_images);
        r_end2.setVisibility(View.INVISIBLE);

        r_end3=new ImageView(getContext());
        r_end3.setImageResource(R.drawable.ramka_end);
        params_images=new RelativeLayout.LayoutParams(widthLayoutMatrix/8,widthLayoutMatrix/8);
        params_images.setMargins(3*widthLayoutMatrix/8,2*widthLayoutMatrix/8,0,0);
        rLayout.addView(r_end3,params_images);
        r_end3.setVisibility(View.INVISIBLE);

        r_end4=new ImageView(getContext());
        r_end4.setImageResource(R.drawable.ramka_end);
        params_images=new RelativeLayout.LayoutParams(widthLayoutMatrix/8,widthLayoutMatrix/8);
        params_images.setMargins(3*widthLayoutMatrix/8,3*widthLayoutMatrix/8,0,0);
        rLayout.addView(r_end4,params_images);
        r_end4.setVisibility(View.INVISIBLE);

        r_end5=new ImageView(getContext());
        r_end5.setImageResource(R.drawable.ramka_end);
        params_images=new RelativeLayout.LayoutParams(widthLayoutMatrix/8,widthLayoutMatrix/8);
        params_images.setMargins(3*widthLayoutMatrix/8,4*widthLayoutMatrix/8,0,0);
        rLayout.addView(r_end5,params_images);
        r_end5.setVisibility(View.INVISIBLE);

        r_end6=new ImageView(getContext());
        r_end6.setImageResource(R.drawable.ramka_end);
        params_images=new RelativeLayout.LayoutParams(widthLayoutMatrix/8,widthLayoutMatrix/8);
        params_images.setMargins(3*widthLayoutMatrix/8,5*widthLayoutMatrix/8,0,0);
        rLayout.addView(r_end6,params_images);
        r_end6.setVisibility(View.INVISIBLE);


//-----------zinvor-----------------------------------
        zinvor=new ImageView(getContext());
        zinvor.setImageResource(R.drawable.zinvor_spitak);
        params_images=new RelativeLayout.LayoutParams(widthLayoutMatrix/8-20,widthLayoutMatrix/8-20);
        params_images.setMargins(10+3*widthLayoutMatrix/8,6*widthLayoutMatrix/8+10,0,0);
        rLayout.addView(zinvor,params_images);
        
        imagePapirus=new ImageView(getContext());
        imagePapirus.setImageResource(R.drawable.papirus);
        params_images=new RelativeLayout.LayoutParams(5*widthLayoutMatrix/8+50,(int)(1.3*(5*widthLayoutMatrix/8+50)));
        params_images.setMargins(0,widthLayoutMatrix+5,0,-((int)(1.3*(5*widthLayoutMatrix/8+50))-hetgthLayoutMatrix+widthLayoutMatrix));
        rLayout.addView(imagePapirus,params_images);

//-------------------text--------------------------------
        text_zinvor_view=new TextView(getContext());
        text_zinvor_view.setText(R.string.text_zinvor);
        text_zinvor_view.setTextColor(Color.parseColor("#0d0d0d"));
        text_zinvor_view.setPadding(0,0,10,0);
        params_images=new RelativeLayout.LayoutParams(5*widthLayoutMatrix/8-100,(int)(1.3*(5*widthLayoutMatrix/8+50))-50);
        params_images.setMargins(90,widthLayoutMatrix+widthLayoutMatrix/7-widthLayoutMatrix/36,0,0);

        scrollView=new ScrollView(getContext());
        scrollView.addView(text_zinvor_view);
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
                (hetgthLayoutMatrix-widthLayoutMatrix)/2-widthLayoutMatrix/8+50,0,0);
        rLayout.addView(animation_typeIcon,params_images);

        animation_type=new ImageView(getContext());
        animation_type.setImageResource(R.drawable.zinvor_spitak);
        params_images=new RelativeLayout.LayoutParams(widthLayoutMatrix/8,widthLayoutMatrix/8);
        params_images.setMargins(widthLayoutMatrix-widthLayoutMatrix/4-30+widthLayoutMatrix/8-widthLayoutMatrix/16,
                widthLayoutMatrix+
                        (hetgthLayoutMatrix-widthLayoutMatrix)/2-widthLayoutMatrix/16+50,0,0);
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
                    a.likeAnimation(R.drawable.zinvor_spitak,zinvor,widthLayoutMatrix);
                }
            }
        });

        n=0;
        a.likeAnimation(R.drawable.zinvor_spitak,zinvor,widthLayoutMatrix);
        return view;
    }

    @Override
    public void onPause() {
        super.onPause();
        stop_start=false;
        pause_play.setImageResource(R.drawable.play);
    }

    private class A {

        public void likeAnimation(@DrawableRes int icon, final ImageView view, final int widthLayoutMatrix) {
            if (view != null && !isAnimate) {
                AnimatorSet set = new AnimatorSet();
                if (stop_start) {
                    set.playSequentially(
                            transtationAnimatorSet1(view, widthLayoutMatrix),
                            scaleAnimatorSet1(view),
                            stopAnimatorSet1(view));
                    set.addListener(getLikeEndListener(view, icon, widthLayoutMatrix));

                    set.start();
                }
                else set.cancel();
            }
        }

        private AnimatorListenerAdapter getLikeEndListener(final ImageView view, final int icon, final int widthLayoutMatrix) {
            return new AnimatorListenerAdapter() {
                @Override
                public void onAnimationStart(Animator animation) {
                    super.onAnimationStart(animation);
                    if (n==0 || n==-1)
                        view.setImageResource(icon);
                    isAnimate = true;
                }

                @Override
                public void onAnimationEnd(Animator animation) {
                    super.onAnimationEnd(animation);
                    isAnimate = false;

                    ramka1.setVisibility(View.INVISIBLE);
                    r_start1.setVisibility(View.INVISIBLE);
                    r_start2.setVisibility(View.INVISIBLE);
                    r_start3.setVisibility(View.INVISIBLE);
                    r_start4.setVisibility(View.INVISIBLE);
                    r_start5.setVisibility(View.INVISIBLE);
                    r_start6.setVisibility(View.INVISIBLE);

                    r_end1.setVisibility(View.INVISIBLE);
                    r_end2.setVisibility(View.INVISIBLE);
                    r_end3.setVisibility(View.INVISIBLE);
                    r_end4.setVisibility(View.INVISIBLE);
                    r_end5.setVisibility(View.INVISIBLE);
                    r_end6.setVisibility(View.INVISIBLE);


                    if (n==6)
                        view.setImageResource(R.drawable.taguhi_spitak);
                    likeAnimation(icon,view,widthLayoutMatrix);
                }
            };
        }

        private AnimatorSet transtationAnimatorSet1(View view, int w) {
            AnimatorSet set = new AnimatorSet();

            if (n==0 && tarberak1_tarberak2==true) {
                n++;
                tarberak1_tarberak2=false;
                view.setAlpha(1);

                r_start6.setVisibility(View.VISIBLE);
                r_end6.setVisibility(View.VISIBLE);

                set.setDuration(SHOW_DURATION).playTogether(
                        ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, -w/8),
                        ObjectAnimator.ofFloat(view, View.SCALE_X, 1f, 1.5f),
                        ObjectAnimator.ofFloat(view, View.SCALE_Y, 1f, 1.5f)

                );

            }
            else if (n==0 && tarberak1_tarberak2==false) {
                n+=2;
                tarberak1_tarberak2=true;
                view.setAlpha(1);

                ramka1.setVisibility(View.VISIBLE);
                r_start6.setVisibility(View.VISIBLE);
                r_end5.setVisibility(View.VISIBLE);

                set.setDuration(SHOW_DURATION).playTogether(
                        ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, -w/4),
                        ObjectAnimator.ofFloat(view, View.SCALE_X, 1f, 1.5f),
                        ObjectAnimator.ofFloat(view, View.SCALE_Y, 1f, 1.5f)
                );
            }
            else if (n==1) {
                n++;

                r_start5.setVisibility(View.VISIBLE);
                r_end5.setVisibility(View.VISIBLE);

                set.setDuration(SHOW_DURATION).playTogether(
                        ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, -w/4),
                        ObjectAnimator.ofFloat(view, View.SCALE_X, 1f, 1.5f),
                        ObjectAnimator.ofFloat(view, View.SCALE_Y, 1f, 1.5f)
                );
            }
            else if (n==2) {
                n++;

                r_start4.setVisibility(View.VISIBLE);
                r_end4.setVisibility(View.VISIBLE);

                set.setDuration(SHOW_DURATION).playTogether(
                        ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, -3*w/8),
                        ObjectAnimator.ofFloat(view, View.SCALE_X, 1f, 1.5f),
                        ObjectAnimator.ofFloat(view, View.SCALE_Y, 1f, 1.5f)
                );
            }
            else if (n==3) {
                n++;

                r_start3.setVisibility(View.VISIBLE);
                r_end3.setVisibility(View.VISIBLE);

                set.setDuration(SHOW_DURATION).playTogether(
                        ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, -4*w/8),
                        ObjectAnimator.ofFloat(view, View.SCALE_X, 1f, 1.5f),
                        ObjectAnimator.ofFloat(view, View.SCALE_Y, 1f, 1.5f)
                );
            }
            else if (n==4) {
                n++;

                r_start2.setVisibility(View.VISIBLE);
                r_end2.setVisibility(View.VISIBLE);

                set.setDuration(SHOW_DURATION).playTogether(
                        ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, -5*w/8),
                        ObjectAnimator.ofFloat(view, View.SCALE_X, 1f, 1.5f),
                        ObjectAnimator.ofFloat(view, View.SCALE_Y, 1f, 1.5f)
                );
            }
            else if (n==5) {
                n++;

                r_start1.setVisibility(View.VISIBLE);
                r_end1.setVisibility(View.VISIBLE);

                set.setDuration(SHOW_DURATION).playTogether(
                        ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, -6*w/8),
                        ObjectAnimator.ofFloat(view, View.SCALE_X, 1f, 1.5f),
                        ObjectAnimator.ofFloat(view, View.SCALE_Y, 1f, 1.5f)
                );
            }
            else if (n==6) {
                n++;
                set.setDuration(STOP_DELAY);
            }
            else if (n==7) {
                n=0;
                view.setAlpha(0);
                set.setDuration(SHOW_DURATION).playTogether(
                        ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, 0),
                        ObjectAnimator.ofFloat(view, View.SCALE_X, 1f, 1.5f),
                        ObjectAnimator.ofFloat(view, View.SCALE_Y, 1f, 1.5f)
                );
            }
            return set;
        }

        private  AnimatorSet scaleAnimatorSet1(View view) {
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

