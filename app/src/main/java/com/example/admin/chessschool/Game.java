 package com.example.admin.chessschool;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

import java.lang.ref.WeakReference;

 public class Game extends AppCompatActivity implements View.OnClickListener, GetDialogClockResultListner,
 GetDialogResultZinvorPoxarinumListner {

     private RelativeLayout rLayout;
     private  DisplayMetrics displayMetrics;
     private int widthLayoutMatrix, heigthLayoutMatrix;
     private int widthLayout1, heigthLayout1;

     private ImageView imageBoard;
     private ImageView zinvor_sev_1, zinvor_sev_2, zinvor_sev_3, zinvor_sev_4, zinvor_sev_5, zinvor_sev_6,
     zinvor_sev_7, zinvor_sev_8;
     private ImageView zinvor_spitak_1, zinvor_spitak_2,zinvor_spitak_3,zinvor_spitak_4,zinvor_spitak_5,
             zinvor_spitak_6,zinvor_spitak_7,zinvor_spitak_8;
     private ImageView dzi_sev_1, dzi_sev_2, dzi_spitak_1,dzi_spitak_2;
     private ImageView pix_sev_1,pix_sev_2, pix_spitak_1, pix_spitak_2;
     private ImageView navak_sev_1, navak_spitak_1,navak_sev_2, navak_spitak_2;
     private ImageView taguhi_sev, taguhi_spitak;
     private ImageView tagavor_sev, tagavor_spitak;

     private ImageView imageRamka1,imageRamka2,imageRamka3,imageRamka4,imageRamka5,imageRamka6;
     private ImageView[]  imageRamkaNavak_horizonakan=new ImageView[8];
     private ImageView[]  imageRamkaNavak_uxxahayac=new ImageView[8];
     private String[] oponentImageString_uxxahayac=new String[8];
     private String[] oponentImageString_horizonakan=new String[8];
     private ImageView[] imageRamkaPix_glxavor=new ImageView[8];
     private ImageView[] imageRamkaPix_ojandak=new ImageView[8];
     private String[] oponentPixString_glxavor=new String[8];
     private String[] oponentPixString_ojandak=new String[8];
     private ImageView imageRamkaDzi_1, imageRamkaDzi_2, imageRamkaDzi_3, imageRamkaDzi_4,
             imageRamkaDzi_5, imageRamkaDzi_6, imageRamkaDzi_7, imageRamkaDzi_8;
     private String oponentDziString_1="", oponentDziString_2="", oponentDziString_3="", oponentDziString_4="",
             oponentDziString_5="", oponentDziString_6="", oponentDziString_7="", oponentDziString_8="";
     private ImageView imageRamkaTagavor_1, imageRamkaTagavor_2, imageRamkaTagavor_3, imageRamkaTagavor_4,
             imageRamkaTagavor_5, imageRamkaTagavor_6, imageRamkaTagavor_7, imageRamkaTagavor_8,
             imageRamkaTagavor_9, imageRamkaTagavor_10;

     private String oponentTagavorString_1="", oponentTagavorString_2="", oponentTagavorString_3="", oponentTagavorString_4="",
             oponentTagavorString_5="", oponentTagavorString_6="", oponentTagavorString_7="", oponentTagavorString_8="";

     private RelativeLayout.LayoutParams params_images;

     private String matrixBord[][]=new String[8][8];
     private String imageClicked="";

     private String clickedRamka1="";
     private String clickedRamka2="";
     private String clickedRamka3="";
     private String clickedRamka4="";
     private String clickedRamka5="";
     private String clickedRamka6="";

     private String zinvorClickRAmka2_num="";

     private String[] clickedRamkaNavah_horizonakan=new String[8];
     private String[] clickedRamkaNavah_uxxahayac=new String[8];
     private String[] clickedRamkaPix_glxavor=new String[8];
     private String[] clicedRamkaPix_ojandak=new String[8];
     private String clickedRamkaDzi_1="", clickedRamkaDzi_2="", clickedRamkaDzi_3="", clickedRamkaDzi_4="",
             clickedRamkaDzi_5="", clickedRamkaDzi_6="", clickedRamkaDzi_7="", clickedRamkaDzi_8="";
     private String clickedRamkaTagavor_1="", clickedRamkaTagavor_2="", clickedRamkaTagavor_3="", clickedRamkaTagavor_4="",
             clickedRamkaTagavor_5="", clickedRamkaTagavor_6="", clickedRamkaTagavor_7="", clickedRamkaTagavor_8="",
             clickedRamkaTagavor_9="", clickedRamkaTagavor_10="";

     private boolean imageClickedColor=true;

     private int spitak_zinvor_1_left, spitak_zinvor_1_top;
     private int spitak_zinvor_2_left, spitak_zinvor_2_top;
     private int spitak_zinvor_3_left, spitak_zinvor_3_top;
     private int spitak_zinvor_4_left, spitak_zinvor_4_top;
     private int spitak_zinvor_5_left, spitak_zinvor_5_top;
     private int spitak_zinvor_6_left, spitak_zinvor_6_top;
     private int spitak_zinvor_7_left, spitak_zinvor_7_top;
     private int spitak_zinvor_8_left, spitak_zinvor_8_top;

     private int sev_zinvor_1_left, sev_zinvor_1_top;
     private int sev_zinvor_2_left, sev_zinvor_2_top;
     private int sev_zinvor_3_left, sev_zinvor_3_top;
     private int sev_zinvor_4_left, sev_zinvor_4_top;
     private int sev_zinvor_5_left, sev_zinvor_5_top;
     private int sev_zinvor_6_left, sev_zinvor_6_top;
     private int sev_zinvor_7_left, sev_zinvor_7_top;
     private int sev_zinvor_8_left, sev_zinvor_8_top;

     private int spitak_navak_1_left, spitak_navak_1_top;
     private int spitak_navak_2_left, spitak_navak_2_top;

     private int sev_navak_1_left, sev_navak_1_top;
     private int sev_navak_2_left, sev_navak_2_top;

     private int spitak_pix_1_left, spitak_pix_1_top;
     private int spitak_pix_2_left, spitak_pix_2_top;

     private int sev_pix_1_left, sev_pix_1_top;
     private int sev_pix_2_left, sev_pix_2_top;

     private int spitak_dzi_1_left, spitak_dzi_1_top;
     private int spitak_dzi_2_left, spitak_dzi_2_top;

     private int sev_dzi_1_left, sev_dzi_1_top;
     private int sev_dzi_2_left, sev_dzi_2_top;

     private int spitak_taguhi_left, spitak_taguhi_top;
     private int sev_taguhi_left, sev_taguhi_top;

     private int spitak_tagavor_left, spitak_tagavor_top;
     private int sev_tagavor_left, sev_tagavor_top;

     private int position1;

     private int view_i=0;
     private int view_j=0;

     private int ramka_1_i=0;
     private int ramka_1_j=0;
     private int ramka_2_i=0;
     private int ramka_2_j=0;
     private int ramka_3_i=0;
     private int ramka_3_j=0;
     private int ramka_4_i=0;
     private int ramka_4_j=0;
     private int ramka_5_i=0;
     private int ramka_5_j=0;
     private int ramka_6_i=0;
     private int ramka_6_j=0;

     private boolean qayl_spitak_tagavor=true;
     private boolean qayl_sev_tagavor=true;
     private boolean qayl_spitak_navak_1=true;
     private boolean qayl_spitak_navak_2=true;
     private boolean qayl_sev_navak_1=true;
     private boolean qayl_sev_navak_2=true;

     private boolean shax_spitak_tagavor=true;
     private boolean shax_sev_tagavor=true;

     private int dirq_i_tagavor, dirq_j_tagavor;

     private boolean shax_spitak_tagavor1=true;
     private boolean shax_sev_tagavor1=true;

     private boolean zinvor_spitak_1_qayl=true;
     private boolean zinvor_spitak_2_qayl=true;
     private boolean zinvor_spitak_3_qayl=true;
     private boolean zinvor_spitak_4_qayl=true;
     private boolean zinvor_spitak_5_qayl=true;
     private boolean zinvor_spitak_6_qayl=true;
     private boolean zinvor_spitak_7_qayl=true;
     private boolean zinvor_spitak_8_qayl=true;

     private boolean zinvor_sev_1_qayl=true;
     private boolean zinvor_sev_2_qayl=true;
     private boolean zinvor_sev_3_qayl=true;
     private boolean zinvor_sev_4_qayl=true;
     private boolean zinvor_sev_5_qayl=true;
     private boolean zinvor_sev_6_qayl=true;
     private boolean zinvor_sev_7_qayl=true;
     private boolean zinvor_sev_8_qayl=true;

     private TextView textViev_Clock_spitak, textView_Clock_sev;
     private String clock_spitak_time, clock_sev_time;
     private String time_spitak="", time_sev="";
     private int count_spitak_time=0, count_sev_time=0;
     private boolean time_continue=true;

     private Handler handler;
     private DialogFragment dlgClock, diaog_SpitakZinvor_Poxarinum, dialog_SevZinvorPoxarinum;
     private Dialog_End_Game dialog_end_game;

     private int wrapContetnt_textView=RelativeLayout.LayoutParams.WRAP_CONTENT;

     @Override
     protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         requestWindowFeature(Window.FEATURE_NO_TITLE);
         getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                 WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_game);

        displayMetrics=new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        widthLayoutMatrix=displayMetrics.widthPixels;
        heigthLayoutMatrix=displayMetrics.heightPixels;

        rLayout=findViewById(R.id.rLayout);
        widthLayout1=rLayout.getLayoutParams().width;
        heigthLayout1=rLayout.getLayoutParams().height;

         position1=heigthLayoutMatrix-widthLayoutMatrix;

        //bord-i texadrum
        imageBoard=new ImageView(this);
        imageBoard.setImageResource(R.drawable.board);
        params_images=new RelativeLayout.LayoutParams(widthLayoutMatrix,widthLayoutMatrix);
        params_images.setMargins(0,(heigthLayoutMatrix-widthLayoutMatrix)/2,0,0);
        rLayout.addView(imageBoard,params_images);

         //Jam_spitak------------------
         textViev_Clock_spitak=new TextView(this);
         textViev_Clock_spitak.setText("30 : 05");
         textViev_Clock_spitak.setTextSize(30);
         textViev_Clock_spitak.setPadding(5,4,5,4);
         textViev_Clock_spitak.setBackgroundResource(R.drawable.shape_time);
         params_images=new RelativeLayout.LayoutParams(288,134);
         params_images.setMargins(widthLayoutMatrix/2-144,position1/2+widthLayoutMatrix+10,0,20);
         rLayout.addView(textViev_Clock_spitak,params_images);
         textViev_Clock_spitak.setGravity(Gravity.CENTER);
         textViev_Clock_spitak.setTextColor(Color.parseColor("#000000"));

         //Jam_severi-------------------------------
         textView_Clock_sev=new TextView(this);
         textView_Clock_sev.setText("30 : 05");
         textView_Clock_sev.setTextSize(30);
         textView_Clock_sev.setRotation(180);
         textView_Clock_sev.setPadding(5,4,5,4);
         textView_Clock_sev.setBackgroundResource(R.drawable.shape_time);
         params_images=new RelativeLayout.LayoutParams(288,134);
         params_images.setMargins(widthLayoutMatrix/2-144,position1/2-144,0,0);
         rLayout.addView(textView_Clock_sev,params_images);
         textView_Clock_sev.setGravity(Gravity.CENTER);
         textView_Clock_sev.setTextColor(Color.parseColor("#000000"));

        //spitak figurneri dasavorum
        zinvor_spitak_1=new ImageView(this);
        zinvor_spitak_1.setImageResource(R.drawable.zinvor_spitak);
        params_images=new RelativeLayout.LayoutParams(widthLayoutMatrix/8-20,widthLayoutMatrix/8-20);
        params_images.setMargins(10,(heigthLayoutMatrix-widthLayoutMatrix)/2+6*widthLayoutMatrix/8+10,0,0);
        rLayout.addView(zinvor_spitak_1,params_images);
        zinvor_spitak_1.setId(R.id.id_zinvor_spitak_1);
        spitak_zinvor_1_left=10;
        spitak_zinvor_1_top=(heigthLayoutMatrix-widthLayoutMatrix)/2+6*widthLayoutMatrix/8+10;
        zinvor_spitak_1.setOnClickListener(this);

        zinvor_spitak_2=new ImageView(this);
        zinvor_spitak_2.setImageResource(R.drawable.zinvor_spitak);
        params_images=new RelativeLayout.LayoutParams(widthLayoutMatrix/8-20,widthLayoutMatrix/8-20);
        params_images.setMargins(widthLayoutMatrix/8+10,(heigthLayoutMatrix-widthLayoutMatrix)/2+6*widthLayoutMatrix/8+10,0,0);
        rLayout.addView(zinvor_spitak_2,params_images);
        zinvor_spitak_2.setId(R.id.id_zinvor_spitak_2);
        spitak_zinvor_2_left=widthLayoutMatrix/8+10;
        spitak_zinvor_2_top=(heigthLayoutMatrix-widthLayoutMatrix)/2+6*widthLayoutMatrix/8+10;
        zinvor_spitak_2.setOnClickListener(this);

        zinvor_spitak_3=new ImageView(this);
        zinvor_spitak_3.setImageResource(R.drawable.zinvor_spitak);
        params_images=new RelativeLayout.LayoutParams(widthLayoutMatrix/8-20,widthLayoutMatrix/8-20);
        params_images.setMargins(widthLayoutMatrix/4+10,(heigthLayoutMatrix-widthLayoutMatrix)/2+6*widthLayoutMatrix/8+10,0,0);
        rLayout.addView(zinvor_spitak_3,params_images);
        zinvor_spitak_3.setId(R.id.id_zinvor_spitak_3);
        spitak_zinvor_3_left=widthLayoutMatrix/4+10;
        spitak_zinvor_3_top=(heigthLayoutMatrix-widthLayoutMatrix)/2+6*widthLayoutMatrix/8+10;
        zinvor_spitak_3.setOnClickListener(this);

        zinvor_spitak_4=new ImageView(this);
        zinvor_spitak_4.setImageResource(R.drawable.zinvor_spitak);
        params_images=new RelativeLayout.LayoutParams(widthLayoutMatrix/8-20,widthLayoutMatrix/8-20);
        params_images.setMargins(3*widthLayoutMatrix/8+10,(heigthLayoutMatrix-widthLayoutMatrix)/2+6*widthLayoutMatrix/8+10,0,0);
        rLayout.addView(zinvor_spitak_4,params_images);
        zinvor_spitak_4.setId(R.id.id_zinvor_spitak_4);
        spitak_zinvor_4_left=3*widthLayoutMatrix/8+10;
        spitak_zinvor_4_top=(heigthLayoutMatrix-widthLayoutMatrix)/2+6*widthLayoutMatrix/8+10;
        zinvor_spitak_4.setOnClickListener(this);

        zinvor_spitak_5=new ImageView(this);
        zinvor_spitak_5.setImageResource(R.drawable.zinvor_spitak);
        params_images=new RelativeLayout.LayoutParams(widthLayoutMatrix/8-20,widthLayoutMatrix/8-20);
        params_images.setMargins(widthLayoutMatrix/2+10,(heigthLayoutMatrix-widthLayoutMatrix)/2+6*widthLayoutMatrix/8+10,0,0);
        rLayout.addView(zinvor_spitak_5,params_images);
        zinvor_spitak_5.setId(R.id.id_zinvor_spitak_5);
        spitak_zinvor_5_left=widthLayoutMatrix/2+10;
        spitak_zinvor_5_top=(heigthLayoutMatrix-widthLayoutMatrix)/2+6*widthLayoutMatrix/8+10;
        zinvor_spitak_5.setOnClickListener(this);

        zinvor_spitak_6=new ImageView(this);
        zinvor_spitak_6.setImageResource(R.drawable.zinvor_spitak);
        params_images=new RelativeLayout.LayoutParams(widthLayoutMatrix/8-20,widthLayoutMatrix/8-20);
        params_images.setMargins(5*widthLayoutMatrix/8+10,(heigthLayoutMatrix-widthLayoutMatrix)/2+6*widthLayoutMatrix/8+10,0,0);
        rLayout.addView(zinvor_spitak_6,params_images);
        zinvor_spitak_6.setId(R.id.id_zinvor_spitak_6);
        spitak_zinvor_6_left=5*widthLayoutMatrix/8+10;
        spitak_zinvor_6_top=(heigthLayoutMatrix-widthLayoutMatrix)/2+6*widthLayoutMatrix/8+10;
        zinvor_spitak_6.setOnClickListener(this);

        zinvor_spitak_7=new ImageView(this);
        zinvor_spitak_7.setImageResource(R.drawable.zinvor_spitak);
        params_images=new RelativeLayout.LayoutParams(widthLayoutMatrix/8-20,widthLayoutMatrix/8-20);
        params_images.setMargins(3*widthLayoutMatrix/4+10,(heigthLayoutMatrix-widthLayoutMatrix)/2+6*widthLayoutMatrix/8+10,0,0);
        rLayout.addView(zinvor_spitak_7,params_images);
        zinvor_spitak_7.setId(R.id.id_zinvor_spitak_7);
        spitak_zinvor_7_left=3*widthLayoutMatrix/4+10;
        spitak_zinvor_7_top=(heigthLayoutMatrix-widthLayoutMatrix)/2+6*widthLayoutMatrix/8+10;
        zinvor_spitak_7.setOnClickListener(this);

        zinvor_spitak_8=new ImageView(this);
        zinvor_spitak_8.setImageResource(R.drawable.zinvor_spitak);
        params_images=new RelativeLayout.LayoutParams(widthLayoutMatrix/8-20,widthLayoutMatrix/8-20);
        params_images.setMargins(7*widthLayoutMatrix/8+10,(heigthLayoutMatrix-widthLayoutMatrix)/2+6*widthLayoutMatrix/8+10,0,0);
        rLayout.addView(zinvor_spitak_8,params_images);
        zinvor_spitak_8.setId(R.id.id_zinvor_spitak_8);
        spitak_zinvor_8_left=7*widthLayoutMatrix/8+10;
        spitak_zinvor_8_top=(heigthLayoutMatrix-widthLayoutMatrix)/2+6*widthLayoutMatrix/8+10;
        zinvor_spitak_8.setOnClickListener(this);

        navak_spitak_1=new ImageView(this);
        navak_spitak_1.setImageResource(R.drawable.navak_spitak);
        params_images=new RelativeLayout.LayoutParams(widthLayoutMatrix/8-20,widthLayoutMatrix/8-20);
        params_images.setMargins(10,(heigthLayoutMatrix-widthLayoutMatrix)/2+7*widthLayoutMatrix/8+10,0,0);
        rLayout.addView(navak_spitak_1,params_images);
        navak_spitak_1.setId(R.id.id_navak_spitak_1);
        spitak_navak_1_left=10;
        spitak_navak_1_top=(heigthLayoutMatrix-widthLayoutMatrix)/2+7*widthLayoutMatrix/8+10;
        navak_spitak_1.setOnClickListener(this);

        navak_spitak_2=new ImageView(this);
        navak_spitak_2.setImageResource(R.drawable.navak_spitak);
        params_images=new RelativeLayout.LayoutParams(widthLayoutMatrix/8-20,widthLayoutMatrix/8-20);
        params_images.setMargins(10+7*widthLayoutMatrix/8,(heigthLayoutMatrix-widthLayoutMatrix)/2+7*widthLayoutMatrix/8+10,0,0);
        rLayout.addView(navak_spitak_2,params_images);
        navak_spitak_2.setId(R.id.id_navak_spitak_2);
        spitak_navak_2_left=10+7*widthLayoutMatrix/8;
        spitak_navak_2_top=(heigthLayoutMatrix-widthLayoutMatrix)/2+7*widthLayoutMatrix/8+10;
        navak_spitak_2.setOnClickListener(this);

        dzi_spitak_1=new ImageView(this);
        dzi_spitak_1.setImageResource(R.drawable.dzi_spitak);
        params_images=new RelativeLayout.LayoutParams(widthLayoutMatrix/8-20,widthLayoutMatrix/8-20);
        params_images.setMargins(10+widthLayoutMatrix/8,(heigthLayoutMatrix-widthLayoutMatrix)/2+7*widthLayoutMatrix/8+10,0,0);
        rLayout.addView(dzi_spitak_1,params_images);
        dzi_spitak_1.setId(R.id.id_dzi_spitak_1);
        spitak_dzi_1_left=10+widthLayoutMatrix/8;
        spitak_dzi_1_top=(heigthLayoutMatrix-widthLayoutMatrix)/2+7*widthLayoutMatrix/8+10;
        dzi_spitak_1.setOnClickListener(this);

        dzi_spitak_2=new ImageView(this);
        dzi_spitak_2.setImageResource(R.drawable.dzi_spitak);
        params_images=new RelativeLayout.LayoutParams(widthLayoutMatrix/8-20,widthLayoutMatrix/8-20);
        params_images.setMargins(10+3*widthLayoutMatrix/4,(heigthLayoutMatrix-widthLayoutMatrix)/2+7*widthLayoutMatrix/8+10,0,0);
        rLayout.addView(dzi_spitak_2,params_images);
        dzi_spitak_2.setId(R.id.id_dzi_spitak_2);
        spitak_dzi_2_left=10+3*widthLayoutMatrix/4;
        spitak_dzi_2_top=(heigthLayoutMatrix-widthLayoutMatrix)/2+7*widthLayoutMatrix/8+10;
        dzi_spitak_2.setOnClickListener(this);

        pix_spitak_1=new ImageView(this);
        pix_spitak_1.setImageResource(R.drawable.pix_spitak);
        params_images=new RelativeLayout.LayoutParams(widthLayoutMatrix/8-20,widthLayoutMatrix/8-20);
        params_images.setMargins(10+widthLayoutMatrix/4,(heigthLayoutMatrix-widthLayoutMatrix)/2+7*widthLayoutMatrix/8+10,0,0);
        rLayout.addView(pix_spitak_1,params_images);
        pix_spitak_1.setId(R.id.id_pix_spitak_1);
        spitak_pix_1_left=10+widthLayoutMatrix/4;
        spitak_pix_1_top=(heigthLayoutMatrix-widthLayoutMatrix)/2+7*widthLayoutMatrix/8+10;
        pix_spitak_1.setOnClickListener(this);

        pix_spitak_2=new ImageView(this);
        pix_spitak_2.setImageResource(R.drawable.pix_spitak);
        params_images=new RelativeLayout.LayoutParams(widthLayoutMatrix/8-20,widthLayoutMatrix/8-20);
        params_images.setMargins(10+5*widthLayoutMatrix/8,(heigthLayoutMatrix-widthLayoutMatrix)/2+7*widthLayoutMatrix/8+10,0,0);
        rLayout.addView(pix_spitak_2,params_images);
        pix_spitak_2.setId(R.id.id_pix_spitak_2);
        spitak_pix_2_left=10+5*widthLayoutMatrix/8;
        spitak_pix_2_top=(heigthLayoutMatrix-widthLayoutMatrix)/2+7*widthLayoutMatrix/8+10;
        pix_spitak_2.setOnClickListener(this);

        taguhi_spitak=new ImageView(this);
        taguhi_spitak.setImageResource(R.drawable.taguhi_spitak);
        params_images=new RelativeLayout.LayoutParams(widthLayoutMatrix/8-20,widthLayoutMatrix/8-20);
        params_images.setMargins(10+3*widthLayoutMatrix/8,(heigthLayoutMatrix-widthLayoutMatrix)/2+7*widthLayoutMatrix/8+10,0,0);
        rLayout.addView(taguhi_spitak,params_images);
        taguhi_spitak.setId(R.id.id_taguhi_spitak);
        spitak_taguhi_left=10+3*widthLayoutMatrix/8;
        spitak_taguhi_top=(heigthLayoutMatrix-widthLayoutMatrix)/2+7*widthLayoutMatrix/8+10;
        taguhi_spitak.setOnClickListener(this);

        tagavor_spitak=new ImageView(this);
        tagavor_spitak.setImageResource(R.drawable.tagavor_spitak);
        params_images=new RelativeLayout.LayoutParams(widthLayoutMatrix/8-20,widthLayoutMatrix/8-20);
        params_images.setMargins(10+widthLayoutMatrix/2,(heigthLayoutMatrix-widthLayoutMatrix)/2+7*widthLayoutMatrix/8+10,0,0);
        rLayout.addView(tagavor_spitak,params_images);
        tagavor_spitak.setId(R.id.id_tagavor_spitak);
        spitak_tagavor_left=10+widthLayoutMatrix/2;
        spitak_tagavor_top=(heigthLayoutMatrix-widthLayoutMatrix)/2+7*widthLayoutMatrix/8+10;
        tagavor_spitak.setOnClickListener(this);

        //sev figurneri dasavorum
        zinvor_sev_1=new ImageView(this);
        zinvor_sev_1.setImageResource(R.drawable.zinvor_sev);
        params_images=new RelativeLayout.LayoutParams(widthLayoutMatrix/8-20, widthLayoutMatrix/8-20);
        params_images.setMargins(10,(heigthLayoutMatrix-widthLayoutMatrix)/2+widthLayoutMatrix/8+10,0,0);
        rLayout.addView(zinvor_sev_1,params_images);
        zinvor_sev_1.setId(R.id.id_zinvor_sev_1);
        sev_zinvor_1_left=10;
        sev_zinvor_1_top=(heigthLayoutMatrix-widthLayoutMatrix)/2+widthLayoutMatrix/8+10;
        zinvor_sev_1.setOnClickListener(this);

        zinvor_sev_2=new ImageView(this);
        zinvor_sev_2.setImageResource(R.drawable.zinvor_sev);
        params_images=new RelativeLayout.LayoutParams(widthLayoutMatrix/8-20, widthLayoutMatrix/8-20);
        params_images.setMargins(10+widthLayoutMatrix/8,(heigthLayoutMatrix-widthLayoutMatrix)/2+widthLayoutMatrix/8+10,0,0);
        rLayout.addView(zinvor_sev_2,params_images);
        zinvor_sev_2.setId(R.id.id_zinvor_sev_2);
        sev_zinvor_2_left=10+widthLayoutMatrix/8;
        sev_zinvor_2_top=(heigthLayoutMatrix-widthLayoutMatrix)/2+widthLayoutMatrix/8+10;
        zinvor_sev_2.setOnClickListener(this);

        zinvor_sev_3=new ImageView(this);
        zinvor_sev_3.setImageResource(R.drawable.zinvor_sev);
        params_images=new RelativeLayout.LayoutParams(widthLayoutMatrix/8-20, widthLayoutMatrix/8-20);
        params_images.setMargins(10+widthLayoutMatrix/4,(heigthLayoutMatrix-widthLayoutMatrix)/2+widthLayoutMatrix/8+10,0,0);
        rLayout.addView(zinvor_sev_3,params_images);
        zinvor_sev_3.setId(R.id.id_zinvor_sev_3);
        sev_zinvor_3_left=10+widthLayoutMatrix/4;
        sev_zinvor_3_top=(heigthLayoutMatrix-widthLayoutMatrix)/2+widthLayoutMatrix/8+10;
        zinvor_sev_3.setOnClickListener(this);

        zinvor_sev_4=new ImageView(this);
        zinvor_sev_4.setImageResource(R.drawable.zinvor_sev);
        params_images=new RelativeLayout.LayoutParams(widthLayoutMatrix/8-20, widthLayoutMatrix/8-20);
        params_images.setMargins(10+3*widthLayoutMatrix/8,(heigthLayoutMatrix-widthLayoutMatrix)/2+widthLayoutMatrix/8+10,0,0);
        rLayout.addView(zinvor_sev_4,params_images);
        zinvor_sev_4.setId(R.id.id_zinvor_sev_4);
        sev_zinvor_4_left=10+3*widthLayoutMatrix/8;
        sev_zinvor_4_top=(heigthLayoutMatrix-widthLayoutMatrix)/2+widthLayoutMatrix/8+10;
        zinvor_sev_4.setOnClickListener(this);

        zinvor_sev_5=new ImageView(this);
        zinvor_sev_5.setImageResource(R.drawable.zinvor_sev);
        params_images=new RelativeLayout.LayoutParams(widthLayoutMatrix/8-20, widthLayoutMatrix/8-20);
        params_images.setMargins(10+widthLayoutMatrix/2,(heigthLayoutMatrix-widthLayoutMatrix)/2+widthLayoutMatrix/8+10,0,0);
        rLayout.addView(zinvor_sev_5,params_images);
        zinvor_sev_5.setId(R.id.id_zinvor_sev_5);
        sev_zinvor_5_left=10+widthLayoutMatrix/2;
        sev_zinvor_5_top=(heigthLayoutMatrix-widthLayoutMatrix)/2+widthLayoutMatrix/8+10;
        zinvor_sev_5.setOnClickListener(this);

        zinvor_sev_6=new ImageView(this);
        zinvor_sev_6.setImageResource(R.drawable.zinvor_sev);
        params_images=new RelativeLayout.LayoutParams(widthLayoutMatrix/8-20, widthLayoutMatrix/8-20);
        params_images.setMargins(10+5*widthLayoutMatrix/8,(heigthLayoutMatrix-widthLayoutMatrix)/2+widthLayoutMatrix/8+10,0,0);
        rLayout.addView(zinvor_sev_6,params_images);
        zinvor_sev_6.setId(R.id.id_zinvor_sev_6);
        sev_zinvor_6_left=10+5*widthLayoutMatrix/8;
        sev_zinvor_6_top=(heigthLayoutMatrix-widthLayoutMatrix)/2+widthLayoutMatrix/8+10;
        zinvor_sev_6.setOnClickListener(this);

        zinvor_sev_7=new ImageView(this);
        zinvor_sev_7.setImageResource(R.drawable.zinvor_sev);
        params_images=new RelativeLayout.LayoutParams(widthLayoutMatrix/8-20, widthLayoutMatrix/8-20);
        params_images.setMargins(10+6*widthLayoutMatrix/8,(heigthLayoutMatrix-widthLayoutMatrix)/2+widthLayoutMatrix/8+10,0,0);
        rLayout.addView(zinvor_sev_7,params_images);
        zinvor_sev_7.setId(R.id.id_zinvor_sev_7);
        sev_zinvor_7_left=10+6*widthLayoutMatrix/8;
        sev_zinvor_7_top=(heigthLayoutMatrix-widthLayoutMatrix)/2+widthLayoutMatrix/8+10;
        zinvor_sev_7.setOnClickListener(this);

        zinvor_sev_8=new ImageView(this);
        zinvor_sev_8.setImageResource(R.drawable.zinvor_sev);
        params_images=new RelativeLayout.LayoutParams(widthLayoutMatrix/8-20, widthLayoutMatrix/8-20);
        params_images.setMargins(10+7*widthLayoutMatrix/8,(heigthLayoutMatrix-widthLayoutMatrix)/2+widthLayoutMatrix/8+10,0,0);
        rLayout.addView(zinvor_sev_8,params_images);
        zinvor_sev_8.setId(R.id.id_zinvor_sev_8);
        sev_zinvor_8_left=10+7*widthLayoutMatrix/8;
        sev_zinvor_8_top=(heigthLayoutMatrix-widthLayoutMatrix)/2+widthLayoutMatrix/8+10;
        zinvor_sev_8.setOnClickListener(this);

        navak_sev_1=new ImageView(this);
        navak_sev_1.setImageResource(R.drawable.navak_sev);
        params_images=new RelativeLayout.LayoutParams(widthLayoutMatrix/8-20,widthLayoutMatrix/8-20);
        params_images.setMargins(10,(heigthLayoutMatrix-widthLayoutMatrix)/2+10,0,0);
        rLayout.addView(navak_sev_1,params_images);
        navak_sev_1.setId(R.id.id_navak_sev_1);
        sev_navak_1_left=10;
        sev_navak_1_top=(heigthLayoutMatrix-widthLayoutMatrix)/2+10;
        navak_sev_1.setOnClickListener(this);

        navak_sev_2=new ImageView(this);
        navak_sev_2.setImageResource(R.drawable.navak_sev);
        params_images=new RelativeLayout.LayoutParams(widthLayoutMatrix/8-20,widthLayoutMatrix/8-20);
        params_images.setMargins(10+7*widthLayoutMatrix/8,(heigthLayoutMatrix-widthLayoutMatrix)/2+10,0,0);
        rLayout.addView(navak_sev_2,params_images);
        navak_sev_2.setId(R.id.id_navak_sev_2);
        sev_navak_2_left=10+7*widthLayoutMatrix/8;
        sev_navak_2_top=(heigthLayoutMatrix-widthLayoutMatrix)/2+10;
        navak_sev_2.setOnClickListener(this);

        dzi_sev_1=new ImageView(this);
        dzi_sev_1.setImageResource(R.drawable.dzi_sev);
        params_images=new RelativeLayout.LayoutParams(widthLayoutMatrix/8-20,widthLayoutMatrix/8-20);
        params_images.setMargins(10+widthLayoutMatrix/8,(heigthLayoutMatrix-widthLayoutMatrix)/2+10,0,0);
        rLayout.addView(dzi_sev_1,params_images);
        dzi_sev_1.setId(R.id.id_dzi_sev_1);
        sev_dzi_1_left=10+widthLayoutMatrix/8;
        sev_dzi_1_top=(heigthLayoutMatrix-widthLayoutMatrix)/2+10;
        dzi_sev_1.setOnClickListener(this);

        dzi_sev_2=new ImageView(this);
        dzi_sev_2.setImageResource(R.drawable.dzi_sev);
        params_images=new RelativeLayout.LayoutParams(widthLayoutMatrix/8-20,widthLayoutMatrix/8-20);
        params_images.setMargins(10+3*widthLayoutMatrix/4,(heigthLayoutMatrix-widthLayoutMatrix)/2+10,0,0);
        rLayout.addView(dzi_sev_2,params_images);
        dzi_sev_2.setId(R.id.id_dzi_sev_2);
        sev_dzi_2_left=10+3*widthLayoutMatrix/4;
        sev_dzi_2_top=(heigthLayoutMatrix-widthLayoutMatrix)/2+10;
        dzi_sev_2.setOnClickListener(this);

        pix_sev_1=new ImageView(this);
        pix_sev_1.setImageResource(R.drawable.pix_sev);
        params_images=new RelativeLayout.LayoutParams(widthLayoutMatrix/8-20,widthLayoutMatrix/8-20);
        params_images.setMargins(10+widthLayoutMatrix/4,(heigthLayoutMatrix-widthLayoutMatrix)/2+10,0,0);
        rLayout.addView(pix_sev_1,params_images);
        pix_sev_1.setId(R.id.id_pix_sev_1);
        sev_pix_1_left=10+widthLayoutMatrix/4;
        sev_pix_1_top=(heigthLayoutMatrix-widthLayoutMatrix)/2+10;
        pix_sev_1.setOnClickListener(this);

        pix_sev_2=new ImageView(this);
        pix_sev_2.setImageResource(R.drawable.pix_sev);
        params_images=new RelativeLayout.LayoutParams(widthLayoutMatrix/8-20,widthLayoutMatrix/8-20);
        params_images.setMargins(10+5*widthLayoutMatrix/8,(heigthLayoutMatrix-widthLayoutMatrix)/2+10,0,0);
        rLayout.addView(pix_sev_2,params_images);
        pix_sev_2.setId(R.id.id_pix_sev_2);
        sev_pix_2_left=10+5*widthLayoutMatrix/8;
        sev_pix_2_top=(heigthLayoutMatrix-widthLayoutMatrix)/2+10;
        pix_sev_2.setOnClickListener(this);

        taguhi_sev=new ImageView(this);
        taguhi_sev.setImageResource(R.drawable.taguhi_sev);
        params_images=new RelativeLayout.LayoutParams(widthLayoutMatrix/8-20,widthLayoutMatrix/8-20);
        params_images.setMargins(10+3*widthLayoutMatrix/8,(heigthLayoutMatrix-widthLayoutMatrix)/2+10,0,0);
        rLayout.addView(taguhi_sev,params_images);
        taguhi_sev.setId(R.id.id_taguhi_sev);
        sev_taguhi_left=10+3*widthLayoutMatrix/8;
        sev_taguhi_top=(heigthLayoutMatrix-widthLayoutMatrix)/2+10;
        taguhi_sev.setOnClickListener(this);

        tagavor_sev=new ImageView(this);
        tagavor_sev.setImageResource(R.drawable.tagavor_sev);
        params_images=new RelativeLayout.LayoutParams(widthLayoutMatrix/8-20,widthLayoutMatrix/8-20);
        params_images.setMargins(10+widthLayoutMatrix/2,(heigthLayoutMatrix-widthLayoutMatrix)/2+10,0,0);
        rLayout.addView(tagavor_sev,params_images);
        tagavor_sev.setId(R.id.id_tagavor_sev);
        sev_tagavor_left=10+widthLayoutMatrix/2;
        sev_tagavor_top=(heigthLayoutMatrix-widthLayoutMatrix)/2+10;
        tagavor_sev.setOnClickListener(this);

        //bord-in hamapatasxan matrix_i gcnum
        matrixBord[0][0]="sev_navak_1";
        matrixBord[0][7]="sev_navak_2";
        matrixBord[0][1]="sev_dzi_1";
        matrixBord[0][6]="sev_dzi_2";
        matrixBord[0][2]="sev_pix_1";
        matrixBord[0][5]="sev_pix_2";
        matrixBord[0][3]="sev_taguhi";
        matrixBord[0][4]="sev_tagavor";
        matrixBord[1][0]="sev_zinvor_1";
        matrixBord[1][1]="sev_zinvor_2";
        matrixBord[1][2]="sev_zinvor_3";
        matrixBord[1][3]="sev_zinvor_4";
        matrixBord[1][4]="sev_zinvor_5";
        matrixBord[1][5]="sev_zinvor_6";
        matrixBord[1][6]="sev_zinvor_7";
        matrixBord[1][7]="sev_zinvor_8";

        matrixBord[7][0]="spitak_navak_1";
        matrixBord[7][7]="spitak_navak_2";
        matrixBord[7][1]="spitak_dzi_1";
        matrixBord[7][6]="spitak_dzi_2";
        matrixBord[7][2]="spitak_pix_1";
        matrixBord[7][5]="spitak_pix_2";
        matrixBord[7][3]="spitak_taguhi";
        matrixBord[7][4]="spitak_tagavor";
        matrixBord[6][0]="spitak_zinvor_1";
        matrixBord[6][1]="spitak_zinvor_2";
        matrixBord[6][2]="spitak_zinvor_3";
        matrixBord[6][3]="spitak_zinvor_4";
        matrixBord[6][4]="spitak_zinvor_5";
        matrixBord[6][5]="spitak_zinvor_6";
        matrixBord[6][6]="spitak_zinvor_7";
        matrixBord[6][7]="spitak_zinvor_8";

        for (int    i=2; i<6; i++) {
            for (int j = 0; j < 8; j++) {
                matrixBord[i][j]="datark";
            }
        }

        for (int i=0; i<8; i++) {
            clickedRamkaNavah_horizonakan[i]="";
            clickedRamkaNavah_uxxahayac[i]="";
            oponentImageString_uxxahayac[i]="";
            oponentImageString_horizonakan[i]="";
            clickedRamkaPix_glxavor[i]="";
            clicedRamkaPix_ojandak[i]="";
            oponentPixString_glxavor[i]="";
            oponentPixString_ojandak[i]="";
        }

         dlgClock=new Dialog_Clock();
         dlgClock.show(getFragmentManager(),"");
    }

    private DialogInterface.OnClickListener myClickExitListner=new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface dialog, int which) {
           switch (which) {
               case Dialog.BUTTON_POSITIVE:
                   finish();
                   break;
               case Dialog.BUTTON_NEGATIVE:
                   break;
           }
        }
    };

     @Override
     protected Dialog onCreateDialog(int id) {
         if (id==1) {
             AlertDialog.Builder adb=new AlertDialog.Builder(Game.this);
             adb.setTitle("Ելք");
             adb.setMessage("Ընդհատել խաղը?");
             adb.setPositiveButton("ԱՅՈ",myClickExitListner);
             adb.setNegativeButton("ՈՉ",myClickExitListner);
             adb.setCancelable(false);
             return adb.create();
         }
         return super.onCreateDialog(id);
     }

     @Override
     public boolean onKeyDown(int keyCode, KeyEvent event) {
         if (keyCode==KeyEvent.KEYCODE_BACK) {
            showDialog(1);
         }
         return true;
     }

     private void game_end_showResult(String result) {

         zinvor_spitak_1.setEnabled(false);
        zinvor_spitak_2.setEnabled(false);
        zinvor_spitak_3.setEnabled(false);
        zinvor_spitak_4.setEnabled(false);
        zinvor_spitak_5.setEnabled(false);
        zinvor_spitak_6.setEnabled(false);
        zinvor_spitak_7.setEnabled(false);
        zinvor_spitak_8.setEnabled(false);
        zinvor_sev_1.setEnabled(false);
        zinvor_sev_2.setEnabled(false);
        zinvor_sev_3.setEnabled(false);
        zinvor_sev_4.setEnabled(false);
        zinvor_sev_5.setEnabled(false);
        zinvor_sev_6.setEnabled(false);
        zinvor_sev_7.setEnabled(false);
        zinvor_sev_8.setEnabled(false);
        navak_spitak_1.setEnabled(false);
        navak_spitak_2.setEnabled(false);
        navak_sev_1.setEnabled(false);
        navak_sev_2.setEnabled(false);
        dzi_spitak_1.setEnabled(false);
        dzi_spitak_2.setEnabled(false);
        dzi_sev_1.setEnabled(false);
        dzi_sev_2.setEnabled(false);
        pix_spitak_1.setEnabled(false);
        pix_spitak_2.setEnabled(false);
        pix_sev_1.setEnabled(false);
        pix_sev_2.setEnabled(false);
        taguhi_spitak.setEnabled(false);
        taguhi_sev.setEnabled(false);
        tagavor_spitak.setEnabled(false);
        tagavor_sev.setEnabled(false);

        time_continue=false;

         dialog_end_game=new Dialog_End_Game();
         dialog_end_game.setResult(result);
         dialog_end_game.show(getFragmentManager(),"");
    }

     @Override
     public void getResultClock (String result) {
         textViev_Clock_spitak.setText(result);
         textView_Clock_sev.setText(result);

         clock_spitak_time=textViev_Clock_spitak.getText().toString();
         if (clock_spitak_time.charAt(0)!='0') {
             count_spitak_time+=Integer.parseInt(clock_spitak_time.substring(0,2))*60;
         }
         else {
             count_spitak_time+=Integer.parseInt(clock_spitak_time.substring(1,2))*60;
         }
         if (clock_spitak_time.charAt(clock_spitak_time.length()-2)!='0') {
             count_spitak_time+=Integer.parseInt(clock_spitak_time.substring(clock_spitak_time.length()-2,clock_spitak_time.length()));
         }
         else {
             count_spitak_time+=Integer.parseInt(clock_spitak_time.substring(clock_spitak_time.length()-1,clock_spitak_time.length()));
         }

         clock_sev_time=textView_Clock_sev.getText().toString();
         if (clock_sev_time.charAt(0)!='0') {
             count_sev_time+=Integer.parseInt(clock_sev_time.substring(0,2))*60;
         }
         else {
             count_sev_time+=Integer.parseInt(clock_sev_time.substring(1,2))*60;
         }
         if (clock_sev_time.charAt(clock_sev_time.length()-2)!='0') {
             count_sev_time+=Integer.parseInt(clock_sev_time.substring(clock_sev_time.length()-2,clock_sev_time.length()));
         }
         else {
             count_sev_time+=Integer.parseInt(clock_sev_time.substring(clock_sev_time.length()-1,clock_sev_time.length()));
         }
         handler=new MyHandler(this);
         handler.sendEmptyMessageDelayed(0,1000);
     }

     @Override
     public void getResultZinvorPoxarinum (int result) {

         zinvorPopooxum(result);
         if (imageClicked.charAt(1)=='p') {
             shax_stugum(true);
         }
         else
             shax_stugum(false);

         if (imageClicked.charAt(1)=='p') {
             if (mat_pat_stugum(false)==false) {
                 if (shax_sev_tagavor==false)
                     game_end_showResult("Մատ Սեվերին");
                 else
                 game_end_showResult("ոչ_ոքի");
             }
         }
         else {
             if (mat_pat_stugum(true)==false) {
                 if (shax_spitak_tagavor==false)
                     game_end_showResult("Մատ Սպիտակներին");
                 else
                     game_end_showResult("ոչ_ոքի");
             }
         }
     }

     @Override
     public void onClick(View view) {

        switch (view.getId()) {
            //-----------spitak zinvor--------------------------------------------------------------------------------------
            case  R.id.id_zinvor_spitak_1:
                if (imageClickedColor)
                    zinvorClick(zinvor_spitak_1, spitak_zinvor_1_left, spitak_zinvor_1_top,
                            "spitak_zinvor_1", 10, (heigthLayoutMatrix-widthLayoutMatrix)/2+6*widthLayoutMatrix/8+10,true);
                break;
            case R.id.id_zinvor_spitak_2:
                if (imageClickedColor)
                    zinvorClick(zinvor_spitak_2, spitak_zinvor_2_left, spitak_zinvor_2_top,
                            "spitak_zinvor_2", 10 + widthLayoutMatrix / 8,
                            (heigthLayoutMatrix-widthLayoutMatrix)/2+6*widthLayoutMatrix/8+10,true);
                break;
            case R.id.id_zinvor_spitak_3:

                if (imageClickedColor)
                    zinvorClick(zinvor_spitak_3, spitak_zinvor_3_left, spitak_zinvor_3_top,
                            "spitak_zinvor_3", 10 + widthLayoutMatrix / 4,
                            (heigthLayoutMatrix-widthLayoutMatrix)/2+6*widthLayoutMatrix/8+10,true);
                break;
            case R.id.id_zinvor_spitak_4:
                if (imageClickedColor)
                    zinvorClick(zinvor_spitak_4, spitak_zinvor_4_left, spitak_zinvor_4_top,
                            "spitak_zinvor_4", 10 + 3 * widthLayoutMatrix / 8,
                            (heigthLayoutMatrix-widthLayoutMatrix)/2+6*widthLayoutMatrix/8+10,true);
                break;
            case R.id.id_zinvor_spitak_5:
                if (imageClickedColor)
                    zinvorClick(zinvor_spitak_5, spitak_zinvor_5_left, spitak_zinvor_5_top,
                            "spitak_zinvor_5", 10 + widthLayoutMatrix / 2,
                            (heigthLayoutMatrix-widthLayoutMatrix)/2+6*widthLayoutMatrix/8+10,true);
                break;
            case R.id.id_zinvor_spitak_6:
                if (imageClickedColor)
                    zinvorClick(zinvor_spitak_6, spitak_zinvor_6_left, spitak_zinvor_6_top,
                            "spitak_zinvor_6", 10 + 5 * widthLayoutMatrix / 8,
                            (heigthLayoutMatrix-widthLayoutMatrix)/2+6*widthLayoutMatrix/8+10,true);
                break;
            case R.id.id_zinvor_spitak_7:
                if (imageClickedColor)
                    zinvorClick(zinvor_spitak_7, spitak_zinvor_7_left, spitak_zinvor_7_top,
                            "spitak_zinvor_7", 10 + 3 * widthLayoutMatrix / 4,
                            (heigthLayoutMatrix-widthLayoutMatrix)/2+6*widthLayoutMatrix/8+10,true);
                break;
            case R.id.id_zinvor_spitak_8:
                if (imageClickedColor)
                    zinvorClick(zinvor_spitak_8, spitak_zinvor_8_left, spitak_zinvor_8_top,
                            "spitak_zinvor_8", 10 + 7 * widthLayoutMatrix / 8,
                            (heigthLayoutMatrix-widthLayoutMatrix)/2+6*widthLayoutMatrix/8+10,true);
                break;

                //---------------sev zinvor----------------------------------------------------------------------------------
            case R.id.id_zinvor_sev_1:
                if (!imageClickedColor)
                    zinvorClick(zinvor_sev_1, sev_zinvor_1_left, sev_zinvor_1_top,
                            "sev_zinvor_1", 10, (heigthLayoutMatrix-widthLayoutMatrix)/2+widthLayoutMatrix/8+10,false);
                break;
            case R.id.id_zinvor_sev_2:
                if (!imageClickedColor)
                    zinvorClick(zinvor_sev_2, sev_zinvor_2_left, sev_zinvor_2_top,
                            "sev_zinvor_2", 10 + widthLayoutMatrix / 8,
                            (heigthLayoutMatrix-widthLayoutMatrix)/2+widthLayoutMatrix/8+10,false);
                break;
            case R.id.id_zinvor_sev_3:
                if (!imageClickedColor)
                    zinvorClick(zinvor_sev_3,sev_zinvor_3_left,sev_zinvor_3_top,
                        "sev_zinvor_3",10+widthLayoutMatrix/4,
                            (heigthLayoutMatrix-widthLayoutMatrix)/2+widthLayoutMatrix/8+10,false);
                break;
            case R.id.id_zinvor_sev_4:
                if (!imageClickedColor)
                    zinvorClick(zinvor_sev_4,sev_zinvor_4_left,sev_zinvor_4_top,
                        "sev_zinvor_4",10+3*widthLayoutMatrix/8,
                            (heigthLayoutMatrix-widthLayoutMatrix)/2+widthLayoutMatrix/8+10,false);
                break;
            case R.id.id_zinvor_sev_5:
                if (!imageClickedColor)
                    zinvorClick(zinvor_sev_5,sev_zinvor_5_left,sev_zinvor_5_top,
                        "sev_zinvor_5",10+widthLayoutMatrix/2,
                            (heigthLayoutMatrix-widthLayoutMatrix)/2+widthLayoutMatrix/8+10,false);
                break;
            case R.id.id_zinvor_sev_6:
                if (!imageClickedColor)
                    zinvorClick(zinvor_sev_6,sev_zinvor_6_left,sev_zinvor_6_top,
                        "sev_zinvor_6",10+5*widthLayoutMatrix/8,
                            (heigthLayoutMatrix-widthLayoutMatrix)/2+widthLayoutMatrix/8+10,false);
                break;
            case R.id.id_zinvor_sev_7:
                if (!imageClickedColor)
                    zinvorClick(zinvor_sev_7,sev_zinvor_7_left,sev_zinvor_7_top,
                        "sev_zinvor_7",10+3*widthLayoutMatrix/4,
                            (heigthLayoutMatrix-widthLayoutMatrix)/2+widthLayoutMatrix/8+10,false);
                break;
            case R.id.id_zinvor_sev_8:
                if (!imageClickedColor)
                    zinvorClick(zinvor_sev_8,sev_zinvor_8_left,sev_zinvor_8_top,
                        "sev_zinvor_8",10+7*widthLayoutMatrix/8,
                            (heigthLayoutMatrix-widthLayoutMatrix)/2+widthLayoutMatrix/8+10,false);
                break;

                //--------------spitak_navak----------------------------------------------------------------------
            case R.id.id_navak_spitak_1:
                if (imageClickedColor) {
                    navakClick(navak_spitak_1, spitak_navak_1_left, spitak_navak_1_top,"spitak_navak_1",true);
                }
                break;
            case R.id.id_navak_spitak_2:
                if (imageClickedColor) {
                    navakClick(navak_spitak_2, spitak_navak_2_left, spitak_navak_2_top,"spitak_navak_2",true);
                }
                break;
            case R.id.id_navak_spitak_3:
                if (imageClickedColor) {
                    navakClick(zinvor_spitak_1,spitak_zinvor_1_left,spitak_zinvor_1_top,"spitak_navak_3",true);
                }
                break;
            case R.id.id_navak_spitak_4:
                if (imageClickedColor) {
                    navakClick(zinvor_spitak_2,spitak_zinvor_2_left,spitak_zinvor_2_top,"spitak_navak_4",true);
                }
                break;
            case R.id.id_navak_spitak_5:
                if (imageClickedColor) {
                    navakClick(zinvor_spitak_3,spitak_zinvor_3_left,spitak_zinvor_3_top,"spitak_navak_5",true);
                }
                break;
            case R.id.id_navak_spitak_6:
                if (imageClickedColor) {
                    navakClick(zinvor_spitak_4,spitak_zinvor_4_left,spitak_zinvor_4_top,"spitak_navak_6",true);
                }
                break;
            case R.id.id_navak_spitak_7:
                if (imageClickedColor) {
                    navakClick(zinvor_spitak_5,spitak_zinvor_5_left,spitak_zinvor_5_top,"spitak_navak_7",true);
                }
                break;
            case R.id.id_navak_spitak_8:
                if (imageClickedColor) {
                    navakClick(zinvor_spitak_6,spitak_zinvor_6_left,spitak_zinvor_6_top,"spitak_navak_8",true);
                }
                break;
            case R.id.id_navak_spitak_9:
                if (imageClickedColor) {
                    navakClick(zinvor_spitak_7,spitak_zinvor_7_left,spitak_zinvor_7_top,"spitak_navak_9",true);
                }
                break;
            case R.id.id_navak_spitak_10:
                if (imageClickedColor) {
                    navakClick(zinvor_spitak_8,spitak_zinvor_8_left,spitak_zinvor_8_top,"spitak_navak_0",true);
                }
                break;

                //--------------------sev_navak--------------------------------------------------------------------
            case R.id.id_navak_sev_1:
                if (!imageClickedColor) {
                    navakClick(navak_sev_1, sev_navak_1_left, sev_navak_1_top,"sev_navak_1",false);
                }
                break;
            case R.id.id_navak_sev_2:
                if (!imageClickedColor) {
                    navakClick(navak_sev_2, sev_navak_2_left, sev_navak_2_top,"sev_navak_2",false);
                }
                break;
            case R.id.id_navak_sev_3:
                if (!imageClickedColor) {
                    navakClick(zinvor_sev_1, sev_zinvor_1_left, sev_zinvor_1_top,"sev_navak_3",false);
                }
                break;
            case R.id.id_navak_sev_4:
                if (!imageClickedColor) {
                    navakClick(zinvor_sev_2, sev_zinvor_2_left, sev_zinvor_2_top,"sev_navak_4",false);
                }
                break;
            case R.id.id_navak_sev_5:
                if (!imageClickedColor) {
                    navakClick(zinvor_sev_3, sev_zinvor_3_left, sev_zinvor_3_top,"sev_navak_5",false);
                }
                break;
            case R.id.id_navak_sev_6:
                if (!imageClickedColor) {
                    navakClick(zinvor_sev_4, sev_zinvor_4_left, sev_zinvor_4_top,"sev_navak_6",false);
                }
                break;
            case R.id.id_navak_sev_7:
                if (!imageClickedColor) {
                    navakClick(zinvor_sev_5, sev_zinvor_5_left, sev_zinvor_5_top,"sev_navak_7",false);
                }
                break;
            case R.id.id_navak_sev_8:
                if (!imageClickedColor) {
                    navakClick(zinvor_sev_6, sev_zinvor_6_left, sev_zinvor_6_top,"sev_navak_8",false);
                }
                break;
            case R.id.id_navak_sev_9:
                if (!imageClickedColor) {
                    navakClick(zinvor_sev_7, sev_zinvor_7_left, sev_zinvor_7_top,"sev_navak_9",false);
                }
                break;
            case R.id.id_navak_sev_10:
                if (!imageClickedColor) {
                    navakClick(zinvor_sev_8, sev_zinvor_8_left, sev_zinvor_8_top,"sev_navak_0",false);
                }
                break;

            //------------------spitak_pix------------------------------------------------------------------------------------
            case R.id.id_pix_spitak_1:
                if (imageClickedColor) {
                    pixClick(pix_spitak_1,spitak_pix_1_left, spitak_pix_1_top,"spitak_pix_1",true);
                }
                break;
            case R.id.id_pix_spitak_2:
                if (imageClickedColor) {
                    pixClick(pix_spitak_2,spitak_pix_2_left, spitak_pix_2_top,"spitak_pix_2",true);
                }
                break;
            case R.id.id_pix_spitak_3:
                if (imageClickedColor) {
                    pixClick(zinvor_spitak_1,spitak_zinvor_1_left, spitak_zinvor_1_top,"spitak_pix_3",true);
                }
                break;
            case R.id.id_pix_spitak_4:
                if (imageClickedColor) {
                    pixClick(zinvor_spitak_2,spitak_zinvor_2_left, spitak_zinvor_2_top,"spitak_pix_4",true);
                }
                break;
            case R.id.id_pix_spitak_5:
                if (imageClickedColor) {
                    pixClick(zinvor_spitak_3,spitak_zinvor_3_left, spitak_zinvor_3_top,"spitak_pix_5",true);
                }
                break;
            case R.id.id_pix_spitak_6:
                if (imageClickedColor) {
                    pixClick(zinvor_spitak_4,spitak_zinvor_4_left, spitak_zinvor_4_top,"spitak_pix_6",true);
                }
                break;
            case R.id.id_pix_spitak_7:
                if (imageClickedColor) {
                    pixClick(zinvor_spitak_5,spitak_zinvor_5_left, spitak_zinvor_5_top,"spitak_pix_7",true);
                }
                break;
            case R.id.id_pix_spitak_8:
                if (imageClickedColor) {
                    pixClick(zinvor_spitak_6,spitak_zinvor_6_left, spitak_zinvor_6_top,"spitak_pix_8",true);
                }

                break;
            case R.id.id_pix_spitak_9:
                if (imageClickedColor) {
                    pixClick(zinvor_spitak_7,spitak_zinvor_7_left, spitak_zinvor_7_top,"spitak_pix_9",true);
                }
                break;
            case R.id.id_pix_spitak_10:
                if (imageClickedColor) {
                    pixClick(zinvor_spitak_8,spitak_zinvor_8_left, spitak_zinvor_8_top,"spitak_pix_0",true);
                }
                break;

                //--------------sev_pix------------------------------------------------------------------------------------
            case R.id.id_pix_sev_1:
                if (!imageClickedColor) {
                    pixClick(pix_sev_1,sev_pix_1_left, sev_pix_1_top,"sev_pix_1",false);
                }
                break;
            case R.id.id_pix_sev_2:
                if (!imageClickedColor) {
                    pixClick(pix_sev_2,sev_pix_2_left, sev_pix_2_top,"sev_pix_2",false);
                }
                break;
            case R.id.id_pix_sev_3:
                if (!imageClickedColor) {
                    pixClick(zinvor_sev_1,sev_zinvor_1_left, sev_zinvor_1_top,"sev_pix_3",false);
                }
                break;
            case R.id.id_pix_sev_4:
                if (!imageClickedColor) {
                    pixClick(zinvor_sev_2,sev_zinvor_2_left, sev_zinvor_2_top,"sev_pix_4",false);
                }
                break;
            case R.id.id_pix_sev_5:
                if (!imageClickedColor) {
                    pixClick(zinvor_sev_3,sev_zinvor_3_left, sev_zinvor_3_top,"sev_pix_5",false);
                }
                break;
            case R.id.id_pix_sev_6:
                if (!imageClickedColor) {
                    pixClick(zinvor_sev_4,sev_zinvor_4_left, sev_zinvor_4_top,"sev_pix_6",false);
                }
                break;
            case R.id.id_pix_sev_7:
                if (!imageClickedColor) {
                    pixClick(zinvor_sev_5,sev_zinvor_5_left, sev_zinvor_5_top,"sev_pix_7",false);
                }
                break;
            case R.id.id_pix_sev_8:
                if (!imageClickedColor) {
                    pixClick(zinvor_sev_6,sev_zinvor_6_left, sev_zinvor_6_top,"sev_pix_8",false);
                }
                break;
            case R.id.id_pix_sev_9:
                if (!imageClickedColor) {
                    pixClick(zinvor_sev_7,sev_zinvor_7_left, sev_zinvor_7_top,"sev_pix_9",false);
                }
                break;
            case R.id.id_pix_sev_10:
                if (!imageClickedColor) {
                    pixClick(zinvor_sev_8,sev_zinvor_8_left, sev_zinvor_8_top,"sev_pix_0",false);
                }
                break;

                //-------------spitak dzi----------------------------------------------------------------------------------
            case R.id.id_dzi_spitak_1:
                if (imageClickedColor) {
                    dziClick(dzi_spitak_1,spitak_dzi_1_left,spitak_dzi_1_top,"spitak_dzi_1",true);
                }
                break;
            case R.id.id_dzi_spitak_2:
                if (imageClickedColor) {
                    dziClick(dzi_spitak_2,spitak_dzi_2_left,spitak_dzi_2_top,"spitak_dzi_2",true);
                }
                break;
            case R.id.id_dzi_spitak_3:
                if (imageClickedColor) {
                    dziClick(zinvor_spitak_1,spitak_zinvor_1_left,spitak_zinvor_1_top,"spitak_dzi_3",true);
                }
                break;
            case R.id.id_dzi_spitak_4:
                if (imageClickedColor) {
                    dziClick(zinvor_spitak_2,spitak_zinvor_2_left,spitak_zinvor_2_top,"spitak_dzi_4",true);
                }
                break;
            case R.id.id_dzi_spitak_5:
                if (imageClickedColor) {
                    dziClick(zinvor_spitak_3,spitak_zinvor_3_left,spitak_zinvor_3_top,"spitak_dzi_5",true);
                }
                break;
            case R.id.id_dzi_spitak_6:
                if (imageClickedColor) {
                    dziClick(zinvor_spitak_4,spitak_zinvor_4_left,spitak_zinvor_4_top,"spitak_dzi_6",true);
                }
                break;
            case R.id.id_dzi_spitak_7:
                if (imageClickedColor) {
                    dziClick(zinvor_spitak_5,spitak_zinvor_5_left,spitak_zinvor_5_top,"spitak_dzi_7",true);
                }
                break;
            case R.id.id_dzi_spitak_8:
                if (imageClickedColor) {
                    dziClick(zinvor_spitak_6,spitak_zinvor_6_left,spitak_zinvor_6_top,"spitak_dzi_8",true);
                }
                break;
            case R.id.id_dzi_spitak_9:
                if (imageClickedColor) {
                    dziClick(zinvor_spitak_7,spitak_zinvor_7_left,spitak_zinvor_7_top,"spitak_dzi_9",true);
                }
                break;
            case R.id.id_dzi_spitak_10:
                if (imageClickedColor) {
                    dziClick(zinvor_spitak_8,spitak_zinvor_8_left,spitak_zinvor_8_top,"spitak_dzi_0",true);
                }
                break;

                //--------------------sev dzi------------------------------------------------------------------------
            case R.id.id_dzi_sev_1:
                if (!imageClickedColor) {
                    dziClick(dzi_sev_1,sev_dzi_1_left,sev_dzi_1_top,"sev_dzi_1",false);
                }
                break;
            case R.id.id_dzi_sev_2:
                if (!imageClickedColor) {
                    dziClick(dzi_sev_2,sev_dzi_2_left,sev_dzi_2_top,"sev_dzi_2",false);
                }
                break;
            case R.id.id_dzi_sev_3:
                if (!imageClickedColor) {
                    dziClick(zinvor_sev_1,sev_zinvor_1_left,sev_zinvor_1_top,"sev_dzi_3",false);
                }
                break;
            case R.id.id_dzi_sev_4:
                if (!imageClickedColor) {
                    dziClick(zinvor_sev_2,sev_zinvor_2_left,sev_zinvor_2_top,"sev_dzi_4",false);
                }
                break;
            case R.id.id_dzi_sev_5:
                if (!imageClickedColor) {
                    dziClick(zinvor_sev_3,sev_zinvor_3_left,sev_zinvor_3_top,"sev_dzi_5",false);
                }
                break;
            case R.id.id_dzi_sev_6:
                if (!imageClickedColor) {
                    dziClick(zinvor_sev_4,sev_zinvor_4_left,sev_zinvor_4_top,"sev_dzi_6",false);
                }
                break;
            case R.id.id_dzi_sev_7:
                if (!imageClickedColor) {
                    dziClick(zinvor_sev_5,sev_zinvor_5_left,sev_zinvor_5_top,"sev_dzi_7",false);
                }
                break;
            case R.id.id_dzi_sev_8:
                if (!imageClickedColor) {
                    dziClick(zinvor_sev_6,sev_zinvor_6_left,sev_zinvor_6_top,"sev_dzi_8",false);
                }
                break;
            case R.id.id_dzi_sev_9:
                if (!imageClickedColor) {
                    dziClick(zinvor_sev_7,sev_zinvor_7_left,sev_zinvor_7_top,"sev_dzi_9",false);
                }
                break;
            case R.id.id_dzi_sev_10:
                if (!imageClickedColor) {
                    dziClick(zinvor_sev_8,sev_zinvor_8_left,sev_zinvor_8_top,"sev_dzi_0",false);
                }
                break;

                //---------------------spitak taguhi------------------------------------------------------------------------------
            case R.id.id_taguhi_spitak:
                if (imageClickedColor) {
                    taguhiClick(taguhi_spitak,spitak_taguhi_left,spitak_taguhi_top,"spitak_taguhi",true);
                }
                break;
            case R.id.id_taguhi_spitak1:
                if (imageClickedColor) {
                    taguhiClick(zinvor_spitak_1,spitak_zinvor_1_left,spitak_zinvor_1_top,"spitak_taguhi_1",true);
                }
                break;
            case R.id.id_taguhi_spitak2:
                if (imageClickedColor) {
                    taguhiClick(zinvor_spitak_2,spitak_zinvor_2_left,spitak_zinvor_2_top,"spitak_taguhi_2",true);
                }
                break;
            case R.id.id_taguhi_spitak3:
                if (imageClickedColor) {
                    taguhiClick(zinvor_spitak_3,spitak_zinvor_3_left,spitak_zinvor_3_top,"spitak_taguhi_3",true);
                }
                break;
            case R.id.id_taguhi_spitak4:
                if (imageClickedColor) {
                    taguhiClick(zinvor_spitak_4,spitak_zinvor_4_left,spitak_zinvor_4_top,"spitak_taguhi_4",true);
                }
                break;
            case R.id.id_taguhi_spitak5:
                if (imageClickedColor) {
                    taguhiClick(zinvor_spitak_5,spitak_zinvor_5_left,spitak_zinvor_5_top,"spitak_taguhi_5",true);
                }
                break;
            case R.id.id_taguhi_spitak6:
                if (imageClickedColor) {
                    taguhiClick(zinvor_spitak_6,spitak_zinvor_6_left,spitak_zinvor_6_top,"spitak_taguhi_6",true);
                }
                break;
            case R.id.id_taguhi_spitak7:
                if (imageClickedColor) {
                    taguhiClick(zinvor_spitak_7,spitak_zinvor_7_left,spitak_zinvor_7_top,"spitak_taguhi_7",true);
                }
                break;
            case R.id.id_taguhi_spitak8:
                if (imageClickedColor) {
                    taguhiClick(zinvor_spitak_8,spitak_zinvor_8_left,spitak_zinvor_8_top,"spitak_taguhi_8",true);
                }
                break;

                //------------------sev taguhi------------------------------------------------------------------------------------
            case R.id.id_taguhi_sev:
                if (!imageClickedColor) {
                    taguhiClick(taguhi_sev,sev_taguhi_left,sev_taguhi_top,"sev_taguhi",false);
                }
                break;
            case R.id.id_taguhi_sev1:
                if (!imageClickedColor) {
                    taguhiClick(zinvor_sev_1,sev_zinvor_1_left,sev_zinvor_1_top,"sev_taguhi_1",false);
                }
                break;
            case R.id.id_taguhi_sev2:
                if (!imageClickedColor) {
                    taguhiClick(zinvor_sev_2,sev_zinvor_2_left,sev_zinvor_2_top,"sev_taguhi_2",false);
                }
                break;
            case R.id.id_taguhi_sev3:
                if (!imageClickedColor) {
                    taguhiClick(zinvor_sev_3,sev_zinvor_3_left,sev_zinvor_3_top,"sev_taguhi_3",false);
                }
                break;
            case R.id.id_taguhi_sev4:
                if (!imageClickedColor) {
                    taguhiClick(zinvor_sev_4,sev_zinvor_4_left,sev_zinvor_4_top,"sev_taguhi_4",false);
                }
                break;
            case R.id.id_taguhi_sev5:
                if (!imageClickedColor) {
                    taguhiClick(zinvor_sev_5,sev_zinvor_5_left,sev_zinvor_5_top,"sev_taguhi_5",false);
                }
                break;
            case R.id.id_taguhi_sev6:
                if (!imageClickedColor) {
                    taguhiClick(zinvor_sev_6,sev_zinvor_6_left,sev_zinvor_6_top,"sev_taguhi_6",false);
                }
                break;
            case R.id.id_taguhi_sev7:
                if (!imageClickedColor) {
                    taguhiClick(zinvor_sev_7,sev_zinvor_7_left,sev_zinvor_7_top,"sev_taguhi_7",false);
                }
                break;
            case R.id.id_taguhi_sev8:
                if (!imageClickedColor) {
                    taguhiClick(zinvor_sev_8,sev_zinvor_8_left,sev_zinvor_8_top,"sev_taguhi_8",false);
                }
                break;

                //------------------------spitak_tagavor_click-----------------------------------------------------------------
           case R.id.id_tagavor_spitak:
                if (imageClickedColor) {
                    tagavorClick(tagavor_spitak,spitak_tagavor_left,spitak_tagavor_top,"spitak_tagavor",true);
                }
                break;

                //--------------------------sev_tagavor_click-------------------------------------------------------------
            case R.id.id_tagavor_sev:
                if (!imageClickedColor) {
                    tagavorClick(tagavor_sev,sev_tagavor_left,sev_tagavor_top,"sev_tagavor",false);
                }
                break;

//------------------------ramka1_zinvor_click-------------------------------------------------------------------------------------------
            case R.id.idRamka1:
                zinvorRamkaClick(imageRamka1,1);
                if (imageClicked.charAt(1)=='p') {
                    shax_stugum(true);
                }
                else
                    shax_stugum(false);
                if (imageClicked.charAt(1)=='p') {
                    if (mat_pat_stugum(false)==false) {
                        if (shax_sev_tagavor1==false)
                            game_end_showResult("Մատ Սեվերին");
                        else
                            game_end_showResult("ոչ_ոքի");
                    }
                }
                else {
                    if (mat_pat_stugum(true)==false) {
                        if (shax_spitak_tagavor1==false)
                            game_end_showResult("Մատ Սպիտակներին");
                        else
                            game_end_showResult("ոչ_ոքի");
                    }
                }
                break;
                //------------ramka2_zinvor_click--------------------------------------------------------------------
            case R.id.idRamka2:
                zinvorRamkaClick(imageRamka2,2);
                if (imageClicked.charAt(1)=='p') {
                    shax_stugum(true);
                }
                else
                    shax_stugum(false);

                if (imageClicked.charAt(1)=='p') {
                    if (mat_pat_stugum(false)==false) {
                        if (shax_sev_tagavor1==false)
                            game_end_showResult("Մատ Սեվերին");
                        else
                            game_end_showResult("ոչ_ոքի");
                    }
                }
                else {
                    if (mat_pat_stugum(true)==false) {
                        if (shax_spitak_tagavor1==false)
                            game_end_showResult("Մատ Սպիտակներին");
                        else
                            game_end_showResult("ոչ_ոքի");
                    }
                }
                break;
                //----------ramka3_zinvor_click-------------------------------------------------------------------------------
            case R.id.idRamka3:
                zinvorRamkaClick(imageRamka3,3);
                if (imageClicked.charAt(1)=='p') {
                    shax_stugum(true);
                }
                else
                    shax_stugum(false);

                if (imageClicked.charAt(1)=='p') {
                    if (mat_pat_stugum(false)==false) {
                        if (shax_sev_tagavor1==false)
                            game_end_showResult("Մատ Սեվերին");
                        else
                            game_end_showResult("ոչ_ոքի");
                    }
                }
                else {
                    if (mat_pat_stugum(true)==false) {
                        if (shax_spitak_tagavor1==false)
                            game_end_showResult("Մատ Սպիտակներին");
                        else
                            game_end_showResult("ոչ_ոքի");
                    }
                }
                break;
                //----------------ramka4_zinvor_click-----------------------------------------------------------------------
            case R.id.idRamka4:
                zinvorRamkaClick(imageRamka4,4);
                if (imageClicked.charAt(1)=='p') {
                    shax_stugum(true);
                }
                else
                    shax_stugum(false);

                if (imageClicked.charAt(1)=='p') {
                    if (mat_pat_stugum(false)==false) {
                        if (shax_sev_tagavor1==false)
                            game_end_showResult("Մատ Սեվերին");
                        else
                            game_end_showResult("ոչ_ոքի");
                    }
                }
                else {
                    if (mat_pat_stugum(true)==false) {
                        if (shax_spitak_tagavor1==false)
                            game_end_showResult("Մատ Սպիտակներին");
                        else
                            game_end_showResult("ոչ_ոքի");
                    }
                }
                break;
            //----------------ramka5_zinvor_click-----------------------------------------------------------------------
            case R.id.idRamka5:
                zinvorRamkaClick(imageRamka5,5);
                if (imageClicked.charAt(1)=='p') {
                    shax_stugum(true);
                }
                else
                    shax_stugum(false);

                if (imageClicked.charAt(1)=='p') {
                    if (mat_pat_stugum(false)==false) {
                        if (shax_sev_tagavor1==false)
                            game_end_showResult("Մատ Սեվերին");
                        else
                            game_end_showResult("ոչ_ոքի");
                    }
                }
                else {
                    if (mat_pat_stugum(true)==false) {
                        if (shax_spitak_tagavor1==false)
                            game_end_showResult("Մատ Սպիտակներին");
                        else
                            game_end_showResult("ոչ_ոքի");
                    }
                }
                break;
            //----------------ramka6_zinvor_click-----------------------------------------------------------------------
            case R.id.idRamka6:
                zinvorRamkaClick(imageRamka6,6);
                if (imageClicked.charAt(1)=='p') {
                    shax_stugum(true);
                }
                else
                    shax_stugum(false);

                if (imageClicked.charAt(1)=='p') {
                    if (mat_pat_stugum(false)==false) {
                        if (shax_sev_tagavor1==false)
                            game_end_showResult("Մատ Սեվերին");
                        else
                            game_end_showResult("ոչ_ոքի");
                    }
                }
                else {
                    if (mat_pat_stugum(true)==false) {
                        if (shax_spitak_tagavor1==false)
                            game_end_showResult("Մատ Սպիտակներին");
                        else
                            game_end_showResult("ոչ_ոքի");
                    }
                }
                break;

            //------------ imageRamka_Navak_Click-----------------------------------------------------
            case R.id.ramka_Navak_uxxahayac_1:
                clickNavakRamka(0,true);
                if (imageClicked.charAt(1)=='p') {
                    shax_stugum(true);
                }
                else
                    shax_stugum(false);

                if (imageClicked.charAt(1)=='p') {
                    if (mat_pat_stugum(false)==false) {
                        if (shax_sev_tagavor1==false)
                            game_end_showResult("Մատ Սեվերին");
                        else
                        game_end_showResult("ոչ_ոքի");
                    }
                }
                else {
                    if (mat_pat_stugum(true)==false) {
                        if (shax_spitak_tagavor1==false)
                            game_end_showResult("Մատ Սպիտակներին");
                        else
                            game_end_showResult("ոչ_ոքի");
                    }
                }
                break;
            case R.id.ramka_Navak_uxxahayac_2:
                clickNavakRamka(1,true);
                if (imageClicked.charAt(1)=='p') {
                    shax_stugum(true);
                }
                else
                    shax_stugum(false);

                if (imageClicked.charAt(1)=='p') {
                    if (mat_pat_stugum(false)==false) {
                        if (shax_sev_tagavor1==false)
                            game_end_showResult("Մատ Սեվերին");
                        else
                            game_end_showResult("ոչ_ոքի");
                    }
                }
                else {
                    if (mat_pat_stugum(true)==false) {
                        if (shax_spitak_tagavor1==false)
                            game_end_showResult("Մատ Սպիտակներին");
                        else
                            game_end_showResult("ոչ_ոքի");
                    }
                }
                break;
            case R.id.ramka_Navak_uxxahayac_3:
                clickNavakRamka(2,true);
                if (imageClicked.charAt(1)=='p') {
                    shax_stugum(true);
                }
                else
                    shax_stugum(false);

                if (imageClicked.charAt(1)=='p') {
                    if (mat_pat_stugum(false)==false) {
                        if (shax_sev_tagavor1==false)
                            game_end_showResult("Մատ Սեվերին");
                        else
                            game_end_showResult("ոչ_ոքի");
                    }
                }
                else {
                    if (mat_pat_stugum(true)==false) {
                        if (shax_spitak_tagavor1=false)
                            game_end_showResult("Մատ Սպիտակներին");
                        else
                            game_end_showResult("ոչ_ոքի");
                    }
                }
                break;
            case R.id.ramka_Navak_uxxahayac_4:
                clickNavakRamka(3,true);
                if (imageClicked.charAt(1)=='p') {
                    shax_stugum(true);
                }
                else
                    shax_stugum(false);

                if (imageClicked.charAt(1)=='p') {
                    if (mat_pat_stugum(false)==false) {
                        if (shax_sev_tagavor1==false)
                            game_end_showResult("Մատ Սեվերին");
                        else
                            game_end_showResult("ոչ_ոքի");
                    }
                }
                else {
                    if (mat_pat_stugum(true)==false) {
                        if (shax_spitak_tagavor1==false)
                            game_end_showResult("Մատ Սպիտակներին");
                        else
                            game_end_showResult("ոչ_ոքի");
                    }
                }
                break;
            case R.id.ramka_Navak_uxxahayac_5:
                clickNavakRamka(4,true);
                if (imageClicked.charAt(1)=='p') {
                    shax_stugum(true);
                }
                else
                    shax_stugum(false);

                if (imageClicked.charAt(1)=='p') {
                    if (mat_pat_stugum(false)==false) {
                        if (shax_sev_tagavor1==false)
                            game_end_showResult("Մատ Սեվերին");
                        else
                            game_end_showResult("ոչ_ոքի");
                    }
                }
                else {
                    if (mat_pat_stugum(true)==false) {
                        if (shax_spitak_tagavor1==false)
                            game_end_showResult("Մատ Սպիտակներին");
                        else
                            game_end_showResult("ոչ_ոքի");
                    }
                }
                break;
            case R.id.ramka_Navak_uxxahayac_6:
                clickNavakRamka(5,true);
                if (imageClicked.charAt(1)=='p') {
                    shax_stugum(true);
                }
                else
                    shax_stugum(false);

                if (imageClicked.charAt(1)=='p') {
                    if (mat_pat_stugum(false)==false) {
                        if (shax_sev_tagavor1==false)
                            game_end_showResult("Մատ Սեվերին");
                        else
                            game_end_showResult("ոչ_ոքի");
                    }
                }
                else {
                    if (mat_pat_stugum(true)==false) {
                        if (shax_spitak_tagavor1==false)
                            game_end_showResult("Մատ Սպիտակներին");
                        else
                            game_end_showResult("ոչ_ոքի");
                    }
                }
                break;
            case R.id.ramka_Navak_uxxahayac_7:
                clickNavakRamka(6,true);
                if (imageClicked.charAt(1)=='p') {
                    shax_stugum(true);
                }
                else
                    shax_stugum(false);

                if (imageClicked.charAt(1)=='p') {
                    if (mat_pat_stugum(false)==false) {
                        if (shax_sev_tagavor1==false)
                            game_end_showResult("Մատ Սեվերին");
                        else
                            game_end_showResult("ոչ_ոքի");
                    }
                }
                else {
                    if (mat_pat_stugum(true)==false) {
                        if (shax_spitak_tagavor1==false)
                            game_end_showResult("Մատ Սպիտակներին");
                        else
                            game_end_showResult("ոչ_ոքի");
                    }
                }
                break;
            case R.id.ramka_Navak_uxxahayac_8:
                clickNavakRamka(7,true);
                if (imageClicked.charAt(1)=='p') {
                    shax_stugum(true);
                }
                else
                    shax_stugum(false);

                if (imageClicked.charAt(1)=='p') {
                    if (mat_pat_stugum(false)==false) {
                        if (shax_sev_tagavor1==false)
                            game_end_showResult("Մատ Սեվերին");
                        else
                            game_end_showResult("ոչ_ոքի");
                    }
                }
                else {
                    if (mat_pat_stugum(true)==false) {
                        if (shax_spitak_tagavor1==false)
                            game_end_showResult("Մատ Սպիտակներին");
                        else
                            game_end_showResult("ոչ_ոքի");
                    }
                }
                break;
            case R.id.ramka_Navak_horizonakan_1:
                clickNavakRamka(0,false);
                if (imageClicked.charAt(1)=='p') {
                    shax_stugum(true);
                }
                else
                    shax_stugum(false);

                if (imageClicked.charAt(1)=='p') {
                    if (mat_pat_stugum(false)==false) {
                        if (shax_sev_tagavor1==false)
                            game_end_showResult("Մատ Սեվերին");
                        else
                            game_end_showResult("ոչ_ոքի");
                    }
                }
                else {
                    if (mat_pat_stugum(true)==false) {
                        if (shax_spitak_tagavor1==false)
                            game_end_showResult("Մատ Սպիտակներին");
                        else
                            game_end_showResult("ոչ_ոքի");
                    }
                }
                break;
            case R.id.ramka_Navak_horizonakan_2:
                clickNavakRamka(1,false);
                if (imageClicked.charAt(1)=='p') {
                    shax_stugum(true);
                }
                else
                    shax_stugum(false);

                if (imageClicked.charAt(1)=='p') {
                    if (mat_pat_stugum(false)==false) {
                        if (shax_sev_tagavor1==false)
                            game_end_showResult("Մատ Սեվերին");
                        else
                            game_end_showResult("ոչ_ոքի");
                    }
                }
                else {
                    if (mat_pat_stugum(true)==false) {
                        if (shax_spitak_tagavor1==false)
                            game_end_showResult("Մատ Սպիտակներին");
                        else
                            game_end_showResult("ոչ_ոքի");
                    }
                }
                break;
            case R.id.ramka_Navak_horizonakan_3:
                clickNavakRamka(2,false);
                if (imageClicked.charAt(1)=='p') {
                    shax_stugum(true);
                }
                else
                    shax_stugum(false);

                if (imageClicked.charAt(1)=='p') {
                    if (mat_pat_stugum(false)==false) {
                        if (shax_sev_tagavor1==false)
                            game_end_showResult("Մատ Սեվերին");
                        else
                            game_end_showResult("ոչ_ոքի");
                    }
                }
                else {
                    if (mat_pat_stugum(true)==false) {
                        if (shax_spitak_tagavor1==false)
                            game_end_showResult("Մատ Սպիտակներին");
                        else
                            game_end_showResult("ոչ_ոքի");
                    }
                }
                break;
            case R.id.ramka_Navak_horizonakan_4:
                clickNavakRamka(3,false);
                if (imageClicked.charAt(1)=='p') {
                    shax_stugum(true);
                }
                else
                    shax_stugum(false);

                if (imageClicked.charAt(1)=='p') {
                    if (mat_pat_stugum(false)==false) {
                        if (shax_sev_tagavor1==false)
                            game_end_showResult("Մատ Սեվերին");
                        else
                            game_end_showResult("ոչ_ոքի");
                    }
                }
                else {
                    if (mat_pat_stugum(true)==false) {
                        if (shax_spitak_tagavor1==false)
                            game_end_showResult("Մատ Սպիտակներին");
                        else
                            game_end_showResult("ոչ_ոքի");
                    }
                }
                break;
            case R.id.ramka_Navak_horizonakan_5:
                clickNavakRamka(4,false);
                if (imageClicked.charAt(1)=='p') {
                    shax_stugum(true);
                }
                else
                    shax_stugum(false);

                if (imageClicked.charAt(1)=='p') {
                    if (mat_pat_stugum(false)==false) {
                        if (shax_sev_tagavor1==false)
                            game_end_showResult("Մատ Սեվերին");
                        else
                            game_end_showResult("ոչ_ոքի");
                    }
                }
                else {
                    if (mat_pat_stugum(true)==false) {
                        if (shax_spitak_tagavor1==false)
                            game_end_showResult("Մատ Սպիտակներին");
                        else
                            game_end_showResult("ոչ_ոքի");
                    }
                }
                break;
            case R.id.ramka_Navak_horizonakan_6:
                clickNavakRamka(5,false);
                if (imageClicked.charAt(1)=='p') {
                    shax_stugum(true);
                }
                else
                    shax_stugum(false);

                if (imageClicked.charAt(1)=='p') {
                    if (mat_pat_stugum(false)==false) {
                        if (shax_sev_tagavor1==false)
                            game_end_showResult("Մատ Սեվերին");
                        else
                            game_end_showResult("ոչ_ոքի");
                    }
                }
                else {
                    if (mat_pat_stugum(true)==false) {
                        if (shax_spitak_tagavor1==false)
                            game_end_showResult("Մատ Սպիտակներին");
                        else
                            game_end_showResult("ոչ_ոքի");
                    }
                }
                break;
            case R.id.ramka_Navak_horizonakan_7:
                clickNavakRamka(6,false);
                if (imageClicked.charAt(1)=='p') {
                    shax_stugum(true);
                }
                else
                    shax_stugum(false);

                if (imageClicked.charAt(1)=='p') {
                    if (mat_pat_stugum(false)==false) {
                        if (shax_sev_tagavor1==false)
                            game_end_showResult("Մատ Սեվերին");
                        else
                            game_end_showResult("ոչ_ոքի");
                    }
                }
                else {
                    if (mat_pat_stugum(true)==false) {
                        if (shax_spitak_tagavor1==false)
                            game_end_showResult("Մատ Սպիտակներին");
                        else
                            game_end_showResult("ոչ_ոքի");
                    }
                }
                break;
            case R.id.ramka_Navak_horizonakan_8:
                clickNavakRamka(7,false);
                if (imageClicked.charAt(1)=='p') {
                    shax_stugum(true);
                }
                else
                    shax_stugum(false);

                if (imageClicked.charAt(1)=='p') {
                    if (mat_pat_stugum(false)==false) {
                        if (shax_sev_tagavor1==false)
                            game_end_showResult("Մատ Սեվերին");
                        else
                            game_end_showResult("ոչ_ոքի");
                    }
                }
                else {
                    if (mat_pat_stugum(true)==false) {
                        if (shax_spitak_tagavor1==false)
                            game_end_showResult("Մատ Սպիտակներին");
                        else
                            game_end_showResult("ոչ_ոքի");
                    }
                }
                break;

                //-----------------image_Ramka_Pix_Click--------------------------------------------
            case R.id.ramka_Pix_glxavor_1:
                clickPixRamka(0,false);
                if (imageClicked.charAt(1)=='p') {
                    shax_stugum(true);
                }
                else
                    shax_stugum(false);

                if (imageClicked.charAt(1)=='p') {
                    if (mat_pat_stugum(false)==false) {
                        if (shax_sev_tagavor1==false)
                            game_end_showResult("Մատ Սեվերին");
                        else
                            game_end_showResult("ոչ_ոքի");
                    }
                }
                else {
                    if (mat_pat_stugum(true)==false) {
                        if (shax_spitak_tagavor1==false)
                            game_end_showResult("Մատ Սպիտակներին");
                        else
                            game_end_showResult("ոչ_ոքի");
                    }
                }
                break;
            case R.id.ramka_Pix_glxavor_2:
                clickPixRamka(1,false);
                if (imageClicked.charAt(1)=='p') {
                    shax_stugum(true);
                }
                else
                    shax_stugum(false);

                if (imageClicked.charAt(1)=='p') {
                    if (mat_pat_stugum(false)==false) {
                        if (shax_sev_tagavor1==false)
                            game_end_showResult("Մատ Սեվերին");
                        else
                            game_end_showResult("ոչ_ոքի");
                    }
                }
                else {
                    if (mat_pat_stugum(true)==false) {
                        if (shax_spitak_tagavor1==false)
                            game_end_showResult("Մատ Սպիտակներին");
                        else
                            game_end_showResult("ոչ_ոքի");
                    }
                }
                break;
            case R.id.ramka_Pix_glxavor_3:
                clickPixRamka(2,false);
                if (imageClicked.charAt(1)=='p') {
                    shax_stugum(true);
                }
                else
                    shax_stugum(false);

                if (imageClicked.charAt(1)=='p') {
                    if (mat_pat_stugum(false)==false) {
                        if (shax_sev_tagavor1==false)
                            game_end_showResult("Մատ Սեվերին");
                        else
                            game_end_showResult("ոչ_ոքի");
                    }
                }
                else {
                    if (mat_pat_stugum(true)==false) {
                        if (shax_spitak_tagavor1==false)
                            game_end_showResult("Մատ Սպիտակներին");
                        else
                            game_end_showResult("ոչ_ոքի");
                    }
                }
                break;
            case R.id.ramka_Pix_glxavor_4:
                clickPixRamka(3,false);
                if (imageClicked.charAt(1)=='p') {
                    shax_stugum(true);
                }
                else
                    shax_stugum(false);

                if (imageClicked.charAt(1)=='p') {
                    if (mat_pat_stugum(false)==false) {
                        if (shax_sev_tagavor1==false)
                            game_end_showResult("Մատ Սեվերին");
                        else
                            game_end_showResult("ոչ_ոքի");
                    }
                }
                else {
                    if (mat_pat_stugum(true)==false) {
                        if (shax_spitak_tagavor1==false)
                            game_end_showResult("Մատ Սպիտակներին");
                        else
                            game_end_showResult("ոչ_ոքի");
                    }
                }
                break;
            case R.id.ramka_Pix_glxavor_5:
                clickPixRamka(4,false);
                if (imageClicked.charAt(1)=='p') {
                    shax_stugum(true);
                }
                else
                    shax_stugum(false);

                if (imageClicked.charAt(1)=='p') {
                    if (mat_pat_stugum(false)==false) {
                        if (shax_sev_tagavor1==false)
                            game_end_showResult("Մատ Սեվերին");
                        else
                            game_end_showResult("ոչ_ոքի");
                    }
                }
                else {
                    if (mat_pat_stugum(true)==false) {
                        if (shax_spitak_tagavor1==false)
                            game_end_showResult("Մատ Սպիտակներին");
                        else
                            game_end_showResult("ոչ_ոքի");
                    }
                }
                break;
            case R.id.ramka_Pix_glxavor_6:
                clickPixRamka(5,false);
                if (imageClicked.charAt(1)=='p') {
                    shax_stugum(true);
                }
                else
                    shax_stugum(false);

                if (imageClicked.charAt(1)=='p') {
                    if (mat_pat_stugum(false)==false) {
                        if (shax_sev_tagavor1==false)
                            game_end_showResult("Մատ Սեվերին");
                        else
                            game_end_showResult("ոչ_ոքի");
                    }
                }
                else {
                    if (mat_pat_stugum(true)==false) {
                        if (shax_spitak_tagavor1==false)
                            game_end_showResult("Մատ Սպիտակներին");
                        else
                            game_end_showResult("ոչ_ոքի");
                    }
                }
                break;
            case R.id.ramka_Pix_glxavor_7:
                clickPixRamka(6,false);
                if (imageClicked.charAt(1)=='p') {
                    shax_stugum(true);
                }
                else
                    shax_stugum(false);

                if (imageClicked.charAt(1)=='p') {
                    if (mat_pat_stugum(false)==false) {
                        if (shax_sev_tagavor1==false)
                            game_end_showResult("Մատ Սեվերին");
                        else
                            game_end_showResult("ոչ_ոքի");
                    }
                }
                else {
                    if (mat_pat_stugum(true)==false) {
                        if (shax_spitak_tagavor1==false)
                            game_end_showResult("Մատ Սպիտակներին");
                        else
                            game_end_showResult("ոչ_ոքի");
                    }
                }
                break;
            case R.id.ramka_Pix_glxavor_8:
                clickPixRamka(7,false);
                if (imageClicked.charAt(1)=='p') {
                    shax_stugum(true);
                }
                else
                    shax_stugum(false);

                if (imageClicked.charAt(1)=='p') {
                    if (mat_pat_stugum(false)==false) {
                        if (shax_sev_tagavor1==false)
                            game_end_showResult("Մատ Սեվերին");
                        else
                            game_end_showResult("ոչ_ոքի");
                    }
                }
                else {
                    if (mat_pat_stugum(true)==false) {
                        if (shax_spitak_tagavor1==false)
                            game_end_showResult("Մատ Սպիտակներին");
                        else
                            game_end_showResult("ոչ_ոքի");
                    }
                }
                break;

            case R.id.ramka_Pix_ojandak_1:
                clickPixRamka(0,true);
                if (imageClicked.charAt(1)=='p') {
                    shax_stugum(true);
                }
                else
                    shax_stugum(false);

                if (imageClicked.charAt(1)=='p') {
                    if (mat_pat_stugum(false)==false) {
                        if (shax_sev_tagavor1==false)
                            game_end_showResult("Մատ Սեվերին");
                        else
                            game_end_showResult("ոչ_ոքի");
                    }
                }
                else {
                    if (mat_pat_stugum(true)==false) {
                        if (shax_spitak_tagavor1==false)
                            game_end_showResult("Մատ Սպիտակներին");
                        else
                            game_end_showResult("ոչ_ոքի");
                    }
                }
                break;
            case R.id.ramka_Pix_ojandak_2:
                clickPixRamka(1,true);
                if (imageClicked.charAt(1)=='p') {
                    shax_stugum(true);
                }
                else
                    shax_stugum(false);

                if (imageClicked.charAt(1)=='p') {
                    if (mat_pat_stugum(false)==false) {
                        if (shax_sev_tagavor1==false)
                            game_end_showResult("Մատ Սեվերին");
                        else
                            game_end_showResult("ոչ_ոքի");
                    }
                }
                else {
                    if (mat_pat_stugum(true)==false) {
                        if (shax_spitak_tagavor1==false)
                            game_end_showResult("Մատ Սպիտակներին");
                        else
                            game_end_showResult("ոչ_ոքի");
                    }
                }
                break;
            case R.id.ramka_Pix_ojandak_3:
                clickPixRamka(2,true);
                if (imageClicked.charAt(1)=='p') {
                    shax_stugum(true);
                }
                else
                    shax_stugum(false);

                if (imageClicked.charAt(1)=='p') {
                    if (mat_pat_stugum(false)==false) {
                        if (shax_sev_tagavor1==false)
                            game_end_showResult("Մատ Սեվերին");
                        else
                            game_end_showResult("ոչ_ոքի");
                    }
                }
                else {
                    if (mat_pat_stugum(true)==false) {
                        if (shax_spitak_tagavor1==false)
                            game_end_showResult("Մատ Սպիտակներին");
                        else
                            game_end_showResult("ոչ_ոքի");
                    }
                }
                break;
            case R.id.ramka_Pix_ojandak_4:
                clickPixRamka(3,true);
                if (imageClicked.charAt(1)=='p') {
                    shax_stugum(true);
                }
                else
                    shax_stugum(false);

                if (imageClicked.charAt(1)=='p') {
                    if (mat_pat_stugum(false)==false) {
                        if (shax_sev_tagavor1==false)
                            game_end_showResult("Մատ Սեվերին");
                        else
                            game_end_showResult("ոչ_ոքի");
                    }
                }
                else {
                    if (mat_pat_stugum(true)==false) {
                        if (shax_spitak_tagavor1==false)
                            game_end_showResult("Մատ Սպիտակներին");
                        else
                            game_end_showResult("ոչ_ոքի");
                    }
                }
                break;
            case R.id.ramka_Pix_ojandak_5:
                clickPixRamka(4,true);
                if (imageClicked.charAt(1)=='p') {
                    shax_stugum(true);
                }
                else
                    shax_stugum(false);

                if (imageClicked.charAt(1)=='p') {
                    if (mat_pat_stugum(false)==false) {
                        if (shax_sev_tagavor1==false)
                            game_end_showResult("Մատ Սեվերին");
                        else
                            game_end_showResult("ոչ_ոքի");
                    }
                }
                else {
                    if (mat_pat_stugum(true)==false) {
                        if (shax_spitak_tagavor1==false)
                            game_end_showResult("Մատ Սպիտակներին");
                        else
                            game_end_showResult("ոչ_ոքի");
                    }
                }
                break;
            case R.id.ramka_Pix_ojandak_6:
                clickPixRamka(5,true);
                if (imageClicked.charAt(1)=='p') {
                    shax_stugum(true);
                }
                else
                    shax_stugum(false);

                if (imageClicked.charAt(1)=='p') {
                    if (mat_pat_stugum(false)==false) {
                        if (shax_sev_tagavor1==false)
                            game_end_showResult("Մատ Սեվերին");
                        else
                            game_end_showResult("ոչ_ոքի");
                    }
                }
                else {
                    if (mat_pat_stugum(true)==false) {
                        if (shax_spitak_tagavor1==false)
                            game_end_showResult("Մատ Սպիտակներին");
                        else
                            game_end_showResult("ոչ_ոքի");
                    }
                }
                break;
            case R.id.ramka_Pix_ojandak_7:
                clickPixRamka(6,true);
                if (imageClicked.charAt(1)=='p') {
                    shax_stugum(true);
                }
                else
                    shax_stugum(false);

                if (imageClicked.charAt(1)=='p') {
                    if (mat_pat_stugum(false)==false) {
                        if (shax_sev_tagavor1==false)
                            game_end_showResult("Մատ Սեվերին");
                        else
                            game_end_showResult("ոչ_ոքի");
                    }
                }
                else {
                    if (mat_pat_stugum(true)==false) {
                        if (shax_spitak_tagavor1==false)
                            game_end_showResult("Մատ Սպիտակներին");
                        else
                            game_end_showResult("ոչ_ոքի");
                    }
                }
                break;
            case R.id.ramka_Pix_ojandak_8:
                clickPixRamka(7,true);
                if (imageClicked.charAt(1)=='p') {
                    shax_stugum(true);
                }
                else
                    shax_stugum(false);

                if (imageClicked.charAt(1)=='p') {
                    if (mat_pat_stugum(false)==false) {
                        if (shax_sev_tagavor1==false)
                            game_end_showResult("Մատ Սեվերին");
                        else
                            game_end_showResult("ոչ_ոքի");
                    }
                }
                else {
                    if (mat_pat_stugum(true)==false) {
                        if (shax_spitak_tagavor1==false)
                            game_end_showResult("Մատ Սպիտակներին");
                        else
                            game_end_showResult("ոչ_ոքի");
                    }
                }
                break;

                //----------image_ramka_dzi_click----------------------------------------------------------------
            case R.id.ramka_Dzi_1:
                clickDziRamka(imageRamkaDzi_1,oponentDziString_1);
                if (imageClicked.charAt(1)=='p') {
                    shax_stugum(true);
                }
                else
                    shax_stugum(false);

                if (imageClicked.charAt(1)=='p') {
                    if (mat_pat_stugum(false)==false) {
                        if (shax_sev_tagavor1==false)
                            game_end_showResult("Մատ Սեվերին");
                        else
                            game_end_showResult("ոչ_ոքի");
                    }
                }
                else {
                    if (mat_pat_stugum(true)==false) {
                        if (shax_spitak_tagavor1==false)
                            game_end_showResult("Մատ Սպիտակներին");
                        else
                            game_end_showResult("ոչ_ոքի");
                    }
                }
                break;
            case R.id.ramka_Dzi_2:
                clickDziRamka(imageRamkaDzi_2,oponentDziString_2);
                if (imageClicked.charAt(1)=='p') {
                    shax_stugum(true);
                }
                else
                    shax_stugum(false);

                if (imageClicked.charAt(1)=='p') {
                    if (mat_pat_stugum(false)==false) {
                        if (shax_sev_tagavor1==false)
                            game_end_showResult("Մատ Սեվերին");
                        else
                            game_end_showResult("ոչ_ոքի");
                    }
                }
                else {
                    if (mat_pat_stugum(true)==false) {
                        if (shax_spitak_tagavor1==false)
                            game_end_showResult("Մատ Սպիտակներին");
                        else
                            game_end_showResult("ոչ_ոքի");
                    }
                }
                break;
            case R.id.ramka_Dzi_3:
                clickDziRamka(imageRamkaDzi_3,oponentDziString_3);
                if (imageClicked.charAt(1)=='p') {
                    shax_stugum(true);
                }
                else
                    shax_stugum(false);

                if (imageClicked.charAt(1)=='p') {
                    if (mat_pat_stugum(false)==false) {
                        if (shax_sev_tagavor1==false)
                            game_end_showResult("Մատ Սեվերին");
                        else
                            game_end_showResult("ոչ_ոքի");
                    }
                }
                else {
                    if (mat_pat_stugum(true)==false) {
                        if (shax_spitak_tagavor1==false)
                            game_end_showResult("Մատ Սպիտակներին");
                        else
                            game_end_showResult("ոչ_ոքի");
                    }
                }
                break;
            case R.id.ramka_Dzi_4:
                clickDziRamka(imageRamkaDzi_4,oponentDziString_4);
                if (imageClicked.charAt(1)=='p') {
                    shax_stugum(true);
                }
                else
                    shax_stugum(false);

                if (imageClicked.charAt(1)=='p') {
                    if (mat_pat_stugum(false)==false) {
                        if (shax_sev_tagavor1==false)
                            game_end_showResult("Մատ Սեվերին");
                        else
                            game_end_showResult("ոչ_ոքի");
                    }
                }
                else {
                    if (mat_pat_stugum(true)==false) {
                        if (shax_spitak_tagavor1==false)
                            game_end_showResult("Մատ Սպիտակներին");
                        else
                            game_end_showResult("ոչ_ոքի");
                    }
                }
                break;
            case R.id.ramka_Dzi_5:
                clickDziRamka(imageRamkaDzi_5,oponentDziString_5);
                if (imageClicked.charAt(1)=='p') {
                    shax_stugum(true);
                }
                else
                    shax_stugum(false);

                if (imageClicked.charAt(1)=='p') {
                    if (mat_pat_stugum(false)==false) {
                        if (shax_sev_tagavor1==false)
                            game_end_showResult("Մատ Սեվերին");
                        else
                            game_end_showResult("ոչ_ոքի");
                    }
                }
                else {
                    if (mat_pat_stugum(true)==false) {
                        if (shax_spitak_tagavor1==false)
                            game_end_showResult("Մատ Սպիտակներին");
                        else
                            game_end_showResult("ոչ_ոքի");
                    }
                }
                break;
            case R.id.ramka_Dzi_6:
                clickDziRamka(imageRamkaDzi_6,oponentDziString_6);
                if (imageClicked.charAt(1)=='p') {
                    shax_stugum(true);
                }
                else
                    shax_stugum(false);

                if (imageClicked.charAt(1)=='p') {
                    if (mat_pat_stugum(false)==false) {
                        if (shax_sev_tagavor1==false)
                            game_end_showResult("Մատ Սեվերին");
                        else
                            game_end_showResult("ոչ_ոքի");
                    }
                }
                else {
                    if (mat_pat_stugum(true)==false) {
                        if (shax_spitak_tagavor1==false)
                            game_end_showResult("Մատ Սպիտակներին");
                        else
                            game_end_showResult("ոչ_ոքի");
                    }
                }
                break;
            case R.id.ramka_Dzi_7:
                clickDziRamka(imageRamkaDzi_7,oponentDziString_7);
                if (imageClicked.charAt(1)=='p') {
                    shax_stugum(true);
                }
                else
                    shax_stugum(false);

                if (imageClicked.charAt(1)=='p') {
                    if (mat_pat_stugum(false)==false) {
                        if (shax_sev_tagavor1==false)
                            game_end_showResult("Մատ Սեվերին");
                        else
                            game_end_showResult("ոչ_ոքի");
                    }
                }
                else {
                    if (mat_pat_stugum(true)==false) {
                        if (shax_spitak_tagavor1==false)
                            game_end_showResult("Մատ Սպիտակներին");
                        else
                            game_end_showResult("ոչ_ոքի");
                    }
                }
                break;
            case R.id.ramka_Dzi_8:
                clickDziRamka(imageRamkaDzi_8,oponentDziString_8);
                if (imageClicked.charAt(1)=='p') {
                    shax_stugum(true);
                }
                else
                    shax_stugum(false);

                if (imageClicked.charAt(1)=='p') {
                    if (mat_pat_stugum(false)==false) {
                        if (shax_sev_tagavor1==false)
                            game_end_showResult("Մատ Սեվերին");
                        else
                            game_end_showResult("ոչ_ոքի");
                    }
                }
                else {
                    if (mat_pat_stugum(true)==false) {
                        if (shax_spitak_tagavor1==false)
                            game_end_showResult("Մատ Սպիտակներին");
                        else
                            game_end_showResult("ոչ_ոքի");
                    }
                }
                break;

                //----------tagavor_ramka_click----------------------------------------------------------------------
            case R.id.ramka_Tagavor_1:
                clickTagavorRamka(imageRamkaTagavor_1,oponentTagavorString_1);
                if (imageClicked.charAt(1)=='p') {
                    shax_stugum(true);
                }
                else
                    shax_stugum(false);

                if (imageClicked.charAt(1)=='p') {
                    if (mat_pat_stugum(false)==false) {
                        if (shax_sev_tagavor1==false)
                            game_end_showResult("Մատ Սեվերին");
                        else
                            game_end_showResult("ոչ_ոքի");
                    }
                }
                else {
                    if (mat_pat_stugum(true)==false) {
                        if (shax_spitak_tagavor1==false)
                            game_end_showResult("Մատ Սպիտակներին");
                        else
                            game_end_showResult("ոչ_ոքի");
                    }
                }
                break;
            case R.id.ramka_Tagavor_2:
                clickTagavorRamka(imageRamkaTagavor_2,oponentTagavorString_2);
                if (imageClicked.charAt(1)=='p') {
                    shax_stugum(true);
                }
                else
                    shax_stugum(false);

                if (imageClicked.charAt(1)=='p') {
                    if (mat_pat_stugum(false)==false) {
                        if (shax_sev_tagavor1==false)
                            game_end_showResult("Մատ Սեվերին");
                        else
                            game_end_showResult("ոչ_ոքի");
                    }
                }
                else {
                    if (mat_pat_stugum(true)==false) {
                        if (shax_spitak_tagavor1==false)
                            game_end_showResult("Մատ Սպիտակներին");
                        else
                            game_end_showResult("ոչ_ոքի");
                    }
                }
                break;
            case R.id.ramka_Tagavor_3:
                clickTagavorRamka(imageRamkaTagavor_3,oponentTagavorString_3);
                if (imageClicked.charAt(1)=='p') {
                    shax_stugum(true);
                }
                else
                    shax_stugum(false);

                if (imageClicked.charAt(1)=='p') {
                    if (mat_pat_stugum(false)==false) {
                        if (shax_sev_tagavor1==false)
                            game_end_showResult("Մատ Սեվերին");
                        else
                            game_end_showResult("ոչ_ոքի");
                    }
                }
                else {
                    if (mat_pat_stugum(true)==false) {
                        if (shax_spitak_tagavor1==false)
                            game_end_showResult("Մատ Սպիտակներին");
                        else
                            game_end_showResult("ոչ_ոքի");
                    }
                }
                break;
            case R.id.ramka_Tagavor_4:
                clickTagavorRamka(imageRamkaTagavor_4,oponentTagavorString_4);
                if (imageClicked.charAt(1)=='p') {
                    shax_stugum(true);
                }
                else
                    shax_stugum(false);

                if (imageClicked.charAt(1)=='p') {
                    if (mat_pat_stugum(false)==false) {
                        if (shax_sev_tagavor1==false)
                            game_end_showResult("Մատ Սեվերին");
                        else
                            game_end_showResult("ոչ_ոքի");
                    }
                }
                else {
                    if (mat_pat_stugum(true)==false) {
                        if (shax_spitak_tagavor1==false)
                            game_end_showResult("Մատ Սպիտակներին");
                        else
                            game_end_showResult("ոչ_ոքի");
                    }
                }
                break;
            case R.id.ramka_Tagavor_5:
                clickTagavorRamka(imageRamkaTagavor_5,oponentTagavorString_5);
                if (imageClicked.charAt(1)=='p') {
                    shax_stugum(true);
                }
                else
                    shax_stugum(false);

                if (imageClicked.charAt(1)=='p') {
                    if (mat_pat_stugum(false)==false) {
                        if (shax_sev_tagavor1==false)
                            game_end_showResult("Մատ Սեվերին");
                        else
                            game_end_showResult("ոչ_ոքի");
                    }
                }
                else {
                    if (mat_pat_stugum(true)==false) {
                        if (shax_spitak_tagavor1==false)
                            game_end_showResult("Մատ Սպիտակներին");
                        else
                            game_end_showResult("ոչ_ոքի");
                    }
                }
                break;
            case R.id.ramka_Tagavor_6:
                clickTagavorRamka(imageRamkaTagavor_6,oponentTagavorString_6);
                if (imageClicked.charAt(1)=='p') {
                    shax_stugum(true);
                }
                else
                    shax_stugum(false);

                if (imageClicked.charAt(1)=='p') {
                    if (mat_pat_stugum(false)==false) {
                        if (shax_sev_tagavor1==false)
                            game_end_showResult("Մատ Սեվերին");
                        else
                            game_end_showResult("ոչ_ոքի");
                    }
                }
                else {
                    if (mat_pat_stugum(true)==false) {
                        if (shax_spitak_tagavor1==false)
                            game_end_showResult("Մատ Սպիտակներին");
                        else
                            game_end_showResult("ոչ_ոքի");
                    }
                }
                break;
            case R.id.ramka_Tagavor_7:
                clickTagavorRamka(imageRamkaTagavor_7,oponentTagavorString_7);
                if (imageClicked.charAt(1)=='p') {
                    shax_stugum(true);
                }
                else
                    shax_stugum(false);

                if (imageClicked.charAt(1)=='p') {
                    if (mat_pat_stugum(false)==false) {
                        if (shax_sev_tagavor1==false)
                            game_end_showResult("Մատ Սեվերին");
                        else
                            game_end_showResult("ոչ_ոքի");
                    }
                }
                else {
                    if (mat_pat_stugum(true)==false) {
                        if (shax_spitak_tagavor1==false)
                            game_end_showResult("Մատ Սպիտակներին");
                        else
                            game_end_showResult("ոչ_ոքի");
                    }
                }
                break;
            case R.id.ramka_Tagavor_8:
                clickTagavorRamka(imageRamkaTagavor_8,oponentTagavorString_8);
                if (imageClicked.charAt(1)=='p') {
                    shax_stugum(true);
                }
                else
                    shax_stugum(false);

                if (imageClicked.charAt(1)=='p') {
                    if (mat_pat_stugum(false)==false) {
                        if (shax_sev_tagavor1==false)
                            game_end_showResult("Մատ Սեվերին");
                        else
                            game_end_showResult("ոչ_ոքի");
                    }
                }
                else {
                    if (mat_pat_stugum(true)==false) {
                        if (shax_spitak_tagavor1==false)
                            game_end_showResult("Մատ Սպիտակներին");
                        else
                            game_end_showResult("ոչ_ոքի");
                    }
                }
                break;
            case R.id.ramka_Tagavor_9:
                clickTagavorRamka(imageRamkaTagavor_9,"r1");
                if (imageClicked.charAt(1)=='p') {
                    shax_stugum(true);
                }
                else
                    shax_stugum(false);

                if (imageClicked.charAt(1)=='p') {
                    if (mat_pat_stugum(false)==false) {
                        if (shax_sev_tagavor1==false)
                            game_end_showResult("Մատ Սեվերին");
                        else
                            game_end_showResult("ոչ_ոքի");
                    }
                }
                else {
                    if (mat_pat_stugum(true)==false) {
                        if (shax_spitak_tagavor1==false)
                            game_end_showResult("Մատ Սպիտակներին");
                        else
                            game_end_showResult("ոչ_ոքի");
                    }
                }
                break;
            case R.id.ramka_Tagavor_10:
                clickTagavorRamka(imageRamkaTagavor_10,"r2");
                if (imageClicked.charAt(1)=='p') {
                    shax_stugum(true);
                }
                else
                    shax_stugum(false);

                if (imageClicked.charAt(1)=='p') {
                    if (mat_pat_stugum(false)==false) {
                        if (shax_sev_tagavor1==false)
                            game_end_showResult("Մատ Սեվերին");
                        else
                            game_end_showResult("ոչ_ոքի");
                    }
                }
                else {
                    if (mat_pat_stugum(true)==false) {
                        if (shax_spitak_tagavor1==false)
                            game_end_showResult("Մատ Սպիտակներին");
                        else
                            game_end_showResult("ոչ_ոքի");
                    }
                }
                break;
        }
     }

     //-------------------Jamanak-------------------------------------------------------------------------------
     public void someMethod() {

         if (imageClickedColor == true && time_continue==true) {
             if (count_spitak_time<120) {
                 textViev_Clock_spitak.setTextColor(Color.parseColor("#ff0000"));
             }
             if (count_spitak_time > 0 ) {
                 count_spitak_time--;
                 time_spitak = "";

                 if (count_spitak_time / 60 >= 10)
                     time_spitak  += String.valueOf(count_spitak_time / 60) + " : ";
                 else
                     time_spitak  += "0" + String.valueOf(count_spitak_time / 60) + " : ";

                 if (count_spitak_time % 60 >= 10) {
                     time_spitak  += String.valueOf(count_spitak_time % 60);
                 } else {
                     time_spitak  += "0" + String.valueOf(count_spitak_time % 60);
                 }
                 textViev_Clock_spitak.setText("" + time_spitak );
             }
             if (count_spitak_time==0) {
                 time_continue=false;
                 game_end_showResult("Հաղթեցին Սևերը");
             }
         } else if (imageClickedColor == false && time_continue==true){

             if (count_sev_time<120) {
                 textView_Clock_sev.setTextColor(Color.parseColor("#ff0000"));
             }

             if (count_sev_time > 0) {
                 count_sev_time--;

                 time_sev = "";

                 if (count_sev_time / 60 >= 10)
                     time_sev += String.valueOf(count_sev_time / 60) + " : ";
                 else
                     time_sev += "0" + String.valueOf(count_sev_time / 60) + " : ";

                 if (count_sev_time % 60 >= 10) {
                     time_sev += String.valueOf(count_sev_time % 60);
                 } else {
                     time_sev += "0" + String.valueOf(count_sev_time % 60);
                 }

                 textView_Clock_sev.setText("" + time_sev);
             }
             if (count_sev_time==0) {
                 time_continue=false;
                 game_end_showResult("Հաղթեցին Սպիտակները");
             }
         }
         handler.sendEmptyMessageDelayed(0, 1000);
     }

     @Override
     protected void onDestroy() {
         if (handler!=null)
             handler.removeCallbacksAndMessages(null);
         super.onDestroy();

     }

     static class MyHandler extends Handler {

         WeakReference<Game> wrActivity;

         public MyHandler(Game activity) {
             wrActivity=new WeakReference<Game>(activity);
         }

         @Override
         public void handleMessage(Message msg) {
             super.handleMessage(msg);
             Game activity=wrActivity.get();
             if (activity!=null)
                 activity.someMethod();
         }
     }

     //---------------------metod zinvor-i click-i----------------------------------------------------------
     private void zinvorClick(ImageView imgView, int leftMargin, int topMargin, String imageName,
                                        int leftStart, int topStart, boolean sev_spitak) {

         if (clickedRamka1.equals("1")) {
             imageRamka1.setVisibility(View.GONE);
             clickedRamka1="";
         }
         if (clickedRamka2.equals("1")) {
             imageRamka2.setVisibility(View.GONE);
             clickedRamka2="";
         }
         if (clickedRamka3.equals("1")) {
             imageRamka3.setVisibility(View.GONE);
             clickedRamka3="";
         }
         if (clickedRamka4.equals("1")) {
             imageRamka4.setVisibility(View.GONE);
             clickedRamka4="";
         }
         if (clickedRamka5.equals("1")) {
             imageRamka5.setVisibility(View.GONE);
             clickedRamka5="";
         }
         if (clickedRamka6.equals("1")) {
             imageRamka6.setVisibility(View.GONE);
             clickedRamka6="";
         }

         if (clickedRamkaDzi_1.equals("1")) {
             imageRamkaDzi_1.setVisibility(View.GONE);
             clickedRamkaDzi_1="";
         }
         if (clickedRamkaDzi_2.equals("1")) {
             imageRamkaDzi_2.setVisibility(View.GONE);
             clickedRamkaDzi_2="";
         }
         if (clickedRamkaDzi_3.equals("1")) {
             imageRamkaDzi_3.setVisibility(View.GONE);
             clickedRamkaDzi_3="";
         }
         if (clickedRamkaDzi_4.equals("1")) {
             imageRamkaDzi_4.setVisibility(View.GONE);
             clickedRamkaDzi_4="";
         }
         if (clickedRamkaDzi_5.equals("1")) {
             imageRamkaDzi_5.setVisibility(View.GONE);
             clickedRamkaDzi_5="";
         }
         if (clickedRamkaDzi_6.equals("1")) {
             imageRamkaDzi_6.setVisibility(View.GONE);
             clickedRamkaDzi_6="";
         }
         if (clickedRamkaDzi_7.equals("1")) {
             imageRamkaDzi_7.setVisibility(View.GONE);
             clickedRamkaDzi_7="";
         }
         if (clickedRamkaDzi_8.equals("1")) {
             imageRamkaDzi_8.setVisibility(View.GONE);
             clickedRamkaDzi_8="";
         }

         if (clickedRamkaTagavor_1.equals("1")) {
             imageRamkaTagavor_1.setVisibility(View.GONE);
             clickedRamkaTagavor_1="";
         }
         if (clickedRamkaTagavor_2.equals("1")) {
             imageRamkaTagavor_2.setVisibility(View.GONE);
             clickedRamkaTagavor_2="";
         }
         if (clickedRamkaTagavor_3.equals("1")) {
             imageRamkaTagavor_3.setVisibility(View.GONE);
             clickedRamkaTagavor_3="";
         }
         if (clickedRamkaTagavor_4.equals("1")) {
             imageRamkaTagavor_4.setVisibility(View.GONE);
             clickedRamkaTagavor_4="";
         }
         if (clickedRamkaTagavor_5.equals("1")) {
             imageRamkaTagavor_5.setVisibility(View.GONE);
             clickedRamkaTagavor_5="";
         }
         if (clickedRamkaTagavor_6.equals("1")) {
             imageRamkaTagavor_6.setVisibility(View.GONE);
             clickedRamkaTagavor_6="";
         }
         if (clickedRamkaTagavor_7.equals("1")) {
             imageRamkaTagavor_7.setVisibility(View.GONE);
             clickedRamkaTagavor_7="";
         }
         if (clickedRamkaTagavor_8.equals("1")) {
             imageRamkaTagavor_8.setVisibility(View.GONE);
             clickedRamkaTagavor_8="";
         }
         if (clickedRamkaTagavor_9.equals("1")) {
             imageRamkaTagavor_9.setVisibility(View.GONE);
             clickedRamkaTagavor_9="";
         }
         if (clickedRamkaTagavor_10.equals("1")) {
             imageRamkaTagavor_10.setVisibility(View.GONE);
             clickedRamkaTagavor_10="";
         }

         for (int i = 0; i < 8; i++) {
             if (clickedRamkaNavah_horizonakan[i].equals("1")) {
                 imageRamkaNavak_horizonakan[i].setVisibility(View.GONE);
                 clickedRamkaNavah_horizonakan[i] = "";
             }
             if (clickedRamkaNavah_uxxahayac[i].equals("1")) {
                 imageRamkaNavak_uxxahayac[i].setVisibility(View.GONE);
                 clickedRamkaNavah_uxxahayac[i] = "";
             }
             if (clickedRamkaPix_glxavor[i].equals("1")) {
                 imageRamkaPix_glxavor[i].setVisibility(View.GONE);
                 clickedRamkaPix_glxavor[i]="";
             }
             if (clicedRamkaPix_ojandak[i].equals("1")) {
                 imageRamkaPix_ojandak[i].setVisibility(View.GONE);
                 clicedRamkaPix_ojandak[i]="";
             }
         }

         for (int i=0; i<8; i++) {
             for (int j=0; j<8; j++) {
                 if (matrixBord[i][j].equals(imageName)) {
                     view_i=i;
                     view_j=j;
                 }
             }
         }

         boolean is_shax=true;

         if (sev_spitak) {
             ramka_1_i = view_i - 1;
             ramka_1_j = view_j;
             ramka_2_i = view_i - 2;
             ramka_2_j = view_j;
             ramka_3_i = view_i - 1;
             ramka_3_j = view_j - 1;
             ramka_4_i = view_i - 1;
             ramka_4_j = view_j + 1;
             ramka_5_i=view_i-1;
             ramka_5_j=view_j-1;
             ramka_6_i=view_i-1;
             ramka_6_j=view_j+1;

         if (ramka_1_i>=0) {

             is_shax=shax_spitak_tagavor_stugum(ramka_1_i,ramka_1_j,imageName,true);

             if (matrixBord[ramka_1_i][ramka_1_j].equals("datark") && is_shax==true) {
                 imageRamka1 = new ImageView(this);
                 imageRamka1.setImageResource(R.drawable.ramka);
                 params_images = new RelativeLayout.LayoutParams(widthLayoutMatrix / 8, widthLayoutMatrix / 8);
                 params_images.setMargins(leftMargin - 10,
                         topMargin - 10 - widthLayoutMatrix / 8, 0, 0);
                 rLayout.addView(imageRamka1, params_images);
                 imageClicked = imageName;
                 clickedRamka1 = "1";
                 imageRamka1.setId(R.id.idRamka1);
                 imageRamka1.setOnClickListener(this);
             }
         }

         if (ramka_2_i>=0) {
             is_shax=shax_spitak_tagavor_stugum(ramka_2_i,ramka_2_j,imageName,true);

             if (matrixBord[ramka_2_i][ramka_2_j].equals("datark") && matrixBord[ramka_1_i][ramka_1_j].equals("datark")
                     && leftMargin == leftStart && topMargin == topStart && is_shax==true) {

                 imageRamka2 = new ImageView(this);
                 imageRamka2.setImageResource(R.drawable.ramka);
                 params_images = new RelativeLayout.LayoutParams(widthLayoutMatrix / 8, widthLayoutMatrix / 8);
                 params_images.setMargins(leftMargin - 10,
                         topMargin - 10 - widthLayoutMatrix / 4, 0, 0);
                 rLayout.addView(imageRamka2, params_images);
                 imageClicked = imageName;
                 clickedRamka2 = "1";
                 imageRamka2.setId(R.id.idRamka2);
                 imageRamka2.setOnClickListener(this);
             }
         }

         if (ramka_3_i>=0 && ramka_3_j>=0) {
             is_shax=shax_spitak_tagavor_stugum(ramka_3_i,ramka_3_j,imageName,true);

             if (matrixBord[ramka_3_i][ramka_3_j].charAt(1) == 'e' && is_shax==true) {

                 imageRamka3 = new ImageView(this);
                 imageRamka3.setImageResource(R.drawable.ramka);
                 params_images = new RelativeLayout.LayoutParams(widthLayoutMatrix / 8, widthLayoutMatrix / 8);
                 params_images.setMargins(leftMargin - 10-widthLayoutMatrix/8,
                         topMargin - 10 - widthLayoutMatrix / 8, 0, 0);
                 rLayout.addView(imageRamka3, params_images);
                 imageClicked = imageName;
                 clickedRamka3 = "1";
                 imageRamka3.setId(R.id.idRamka3);
                 imageRamka3.setOnClickListener(this);
             }
         }

         if (ramka_4_i>=0 && ramka_4_j<=7) {
             is_shax=shax_spitak_tagavor_stugum(ramka_4_i,ramka_4_j,imageName,true);

             if (matrixBord[ramka_4_i][ramka_4_j].charAt(1) == 'e' && is_shax==true) {

                 imageRamka4 = new ImageView(this);
                 imageRamka4.setImageResource(R.drawable.ramka);
                 params_images = new RelativeLayout.LayoutParams(widthLayoutMatrix / 8, widthLayoutMatrix / 8);
                 params_images.setMargins(leftMargin - 10+widthLayoutMatrix/8,
                         topMargin - 10 - widthLayoutMatrix / 8, 0, 0);
                 rLayout.addView(imageRamka4, params_images);
                 imageClicked = imageName;
                 clickedRamka4 = "1";
                 imageRamka4.setId(R.id.idRamka4);
                 imageRamka4.setOnClickListener(this);
             }
         }

         if (view_i==3 && ramka_5_j>=0 && matrixBord[view_i][ramka_5_j].equals(zinvorClickRAmka2_num))  {

             is_shax=shax_spitak_tagavor_stugum(view_i-1,ramka_5_j,imageName,false);

             if (is_shax==true) {
                 imageRamka5 = new ImageView(this);
                 imageRamka5.setImageResource(R.drawable.ramka);
                 params_images = new RelativeLayout.LayoutParams(widthLayoutMatrix / 8, widthLayoutMatrix / 8);
                 params_images.setMargins(leftMargin - 10 - widthLayoutMatrix / 8,
                         topMargin - 10 - widthLayoutMatrix / 8, 0, 0);
                 rLayout.addView(imageRamka5, params_images);
                 imageClicked = imageName;
                 clickedRamka5 = "1";
                 imageRamka5.setId(R.id.idRamka5);
                 imageRamka5.setOnClickListener(this);
             }

         }

             if (view_i==3 && ramka_6_j<=7 && matrixBord[view_i][ramka_6_j].equals(zinvorClickRAmka2_num))  {

                 is_shax=shax_spitak_tagavor_stugum(view_i-1,ramka_6_j,imageName,false);

                 if (is_shax==true) {
                     imageRamka6 = new ImageView(this);
                     imageRamka6.setImageResource(R.drawable.ramka);
                     params_images = new RelativeLayout.LayoutParams(widthLayoutMatrix / 8, widthLayoutMatrix / 8);
                     params_images.setMargins(leftMargin - 10 + widthLayoutMatrix / 8,
                             topMargin - 10 - widthLayoutMatrix / 8, 0, 0);
                     rLayout.addView(imageRamka6, params_images);
                     imageClicked = imageName;
                     clickedRamka6 = "1";
                     imageRamka6.setId(R.id.idRamka6);
                     imageRamka6.setOnClickListener(this);
                 }
             }
         }
         else {

             ramka_1_i=view_i+1;
             ramka_1_j=view_j;
             ramka_2_i=view_i+2;
             ramka_2_j=view_j;
             ramka_3_i=view_i+1;
             ramka_3_j=view_j-1;
             ramka_4_i=view_i+1;
             ramka_4_j=view_j+1;
             ramka_5_i=view_i+1;
             ramka_5_j=view_j-1;
             ramka_6_i=view_i+1;
             ramka_6_j=view_j+1;

             if (ramka_1_i<=7) {
                 is_shax=shax_sev_tagavor_stugum(ramka_1_i,ramka_1_j,imageName,true);

                 if (matrixBord[ramka_1_i][ramka_1_j].equals("datark") && is_shax==true) {
                     imageRamka1 = new ImageView(this);
                     imageRamka1.setImageResource(R.drawable.ramka);
                     params_images = new RelativeLayout.LayoutParams(widthLayoutMatrix / 8, widthLayoutMatrix / 8);
                     params_images.setMargins(leftMargin - 10,
                             topMargin - 10 + widthLayoutMatrix / 8, 0, 0);
                     rLayout.addView(imageRamka1, params_images);
                     imageClicked = imageName;
                     clickedRamka1 = "1";
                     imageRamka1.setId(R.id.idRamka1);
                     imageRamka1.setOnClickListener(this);
                 }
             }

             if (ramka_2_i<=7) {
                 is_shax=shax_sev_tagavor_stugum(ramka_2_i,ramka_2_j,imageName,true);

                 if (matrixBord[ramka_2_i][ramka_2_j].equals("datark") && matrixBord[ramka_1_i][ramka_1_j].equals("datark")
                         && leftMargin == leftStart && topMargin == topStart && is_shax==true) {

                     imageRamka2 = new ImageView(this);
                     imageRamka2.setImageResource(R.drawable.ramka);
                     params_images = new RelativeLayout.LayoutParams(widthLayoutMatrix / 8, widthLayoutMatrix / 8);
                     params_images.setMargins(leftMargin - 10,
                             topMargin - 10 + widthLayoutMatrix / 4, 0, 0);
                     rLayout.addView(imageRamka2, params_images);
                     imageClicked = imageName;
                     clickedRamka2 = "1";
                     imageRamka2.setId(R.id.idRamka2);
                     imageRamka2.setOnClickListener(this);
                 }
             }

             if (ramka_3_i<=7 && ramka_3_j>=0) {
                 is_shax=shax_sev_tagavor_stugum(ramka_3_i,ramka_3_j,imageName,true);

                 if (matrixBord[ramka_3_i][ramka_3_j].charAt(1) == 'p' && is_shax==true) {

                     imageRamka3 = new ImageView(this);
                     imageRamka3.setImageResource(R.drawable.ramka);
                     params_images = new RelativeLayout.LayoutParams(widthLayoutMatrix / 8, widthLayoutMatrix / 8);
                     params_images.setMargins(leftMargin - 10-widthLayoutMatrix/8,
                             topMargin - 10 + widthLayoutMatrix / 8, 0, 0);
                     rLayout.addView(imageRamka3, params_images);
                     imageClicked = imageName;
                     clickedRamka3 = "1";
                     imageRamka3.setId(R.id.idRamka3);
                     imageRamka3.setOnClickListener(this);
                 }
             }

             if (ramka_4_i<=7 && ramka_4_j<=7) {
                 is_shax=shax_sev_tagavor_stugum(ramka_4_i,ramka_4_j,imageName,true);

                 if (matrixBord[ramka_4_i][ramka_4_j].charAt(1) == 'p' && is_shax==true) {

                     imageRamka4 = new ImageView(this);
                     imageRamka4.setImageResource(R.drawable.ramka);
                     params_images = new RelativeLayout.LayoutParams(widthLayoutMatrix / 8, widthLayoutMatrix / 8);
                     params_images.setMargins(leftMargin - 10+widthLayoutMatrix/8,
                             topMargin - 10 + widthLayoutMatrix / 8, 0, 0);
                     rLayout.addView(imageRamka4, params_images);
                     imageClicked = imageName;
                     clickedRamka4 = "1";
                     imageRamka4.setId(R.id.idRamka4);
                     imageRamka4.setOnClickListener(this);
                 }
             }

             if (view_i==4 && ramka_5_j>=0 && matrixBord[view_i][ramka_5_j].equals(zinvorClickRAmka2_num))  {
                 is_shax=shax_sev_tagavor_stugum(view_i+1,ramka_5_j,imageName,false);

                 if (is_shax==true) {
                     imageRamka5 = new ImageView(this);
                     imageRamka5.setImageResource(R.drawable.ramka);
                     params_images = new RelativeLayout.LayoutParams(widthLayoutMatrix / 8, widthLayoutMatrix / 8);
                     params_images.setMargins(leftMargin - 10 - widthLayoutMatrix / 8,
                             topMargin - 10 + widthLayoutMatrix / 8, 0, 0);
                     rLayout.addView(imageRamka5, params_images);
                     imageClicked = imageName;
                     clickedRamka5 = "1";
                     imageRamka5.setId(R.id.idRamka5);
                     imageRamka5.setOnClickListener(this);
                 }
             }

             if (view_i==4 && ramka_6_j<=7 && matrixBord[view_i][ramka_6_j].equals(zinvorClickRAmka2_num))  {
                 is_shax=shax_sev_tagavor_stugum(view_i+1,ramka_6_j,imageName,false);

                 if (is_shax==true) {
                     imageRamka6 = new ImageView(this);
                     imageRamka6.setImageResource(R.drawable.ramka);
                     params_images = new RelativeLayout.LayoutParams(widthLayoutMatrix / 8, widthLayoutMatrix / 8);
                     params_images.setMargins(leftMargin - 10 + widthLayoutMatrix / 8,
                             topMargin - 10 + widthLayoutMatrix / 8, 0, 0);
                     rLayout.addView(imageRamka6, params_images);
                     imageClicked = imageName;
                     clickedRamka6 = "1";
                     imageRamka6.setId(R.id.idRamka6);
                     imageRamka6.setOnClickListener(this);
                 }
             }
         }
     }

     //--------------------zinvor_ramka_click-------------------------------------------------------------------------
     private void zinvorRamkaClick(ImageView imageRamka, int num)  {

         //---------------spitak zinvor-----------------------------------------------------------------------------
         if (imageClicked.equals("spitak_zinvor_1")) {
             zinvor_spitak_1.animate().translationXBy(imageRamka.getLeft()
                     - spitak_zinvor_1_left + 10).translationYBy(
                     imageRamka.getTop() - spitak_zinvor_1_top + 10).setDuration(300);

             spitak_zinvor_1_left += imageRamka.getLeft() - spitak_zinvor_1_left + 10;
             spitak_zinvor_1_top += imageRamka.getTop() - spitak_zinvor_1_top + 10;
             imageClickedColor=false;
             zinvor_spitak_1_qayl=false;
         }
         else if (imageClicked.equals("spitak_zinvor_2")) {

             zinvor_spitak_2.animate().translationXBy(imageRamka.getLeft()
                     - spitak_zinvor_2_left + 10).translationYBy(
                     imageRamka.getTop() - spitak_zinvor_2_top + 10).setDuration(300);

             spitak_zinvor_2_left += imageRamka.getLeft() - spitak_zinvor_2_left + 10;
             spitak_zinvor_2_top += imageRamka.getTop() - spitak_zinvor_2_top + 10;
             imageClickedColor=false;
             zinvor_spitak_2_qayl=false;
         }
         else if (imageClicked.equals("spitak_zinvor_3")) {

             zinvor_spitak_3.animate().translationXBy(imageRamka.getLeft()
                     - spitak_zinvor_3_left + 10).translationYBy(
                     imageRamka.getTop() - spitak_zinvor_3_top + 10).setDuration(300);

             spitak_zinvor_3_left += imageRamka.getLeft() - spitak_zinvor_3_left + 10;
             spitak_zinvor_3_top += imageRamka.getTop() - spitak_zinvor_3_top + 10;
             imageClickedColor=false;
             zinvor_spitak_3_qayl=false;
         }
         else if (imageClicked.equals("spitak_zinvor_4")) {

             zinvor_spitak_4.animate().translationXBy(imageRamka.getLeft()
                     - spitak_zinvor_4_left + 10).translationYBy(
                     imageRamka.getTop() - spitak_zinvor_4_top + 10).setDuration(300);

             spitak_zinvor_4_left += imageRamka.getLeft() - spitak_zinvor_4_left + 10;
             spitak_zinvor_4_top += imageRamka.getTop() - spitak_zinvor_4_top + 10;
             imageClickedColor=false;
             zinvor_spitak_4_qayl=false;
         }
         else if (imageClicked.equals("spitak_zinvor_5")) {

             zinvor_spitak_5.animate().translationXBy(imageRamka.getLeft()
                     - spitak_zinvor_5_left + 10).translationYBy(
                     imageRamka.getTop() - spitak_zinvor_5_top + 10).setDuration(300);

             spitak_zinvor_5_left += imageRamka.getLeft() - spitak_zinvor_5_left + 10;
             spitak_zinvor_5_top += imageRamka.getTop() - spitak_zinvor_5_top + 10;
             imageClickedColor=false;
             zinvor_spitak_5_qayl=false;
         }
         else if (imageClicked.equals("spitak_zinvor_6")) {

             zinvor_spitak_6.animate().translationXBy(imageRamka.getLeft()
                     - spitak_zinvor_6_left + 10).translationYBy(
                     imageRamka.getTop() - spitak_zinvor_6_top + 10).setDuration(300);

             spitak_zinvor_6_left += imageRamka.getLeft() - spitak_zinvor_6_left + 10;
             spitak_zinvor_6_top += imageRamka.getTop() - spitak_zinvor_6_top + 10;
             imageClickedColor=false;
             zinvor_spitak_6_qayl=false;
         }
         else if (imageClicked.equals("spitak_zinvor_7")) {

             zinvor_spitak_7.animate().translationXBy(imageRamka.getLeft()
                     - spitak_zinvor_7_left + 10).translationYBy(
                     imageRamka.getTop() - spitak_zinvor_7_top + 10).setDuration(300);

             spitak_zinvor_7_left += imageRamka.getLeft() - spitak_zinvor_7_left + 10;
             spitak_zinvor_7_top += imageRamka.getTop() - spitak_zinvor_7_top + 10;
             imageClickedColor=false;
             zinvor_spitak_7_qayl=false;
         }
         else if (imageClicked.equals("spitak_zinvor_8")) {

             zinvor_spitak_8.animate().translationXBy(imageRamka.getLeft()
                     - spitak_zinvor_8_left + 10).translationYBy(
                     imageRamka.getTop() - spitak_zinvor_8_top + 10).setDuration(300);

             spitak_zinvor_8_left += imageRamka.getLeft() - spitak_zinvor_8_left + 10;
             spitak_zinvor_8_top += imageRamka.getTop() - spitak_zinvor_8_top + 10;
             imageClickedColor=false;
             zinvor_spitak_8_qayl=false;
         }

         //--------------------sev zinvor-----------------------------------------------------------------
         else if (imageClicked.equals("sev_zinvor_1")) {

             zinvor_sev_1.animate().translationXBy(imageRamka.getLeft()
                     - sev_zinvor_1_left + 10).translationYBy(
                     imageRamka.getTop() - sev_zinvor_1_top + 10).setDuration(300);

             sev_zinvor_1_left += imageRamka.getLeft() - sev_zinvor_1_left + 10;
             sev_zinvor_1_top += imageRamka.getTop() - sev_zinvor_1_top + 10;
             imageClickedColor=true;
             zinvor_sev_1_qayl=false;
         }
         else if (imageClicked.equals("sev_zinvor_2")) {

             zinvor_sev_2.animate().translationXBy(imageRamka.getLeft()
                     - sev_zinvor_2_left + 10).translationYBy(
                     imageRamka.getTop() - sev_zinvor_2_top + 10).setDuration(300);

             sev_zinvor_2_left += imageRamka.getLeft() - sev_zinvor_2_left + 10;
             sev_zinvor_2_top += imageRamka.getTop() - sev_zinvor_2_top + 10;
             imageClickedColor=true;
             zinvor_sev_2_qayl=false;
         }
         else if (imageClicked.equals("sev_zinvor_3")) {

             zinvor_sev_3.animate().translationXBy(imageRamka.getLeft()
                     - sev_zinvor_3_left + 10).translationYBy(
                     imageRamka.getTop() - sev_zinvor_3_top + 10).setDuration(300);

             sev_zinvor_3_left += imageRamka.getLeft() - sev_zinvor_3_left + 10;
             sev_zinvor_3_top += imageRamka.getTop() - sev_zinvor_3_top + 10;
             imageClickedColor=true;
             zinvor_sev_3_qayl=false;
         }
         else if (imageClicked.equals("sev_zinvor_4")) {

             zinvor_sev_4.animate().translationXBy(imageRamka.getLeft()
                     - sev_zinvor_4_left + 10).translationYBy(
                     imageRamka.getTop() - sev_zinvor_4_top + 10).setDuration(300);

             sev_zinvor_4_left += imageRamka.getLeft() - sev_zinvor_4_left + 10;
             sev_zinvor_4_top += imageRamka.getTop() - sev_zinvor_4_top + 10;
             imageClickedColor=true;
             zinvor_sev_4_qayl=false;
         }
         else if (imageClicked.equals("sev_zinvor_5")) {

             zinvor_sev_5.animate().translationXBy(imageRamka.getLeft()
                     - sev_zinvor_5_left + 10).translationYBy(
                     imageRamka.getTop() - sev_zinvor_5_top + 10).setDuration(300);

             sev_zinvor_5_left += imageRamka.getLeft() - sev_zinvor_5_left + 10;
             sev_zinvor_5_top += imageRamka.getTop() - sev_zinvor_5_top + 10;
             imageClickedColor=true;
             zinvor_sev_5_qayl=false;
         }
         else if (imageClicked.equals("sev_zinvor_6")) {

             zinvor_sev_6.animate().translationXBy(imageRamka.getLeft()
                     - sev_zinvor_6_left + 10).translationYBy(
                     imageRamka.getTop() - sev_zinvor_6_top + 10).setDuration(300);

             sev_zinvor_6_left += imageRamka.getLeft() - sev_zinvor_6_left + 10;
             sev_zinvor_6_top += imageRamka.getTop() - sev_zinvor_6_top + 10;
             imageClickedColor=true;
             zinvor_sev_6_qayl=false;
         }
         else if (imageClicked.equals("sev_zinvor_7")) {

             zinvor_sev_7.animate().translationXBy(imageRamka.getLeft()
                     - sev_zinvor_7_left + 10).translationYBy(
                     imageRamka.getTop() - sev_zinvor_7_top + 10).setDuration(300);

             sev_zinvor_7_left += imageRamka.getLeft() - sev_zinvor_7_left + 10;
             sev_zinvor_7_top += imageRamka.getTop() - sev_zinvor_7_top + 10;
             imageClickedColor=true;
             zinvor_sev_7_qayl=false;
         }
         else if (imageClicked.equals("sev_zinvor_8")) {

             zinvor_sev_8.animate().translationXBy(imageRamka.getLeft()
                     - sev_zinvor_8_left + 10).translationYBy(
                     imageRamka.getTop() - sev_zinvor_8_top + 10).setDuration(300);

             sev_zinvor_8_left += imageRamka.getLeft() - sev_zinvor_8_left + 10;
             sev_zinvor_8_top += imageRamka.getTop() - sev_zinvor_8_top + 10;
             imageClickedColor=true;
             zinvor_sev_8_qayl=false;
         }

         if(num==4)   {
             ramka_3_i=ramka_4_i;
             ramka_3_j=ramka_4_j;
         }

         if (imageClicked.charAt(1)=='p') {
             if (num == 5) {
                 ramka_3_i = ramka_5_i + 1;
                 ramka_3_j = ramka_5_j;
             } else if (num == 6) {
                 ramka_3_i = ramka_6_i + 1;
                 ramka_3_j = ramka_6_j;
             }
         }
         else  if (imageClicked.charAt(1)=='e') {
             if (num == 5) {
                 ramka_3_i = ramka_5_i - 1;
                 ramka_3_j = ramka_5_j;
             } else if (num == 6) {
                 ramka_3_i = ramka_6_i - 1;
                 ramka_3_j = ramka_6_j;
             }
         }

         if (num==3  || num==4 || num==5 || num==6) {

             if(imageClicked.charAt(1)=='p') {

                 if (matrixBord[ramka_3_i][ramka_3_j].equals("sev_zinvor_1"))
                     zinvor_sev_1.setVisibility(View.GONE);
                 else if (matrixBord[ramka_3_i][ramka_3_j].equals("sev_zinvor_2"))
                     zinvor_sev_2.setVisibility(View.GONE);
                 else if (matrixBord[ramka_3_i][ramka_3_j].equals("sev_zinvor_3"))
                     zinvor_sev_3.setVisibility(View.GONE);
                 else if (matrixBord[ramka_3_i][ramka_3_j].equals("sev_zinvor_4"))
                     zinvor_sev_4.setVisibility(View.GONE);
                 else if (matrixBord[ramka_3_i][ramka_3_j].equals("sev_zinvor_5"))
                     zinvor_sev_5.setVisibility(View.GONE);
                 else if (matrixBord[ramka_3_i][ramka_3_j].equals("sev_zinvor_6"))
                     zinvor_sev_6.setVisibility(View.GONE);
                 else if (matrixBord[ramka_3_i][ramka_3_j].equals("sev_zinvor_7"))
                     zinvor_sev_7.setVisibility(View.GONE);
                 else if (matrixBord[ramka_3_i][ramka_3_j].equals("sev_zinvor_8"))
                     zinvor_sev_8.setVisibility(View.GONE);

                 else if (matrixBord[ramka_3_i][ramka_3_j].equals("sev_navak_1"))
                     navak_sev_1.setVisibility(View.GONE);
                 else if (matrixBord[ramka_3_i][ramka_3_j].equals("sev_navak_2"))
                     navak_sev_2.setVisibility(View.GONE);
                 else if (matrixBord[ramka_3_i][ramka_3_j].equals("sev_navak_3"))
                     zinvor_sev_1.setVisibility(View.GONE);
                 else if (matrixBord[ramka_3_i][ramka_3_j].equals("sev_navak_4"))
                     zinvor_sev_2.setVisibility(View.GONE);
                 else if (matrixBord[ramka_3_i][ramka_3_j].equals("sev_navak_5"))
                     zinvor_sev_3.setVisibility(View.GONE);
                 else if (matrixBord[ramka_3_i][ramka_3_j].equals("sev_navak_6"))
                     zinvor_sev_4.setVisibility(View.GONE);
                 else if (matrixBord[ramka_3_i][ramka_3_j].equals("sev_navak_7"))
                     zinvor_sev_5.setVisibility(View.GONE);
                 else if (matrixBord[ramka_3_i][ramka_3_j].equals("sev_navak_8"))
                     zinvor_sev_6.setVisibility(View.GONE);
                 else if (matrixBord[ramka_3_i][ramka_3_j].equals("sev_navak_9"))
                     zinvor_sev_7.setVisibility(View.GONE);
                 else if (matrixBord[ramka_3_i][ramka_3_j].equals("sev_navak_0"))
                     zinvor_sev_8.setVisibility(View.GONE);

                 else if (matrixBord[ramka_3_i][ramka_3_j].equals("sev_dzi_1"))
                     dzi_sev_1.setVisibility(View.GONE);
                 else if (matrixBord[ramka_3_i][ramka_3_j].equals("sev_dzi_2"))
                     dzi_sev_2.setVisibility(View.GONE);
                 else if (matrixBord[ramka_3_i][ramka_3_j].equals("sev_dzi_3"))
                     zinvor_sev_1.setVisibility(View.GONE);
                 else if (matrixBord[ramka_3_i][ramka_3_j].equals("sev_dzi_4"))
                     zinvor_sev_2.setVisibility(View.GONE);
                 else if (matrixBord[ramka_3_i][ramka_3_j].equals("sev_dzi_5"))
                     zinvor_sev_3.setVisibility(View.GONE);
                 else if (matrixBord[ramka_3_i][ramka_3_j].equals("sev_dzi_6"))
                     zinvor_sev_4.setVisibility(View.GONE);
                 else if (matrixBord[ramka_3_i][ramka_3_j].equals("sev_dzi_7"))
                     zinvor_sev_5.setVisibility(View.GONE);
                 else if (matrixBord[ramka_3_i][ramka_3_j].equals("sev_dzi_8"))
                     zinvor_sev_6.setVisibility(View.GONE);
                 else if (matrixBord[ramka_3_i][ramka_3_j].equals("sev_dzi_9"))
                     zinvor_sev_7.setVisibility(View.GONE);
                 else if (matrixBord[ramka_3_i][ramka_3_j].equals("sev_dzi_0"))
                     zinvor_sev_8.setVisibility(View.GONE);

                 else if (matrixBord[ramka_3_i][ramka_3_j].equals("sev_pix_1"))
                     pix_sev_1.setVisibility(View.GONE);
                 else if (matrixBord[ramka_3_i][ramka_3_j].equals("sev_pix_2"))
                     pix_sev_2.setVisibility(View.GONE);
                 else if (matrixBord[ramka_3_i][ramka_3_j].equals("sev_pix_3"))
                     zinvor_sev_1.setVisibility(View.GONE);
                 else if (matrixBord[ramka_3_i][ramka_3_j].equals("sev_pix_4"))
                     zinvor_sev_2.setVisibility(View.GONE);
                 else if (matrixBord[ramka_3_i][ramka_3_j].equals("sev_pix_5"))
                     zinvor_sev_3.setVisibility(View.GONE);
                 else if (matrixBord[ramka_3_i][ramka_3_j].equals("sev_pix_6"))
                     zinvor_sev_4.setVisibility(View.GONE);
                 else if (matrixBord[ramka_3_i][ramka_3_j].equals("sev_pix_7"))
                     zinvor_sev_5.setVisibility(View.GONE);
                 else if (matrixBord[ramka_3_i][ramka_3_j].equals("sev_pix_8"))
                     zinvor_sev_6.setVisibility(View.GONE);
                 else if (matrixBord[ramka_3_i][ramka_3_j].equals("sev_pix_9"))
                     zinvor_sev_7.setVisibility(View.GONE);
                 else if (matrixBord[ramka_3_i][ramka_3_j].equals("sev_pix_0"))
                     zinvor_sev_8.setVisibility(View.GONE);

                 else if (matrixBord[ramka_3_i][ramka_3_j].equals("sev_taguhi"))
                     taguhi_sev.setVisibility(View.GONE);
                 else if (matrixBord[ramka_3_i][ramka_3_j].equals("sev_taguhi_1"))
                     zinvor_sev_1.setVisibility(View.GONE);
                 else if (matrixBord[ramka_3_i][ramka_3_j].equals("sev_taguhi_2"))
                     zinvor_sev_2.setVisibility(View.GONE);
                 else if (matrixBord[ramka_3_i][ramka_3_j].equals("sev_taguhi_3"))
                     zinvor_sev_3.setVisibility(View.GONE);
                 else if (matrixBord[ramka_3_i][ramka_3_j].equals("sev_taguhi_4"))
                     zinvor_sev_4.setVisibility(View.GONE);
                 else if (matrixBord[ramka_3_i][ramka_3_j].equals("sev_taguhi_5"))
                     zinvor_sev_5.setVisibility(View.GONE);
                 else if (matrixBord[ramka_3_i][ramka_3_j].equals("sev_taguhi_6"))
                     zinvor_sev_6.setVisibility(View.GONE);
                 else if (matrixBord[ramka_3_i][ramka_3_j].equals("sev_taguhi_7"))
                     zinvor_sev_7.setVisibility(View.GONE);
                 else if (matrixBord[ramka_3_i][ramka_3_j].equals("sev_taguhi_8"))
                     zinvor_sev_8.setVisibility(View.GONE);
             }
             else if(imageClicked.charAt(1)=='e')   {

                 if (matrixBord[ramka_3_i][ramka_3_j].equals("spitak_zinvor_1"))
                     zinvor_spitak_1.setVisibility(View.GONE);
                 else if (matrixBord[ramka_3_i][ramka_3_j].equals("spitak_zinvor_2"))
                     zinvor_spitak_2.setVisibility(View.GONE);
                 else if (matrixBord[ramka_3_i][ramka_3_j].equals("spitak_zinvor_3"))
                     zinvor_spitak_3.setVisibility(View.GONE);
                 else if (matrixBord[ramka_3_i][ramka_3_j].equals("spitak_zinvor_4"))
                     zinvor_spitak_4.setVisibility(View.GONE);
                 else if (matrixBord[ramka_3_i][ramka_3_j].equals("spitak_zinvor_5"))
                     zinvor_spitak_5.setVisibility(View.GONE);
                 else if (matrixBord[ramka_3_i][ramka_3_j].equals("spitak_zinvor_6"))
                     zinvor_spitak_6.setVisibility(View.GONE);
                 else if (matrixBord[ramka_3_i][ramka_3_j].equals("spitak_zinvor_7"))
                     zinvor_spitak_7.setVisibility(View.GONE);
                 else if (matrixBord[ramka_3_i][ramka_3_j].equals("spitak_zinvor_8"))
                     zinvor_spitak_8.setVisibility(View.GONE);

                 else if (matrixBord[ramka_3_i][ramka_3_j].equals("spitak_navak_1"))
                     navak_spitak_1.setVisibility(View.GONE);
                 else if (matrixBord[ramka_3_i][ramka_3_j].equals("spitak_navak_2"))
                     navak_spitak_2.setVisibility(View.GONE);
                 else if (matrixBord[ramka_3_i][ramka_3_j].equals("spitak_navak_3"))
                     zinvor_spitak_1.setVisibility(View.GONE);
                 else if (matrixBord[ramka_3_i][ramka_3_j].equals("spitak_navak_4"))
                     zinvor_spitak_2.setVisibility(View.GONE);
                 else if (matrixBord[ramka_3_i][ramka_3_j].equals("spitak_navak_5"))
                     zinvor_spitak_3.setVisibility(View.GONE);
                 else if (matrixBord[ramka_3_i][ramka_3_j].equals("spitak_navak_6"))
                     zinvor_spitak_4.setVisibility(View.GONE);
                 else if (matrixBord[ramka_3_i][ramka_3_j].equals("spitak_navak_7"))
                     zinvor_spitak_5.setVisibility(View.GONE);
                 else if (matrixBord[ramka_3_i][ramka_3_j].equals("spitak_navak_8"))
                     zinvor_spitak_6.setVisibility(View.GONE);
                 else if (matrixBord[ramka_3_i][ramka_3_j].equals("spitak_navak_9"))
                     zinvor_spitak_7.setVisibility(View.GONE);
                 else if (matrixBord[ramka_3_i][ramka_3_j].equals("spitak_navak_0"))
                     zinvor_spitak_8.setVisibility(View.GONE);

                 else if (matrixBord[ramka_3_i][ramka_3_j].equals("spitak_dzi_1"))
                     dzi_spitak_1.setVisibility(View.GONE);
                 else if (matrixBord[ramka_3_i][ramka_3_j].equals("spitak_dzi_2"))
                     dzi_spitak_2.setVisibility(View.GONE);
                 else if (matrixBord[ramka_3_i][ramka_3_j].equals("spitak_dzi_3"))
                     zinvor_spitak_1.setVisibility(View.GONE);
                 else if (matrixBord[ramka_3_i][ramka_3_j].equals("spitak_dzi_4"))
                     zinvor_spitak_2.setVisibility(View.GONE);
                 else if (matrixBord[ramka_3_i][ramka_3_j].equals("spitak_dzi_5"))
                     zinvor_spitak_3.setVisibility(View.GONE);
                 else if (matrixBord[ramka_3_i][ramka_3_j].equals("spitak_dzi_6"))
                     zinvor_spitak_4.setVisibility(View.GONE);
                 else if (matrixBord[ramka_3_i][ramka_3_j].equals("spitak_dzi_7"))
                     zinvor_spitak_5.setVisibility(View.GONE);
                 else if (matrixBord[ramka_3_i][ramka_3_j].equals("spitak_dzi_8"))
                     zinvor_spitak_6.setVisibility(View.GONE);
                 else if (matrixBord[ramka_3_i][ramka_3_j].equals("spitak_dzi_9"))
                     zinvor_spitak_7.setVisibility(View.GONE);
                 else if (matrixBord[ramka_3_i][ramka_3_j].equals("spitak_dzi_0"))
                     zinvor_spitak_8.setVisibility(View.GONE);

                 else if (matrixBord[ramka_3_i][ramka_3_j].equals("spitak_pix_1"))
                     pix_spitak_1.setVisibility(View.GONE);
                 else if (matrixBord[ramka_3_i][ramka_3_j].equals("spitak_pix_2"))
                     pix_spitak_2.setVisibility(View.GONE);
                 else if (matrixBord[ramka_3_i][ramka_3_j].equals("spitak_pix_3"))
                     zinvor_spitak_1.setVisibility(View.GONE);
                 else if (matrixBord[ramka_3_i][ramka_3_j].equals("spitak_pix_4"))
                     zinvor_spitak_2.setVisibility(View.GONE);
                 else if (matrixBord[ramka_3_i][ramka_3_j].equals("spitak_pix_5"))
                     zinvor_spitak_3.setVisibility(View.GONE);
                 else if (matrixBord[ramka_3_i][ramka_3_j].equals("spitak_pix_6"))
                     zinvor_spitak_4.setVisibility(View.GONE);
                 else if (matrixBord[ramka_3_i][ramka_3_j].equals("spitak_pix_7"))
                     zinvor_spitak_5.setVisibility(View.GONE);
                 else if (matrixBord[ramka_3_i][ramka_3_j].equals("spitak_pix_8"))
                     zinvor_spitak_6.setVisibility(View.GONE);
                 else if (matrixBord[ramka_3_i][ramka_3_j].equals("spitak_pix_9"))
                     zinvor_spitak_7.setVisibility(View.GONE);
                 else if (matrixBord[ramka_3_i][ramka_3_j].equals("spitak_pix_0"))
                     zinvor_spitak_8.setVisibility(View.GONE);

                 else if (matrixBord[ramka_3_i][ramka_3_j].equals("spitak_taguhi"))
                     taguhi_spitak.setVisibility(View.GONE);
                 else if (matrixBord[ramka_3_i][ramka_3_j].equals("spitak_taguhi_1"))
                     zinvor_spitak_1.setVisibility(View.GONE);
                 else if (matrixBord[ramka_3_i][ramka_3_j].equals("spitak_taguhi_2"))
                     zinvor_spitak_2.setVisibility(View.GONE);
                 else if (matrixBord[ramka_3_i][ramka_3_j].equals("spitak_taguhi_3"))
                     zinvor_spitak_3.setVisibility(View.GONE);
                 else if (matrixBord[ramka_3_i][ramka_3_j].equals("spitak_taguhi_4"))
                     zinvor_spitak_4.setVisibility(View.GONE);
                 else if (matrixBord[ramka_3_i][ramka_3_j].equals("spitak_taguhi_5"))
                     zinvor_spitak_5.setVisibility(View.GONE);
                 else if (matrixBord[ramka_3_i][ramka_3_j].equals("spitak_taguhi_6"))
                     zinvor_spitak_6.setVisibility(View.GONE);
                 else if (matrixBord[ramka_3_i][ramka_3_j].equals("spitak_taguhi_7"))
                     zinvor_spitak_7.setVisibility(View.GONE);
                 else if (matrixBord[ramka_3_i][ramka_3_j].equals("spitak_taguhi_8"))
                     zinvor_spitak_8.setVisibility(View.GONE);
             }
         }

         if (clickedRamka1.equals("1")) {
             imageRamka1.setVisibility(View.GONE);
             clickedRamka1="";
         }
         if (clickedRamka2.equals("1")) {
             imageRamka2.setVisibility(View.GONE);
             clickedRamka2="";
         }
         if (clickedRamka3.equals("1")) {
             imageRamka3.setVisibility(View.GONE);
             clickedRamka3="";
         }
         if (clickedRamka4.equals("1")) {
             imageRamka4.setVisibility(View.GONE);
             clickedRamka4="";
         }
         if (clickedRamka5.equals("1")) {
             imageRamka5.setVisibility(View.GONE);
             clickedRamka5="";
         }
         if (clickedRamka6.equals("1")) {
             imageRamka6.setVisibility(View.GONE);
             clickedRamka6="";
         }

         if (num==1) {
             String s = matrixBord[ramka_1_i][ramka_1_j];
             matrixBord[ramka_1_i][ramka_1_j] = matrixBord[view_i][view_j];
             matrixBord[view_i][view_j] = s;
         }
         else if(num==2) {
             String s1 = matrixBord[ramka_2_i][ramka_2_j];
             matrixBord[ramka_2_i][ramka_2_j] = matrixBord[view_i][view_j];
             matrixBord[view_i][view_j] = s1;
         }
         else if(num==3) {
             matrixBord[ramka_3_i][ramka_3_j] = matrixBord[view_i][view_j];
             matrixBord[view_i][view_j] = "datark";
         }
         else if(num==4) {
             matrixBord[ramka_4_i][ramka_4_j] = matrixBord[view_i][view_j];
             matrixBord[view_i][view_j] = "datark";
         }
         else if(num==5) {
             matrixBord[ramka_5_i][ramka_5_j] = matrixBord[view_i][view_j];
             matrixBord[view_i][view_j] = "datark";
             matrixBord[ramka_3_i][ramka_3_j]="datark";
         }
         else if(num==6) {
             matrixBord[ramka_6_i][ramka_6_j] = matrixBord[view_i][view_j];
             matrixBord[view_i][view_j] = "datark";
             matrixBord[ramka_3_i][ramka_3_j]="datark";
         }

         if (num==2) {
             zinvorClickRAmka2_num=matrixBord[ramka_2_i][ramka_2_j];
         }
         else {
             zinvorClickRAmka2_num="";
         }

         for (int i=0; i<8; i++) {
             if (matrixBord[0][i].substring(0, matrixBord[0][i].length()-1).equals("spitak_zinvor_")) {

                 imageClickedColor=true;
                 diaog_SpitakZinvor_Poxarinum=new Dialog_SpitakZinvor_Poxarinum();
                 diaog_SpitakZinvor_Poxarinum.show(getFragmentManager(), "");

                 zinvor_spitak_1.setEnabled(false);
                 zinvor_spitak_2.setEnabled(false);
                 zinvor_spitak_3.setEnabled(false);
                 zinvor_spitak_4.setEnabled(false);
                 zinvor_spitak_5.setEnabled(false);
                 zinvor_spitak_6.setEnabled(false);
                 zinvor_spitak_7.setEnabled(false);
                 zinvor_spitak_8.setEnabled(false);
                 dzi_spitak_1.setEnabled(false);
                 dzi_spitak_2.setEnabled(false);
                 pix_spitak_1.setEnabled(false);
                 pix_spitak_2.setEnabled(false);
                 navak_spitak_1.setEnabled(false);
                 navak_spitak_2.setEnabled(false);
                 taguhi_spitak.setEnabled(false);
                 tagavor_spitak.setEnabled(false);

                 zinvor_sev_1.setEnabled(false);
                 zinvor_sev_2.setEnabled(false);
                 zinvor_sev_3.setEnabled(false);
                 zinvor_sev_4.setEnabled(false);
                 zinvor_sev_5.setEnabled(false);
                 zinvor_sev_6.setEnabled(false);
                 zinvor_sev_7.setEnabled(false);
                 zinvor_sev_8.setEnabled(false);
                 dzi_sev_1.setEnabled(false);
                 dzi_sev_2.setEnabled(false);
                 pix_sev_1.setEnabled(false);
                 pix_sev_2.setEnabled(false);
                 navak_sev_1.setEnabled(false);
                 navak_sev_2.setEnabled(false);
                 taguhi_sev.setEnabled(false);
                 tagavor_sev.setEnabled(false);

             }
             else   if (matrixBord[7][i].substring(0, matrixBord[7][i].length()-1).equals("sev_zinvor_")) {

                 imageClickedColor=false;
                 dialog_SevZinvorPoxarinum=new Dialog_SevZinvor_Poxarinum();
                 dialog_SevZinvorPoxarinum.show(getFragmentManager(),"");

                 zinvor_spitak_1.setEnabled(false);
                 zinvor_spitak_2.setEnabled(false);
                 zinvor_spitak_3.setEnabled(false);
                 zinvor_spitak_4.setEnabled(false);
                 zinvor_spitak_5.setEnabled(false);
                 zinvor_spitak_6.setEnabled(false);
                 zinvor_spitak_7.setEnabled(false);
                 zinvor_spitak_8.setEnabled(false);
                 dzi_spitak_1.setEnabled(false);
                 dzi_spitak_2.setEnabled(false);
                 pix_spitak_1.setEnabled(false);
                 pix_spitak_2.setEnabled(false);
                 navak_spitak_1.setEnabled(false);
                 navak_spitak_2.setEnabled(false);
                 taguhi_spitak.setEnabled(false);
                 tagavor_spitak.setEnabled(false);

                 zinvor_sev_1.setEnabled(false);
                 zinvor_sev_2.setEnabled(false);
                 zinvor_sev_3.setEnabled(false);
                 zinvor_sev_4.setEnabled(false);
                 zinvor_sev_5.setEnabled(false);
                 zinvor_sev_6.setEnabled(false);
                 zinvor_sev_7.setEnabled(false);
                 zinvor_sev_8.setEnabled(false);
                 dzi_sev_1.setEnabled(false);
                 dzi_sev_2.setEnabled(false);
                 pix_sev_1.setEnabled(false);
                 pix_sev_2.setEnabled(false);
                 navak_sev_1.setEnabled(false);
                 navak_sev_2.setEnabled(false);
                 taguhi_sev.setEnabled(false);
                 tagavor_sev.setEnabled(false);
             }
         }
     }

     //----------metod navaki click_i---------------------------------------------------------------------------
     private void navakClick(ImageView imageNavak, int leftNavak, int topNavak, String imageName, boolean sev_spitak) {

         if (clickedRamka1.equals("1")) {
             imageRamka1.setVisibility(View.GONE);
             clickedRamka1 = "";
         }
         if (clickedRamka2.equals("1")) {
             imageRamka2.setVisibility(View.GONE);
             clickedRamka2 = "";
         }
         if (clickedRamka3.equals("1")) {
             imageRamka3.setVisibility(View.GONE);
             clickedRamka3 = "";
         }
         if (clickedRamka4.equals("1")) {
             imageRamka4.setVisibility(View.GONE);
             clickedRamka4 = "";
         }
         if (clickedRamka5.equals("1")) {
             imageRamka5.setVisibility(View.GONE);
             clickedRamka5 = "";
         }
         if (clickedRamka6.equals("1")) {
             imageRamka6.setVisibility(View.GONE);
             clickedRamka6 = "";
         }

         if (clickedRamkaDzi_1.equals("1")) {
             imageRamkaDzi_1.setVisibility(View.GONE);
             clickedRamkaDzi_1="";
         }
         if (clickedRamkaDzi_2.equals("1")) {
             imageRamkaDzi_2.setVisibility(View.GONE);
             clickedRamkaDzi_2="";
         }
         if (clickedRamkaDzi_3.equals("1")) {
             imageRamkaDzi_3.setVisibility(View.GONE);
             clickedRamkaDzi_3="";
         }
         if (clickedRamkaDzi_4.equals("1")) {
             imageRamkaDzi_4.setVisibility(View.GONE);
             clickedRamkaDzi_4="";
         }
         if (clickedRamkaDzi_5.equals("1")) {
             imageRamkaDzi_5.setVisibility(View.GONE);
             clickedRamkaDzi_5="";
         }
         if (clickedRamkaDzi_6.equals("1")) {
             imageRamkaDzi_6.setVisibility(View.GONE);
             clickedRamkaDzi_6="";
         }
         if (clickedRamkaDzi_7.equals("1")) {
             imageRamkaDzi_7.setVisibility(View.GONE);
             clickedRamkaDzi_7="";
         }
         if (clickedRamkaDzi_8.equals("1")) {
             imageRamkaDzi_8.setVisibility(View.GONE);
             clickedRamkaDzi_8="";
         }

         if (clickedRamkaTagavor_1.equals("1")) {
             imageRamkaTagavor_1.setVisibility(View.GONE);
             clickedRamkaTagavor_1="";
         }
         if (clickedRamkaTagavor_2.equals("1")) {
             imageRamkaTagavor_2.setVisibility(View.GONE);
             clickedRamkaTagavor_2="";
         }
         if (clickedRamkaTagavor_3.equals("1")) {
             imageRamkaTagavor_3.setVisibility(View.GONE);
             clickedRamkaTagavor_3="";
         }
         if (clickedRamkaTagavor_4.equals("1")) {
             imageRamkaTagavor_4.setVisibility(View.GONE);
             clickedRamkaTagavor_4="";
         }
         if (clickedRamkaTagavor_5.equals("1")) {
             imageRamkaTagavor_5.setVisibility(View.GONE);
             clickedRamkaTagavor_5="";
         }
         if (clickedRamkaTagavor_6.equals("1")) {
             imageRamkaTagavor_6.setVisibility(View.GONE);
             clickedRamkaTagavor_6="";
         }
         if (clickedRamkaTagavor_7.equals("1")) {
             imageRamkaTagavor_7.setVisibility(View.GONE);
             clickedRamkaTagavor_7="";
         }
         if (clickedRamkaTagavor_8.equals("1")) {
             imageRamkaTagavor_8.setVisibility(View.GONE);
             clickedRamkaTagavor_8="";
         }
         if (clickedRamkaTagavor_9.equals("1")) {
             imageRamkaTagavor_9.setVisibility(View.GONE);
             clickedRamkaTagavor_9="";
         }
         if (clickedRamkaTagavor_10.equals("1")) {
             imageRamkaTagavor_10.setVisibility(View.GONE);
             clickedRamkaTagavor_10="";
         }

         for (int i = 0; i < 8; i++) {
             if (clickedRamkaNavah_horizonakan[i].equals("1")) {
                 imageRamkaNavak_horizonakan[i].setVisibility(View.GONE);
                 clickedRamkaNavah_horizonakan[i] = "";
             }
             if (clickedRamkaNavah_uxxahayac[i].equals("1")) {
                 imageRamkaNavak_uxxahayac[i].setVisibility(View.GONE);
                 clickedRamkaNavah_uxxahayac[i] = "";
             }
             if (clickedRamkaPix_glxavor[i].equals("1")) {
                 imageRamkaPix_glxavor[i].setVisibility(View.GONE);
                 clickedRamkaPix_glxavor[i]="";
             }
             if (clicedRamkaPix_ojandak[i].equals("1")) {
                 imageRamkaPix_ojandak[i].setVisibility(View.GONE);
                 clicedRamkaPix_ojandak[i]="";
             }
         }

         for (int i=0; i<8; i++) {
             oponentImageString_uxxahayac[i]="";
             oponentImageString_horizonakan[i]="";
         }

         for (int i=0; i<8; i++) {
             for (int j=0; j<8; j++) {
                 if (matrixBord[i][j].equals(imageName)) {
                     view_i=i;
                     view_j=j;
                 }
             }
         }

             int sum = 1;
             int sum1 = 1;
             int sum2 = 1;
             int sum3 = 1;
             boolean opponentFigure1 = true;
             boolean opponentFigure2 = true;
             boolean opponentFigure3 = true;
             boolean opponentFigure4 = true;

         boolean is_shax=true;

             for (int i = 0; i < 8; i++) {
                 if (view_j - sum >= 0 && opponentFigure1 == true) {

                     if (sev_spitak==true)
                         is_shax=shax_spitak_tagavor_stugum(view_i,view_j-sum,imageName,true);
                     else if(sev_spitak==false)
                         is_shax=shax_sev_tagavor_stugum(view_i,view_j-sum,imageName,true);

                     if (matrixBord[view_i][view_j - sum].equals("datark")) {
                         if (is_shax==true) {
                             imageRamkaNavak_horizonakan[view_j - sum] = new ImageView(this);
                             imageRamkaNavak_horizonakan[view_j - sum].setImageResource(R.drawable.ramka);
                             params_images = new RelativeLayout.LayoutParams(widthLayoutMatrix / 8, widthLayoutMatrix / 8);
                             params_images.setMargins(leftNavak - 10 - sum * widthLayoutMatrix / 8,
                                     topNavak - 10, 0, 0);
                             rLayout.addView(imageRamkaNavak_horizonakan[view_j - sum], params_images);
                             imageClicked = imageName;
                             clickedRamkaNavah_horizonakan[view_j - sum] = "1";
                             imageRamkaNavak_horizonakan[view_j - sum].setOnClickListener(this);
                         }
                         sum++;
                     } else if (matrixBord[view_i][view_j - sum].charAt(1) == 'e' && sev_spitak == true && is_shax==true) {
                         imageRamkaNavak_horizonakan[view_j - sum] = new ImageView(this);
                         imageRamkaNavak_horizonakan[view_j - sum].setImageResource(R.drawable.ramka);
                         params_images = new RelativeLayout.LayoutParams(widthLayoutMatrix / 8, widthLayoutMatrix / 8);
                         params_images.setMargins(leftNavak - 10 - sum * widthLayoutMatrix / 8,
                                 topNavak - 10, 0, 0);
                         rLayout.addView(imageRamkaNavak_horizonakan[view_j - sum], params_images);
                         imageClicked = imageName;
                         clickedRamkaNavah_horizonakan[view_j - sum] = "1";
                         opponentFigure1 = false;
                         oponentImageString_horizonakan[view_j - sum] = matrixBord[view_i][view_j - sum];
                         imageRamkaNavak_horizonakan[view_j - sum].setOnClickListener(this);
                     } else if (matrixBord[view_i][view_j - sum].charAt(1) == 'p' && sev_spitak == false && is_shax==true) {
                         imageRamkaNavak_horizonakan[view_j - sum] = new ImageView(this);
                         imageRamkaNavak_horizonakan[view_j - sum].setImageResource(R.drawable.ramka);
                         params_images = new RelativeLayout.LayoutParams(widthLayoutMatrix / 8, widthLayoutMatrix / 8);
                         params_images.setMargins(leftNavak - 10 - sum * widthLayoutMatrix / 8,
                                 topNavak - 10, 0, 0);
                         rLayout.addView(imageRamkaNavak_horizonakan[view_j - sum], params_images);
                         imageClicked = imageName;
                         clickedRamkaNavah_horizonakan[view_j - sum] = "1";
                         opponentFigure1 = false;
                         oponentImageString_horizonakan[view_j - sum] = matrixBord[view_i][view_j - sum];
                         imageRamkaNavak_horizonakan[view_j - sum].setOnClickListener(this);
                     }
                 }
                 if (view_j + sum1 <= 7 && opponentFigure2 == true) {

                     if (sev_spitak==true)
                         is_shax=shax_spitak_tagavor_stugum(view_i,view_j+sum1,imageName,true);
                     else if(sev_spitak==false)
                         is_shax=shax_sev_tagavor_stugum(view_i,view_j+sum1,imageName,true);

                     if (matrixBord[view_i][view_j + sum1].equals("datark")) {
                         if (is_shax==true) {
                             imageRamkaNavak_horizonakan[view_j + sum1] = new ImageView(this);
                             imageRamkaNavak_horizonakan[view_j + sum1].setImageResource(R.drawable.ramka);
                             params_images = new RelativeLayout.LayoutParams(widthLayoutMatrix / 8, widthLayoutMatrix / 8);
                             params_images.setMargins(leftNavak - 10 + sum1 * widthLayoutMatrix / 8,
                                     topNavak - 10, 0, 0);
                             rLayout.addView(imageRamkaNavak_horizonakan[view_j + sum1], params_images);
                             imageClicked = imageName;
                             clickedRamkaNavah_horizonakan[view_j + sum1] = "1";
                             imageRamkaNavak_horizonakan[view_j + sum1].setOnClickListener(this);
                         }
                         sum1++;
                     } else if (matrixBord[view_i][view_j + sum1].charAt(1) == 'e' && sev_spitak == true && is_shax==true) {

                         imageRamkaNavak_horizonakan[view_j + sum1] = new ImageView(this);
                         imageRamkaNavak_horizonakan[view_j + sum1].setImageResource(R.drawable.ramka);
                         params_images = new RelativeLayout.LayoutParams(widthLayoutMatrix / 8, widthLayoutMatrix / 8);
                         params_images.setMargins(leftNavak - 10 + sum1 * widthLayoutMatrix / 8,
                                 topNavak - 10, 0, 0);
                         rLayout.addView(imageRamkaNavak_horizonakan[view_j + sum1], params_images);
                         imageClicked = imageName;
                         clickedRamkaNavah_horizonakan[view_j + sum1] = "1";
                         opponentFigure2 = false;
                         oponentImageString_horizonakan[view_j + sum1] = matrixBord[view_i][view_j + sum1];
                         imageRamkaNavak_horizonakan[view_j + sum1].setOnClickListener(this);
                     } else if (matrixBord[view_i][view_j + sum1].charAt(1) == 'p' && sev_spitak == false && is_shax==true) {

                         imageRamkaNavak_horizonakan[view_j + sum1] = new ImageView(this);
                         imageRamkaNavak_horizonakan[view_j + sum1].setImageResource(R.drawable.ramka);
                         params_images = new RelativeLayout.LayoutParams(widthLayoutMatrix / 8, widthLayoutMatrix / 8);
                         params_images.setMargins(leftNavak - 10 + sum1 * widthLayoutMatrix / 8,
                                 topNavak - 10, 0, 0);
                         rLayout.addView(imageRamkaNavak_horizonakan[view_j + sum1], params_images);
                         imageClicked = imageName;
                         clickedRamkaNavah_horizonakan[view_j + sum1] = "1";
                         opponentFigure2 = false;
                         oponentImageString_horizonakan[view_j + sum1] = matrixBord[view_i][view_j + sum1];
                         imageRamkaNavak_horizonakan[view_j + sum1].setOnClickListener(this);
                     }
                 }
                 if (view_i - sum2 >= 0 && opponentFigure3 == true) {

                     if (sev_spitak==true)
                         is_shax=shax_spitak_tagavor_stugum(view_i-sum2,view_j,imageName,true);
                     else if(sev_spitak==false)
                         is_shax=shax_sev_tagavor_stugum(view_i-sum2,view_j,imageName,true);

                     if (matrixBord[view_i - sum2][view_j].equals("datark")) {
                         if (is_shax==true) {
                             imageRamkaNavak_uxxahayac[view_i - sum2] = new ImageView(this);
                             imageRamkaNavak_uxxahayac[view_i - sum2].setImageResource(R.drawable.ramka);
                             params_images = new RelativeLayout.LayoutParams(widthLayoutMatrix / 8, widthLayoutMatrix / 8);
                             params_images.setMargins(leftNavak - 10,
                                     topNavak - 10 - sum2 * widthLayoutMatrix / 8, 0, 0);
                             rLayout.addView(imageRamkaNavak_uxxahayac[view_i - sum2], params_images);
                             imageClicked = imageName;
                             clickedRamkaNavah_uxxahayac[view_i - sum2] = "1";
                             imageRamkaNavak_uxxahayac[view_i - sum2].setOnClickListener(this);
                         }
                         sum2++;
                     } else if (matrixBord[view_i - sum2][view_j].charAt(1) == 'e' && sev_spitak == true && is_shax==true) {
                         imageRamkaNavak_uxxahayac[view_i - sum2] = new ImageView(this);
                         imageRamkaNavak_uxxahayac[view_i - sum2].setImageResource(R.drawable.ramka);
                         params_images = new RelativeLayout.LayoutParams(widthLayoutMatrix / 8, widthLayoutMatrix / 8);
                         params_images.setMargins(leftNavak - 10,
                                 topNavak - 10 - sum2 * widthLayoutMatrix / 8, 0, 0);
                         rLayout.addView(imageRamkaNavak_uxxahayac[view_i - sum2], params_images);
                         imageClicked = imageName;
                         clickedRamkaNavah_uxxahayac[view_i - sum2] = "1";
                         opponentFigure3 = false;
                         oponentImageString_uxxahayac[view_i - sum2] = matrixBord[view_i - sum2][view_j];
                         imageRamkaNavak_uxxahayac[view_i - sum2].setOnClickListener(this);
                     } else if (matrixBord[view_i - sum2][view_j].charAt(1) == 'p' && sev_spitak == false && is_shax==true) {
                         imageRamkaNavak_uxxahayac[view_i - sum2] = new ImageView(this);
                         imageRamkaNavak_uxxahayac[view_i - sum2].setImageResource(R.drawable.ramka);
                         params_images = new RelativeLayout.LayoutParams(widthLayoutMatrix / 8, widthLayoutMatrix / 8);
                         params_images.setMargins(leftNavak - 10,
                                 topNavak - 10 - sum2 * widthLayoutMatrix / 8, 0, 0);
                         rLayout.addView(imageRamkaNavak_uxxahayac[view_i - sum2], params_images);
                         imageClicked = imageName;
                         clickedRamkaNavah_uxxahayac[view_i - sum2] = "1";
                         opponentFigure3 = false;
                         oponentImageString_uxxahayac[view_i - sum2] = matrixBord[view_i - sum2][view_j];
                         imageRamkaNavak_uxxahayac[view_i - sum2].setOnClickListener(this);
                     }
                 }
                 if (view_i + sum3 <= 7 && opponentFigure4 == true) {

                     if (sev_spitak==true)
                         is_shax=shax_spitak_tagavor_stugum(view_i+sum3,view_j,imageName,true);
                     else if(sev_spitak==false)
                         is_shax=shax_sev_tagavor_stugum(view_i+sum3,view_j,imageName,true);

                     if (matrixBord[view_i + sum3][view_j].equals("datark")) {
                         if (is_shax==true) {
                             imageRamkaNavak_uxxahayac[view_i + sum3] = new ImageView(this);
                             imageRamkaNavak_uxxahayac[view_i + sum3].setImageResource(R.drawable.ramka);
                             params_images = new RelativeLayout.LayoutParams(widthLayoutMatrix / 8, widthLayoutMatrix / 8);
                             params_images.setMargins(leftNavak - 10,
                                     topNavak - 10 + sum3 * widthLayoutMatrix / 8, 0, 0);
                             rLayout.addView(imageRamkaNavak_uxxahayac[view_i + sum3], params_images);
                             imageClicked = imageName;
                             clickedRamkaNavah_uxxahayac[view_i + sum3] = "1";
                             imageRamkaNavak_uxxahayac[view_i + sum3].setOnClickListener(this);
                         }
                         sum3++;
                     } else if (matrixBord[view_i + sum3][view_j].charAt(1) == 'e' && sev_spitak == true && is_shax==true) {
                         imageRamkaNavak_uxxahayac[view_i + sum3] = new ImageView(this);
                         imageRamkaNavak_uxxahayac[view_i + sum3].setImageResource(R.drawable.ramka);
                         params_images = new RelativeLayout.LayoutParams(widthLayoutMatrix / 8, widthLayoutMatrix / 8);
                         params_images.setMargins(leftNavak - 10,
                                 topNavak - 10 + sum3 * widthLayoutMatrix / 8, 0, 0);
                         rLayout.addView(imageRamkaNavak_uxxahayac[view_i + sum3], params_images);
                         imageClicked = imageName;
                         clickedRamkaNavah_uxxahayac[view_i + sum3] = "1";
                         opponentFigure4 = false;
                         oponentImageString_uxxahayac[view_i + sum3] = matrixBord[view_i + sum3][view_j];
                         imageRamkaNavak_uxxahayac[view_i + sum3].setOnClickListener(this);
                     } else if (matrixBord[view_i + sum3][view_j].charAt(1) == 'p' && sev_spitak == false && is_shax==true) {
                         imageRamkaNavak_uxxahayac[view_i + sum3] = new ImageView(this);
                         imageRamkaNavak_uxxahayac[view_i + sum3].setImageResource(R.drawable.ramka);
                         params_images = new RelativeLayout.LayoutParams(widthLayoutMatrix / 8, widthLayoutMatrix / 8);
                         params_images.setMargins(leftNavak - 10,
                                 topNavak - 10 + sum3 * widthLayoutMatrix / 8, 0, 0);
                         rLayout.addView(imageRamkaNavak_uxxahayac[view_i + sum3], params_images);
                         imageClicked = imageName;
                         clickedRamkaNavah_uxxahayac[view_i + sum3] = "1";
                         opponentFigure4 = false;
                         oponentImageString_uxxahayac[view_i + sum3] = matrixBord[view_i + sum3][view_j];
                         imageRamkaNavak_uxxahayac[view_i + sum3].setOnClickListener(this);
                     }
                 }
             }

         if (clickedRamkaNavah_horizonakan[0].equals("1")) {
             imageRamkaNavak_horizonakan[0].setId(R.id.ramka_Navak_horizonakan_1);
         }
         if (clickedRamkaNavah_horizonakan[1].equals("1")) {
             imageRamkaNavak_horizonakan[1].setId(R.id.ramka_Navak_horizonakan_2);
         }
         if (clickedRamkaNavah_horizonakan[2].equals("1")) {
             imageRamkaNavak_horizonakan[2].setId(R.id.ramka_Navak_horizonakan_3);
         }
         if (clickedRamkaNavah_horizonakan[3].equals("1")) {
             imageRamkaNavak_horizonakan[3].setId(R.id.ramka_Navak_horizonakan_4);
         }
         if (clickedRamkaNavah_horizonakan[4].equals("1")) {
             imageRamkaNavak_horizonakan[4].setId(R.id.ramka_Navak_horizonakan_5);
         }
         if (clickedRamkaNavah_horizonakan[5].equals("1")) {
             imageRamkaNavak_horizonakan[5].setId(R.id.ramka_Navak_horizonakan_6);
         }
         if (clickedRamkaNavah_horizonakan[6].equals("1")) {
             imageRamkaNavak_horizonakan[6].setId(R.id.ramka_Navak_horizonakan_7);
         }
         if (clickedRamkaNavah_horizonakan[7].equals("1")) {
             imageRamkaNavak_horizonakan[7].setId(R.id.ramka_Navak_horizonakan_8);
         }

         if (clickedRamkaNavah_uxxahayac[0].equals("1")) {
             imageRamkaNavak_uxxahayac[0].setId(R.id.ramka_Navak_uxxahayac_1);
         }
         if (clickedRamkaNavah_uxxahayac[1].equals("1")) {
             imageRamkaNavak_uxxahayac[1].setId(R.id.ramka_Navak_uxxahayac_2);
         }
         if (clickedRamkaNavah_uxxahayac[2].equals("1")) {
             imageRamkaNavak_uxxahayac[2].setId(R.id.ramka_Navak_uxxahayac_3);
         }
         if (clickedRamkaNavah_uxxahayac[3].equals("1")) {
             imageRamkaNavak_uxxahayac[3].setId(R.id.ramka_Navak_uxxahayac_4);
         }
         if (clickedRamkaNavah_uxxahayac[4].equals("1")) {
             imageRamkaNavak_uxxahayac[4].setId(R.id.ramka_Navak_uxxahayac_5);
         }
         if (clickedRamkaNavah_uxxahayac[5].equals("1")) {
             imageRamkaNavak_uxxahayac[5].setId(R.id.ramka_Navak_uxxahayac_6);
         }
         if (clickedRamkaNavah_uxxahayac[6].equals("1")) {
             imageRamkaNavak_uxxahayac[6].setId(R.id.ramka_Navak_uxxahayac_7);
         }
         if (clickedRamkaNavah_uxxahayac[7].equals("1")) {
             imageRamkaNavak_uxxahayac[7].setId(R.id.ramka_Navak_uxxahayac_8);
         }
     }


     //-----------metod_Navaki ramkai Click-i-----------------------------------------------------------------------
     private void clickNavakRamka( int num, boolean horizonakan_uxxahayac) {

        //-----------spitak_Navak------------------------------------------------------------------------------------
         if (imageClicked.equals("spitak_navak_1")) {

             if (horizonakan_uxxahayac) {
                 navak_spitak_1.animate().translationXBy(imageRamkaNavak_uxxahayac[num].getLeft()
                         - spitak_navak_1_left + 10).translationYBy(
                         imageRamkaNavak_uxxahayac[num].getTop() - spitak_navak_1_top + 10).setDuration(300);

                 spitak_navak_1_left += imageRamkaNavak_uxxahayac[num].getLeft() - spitak_navak_1_left + 10;
                 spitak_navak_1_top += imageRamkaNavak_uxxahayac[num].getTop() - spitak_navak_1_top + 10;
             }
             else
             {
                 navak_spitak_1.animate().translationXBy(imageRamkaNavak_horizonakan[num].getLeft()
                         - spitak_navak_1_left + 10).translationYBy(
                         imageRamkaNavak_horizonakan[num].getTop() - spitak_navak_1_top + 10).setDuration(300);

                 spitak_navak_1_left += imageRamkaNavak_horizonakan[num].getLeft() - spitak_navak_1_left + 10;
                 spitak_navak_1_top += imageRamkaNavak_horizonakan[num].getTop() - spitak_navak_1_top + 10;
             }
             imageClickedColor=false;
             qayl_spitak_navak_1=false;
         }
         else if (imageClicked.equals("spitak_navak_2")) {

             if (horizonakan_uxxahayac) {
                 navak_spitak_2.animate().translationXBy(imageRamkaNavak_uxxahayac[num].getLeft()
                         - spitak_navak_2_left + 10).translationYBy(
                         imageRamkaNavak_uxxahayac[num].getTop() - spitak_navak_2_top + 10).setDuration(300);

                 spitak_navak_2_left += imageRamkaNavak_uxxahayac[num].getLeft() - spitak_navak_2_left + 10;
                 spitak_navak_2_top += imageRamkaNavak_uxxahayac[num].getTop() - spitak_navak_2_top + 10;
             }
             else
             {
                 navak_spitak_2.animate().translationXBy(imageRamkaNavak_horizonakan[num].getLeft()
                         - spitak_navak_2_left + 10).translationYBy(
                         imageRamkaNavak_horizonakan[num].getTop() - spitak_navak_2_top + 10).setDuration(300);

                 spitak_navak_2_left += imageRamkaNavak_horizonakan[num].getLeft() - spitak_navak_2_left + 10;
                 spitak_navak_2_top += imageRamkaNavak_horizonakan[num].getTop() - spitak_navak_2_top + 10;
             }
             imageClickedColor=false;
             qayl_spitak_navak_2=false;
         }
         else if (imageClicked.equals("spitak_navak_3")) {

             if (horizonakan_uxxahayac) {
                 zinvor_spitak_1.animate().translationXBy(imageRamkaNavak_uxxahayac[num].getLeft()
                         - spitak_zinvor_1_left + 10).translationYBy(
                         imageRamkaNavak_uxxahayac[num].getTop() - spitak_zinvor_1_top + 10).setDuration(300);

                 spitak_zinvor_1_left += imageRamkaNavak_uxxahayac[num].getLeft() - spitak_zinvor_1_left + 10;
                 spitak_zinvor_1_top += imageRamkaNavak_uxxahayac[num].getTop() - spitak_zinvor_1_top + 10;
             }
             else
             {
                 zinvor_spitak_1.animate().translationXBy(imageRamkaNavak_horizonakan[num].getLeft()
                         - spitak_zinvor_1_left + 10).translationYBy(
                         imageRamkaNavak_horizonakan[num].getTop() - spitak_zinvor_1_top + 10).setDuration(300);

                 spitak_zinvor_1_left += imageRamkaNavak_horizonakan[num].getLeft() - spitak_zinvor_1_left + 10;
                 spitak_zinvor_1_top += imageRamkaNavak_horizonakan[num].getTop() - spitak_zinvor_1_top + 10;
             }
             imageClickedColor=false;
         }
         else if (imageClicked.equals("spitak_navak_4")) {

             if (horizonakan_uxxahayac) {
                 zinvor_spitak_2.animate().translationXBy(imageRamkaNavak_uxxahayac[num].getLeft()
                         - spitak_zinvor_2_left + 10).translationYBy(
                         imageRamkaNavak_uxxahayac[num].getTop() - spitak_zinvor_2_top + 10).setDuration(300);

                 spitak_zinvor_2_left += imageRamkaNavak_uxxahayac[num].getLeft() - spitak_zinvor_2_left + 10;
                 spitak_zinvor_2_top += imageRamkaNavak_uxxahayac[num].getTop() - spitak_zinvor_2_top + 10;
             }
             else
             {
                 zinvor_spitak_2.animate().translationXBy(imageRamkaNavak_horizonakan[num].getLeft()
                         - spitak_zinvor_2_left + 10).translationYBy(
                         imageRamkaNavak_horizonakan[num].getTop() - spitak_zinvor_2_top + 10).setDuration(300);

                 spitak_zinvor_2_left += imageRamkaNavak_horizonakan[num].getLeft() - spitak_zinvor_2_left + 10;
                 spitak_zinvor_2_top += imageRamkaNavak_horizonakan[num].getTop() - spitak_zinvor_2_top + 10;
             }
             imageClickedColor=false;
         }
         else if (imageClicked.equals("spitak_navak_5")) {

             if (horizonakan_uxxahayac) {
                 zinvor_spitak_3.animate().translationXBy(imageRamkaNavak_uxxahayac[num].getLeft()
                         - spitak_zinvor_3_left + 10).translationYBy(
                         imageRamkaNavak_uxxahayac[num].getTop() - spitak_zinvor_3_top + 10).setDuration(300);

                 spitak_zinvor_3_left += imageRamkaNavak_uxxahayac[num].getLeft() - spitak_zinvor_3_left + 10;
                 spitak_zinvor_3_top += imageRamkaNavak_uxxahayac[num].getTop() - spitak_zinvor_3_top + 10;
             }
             else
             {
                 zinvor_spitak_3.animate().translationXBy(imageRamkaNavak_horizonakan[num].getLeft()
                         - spitak_zinvor_3_left + 10).translationYBy(
                         imageRamkaNavak_horizonakan[num].getTop() - spitak_zinvor_3_top + 10).setDuration(300);

                 spitak_zinvor_3_left += imageRamkaNavak_horizonakan[num].getLeft() - spitak_zinvor_3_left + 10;
                 spitak_zinvor_3_top += imageRamkaNavak_horizonakan[num].getTop() - spitak_zinvor_3_top + 10;
             }
             imageClickedColor=false;
         }
         else if (imageClicked.equals("spitak_navak_6")) {

             if (horizonakan_uxxahayac) {
                 zinvor_spitak_4.animate().translationXBy(imageRamkaNavak_uxxahayac[num].getLeft()
                         - spitak_zinvor_4_left + 10).translationYBy(
                         imageRamkaNavak_uxxahayac[num].getTop() - spitak_zinvor_4_top + 10).setDuration(300);

                 spitak_zinvor_4_left += imageRamkaNavak_uxxahayac[num].getLeft() - spitak_zinvor_4_left + 10;
                 spitak_zinvor_4_top += imageRamkaNavak_uxxahayac[num].getTop() - spitak_zinvor_4_top + 10;
             }
             else
             {
                 zinvor_spitak_4.animate().translationXBy(imageRamkaNavak_horizonakan[num].getLeft()
                         - spitak_zinvor_4_left + 10).translationYBy(
                         imageRamkaNavak_horizonakan[num].getTop() - spitak_zinvor_4_top + 10).setDuration(300);

                 spitak_zinvor_4_left += imageRamkaNavak_horizonakan[num].getLeft() - spitak_zinvor_4_left + 10;
                 spitak_zinvor_4_top += imageRamkaNavak_horizonakan[num].getTop() - spitak_zinvor_4_top + 10;
             }
             imageClickedColor=false;
         }
         else if (imageClicked.equals("spitak_navak_7")) {

             if (horizonakan_uxxahayac) {
                 zinvor_spitak_5.animate().translationXBy(imageRamkaNavak_uxxahayac[num].getLeft()
                         - spitak_zinvor_5_left + 10).translationYBy(
                         imageRamkaNavak_uxxahayac[num].getTop() - spitak_zinvor_5_top + 10).setDuration(300);

                 spitak_zinvor_5_left += imageRamkaNavak_uxxahayac[num].getLeft() - spitak_zinvor_5_left + 10;
                 spitak_zinvor_5_top += imageRamkaNavak_uxxahayac[num].getTop() - spitak_zinvor_5_top + 10;
             }
             else
             {
                 zinvor_spitak_5.animate().translationXBy(imageRamkaNavak_horizonakan[num].getLeft()
                         - spitak_zinvor_5_left + 10).translationYBy(
                         imageRamkaNavak_horizonakan[num].getTop() - spitak_zinvor_5_top + 10).setDuration(300);

                 spitak_zinvor_5_left += imageRamkaNavak_horizonakan[num].getLeft() - spitak_zinvor_5_left + 10;
                 spitak_zinvor_5_top += imageRamkaNavak_horizonakan[num].getTop() - spitak_zinvor_5_top + 10;
             }
             imageClickedColor=false;
         }
         else if (imageClicked.equals("spitak_navak_8")) {

             if (horizonakan_uxxahayac) {
                 zinvor_spitak_6.animate().translationXBy(imageRamkaNavak_uxxahayac[num].getLeft()
                         - spitak_zinvor_6_left + 10).translationYBy(
                         imageRamkaNavak_uxxahayac[num].getTop() - spitak_zinvor_6_top + 10).setDuration(300);

                 spitak_zinvor_6_left += imageRamkaNavak_uxxahayac[num].getLeft() - spitak_zinvor_6_left + 10;
                 spitak_zinvor_6_top += imageRamkaNavak_uxxahayac[num].getTop() - spitak_zinvor_6_top + 10;
             }
             else
             {
                 zinvor_spitak_6.animate().translationXBy(imageRamkaNavak_horizonakan[num].getLeft()
                         - spitak_zinvor_6_left + 10).translationYBy(
                         imageRamkaNavak_horizonakan[num].getTop() - spitak_zinvor_6_top + 10).setDuration(300);

                 spitak_zinvor_6_left += imageRamkaNavak_horizonakan[num].getLeft() - spitak_zinvor_6_left + 10;
                 spitak_zinvor_6_top += imageRamkaNavak_horizonakan[num].getTop() - spitak_zinvor_6_top + 10;
             }
             imageClickedColor=false;
         }
         else if (imageClicked.equals("spitak_navak_9")) {

             if (horizonakan_uxxahayac) {
                 zinvor_spitak_7.animate().translationXBy(imageRamkaNavak_uxxahayac[num].getLeft()
                         - spitak_zinvor_7_left + 10).translationYBy(
                         imageRamkaNavak_uxxahayac[num].getTop() - spitak_zinvor_7_top + 10).setDuration(300);

                 spitak_zinvor_7_left += imageRamkaNavak_uxxahayac[num].getLeft() - spitak_zinvor_7_left + 10;
                 spitak_zinvor_7_top += imageRamkaNavak_uxxahayac[num].getTop() - spitak_zinvor_7_top + 10;
             }
             else
             {
                 zinvor_spitak_7.animate().translationXBy(imageRamkaNavak_horizonakan[num].getLeft()
                         - spitak_zinvor_7_left + 10).translationYBy(
                         imageRamkaNavak_horizonakan[num].getTop() - spitak_zinvor_7_top + 10).setDuration(300);

                 spitak_zinvor_7_left += imageRamkaNavak_horizonakan[num].getLeft() - spitak_zinvor_7_left + 10;
                 spitak_zinvor_7_top += imageRamkaNavak_horizonakan[num].getTop() - spitak_zinvor_7_top + 10;
             }
             imageClickedColor=false;
         }
         else if (imageClicked.equals("spitak_navak_0")) {

             if (horizonakan_uxxahayac) {
                 zinvor_spitak_8.animate().translationXBy(imageRamkaNavak_uxxahayac[num].getLeft()
                         - spitak_zinvor_8_left + 10).translationYBy(
                         imageRamkaNavak_uxxahayac[num].getTop() - spitak_zinvor_8_top + 10).setDuration(300);

                 spitak_zinvor_8_left += imageRamkaNavak_uxxahayac[num].getLeft() - spitak_zinvor_8_left + 10;
                 spitak_zinvor_8_top += imageRamkaNavak_uxxahayac[num].getTop() - spitak_zinvor_8_top + 10;
             }
             else
             {
                 zinvor_spitak_8.animate().translationXBy(imageRamkaNavak_horizonakan[num].getLeft()
                         - spitak_zinvor_8_left + 10).translationYBy(
                         imageRamkaNavak_horizonakan[num].getTop() - spitak_zinvor_8_top + 10).setDuration(300);

                 spitak_zinvor_8_left += imageRamkaNavak_horizonakan[num].getLeft() - spitak_zinvor_8_left + 10;
                 spitak_zinvor_8_top += imageRamkaNavak_horizonakan[num].getTop() - spitak_zinvor_8_top + 10;
             }
             imageClickedColor=false;
         }

         //------------------sev_Navak---------------------------------------------------------------------------------
         else if (imageClicked.equals("sev_navak_1")) {

             if (horizonakan_uxxahayac) {
                 navak_sev_1.animate().translationXBy(imageRamkaNavak_uxxahayac[num].getLeft()
                         - sev_navak_1_left + 10).translationYBy(
                         imageRamkaNavak_uxxahayac[num].getTop() - sev_navak_1_top + 10).setDuration(300);

                 sev_navak_1_left += imageRamkaNavak_uxxahayac[num].getLeft() - sev_navak_1_left + 10;
                 sev_navak_1_top += imageRamkaNavak_uxxahayac[num].getTop() - sev_navak_1_top + 10;
             }
             else
             {
                 navak_sev_1.animate().translationXBy(imageRamkaNavak_horizonakan[num].getLeft()
                         - sev_navak_1_left + 10).translationYBy(
                         imageRamkaNavak_horizonakan[num].getTop() - sev_navak_1_top + 10).setDuration(300);

                 sev_navak_1_left += imageRamkaNavak_horizonakan[num].getLeft() - sev_navak_1_left + 10;
                 sev_navak_1_top += imageRamkaNavak_horizonakan[num].getTop() - sev_navak_1_top + 10;
             }
             imageClickedColor=true;
             qayl_sev_navak_1=false;
         }
         else if (imageClicked.equals("sev_navak_2")) {

             if (horizonakan_uxxahayac) {
                 navak_sev_2.animate().translationXBy(imageRamkaNavak_uxxahayac[num].getLeft()
                         - sev_navak_2_left + 10).translationYBy(
                         imageRamkaNavak_uxxahayac[num].getTop() - sev_navak_2_top + 10).setDuration(300);

                 sev_navak_2_left += imageRamkaNavak_uxxahayac[num].getLeft() - sev_navak_2_left + 10;
                 sev_navak_2_top += imageRamkaNavak_uxxahayac[num].getTop() - sev_navak_2_top + 10;
             }
             else
             {
                 navak_sev_2.animate().translationXBy(imageRamkaNavak_horizonakan[num].getLeft()
                         - sev_navak_2_left + 10).translationYBy(
                         imageRamkaNavak_horizonakan[num].getTop() - sev_navak_2_top + 10).setDuration(300);

                 sev_navak_2_left += imageRamkaNavak_horizonakan[num].getLeft() - sev_navak_2_left + 10;
                 sev_navak_2_top += imageRamkaNavak_horizonakan[num].getTop() - sev_navak_2_top + 10;
             }
             imageClickedColor=true;
             qayl_sev_navak_2=false;
         }
         else if (imageClicked.equals("sev_navak_3")) {

             if (horizonakan_uxxahayac) {
                 zinvor_sev_1.animate().translationXBy(imageRamkaNavak_uxxahayac[num].getLeft()
                         - sev_zinvor_1_left + 10).translationYBy(
                         imageRamkaNavak_uxxahayac[num].getTop() - sev_zinvor_1_top + 10).setDuration(300);

                 sev_zinvor_1_left += imageRamkaNavak_uxxahayac[num].getLeft() - sev_zinvor_1_left + 10;
                 sev_zinvor_1_top += imageRamkaNavak_uxxahayac[num].getTop() - sev_zinvor_1_top + 10;
             }
             else
             {
                 zinvor_sev_1.animate().translationXBy(imageRamkaNavak_horizonakan[num].getLeft()
                         - sev_zinvor_1_left + 10).translationYBy(
                         imageRamkaNavak_horizonakan[num].getTop() - sev_zinvor_1_top + 10).setDuration(300);

                 sev_zinvor_1_left += imageRamkaNavak_horizonakan[num].getLeft() - sev_zinvor_1_left + 10;
                 sev_zinvor_1_top += imageRamkaNavak_horizonakan[num].getTop() - sev_zinvor_1_top + 10;
             }
             imageClickedColor=true;
         }
         else if (imageClicked.equals("sev_navak_4")) {

             if (horizonakan_uxxahayac) {
                 zinvor_sev_2.animate().translationXBy(imageRamkaNavak_uxxahayac[num].getLeft()
                         - sev_zinvor_2_left + 10).translationYBy(
                         imageRamkaNavak_uxxahayac[num].getTop() - sev_zinvor_2_top + 10).setDuration(300);

                 sev_zinvor_2_left += imageRamkaNavak_uxxahayac[num].getLeft() - sev_zinvor_2_left + 10;
                 sev_zinvor_2_top += imageRamkaNavak_uxxahayac[num].getTop() - sev_zinvor_2_top + 10;
             }
             else
             {
                 zinvor_sev_2.animate().translationXBy(imageRamkaNavak_horizonakan[num].getLeft()
                         - sev_zinvor_2_left + 10).translationYBy(
                         imageRamkaNavak_horizonakan[num].getTop() - sev_zinvor_2_top + 10).setDuration(300);

                 sev_zinvor_2_left += imageRamkaNavak_horizonakan[num].getLeft() - sev_zinvor_2_left + 10;
                 sev_zinvor_2_top += imageRamkaNavak_horizonakan[num].getTop() - sev_zinvor_2_top + 10;
             }
             imageClickedColor=true;
         }
         else if (imageClicked.equals("sev_navak_5")) {

             if (horizonakan_uxxahayac) {
                 zinvor_sev_3.animate().translationXBy(imageRamkaNavak_uxxahayac[num].getLeft()
                         - sev_zinvor_3_left + 10).translationYBy(
                         imageRamkaNavak_uxxahayac[num].getTop() - sev_zinvor_3_top + 10).setDuration(300);

                 sev_zinvor_3_left += imageRamkaNavak_uxxahayac[num].getLeft() - sev_zinvor_3_left + 10;
                 sev_zinvor_3_top += imageRamkaNavak_uxxahayac[num].getTop() - sev_zinvor_3_top + 10;
             }
             else
             {
                 zinvor_sev_3.animate().translationXBy(imageRamkaNavak_horizonakan[num].getLeft()
                         - sev_zinvor_3_left + 10).translationYBy(
                         imageRamkaNavak_horizonakan[num].getTop() - sev_zinvor_3_top + 10).setDuration(300);

                 sev_zinvor_3_left += imageRamkaNavak_horizonakan[num].getLeft() - sev_zinvor_3_left + 10;
                 sev_zinvor_3_top += imageRamkaNavak_horizonakan[num].getTop() - sev_zinvor_3_top + 10;
             }
             imageClickedColor=true;
         }
         else if (imageClicked.equals("sev_navak_6")) {

             if (horizonakan_uxxahayac) {
                 zinvor_sev_4.animate().translationXBy(imageRamkaNavak_uxxahayac[num].getLeft()
                         - sev_zinvor_4_left + 10).translationYBy(
                         imageRamkaNavak_uxxahayac[num].getTop() - sev_zinvor_4_top + 10).setDuration(300);

                 sev_zinvor_4_left += imageRamkaNavak_uxxahayac[num].getLeft() - sev_zinvor_4_left + 10;
                 sev_zinvor_4_top += imageRamkaNavak_uxxahayac[num].getTop() - sev_zinvor_4_top + 10;
             }
             else
             {
                 zinvor_sev_4.animate().translationXBy(imageRamkaNavak_horizonakan[num].getLeft()
                         - sev_zinvor_4_left + 10).translationYBy(
                         imageRamkaNavak_horizonakan[num].getTop() - sev_zinvor_4_top + 10).setDuration(300);

                 sev_zinvor_4_left += imageRamkaNavak_horizonakan[num].getLeft() - sev_zinvor_4_left + 10;
                 sev_zinvor_4_top += imageRamkaNavak_horizonakan[num].getTop() - sev_zinvor_4_top + 10;
             }
             imageClickedColor=true;
         }
         else if (imageClicked.equals("sev_navak_7")) {

             if (horizonakan_uxxahayac) {
                 zinvor_sev_5.animate().translationXBy(imageRamkaNavak_uxxahayac[num].getLeft()
                         - sev_zinvor_5_left + 10).translationYBy(
                         imageRamkaNavak_uxxahayac[num].getTop() - sev_zinvor_5_top + 10).setDuration(300);

                 sev_zinvor_5_left += imageRamkaNavak_uxxahayac[num].getLeft() - sev_zinvor_5_left + 10;
                 sev_zinvor_5_top += imageRamkaNavak_uxxahayac[num].getTop() - sev_zinvor_5_top + 10;
             }
             else
             {
                 zinvor_sev_5.animate().translationXBy(imageRamkaNavak_horizonakan[num].getLeft()
                         - sev_zinvor_5_left + 10).translationYBy(
                         imageRamkaNavak_horizonakan[num].getTop() - sev_zinvor_5_top + 10).setDuration(300);

                 sev_zinvor_5_left += imageRamkaNavak_horizonakan[num].getLeft() - sev_zinvor_5_left + 10;
                 sev_zinvor_5_top += imageRamkaNavak_horizonakan[num].getTop() - sev_zinvor_5_top + 10;
             }
             imageClickedColor=true;
         }
         else if (imageClicked.equals("sev_navak_8")) {

             if (horizonakan_uxxahayac) {
                 zinvor_sev_6.animate().translationXBy(imageRamkaNavak_uxxahayac[num].getLeft()
                         - sev_zinvor_6_left + 10).translationYBy(
                         imageRamkaNavak_uxxahayac[num].getTop() - sev_zinvor_6_top + 10).setDuration(300);

                 sev_zinvor_6_left += imageRamkaNavak_uxxahayac[num].getLeft() - sev_zinvor_6_left + 10;
                 sev_zinvor_6_top += imageRamkaNavak_uxxahayac[num].getTop() - sev_zinvor_6_top + 10;
             }
             else
             {
                 zinvor_sev_6.animate().translationXBy(imageRamkaNavak_horizonakan[num].getLeft()
                         - sev_zinvor_6_left + 10).translationYBy(
                         imageRamkaNavak_horizonakan[num].getTop() - sev_zinvor_6_top + 10).setDuration(300);

                 sev_zinvor_6_left += imageRamkaNavak_horizonakan[num].getLeft() - sev_zinvor_6_left + 10;
                 sev_zinvor_6_top += imageRamkaNavak_horizonakan[num].getTop() - sev_zinvor_6_top + 10;
             }
             imageClickedColor=true;
         }
         else if (imageClicked.equals("sev_navak_9")) {

             if (horizonakan_uxxahayac) {
                 zinvor_sev_7.animate().translationXBy(imageRamkaNavak_uxxahayac[num].getLeft()
                         - sev_zinvor_7_left + 10).translationYBy(
                         imageRamkaNavak_uxxahayac[num].getTop() - sev_zinvor_7_top + 10).setDuration(300);

                 sev_zinvor_7_left += imageRamkaNavak_uxxahayac[num].getLeft() - sev_zinvor_7_left + 10;
                 sev_zinvor_7_top += imageRamkaNavak_uxxahayac[num].getTop() - sev_zinvor_7_top + 10;
             }
             else
             {
                 zinvor_sev_7.animate().translationXBy(imageRamkaNavak_horizonakan[num].getLeft()
                         - sev_zinvor_7_left + 10).translationYBy(
                         imageRamkaNavak_horizonakan[num].getTop() - sev_zinvor_7_top + 10).setDuration(300);

                 sev_zinvor_7_left += imageRamkaNavak_horizonakan[num].getLeft() - sev_zinvor_7_left + 10;
                 sev_zinvor_7_top += imageRamkaNavak_horizonakan[num].getTop() - sev_zinvor_7_top + 10;
             }
             imageClickedColor=true;
         }
         else if (imageClicked.equals("sev_navak_0")) {

             if (horizonakan_uxxahayac) {
                 zinvor_sev_8.animate().translationXBy(imageRamkaNavak_uxxahayac[num].getLeft()
                         - sev_zinvor_8_left + 10).translationYBy(
                         imageRamkaNavak_uxxahayac[num].getTop() - sev_zinvor_8_top + 10).setDuration(300);

                 sev_zinvor_8_left += imageRamkaNavak_uxxahayac[num].getLeft() - sev_zinvor_8_left + 10;
                 sev_zinvor_8_top += imageRamkaNavak_uxxahayac[num].getTop() - sev_zinvor_8_top + 10;
             }
             else
             {
                 zinvor_sev_8.animate().translationXBy(imageRamkaNavak_horizonakan[num].getLeft()
                         - sev_zinvor_8_left + 10).translationYBy(
                         imageRamkaNavak_horizonakan[num].getTop() - sev_zinvor_8_top + 10).setDuration(300);

                 sev_zinvor_8_left += imageRamkaNavak_horizonakan[num].getLeft() - sev_zinvor_8_left + 10;
                 sev_zinvor_8_top += imageRamkaNavak_horizonakan[num].getTop() - sev_zinvor_8_top + 10;
             }
             imageClickedColor=true;
         }

         else if (imageClicked.equals("spitak_taguhi")) {

             if (horizonakan_uxxahayac) {
                 taguhi_spitak.animate().translationXBy(imageRamkaNavak_uxxahayac[num].getLeft()
                         - spitak_taguhi_left + 10).translationYBy(
                         imageRamkaNavak_uxxahayac[num].getTop() - spitak_taguhi_top + 10).setDuration(300);

                 spitak_taguhi_left += imageRamkaNavak_uxxahayac[num].getLeft() - spitak_taguhi_left + 10;
                 spitak_taguhi_top += imageRamkaNavak_uxxahayac[num].getTop() - spitak_taguhi_top + 10;
             }
             else
             {
                 taguhi_spitak.animate().translationXBy(imageRamkaNavak_horizonakan[num].getLeft()
                         - spitak_taguhi_left + 10).translationYBy(
                         imageRamkaNavak_horizonakan[num].getTop() - spitak_taguhi_top + 10).setDuration(300);

                 spitak_taguhi_left += imageRamkaNavak_horizonakan[num].getLeft() - spitak_taguhi_left + 10;
                 spitak_taguhi_top += imageRamkaNavak_horizonakan[num].getTop() - spitak_taguhi_top + 10;
             }
             imageClickedColor=false;
         }
         else if (imageClicked.equals("spitak_taguhi_1")) {

             if (horizonakan_uxxahayac) {
                 zinvor_spitak_1.animate().translationXBy(imageRamkaNavak_uxxahayac[num].getLeft()
                         - spitak_zinvor_1_left + 10).translationYBy(
                         imageRamkaNavak_uxxahayac[num].getTop() - spitak_zinvor_1_top + 10).setDuration(300);

                 spitak_zinvor_1_left += imageRamkaNavak_uxxahayac[num].getLeft() - spitak_zinvor_1_left + 10;
                 spitak_zinvor_1_top += imageRamkaNavak_uxxahayac[num].getTop() - spitak_zinvor_1_top + 10;
             }
             else
             {
                 zinvor_spitak_1.animate().translationXBy(imageRamkaNavak_horizonakan[num].getLeft()
                         - spitak_zinvor_1_left + 10).translationYBy(
                         imageRamkaNavak_horizonakan[num].getTop() - spitak_zinvor_1_top + 10).setDuration(300);

                 spitak_zinvor_1_left += imageRamkaNavak_horizonakan[num].getLeft() - spitak_zinvor_1_left + 10;
                 spitak_zinvor_1_top += imageRamkaNavak_horizonakan[num].getTop() - spitak_zinvor_1_top + 10;
             }
             imageClickedColor=false;
         }
         else if (imageClicked.equals("spitak_taguhi_2")) {

             if (horizonakan_uxxahayac) {
                 zinvor_spitak_2.animate().translationXBy(imageRamkaNavak_uxxahayac[num].getLeft()
                         - spitak_zinvor_2_left + 10).translationYBy(
                         imageRamkaNavak_uxxahayac[num].getTop() - spitak_zinvor_2_top + 10).setDuration(300);

                 spitak_zinvor_2_left += imageRamkaNavak_uxxahayac[num].getLeft() - spitak_zinvor_2_left + 10;
                 spitak_zinvor_2_top += imageRamkaNavak_uxxahayac[num].getTop() - spitak_zinvor_2_top + 10;
             }
             else
             {
                 zinvor_spitak_2.animate().translationXBy(imageRamkaNavak_horizonakan[num].getLeft()
                         - spitak_zinvor_2_left + 10).translationYBy(
                         imageRamkaNavak_horizonakan[num].getTop() - spitak_zinvor_2_top + 10).setDuration(300);

                 spitak_zinvor_2_left += imageRamkaNavak_horizonakan[num].getLeft() - spitak_zinvor_2_left + 10;
                 spitak_zinvor_2_top += imageRamkaNavak_horizonakan[num].getTop() - spitak_zinvor_2_top + 10;
             }
             imageClickedColor=false;
         }
         else if (imageClicked.equals("spitak_taguhi_3")) {

             if (horizonakan_uxxahayac) {
                 zinvor_spitak_3.animate().translationXBy(imageRamkaNavak_uxxahayac[num].getLeft()
                         - spitak_zinvor_3_left + 10).translationYBy(
                         imageRamkaNavak_uxxahayac[num].getTop() - spitak_zinvor_3_top + 10).setDuration(300);

                 spitak_zinvor_3_left += imageRamkaNavak_uxxahayac[num].getLeft() - spitak_zinvor_3_left + 10;
                 spitak_zinvor_3_top += imageRamkaNavak_uxxahayac[num].getTop() - spitak_zinvor_3_top + 10;
             }
             else
             {
                 zinvor_spitak_3.animate().translationXBy(imageRamkaNavak_horizonakan[num].getLeft()
                         - spitak_zinvor_3_left + 10).translationYBy(
                         imageRamkaNavak_horizonakan[num].getTop() - spitak_zinvor_3_top + 10).setDuration(300);

                 spitak_zinvor_3_left += imageRamkaNavak_horizonakan[num].getLeft() - spitak_zinvor_3_left + 10;
                 spitak_zinvor_3_top += imageRamkaNavak_horizonakan[num].getTop() - spitak_zinvor_3_top + 10;
             }
             imageClickedColor=false;
         }
         else if (imageClicked.equals("spitak_taguhi_4")) {

             if (horizonakan_uxxahayac) {
                 zinvor_spitak_4.animate().translationXBy(imageRamkaNavak_uxxahayac[num].getLeft()
                         - spitak_zinvor_4_left + 10).translationYBy(
                         imageRamkaNavak_uxxahayac[num].getTop() - spitak_zinvor_4_top + 10).setDuration(300);

                 spitak_zinvor_4_left += imageRamkaNavak_uxxahayac[num].getLeft() - spitak_zinvor_4_left + 10;
                 spitak_zinvor_4_top += imageRamkaNavak_uxxahayac[num].getTop() - spitak_zinvor_4_top + 10;
             }
             else
             {
                 zinvor_spitak_4.animate().translationXBy(imageRamkaNavak_horizonakan[num].getLeft()
                         - spitak_zinvor_4_left + 10).translationYBy(
                         imageRamkaNavak_horizonakan[num].getTop() - spitak_zinvor_4_top + 10).setDuration(300);

                 spitak_zinvor_4_left += imageRamkaNavak_horizonakan[num].getLeft() - spitak_zinvor_4_left + 10;
                 spitak_zinvor_4_top += imageRamkaNavak_horizonakan[num].getTop() - spitak_zinvor_4_top + 10;
             }
             imageClickedColor=false;
         }
         else if (imageClicked.equals("spitak_taguhi_5")) {

             if (horizonakan_uxxahayac) {
                 zinvor_spitak_5.animate().translationXBy(imageRamkaNavak_uxxahayac[num].getLeft()
                         - spitak_zinvor_5_left + 10).translationYBy(
                         imageRamkaNavak_uxxahayac[num].getTop() - spitak_zinvor_5_top + 10).setDuration(300);

                 spitak_zinvor_5_left += imageRamkaNavak_uxxahayac[num].getLeft() - spitak_zinvor_5_left + 10;
                 spitak_zinvor_5_top += imageRamkaNavak_uxxahayac[num].getTop() - spitak_zinvor_5_top + 10;
             }
             else
             {
                 zinvor_spitak_5.animate().translationXBy(imageRamkaNavak_horizonakan[num].getLeft()
                         - spitak_zinvor_5_left + 10).translationYBy(
                         imageRamkaNavak_horizonakan[num].getTop() - spitak_zinvor_5_top + 10).setDuration(300);

                 spitak_zinvor_5_left += imageRamkaNavak_horizonakan[num].getLeft() - spitak_zinvor_5_left + 10;
                 spitak_zinvor_5_top += imageRamkaNavak_horizonakan[num].getTop() - spitak_zinvor_5_top + 10;
             }
             imageClickedColor=false;
         }
         else if (imageClicked.equals("spitak_taguhi_6")) {

             if (horizonakan_uxxahayac) {
                 zinvor_spitak_6.animate().translationXBy(imageRamkaNavak_uxxahayac[num].getLeft()
                         - spitak_zinvor_6_left + 10).translationYBy(
                         imageRamkaNavak_uxxahayac[num].getTop() - spitak_zinvor_6_top + 10).setDuration(300);

                 spitak_zinvor_6_left += imageRamkaNavak_uxxahayac[num].getLeft() - spitak_zinvor_6_left + 10;
                 spitak_zinvor_6_top += imageRamkaNavak_uxxahayac[num].getTop() - spitak_zinvor_6_top + 10;
             }
             else
             {
                 zinvor_spitak_6.animate().translationXBy(imageRamkaNavak_horizonakan[num].getLeft()
                         - spitak_zinvor_6_left + 10).translationYBy(
                         imageRamkaNavak_horizonakan[num].getTop() - spitak_zinvor_6_top + 10).setDuration(300);

                 spitak_zinvor_6_left += imageRamkaNavak_horizonakan[num].getLeft() - spitak_zinvor_6_left + 10;
                 spitak_zinvor_6_top += imageRamkaNavak_horizonakan[num].getTop() - spitak_zinvor_6_top + 10;
             }
             imageClickedColor=false;
         }
         else if (imageClicked.equals("spitak_taguhi_7")) {

             if (horizonakan_uxxahayac) {
                 zinvor_spitak_7.animate().translationXBy(imageRamkaNavak_uxxahayac[num].getLeft()
                         - spitak_zinvor_7_left + 10).translationYBy(
                         imageRamkaNavak_uxxahayac[num].getTop() - spitak_zinvor_7_top + 10).setDuration(300);

                 spitak_zinvor_7_left += imageRamkaNavak_uxxahayac[num].getLeft() - spitak_zinvor_7_left + 10;
                 spitak_zinvor_7_top += imageRamkaNavak_uxxahayac[num].getTop() - spitak_zinvor_7_top + 10;
             }
             else
             {
                 zinvor_spitak_7.animate().translationXBy(imageRamkaNavak_horizonakan[num].getLeft()
                         - spitak_zinvor_7_left + 10).translationYBy(
                         imageRamkaNavak_horizonakan[num].getTop() - spitak_zinvor_7_top + 10).setDuration(300);

                 spitak_zinvor_7_left += imageRamkaNavak_horizonakan[num].getLeft() - spitak_zinvor_7_left + 10;
                 spitak_zinvor_7_top += imageRamkaNavak_horizonakan[num].getTop() - spitak_zinvor_7_top + 10;
             }
             imageClickedColor=false;
         }
         else if (imageClicked.equals("spitak_taguhi_8")) {

             if (horizonakan_uxxahayac) {
                 zinvor_spitak_8.animate().translationXBy(imageRamkaNavak_uxxahayac[num].getLeft()
                         - spitak_zinvor_8_left + 10).translationYBy(
                         imageRamkaNavak_uxxahayac[num].getTop() - spitak_zinvor_8_top + 10).setDuration(300);

                 spitak_zinvor_8_left += imageRamkaNavak_uxxahayac[num].getLeft() - spitak_zinvor_8_left + 10;
                 spitak_zinvor_8_top += imageRamkaNavak_uxxahayac[num].getTop() - spitak_zinvor_8_top + 10;
             }
             else
             {
                 zinvor_spitak_8.animate().translationXBy(imageRamkaNavak_horizonakan[num].getLeft()
                         - spitak_zinvor_8_left + 10).translationYBy(
                         imageRamkaNavak_horizonakan[num].getTop() - spitak_zinvor_8_top + 10).setDuration(300);

                 spitak_zinvor_8_left += imageRamkaNavak_horizonakan[num].getLeft() - spitak_zinvor_8_left + 10;
                 spitak_zinvor_8_top += imageRamkaNavak_horizonakan[num].getTop() - spitak_zinvor_8_top + 10;
             }
             imageClickedColor=false;
         }


         else if (imageClicked.equals("sev_taguhi")) {

             if (horizonakan_uxxahayac) {
                 taguhi_sev.animate().translationXBy(imageRamkaNavak_uxxahayac[num].getLeft()
                         - sev_taguhi_left + 10).translationYBy(
                         imageRamkaNavak_uxxahayac[num].getTop() - sev_taguhi_top + 10).setDuration(300);

                 sev_taguhi_left += imageRamkaNavak_uxxahayac[num].getLeft() - sev_taguhi_left + 10;
                 sev_taguhi_top += imageRamkaNavak_uxxahayac[num].getTop() - sev_taguhi_top + 10;
             }
             else
             {
                 taguhi_sev.animate().translationXBy(imageRamkaNavak_horizonakan[num].getLeft()
                         - sev_taguhi_left + 10).translationYBy(
                         imageRamkaNavak_horizonakan[num].getTop() - sev_taguhi_top + 10).setDuration(300);

                 sev_taguhi_left += imageRamkaNavak_horizonakan[num].getLeft() - sev_taguhi_left + 10;
                 sev_taguhi_top += imageRamkaNavak_horizonakan[num].getTop() - sev_taguhi_top + 10;
             }
             imageClickedColor=true;
         }
         else if (imageClicked.equals("sev_taguhi_1")) {

             if (horizonakan_uxxahayac) {
                 zinvor_sev_1.animate().translationXBy(imageRamkaNavak_uxxahayac[num].getLeft()
                         - sev_zinvor_1_left + 10).translationYBy(
                         imageRamkaNavak_uxxahayac[num].getTop() - sev_zinvor_1_top + 10).setDuration(300);

                 sev_zinvor_1_left += imageRamkaNavak_uxxahayac[num].getLeft() - sev_zinvor_1_left + 10;
                 sev_zinvor_1_top += imageRamkaNavak_uxxahayac[num].getTop() - sev_zinvor_1_top + 10;
             }
             else
             {
                 zinvor_sev_1.animate().translationXBy(imageRamkaNavak_horizonakan[num].getLeft()
                         - sev_zinvor_1_left + 10).translationYBy(
                         imageRamkaNavak_horizonakan[num].getTop() - sev_zinvor_1_top + 10).setDuration(300);

                 sev_zinvor_1_left += imageRamkaNavak_horizonakan[num].getLeft() - sev_zinvor_1_left + 10;
                 sev_zinvor_1_top += imageRamkaNavak_horizonakan[num].getTop() - sev_zinvor_1_top + 10;
             }
             imageClickedColor=true;
         }
         else if (imageClicked.equals("sev_taguhi_2")) {

             if (horizonakan_uxxahayac) {
                 zinvor_sev_2.animate().translationXBy(imageRamkaNavak_uxxahayac[num].getLeft()
                         - sev_zinvor_2_left + 10).translationYBy(
                         imageRamkaNavak_uxxahayac[num].getTop() - sev_zinvor_2_top + 10).setDuration(300);

                 sev_zinvor_2_left += imageRamkaNavak_uxxahayac[num].getLeft() - sev_zinvor_2_left + 10;
                 sev_zinvor_2_top += imageRamkaNavak_uxxahayac[num].getTop() - sev_zinvor_2_top + 10;
             }
             else
             {
                 zinvor_sev_2.animate().translationXBy(imageRamkaNavak_horizonakan[num].getLeft()
                         - sev_zinvor_2_left + 10).translationYBy(
                         imageRamkaNavak_horizonakan[num].getTop() - sev_zinvor_2_top + 10).setDuration(300);

                 sev_zinvor_2_left += imageRamkaNavak_horizonakan[num].getLeft() - sev_zinvor_2_left + 10;
                 sev_zinvor_2_top += imageRamkaNavak_horizonakan[num].getTop() - sev_zinvor_2_top + 10;
             }
             imageClickedColor=true;
         }
         else if (imageClicked.equals("sev_taguhi_3")) {

             if (horizonakan_uxxahayac) {
                 zinvor_sev_3.animate().translationXBy(imageRamkaNavak_uxxahayac[num].getLeft()
                         - sev_zinvor_3_left + 10).translationYBy(
                         imageRamkaNavak_uxxahayac[num].getTop() - sev_zinvor_3_top + 10).setDuration(300);

                 sev_zinvor_3_left += imageRamkaNavak_uxxahayac[num].getLeft() - sev_zinvor_3_left + 10;
                 sev_zinvor_3_top += imageRamkaNavak_uxxahayac[num].getTop() - sev_zinvor_3_top + 10;
             }
             else
             {
                 zinvor_sev_3.animate().translationXBy(imageRamkaNavak_horizonakan[num].getLeft()
                         - sev_zinvor_3_left + 10).translationYBy(
                         imageRamkaNavak_horizonakan[num].getTop() - sev_zinvor_3_top + 10).setDuration(300);

                 sev_zinvor_3_left += imageRamkaNavak_horizonakan[num].getLeft() - sev_zinvor_3_left + 10;
                 sev_zinvor_3_top += imageRamkaNavak_horizonakan[num].getTop() - sev_zinvor_3_top + 10;
             }
             imageClickedColor=true;
         }
         else if (imageClicked.equals("sev_taguhi_4")) {

             if (horizonakan_uxxahayac) {
                 zinvor_sev_4.animate().translationXBy(imageRamkaNavak_uxxahayac[num].getLeft()
                         - sev_zinvor_4_left + 10).translationYBy(
                         imageRamkaNavak_uxxahayac[num].getTop() - sev_zinvor_4_top + 10).setDuration(300);

                 sev_zinvor_4_left += imageRamkaNavak_uxxahayac[num].getLeft() - sev_zinvor_4_left + 10;
                 sev_zinvor_4_top += imageRamkaNavak_uxxahayac[num].getTop() - sev_zinvor_4_top + 10;
             }
             else
             {
                 zinvor_sev_4.animate().translationXBy(imageRamkaNavak_horizonakan[num].getLeft()
                         - sev_zinvor_4_left + 10).translationYBy(
                         imageRamkaNavak_horizonakan[num].getTop() - sev_zinvor_4_top + 10).setDuration(300);

                 sev_zinvor_4_left += imageRamkaNavak_horizonakan[num].getLeft() - sev_zinvor_4_left + 10;
                 sev_zinvor_4_top += imageRamkaNavak_horizonakan[num].getTop() - sev_zinvor_4_top + 10;
             }
             imageClickedColor=true;
         }
         else if (imageClicked.equals("sev_taguhi_5")) {

             if (horizonakan_uxxahayac) {
                 zinvor_sev_5.animate().translationXBy(imageRamkaNavak_uxxahayac[num].getLeft()
                         - sev_zinvor_5_left + 10).translationYBy(
                         imageRamkaNavak_uxxahayac[num].getTop() - sev_zinvor_5_top + 10).setDuration(300);

                 sev_zinvor_5_left += imageRamkaNavak_uxxahayac[num].getLeft() - sev_zinvor_5_left + 10;
                 sev_zinvor_5_top += imageRamkaNavak_uxxahayac[num].getTop() - sev_zinvor_5_top + 10;
             }
             else
             {
                 zinvor_sev_5.animate().translationXBy(imageRamkaNavak_horizonakan[num].getLeft()
                         - sev_zinvor_5_left + 10).translationYBy(
                         imageRamkaNavak_horizonakan[num].getTop() - sev_zinvor_5_top + 10).setDuration(300);

                 sev_zinvor_5_left += imageRamkaNavak_horizonakan[num].getLeft() - sev_zinvor_5_left + 10;
                 sev_zinvor_5_top += imageRamkaNavak_horizonakan[num].getTop() - sev_zinvor_5_top + 10;
             }
             imageClickedColor=true;
         }
         else if (imageClicked.equals("sev_taguhi_6")) {

             if (horizonakan_uxxahayac) {
                 zinvor_sev_6.animate().translationXBy(imageRamkaNavak_uxxahayac[num].getLeft()
                         - sev_zinvor_6_left + 10).translationYBy(
                         imageRamkaNavak_uxxahayac[num].getTop() - sev_zinvor_6_top + 10).setDuration(300);

                 sev_zinvor_6_left += imageRamkaNavak_uxxahayac[num].getLeft() - sev_zinvor_6_left + 10;
                 sev_zinvor_6_top += imageRamkaNavak_uxxahayac[num].getTop() - sev_zinvor_6_top + 10;
             }
             else
             {
                 zinvor_sev_6.animate().translationXBy(imageRamkaNavak_horizonakan[num].getLeft()
                         - sev_zinvor_6_left + 10).translationYBy(
                         imageRamkaNavak_horizonakan[num].getTop() - sev_zinvor_6_top + 10).setDuration(300);

                 sev_zinvor_6_left += imageRamkaNavak_horizonakan[num].getLeft() - sev_zinvor_6_left + 10;
                 sev_zinvor_6_top += imageRamkaNavak_horizonakan[num].getTop() - sev_zinvor_6_top + 10;
             }
             imageClickedColor=true;
         }
         else if (imageClicked.equals("sev_taguhi_7")) {

             if (horizonakan_uxxahayac) {
                 zinvor_sev_7.animate().translationXBy(imageRamkaNavak_uxxahayac[num].getLeft()
                         - sev_zinvor_7_left + 10).translationYBy(
                         imageRamkaNavak_uxxahayac[num].getTop() - sev_zinvor_7_top + 10).setDuration(300);

                 sev_zinvor_7_left += imageRamkaNavak_uxxahayac[num].getLeft() - sev_zinvor_7_left + 10;
                 sev_zinvor_7_top += imageRamkaNavak_uxxahayac[num].getTop() - sev_zinvor_7_top + 10;
             }
             else
             {
                 zinvor_sev_7.animate().translationXBy(imageRamkaNavak_horizonakan[num].getLeft()
                         - sev_zinvor_7_left + 10).translationYBy(
                         imageRamkaNavak_horizonakan[num].getTop() - sev_zinvor_7_top + 10).setDuration(300);

                 sev_zinvor_7_left += imageRamkaNavak_horizonakan[num].getLeft() - sev_zinvor_7_left + 10;
                 sev_zinvor_7_top += imageRamkaNavak_horizonakan[num].getTop() - sev_zinvor_7_top + 10;
             }
             imageClickedColor=true;
         }
         else if (imageClicked.equals("sev_taguhi_8")) {

             if (horizonakan_uxxahayac) {
                 zinvor_sev_8.animate().translationXBy(imageRamkaNavak_uxxahayac[num].getLeft()
                         - sev_zinvor_8_left + 10).translationYBy(
                         imageRamkaNavak_uxxahayac[num].getTop() - sev_zinvor_8_top + 10).setDuration(300);

                 sev_zinvor_8_left += imageRamkaNavak_uxxahayac[num].getLeft() - sev_zinvor_8_left + 10;
                 sev_zinvor_8_top += imageRamkaNavak_uxxahayac[num].getTop() - sev_zinvor_8_top + 10;
             }
             else
             {
                 zinvor_sev_8.animate().translationXBy(imageRamkaNavak_horizonakan[num].getLeft()
                         - sev_zinvor_8_left + 10).translationYBy(
                         imageRamkaNavak_horizonakan[num].getTop() - sev_zinvor_8_top + 10).setDuration(300);

                 sev_zinvor_8_left += imageRamkaNavak_horizonakan[num].getLeft() - sev_zinvor_8_left + 10;
                 sev_zinvor_8_top += imageRamkaNavak_horizonakan[num].getTop() - sev_zinvor_8_top + 10;
             }
             imageClickedColor=true;
         }

         String s="";
         if (horizonakan_uxxahayac) {
             s = oponentImageString_uxxahayac[num];
             oponentImageString_uxxahayac[num]="";

         if (s.equals("sev_zinvor_1")) {
             zinvor_sev_1.setVisibility(View.GONE);
             matrixBord[num][view_j]="datark";
         }
         else if (s.equals("sev_zinvor_2")) {
             zinvor_sev_2.setVisibility(View.GONE);
             matrixBord[num][view_j]="datark";
         }
         else if (s.equals("sev_zinvor_3")) {
             zinvor_sev_3.setVisibility(View.GONE);
             matrixBord[num][view_j]="datark";
         }
         else if (s.equals("sev_zinvor_4")) {
             zinvor_sev_4.setVisibility(View.GONE);
             matrixBord[num][view_j]="datark";
         }
         else if (s.equals("sev_zinvor_5")) {
             zinvor_sev_5.setVisibility(View.GONE);
             matrixBord[num][view_j]="datark";

         }
         else if (s.equals("sev_zinvor_6")) {
             zinvor_sev_6.setVisibility(View.GONE);
             matrixBord[num][view_j]="datark";

         }
         else if (s.equals("sev_zinvor_7")) {
             zinvor_sev_7.setVisibility(View.GONE);
             matrixBord[num][view_j]="datark";

         }
         else if (s.equals("sev_zinvor_8")) {
             zinvor_sev_8.setVisibility(View.GONE);
             matrixBord[num][view_j]="datark";
         }
         else if (s.equals("sev_navak_1")) {
             navak_sev_1.setVisibility(View.GONE);
             matrixBord[num][view_j]="datark";
         }
         else if (s.equals("sev_navak_2")) {
             navak_sev_2.setVisibility(View.GONE);
             matrixBord[num][view_j]="datark";
         }
         else if (s.equals("sev_navak_3")) {
             zinvor_sev_1.setVisibility(View.GONE);
             matrixBord[num][view_j]="datark";
         }
         else if (s.equals("sev_navak_4")) {
             zinvor_sev_2.setVisibility(View.GONE);
             matrixBord[num][view_j]="datark";
         }
         else if (s.equals("sev_navak_5")) {
             zinvor_sev_3.setVisibility(View.GONE);
             matrixBord[num][view_j]="datark";
         }
         else if (s.equals("sev_navak_6")) {
             zinvor_sev_4.setVisibility(View.GONE);
             matrixBord[num][view_j]="datark";
         }
         else if (s.equals("sev_navak_7")) {
             zinvor_sev_5.setVisibility(View.GONE);
             matrixBord[num][view_j]="datark";
         }
         else if (s.equals("sev_navak_8")) {
             zinvor_sev_6.setVisibility(View.GONE);
             matrixBord[num][view_j]="datark";
         }
         else if (s.equals("sev_navak_9")) {
             zinvor_sev_7.setVisibility(View.GONE);
             matrixBord[num][view_j]="datark";
         }
         else if (s.equals("sev_navak_0")) {
             zinvor_sev_8.setVisibility(View.GONE);
             matrixBord[num][view_j]="datark";
         }

         else if (s.equals("sev_dzi_1")) {
             dzi_sev_1.setVisibility(View.GONE);
             matrixBord[num][view_j]="datark";
         }
         else if (s.equals("sev_dzi_2")) {
             dzi_sev_2.setVisibility(View.GONE);
             matrixBord[num][view_j]="datark";
         }
         else if (s.equals("sev_dzi_3")) {
             zinvor_sev_1.setVisibility(View.GONE);
             matrixBord[num][view_j]="datark";
         }
         else if (s.equals("sev_dzi_4")) {
             zinvor_sev_2.setVisibility(View.GONE);
             matrixBord[num][view_j]="datark";
         }
         else if (s.equals("sev_dzi_5")) {
             zinvor_sev_3.setVisibility(View.GONE);
             matrixBord[num][view_j]="datark";
         }
         else if (s.equals("sev_dzi_6")) {
             zinvor_sev_4.setVisibility(View.GONE);
             matrixBord[num][view_j]="datark";
         }
         else if (s.equals("sev_dzi_7")) {
             zinvor_sev_5.setVisibility(View.GONE);
             matrixBord[num][view_j]="datark";
         }
         else if (s.equals("sev_dzi_8")) {
             zinvor_sev_6.setVisibility(View.GONE);
             matrixBord[num][view_j]="datark";
         }
         else if (s.equals("sev_dzi_9")) {
             zinvor_sev_7.setVisibility(View.GONE);
             matrixBord[num][view_j]="datark";
         }
         else if (s.equals("sev_dzi_0")) {
             zinvor_sev_8.setVisibility(View.GONE);
             matrixBord[num][view_j]="datark";
         }
         else if (s.equals("sev_pix_1")) {
             pix_sev_1.setVisibility(View.GONE);
             matrixBord[num][view_j]="datark";
         }
         else if (s.equals("sev_pix_2")) {
             pix_sev_2.setVisibility(View.GONE);
             matrixBord[num][view_j]="datark";
         }
         else if (s.equals("sev_pix_3")) {
             zinvor_sev_1.setVisibility(View.GONE);
             matrixBord[num][view_j]="datark";
         }
         else if (s.equals("sev_pix_4")) {
             zinvor_sev_2.setVisibility(View.GONE);
             matrixBord[num][view_j]="datark";
         }
         else if (s.equals("sev_pix_5")) {
             zinvor_sev_3.setVisibility(View.GONE);
             matrixBord[num][view_j]="datark";
         }
         else if (s.equals("sev_pix_6")) {
             zinvor_sev_4.setVisibility(View.GONE);
             matrixBord[num][view_j]="datark";
         }
         else if (s.equals("sev_pix_7")) {
             zinvor_sev_5.setVisibility(View.GONE);
             matrixBord[num][view_j]="datark";
         }
         else if (s.equals("sev_pix_8")) {
             zinvor_sev_6.setVisibility(View.GONE);
             matrixBord[num][view_j]="datark";
         }
         else if (s.equals("sev_pix_9")) {
             zinvor_sev_7.setVisibility(View.GONE);
             matrixBord[num][view_j]="datark";
         }
         else if (s.equals("sev_pix_0")) {
             zinvor_sev_8.setVisibility(View.GONE);
             matrixBord[num][view_j]="datark";
         }

         else if (s.equals("sev_taguhi")) {
             taguhi_sev.setVisibility(View.GONE);
             matrixBord[num][view_j]="datark";
         }
         else if (s.equals("sev_taguhi_1")) {
             zinvor_sev_1.setVisibility(View.GONE);
             matrixBord[num][view_j]="datark";
         }
         else if (s.equals("sev_taguhi_2")) {
             zinvor_sev_2.setVisibility(View.GONE);
             matrixBord[num][view_j]="datark";
         }
         else if (s.equals("sev_taguhi_3")) {
             zinvor_sev_3.setVisibility(View.GONE);
             matrixBord[num][view_j]="datark";
         }
         else if (s.equals("sev_taguhi_4")) {

             zinvor_sev_4.setVisibility(View.GONE);
             matrixBord[num][view_j]="datark";

         }
         else if (s.equals("sev_taguhi_5")) {

             zinvor_sev_5.setVisibility(View.GONE);
             matrixBord[num][view_j]="datark";

         }
         else if (s.equals("sev_taguhi_6")) {

             zinvor_sev_6.setVisibility(View.GONE);
             matrixBord[num][view_j]="datark";

         }
         else if (s.equals("sev_taguhi_7")) {

             zinvor_sev_7.setVisibility(View.GONE);
             matrixBord[num][view_j]="datark";

         }
         else if (s.equals("sev_taguhi_8")) {

             zinvor_sev_8.setVisibility(View.GONE);
             matrixBord[num][view_j]="datark";

         }


         else if (s.equals("spitak_zinvor_1")) {

             zinvor_spitak_1.setVisibility(View.GONE);
             matrixBord[num][view_j]="datark";

         }
         else if (s.equals("spitak_zinvor_2")) {

             zinvor_spitak_2.setVisibility(View.GONE);
             matrixBord[num][view_j]="datark";

         }
         else if (s.equals("spitak_zinvor_3")) {

             zinvor_spitak_3.setVisibility(View.GONE);
             matrixBord[num][view_j]="datark";

         }
         else if (s.equals("spitak_zinvor_4")) {

             zinvor_spitak_4.setVisibility(View.GONE);
             matrixBord[num][view_j]="datark";

         }
         else if (s.equals("spitak_zinvor_5")) {

             zinvor_spitak_5.setVisibility(View.GONE);
             matrixBord[num][view_j]="datark";

         }
         else if (s.equals("spitak_zinvor_6")) {

             zinvor_spitak_6.setVisibility(View.GONE);
             matrixBord[num][view_j]="datark";

         }
         else if (s.equals("spitak_zinvor_7")) {

             zinvor_spitak_7.setVisibility(View.GONE);
             matrixBord[num][view_j]="datark";

         }
         else if (s.equals("spitak_zinvor_8")) {

             zinvor_spitak_8.setVisibility(View.GONE);
             matrixBord[num][view_j]="datark";

         }
         else if (s.equals("spitak_navak_1")) {

             navak_spitak_1.setVisibility(View.GONE);
             matrixBord[num][view_j]="datark";

         }
         else if (s.equals("spitak_navak_2")) {

             navak_spitak_2.setVisibility(View.GONE);
             matrixBord[num][view_j]="datark";

         }
         else if (s.equals("spitak_navak_3")) {

             zinvor_spitak_1.setVisibility(View.GONE);
             matrixBord[num][view_j]="datark";

         }
         else if (s.equals("spitak_navak_4")) {

             zinvor_spitak_2.setVisibility(View.GONE);
             matrixBord[num][view_j]="datark";

         }
         else if (s.equals("spitak_navak_5")) {

             zinvor_spitak_3.setVisibility(View.GONE);
             matrixBord[num][view_j]="datark";

         }
         else if (s.equals("spitak_navak_6")) {

             zinvor_spitak_4.setVisibility(View.GONE);
             matrixBord[num][view_j]="datark";

         }
         else if (s.equals("spitak_navak_7")) {

             zinvor_spitak_5.setVisibility(View.GONE);
             matrixBord[num][view_j]="datark";

         }
         else if (s.equals("spitak_navak_8")) {

             zinvor_spitak_6.setVisibility(View.GONE);
             matrixBord[num][view_j]="datark";

         }
         else if (s.equals("spitak_navak_9")) {

             zinvor_spitak_7.setVisibility(View.GONE);
             matrixBord[num][view_j]="datark";

         }
         else if (s.equals("spitak_navak_0")) {

             zinvor_spitak_8.setVisibility(View.GONE);
             matrixBord[num][view_j]="datark";

         }


         else if (s.equals("spitak_dzi_1")) {

             dzi_spitak_1.setVisibility(View.GONE);
             matrixBord[num][view_j]="datark";

         }
         else if (s.equals("spitak_dzi_2")) {

             dzi_spitak_2.setVisibility(View.GONE);
             matrixBord[num][view_j]="datark";

         }
         else if (s.equals("spitak_dzi_3")) {

             zinvor_spitak_1.setVisibility(View.GONE);
             matrixBord[num][view_j]="datark";

         }
         else if (s.equals("spitak_dzi_4")) {

             zinvor_spitak_2.setVisibility(View.GONE);
             matrixBord[num][view_j]="datark";

         }
         else if (s.equals("spitak_dzi_5")) {

             zinvor_spitak_3.setVisibility(View.GONE);
             matrixBord[num][view_j]="datark";

         }
         else if (s.equals("spitak_dzi_6")) {

             zinvor_spitak_4.setVisibility(View.GONE);
             matrixBord[num][view_j]="datark";

         }
         else if (s.equals("spitak_dzi_7")) {

             zinvor_spitak_5.setVisibility(View.GONE);
             matrixBord[num][view_j]="datark";

         }
         else if (s.equals("spitak_dzi_8")) {

             zinvor_spitak_6.setVisibility(View.GONE);
             matrixBord[num][view_j]="datark";

         }
         else if (s.equals("spitak_dzi_9")) {

             zinvor_spitak_7.setVisibility(View.GONE);
             matrixBord[num][view_j]="datark";

         }
         else if (s.equals("spitak_dzi_0")) {

             zinvor_spitak_8.setVisibility(View.GONE);
             matrixBord[num][view_j]="datark";

         }

         else if (s.equals("spitak_pix_1")) {

             pix_spitak_1.setVisibility(View.GONE);
             matrixBord[num][view_j]="datark";

         }
         else if (s.equals("spitak_pix_2")) {

             pix_spitak_2.setVisibility(View.GONE);
             matrixBord[num][view_j]="datark";

         }
         else if (s.equals("spitak_pix_3")) {

             zinvor_spitak_1.setVisibility(View.GONE);
             matrixBord[num][view_j]="datark";

         }
         else if (s.equals("spitak_pix_4")) {

             zinvor_spitak_2.setVisibility(View.GONE);
             matrixBord[num][view_j]="datark";

         }
         else if (s.equals("spitak_pix_5")) {

             zinvor_spitak_3.setVisibility(View.GONE);
             matrixBord[num][view_j]="datark";

         }
         else if (s.equals("spitak_pix_6")) {

             zinvor_spitak_4.setVisibility(View.GONE);
             matrixBord[num][view_j]="datark";

         }
         else if (s.equals("spitak_pix_7")) {

             zinvor_spitak_5.setVisibility(View.GONE);
             matrixBord[num][view_j]="datark";

         }
         else if (s.equals("spitak_pix_8")) {

             zinvor_spitak_6.setVisibility(View.GONE);
             matrixBord[num][view_j]="datark";

         }
         else if (s.equals("spitak_pix_9")) {

             zinvor_spitak_7.setVisibility(View.GONE);
             matrixBord[num][view_j]="datark";

         }
         else if (s.equals("spitak_pix_0")) {

             zinvor_spitak_8.setVisibility(View.GONE);
             matrixBord[num][view_j]="datark";

         }


         else if (s.equals("spitak_taguhi")) {

             taguhi_spitak.setVisibility(View.GONE);
             matrixBord[num][view_j]="datark";
         }
         else if (s.equals("spitak_taguhi_1")) {

             zinvor_spitak_1.setVisibility(View.GONE);
             matrixBord[num][view_j]="datark";
         }
         else if (s.equals("spitak_taguhi_2")) {

             zinvor_spitak_2.setVisibility(View.GONE);
             matrixBord[num][view_j]="datark";
         }
         else if (s.equals("spitak_taguhi_3")) {

             zinvor_spitak_3.setVisibility(View.GONE);
             matrixBord[num][view_j]="datark";
         }
         else if (s.equals("spitak_taguhi_4")) {

             zinvor_spitak_4.setVisibility(View.GONE);
             matrixBord[num][view_j]="datark";
         }
         else if (s.equals("spitak_taguhi_5")) {

             zinvor_spitak_5.setVisibility(View.GONE);
             matrixBord[num][view_j]="datark";
         }
         else if (s.equals("spitak_taguhi_6")) {

             zinvor_spitak_6.setVisibility(View.GONE);
             matrixBord[num][view_j]="datark";
         }
         else if (s.equals("spitak_taguhi_7")) {

             zinvor_spitak_7.setVisibility(View.GONE);
             matrixBord[num][view_j]="datark";
         }
         else if (s.equals("spitak_taguhi_8")) {

             zinvor_spitak_8.setVisibility(View.GONE);
             matrixBord[num][view_j]="datark";
         }


         }
         else {
             s = oponentImageString_horizonakan[num];
             oponentImageString_horizonakan[num]="";


             if (s.equals("sev_zinvor_1")) {

                 zinvor_sev_1.setVisibility(View.GONE);
                 matrixBord[view_i][num]="datark";

             }
             else if (s.equals("sev_zinvor_2")) {

                 zinvor_sev_2.setVisibility(View.GONE);
                 matrixBord[view_i][num]="datark";

             }
             else if (s.equals("sev_zinvor_3")) {

                 zinvor_sev_3.setVisibility(View.GONE);
                 matrixBord[view_i][num]="datark";

             }
             else if (s.equals("sev_zinvor_4")) {

                 zinvor_sev_4.setVisibility(View.GONE);
                 matrixBord[view_i][num]="datark";

             }
             else if (s.equals("sev_zinvor_5")) {

                 zinvor_sev_5.setVisibility(View.GONE);
                 matrixBord[view_i][num]="datark";

             }
             else if (s.equals("sev_zinvor_6")) {

                 zinvor_sev_6.setVisibility(View.GONE);
                 matrixBord[view_i][num]="datark";

             }
             else if (s.equals("sev_zinvor_7")) {

                 zinvor_sev_7.setVisibility(View.GONE);
                 matrixBord[view_i][num]="datark";

             }
             else if (s.equals("sev_zinvor_8")) {

                 zinvor_sev_8.setVisibility(View.GONE);
                 matrixBord[view_i][num]="datark";

             }

             else if (s.equals("sev_navak_1")) {

                 navak_sev_1.setVisibility(View.GONE);
                 matrixBord[view_i][num]="datark";

             }
             else if (s.equals("sev_navak_2")) {

                 navak_sev_2.setVisibility(View.GONE);
                 matrixBord[view_i][num]="datark";

             }
             else if (s.equals("sev_navak_3")) {

                 zinvor_sev_1.setVisibility(View.GONE);
                 matrixBord[view_i][num]="datark";
             }
             else if (s.equals("sev_navak_4")) {

                 zinvor_sev_2.setVisibility(View.GONE);
                 matrixBord[view_i][num]="datark";
             }
             else if (s.equals("sev_navak_5")) {

                 zinvor_sev_3.setVisibility(View.GONE);
                 matrixBord[view_i][num]="datark";
             }
             else if (s.equals("sev_navak_6")) {

                 zinvor_sev_4.setVisibility(View.GONE);
                 matrixBord[view_i][num]="datark";
             }
             else if (s.equals("sev_navak_7")) {

                 zinvor_sev_5.setVisibility(View.GONE);
                 matrixBord[view_i][num]="datark";
             }
             else if (s.equals("sev_navak_8")) {

                 zinvor_sev_6.setVisibility(View.GONE);
                 matrixBord[view_i][num]="datark";
             }
             else if (s.equals("sev_navak_9")) {

                 zinvor_sev_7.setVisibility(View.GONE);
                 matrixBord[view_i][num]="datark";
             }
             else if (s.equals("sev_navak_0")) {

                 zinvor_sev_8.setVisibility(View.GONE);
                 matrixBord[view_i][num]="datark";
             }

             else if (s.equals("sev_dzi_1")) {

                 dzi_sev_1.setVisibility(View.GONE);
                 matrixBord[view_i][num]="datark";

             }
             else if (s.equals("sev_dzi_2")) {

                 dzi_sev_2.setVisibility(View.GONE);
                 matrixBord[view_i][num]="datark";

             }
             else if (s.equals("sev_dzi_3")) {

                 zinvor_sev_1.setVisibility(View.GONE);
                 matrixBord[view_i][num]="datark";

             }
             else if (s.equals("sev_dzi_4")) {

                 zinvor_sev_2.setVisibility(View.GONE);
                 matrixBord[view_i][num]="datark";

             }
             else if (s.equals("sev_dzi_5")) {

                 zinvor_sev_3.setVisibility(View.GONE);
                 matrixBord[view_i][num]="datark";

             }
             else if (s.equals("sev_dzi_6")) {

                 zinvor_sev_4.setVisibility(View.GONE);
                 matrixBord[view_i][num]="datark";

             }
             else if (s.equals("sev_dzi_7")) {

                 zinvor_sev_5.setVisibility(View.GONE);
                 matrixBord[view_i][num]="datark";

             }
             else if (s.equals("sev_dzi_8")) {

                 zinvor_sev_6.setVisibility(View.GONE);
                 matrixBord[view_i][num]="datark";

             }
             else if (s.equals("sev_dzi_9")) {

                 zinvor_sev_7.setVisibility(View.GONE);
                 matrixBord[view_i][num]="datark";

             }
             else if (s.equals("sev_dzi_0")) {

                 zinvor_sev_8.setVisibility(View.GONE);
                 matrixBord[view_i][num]="datark";

             }

             else if (s.equals("sev_pix_1")) {

                 pix_sev_1.setVisibility(View.GONE);
                 matrixBord[view_i][num]="datark";

             }
             else if (s.equals("sev_pix_2")) {

                 pix_sev_2.setVisibility(View.GONE);
                 matrixBord[view_i][num]="datark";

             }
             else if (s.equals("sev_pix_3")) {

                 zinvor_sev_1.setVisibility(View.GONE);
                 matrixBord[view_i][num]="datark";

             }
             else if (s.equals("sev_pix_4")) {

                 zinvor_sev_2.setVisibility(View.GONE);
                 matrixBord[view_i][num]="datark";

             }
             else if (s.equals("sev_pix_5")) {

                 zinvor_sev_3.setVisibility(View.GONE);
                 matrixBord[view_i][num]="datark";

             }
             else if (s.equals("sev_pix_6")) {

                 zinvor_sev_4.setVisibility(View.GONE);
                 matrixBord[view_i][num]="datark";

             }
             else if (s.equals("sev_pix_7")) {

                 zinvor_sev_5.setVisibility(View.GONE);
                 matrixBord[view_i][num]="datark";

             }
             else if (s.equals("sev_pix_8")) {

                 zinvor_sev_6.setVisibility(View.GONE);
                 matrixBord[view_i][num]="datark";

             }
             else if (s.equals("sev_pix_9")) {

                 zinvor_sev_7.setVisibility(View.GONE);
                 matrixBord[view_i][num]="datark";

             }
             else if (s.equals("sev_pix_0")) {

                 zinvor_sev_8.setVisibility(View.GONE);
                 matrixBord[view_i][num]="datark";

             }

             else if (s.equals("sev_taguhi")) {

                 taguhi_sev.setVisibility(View.GONE);
                 matrixBord[view_i][num]="datark";

             }
             else if (s.equals("sev_taguhi_1")) {

                 zinvor_sev_1.setVisibility(View.GONE);
                 matrixBord[view_i][num]="datark";

             }
             else if (s.equals("sev_taguhi_2")) {

                 zinvor_sev_2.setVisibility(View.GONE);
                 matrixBord[view_i][num]="datark";

             }
             else if (s.equals("sev_taguhi_3")) {

                 zinvor_sev_3.setVisibility(View.GONE);
                 matrixBord[view_i][num]="datark";

             }
             else if (s.equals("sev_taguhi_4")) {

                 zinvor_sev_4.setVisibility(View.GONE);
                 matrixBord[view_i][num]="datark";

             }
             else if (s.equals("sev_taguhi_5")) {

                 zinvor_sev_5.setVisibility(View.GONE);
                 matrixBord[view_i][num]="datark";

             }
             else if (s.equals("sev_taguhi_6")) {

                 zinvor_sev_6.setVisibility(View.GONE);
                 matrixBord[view_i][num]="datark";

             }
             else if (s.equals("sev_taguhi_7")) {

                 zinvor_sev_7.setVisibility(View.GONE);
                 matrixBord[view_i][num]="datark";

             }
             else if (s.equals("sev_taguhi_8")) {

                 zinvor_sev_8.setVisibility(View.GONE);
                 matrixBord[view_i][num]="datark";

             }

             else if (s.equals("spitak_zinvor_1")) {

                 zinvor_spitak_1.setVisibility(View.GONE);
                 matrixBord[view_i][num]="datark";

             }
             else if (s.equals("spitak_zinvor_2")) {

                 zinvor_spitak_2.setVisibility(View.GONE);
                 matrixBord[view_i][num]="datark";

             }
             else if (s.equals("spitak_zinvor_3")) {

                 zinvor_spitak_3.setVisibility(View.GONE);
                 matrixBord[view_i][num]="datark";

             }
             else if (s.equals("spitak_zinvor_4")) {

                 zinvor_spitak_4.setVisibility(View.GONE);
                 matrixBord[view_i][num]="datark";

             }
             else if (s.equals("spitak_zinvor_5")) {

                 zinvor_spitak_5.setVisibility(View.GONE);
                 matrixBord[view_i][num]="datark";

             }
             else if (s.equals("spitak_zinvor_6")) {

                 zinvor_spitak_6.setVisibility(View.GONE);
                 matrixBord[view_i][num]="datark";

             }
             else if (s.equals("spitak_zinvor_7")) {

                 zinvor_spitak_7.setVisibility(View.GONE);
                 matrixBord[view_i][num]="datark";

             }
             else if (s.equals("spitak_zinvor_8")) {

                 zinvor_spitak_8.setVisibility(View.GONE);
                 matrixBord[view_i][num]="datark";

             }

             else if (s.equals("spitak_navak_1")) {

                 navak_spitak_1.setVisibility(View.GONE);
                 matrixBord[view_i][num]="datark";

             }
             else if (s.equals("spitak_navak_2")) {

                 navak_spitak_2.setVisibility(View.GONE);
                 matrixBord[view_i][num]="datark";

             }
             else if (s.equals("spitak_navak_3")) {

                 zinvor_spitak_1.setVisibility(View.GONE);
                 matrixBord[view_i][num]="datark";

             }
             else if (s.equals("spitak_navak_4")) {

                 zinvor_spitak_2.setVisibility(View.GONE);
                 matrixBord[view_i][num]="datark";

             }
             else if (s.equals("spitak_navak_5")) {

                 zinvor_spitak_3.setVisibility(View.GONE);
                 matrixBord[view_i][num]="datark";

             }
             else if (s.equals("spitak_navak_6")) {

                 zinvor_spitak_4.setVisibility(View.GONE);
                 matrixBord[view_i][num]="datark";

             }
             else if (s.equals("spitak_navak_7")) {

                 zinvor_spitak_5.setVisibility(View.GONE);
                 matrixBord[view_i][num]="datark";

             }
             else if (s.equals("spitak_navak_8")) {

                 zinvor_spitak_6.setVisibility(View.GONE);
                 matrixBord[view_i][num]="datark";

             }
             else if (s.equals("spitak_navak_9")) {

                 zinvor_spitak_7.setVisibility(View.GONE);
                 matrixBord[view_i][num]="datark";

             }
             else if (s.equals("spitak_navak_0")) {

                 zinvor_spitak_8.setVisibility(View.GONE);
                 matrixBord[view_i][num]="datark";

             }

             else if (s.equals("spitak_dzi_1")) {

                 dzi_spitak_1.setVisibility(View.GONE);
                 matrixBord[view_i][num]="datark";

             }
             else if (s.equals("spitak_dzi_2")) {

                 dzi_spitak_2.setVisibility(View.GONE);
                 matrixBord[view_i][num]="datark";

             }
             else if (s.equals("spitak_dzi_3")) {

                 zinvor_spitak_1.setVisibility(View.GONE);
                 matrixBord[view_i][num]="datark";

             }
             else if (s.equals("spitak_dzi_4")) {

                 zinvor_spitak_2.setVisibility(View.GONE);
                 matrixBord[view_i][num]="datark";

             }
             else if (s.equals("spitak_dzi_5")) {

                 zinvor_spitak_3.setVisibility(View.GONE);
                 matrixBord[view_i][num]="datark";

             }
             else if (s.equals("spitak_dzi_6")) {

                 zinvor_spitak_4.setVisibility(View.GONE);
                 matrixBord[view_i][num]="datark";

             }
             else if (s.equals("spitak_dzi_7")) {

                 zinvor_spitak_5.setVisibility(View.GONE);
                 matrixBord[view_i][num]="datark";

             }
             else if (s.equals("spitak_dzi_8")) {

                 zinvor_spitak_6.setVisibility(View.GONE);
                 matrixBord[view_i][num]="datark";

             }
             else if (s.equals("spitak_dzi_9")) {

                 zinvor_spitak_7.setVisibility(View.GONE);
                 matrixBord[view_i][num]="datark";

             }
             else if (s.equals("spitak_dzi_0")) {

                 zinvor_spitak_8.setVisibility(View.GONE);
                 matrixBord[view_i][num]="datark";

             }

             else if (s.equals("spitak_pix_1")) {

                 pix_spitak_1.setVisibility(View.GONE);
                 matrixBord[view_i][num]="datark";

             }
             else if (s.equals("spitak_pix_2")) {

                 pix_spitak_2.setVisibility(View.GONE);
                 matrixBord[view_i][num]="datark";

             }
             else if (s.equals("spitak_pix_3")) {

                 zinvor_spitak_1.setVisibility(View.GONE);
                 matrixBord[view_i][num]="datark";

             }
             else if (s.equals("spitak_pix_4")) {

                 zinvor_spitak_2.setVisibility(View.GONE);
                 matrixBord[view_i][num]="datark";

             }
             else if (s.equals("spitak_pix_5")) {

                 zinvor_spitak_3.setVisibility(View.GONE);
                 matrixBord[view_i][num]="datark";

             }
             else if (s.equals("spitak_pix_6")) {

                 zinvor_spitak_4.setVisibility(View.GONE);
                 matrixBord[view_i][num]="datark";

             }
             else if (s.equals("spitak_pix_7")) {

                 zinvor_spitak_5.setVisibility(View.GONE);
                 matrixBord[view_i][num]="datark";

             }
             else if (s.equals("spitak_pix_8")) {

                 zinvor_spitak_6.setVisibility(View.GONE);
                 matrixBord[view_i][num]="datark";

             }
             else if (s.equals("spitak_pix_9")) {

                 zinvor_spitak_7.setVisibility(View.GONE);
                 matrixBord[view_i][num]="datark";

             }
             else if (s.equals("spitak_pix_0")) {

                 zinvor_spitak_8.setVisibility(View.GONE);
                 matrixBord[view_i][num]="datark";

             }

             else if (s.equals("spitak_taguhi")) {

                 taguhi_spitak.setVisibility(View.GONE);
                 matrixBord[view_i][num]="datark";

             }
             else if (s.equals("spitak_taguhi_1")) {

                 zinvor_spitak_1.setVisibility(View.GONE);
                 matrixBord[view_i][num]="datark";

             }
             else if (s.equals("spitak_taguhi_2")) {

                 zinvor_spitak_2.setVisibility(View.GONE);
                 matrixBord[view_i][num]="datark";

             }
             else if (s.equals("spitak_taguhi_3")) {

                 zinvor_spitak_3.setVisibility(View.GONE);
                 matrixBord[view_i][num]="datark";

             }
             else if (s.equals("spitak_taguhi_4")) {

                 zinvor_spitak_4.setVisibility(View.GONE);
                 matrixBord[view_i][num]="datark";

             }
             else if (s.equals("spitak_taguhi_5")) {

                 zinvor_spitak_5.setVisibility(View.GONE);
                 matrixBord[view_i][num]="datark";

             }
             else if (s.equals("spitak_taguhi_6")) {

                 zinvor_spitak_6.setVisibility(View.GONE);
                 matrixBord[view_i][num]="datark";

             }
             else if (s.equals("spitak_taguhi_7")) {

                 zinvor_spitak_7.setVisibility(View.GONE);
                 matrixBord[view_i][num]="datark";

             }
             else if (s.equals("spitak_taguhi_8")) {

                 zinvor_spitak_8.setVisibility(View.GONE);
                 matrixBord[view_i][num]="datark";

             }
         }

         for (int i=0; i<8; i++) {
             oponentImageString_uxxahayac[i]="";
             oponentImageString_horizonakan[i]="";
         }

         if (clickedRamka1.equals("1")) {
             imageRamka1.setVisibility(View.GONE);
             clickedRamka1="";
         }
         if (clickedRamka2.equals("1")) {
             imageRamka2.setVisibility(View.GONE);
             clickedRamka2="";
         }
         if (clickedRamka3.equals("1")) {
             imageRamka3.setVisibility(View.GONE);
             clickedRamka3="";
         }
         if (clickedRamka4.equals("1")) {
             imageRamka4.setVisibility(View.GONE);
             clickedRamka4="";
         }

         for (int i = 0; i < 8; i++) {
             if (clickedRamkaNavah_horizonakan[i].equals("1")) {
                 imageRamkaNavak_horizonakan[i].setVisibility(View.GONE);
                 clickedRamkaNavah_horizonakan[i] = "";
             }
             if (clickedRamkaNavah_uxxahayac[i].equals("1")) {
                 imageRamkaNavak_uxxahayac[i].setVisibility(View.GONE);
                 clickedRamkaNavah_uxxahayac[i] = "";
             }
             if (clickedRamkaPix_glxavor[i].equals("1")) {
                 imageRamkaPix_glxavor[i].setVisibility(View.GONE);
                 clickedRamkaPix_glxavor[i]="";
             }
             if (clicedRamkaPix_ojandak[i].equals("1")) {
                 imageRamkaPix_ojandak[i].setVisibility(View.GONE);
                 clicedRamkaPix_ojandak[i]="";
             }
         }

         if (horizonakan_uxxahayac) {
             String s2 = matrixBord[num][view_j];
             matrixBord[num][view_j] = matrixBord[view_i][view_j];
             matrixBord[view_i][view_j] = s2;
         }
         else {
             String s2 = matrixBord[view_i][num];
             matrixBord[view_i][num] = matrixBord[view_i][view_j];
             matrixBord[view_i][view_j] = s2;
         }

         zinvorClickRAmka2_num="";
     }

     //------------------metod pix click------------------------------------------------------------------------------

     private void pixClick(ImageView imagePix, int leftPix, int topPix, String imageName, boolean sev_spitak) {

         if (clickedRamka1.equals("1")) {
             imageRamka1.setVisibility(View.GONE);
             clickedRamka1 = "";
         }
         if (clickedRamka2.equals("1")) {
             imageRamka2.setVisibility(View.GONE);
             clickedRamka2 = "";
         }
         if (clickedRamka3.equals("1")) {
             imageRamka3.setVisibility(View.GONE);
             clickedRamka3 = "";
         }
         if (clickedRamka4.equals("1")) {
             imageRamka4.setVisibility(View.GONE);
             clickedRamka4 = "";
         }
         if (clickedRamka5.equals("1")) {
             imageRamka5.setVisibility(View.GONE);
             clickedRamka5 = "";
         }
         if (clickedRamka6.equals("1")) {
             imageRamka6.setVisibility(View.GONE);
             clickedRamka6 = "";
         }


         if (clickedRamkaDzi_1.equals("1")) {
             imageRamkaDzi_1.setVisibility(View.GONE);
             clickedRamkaDzi_1="";
         }
         if (clickedRamkaDzi_2.equals("1")) {
             imageRamkaDzi_2.setVisibility(View.GONE);
             clickedRamkaDzi_2="";
         }
         if (clickedRamkaDzi_3.equals("1")) {
             imageRamkaDzi_3.setVisibility(View.GONE);
             clickedRamkaDzi_3="";
         }
         if (clickedRamkaDzi_4.equals("1")) {
             imageRamkaDzi_4.setVisibility(View.GONE);
             clickedRamkaDzi_4="";
         }
         if (clickedRamkaDzi_5.equals("1")) {
             imageRamkaDzi_5.setVisibility(View.GONE);
             clickedRamkaDzi_5="";
         }
         if (clickedRamkaDzi_6.equals("1")) {
             imageRamkaDzi_6.setVisibility(View.GONE);
             clickedRamkaDzi_6="";
         }
         if (clickedRamkaDzi_7.equals("1")) {
             imageRamkaDzi_7.setVisibility(View.GONE);
             clickedRamkaDzi_7="";
         }
         if (clickedRamkaDzi_8.equals("1")) {
             imageRamkaDzi_8.setVisibility(View.GONE);
             clickedRamkaDzi_8="";
         }

         if (clickedRamkaTagavor_1.equals("1")) {
             imageRamkaTagavor_1.setVisibility(View.GONE);
             clickedRamkaTagavor_1="";
         }
         if (clickedRamkaTagavor_2.equals("1")) {
             imageRamkaTagavor_2.setVisibility(View.GONE);
             clickedRamkaTagavor_2="";
         }
         if (clickedRamkaTagavor_3.equals("1")) {
             imageRamkaTagavor_3.setVisibility(View.GONE);
             clickedRamkaTagavor_3="";
         }
         if (clickedRamkaTagavor_4.equals("1")) {
             imageRamkaTagavor_4.setVisibility(View.GONE);
             clickedRamkaTagavor_4="";
         }
         if (clickedRamkaTagavor_5.equals("1")) {
             imageRamkaTagavor_5.setVisibility(View.GONE);
             clickedRamkaTagavor_5="";
         }
         if (clickedRamkaTagavor_6.equals("1")) {
             imageRamkaTagavor_6.setVisibility(View.GONE);
             clickedRamkaTagavor_6="";
         }
         if (clickedRamkaTagavor_7.equals("1")) {
             imageRamkaTagavor_7.setVisibility(View.GONE);
             clickedRamkaTagavor_7="";
         }
         if (clickedRamkaTagavor_8.equals("1")) {
             imageRamkaTagavor_8.setVisibility(View.GONE);
             clickedRamkaTagavor_8="";
         }
         if (clickedRamkaTagavor_9.equals("1")) {
             imageRamkaTagavor_9.setVisibility(View.GONE);
             clickedRamkaTagavor_9="";
         }
         if (clickedRamkaTagavor_10.equals("1")) {
             imageRamkaTagavor_10.setVisibility(View.GONE);
             clickedRamkaTagavor_10="";
         }

         for (int i = 0; i < 8; i++) {
             if (clickedRamkaNavah_horizonakan[i].equals("1")) {
                 imageRamkaNavak_horizonakan[i].setVisibility(View.GONE);
                 clickedRamkaNavah_horizonakan[i] = "";
             }
             if (clickedRamkaNavah_uxxahayac[i].equals("1")) {
                 imageRamkaNavak_uxxahayac[i].setVisibility(View.GONE);
                 clickedRamkaNavah_uxxahayac[i] = "";
             }
             if (clickedRamkaPix_glxavor[i].equals("1")) {
                 imageRamkaPix_glxavor[i].setVisibility(View.GONE);
                 clickedRamkaPix_glxavor[i]="";
             }
             if (clicedRamkaPix_ojandak[i].equals("1")) {
                 imageRamkaPix_ojandak[i].setVisibility(View.GONE);
                 clicedRamkaPix_ojandak[i]="";
             }
         }

         for (int i=0; i<8; i++) {
             oponentPixString_glxavor[i]="";
             oponentPixString_ojandak[i]="";
         }

         for (int i=0; i<8; i++) {
             for (int j=0; j<8; j++) {
                 if (matrixBord[i][j].equals(imageName)) {
                     view_i=i;
                     view_j=j;
                 }
             }
         }

         int sum=1;
         int sum1=1;
         int sum2=1;
         int sum3=1;
         boolean opponentFigure1=true;
         boolean opponentFigure2=true;
         boolean opponentFigure3=true;
         boolean opponentFigure4=true;
         boolean is_shax=true;

         for (int i=0; i<8; i++) {
             if (view_j-sum>=0 && view_i-sum>=0 && opponentFigure1==true) {
                 if (sev_spitak==true)
                     is_shax=shax_spitak_tagavor_stugum(view_i-sum,view_j-sum,imageName,true);
                 else if(sev_spitak==false)
                     is_shax=shax_sev_tagavor_stugum(view_i-sum,view_j-sum,imageName,true);

                 if (matrixBord[view_i-sum][view_j-sum].equals("datark")) {
                     if (is_shax==true) {
                         imageRamkaPix_glxavor[view_j - sum] = new ImageView(this);
                         imageRamkaPix_glxavor[view_j - sum].setImageResource(R.drawable.ramka);
                         params_images = new RelativeLayout.LayoutParams(widthLayoutMatrix / 8, widthLayoutMatrix / 8);
                         params_images.setMargins(leftPix - 10 - sum * widthLayoutMatrix / 8,
                                 topPix - 10 - sum * widthLayoutMatrix / 8, 0, 0);
                         rLayout.addView(imageRamkaPix_glxavor[view_j - sum], params_images);
                         imageClicked = imageName;
                         clickedRamkaPix_glxavor[view_j - sum] = "1";
                         imageRamkaPix_glxavor[view_j - sum].setOnClickListener(this);
                     }
                     sum++;
                 }
                 else if (matrixBord[view_i-sum][view_j-sum].charAt(1)=='e' && sev_spitak==true && is_shax==true) {
                     imageRamkaPix_glxavor[view_j-sum]=new ImageView(this);
                     imageRamkaPix_glxavor[view_j-sum].setImageResource(R.drawable.ramka);
                     params_images = new RelativeLayout.LayoutParams(widthLayoutMatrix / 8, widthLayoutMatrix / 8);
                     params_images.setMargins(leftPix - 10-sum*widthLayoutMatrix/8,
                             topPix - 10-sum*widthLayoutMatrix/8, 0, 0);
                     rLayout.addView(imageRamkaPix_glxavor[view_j-sum], params_images);
                     imageClicked = imageName;
                     clickedRamkaPix_glxavor[view_j-sum] = "1";
                     opponentFigure1=false;
                     oponentPixString_glxavor[view_j-sum]=matrixBord[view_i-sum][view_j-sum];
                     imageRamkaPix_glxavor[view_j-sum].setOnClickListener(this);
                 }
                 else if (matrixBord[view_i-sum][view_j-sum].charAt(1)=='p' && sev_spitak==false && is_shax==true) {
                     imageRamkaPix_glxavor[view_j-sum]=new ImageView(this);
                     imageRamkaPix_glxavor[view_j-sum].setImageResource(R.drawable.ramka);
                     params_images = new RelativeLayout.LayoutParams(widthLayoutMatrix / 8, widthLayoutMatrix / 8);
                     params_images.setMargins(leftPix - 10-sum*widthLayoutMatrix/8,
                             topPix - 10-sum*widthLayoutMatrix/8, 0, 0);
                     rLayout.addView(imageRamkaPix_glxavor[view_j-sum], params_images);
                     imageClicked = imageName;
                     clickedRamkaPix_glxavor[view_j-sum] = "1";
                     opponentFigure1=false;
                     oponentPixString_glxavor[view_j-sum]=matrixBord[view_i-sum][view_j-sum];
                     imageRamkaPix_glxavor[view_j-sum].setOnClickListener(this);
                 }

             }
             if (view_j+sum1<=7 && view_i+sum1<=7 && opponentFigure2==true) {
                 if (sev_spitak==true)
                     is_shax=shax_spitak_tagavor_stugum(view_i+sum1,view_j+sum1,imageName,true);
                 else if(sev_spitak==false)
                     is_shax=shax_sev_tagavor_stugum(view_i+sum1,view_j+sum1,imageName,true);

                 if (matrixBord[view_i+sum1][view_j+sum1].equals("datark")) {
                     if (is_shax==true) {
                         imageRamkaPix_glxavor[view_j + sum1] = new ImageView(this);
                         imageRamkaPix_glxavor[view_j + sum1].setImageResource(R.drawable.ramka);
                         params_images = new RelativeLayout.LayoutParams(widthLayoutMatrix / 8, widthLayoutMatrix / 8);
                         params_images.setMargins(leftPix - 10 + sum1 * widthLayoutMatrix / 8,
                                 topPix - 10 + sum1 * widthLayoutMatrix / 8, 0, 0);
                         rLayout.addView(imageRamkaPix_glxavor[view_j + sum1], params_images);
                         imageClicked = imageName;
                         clickedRamkaPix_glxavor[view_j + sum1] = "1";
                         imageRamkaPix_glxavor[view_j + sum1].setOnClickListener(this);
                     }
                     sum1++;
                 }
                 else if (matrixBord[view_i+sum1][view_j+sum1].charAt(1)=='e' && sev_spitak==true && is_shax==true) {

                     imageRamkaPix_glxavor[view_j+sum1]=new ImageView(this);
                     imageRamkaPix_glxavor[view_j+sum1].setImageResource(R.drawable.ramka);
                     params_images = new RelativeLayout.LayoutParams(widthLayoutMatrix / 8, widthLayoutMatrix / 8);
                     params_images.setMargins(leftPix - 10+sum1*widthLayoutMatrix/8,
                             topPix - 10+sum1*widthLayoutMatrix/8, 0, 0);
                     rLayout.addView(imageRamkaPix_glxavor[view_j+sum1], params_images);
                     imageClicked = imageName;
                     clickedRamkaPix_glxavor[view_j+sum1] = "1";
                     opponentFigure2=false;
                     oponentPixString_glxavor[view_j+sum1]=matrixBord[view_i+sum1][view_j+sum1];
                     imageRamkaPix_glxavor[view_j+sum1].setOnClickListener(this);
                 }
                 else if (matrixBord[view_i+sum1][view_j+sum1].charAt(1)=='p' && sev_spitak==false && is_shax==true) {

                     imageRamkaPix_glxavor[view_j+sum1]=new ImageView(this);
                     imageRamkaPix_glxavor[view_j+sum1].setImageResource(R.drawable.ramka);
                     params_images = new RelativeLayout.LayoutParams(widthLayoutMatrix / 8, widthLayoutMatrix / 8);
                     params_images.setMargins(leftPix - 10+sum1*widthLayoutMatrix/8,
                             topPix - 10+sum1*widthLayoutMatrix/8, 0, 0);
                     rLayout.addView(imageRamkaPix_glxavor[view_j+sum1], params_images);
                     imageClicked = imageName;
                     clickedRamkaPix_glxavor[view_j+sum1] = "1";
                     opponentFigure2=false;
                     oponentPixString_glxavor[view_j+sum1]=matrixBord[view_i+sum1][view_j+sum1];
                     imageRamkaPix_glxavor[view_j+sum1].setOnClickListener(this);
                 }

             }
             if (view_i-sum2>=0 && view_j+sum2<=7 && opponentFigure3==true) {
                 if (sev_spitak==true)
                     is_shax=shax_spitak_tagavor_stugum(view_i-sum2,view_j+sum2,imageName,true);
                 else if(sev_spitak==false)
                     is_shax=shax_sev_tagavor_stugum(view_i-sum2,view_j+sum2,imageName,true);

                 if (matrixBord[view_i-sum2][view_j+sum2].equals("datark")) {
                     if (is_shax==true) {
                         imageRamkaPix_ojandak[view_i - sum2] = new ImageView(this);
                         imageRamkaPix_ojandak[view_i - sum2].setImageResource(R.drawable.ramka);
                         params_images = new RelativeLayout.LayoutParams(widthLayoutMatrix / 8, widthLayoutMatrix / 8);
                         params_images.setMargins(leftPix - 10 + sum2 * widthLayoutMatrix / 8,
                                 topPix - 10 - sum2 * widthLayoutMatrix / 8, 0, 0);
                         rLayout.addView(imageRamkaPix_ojandak[view_i - sum2], params_images);
                         imageClicked = imageName;
                         clicedRamkaPix_ojandak[view_i - sum2] = "1";
                         imageRamkaPix_ojandak[view_i - sum2].setOnClickListener(this);
                     }
                     sum2++;
                 }
                 else if (matrixBord[view_i-sum2][view_j+sum2].charAt(1)=='e' && sev_spitak==true && is_shax==true) {
                     imageRamkaPix_ojandak[view_i-sum2]=new ImageView(this);
                     imageRamkaPix_ojandak[view_i-sum2].setImageResource(R.drawable.ramka);
                     params_images = new RelativeLayout.LayoutParams(widthLayoutMatrix / 8, widthLayoutMatrix / 8);
                     params_images.setMargins(leftPix - 10+sum2*widthLayoutMatrix/8,
                             topPix - 10-sum2*widthLayoutMatrix/8, 0, 0);
                     rLayout.addView(imageRamkaPix_ojandak[view_i-sum2], params_images);
                     imageClicked = imageName;
                     clicedRamkaPix_ojandak[view_i-sum2] = "1";
                     opponentFigure3=false;
                     oponentPixString_ojandak[view_i-sum2]=matrixBord[view_i-sum2][view_j+sum2];
                     imageRamkaPix_ojandak[view_i-sum2].setOnClickListener(this);
                 }
                 else if (matrixBord[view_i-sum2][view_j+sum2].charAt(1)=='p' && sev_spitak==false && is_shax==true) {
                     imageRamkaPix_ojandak[view_i-sum2]=new ImageView(this);
                     imageRamkaPix_ojandak[view_i-sum2].setImageResource(R.drawable.ramka);
                     params_images = new RelativeLayout.LayoutParams(widthLayoutMatrix / 8, widthLayoutMatrix / 8);
                     params_images.setMargins(leftPix - 10+sum2*widthLayoutMatrix/8,
                             topPix - 10-sum2*widthLayoutMatrix/8, 0, 0);
                     rLayout.addView(imageRamkaPix_ojandak[view_i-sum2], params_images);
                     imageClicked = imageName;
                     clicedRamkaPix_ojandak[view_i-sum2] = "1";
                     opponentFigure3=false;
                     oponentPixString_ojandak[view_i-sum2]=matrixBord[view_i-sum2][view_j+sum2];
                     imageRamkaPix_ojandak[view_i-sum2].setOnClickListener(this);
                 }

             }
             if (view_i+sum3<=7 && view_j-sum3>=0 && opponentFigure4==true) {
                 if (sev_spitak==true)
                     is_shax=shax_spitak_tagavor_stugum(view_i+sum3,view_j-sum3,imageName,true);
                 else if(sev_spitak==false)
                     is_shax=shax_sev_tagavor_stugum(view_i+sum3,view_j-sum3,imageName,true);

                 if (matrixBord[view_i+sum3][view_j-sum3].equals("datark")) {
                     if (is_shax==true) {
                         imageRamkaPix_ojandak[view_i + sum3] = new ImageView(this);
                         imageRamkaPix_ojandak[view_i + sum3].setImageResource(R.drawable.ramka);
                         params_images = new RelativeLayout.LayoutParams(widthLayoutMatrix / 8, widthLayoutMatrix / 8);
                         params_images.setMargins(leftPix - 10 - sum3 * widthLayoutMatrix / 8,
                                 topPix - 10 + sum3 * widthLayoutMatrix / 8, 0, 0);
                         rLayout.addView(imageRamkaPix_ojandak[view_i + sum3], params_images);
                         imageClicked = imageName;
                         clicedRamkaPix_ojandak[view_i + sum3] = "1";
                         imageRamkaPix_ojandak[view_i + sum3].setOnClickListener(this);
                     }
                     sum3++;
                 }
                 else if (matrixBord[view_i+sum3][view_j-sum3].charAt(1)=='e' && sev_spitak==true && is_shax==true) {
                     imageRamkaPix_ojandak[view_i+sum3]=new ImageView(this);
                     imageRamkaPix_ojandak[view_i+sum3].setImageResource(R.drawable.ramka);
                     params_images = new RelativeLayout.LayoutParams(widthLayoutMatrix / 8, widthLayoutMatrix / 8);
                     params_images.setMargins(leftPix - 10-sum3*widthLayoutMatrix/8,
                             topPix - 10+sum3*widthLayoutMatrix/8, 0, 0);
                     rLayout.addView(imageRamkaPix_ojandak[view_i+sum3], params_images);
                     imageClicked = imageName;
                     clicedRamkaPix_ojandak[view_i+sum3] = "1";
                     opponentFigure4=false;
                     oponentPixString_ojandak[view_i+sum3]=matrixBord[view_i+sum3][view_j-sum3];
                     imageRamkaPix_ojandak[view_i+sum3].setOnClickListener(this);
                 }
                 else if (matrixBord[view_i+sum3][view_j-sum3].charAt(1)=='p' && sev_spitak==false && is_shax==true) {
                     imageRamkaPix_ojandak[view_i+sum3]=new ImageView(this);
                     imageRamkaPix_ojandak[view_i+sum3].setImageResource(R.drawable.ramka);
                     params_images = new RelativeLayout.LayoutParams(widthLayoutMatrix / 8, widthLayoutMatrix / 8);
                     params_images.setMargins(leftPix - 10-sum3*widthLayoutMatrix/8,
                             topPix - 10+sum3*widthLayoutMatrix/8, 0, 0);
                     rLayout.addView(imageRamkaPix_ojandak[view_i+sum3], params_images);
                     imageClicked = imageName;
                     clicedRamkaPix_ojandak[view_i+sum3] = "1";
                     opponentFigure4=false;
                     oponentPixString_ojandak[view_i+sum3]=matrixBord[view_i+sum3][view_j-sum3];
                     imageRamkaPix_ojandak[view_i+sum3].setOnClickListener(this);
                 }
             }
         }

         if (clickedRamkaPix_glxavor[0].equals("1")) {
             imageRamkaPix_glxavor[0].setId(R.id.ramka_Pix_glxavor_1);
         }
         if (clickedRamkaPix_glxavor[1].equals("1")) {
             imageRamkaPix_glxavor[1].setId(R.id.ramka_Pix_glxavor_2);
         }
         if (clickedRamkaPix_glxavor[2].equals("1")) {
             imageRamkaPix_glxavor[2].setId(R.id.ramka_Pix_glxavor_3);
         }
         if (clickedRamkaPix_glxavor[3].equals("1")) {
             imageRamkaPix_glxavor[3].setId(R.id.ramka_Pix_glxavor_4);
         }
         if (clickedRamkaPix_glxavor[4].equals("1")) {
             imageRamkaPix_glxavor[4].setId(R.id.ramka_Pix_glxavor_5);
         }
         if (clickedRamkaPix_glxavor[5].equals("1")) {
             imageRamkaPix_glxavor[5].setId(R.id.ramka_Pix_glxavor_6);
         }
         if (clickedRamkaPix_glxavor[6].equals("1")) {
             imageRamkaPix_glxavor[6].setId(R.id.ramka_Pix_glxavor_7);
         }
         if (clickedRamkaPix_glxavor[7].equals("1")) {
             imageRamkaPix_glxavor[7].setId(R.id.ramka_Pix_glxavor_8);
         }


         if (clicedRamkaPix_ojandak[0].equals("1")) {
             imageRamkaPix_ojandak[0].setId(R.id.ramka_Pix_ojandak_1);
         }
         if (clicedRamkaPix_ojandak[1].equals("1")) {
             imageRamkaPix_ojandak[1].setId(R.id.ramka_Pix_ojandak_2);
         }
         if (clicedRamkaPix_ojandak[2].equals("1")) {
             imageRamkaPix_ojandak[2].setId(R.id.ramka_Pix_ojandak_3);
         }
         if (clicedRamkaPix_ojandak[3].equals("1")) {
             imageRamkaPix_ojandak[3].setId(R.id.ramka_Pix_ojandak_4);
         }
         if (clicedRamkaPix_ojandak[4].equals("1")) {
             imageRamkaPix_ojandak[4].setId(R.id.ramka_Pix_ojandak_5);
         }
         if (clicedRamkaPix_ojandak[5].equals("1")) {
             imageRamkaPix_ojandak[5].setId(R.id.ramka_Pix_ojandak_6);
         }
         if (clicedRamkaPix_ojandak[6].equals("1")) {
             imageRamkaPix_ojandak[6].setId(R.id.ramka_Pix_ojandak_7);
         }
         if (clicedRamkaPix_ojandak[7].equals("1")) {
             imageRamkaPix_ojandak[7].setId(R.id.ramka_Pix_ojandak_8);
         }

     }


     //-------------metod pix_ramka_click--------------------------------------------------------------------------------------
     private void clickPixRamka( int num, boolean glxavor_ojandak) {

         if (imageClicked.equals("spitak_pix_1")) {

             if (glxavor_ojandak) {
                 pix_spitak_1.animate().translationXBy(imageRamkaPix_ojandak[num].getLeft()
                         - spitak_pix_1_left + 10).translationYBy(
                         imageRamkaPix_ojandak[num].getTop() - spitak_pix_1_top + 10).setDuration(300);

                 spitak_pix_1_left += imageRamkaPix_ojandak[num].getLeft() - spitak_pix_1_left + 10;
                 spitak_pix_1_top += imageRamkaPix_ojandak[num].getTop() - spitak_pix_1_top + 10;

             }
             else
             {
                 pix_spitak_1.animate().translationXBy(imageRamkaPix_glxavor[num].getLeft()
                         - spitak_pix_1_left + 10).translationYBy(
                         imageRamkaPix_glxavor[num].getTop() - spitak_pix_1_top + 10).setDuration(300);

                 spitak_pix_1_left += imageRamkaPix_glxavor[num].getLeft() - spitak_pix_1_left + 10;
                 spitak_pix_1_top += imageRamkaPix_glxavor[num].getTop() - spitak_pix_1_top + 10;
             }
             imageClickedColor=false;

         }
         else if (imageClicked.equals("spitak_pix_2")) {

             if (glxavor_ojandak) {
                 pix_spitak_2.animate().translationXBy(imageRamkaPix_ojandak[num].getLeft()
                         - spitak_pix_2_left + 10).translationYBy(
                         imageRamkaPix_ojandak[num].getTop() - spitak_pix_2_top + 10).setDuration(300);

                 spitak_pix_2_left += imageRamkaPix_ojandak[num].getLeft() - spitak_pix_2_left + 10;
                 spitak_pix_2_top += imageRamkaPix_ojandak[num].getTop() - spitak_pix_2_top + 10;
             }
             else
             {
                 pix_spitak_2.animate().translationXBy(imageRamkaPix_glxavor[num].getLeft()
                         - spitak_pix_2_left + 10).translationYBy(
                         imageRamkaPix_glxavor[num].getTop() - spitak_pix_2_top + 10).setDuration(300);

                 spitak_pix_2_left += imageRamkaPix_glxavor[num].getLeft() - spitak_pix_2_left + 10;
                 spitak_pix_2_top += imageRamkaPix_glxavor[num].getTop() - spitak_pix_2_top + 10;
             }
             imageClickedColor=false;

         }
         else if (imageClicked.equals("spitak_pix_3")) {

             if (glxavor_ojandak) {
                 zinvor_spitak_1.animate().translationXBy(imageRamkaPix_ojandak[num].getLeft()
                         - spitak_zinvor_1_left + 10).translationYBy(
                         imageRamkaPix_ojandak[num].getTop() - spitak_zinvor_1_top + 10).setDuration(300);

                 spitak_zinvor_1_left += imageRamkaPix_ojandak[num].getLeft() - spitak_zinvor_1_left + 10;
                 spitak_zinvor_1_top += imageRamkaPix_ojandak[num].getTop() - spitak_zinvor_1_top + 10;
             }
             else
             {
                 zinvor_spitak_1.animate().translationXBy(imageRamkaPix_glxavor[num].getLeft()
                         - spitak_zinvor_1_left + 10).translationYBy(
                         imageRamkaPix_glxavor[num].getTop() - spitak_zinvor_1_top + 10).setDuration(300);

                 spitak_zinvor_1_left += imageRamkaPix_glxavor[num].getLeft() - spitak_zinvor_1_left + 10;
                 spitak_zinvor_1_top += imageRamkaPix_glxavor[num].getTop() - spitak_zinvor_1_top + 10;
             }
             imageClickedColor=false;

         }
         else if (imageClicked.equals("spitak_pix_4")) {

             if (glxavor_ojandak) {
                 zinvor_spitak_2.animate().translationXBy(imageRamkaPix_ojandak[num].getLeft()
                         - spitak_zinvor_2_left + 10).translationYBy(
                         imageRamkaPix_ojandak[num].getTop() - spitak_zinvor_2_top + 10).setDuration(300);

                 spitak_zinvor_2_left += imageRamkaPix_ojandak[num].getLeft() - spitak_zinvor_2_left + 10;
                 spitak_zinvor_2_top += imageRamkaPix_ojandak[num].getTop() - spitak_zinvor_2_top + 10;
             }
             else
             {
                 zinvor_spitak_2.animate().translationXBy(imageRamkaPix_glxavor[num].getLeft()
                         - spitak_zinvor_2_left + 10).translationYBy(
                         imageRamkaPix_glxavor[num].getTop() - spitak_zinvor_2_top + 10).setDuration(300);

                 spitak_zinvor_2_left += imageRamkaPix_glxavor[num].getLeft() - spitak_zinvor_2_left + 10;
                 spitak_zinvor_2_top += imageRamkaPix_glxavor[num].getTop() - spitak_zinvor_2_top + 10;
             }
             imageClickedColor=false;

         }
         else if (imageClicked.equals("spitak_pix_5")) {

             if (glxavor_ojandak) {
                 zinvor_spitak_3.animate().translationXBy(imageRamkaPix_ojandak[num].getLeft()
                         - spitak_zinvor_3_left + 10).translationYBy(
                         imageRamkaPix_ojandak[num].getTop() - spitak_zinvor_3_top + 10).setDuration(300);

                 spitak_zinvor_3_left += imageRamkaPix_ojandak[num].getLeft() - spitak_zinvor_3_left + 10;
                 spitak_zinvor_3_top += imageRamkaPix_ojandak[num].getTop() - spitak_zinvor_3_top + 10;
             }
             else
             {
                 zinvor_spitak_3.animate().translationXBy(imageRamkaPix_glxavor[num].getLeft()
                         - spitak_zinvor_3_left + 10).translationYBy(
                         imageRamkaPix_glxavor[num].getTop() - spitak_zinvor_3_top + 10).setDuration(300);

                 spitak_zinvor_3_left += imageRamkaPix_glxavor[num].getLeft() - spitak_zinvor_3_left + 10;
                 spitak_zinvor_3_top += imageRamkaPix_glxavor[num].getTop() - spitak_zinvor_3_top + 10;
             }
             imageClickedColor=false;

         }
         else if (imageClicked.equals("spitak_pix_6")) {

             if (glxavor_ojandak) {
                 zinvor_spitak_4.animate().translationXBy(imageRamkaPix_ojandak[num].getLeft()
                         - spitak_zinvor_4_left + 10).translationYBy(
                         imageRamkaPix_ojandak[num].getTop() - spitak_zinvor_4_top + 10).setDuration(300);

                 spitak_zinvor_4_left += imageRamkaPix_ojandak[num].getLeft() - spitak_zinvor_4_left + 10;
                 spitak_zinvor_4_top += imageRamkaPix_ojandak[num].getTop() - spitak_zinvor_4_top + 10;
             }
             else
             {
                 zinvor_spitak_4.animate().translationXBy(imageRamkaPix_glxavor[num].getLeft()
                         - spitak_zinvor_4_left + 10).translationYBy(
                         imageRamkaPix_glxavor[num].getTop() - spitak_zinvor_4_top + 10).setDuration(300);

                 spitak_zinvor_4_left += imageRamkaPix_glxavor[num].getLeft() - spitak_zinvor_4_left + 10;
                 spitak_zinvor_4_top += imageRamkaPix_glxavor[num].getTop() - spitak_zinvor_4_top + 10;
             }
             imageClickedColor=false;

         }
         else if (imageClicked.equals("spitak_pix_7")) {

             if (glxavor_ojandak) {
                 zinvor_spitak_5.animate().translationXBy(imageRamkaPix_ojandak[num].getLeft()
                         - spitak_zinvor_5_left + 10).translationYBy(
                         imageRamkaPix_ojandak[num].getTop() - spitak_zinvor_5_top + 10).setDuration(300);

                 spitak_zinvor_5_left += imageRamkaPix_ojandak[num].getLeft() - spitak_zinvor_5_left + 10;
                 spitak_zinvor_5_top += imageRamkaPix_ojandak[num].getTop() - spitak_zinvor_5_top + 10;
             }
             else
             {
                 zinvor_spitak_5.animate().translationXBy(imageRamkaPix_glxavor[num].getLeft()
                         - spitak_zinvor_5_left + 10).translationYBy(
                         imageRamkaPix_glxavor[num].getTop() - spitak_zinvor_5_top + 10).setDuration(300);

                 spitak_zinvor_5_left += imageRamkaPix_glxavor[num].getLeft() - spitak_zinvor_5_left + 10;
                 spitak_zinvor_5_top += imageRamkaPix_glxavor[num].getTop() - spitak_zinvor_5_top + 10;
             }
             imageClickedColor=false;

         }
         else if (imageClicked.equals("spitak_pix_8")) {

             if (glxavor_ojandak) {
                 zinvor_spitak_6.animate().translationXBy(imageRamkaPix_ojandak[num].getLeft()
                         - spitak_zinvor_6_left + 10).translationYBy(
                         imageRamkaPix_ojandak[num].getTop() - spitak_zinvor_6_top + 10).setDuration(300);

                 spitak_zinvor_6_left += imageRamkaPix_ojandak[num].getLeft() - spitak_zinvor_6_left + 10;
                 spitak_zinvor_6_top += imageRamkaPix_ojandak[num].getTop() - spitak_zinvor_6_top + 10;
             }
             else
             {
                 zinvor_spitak_6.animate().translationXBy(imageRamkaPix_glxavor[num].getLeft()
                         - spitak_zinvor_6_left + 10).translationYBy(
                         imageRamkaPix_glxavor[num].getTop() - spitak_zinvor_6_top + 10).setDuration(300);

                 spitak_zinvor_6_left += imageRamkaPix_glxavor[num].getLeft() - spitak_zinvor_6_left + 10;
                 spitak_zinvor_6_top += imageRamkaPix_glxavor[num].getTop() - spitak_zinvor_6_top + 10;
             }
             imageClickedColor=false;

         }
         else if (imageClicked.equals("spitak_pix_9")) {

             if (glxavor_ojandak) {
                 zinvor_spitak_7.animate().translationXBy(imageRamkaPix_ojandak[num].getLeft()
                         - spitak_zinvor_7_left + 10).translationYBy(
                         imageRamkaPix_ojandak[num].getTop() - spitak_zinvor_7_top + 10).setDuration(300);

                 spitak_zinvor_7_left += imageRamkaPix_ojandak[num].getLeft() - spitak_zinvor_7_left + 10;
                 spitak_zinvor_7_top += imageRamkaPix_ojandak[num].getTop() - spitak_zinvor_7_top + 10;
             }
             else
             {
                 zinvor_spitak_7.animate().translationXBy(imageRamkaPix_glxavor[num].getLeft()
                         - spitak_zinvor_7_left + 10).translationYBy(
                         imageRamkaPix_glxavor[num].getTop() - spitak_zinvor_7_top + 10).setDuration(300);

                 spitak_zinvor_7_left += imageRamkaPix_glxavor[num].getLeft() - spitak_zinvor_7_left + 10;
                 spitak_zinvor_7_top += imageRamkaPix_glxavor[num].getTop() - spitak_zinvor_7_top + 10;
             }
             imageClickedColor=false;

         }
         else if (imageClicked.equals("spitak_pix_0")) {

             if (glxavor_ojandak) {
                 zinvor_spitak_8.animate().translationXBy(imageRamkaPix_ojandak[num].getLeft()
                         - spitak_zinvor_8_left + 10).translationYBy(
                         imageRamkaPix_ojandak[num].getTop() - spitak_zinvor_8_top + 10).setDuration(300);

                 spitak_zinvor_8_left += imageRamkaPix_ojandak[num].getLeft() - spitak_zinvor_8_left + 10;
                 spitak_zinvor_8_top += imageRamkaPix_ojandak[num].getTop() - spitak_zinvor_8_top + 10;
             }
             else
             {
                 zinvor_spitak_8.animate().translationXBy(imageRamkaPix_glxavor[num].getLeft()
                         - spitak_zinvor_8_left + 10).translationYBy(
                         imageRamkaPix_glxavor[num].getTop() - spitak_zinvor_8_top + 10).setDuration(300);

                 spitak_zinvor_8_left += imageRamkaPix_glxavor[num].getLeft() - spitak_zinvor_8_left + 10;
                 spitak_zinvor_8_top += imageRamkaPix_glxavor[num].getTop() - spitak_zinvor_8_top + 10;
             }
             imageClickedColor=false;

         }


         else if (imageClicked.equals("sev_pix_1")) {

             if (glxavor_ojandak) {
                 pix_sev_1.animate().translationXBy(imageRamkaPix_ojandak[num].getLeft()
                         - sev_pix_1_left + 10).translationYBy(
                         imageRamkaPix_ojandak[num].getTop() - sev_pix_1_top + 10).setDuration(300);

                 sev_pix_1_left += imageRamkaPix_ojandak[num].getLeft() - sev_pix_1_left + 10;
                 sev_pix_1_top += imageRamkaPix_ojandak[num].getTop() - sev_pix_1_top + 10;
             }
             else
             {
                 pix_sev_1.animate().translationXBy(imageRamkaPix_glxavor[num].getLeft()
                         - sev_pix_1_left + 10).translationYBy(
                         imageRamkaPix_glxavor[num].getTop() - sev_pix_1_top + 10).setDuration(300);

                 sev_pix_1_left += imageRamkaPix_glxavor[num].getLeft() - sev_pix_1_left + 10;
                 sev_pix_1_top += imageRamkaPix_glxavor[num].getTop() - sev_pix_1_top + 10;
             }
             imageClickedColor=true;
         }
         else if (imageClicked.equals("sev_pix_2")) {

             if (glxavor_ojandak) {
                 pix_sev_2.animate().translationXBy(imageRamkaPix_ojandak[num].getLeft()
                         - sev_pix_2_left + 10).translationYBy(
                         imageRamkaPix_ojandak[num].getTop() - sev_pix_2_top + 10).setDuration(300);

                 sev_pix_2_left += imageRamkaPix_ojandak[num].getLeft() - sev_pix_2_left + 10;
                 sev_pix_2_top += imageRamkaPix_ojandak[num].getTop() - sev_pix_2_top + 10;
             }
             else
             {
                 pix_sev_2.animate().translationXBy(imageRamkaPix_glxavor[num].getLeft()
                         - sev_pix_2_left + 10).translationYBy(
                         imageRamkaPix_glxavor[num].getTop() - sev_pix_2_top + 10).setDuration(300);

                 sev_pix_2_left += imageRamkaPix_glxavor[num].getLeft() - sev_pix_2_left + 10;
                 sev_pix_2_top += imageRamkaPix_glxavor[num].getTop() - sev_pix_2_top + 10;
             }
             imageClickedColor=true;

         }
         else if (imageClicked.equals("sev_pix_3")) {

             if (glxavor_ojandak) {
                 zinvor_sev_1.animate().translationXBy(imageRamkaPix_ojandak[num].getLeft()
                         - sev_zinvor_1_left + 10).translationYBy(
                         imageRamkaPix_ojandak[num].getTop() - sev_zinvor_1_top + 10).setDuration(300);

                 sev_zinvor_1_left += imageRamkaPix_ojandak[num].getLeft() - sev_zinvor_1_left + 10;
                 sev_zinvor_1_top += imageRamkaPix_ojandak[num].getTop() - sev_zinvor_1_top + 10;
             }
             else
             {
                 zinvor_sev_1.animate().translationXBy(imageRamkaPix_glxavor[num].getLeft()
                         - sev_zinvor_1_left + 10).translationYBy(
                         imageRamkaPix_glxavor[num].getTop() - sev_zinvor_1_top + 10).setDuration(300);

                 sev_zinvor_1_left += imageRamkaPix_glxavor[num].getLeft() - sev_zinvor_1_left + 10;
                 sev_zinvor_1_top += imageRamkaPix_glxavor[num].getTop() - sev_zinvor_1_top + 10;
             }
             imageClickedColor=true;

         }
         else if (imageClicked.equals("sev_pix_4")) {

             if (glxavor_ojandak) {
                 zinvor_sev_2.animate().translationXBy(imageRamkaPix_ojandak[num].getLeft()
                         - sev_zinvor_2_left + 10).translationYBy(
                         imageRamkaPix_ojandak[num].getTop() - sev_zinvor_2_top + 10).setDuration(300);

                 sev_zinvor_2_left += imageRamkaPix_ojandak[num].getLeft() - sev_zinvor_2_left + 10;
                 sev_zinvor_2_top += imageRamkaPix_ojandak[num].getTop() - sev_zinvor_2_top + 10;
             }
             else
             {
                 zinvor_sev_2.animate().translationXBy(imageRamkaPix_glxavor[num].getLeft()
                         - sev_zinvor_2_left + 10).translationYBy(
                         imageRamkaPix_glxavor[num].getTop() - sev_zinvor_2_top + 10).setDuration(300);

                 sev_zinvor_2_left += imageRamkaPix_glxavor[num].getLeft() - sev_zinvor_2_left + 10;
                 sev_zinvor_2_top += imageRamkaPix_glxavor[num].getTop() - sev_zinvor_2_top + 10;
             }
             imageClickedColor=true;

         }
         else if (imageClicked.equals("sev_pix_5")) {

             if (glxavor_ojandak) {
                 zinvor_sev_3.animate().translationXBy(imageRamkaPix_ojandak[num].getLeft()
                         - sev_zinvor_3_left + 10).translationYBy(
                         imageRamkaPix_ojandak[num].getTop() - sev_zinvor_3_top + 10).setDuration(300);

                 sev_zinvor_3_left += imageRamkaPix_ojandak[num].getLeft() - sev_zinvor_3_left + 10;
                 sev_zinvor_3_top += imageRamkaPix_ojandak[num].getTop() - sev_zinvor_3_top + 10;
             }
             else
             {
                 zinvor_sev_3.animate().translationXBy(imageRamkaPix_glxavor[num].getLeft()
                         - sev_zinvor_3_left + 10).translationYBy(
                         imageRamkaPix_glxavor[num].getTop() - sev_zinvor_3_top + 10).setDuration(300);

                 sev_zinvor_3_left += imageRamkaPix_glxavor[num].getLeft() - sev_zinvor_3_left + 10;
                 sev_zinvor_3_top += imageRamkaPix_glxavor[num].getTop() - sev_zinvor_3_top + 10;
             }
             imageClickedColor=true;

         }
         else if (imageClicked.equals("sev_pix_6")) {

             if (glxavor_ojandak) {
                 zinvor_sev_4.animate().translationXBy(imageRamkaPix_ojandak[num].getLeft()
                         - sev_zinvor_4_left + 10).translationYBy(
                         imageRamkaPix_ojandak[num].getTop() - sev_zinvor_4_top + 10).setDuration(300);

                 sev_zinvor_4_left += imageRamkaPix_ojandak[num].getLeft() - sev_zinvor_4_left + 10;
                 sev_zinvor_4_top += imageRamkaPix_ojandak[num].getTop() - sev_zinvor_4_top + 10;
             }
             else
             {
                 zinvor_sev_4.animate().translationXBy(imageRamkaPix_glxavor[num].getLeft()
                         - sev_zinvor_4_left + 10).translationYBy(
                         imageRamkaPix_glxavor[num].getTop() - sev_zinvor_4_top + 10).setDuration(300);

                 sev_zinvor_4_left += imageRamkaPix_glxavor[num].getLeft() - sev_zinvor_4_left + 10;
                 sev_zinvor_4_top += imageRamkaPix_glxavor[num].getTop() - sev_zinvor_4_top + 10;
             }
             imageClickedColor=true;

         }
         else if (imageClicked.equals("sev_pix_7")) {

             if (glxavor_ojandak) {
                 zinvor_sev_5.animate().translationXBy(imageRamkaPix_ojandak[num].getLeft()
                         - sev_zinvor_5_left + 10).translationYBy(
                         imageRamkaPix_ojandak[num].getTop() - sev_zinvor_5_top + 10).setDuration(300);

                 sev_zinvor_5_left += imageRamkaPix_ojandak[num].getLeft() - sev_zinvor_5_left + 10;
                 sev_zinvor_5_top += imageRamkaPix_ojandak[num].getTop() - sev_zinvor_5_top + 10;
             }
             else
             {
                 zinvor_sev_5.animate().translationXBy(imageRamkaPix_glxavor[num].getLeft()
                         - sev_zinvor_5_left + 10).translationYBy(
                         imageRamkaPix_glxavor[num].getTop() - sev_zinvor_5_top + 10).setDuration(300);

                 sev_zinvor_5_left += imageRamkaPix_glxavor[num].getLeft() - sev_zinvor_5_left + 10;
                 sev_zinvor_5_top += imageRamkaPix_glxavor[num].getTop() - sev_zinvor_5_top + 10;
             }
             imageClickedColor=true;

         }
         else if (imageClicked.equals("sev_pix_8")) {

             if (glxavor_ojandak) {
                 zinvor_sev_6.animate().translationXBy(imageRamkaPix_ojandak[num].getLeft()
                         - sev_zinvor_6_left + 10).translationYBy(
                         imageRamkaPix_ojandak[num].getTop() - sev_zinvor_6_top + 10).setDuration(300);

                 sev_zinvor_6_left += imageRamkaPix_ojandak[num].getLeft() - sev_zinvor_6_left + 10;
                 sev_zinvor_6_top += imageRamkaPix_ojandak[num].getTop() - sev_zinvor_6_top + 10;
             }
             else
             {
                 zinvor_sev_6.animate().translationXBy(imageRamkaPix_glxavor[num].getLeft()
                         - sev_zinvor_6_left + 10).translationYBy(
                         imageRamkaPix_glxavor[num].getTop() - sev_zinvor_6_top + 10).setDuration(300);

                 sev_zinvor_6_left += imageRamkaPix_glxavor[num].getLeft() - sev_zinvor_6_left + 10;
                 sev_zinvor_6_top += imageRamkaPix_glxavor[num].getTop() - sev_zinvor_6_top + 10;
             }
             imageClickedColor=true;

         }
         else if (imageClicked.equals("sev_pix_9")) {

             if (glxavor_ojandak) {
                 zinvor_sev_7.animate().translationXBy(imageRamkaPix_ojandak[num].getLeft()
                         - sev_zinvor_7_left + 10).translationYBy(
                         imageRamkaPix_ojandak[num].getTop() - sev_zinvor_7_top + 10).setDuration(300);

                 sev_zinvor_7_left += imageRamkaPix_ojandak[num].getLeft() - sev_zinvor_7_left + 10;
                 sev_zinvor_7_top += imageRamkaPix_ojandak[num].getTop() - sev_zinvor_7_top + 10;
             }
             else
             {
                 zinvor_sev_7.animate().translationXBy(imageRamkaPix_glxavor[num].getLeft()
                         - sev_zinvor_7_left + 10).translationYBy(
                         imageRamkaPix_glxavor[num].getTop() - sev_zinvor_7_top + 10).setDuration(300);

                 sev_zinvor_7_left += imageRamkaPix_glxavor[num].getLeft() - sev_zinvor_7_left + 10;
                 sev_zinvor_7_top += imageRamkaPix_glxavor[num].getTop() - sev_zinvor_7_top + 10;
             }
             imageClickedColor=true;

         }
         else if (imageClicked.equals("sev_pix_0")) {

             if (glxavor_ojandak) {
                 zinvor_sev_8.animate().translationXBy(imageRamkaPix_ojandak[num].getLeft()
                         - sev_zinvor_8_left + 10).translationYBy(
                         imageRamkaPix_ojandak[num].getTop() - sev_zinvor_8_top + 10).setDuration(300);

                 sev_zinvor_8_left += imageRamkaPix_ojandak[num].getLeft() - sev_zinvor_8_left + 10;
                 sev_zinvor_8_top += imageRamkaPix_ojandak[num].getTop() - sev_zinvor_8_top + 10;
             }
             else
             {
                 zinvor_sev_8.animate().translationXBy(imageRamkaPix_glxavor[num].getLeft()
                         - sev_zinvor_8_left + 10).translationYBy(
                         imageRamkaPix_glxavor[num].getTop() - sev_zinvor_8_top + 10).setDuration(300);

                 sev_zinvor_8_left += imageRamkaPix_glxavor[num].getLeft() - sev_zinvor_8_left + 10;
                 sev_zinvor_8_top += imageRamkaPix_glxavor[num].getTop() - sev_zinvor_8_top + 10;
             }
             imageClickedColor=true;

         }


         else if (imageClicked.equals("spitak_taguhi")) {

             if (glxavor_ojandak) {
                 taguhi_spitak.animate().translationXBy(imageRamkaPix_ojandak[num].getLeft()
                         - spitak_taguhi_left + 10).translationYBy(
                         imageRamkaPix_ojandak[num].getTop() - spitak_taguhi_top + 10).setDuration(300);

                 spitak_taguhi_left += imageRamkaPix_ojandak[num].getLeft() - spitak_taguhi_left + 10;
                 spitak_taguhi_top += imageRamkaPix_ojandak[num].getTop() - spitak_taguhi_top + 10;
             }
             else
             {
                 taguhi_spitak.animate().translationXBy(imageRamkaPix_glxavor[num].getLeft()
                         - spitak_taguhi_left + 10).translationYBy(
                         imageRamkaPix_glxavor[num].getTop() - spitak_taguhi_top + 10).setDuration(300);

                 spitak_taguhi_left += imageRamkaPix_glxavor[num].getLeft() - spitak_taguhi_left + 10;
                 spitak_taguhi_top += imageRamkaPix_glxavor[num].getTop() - spitak_taguhi_top + 10;
             }
             imageClickedColor=false;

         }
         else if (imageClicked.equals("spitak_taguhi_1")) {

             if (glxavor_ojandak) {
                 zinvor_spitak_1.animate().translationXBy(imageRamkaPix_ojandak[num].getLeft()
                         - spitak_zinvor_1_left + 10).translationYBy(
                         imageRamkaPix_ojandak[num].getTop() - spitak_zinvor_1_top + 10).setDuration(300);

                 spitak_zinvor_1_left += imageRamkaPix_ojandak[num].getLeft() - spitak_zinvor_1_left + 10;
                 spitak_zinvor_1_top += imageRamkaPix_ojandak[num].getTop() - spitak_zinvor_1_top + 10;
             }
             else
             {
                 zinvor_spitak_1.animate().translationXBy(imageRamkaPix_glxavor[num].getLeft()
                         - spitak_zinvor_1_left + 10).translationYBy(
                         imageRamkaPix_glxavor[num].getTop() - spitak_zinvor_1_top + 10).setDuration(300);

                 spitak_zinvor_1_left += imageRamkaPix_glxavor[num].getLeft() - spitak_zinvor_1_left + 10;
                 spitak_zinvor_1_top += imageRamkaPix_glxavor[num].getTop() - spitak_zinvor_1_top + 10;
             }
             imageClickedColor=false;

         }
         else if (imageClicked.equals("spitak_taguhi_2")) {

             if (glxavor_ojandak) {
                 zinvor_spitak_2.animate().translationXBy(imageRamkaPix_ojandak[num].getLeft()
                         - spitak_zinvor_2_left + 10).translationYBy(
                         imageRamkaPix_ojandak[num].getTop() - spitak_zinvor_2_top + 10).setDuration(300);

                 spitak_zinvor_2_left += imageRamkaPix_ojandak[num].getLeft() - spitak_zinvor_2_left + 10;
                 spitak_zinvor_2_top += imageRamkaPix_ojandak[num].getTop() - spitak_zinvor_2_top + 10;
             }
             else
             {
                 zinvor_spitak_2.animate().translationXBy(imageRamkaPix_glxavor[num].getLeft()
                         - spitak_zinvor_2_left + 10).translationYBy(
                         imageRamkaPix_glxavor[num].getTop() - spitak_zinvor_2_top + 10).setDuration(300);

                 spitak_zinvor_2_left += imageRamkaPix_glxavor[num].getLeft() - spitak_zinvor_2_left + 10;
                 spitak_zinvor_2_top += imageRamkaPix_glxavor[num].getTop() - spitak_zinvor_2_top + 10;
             }
             imageClickedColor=false;

         }
         else if (imageClicked.equals("spitak_taguhi_3")) {

             if (glxavor_ojandak) {
                 zinvor_spitak_3.animate().translationXBy(imageRamkaPix_ojandak[num].getLeft()
                         - spitak_zinvor_3_left + 10).translationYBy(
                         imageRamkaPix_ojandak[num].getTop() - spitak_zinvor_3_top + 10).setDuration(300);

                 spitak_zinvor_3_left += imageRamkaPix_ojandak[num].getLeft() - spitak_zinvor_3_left + 10;
                 spitak_zinvor_3_top += imageRamkaPix_ojandak[num].getTop() - spitak_zinvor_3_top + 10;
             }
             else
             {
                 zinvor_spitak_3.animate().translationXBy(imageRamkaPix_glxavor[num].getLeft()
                         - spitak_zinvor_3_left + 10).translationYBy(
                         imageRamkaPix_glxavor[num].getTop() - spitak_zinvor_3_top + 10).setDuration(300);

                 spitak_zinvor_3_left += imageRamkaPix_glxavor[num].getLeft() - spitak_zinvor_3_left + 10;
                 spitak_zinvor_3_top += imageRamkaPix_glxavor[num].getTop() - spitak_zinvor_3_top + 10;
             }
             imageClickedColor=false;

         }
         else if (imageClicked.equals("spitak_taguhi_4")) {

             if (glxavor_ojandak) {
                 zinvor_spitak_4.animate().translationXBy(imageRamkaPix_ojandak[num].getLeft()
                         - spitak_zinvor_4_left + 10).translationYBy(
                         imageRamkaPix_ojandak[num].getTop() - spitak_zinvor_4_top + 10).setDuration(300);

                 spitak_zinvor_4_left += imageRamkaPix_ojandak[num].getLeft() - spitak_zinvor_4_left + 10;
                 spitak_zinvor_4_top += imageRamkaPix_ojandak[num].getTop() - spitak_zinvor_4_top + 10;
             }
             else
             {
                 zinvor_spitak_4.animate().translationXBy(imageRamkaPix_glxavor[num].getLeft()
                         - spitak_zinvor_4_left + 10).translationYBy(
                         imageRamkaPix_glxavor[num].getTop() - spitak_zinvor_4_top + 10).setDuration(300);

                 spitak_zinvor_4_left += imageRamkaPix_glxavor[num].getLeft() - spitak_zinvor_4_left + 10;
                 spitak_zinvor_4_top += imageRamkaPix_glxavor[num].getTop() - spitak_zinvor_4_top + 10;
             }
             imageClickedColor=false;

         }
         else if (imageClicked.equals("spitak_taguhi_5")) {

             if (glxavor_ojandak) {
                 zinvor_spitak_5.animate().translationXBy(imageRamkaPix_ojandak[num].getLeft()
                         - spitak_zinvor_5_left + 10).translationYBy(
                         imageRamkaPix_ojandak[num].getTop() - spitak_zinvor_5_top + 10).setDuration(300);

                 spitak_zinvor_5_left += imageRamkaPix_ojandak[num].getLeft() - spitak_zinvor_5_left + 10;
                 spitak_zinvor_5_top += imageRamkaPix_ojandak[num].getTop() - spitak_zinvor_5_top + 10;
             }
             else
             {
                 zinvor_spitak_5.animate().translationXBy(imageRamkaPix_glxavor[num].getLeft()
                         - spitak_zinvor_5_left + 10).translationYBy(
                         imageRamkaPix_glxavor[num].getTop() - spitak_zinvor_5_top + 10).setDuration(300);

                 spitak_zinvor_5_left += imageRamkaPix_glxavor[num].getLeft() - spitak_zinvor_5_left + 10;
                 spitak_zinvor_5_top += imageRamkaPix_glxavor[num].getTop() - spitak_zinvor_5_top + 10;
             }
             imageClickedColor=false;

         }
         else if (imageClicked.equals("spitak_taguhi_6")) {

             if (glxavor_ojandak) {
                 zinvor_spitak_6.animate().translationXBy(imageRamkaPix_ojandak[num].getLeft()
                         - spitak_zinvor_6_left + 10).translationYBy(
                         imageRamkaPix_ojandak[num].getTop() - spitak_zinvor_6_top + 10).setDuration(300);

                 spitak_zinvor_6_left += imageRamkaPix_ojandak[num].getLeft() - spitak_zinvor_6_left + 10;
                 spitak_zinvor_6_top += imageRamkaPix_ojandak[num].getTop() - spitak_zinvor_6_top + 10;
             }
             else
             {
                 zinvor_spitak_6.animate().translationXBy(imageRamkaPix_glxavor[num].getLeft()
                         - spitak_zinvor_6_left + 10).translationYBy(
                         imageRamkaPix_glxavor[num].getTop() - spitak_zinvor_6_top + 10).setDuration(300);

                 spitak_zinvor_6_left += imageRamkaPix_glxavor[num].getLeft() - spitak_zinvor_6_left + 10;
                 spitak_zinvor_6_top += imageRamkaPix_glxavor[num].getTop() - spitak_zinvor_6_top + 10;
             }
             imageClickedColor=false;

         }
         else if (imageClicked.equals("spitak_taguhi_7")) {

             if (glxavor_ojandak) {
                 zinvor_spitak_7.animate().translationXBy(imageRamkaPix_ojandak[num].getLeft()
                         - spitak_zinvor_7_left + 10).translationYBy(
                         imageRamkaPix_ojandak[num].getTop() - spitak_zinvor_7_top + 10).setDuration(300);

                 spitak_zinvor_7_left += imageRamkaPix_ojandak[num].getLeft() - spitak_zinvor_7_left + 10;
                 spitak_zinvor_7_top += imageRamkaPix_ojandak[num].getTop() - spitak_zinvor_7_top + 10;
             }
             else
             {
                 zinvor_spitak_7.animate().translationXBy(imageRamkaPix_glxavor[num].getLeft()
                         - spitak_zinvor_7_left + 10).translationYBy(
                         imageRamkaPix_glxavor[num].getTop() - spitak_zinvor_7_top + 10).setDuration(300);

                 spitak_zinvor_7_left += imageRamkaPix_glxavor[num].getLeft() - spitak_zinvor_7_left + 10;
                 spitak_zinvor_7_top += imageRamkaPix_glxavor[num].getTop() - spitak_zinvor_7_top + 10;
             }
             imageClickedColor=false;

         }
         else if (imageClicked.equals("spitak_taguhi_8")) {

             if (glxavor_ojandak) {
                 zinvor_spitak_8.animate().translationXBy(imageRamkaPix_ojandak[num].getLeft()
                         - spitak_zinvor_8_left + 10).translationYBy(
                         imageRamkaPix_ojandak[num].getTop() - spitak_zinvor_8_top + 10).setDuration(300);

                 spitak_zinvor_8_left += imageRamkaPix_ojandak[num].getLeft() - spitak_zinvor_8_left + 10;
                 spitak_zinvor_8_top += imageRamkaPix_ojandak[num].getTop() - spitak_zinvor_8_top + 10;
             }
             else
             {
                 zinvor_spitak_8.animate().translationXBy(imageRamkaPix_glxavor[num].getLeft()
                         - spitak_zinvor_8_left + 10).translationYBy(
                         imageRamkaPix_glxavor[num].getTop() - spitak_zinvor_8_top + 10).setDuration(300);

                 spitak_zinvor_8_left += imageRamkaPix_glxavor[num].getLeft() - spitak_zinvor_8_left + 10;
                 spitak_zinvor_8_top += imageRamkaPix_glxavor[num].getTop() - spitak_zinvor_8_top + 10;
             }
             imageClickedColor=false;

         }


         else if (imageClicked.equals("sev_taguhi")) {

             if (glxavor_ojandak) {
                 taguhi_sev.animate().translationXBy(imageRamkaPix_ojandak[num].getLeft()
                         - sev_taguhi_left + 10).translationYBy(
                         imageRamkaPix_ojandak[num].getTop() - sev_taguhi_top + 10).setDuration(300);

                 sev_taguhi_left += imageRamkaPix_ojandak[num].getLeft() - sev_taguhi_left + 10;
                 sev_taguhi_top += imageRamkaPix_ojandak[num].getTop() - sev_taguhi_top + 10;
             }
             else
             {
                 taguhi_sev.animate().translationXBy(imageRamkaPix_glxavor[num].getLeft()
                         - sev_taguhi_left + 10).translationYBy(
                         imageRamkaPix_glxavor[num].getTop() - sev_taguhi_top + 10).setDuration(300);

                 sev_taguhi_left += imageRamkaPix_glxavor[num].getLeft() - sev_taguhi_left + 10;
                 sev_taguhi_top += imageRamkaPix_glxavor[num].getTop() - sev_taguhi_top + 10;
             }
             imageClickedColor=true;

         }
         else if (imageClicked.equals("sev_taguhi_1")) {

             if (glxavor_ojandak) {
                 zinvor_sev_1.animate().translationXBy(imageRamkaPix_ojandak[num].getLeft()
                         - sev_zinvor_1_left + 10).translationYBy(
                         imageRamkaPix_ojandak[num].getTop() - sev_zinvor_1_top + 10).setDuration(300);

                 sev_zinvor_1_left += imageRamkaPix_ojandak[num].getLeft() - sev_zinvor_1_left + 10;
                 sev_zinvor_1_top += imageRamkaPix_ojandak[num].getTop() - sev_zinvor_1_top + 10;
             }
             else
             {
                 zinvor_sev_1.animate().translationXBy(imageRamkaPix_glxavor[num].getLeft()
                         - sev_zinvor_1_left + 10).translationYBy(
                         imageRamkaPix_glxavor[num].getTop() - sev_zinvor_1_top + 10).setDuration(300);

                 sev_zinvor_1_left += imageRamkaPix_glxavor[num].getLeft() - sev_zinvor_1_left + 10;
                 sev_zinvor_1_top += imageRamkaPix_glxavor[num].getTop() - sev_zinvor_1_top + 10;
             }
             imageClickedColor=true;

         }
         else if (imageClicked.equals("sev_taguhi_2")) {

             if (glxavor_ojandak) {
                 zinvor_sev_2.animate().translationXBy(imageRamkaPix_ojandak[num].getLeft()
                         - sev_zinvor_2_left + 10).translationYBy(
                         imageRamkaPix_ojandak[num].getTop() - sev_zinvor_2_top + 10).setDuration(300);

                 sev_zinvor_2_left += imageRamkaPix_ojandak[num].getLeft() - sev_zinvor_2_left + 10;
                 sev_zinvor_2_top += imageRamkaPix_ojandak[num].getTop() - sev_zinvor_2_top + 10;
             }
             else
             {
                 zinvor_sev_2.animate().translationXBy(imageRamkaPix_glxavor[num].getLeft()
                         - sev_zinvor_2_left + 10).translationYBy(
                         imageRamkaPix_glxavor[num].getTop() - sev_zinvor_2_top + 10).setDuration(300);

                 sev_zinvor_2_left += imageRamkaPix_glxavor[num].getLeft() - sev_zinvor_2_left + 10;
                 sev_zinvor_2_top += imageRamkaPix_glxavor[num].getTop() - sev_zinvor_2_top + 10;
             }
             imageClickedColor=true;

         }
         else if (imageClicked.equals("sev_taguhi_3")) {

             if (glxavor_ojandak) {
                 zinvor_sev_3.animate().translationXBy(imageRamkaPix_ojandak[num].getLeft()
                         - sev_zinvor_3_left + 10).translationYBy(
                         imageRamkaPix_ojandak[num].getTop() - sev_zinvor_3_top + 10).setDuration(300);

                 sev_zinvor_3_left += imageRamkaPix_ojandak[num].getLeft() - sev_zinvor_3_left + 10;
                 sev_zinvor_3_top += imageRamkaPix_ojandak[num].getTop() - sev_zinvor_3_top + 10;
             }
             else
             {
                 zinvor_sev_3.animate().translationXBy(imageRamkaPix_glxavor[num].getLeft()
                         - sev_zinvor_3_left + 10).translationYBy(
                         imageRamkaPix_glxavor[num].getTop() - sev_zinvor_3_top + 10).setDuration(300);

                 sev_zinvor_3_left += imageRamkaPix_glxavor[num].getLeft() - sev_zinvor_3_left + 10;
                 sev_zinvor_3_top += imageRamkaPix_glxavor[num].getTop() - sev_zinvor_3_top + 10;
             }
             imageClickedColor=true;

         }
         else if (imageClicked.equals("sev_taguhi_4")) {

             if (glxavor_ojandak) {
                 zinvor_sev_4.animate().translationXBy(imageRamkaPix_ojandak[num].getLeft()
                         - sev_zinvor_4_left + 10).translationYBy(
                         imageRamkaPix_ojandak[num].getTop() - sev_zinvor_4_top + 10).setDuration(300);

                 sev_zinvor_4_left += imageRamkaPix_ojandak[num].getLeft() - sev_zinvor_4_left + 10;
                 sev_zinvor_4_top += imageRamkaPix_ojandak[num].getTop() - sev_zinvor_4_top + 10;
             }
             else
             {
                 zinvor_sev_4.animate().translationXBy(imageRamkaPix_glxavor[num].getLeft()
                         - sev_zinvor_4_left + 10).translationYBy(
                         imageRamkaPix_glxavor[num].getTop() - sev_zinvor_4_top + 10).setDuration(300);

                 sev_zinvor_4_left += imageRamkaPix_glxavor[num].getLeft() - sev_zinvor_4_left + 10;
                 sev_zinvor_4_top += imageRamkaPix_glxavor[num].getTop() - sev_zinvor_4_top + 10;
             }
             imageClickedColor=true;

         }
         else if (imageClicked.equals("sev_taguhi_5")) {

             if (glxavor_ojandak) {
                 zinvor_sev_5.animate().translationXBy(imageRamkaPix_ojandak[num].getLeft()
                         - sev_zinvor_5_left + 10).translationYBy(
                         imageRamkaPix_ojandak[num].getTop() - sev_zinvor_5_top + 10).setDuration(300);

                 sev_zinvor_5_left += imageRamkaPix_ojandak[num].getLeft() - sev_zinvor_5_left + 10;
                 sev_zinvor_5_top += imageRamkaPix_ojandak[num].getTop() - sev_zinvor_5_top + 10;
             }
             else
             {
                 zinvor_sev_5.animate().translationXBy(imageRamkaPix_glxavor[num].getLeft()
                         - sev_zinvor_5_left + 10).translationYBy(
                         imageRamkaPix_glxavor[num].getTop() - sev_zinvor_5_top + 10).setDuration(300);

                 sev_zinvor_5_left += imageRamkaPix_glxavor[num].getLeft() - sev_zinvor_5_left + 10;
                 sev_zinvor_5_top += imageRamkaPix_glxavor[num].getTop() - sev_zinvor_5_top + 10;
             }
             imageClickedColor=true;

         }
         else if (imageClicked.equals("sev_taguhi_6")) {

             if (glxavor_ojandak) {
                 zinvor_sev_6.animate().translationXBy(imageRamkaPix_ojandak[num].getLeft()
                         - sev_zinvor_6_left + 10).translationYBy(
                         imageRamkaPix_ojandak[num].getTop() - sev_zinvor_6_top + 10).setDuration(300);

                 sev_zinvor_6_left += imageRamkaPix_ojandak[num].getLeft() - sev_zinvor_6_left + 10;
                 sev_zinvor_6_top += imageRamkaPix_ojandak[num].getTop() - sev_zinvor_6_top + 10;
             }
             else
             {
                 zinvor_sev_6.animate().translationXBy(imageRamkaPix_glxavor[num].getLeft()
                         - sev_zinvor_6_left + 10).translationYBy(
                         imageRamkaPix_glxavor[num].getTop() - sev_zinvor_6_top + 10).setDuration(300);

                 sev_zinvor_6_left += imageRamkaPix_glxavor[num].getLeft() - sev_zinvor_6_left + 10;
                 sev_zinvor_6_top += imageRamkaPix_glxavor[num].getTop() - sev_zinvor_6_top + 10;
             }
             imageClickedColor=true;

         }
         else if (imageClicked.equals("sev_taguhi_7")) {

             if (glxavor_ojandak) {
                 zinvor_sev_7.animate().translationXBy(imageRamkaPix_ojandak[num].getLeft()
                         - sev_zinvor_7_left + 10).translationYBy(
                         imageRamkaPix_ojandak[num].getTop() - sev_zinvor_7_top + 10).setDuration(300);

                 sev_zinvor_7_left += imageRamkaPix_ojandak[num].getLeft() - sev_zinvor_7_left + 10;
                 sev_zinvor_7_top += imageRamkaPix_ojandak[num].getTop() - sev_zinvor_7_top + 10;
             }
             else
             {
                 zinvor_sev_7.animate().translationXBy(imageRamkaPix_glxavor[num].getLeft()
                         - sev_zinvor_7_left + 10).translationYBy(
                         imageRamkaPix_glxavor[num].getTop() - sev_zinvor_7_top + 10).setDuration(300);

                 sev_zinvor_7_left += imageRamkaPix_glxavor[num].getLeft() - sev_zinvor_7_left + 10;
                 sev_zinvor_7_top += imageRamkaPix_glxavor[num].getTop() - sev_zinvor_7_top + 10;
             }
             imageClickedColor=true;

         }
         else if (imageClicked.equals("sev_taguhi_8")) {

             if (glxavor_ojandak) {
                 zinvor_sev_8.animate().translationXBy(imageRamkaPix_ojandak[num].getLeft()
                         - sev_zinvor_8_left + 10).translationYBy(
                         imageRamkaPix_ojandak[num].getTop() - sev_zinvor_8_top + 10).setDuration(300);

                 sev_zinvor_8_left += imageRamkaPix_ojandak[num].getLeft() - sev_zinvor_8_left + 10;
                 sev_zinvor_8_top += imageRamkaPix_ojandak[num].getTop() - sev_zinvor_8_top + 10;
             }
             else
             {
                 zinvor_sev_8.animate().translationXBy(imageRamkaPix_glxavor[num].getLeft()
                         - sev_zinvor_8_left + 10).translationYBy(
                         imageRamkaPix_glxavor[num].getTop() - sev_zinvor_8_top + 10).setDuration(300);

                 sev_zinvor_8_left += imageRamkaPix_glxavor[num].getLeft() - sev_zinvor_8_left + 10;
                 sev_zinvor_8_top += imageRamkaPix_glxavor[num].getTop() - sev_zinvor_8_top + 10;
             }
             imageClickedColor=true;

         }

         String s="";

         if (glxavor_ojandak) {
             s = oponentPixString_ojandak[num];
             oponentPixString_ojandak[num] = "";
         }
         else  {
             s = oponentPixString_glxavor[num];
             oponentPixString_glxavor[num]="";
         }

             if (s.equals("sev_zinvor_1")) {

                 zinvor_sev_1.setVisibility(View.GONE);
                 for (int i=0; i<8; i++) {
                     for (int j=0; j<8; j++) {
                         if (matrixBord[i][j].equals("sev_zinvor_1")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }


             }
             else if (s.equals("sev_zinvor_2")) {

                 zinvor_sev_2.setVisibility(View.GONE);
                 for (int i=0; i<8; i++) {
                     for (int j=0; j<8; j++) {
                         if (matrixBord[i][j].equals("sev_zinvor_2")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             }
             else if (s.equals("sev_zinvor_3")) {

                 zinvor_sev_3.setVisibility(View.GONE);
                 for (int i=0; i<8; i++) {
                     for (int j=0; j<8; j++) {
                         if (matrixBord[i][j].equals("sev_zinvor_3")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             }
             else if (s.equals("sev_zinvor_4")) {

                 zinvor_sev_4.setVisibility(View.GONE);
                 for (int i=0; i<8; i++) {
                     for (int j=0; j<8; j++) {
                         if (matrixBord[i][j].equals("sev_zinvor_4")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             }
             else if (s.equals("sev_zinvor_5")) {

                 zinvor_sev_5.setVisibility(View.GONE);
                 for (int i=0; i<8; i++) {
                     for (int j=0; j<8; j++) {
                         if (matrixBord[i][j].equals("sev_zinvor_5")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             }
             else if (s.equals("sev_zinvor_6")) {

                 zinvor_sev_6.setVisibility(View.GONE);
                 for (int i=0; i<8; i++) {
                     for (int j=0; j<8; j++) {
                         if (matrixBord[i][j].equals("sev_zinvor_6")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             }
             else if (s.equals("sev_zinvor_7")) {

                 zinvor_sev_7.setVisibility(View.GONE);
                 for (int i=0; i<8; i++) {
                     for (int j=0; j<8; j++) {
                         if (matrixBord[i][j].equals("sev_zinvor_7")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             }
             else if (s.equals("sev_zinvor_8")) {

                 zinvor_sev_8.setVisibility(View.GONE);
                 for (int i=0; i<8; i++) {
                     for (int j=0; j<8; j++) {
                         if (matrixBord[i][j].equals("sev_zinvor_8")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             }


             else if (s.equals("sev_navak_1")) {

                 navak_sev_1.setVisibility(View.GONE);
                 for (int i=0; i<8; i++) {
                     for (int j=0; j<8; j++) {
                         if (matrixBord[i][j].equals("sev_navak_1")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             }
             else if (s.equals("sev_navak_2")) {

                 navak_sev_2.setVisibility(View.GONE);
                 for (int i=0; i<8; i++) {
                     for (int j=0; j<8; j++) {
                         if (matrixBord[i][j].equals("sev_navak_2")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             }
             else if (s.equals("sev_navak_3")) {

                 zinvor_sev_1.setVisibility(View.GONE);
                 for (int i=0; i<8; i++) {
                     for (int j=0; j<8; j++) {
                         if (matrixBord[i][j].equals("sev_navak_3")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             }
             else if (s.equals("sev_navak_4")) {

                 zinvor_sev_2.setVisibility(View.GONE);
                 for (int i=0; i<8; i++) {
                     for (int j=0; j<8; j++) {
                         if (matrixBord[i][j].equals("sev_navak_4")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             }
             else if (s.equals("sev_navak_5")) {

                 zinvor_sev_3.setVisibility(View.GONE);
                 for (int i=0; i<8; i++) {
                     for (int j=0; j<8; j++) {
                         if (matrixBord[i][j].equals("sev_navak_5")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             }
             else if (s.equals("sev_navak_6")) {

                 zinvor_sev_4.setVisibility(View.GONE);
                 for (int i=0; i<8; i++) {
                     for (int j=0; j<8; j++) {
                         if (matrixBord[i][j].equals("sev_navak_6")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             }
             else if (s.equals("sev_navak_7")) {

                 zinvor_sev_5.setVisibility(View.GONE);
                 for (int i=0; i<8; i++) {
                     for (int j=0; j<8; j++) {
                         if (matrixBord[i][j].equals("sev_navak_7")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             }
             else if (s.equals("sev_navak_8")) {

                 zinvor_sev_6.setVisibility(View.GONE);
                 for (int i=0; i<8; i++) {
                     for (int j=0; j<8; j++) {
                         if (matrixBord[i][j].equals("sev_navak_8")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             }
             else if (s.equals("sev_navak_9")) {

                 zinvor_sev_7.setVisibility(View.GONE);
                 for (int i=0; i<8; i++) {
                     for (int j=0; j<8; j++) {
                         if (matrixBord[i][j].equals("sev_navak_9")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             }
             else if (s.equals("sev_navak_0")) {

                 zinvor_sev_8.setVisibility(View.GONE);
                 for (int i=0; i<8; i++) {
                     for (int j=0; j<8; j++) {
                         if (matrixBord[i][j].equals("sev_navak_0")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             }


             else if (s.equals("sev_dzi_1")) {

                 dzi_sev_1.setVisibility(View.GONE);
                 for (int i=0; i<8; i++) {
                     for (int j=0; j<8; j++) {
                         if (matrixBord[i][j].equals("sev_dzi_1")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             }
             else if (s.equals("sev_dzi_2")) {

                 dzi_sev_2.setVisibility(View.GONE);
                 for (int i=0; i<8; i++) {
                     for (int j=0; j<8; j++) {
                         if (matrixBord[i][j].equals("sev_dzi_2")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             }
             else if (s.equals("sev_dzi_3")) {

                 zinvor_sev_1.setVisibility(View.GONE);
                 for (int i=0; i<8; i++) {
                     for (int j=0; j<8; j++) {
                         if (matrixBord[i][j].equals("sev_dzi_3")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             }
             else if (s.equals("sev_dzi_4")) {

                 zinvor_sev_2.setVisibility(View.GONE);
                 for (int i=0; i<8; i++) {
                     for (int j=0; j<8; j++) {
                         if (matrixBord[i][j].equals("sev_dzi_4")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             }
             else if (s.equals("sev_dzi_5")) {

                 zinvor_sev_3.setVisibility(View.GONE);
                 for (int i=0; i<8; i++) {
                     for (int j=0; j<8; j++) {
                         if (matrixBord[i][j].equals("sev_dzi_5")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             }
             else if (s.equals("sev_dzi_6")) {

                 zinvor_sev_4.setVisibility(View.GONE);
                 for (int i=0; i<8; i++) {
                     for (int j=0; j<8; j++) {
                         if (matrixBord[i][j].equals("sev_dzi_6")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             }
             else if (s.equals("sev_dzi_7")) {

                 zinvor_sev_5.setVisibility(View.GONE);
                 for (int i=0; i<8; i++) {
                     for (int j=0; j<8; j++) {
                         if (matrixBord[i][j].equals("sev_dzi_7")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             }
             else if (s.equals("sev_dzi_8")) {

                 zinvor_sev_6.setVisibility(View.GONE);
                 for (int i=0; i<8; i++) {
                     for (int j=0; j<8; j++) {
                         if (matrixBord[i][j].equals("sev_dzi_8")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             }
             else if (s.equals("sev_dzi_9")) {

                 zinvor_sev_7.setVisibility(View.GONE);
                 for (int i=0; i<8; i++) {
                     for (int j=0; j<8; j++) {
                         if (matrixBord[i][j].equals("sev_dzi_9")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             }
             else if (s.equals("sev_dzi_0")) {

                 zinvor_sev_8.setVisibility(View.GONE);
                 for (int i=0; i<8; i++) {
                     for (int j=0; j<8; j++) {
                         if (matrixBord[i][j].equals("sev_dzi_0")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             }


             else if (s.equals("sev_pix_1")) {

                 pix_sev_1.setVisibility(View.GONE);
                 for (int i=0; i<8; i++) {
                     for (int j=0; j<8; j++) {
                         if (matrixBord[i][j].equals("sev_pix_1")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             }
             else if (s.equals("sev_pix_2")) {

                 pix_sev_2.setVisibility(View.GONE);
                 for (int i=0; i<8; i++) {
                     for (int j=0; j<8; j++) {
                         if (matrixBord[i][j].equals("sev_pix_2")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             }
             else if (s.equals("sev_pix_3")) {

                 zinvor_sev_1.setVisibility(View.GONE);
                 for (int i=0; i<8; i++) {
                     for (int j=0; j<8; j++) {
                         if (matrixBord[i][j].equals("sev_pix_3")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             }
             else if (s.equals("sev_pix_4")) {

                 zinvor_sev_2.setVisibility(View.GONE);
                 for (int i=0; i<8; i++) {
                     for (int j=0; j<8; j++) {
                         if (matrixBord[i][j].equals("sev_pix_4")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             }
             else if (s.equals("sev_pix_5")) {

                 zinvor_sev_3.setVisibility(View.GONE);
                 for (int i=0; i<8; i++) {
                     for (int j=0; j<8; j++) {
                         if (matrixBord[i][j].equals("sev_pix_5")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             }
             else if (s.equals("sev_pix_6")) {

                 zinvor_sev_4.setVisibility(View.GONE);
                 for (int i=0; i<8; i++) {
                     for (int j=0; j<8; j++) {
                         if (matrixBord[i][j].equals("sev_pix_6")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             }
             else if (s.equals("sev_pix_7")) {

                 zinvor_sev_5.setVisibility(View.GONE);
                 for (int i=0; i<8; i++) {
                     for (int j=0; j<8; j++) {
                         if (matrixBord[i][j].equals("sev_pix_7")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             }
             else if (s.equals("sev_pix_8")) {

                 zinvor_sev_6.setVisibility(View.GONE);
                 for (int i=0; i<8; i++) {
                     for (int j=0; j<8; j++) {
                         if (matrixBord[i][j].equals("sev_pix_8")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             }
             else if (s.equals("sev_pix_9")) {

                 zinvor_sev_7.setVisibility(View.GONE);
                 for (int i=0; i<8; i++) {
                     for (int j=0; j<8; j++) {
                         if (matrixBord[i][j].equals("sev_pix_9")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             }
             else if (s.equals("sev_pix_0")) {

                 zinvor_sev_8.setVisibility(View.GONE);
                 for (int i=0; i<8; i++) {
                     for (int j=0; j<8; j++) {
                         if (matrixBord[i][j].equals("sev_pix_0")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             }


             else if (s.equals("sev_taguhi")) {

                 taguhi_sev.setVisibility(View.GONE);
                 for (int i=0; i<8; i++) {
                     for (int j=0; j<8; j++) {
                         if (matrixBord[i][j].equals("sev_taguhi")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             }
             else if (s.equals("sev_taguhi_1")) {

                 zinvor_sev_1.setVisibility(View.GONE);
                 for (int i=0; i<8; i++) {
                     for (int j=0; j<8; j++) {
                         if (matrixBord[i][j].equals("sev_taguhi_1")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             }
             else if (s.equals("sev_taguhi_2")) {

                 zinvor_sev_2.setVisibility(View.GONE);
                 for (int i=0; i<8; i++) {
                     for (int j=0; j<8; j++) {
                         if (matrixBord[i][j].equals("sev_taguhi_2")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             }
             else if (s.equals("sev_taguhi_3")) {

                 zinvor_sev_3.setVisibility(View.GONE);
                 for (int i=0; i<8; i++) {
                     for (int j=0; j<8; j++) {
                         if (matrixBord[i][j].equals("sev_taguhi_3")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             }
             else if (s.equals("sev_taguhi_4")) {

                 zinvor_sev_4.setVisibility(View.GONE);
                 for (int i=0; i<8; i++) {
                     for (int j=0; j<8; j++) {
                         if (matrixBord[i][j].equals("sev_taguhi_4")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             }
             else if (s.equals("sev_taguhi_5")) {

                 zinvor_sev_5.setVisibility(View.GONE);
                 for (int i=0; i<8; i++) {
                     for (int j=0; j<8; j++) {
                         if (matrixBord[i][j].equals("sev_taguhi_5")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             }
             else if (s.equals("sev_taguhi_6")) {

                 zinvor_sev_6.setVisibility(View.GONE);
                 for (int i=0; i<8; i++) {
                     for (int j=0; j<8; j++) {
                         if (matrixBord[i][j].equals("sev_taguhi_6")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             }
             else if (s.equals("sev_taguhi_7")) {

                 zinvor_sev_7.setVisibility(View.GONE);
                 for (int i=0; i<8; i++) {
                     for (int j=0; j<8; j++) {
                         if (matrixBord[i][j].equals("sev_taguhi_7")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             }
             else if (s.equals("sev_taguhi_8")) {

                 zinvor_sev_8.setVisibility(View.GONE);
                 for (int i=0; i<8; i++) {
                     for (int j=0; j<8; j++) {
                         if (matrixBord[i][j].equals("sev_taguhi_8")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             }


             else if (s.equals("spitak_zinvor_1")) {

                 zinvor_spitak_1.setVisibility(View.GONE);
                 for (int i=0; i<8; i++) {
                     for (int j=0; j<8; j++) {
                         if (matrixBord[i][j].equals("spitak_zinvor_1")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             }
             else if (s.equals("spitak_zinvor_2")) {

                 zinvor_spitak_2.setVisibility(View.GONE);
                 for (int i=0; i<8; i++) {
                     for (int j=0; j<8; j++) {
                         if (matrixBord[i][j].equals("spitak_zinvor_2")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             }
             else if (s.equals("spitak_zinvor_3")) {

                 zinvor_spitak_3.setVisibility(View.GONE);
                 for (int i=0; i<8; i++) {
                     for (int j=0; j<8; j++) {
                         if (matrixBord[i][j].equals("spitak_zinvor_3")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             }
             else if (s.equals("spitak_zinvor_4")) {

                 zinvor_spitak_4.setVisibility(View.GONE);
                 for (int i=0; i<8; i++) {
                     for (int j=0; j<8; j++) {
                         if (matrixBord[i][j].equals("spitak_zinvor_4")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             }
             else if (s.equals("spitak_zinvor_5")) {

                 zinvor_spitak_5.setVisibility(View.GONE);
                 for (int i=0; i<8; i++) {
                     for (int j=0; j<8; j++) {
                         if (matrixBord[i][j].equals("spitak_zinvor_5")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             }
             else if (s.equals("spitak_zinvor_6")) {

                 zinvor_spitak_6.setVisibility(View.GONE);
                 for (int i=0; i<8; i++) {
                     for (int j=0; j<8; j++) {
                         if (matrixBord[i][j].equals("spitak_zinvor_6")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             }
             else if (s.equals("spitak_zinvor_7")) {

                 zinvor_spitak_7.setVisibility(View.GONE);
                 for (int i=0; i<8; i++) {
                     for (int j=0; j<8; j++) {
                         if (matrixBord[i][j].equals("spitak_zinvor_7")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             }
             else if (s.equals("spitak_zinvor_8")) {

                 zinvor_spitak_8.setVisibility(View.GONE);
                 for (int i=0; i<8; i++) {
                     for (int j=0; j<8; j++) {
                         if (matrixBord[i][j].equals("spitak_zinvor_8")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             }


             else if (s.equals("spitak_navak_1")) {

                 navak_spitak_1.setVisibility(View.GONE);
                 for (int i=0; i<8; i++) {
                     for (int j=0; j<8; j++) {
                         if (matrixBord[i][j].equals("spitak_navak_1")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             }
             else if (s.equals("spitak_navak_2")) {

                 navak_spitak_2.setVisibility(View.GONE);
                 for (int i=0; i<8; i++) {
                     for (int j=0; j<8; j++) {
                         if (matrixBord[i][j].equals("spitak_navak_2")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             }
             else if (s.equals("spitak_navak_3")) {

                 zinvor_spitak_1.setVisibility(View.GONE);
                 for (int i=0; i<8; i++) {
                     for (int j=0; j<8; j++) {
                         if (matrixBord[i][j].equals("spitak_navak_3")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             }
             else if (s.equals("spitak_navak_4")) {

                 zinvor_spitak_2.setVisibility(View.GONE);
                 for (int i=0; i<8; i++) {
                     for (int j=0; j<8; j++) {
                         if (matrixBord[i][j].equals("spitak_navak_4")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             }
             else if (s.equals("spitak_navak_5")) {

                 zinvor_spitak_3.setVisibility(View.GONE);
                 for (int i=0; i<8; i++) {
                     for (int j=0; j<8; j++) {
                         if (matrixBord[i][j].equals("spitak_navak_5")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             }
             else if (s.equals("spitak_navak_6")) {

                 zinvor_spitak_4.setVisibility(View.GONE);
                 for (int i=0; i<8; i++) {
                     for (int j=0; j<8; j++) {
                         if (matrixBord[i][j].equals("spitak_navak_6")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             }
             else if (s.equals("spitak_navak_7")) {

                 zinvor_spitak_5.setVisibility(View.GONE);
                 for (int i=0; i<8; i++) {
                     for (int j=0; j<8; j++) {
                         if (matrixBord[i][j].equals("spitak_navak_7")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             }
             else if (s.equals("spitak_navak_8")) {

                 zinvor_spitak_6.setVisibility(View.GONE);
                 for (int i=0; i<8; i++) {
                     for (int j=0; j<8; j++) {
                         if (matrixBord[i][j].equals("spitak_navak_8")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             }
             else if (s.equals("spitak_navak_9")) {

                 zinvor_spitak_7.setVisibility(View.GONE);
                 for (int i=0; i<8; i++) {
                     for (int j=0; j<8; j++) {
                         if (matrixBord[i][j].equals("spitak_navak_9")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             }
             else if (s.equals("spitak_navak_0")) {

                 zinvor_spitak_8.setVisibility(View.GONE);
                 for (int i=0; i<8; i++) {
                     for (int j=0; j<8; j++) {
                         if (matrixBord[i][j].equals("spitak_navak_0")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             }


             else if (s.equals("spitak_dzi_1")) {

                 dzi_spitak_1.setVisibility(View.GONE);
                 for (int i=0; i<8; i++) {
                     for (int j=0; j<8; j++) {
                         if (matrixBord[i][j].equals("spitak_dzi_1")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             }
             else if (s.equals("spitak_dzi_2")) {

                 dzi_spitak_2.setVisibility(View.GONE);
                 for (int i=0; i<8; i++) {
                     for (int j=0; j<8; j++) {
                         if (matrixBord[i][j].equals("spitak_dzi_2")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             }
             else if (s.equals("spitak_dzi_3")) {

                 zinvor_spitak_1.setVisibility(View.GONE);
                 for (int i=0; i<8; i++) {
                     for (int j=0; j<8; j++) {
                         if (matrixBord[i][j].equals("spitak_dzi_3")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             }
             else if (s.equals("spitak_dzi_4")) {

                 zinvor_spitak_2.setVisibility(View.GONE);
                 for (int i=0; i<8; i++) {
                     for (int j=0; j<8; j++) {
                         if (matrixBord[i][j].equals("spitak_dzi_4")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             }
             else if (s.equals("spitak_dzi_5")) {

                 zinvor_spitak_3.setVisibility(View.GONE);
                 for (int i=0; i<8; i++) {
                     for (int j=0; j<8; j++) {
                         if (matrixBord[i][j].equals("spitak_dzi_5")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             }
             else if (s.equals("spitak_dzi_6")) {

                 zinvor_spitak_4.setVisibility(View.GONE);
                 for (int i=0; i<8; i++) {
                     for (int j=0; j<8; j++) {
                         if (matrixBord[i][j].equals("spitak_dzi_6")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             }
             else if (s.equals("spitak_dzi_7")) {

                 zinvor_spitak_5.setVisibility(View.GONE);
                 for (int i=0; i<8; i++) {
                     for (int j=0; j<8; j++) {
                         if (matrixBord[i][j].equals("spitak_dzi_7")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             }
             else if (s.equals("spitak_dzi_8")) {

                 zinvor_spitak_6.setVisibility(View.GONE);
                 for (int i=0; i<8; i++) {
                     for (int j=0; j<8; j++) {
                         if (matrixBord[i][j].equals("spitak_dzi_8")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             }
             else if (s.equals("spitak_dzi_9")) {

                 zinvor_spitak_7.setVisibility(View.GONE);
                 for (int i=0; i<8; i++) {
                     for (int j=0; j<8; j++) {
                         if (matrixBord[i][j].equals("spitak_dzi_9")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             }
             else if (s.equals("spitak_dzi_0")) {

                 zinvor_spitak_8.setVisibility(View.GONE);
                 for (int i=0; i<8; i++) {
                     for (int j=0; j<8; j++) {
                         if (matrixBord[i][j].equals("spitak_dzi_0")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             }


             else if (s.equals("spitak_pix_1")) {

                 pix_spitak_1.setVisibility(View.GONE);
                 for (int i=0; i<8; i++) {
                     for (int j=0; j<8; j++) {
                         if (matrixBord[i][j].equals("spitak_pix_1")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             }
             else if (s.equals("spitak_pix_2")) {

                 pix_spitak_2.setVisibility(View.GONE);
                 for (int i=0; i<8; i++) {
                     for (int j=0; j<8; j++) {
                         if (matrixBord[i][j].equals("spitak_pix_2")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             }
             else if (s.equals("spitak_pix_3")) {

                 zinvor_spitak_1.setVisibility(View.GONE);
                 for (int i=0; i<8; i++) {
                     for (int j=0; j<8; j++) {
                         if (matrixBord[i][j].equals("spitak_pix_3")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             }
             else if (s.equals("spitak_pix_4")) {

                 zinvor_spitak_2.setVisibility(View.GONE);
                 for (int i=0; i<8; i++) {
                     for (int j=0; j<8; j++) {
                         if (matrixBord[i][j].equals("spitak_pix_4")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             }
             else if (s.equals("spitak_pix_5")) {

                 zinvor_spitak_3.setVisibility(View.GONE);
                 for (int i=0; i<8; i++) {
                     for (int j=0; j<8; j++) {
                         if (matrixBord[i][j].equals("spitak_pix_5")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             }
             else if (s.equals("spitak_pix_6")) {

                 zinvor_spitak_4.setVisibility(View.GONE);
                 for (int i=0; i<8; i++) {
                     for (int j=0; j<8; j++) {
                         if (matrixBord[i][j].equals("spitak_pix_6")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             }
             else if (s.equals("spitak_pix_7")) {

                 zinvor_spitak_5.setVisibility(View.GONE);
                 for (int i=0; i<8; i++) {
                     for (int j=0; j<8; j++) {
                         if (matrixBord[i][j].equals("spitak_pix_7")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             }
             else if (s.equals("spitak_pix_8")) {

                 zinvor_spitak_6.setVisibility(View.GONE);
                 for (int i=0; i<8; i++) {
                     for (int j=0; j<8; j++) {
                         if (matrixBord[i][j].equals("spitak_pix_8")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             }
             else if (s.equals("spitak_pix_9")) {

                 zinvor_spitak_7.setVisibility(View.GONE);
                 for (int i=0; i<8; i++) {
                     for (int j=0; j<8; j++) {
                         if (matrixBord[i][j].equals("spitak_pix_9")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             }
             else if (s.equals("spitak_pix_0")) {

                 zinvor_spitak_8.setVisibility(View.GONE);
                 for (int i=0; i<8; i++) {
                     for (int j=0; j<8; j++) {
                         if (matrixBord[i][j].equals("spitak_pix_0")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             }


             else if (s.equals("spitak_taguhi")) {

                 taguhi_spitak.setVisibility(View.GONE);
                 for (int i=0; i<8; i++) {
                     for (int j=0; j<8; j++) {
                         if (matrixBord[i][j].equals("spitak_taguhi")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }
             }
             else if (s.equals("spitak_taguhi_1")) {

                 zinvor_spitak_1.setVisibility(View.GONE);
                 for (int i=0; i<8; i++) {
                     for (int j=0; j<8; j++) {
                         if (matrixBord[i][j].equals("spitak_taguhi_1")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }
             }
             else if (s.equals("spitak_taguhi_2")) {

                 zinvor_spitak_2.setVisibility(View.GONE);
                 for (int i=0; i<8; i++) {
                     for (int j=0; j<8; j++) {
                         if (matrixBord[i][j].equals("spitak_taguhi_2")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }
             }
             else if (s.equals("spitak_taguhi_3")) {

                 zinvor_spitak_3.setVisibility(View.GONE);
                 for (int i=0; i<8; i++) {
                     for (int j=0; j<8; j++) {
                         if (matrixBord[i][j].equals("spitak_taguhi_3")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }
             }
             else if (s.equals("spitak_taguhi_4")) {

                 zinvor_spitak_4.setVisibility(View.GONE);
                 for (int i=0; i<8; i++) {
                     for (int j=0; j<8; j++) {
                         if (matrixBord[i][j].equals("spitak_taguhi_4")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }
             }
             else if (s.equals("spitak_taguhi_5")) {

                 zinvor_spitak_5.setVisibility(View.GONE);
                 for (int i=0; i<8; i++) {
                     for (int j=0; j<8; j++) {
                         if (matrixBord[i][j].equals("spitak_taguhi_5")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }
             }
             else if (s.equals("spitak_taguhi_6")) {

                 zinvor_spitak_6.setVisibility(View.GONE);
                 for (int i=0; i<8; i++) {
                     for (int j=0; j<8; j++) {
                         if (matrixBord[i][j].equals("spitak_taguhi_6")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }
             }
             else if (s.equals("spitak_taguhi_7")) {

                 zinvor_spitak_7.setVisibility(View.GONE);
                 for (int i=0; i<8; i++) {
                     for (int j=0; j<8; j++) {
                         if (matrixBord[i][j].equals("spitak_taguhi_7")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }
             }
             else if (s.equals("spitak_taguhi_8")) {

                 zinvor_spitak_8.setVisibility(View.GONE);
                 for (int i=0; i<8; i++) {
                     for (int j=0; j<8; j++) {
                         if (matrixBord[i][j].equals("spitak_taguhi_8")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }
             }


         for (int i=0; i<8; i++) {
             oponentPixString_glxavor[i]="";
             oponentPixString_ojandak[i]="";
         }


         if (clickedRamka1.equals("1")) {
             imageRamka1.setVisibility(View.GONE);
             clickedRamka1="";
         }
         if (clickedRamka2.equals("1")) {
             imageRamka2.setVisibility(View.GONE);
             clickedRamka2="";
         }
         if (clickedRamka3.equals("1")) {
             imageRamka3.setVisibility(View.GONE);
             clickedRamka3="";
         }
         if (clickedRamka4.equals("1")) {
             imageRamka4.setVisibility(View.GONE);
             clickedRamka4="";
         }

         for (int i = 0; i < 8; i++) {
             if (clickedRamkaNavah_horizonakan[i].equals("1")) {
                 imageRamkaNavak_horizonakan[i].setVisibility(View.GONE);
                 clickedRamkaNavah_horizonakan[i] = "";
             }
             if (clickedRamkaNavah_uxxahayac[i].equals("1")) {
                 imageRamkaNavak_uxxahayac[i].setVisibility(View.GONE);
                 clickedRamkaNavah_uxxahayac[i] = "";
             }
             if (clickedRamkaPix_glxavor[i].equals("1")) {
                 imageRamkaPix_glxavor[i].setVisibility(View.GONE);
                 clickedRamkaPix_glxavor[i]="";
             }
             if (clicedRamkaPix_ojandak[i].equals("1")) {
                 imageRamkaPix_ojandak[i].setVisibility(View.GONE);
                 clicedRamkaPix_ojandak[i]="";
             }
         }


         if (glxavor_ojandak) {
             String s2 = matrixBord[num][view_j- (num-view_i)];
             matrixBord[num][view_j- (num-view_i)] = matrixBord[view_i][view_j];
             matrixBord[view_i][view_j] = s2;
         }
         else {
             String s2 = matrixBord[view_i+(num-view_j)][num];
             matrixBord[view_i+(num-view_j)][num] = matrixBord[view_i][view_j];
             matrixBord[view_i][view_j] = s2;
         }


         zinvorClickRAmka2_num="";

     }

     //--------------------metod dzi_Click--------------------------------------------------------------------------

     private void dziClick(ImageView imageDzi, int leftDzi, int topDzi, String imageName, boolean sev_spitak) {

         if (clickedRamka1.equals("1")) {
             imageRamka1.setVisibility(View.GONE);
             clickedRamka1 = "";
         }
         if (clickedRamka2.equals("1")) {
             imageRamka2.setVisibility(View.GONE);
             clickedRamka2 = "";
         }
         if (clickedRamka3.equals("1")) {
             imageRamka3.setVisibility(View.GONE);
             clickedRamka3 = "";
         }
         if (clickedRamka4.equals("1")) {
             imageRamka4.setVisibility(View.GONE);
             clickedRamka4 = "";
         }
         if (clickedRamka5.equals("1")) {
             imageRamka5.setVisibility(View.GONE);
             clickedRamka5 = "";
         }
         if (clickedRamka6.equals("1")) {
             imageRamka6.setVisibility(View.GONE);
             clickedRamka6 = "";
         }


         if (clickedRamkaDzi_1.equals("1")) {
             imageRamkaDzi_1.setVisibility(View.GONE);
             clickedRamkaDzi_1="";
         }
         if (clickedRamkaDzi_2.equals("1")) {
             imageRamkaDzi_2.setVisibility(View.GONE);
             clickedRamkaDzi_2="";
         }
         if (clickedRamkaDzi_3.equals("1")) {
             imageRamkaDzi_3.setVisibility(View.GONE);
             clickedRamkaDzi_3="";
         }
         if (clickedRamkaDzi_4.equals("1")) {
             imageRamkaDzi_4.setVisibility(View.GONE);
             clickedRamkaDzi_4="";
         }
         if (clickedRamkaDzi_5.equals("1")) {
             imageRamkaDzi_5.setVisibility(View.GONE);
             clickedRamkaDzi_5="";
         }
         if (clickedRamkaDzi_6.equals("1")) {
             imageRamkaDzi_6.setVisibility(View.GONE);
             clickedRamkaDzi_6="";
         }
         if (clickedRamkaDzi_7.equals("1")) {
             imageRamkaDzi_7.setVisibility(View.GONE);
             clickedRamkaDzi_7="";
         }
         if (clickedRamkaDzi_8.equals("1")) {
             imageRamkaDzi_8.setVisibility(View.GONE);
             clickedRamkaDzi_8="";
         }


         if (clickedRamkaTagavor_1.equals("1")) {
             imageRamkaTagavor_1.setVisibility(View.GONE);
             clickedRamkaTagavor_1="";
         }
         if (clickedRamkaTagavor_2.equals("1")) {
             imageRamkaTagavor_2.setVisibility(View.GONE);
             clickedRamkaTagavor_2="";
         }
         if (clickedRamkaTagavor_3.equals("1")) {
             imageRamkaTagavor_3.setVisibility(View.GONE);
             clickedRamkaTagavor_3="";
         }
         if (clickedRamkaTagavor_4.equals("1")) {
             imageRamkaTagavor_4.setVisibility(View.GONE);
             clickedRamkaTagavor_4="";
         }
         if (clickedRamkaTagavor_5.equals("1")) {
             imageRamkaTagavor_5.setVisibility(View.GONE);
             clickedRamkaTagavor_5="";
         }
         if (clickedRamkaTagavor_6.equals("1")) {
             imageRamkaTagavor_6.setVisibility(View.GONE);
             clickedRamkaTagavor_6="";
         }
         if (clickedRamkaTagavor_7.equals("1")) {
             imageRamkaTagavor_7.setVisibility(View.GONE);
             clickedRamkaTagavor_7="";
         }
         if (clickedRamkaTagavor_8.equals("1")) {
             imageRamkaTagavor_8.setVisibility(View.GONE);
             clickedRamkaTagavor_8="";
         }
         if (clickedRamkaTagavor_9.equals("1")) {
             imageRamkaTagavor_9.setVisibility(View.GONE);
             clickedRamkaTagavor_9="";
         }
         if (clickedRamkaTagavor_10.equals("1")) {
             imageRamkaTagavor_10.setVisibility(View.GONE);
             clickedRamkaTagavor_10="";
         }


         for (int i = 0; i < 8; i++) {
             if (clickedRamkaNavah_horizonakan[i].equals("1")) {
                 imageRamkaNavak_horizonakan[i].setVisibility(View.GONE);
                 clickedRamkaNavah_horizonakan[i] = "";
             }
             if (clickedRamkaNavah_uxxahayac[i].equals("1")) {
                 imageRamkaNavak_uxxahayac[i].setVisibility(View.GONE);
                 clickedRamkaNavah_uxxahayac[i] = "";
             }
             if (clickedRamkaPix_glxavor[i].equals("1")) {
                 imageRamkaPix_glxavor[i].setVisibility(View.GONE);
                 clickedRamkaPix_glxavor[i]="";
             }
             if (clicedRamkaPix_ojandak[i].equals("1")) {
                 imageRamkaPix_ojandak[i].setVisibility(View.GONE);
                 clicedRamkaPix_ojandak[i]="";
             }
         }

         oponentDziString_1="";
         oponentDziString_2="";
         oponentDziString_3="";
         oponentDziString_4="";
         oponentDziString_5="";
         oponentDziString_6="";
         oponentDziString_7="";
         oponentDziString_8="";

         for (int i=0; i<8; i++) {
             for (int j=0; j<8; j++) {
                 if (matrixBord[i][j].equals(imageName)) {
                     view_i=i;
                     view_j=j;
                 }
             }
         }

         boolean is_shax=true;

             if (view_j+1<=7 && view_i-2>=0) {
                 if (sev_spitak==true)
                     is_shax=shax_spitak_tagavor_stugum(view_i-2,view_j+1,imageName,true);
                 else if(sev_spitak==false)
                     is_shax=shax_sev_tagavor_stugum(view_i-2,view_j+1,imageName,true);

                 if (matrixBord[view_i-2][view_j+1].equals("datark") && is_shax==true) {
                     imageRamkaDzi_1=new ImageView(this);
                     imageRamkaDzi_1.setImageResource(R.drawable.ramka);
                     params_images = new RelativeLayout.LayoutParams(widthLayoutMatrix / 8, widthLayoutMatrix / 8);
                     params_images.setMargins(leftDzi - 10+widthLayoutMatrix/8,
                             topDzi - 10-2*widthLayoutMatrix/8, 0, 0);
                     rLayout.addView(imageRamkaDzi_1, params_images);
                     imageClicked = imageName;
                     clickedRamkaDzi_1 = "1";
                     imageRamkaDzi_1.setId(R.id.ramka_Dzi_1);
                     imageRamkaDzi_1.setOnClickListener(this);
                 }
                 else if (matrixBord[view_i-2][view_j+1].charAt(1)=='e' && sev_spitak==true && is_shax==true) {
                     imageRamkaDzi_1=new ImageView(this);
                     imageRamkaDzi_1.setImageResource(R.drawable.ramka);
                     params_images = new RelativeLayout.LayoutParams(widthLayoutMatrix / 8, widthLayoutMatrix / 8);
                     params_images.setMargins(leftDzi - 10+widthLayoutMatrix/8,
                             topDzi - 10-2*widthLayoutMatrix/8, 0, 0);
                     rLayout.addView(imageRamkaDzi_1, params_images);
                     imageClicked = imageName;
                     clickedRamkaDzi_1 = "1";
                     oponentDziString_1=matrixBord[view_i-2][view_j+1];
                     imageRamkaDzi_1.setId(R.id.ramka_Dzi_1);
                     imageRamkaDzi_1.setOnClickListener(this);
                 }
                 else if (matrixBord[view_i-2][view_j+1].charAt(1)=='p' && sev_spitak==false && is_shax==true) {
                     imageRamkaDzi_1=new ImageView(this);
                     imageRamkaDzi_1.setImageResource(R.drawable.ramka);
                     params_images = new RelativeLayout.LayoutParams(widthLayoutMatrix / 8, widthLayoutMatrix / 8);
                     params_images.setMargins(leftDzi - 10+widthLayoutMatrix/8,
                             topDzi - 10-2*widthLayoutMatrix/8, 0, 0);
                     rLayout.addView(imageRamkaDzi_1, params_images);
                     imageClicked = imageName;
                     clickedRamkaDzi_1 = "1";
                     oponentDziString_1=matrixBord[view_i-2][view_j+1];
                     imageRamkaDzi_1.setId(R.id.ramka_Dzi_1);
                     imageRamkaDzi_1.setOnClickListener(this);
                 }

             }
         if (view_j+2<=7 && view_i-1>=0) {
             if (sev_spitak==true)
                 is_shax=shax_spitak_tagavor_stugum(view_i-1,view_j+2,imageName,true);
             else if(sev_spitak==false)
                 is_shax=shax_sev_tagavor_stugum(view_i-1,view_j+2,imageName,true);

             if (matrixBord[view_i-1][view_j+2].equals("datark") && is_shax==true) {
                 imageRamkaDzi_2=new ImageView(this);
                 imageRamkaDzi_2.setImageResource(R.drawable.ramka);
                 params_images = new RelativeLayout.LayoutParams(widthLayoutMatrix / 8, widthLayoutMatrix / 8);
                 params_images.setMargins(leftDzi - 10+2*widthLayoutMatrix/8,
                         topDzi - 10-widthLayoutMatrix/8, 0, 0);
                 rLayout.addView(imageRamkaDzi_2, params_images);
                 imageClicked = imageName;
                 clickedRamkaDzi_2 = "1";
                 imageRamkaDzi_2.setId(R.id.ramka_Dzi_2);
                 imageRamkaDzi_2.setOnClickListener(this);
             }
             else if (matrixBord[view_i-1][view_j+2].charAt(1)=='e' && sev_spitak==true && is_shax==true) {
                 imageRamkaDzi_2=new ImageView(this);
                 imageRamkaDzi_2.setImageResource(R.drawable.ramka);
                 params_images = new RelativeLayout.LayoutParams(widthLayoutMatrix / 8, widthLayoutMatrix / 8);
                 params_images.setMargins(leftDzi - 10+2*widthLayoutMatrix/8,
                         topDzi - 10-widthLayoutMatrix/8, 0, 0);
                 rLayout.addView(imageRamkaDzi_2, params_images);
                 imageClicked = imageName;
                 clickedRamkaDzi_2 = "1";
                 oponentDziString_2=matrixBord[view_i-1][view_j+2];
                 imageRamkaDzi_2.setId(R.id.ramka_Dzi_2);
                 imageRamkaDzi_2.setOnClickListener(this);
             }
             else if (matrixBord[view_i-1][view_j+2].charAt(1)=='p' && sev_spitak==false && is_shax==true) {
                 imageRamkaDzi_2=new ImageView(this);
                 imageRamkaDzi_2.setImageResource(R.drawable.ramka);
                 params_images = new RelativeLayout.LayoutParams(widthLayoutMatrix / 8, widthLayoutMatrix / 8);
                 params_images.setMargins(leftDzi - 10+2*widthLayoutMatrix/8,
                         topDzi - 10-widthLayoutMatrix/8, 0, 0);
                 rLayout.addView(imageRamkaDzi_2, params_images);
                 imageClicked = imageName;
                 clickedRamkaDzi_2 = "1";
                 oponentDziString_2=matrixBord[view_i-1][view_j+2];
                 imageRamkaDzi_2.setId(R.id.ramka_Dzi_2);
                 imageRamkaDzi_2.setOnClickListener(this);
             }

         }
         if (view_j+2<=7 && view_i+1<=7) {
             if (sev_spitak==true)
                 is_shax=shax_spitak_tagavor_stugum(view_i+1,view_j+2,imageName,true);
             else if(sev_spitak==false)
                 is_shax=shax_sev_tagavor_stugum(view_i+1,view_j+2,imageName,true);

             if (matrixBord[view_i+1][view_j+2].equals("datark") && is_shax==true) {
                 imageRamkaDzi_3=new ImageView(this);
                 imageRamkaDzi_3.setImageResource(R.drawable.ramka);
                 params_images = new RelativeLayout.LayoutParams(widthLayoutMatrix / 8, widthLayoutMatrix / 8);
                 params_images.setMargins(leftDzi - 10+2*widthLayoutMatrix/8,
                         topDzi - 10+widthLayoutMatrix/8, 0, 0);
                 rLayout.addView(imageRamkaDzi_3, params_images);
                 imageClicked = imageName;
                 clickedRamkaDzi_3 = "1";
                 imageRamkaDzi_3.setId(R.id.ramka_Dzi_3);
                 imageRamkaDzi_3.setOnClickListener(this);
             }
             else if (matrixBord[view_i+1][view_j+2].charAt(1)=='e' && sev_spitak==true && is_shax==true) {
                 imageRamkaDzi_3=new ImageView(this);
                 imageRamkaDzi_3.setImageResource(R.drawable.ramka);
                 params_images = new RelativeLayout.LayoutParams(widthLayoutMatrix / 8, widthLayoutMatrix / 8);
                 params_images.setMargins(leftDzi - 10+2*widthLayoutMatrix/8,
                         topDzi - 10+widthLayoutMatrix/8, 0, 0);
                 rLayout.addView(imageRamkaDzi_3, params_images);
                 imageClicked = imageName;
                 clickedRamkaDzi_3 = "1";
                 oponentDziString_3=matrixBord[view_i+1][view_j+2];
                 imageRamkaDzi_3.setId(R.id.ramka_Dzi_3);
                 imageRamkaDzi_3.setOnClickListener(this);
             }
             else if (matrixBord[view_i+1][view_j+2].charAt(1)=='p' && sev_spitak==false && is_shax==true) {
                 imageRamkaDzi_3=new ImageView(this);
                 imageRamkaDzi_3.setImageResource(R.drawable.ramka);
                 params_images = new RelativeLayout.LayoutParams(widthLayoutMatrix / 8, widthLayoutMatrix / 8);
                 params_images.setMargins(leftDzi - 10+2*widthLayoutMatrix/8,
                         topDzi - 10+widthLayoutMatrix/8, 0, 0);
                 rLayout.addView(imageRamkaDzi_3, params_images);
                 imageClicked = imageName;
                 clickedRamkaDzi_3 = "1";
                 oponentDziString_3=matrixBord[view_i+1][view_j+2];
                 imageRamkaDzi_3.setId(R.id.ramka_Dzi_3);
                 imageRamkaDzi_3.setOnClickListener(this);
             }

         }
         if (view_j+1<=7 && view_i+2<=7) {
             if (sev_spitak==true)
                 is_shax=shax_spitak_tagavor_stugum(view_i+2,view_j+1,imageName,true);
             else if(sev_spitak==false)
                 is_shax=shax_sev_tagavor_stugum(view_i+2,view_j+1,imageName,true);

             if (matrixBord[view_i+2][view_j+1].equals("datark") && is_shax==true) {
                 imageRamkaDzi_4=new ImageView(this);
                 imageRamkaDzi_4.setImageResource(R.drawable.ramka);
                 params_images = new RelativeLayout.LayoutParams(widthLayoutMatrix / 8, widthLayoutMatrix / 8);
                 params_images.setMargins(leftDzi - 10+widthLayoutMatrix/8,
                         topDzi - 10+2*widthLayoutMatrix/8, 0, 0);
                 rLayout.addView(imageRamkaDzi_4, params_images);
                 imageClicked = imageName;
                 clickedRamkaDzi_4 = "1";
                 imageRamkaDzi_4.setId(R.id.ramka_Dzi_4);
                 imageRamkaDzi_4.setOnClickListener(this);
             }
             else if (matrixBord[view_i+2][view_j+1].charAt(1)=='e' && sev_spitak==true && is_shax==true) {
                 imageRamkaDzi_4=new ImageView(this);
                 imageRamkaDzi_4.setImageResource(R.drawable.ramka);
                 params_images = new RelativeLayout.LayoutParams(widthLayoutMatrix / 8, widthLayoutMatrix / 8);
                 params_images.setMargins(leftDzi - 10+widthLayoutMatrix/8,
                         topDzi - 10+2*widthLayoutMatrix/8, 0, 0);
                 rLayout.addView(imageRamkaDzi_4, params_images);
                 imageClicked = imageName;
                 clickedRamkaDzi_4 = "1";
                 oponentDziString_4=matrixBord[view_i+2][view_j+1];
                 imageRamkaDzi_4.setId(R.id.ramka_Dzi_4);
                 imageRamkaDzi_4.setOnClickListener(this);
             }
             else if (matrixBord[view_i+2][view_j+1].charAt(1)=='p' && sev_spitak==false && is_shax==true) {
                 imageRamkaDzi_4=new ImageView(this);
                 imageRamkaDzi_4.setImageResource(R.drawable.ramka);
                 params_images = new RelativeLayout.LayoutParams(widthLayoutMatrix / 8, widthLayoutMatrix / 8);
                 params_images.setMargins(leftDzi - 10+widthLayoutMatrix/8,
                         topDzi - 10+2*widthLayoutMatrix/8, 0, 0);
                 rLayout.addView(imageRamkaDzi_4, params_images);
                 imageClicked = imageName;
                 clickedRamkaDzi_4 = "1";
                 oponentDziString_4=matrixBord[view_i+2][view_j+1];
                 imageRamkaDzi_4.setId(R.id.ramka_Dzi_4);
                 imageRamkaDzi_4.setOnClickListener(this);
             }

         }
         if (view_j-1>=0 && view_i+2<=7) {
             if (sev_spitak==true)
                 is_shax=shax_spitak_tagavor_stugum(view_i+2,view_j-1,imageName,true);
             else if(sev_spitak==false)
                 is_shax=shax_sev_tagavor_stugum(view_i+2,view_j-1,imageName,true);

             if (matrixBord[view_i+2][view_j-1].equals("datark") && is_shax==true) {
                 imageRamkaDzi_5=new ImageView(this);
                 imageRamkaDzi_5.setImageResource(R.drawable.ramka);
                 params_images = new RelativeLayout.LayoutParams(widthLayoutMatrix / 8, widthLayoutMatrix / 8);
                 params_images.setMargins(leftDzi - 10-widthLayoutMatrix/8,
                         topDzi - 10+2*widthLayoutMatrix/8, 0, 0);
                 rLayout.addView(imageRamkaDzi_5, params_images);
                 imageClicked = imageName;
                 clickedRamkaDzi_5 = "1";
                 imageRamkaDzi_5.setId(R.id.ramka_Dzi_5);
                 imageRamkaDzi_5.setOnClickListener(this);
             }
             else if (matrixBord[view_i+2][view_j-1].charAt(1)=='e' && sev_spitak==true && is_shax==true) {
                 imageRamkaDzi_5=new ImageView(this);
                 imageRamkaDzi_5.setImageResource(R.drawable.ramka);
                 params_images = new RelativeLayout.LayoutParams(widthLayoutMatrix / 8, widthLayoutMatrix / 8);
                 params_images.setMargins(leftDzi - 10-widthLayoutMatrix/8,
                         topDzi - 10+2*widthLayoutMatrix/8, 0, 0);
                 rLayout.addView(imageRamkaDzi_5, params_images);
                 imageClicked = imageName;
                 clickedRamkaDzi_5 = "1";
                 oponentDziString_5=matrixBord[view_i+2][view_j-1];
                 imageRamkaDzi_5.setId(R.id.ramka_Dzi_5);
                 imageRamkaDzi_5.setOnClickListener(this);
             }
             else if (matrixBord[view_i+2][view_j-1].charAt(1)=='p' && sev_spitak==false && is_shax==true) {
                 imageRamkaDzi_5=new ImageView(this);
                 imageRamkaDzi_5.setImageResource(R.drawable.ramka);
                 params_images = new RelativeLayout.LayoutParams(widthLayoutMatrix / 8, widthLayoutMatrix / 8);
                 params_images.setMargins(leftDzi - 10-widthLayoutMatrix/8,
                         topDzi - 10+2*widthLayoutMatrix/8, 0, 0);
                 rLayout.addView(imageRamkaDzi_5, params_images);
                 imageClicked = imageName;
                 clickedRamkaDzi_5 = "1";
                 oponentDziString_5=matrixBord[view_i+2][view_j-1];
                 imageRamkaDzi_5.setId(R.id.ramka_Dzi_5);
                 imageRamkaDzi_5.setOnClickListener(this);
             }

         }
         if (view_j-2>=0 && view_i+1<=7) {
             if (sev_spitak==true)
                 is_shax=shax_spitak_tagavor_stugum(view_i+1,view_j-2,imageName,true);
             else if(sev_spitak==false)
                 is_shax=shax_sev_tagavor_stugum(view_i+1,view_j-2,imageName,true);

             if (matrixBord[view_i+1][view_j-2].equals("datark") && is_shax==true) {
                 imageRamkaDzi_6=new ImageView(this);
                 imageRamkaDzi_6.setImageResource(R.drawable.ramka);
                 params_images = new RelativeLayout.LayoutParams(widthLayoutMatrix / 8, widthLayoutMatrix / 8);
                 params_images.setMargins(leftDzi - 10-2*widthLayoutMatrix/8,
                         topDzi - 10+widthLayoutMatrix/8, 0, 0);
                 rLayout.addView(imageRamkaDzi_6, params_images);
                 imageClicked = imageName;
                 clickedRamkaDzi_6 = "1";
                 imageRamkaDzi_6.setId(R.id.ramka_Dzi_6);
                 imageRamkaDzi_6.setOnClickListener(this);
             }
             else if (matrixBord[view_i+1][view_j-2].charAt(1)=='e' && sev_spitak==true && is_shax==true) {
                 imageRamkaDzi_6=new ImageView(this);
                 imageRamkaDzi_6.setImageResource(R.drawable.ramka);
                 params_images = new RelativeLayout.LayoutParams(widthLayoutMatrix / 8, widthLayoutMatrix / 8);
                 params_images.setMargins(leftDzi - 10-2*widthLayoutMatrix/8,
                         topDzi - 10+widthLayoutMatrix/8, 0, 0);
                 rLayout.addView(imageRamkaDzi_6, params_images);
                 imageClicked = imageName;
                 clickedRamkaDzi_6 = "1";
                 oponentDziString_6=matrixBord[view_i+1][view_j-2];
                 imageRamkaDzi_6.setId(R.id.ramka_Dzi_6);
                 imageRamkaDzi_6.setOnClickListener(this);
             }
             else if (matrixBord[view_i+1][view_j-2].charAt(1)=='p' && sev_spitak==false && is_shax==true) {
                 imageRamkaDzi_6=new ImageView(this);
                 imageRamkaDzi_6.setImageResource(R.drawable.ramka);
                 params_images = new RelativeLayout.LayoutParams(widthLayoutMatrix / 8, widthLayoutMatrix / 8);
                 params_images.setMargins(leftDzi - 10-2*widthLayoutMatrix/8,
                         topDzi - 10+widthLayoutMatrix/8, 0, 0);
                 rLayout.addView(imageRamkaDzi_6, params_images);
                 imageClicked = imageName;
                 clickedRamkaDzi_6 = "1";
                 oponentDziString_6=matrixBord[view_i+1][view_j-2];
                 imageRamkaDzi_6.setId(R.id.ramka_Dzi_6);
                 imageRamkaDzi_6.setOnClickListener(this);
             }

         }
         if (view_j-2>=0 && view_i-1>=0) {
             if (sev_spitak==true)
                 is_shax=shax_spitak_tagavor_stugum(view_i-1,view_j-2,imageName,true);
             else if(sev_spitak==false)
                 is_shax=shax_sev_tagavor_stugum(view_i-1,view_j-2,imageName,true);

             if (matrixBord[view_i-1][view_j-2].equals("datark") && is_shax==true) {
                 imageRamkaDzi_7=new ImageView(this);
                 imageRamkaDzi_7.setImageResource(R.drawable.ramka);
                 params_images = new RelativeLayout.LayoutParams(widthLayoutMatrix / 8, widthLayoutMatrix / 8);
                 params_images.setMargins(leftDzi - 10-2*widthLayoutMatrix/8,
                         topDzi - 10-widthLayoutMatrix/8, 0, 0);
                 rLayout.addView(imageRamkaDzi_7, params_images);
                 imageClicked = imageName;
                 clickedRamkaDzi_7 = "1";
                 imageRamkaDzi_7.setId(R.id.ramka_Dzi_7);
                 imageRamkaDzi_7.setOnClickListener(this);
             }
             else if (matrixBord[view_i-1][view_j-2].charAt(1)=='e' && sev_spitak==true && is_shax==true) {
                 imageRamkaDzi_7=new ImageView(this);
                 imageRamkaDzi_7.setImageResource(R.drawable.ramka);
                 params_images = new RelativeLayout.LayoutParams(widthLayoutMatrix / 8, widthLayoutMatrix / 8);
                 params_images.setMargins(leftDzi - 10-2*widthLayoutMatrix/8,
                         topDzi - 10-widthLayoutMatrix/8, 0, 0);
                 rLayout.addView(imageRamkaDzi_7, params_images);
                 imageClicked = imageName;
                 clickedRamkaDzi_7 = "1";
                 oponentDziString_7=matrixBord[view_i-1][view_j-2];
                 imageRamkaDzi_7.setId(R.id.ramka_Dzi_7);
                 imageRamkaDzi_7.setOnClickListener(this);
             }
             else if (matrixBord[view_i-1][view_j-2].charAt(1)=='p' && sev_spitak==false && is_shax==true) {
                 imageRamkaDzi_7=new ImageView(this);
                 imageRamkaDzi_7.setImageResource(R.drawable.ramka);
                 params_images = new RelativeLayout.LayoutParams(widthLayoutMatrix / 8, widthLayoutMatrix / 8);
                 params_images.setMargins(leftDzi - 10-2*widthLayoutMatrix/8,
                         topDzi - 10-widthLayoutMatrix/8, 0, 0);
                 rLayout.addView(imageRamkaDzi_7, params_images);
                 imageClicked = imageName;
                 clickedRamkaDzi_7 = "1";
                 oponentDziString_7=matrixBord[view_i-1][view_j-2];
                 imageRamkaDzi_7.setId(R.id.ramka_Dzi_7);
                 imageRamkaDzi_7.setOnClickListener(this);
             }

         }
         if (view_j-1>=0 && view_i-2>=0) {
             if (sev_spitak==true)
                 is_shax=shax_spitak_tagavor_stugum(view_i-2,view_j-1,imageName,true);
             else if(sev_spitak==false)
                 is_shax=shax_sev_tagavor_stugum(view_i-2,view_j-1,imageName,true);

             if (matrixBord[view_i-2][view_j-1].equals("datark") && is_shax==true) {
                 imageRamkaDzi_8=new ImageView(this);
                 imageRamkaDzi_8.setImageResource(R.drawable.ramka);
                 params_images = new RelativeLayout.LayoutParams(widthLayoutMatrix / 8, widthLayoutMatrix / 8);
                 params_images.setMargins(leftDzi - 10-widthLayoutMatrix/8,
                         topDzi - 10-2*widthLayoutMatrix/8, 0, 0);
                 rLayout.addView(imageRamkaDzi_8, params_images);
                 imageClicked = imageName;
                 clickedRamkaDzi_8 = "1";
                 imageRamkaDzi_8.setId(R.id.ramka_Dzi_8);
                 imageRamkaDzi_8.setOnClickListener(this);
             }
             else if (matrixBord[view_i-2][view_j-1].charAt(1)=='e' && sev_spitak==true && is_shax==true) {
                 imageRamkaDzi_8=new ImageView(this);
                 imageRamkaDzi_8.setImageResource(R.drawable.ramka);
                 params_images = new RelativeLayout.LayoutParams(widthLayoutMatrix / 8, widthLayoutMatrix / 8);
                 params_images.setMargins(leftDzi - 10-widthLayoutMatrix/8,
                         topDzi - 10-2*widthLayoutMatrix/8, 0, 0);
                 rLayout.addView(imageRamkaDzi_8, params_images);
                 imageClicked = imageName;
                 clickedRamkaDzi_8 = "1";
                 oponentDziString_8=matrixBord[view_i-2][view_j-1];
                 imageRamkaDzi_8.setId(R.id.ramka_Dzi_8);
                 imageRamkaDzi_8.setOnClickListener(this);
             }
             else if (matrixBord[view_i-2][view_j-1].charAt(1)=='p' && sev_spitak==false && is_shax==true) {
                 imageRamkaDzi_8=new ImageView(this);
                 imageRamkaDzi_8.setImageResource(R.drawable.ramka);
                 params_images = new RelativeLayout.LayoutParams(widthLayoutMatrix / 8, widthLayoutMatrix / 8);
                 params_images.setMargins(leftDzi - 10-widthLayoutMatrix/8,
                         topDzi - 10-2*widthLayoutMatrix/8, 0, 0);
                 rLayout.addView(imageRamkaDzi_8, params_images);
                 imageClicked = imageName;
                 clickedRamkaDzi_8 = "1";
                 oponentDziString_8=matrixBord[view_i-2][view_j-1];
                 imageRamkaDzi_8.setId(R.id.ramka_Dzi_8);
                 imageRamkaDzi_8.setOnClickListener(this);
             }
         }
     }


     //----------------dzi_ramka_click-----------------------------------------------------------

     private void clickDziRamka(ImageView imageRamka, String oponentImageString) {


         if (imageClicked.equals("spitak_dzi_1")) {


                 dzi_spitak_1.animate().translationXBy(imageRamka.getLeft()
                         - spitak_dzi_1_left + 10).translationYBy(
                         imageRamka.getTop() - spitak_dzi_1_top + 10).setDuration(300);

                 spitak_dzi_1_left += imageRamka.getLeft() - spitak_dzi_1_left + 10;
                 spitak_dzi_1_top += imageRamka.getTop() - spitak_dzi_1_top + 10;

             imageClickedColor=false;

         }
         else if (imageClicked.equals("spitak_dzi_2")) {
             dzi_spitak_2.animate().translationXBy(imageRamka.getLeft()
                     - spitak_dzi_2_left + 10).translationYBy(
                     imageRamka.getTop() - spitak_dzi_2_top + 10).setDuration(300);

             spitak_dzi_2_left += imageRamka.getLeft() - spitak_dzi_2_left + 10;
             spitak_dzi_2_top += imageRamka.getTop() - spitak_dzi_2_top + 10;

             imageClickedColor=false;

         }
         else if (imageClicked.equals("spitak_dzi_3")) {
             zinvor_spitak_1.animate().translationXBy(imageRamka.getLeft()
                     - spitak_zinvor_1_left + 10).translationYBy(
                     imageRamka.getTop() - spitak_zinvor_1_top + 10).setDuration(300);

             spitak_zinvor_1_left += imageRamka.getLeft() - spitak_zinvor_1_left + 10;
             spitak_zinvor_1_top += imageRamka.getTop() - spitak_zinvor_1_top + 10;

             imageClickedColor=false;

         }
         else if (imageClicked.equals("spitak_dzi_4")) {
             zinvor_spitak_2.animate().translationXBy(imageRamka.getLeft()
                     - spitak_zinvor_2_left + 10).translationYBy(
                     imageRamka.getTop() - spitak_zinvor_2_top + 10).setDuration(300);

             spitak_zinvor_2_left += imageRamka.getLeft() - spitak_zinvor_2_left + 10;
             spitak_zinvor_2_top += imageRamka.getTop() - spitak_zinvor_2_top + 10;

             imageClickedColor=false;

         }
         else if (imageClicked.equals("spitak_dzi_5")) {
             zinvor_spitak_3.animate().translationXBy(imageRamka.getLeft()
                     - spitak_zinvor_3_left + 10).translationYBy(
                     imageRamka.getTop() - spitak_zinvor_3_top + 10).setDuration(300);

             spitak_zinvor_3_left += imageRamka.getLeft() - spitak_zinvor_3_left + 10;
             spitak_zinvor_3_top += imageRamka.getTop() - spitak_zinvor_3_top + 10;

             imageClickedColor=false;

         }
         else if (imageClicked.equals("spitak_dzi_6")) {
             zinvor_spitak_4.animate().translationXBy(imageRamka.getLeft()
                     - spitak_zinvor_4_left + 10).translationYBy(
                     imageRamka.getTop() - spitak_zinvor_4_top + 10).setDuration(300);

             spitak_zinvor_4_left += imageRamka.getLeft() - spitak_zinvor_4_left + 10;
             spitak_zinvor_4_top += imageRamka.getTop() - spitak_zinvor_4_top + 10;

             imageClickedColor=false;

         }
         else if (imageClicked.equals("spitak_dzi_7")) {
             zinvor_spitak_5.animate().translationXBy(imageRamka.getLeft()
                     - spitak_zinvor_5_left + 10).translationYBy(
                     imageRamka.getTop() - spitak_zinvor_5_top + 10).setDuration(300);

             spitak_zinvor_5_left += imageRamka.getLeft() - spitak_zinvor_5_left + 10;
             spitak_zinvor_5_top += imageRamka.getTop() - spitak_zinvor_5_top + 10;

             imageClickedColor=false;

         }
         else if (imageClicked.equals("spitak_dzi_8")) {
             zinvor_spitak_6.animate().translationXBy(imageRamka.getLeft()
                     - spitak_zinvor_6_left + 10).translationYBy(
                     imageRamka.getTop() - spitak_zinvor_6_top + 10).setDuration(300);

             spitak_zinvor_6_left += imageRamka.getLeft() - spitak_zinvor_6_left + 10;
             spitak_zinvor_6_top += imageRamka.getTop() - spitak_zinvor_6_top + 10;

             imageClickedColor=false;

         }
         else if (imageClicked.equals("spitak_dzi_9")) {
             zinvor_spitak_7.animate().translationXBy(imageRamka.getLeft()
                     - spitak_zinvor_7_left + 10).translationYBy(
                     imageRamka.getTop() - spitak_zinvor_7_top + 10).setDuration(300);

             spitak_zinvor_7_left += imageRamka.getLeft() - spitak_zinvor_7_left + 10;
             spitak_zinvor_7_top += imageRamka.getTop() - spitak_zinvor_7_top + 10;

             imageClickedColor=false;

         }
         else if (imageClicked.equals("spitak_dzi_0")) {
             zinvor_spitak_8.animate().translationXBy(imageRamka.getLeft()
                     - spitak_zinvor_8_left + 10).translationYBy(
                     imageRamka.getTop() - spitak_zinvor_8_top + 10).setDuration(300);

             spitak_zinvor_8_left += imageRamka.getLeft() - spitak_zinvor_8_left + 10;
             spitak_zinvor_8_top += imageRamka.getTop() - spitak_zinvor_8_top + 10;

             imageClickedColor=false;

         }


         else if (imageClicked.equals("sev_dzi_1")) {

             dzi_sev_1.animate().translationXBy(imageRamka.getLeft()
                     - sev_dzi_1_left + 10).translationYBy(
                     imageRamka.getTop() - sev_dzi_1_top + 10).setDuration(300);

             sev_dzi_1_left += imageRamka.getLeft() - sev_dzi_1_left + 10;
             sev_dzi_1_top += imageRamka.getTop() - sev_dzi_1_top + 10;

             imageClickedColor=true;
         }
         else if (imageClicked.equals("sev_dzi_2")) {


             dzi_sev_2.animate().translationXBy(imageRamka.getLeft()
                     - sev_dzi_2_left + 10).translationYBy(
                     imageRamka.getTop() - sev_dzi_2_top + 10).setDuration(300);

             sev_dzi_2_left += imageRamka.getLeft() - sev_dzi_2_left + 10;
             sev_dzi_2_top += imageRamka.getTop() - sev_dzi_2_top + 10;
             imageClickedColor=true;

         }
         else if (imageClicked.equals("sev_dzi_3")) {


             zinvor_sev_1.animate().translationXBy(imageRamka.getLeft()
                     - sev_zinvor_1_left + 10).translationYBy(
                     imageRamka.getTop() - sev_zinvor_1_top + 10).setDuration(300);

             sev_zinvor_1_left += imageRamka.getLeft() - sev_zinvor_1_left + 10;
             sev_zinvor_1_top += imageRamka.getTop() - sev_zinvor_1_top + 10;
             imageClickedColor=true;

         }
         else if (imageClicked.equals("sev_dzi_4")) {


             zinvor_sev_2.animate().translationXBy(imageRamka.getLeft()
                     - sev_zinvor_2_left + 10).translationYBy(
                     imageRamka.getTop() - sev_zinvor_2_top + 10).setDuration(300);

             sev_zinvor_2_left += imageRamka.getLeft() - sev_zinvor_2_left + 10;
             sev_zinvor_2_top += imageRamka.getTop() - sev_zinvor_2_top + 10;
             imageClickedColor=true;

         }
         else if (imageClicked.equals("sev_dzi_5")) {


             zinvor_sev_3.animate().translationXBy(imageRamka.getLeft()
                     - sev_zinvor_3_left + 10).translationYBy(
                     imageRamka.getTop() - sev_zinvor_3_top + 10).setDuration(300);

             sev_zinvor_3_left += imageRamka.getLeft() - sev_zinvor_3_left + 10;
             sev_zinvor_3_top += imageRamka.getTop() - sev_zinvor_3_top + 10;
             imageClickedColor=true;

         }
         else if (imageClicked.equals("sev_dzi_6")) {


             zinvor_sev_4.animate().translationXBy(imageRamka.getLeft()
                     - sev_zinvor_4_left + 10).translationYBy(
                     imageRamka.getTop() - sev_zinvor_4_top + 10).setDuration(300);

             sev_zinvor_4_left += imageRamka.getLeft() - sev_zinvor_4_left + 10;
             sev_zinvor_4_top += imageRamka.getTop() - sev_zinvor_4_top + 10;
             imageClickedColor=true;

         }
         else if (imageClicked.equals("sev_dzi_7")) {


             zinvor_sev_5.animate().translationXBy(imageRamka.getLeft()
                     - sev_zinvor_5_left + 10).translationYBy(
                     imageRamka.getTop() - sev_zinvor_5_top + 10).setDuration(300);

             sev_zinvor_5_left += imageRamka.getLeft() - sev_zinvor_5_left + 10;
             sev_zinvor_5_top += imageRamka.getTop() - sev_zinvor_5_top + 10;
             imageClickedColor=true;

         }
         else if (imageClicked.equals("sev_dzi_8")) {


             zinvor_sev_6.animate().translationXBy(imageRamka.getLeft()
                     - sev_zinvor_6_left + 10).translationYBy(
                     imageRamka.getTop() - sev_zinvor_6_top + 10).setDuration(300);

             sev_zinvor_6_left += imageRamka.getLeft() - sev_zinvor_6_left + 10;
             sev_zinvor_6_top += imageRamka.getTop() - sev_zinvor_6_top + 10;
             imageClickedColor=true;

         }
         else if (imageClicked.equals("sev_dzi_9")) {


             zinvor_sev_7.animate().translationXBy(imageRamka.getLeft()
                     - sev_zinvor_7_left + 10).translationYBy(
                     imageRamka.getTop() - sev_zinvor_7_top + 10).setDuration(300);

             sev_zinvor_7_left += imageRamka.getLeft() - sev_zinvor_7_left + 10;
             sev_zinvor_7_top += imageRamka.getTop() - sev_zinvor_7_top + 10;
             imageClickedColor=true;

         }
         else if (imageClicked.equals("sev_dzi_0")) {


             zinvor_sev_8.animate().translationXBy(imageRamka.getLeft()
                     - sev_zinvor_8_left + 10).translationYBy(
                     imageRamka.getTop() - sev_zinvor_8_top + 10).setDuration(300);

             sev_zinvor_8_left += imageRamka.getLeft() - sev_zinvor_8_left + 10;
             sev_zinvor_8_top += imageRamka.getTop() - sev_zinvor_8_top + 10;
             imageClickedColor=true;

         }


         String s=oponentImageString;

         if (s.equals("sev_zinvor_1")) {

             zinvor_sev_1.setVisibility(View.GONE);
             for (int i=0; i<8; i++) {
                 for (int j=0; j<8; j++) {
                     if (matrixBord[i][j].equals("sev_zinvor_1")) {
                         matrixBord[i][j] = "datark";
                         break;
                     }
                 }
             }


         }
         else if (s.equals("sev_zinvor_2")) {

             zinvor_sev_2.setVisibility(View.GONE);
             for (int i=0; i<8; i++) {
                 for (int j=0; j<8; j++) {
                     if (matrixBord[i][j].equals("sev_zinvor_2")) {
                         matrixBord[i][j] = "datark";
                         break;
                     }
                 }
             }

         }
         else if (s.equals("sev_zinvor_3")) {

             zinvor_sev_3.setVisibility(View.GONE);
             for (int i=0; i<8; i++) {
                 for (int j=0; j<8; j++) {
                     if (matrixBord[i][j].equals("sev_zinvor_3")) {
                         matrixBord[i][j] = "datark";
                         break;
                     }
                 }
             }

         }
         else if (s.equals("sev_zinvor_4")) {

             zinvor_sev_4.setVisibility(View.GONE);
             for (int i=0; i<8; i++) {
                 for (int j=0; j<8; j++) {
                     if (matrixBord[i][j].equals("sev_zinvor_4")) {
                         matrixBord[i][j] = "datark";
                         break;
                     }
                 }
             }

         }
         else if (s.equals("sev_zinvor_5")) {

             zinvor_sev_5.setVisibility(View.GONE);
             for (int i=0; i<8; i++) {
                 for (int j=0; j<8; j++) {
                     if (matrixBord[i][j].equals("sev_zinvor_5")) {
                         matrixBord[i][j] = "datark";
                         break;
                     }
                 }
             }

         }
         else if (s.equals("sev_zinvor_6")) {

             zinvor_sev_6.setVisibility(View.GONE);
             for (int i=0; i<8; i++) {
                 for (int j=0; j<8; j++) {
                     if (matrixBord[i][j].equals("sev_zinvor_6")) {
                         matrixBord[i][j] = "datark";
                         break;
                     }
                 }
             }

         }
         else if (s.equals("sev_zinvor_7")) {

             zinvor_sev_7.setVisibility(View.GONE);
             for (int i=0; i<8; i++) {
                 for (int j=0; j<8; j++) {
                     if (matrixBord[i][j].equals("sev_zinvor_7")) {
                         matrixBord[i][j] = "datark";
                         break;
                     }
                 }
             }

         }
         else if (s.equals("sev_zinvor_8")) {

             zinvor_sev_8.setVisibility(View.GONE);
             for (int i=0; i<8; i++) {
                 for (int j=0; j<8; j++) {
                     if (matrixBord[i][j].equals("sev_zinvor_8")) {
                         matrixBord[i][j] = "datark";
                         break;
                     }
                 }
             }

         }

         else if (s.equals("sev_navak_1")) {

             navak_sev_1.setVisibility(View.GONE);
             for (int i=0; i<8; i++) {
                 for (int j=0; j<8; j++) {
                     if (matrixBord[i][j].equals("sev_navak_1")) {
                         matrixBord[i][j] = "datark";
                         break;
                     }
                 }
             }

         }
         else if (s.equals("sev_navak_2")) {

             navak_sev_2.setVisibility(View.GONE);
             for (int i=0; i<8; i++) {
                 for (int j=0; j<8; j++) {
                     if (matrixBord[i][j].equals("sev_navak_2")) {
                         matrixBord[i][j] = "datark";
                         break;
                     }
                 }
             }

         }
         else if (s.equals("sev_navak_3")) {

             zinvor_sev_1.setVisibility(View.GONE);
             for (int i=0; i<8; i++) {
                 for (int j=0; j<8; j++) {
                     if (matrixBord[i][j].equals("sev_navak_3")) {
                         matrixBord[i][j] = "datark";
                         break;
                     }
                 }
             }

         }
         else if (s.equals("sev_navak_4")) {

             zinvor_sev_2.setVisibility(View.GONE);
             for (int i=0; i<8; i++) {
                 for (int j=0; j<8; j++) {
                     if (matrixBord[i][j].equals("sev_navak_4")) {
                         matrixBord[i][j] = "datark";
                         break;
                     }
                 }
             }

         }
         else if (s.equals("sev_navak_5")) {

             zinvor_sev_3.setVisibility(View.GONE);
             for (int i=0; i<8; i++) {
                 for (int j=0; j<8; j++) {
                     if (matrixBord[i][j].equals("sev_navak_5")) {
                         matrixBord[i][j] = "datark";
                         break;
                     }
                 }
             }

         }
         else if (s.equals("sev_navak_6")) {

             zinvor_sev_4.setVisibility(View.GONE);
             for (int i=0; i<8; i++) {
                 for (int j=0; j<8; j++) {
                     if (matrixBord[i][j].equals("sev_navak_6")) {
                         matrixBord[i][j] = "datark";
                         break;
                     }
                 }
             }

         }
         else if (s.equals("sev_navak_7")) {

             zinvor_sev_5.setVisibility(View.GONE);
             for (int i=0; i<8; i++) {
                 for (int j=0; j<8; j++) {
                     if (matrixBord[i][j].equals("sev_navak_7")) {
                         matrixBord[i][j] = "datark";
                         break;
                     }
                 }
             }

         }
         else if (s.equals("sev_navak_8")) {

             zinvor_sev_6.setVisibility(View.GONE);
             for (int i=0; i<8; i++) {
                 for (int j=0; j<8; j++) {
                     if (matrixBord[i][j].equals("sev_navak_8")) {
                         matrixBord[i][j] = "datark";
                         break;
                     }
                 }
             }

         }
         else if (s.equals("sev_navak_9")) {

             zinvor_sev_7.setVisibility(View.GONE);
             for (int i=0; i<8; i++) {
                 for (int j=0; j<8; j++) {
                     if (matrixBord[i][j].equals("sev_navak_9")) {
                         matrixBord[i][j] = "datark";
                         break;
                     }
                 }
             }

         }
         else if (s.equals("sev_navak_0")) {

             zinvor_sev_8.setVisibility(View.GONE);
             for (int i=0; i<8; i++) {
                 for (int j=0; j<8; j++) {
                     if (matrixBord[i][j].equals("sev_navak_0")) {
                         matrixBord[i][j] = "datark";
                         break;
                     }
                 }
             }

         }

         else if (s.equals("sev_dzi_1")) {

             dzi_sev_1.setVisibility(View.GONE);
             for (int i=0; i<8; i++) {
                 for (int j=0; j<8; j++) {
                     if (matrixBord[i][j].equals("sev_dzi_1")) {
                         matrixBord[i][j] = "datark";
                         break;
                     }
                 }
             }

         }
         else if (s.equals("sev_dzi_2")) {

             dzi_sev_2.setVisibility(View.GONE);
             for (int i=0; i<8; i++) {
                 for (int j=0; j<8; j++) {
                     if (matrixBord[i][j].equals("sev_dzi_2")) {
                         matrixBord[i][j] = "datark";
                         break;
                     }
                 }
             }

         }
         else if (s.equals("sev_dzi_3")) {

             zinvor_sev_1.setVisibility(View.GONE);
             for (int i=0; i<8; i++) {
                 for (int j=0; j<8; j++) {
                     if (matrixBord[i][j].equals("sev_dzi_3")) {
                         matrixBord[i][j] = "datark";
                         break;
                     }
                 }
             }

         }
         else if (s.equals("sev_dzi_4")) {

             zinvor_sev_2.setVisibility(View.GONE);
             for (int i=0; i<8; i++) {
                 for (int j=0; j<8; j++) {
                     if (matrixBord[i][j].equals("sev_dzi_4")) {
                         matrixBord[i][j] = "datark";
                         break;
                     }
                 }
             }

         }
         else if (s.equals("sev_dzi_5")) {

             zinvor_sev_3.setVisibility(View.GONE);
             for (int i=0; i<8; i++) {
                 for (int j=0; j<8; j++) {
                     if (matrixBord[i][j].equals("sev_dzi_5")) {
                         matrixBord[i][j] = "datark";
                         break;
                     }
                 }
             }

         }
         else if (s.equals("sev_dzi_6")) {

             zinvor_sev_4.setVisibility(View.GONE);
             for (int i=0; i<8; i++) {
                 for (int j=0; j<8; j++) {
                     if (matrixBord[i][j].equals("sev_dzi_6")) {
                         matrixBord[i][j] = "datark";
                         break;
                     }
                 }
             }

         }
         else if (s.equals("sev_dzi_7")) {

             zinvor_sev_5.setVisibility(View.GONE);
             for (int i=0; i<8; i++) {
                 for (int j=0; j<8; j++) {
                     if (matrixBord[i][j].equals("sev_dzi_7")) {
                         matrixBord[i][j] = "datark";
                         break;
                     }
                 }
             }

         }
         else if (s.equals("sev_dzi_8")) {

             zinvor_sev_6.setVisibility(View.GONE);
             for (int i=0; i<8; i++) {
                 for (int j=0; j<8; j++) {
                     if (matrixBord[i][j].equals("sev_dzi_8")) {
                         matrixBord[i][j] = "datark";
                         break;
                     }
                 }
             }

         }
         else if (s.equals("sev_dzi_9")) {

             zinvor_sev_7.setVisibility(View.GONE);
             for (int i=0; i<8; i++) {
                 for (int j=0; j<8; j++) {
                     if (matrixBord[i][j].equals("sev_dzi_9")) {
                         matrixBord[i][j] = "datark";
                         break;
                     }
                 }
             }

         }
         else if (s.equals("sev_dzi_0")) {

             zinvor_sev_8.setVisibility(View.GONE);
             for (int i=0; i<8; i++) {
                 for (int j=0; j<8; j++) {
                     if (matrixBord[i][j].equals("sev_dzi_0")) {
                         matrixBord[i][j] = "datark";
                         break;
                     }
                 }
             }

         }

         else if (s.equals("sev_pix_1")) {

             pix_sev_1.setVisibility(View.GONE);
             for (int i=0; i<8; i++) {
                 for (int j=0; j<8; j++) {
                     if (matrixBord[i][j].equals("sev_pix_1")) {
                         matrixBord[i][j] = "datark";
                         break;
                     }
                 }
             }

         }
         else if (s.equals("sev_pix_2")) {

             pix_sev_2.setVisibility(View.GONE);
             for (int i=0; i<8; i++) {
                 for (int j=0; j<8; j++) {
                     if (matrixBord[i][j].equals("sev_pix_2")) {
                         matrixBord[i][j] = "datark";
                         break;
                     }
                 }
             }

         }
         else if (s.equals("sev_pix_3")) {

             zinvor_sev_1.setVisibility(View.GONE);
             for (int i=0; i<8; i++) {
                 for (int j=0; j<8; j++) {
                     if (matrixBord[i][j].equals("sev_pix_3")) {
                         matrixBord[i][j] = "datark";
                         break;
                     }
                 }
             }

         }
         else if (s.equals("sev_pix_4")) {

             zinvor_sev_2.setVisibility(View.GONE);
             for (int i=0; i<8; i++) {
                 for (int j=0; j<8; j++) {
                     if (matrixBord[i][j].equals("sev_pix_4")) {
                         matrixBord[i][j] = "datark";
                         break;
                     }
                 }
             }

         }
         else if (s.equals("sev_pix_5")) {

             zinvor_sev_3.setVisibility(View.GONE);
             for (int i=0; i<8; i++) {
                 for (int j=0; j<8; j++) {
                     if (matrixBord[i][j].equals("sev_pix_5")) {
                         matrixBord[i][j] = "datark";
                         break;
                     }
                 }
             }

         }
         else if (s.equals("sev_pix_6")) {

             zinvor_sev_4.setVisibility(View.GONE);
             for (int i=0; i<8; i++) {
                 for (int j=0; j<8; j++) {
                     if (matrixBord[i][j].equals("sev_pix_6")) {
                         matrixBord[i][j] = "datark";
                         break;
                     }
                 }
             }

         }
         else if (s.equals("sev_pix_7")) {

             zinvor_sev_5.setVisibility(View.GONE);
             for (int i=0; i<8; i++) {
                 for (int j=0; j<8; j++) {
                     if (matrixBord[i][j].equals("sev_pix_7")) {
                         matrixBord[i][j] = "datark";
                         break;
                     }
                 }
             }

         }
         else if (s.equals("sev_pix_8")) {

             zinvor_sev_6.setVisibility(View.GONE);
             for (int i=0; i<8; i++) {
                 for (int j=0; j<8; j++) {
                     if (matrixBord[i][j].equals("sev_pix_8")) {
                         matrixBord[i][j] = "datark";
                         break;
                     }
                 }
             }

         }
         else if (s.equals("sev_pix_9")) {

             zinvor_sev_7.setVisibility(View.GONE);
             for (int i=0; i<8; i++) {
                 for (int j=0; j<8; j++) {
                     if (matrixBord[i][j].equals("sev_pix_9")) {
                         matrixBord[i][j] = "datark";
                         break;
                     }
                 }
             }

         }
         else if (s.equals("sev_pix_0")) {

             zinvor_sev_8.setVisibility(View.GONE);
             for (int i=0; i<8; i++) {
                 for (int j=0; j<8; j++) {
                     if (matrixBord[i][j].equals("sev_pix_0")) {
                         matrixBord[i][j] = "datark";
                         break;
                     }
                 }
             }

         }

         else if (s.equals("sev_taguhi")) {

             taguhi_sev.setVisibility(View.GONE);
             for (int i=0; i<8; i++) {
                 for (int j=0; j<8; j++) {
                     if (matrixBord[i][j].equals("sev_taguhi")) {
                         matrixBord[i][j] = "datark";
                         break;
                     }
                 }
             }

         }
         else if (s.equals("sev_taguhi_1")) {

             zinvor_sev_1.setVisibility(View.GONE);
             for (int i=0; i<8; i++) {
                 for (int j=0; j<8; j++) {
                     if (matrixBord[i][j].equals("sev_taguhi_1")) {
                         matrixBord[i][j] = "datark";
                         break;
                     }
                 }
             }

         }
         else if (s.equals("sev_taguhi_2")) {

             zinvor_sev_2.setVisibility(View.GONE);
             for (int i=0; i<8; i++) {
                 for (int j=0; j<8; j++) {
                     if (matrixBord[i][j].equals("sev_taguhi_2")) {
                         matrixBord[i][j] = "datark";
                         break;
                     }
                 }
             }

         }
         else if (s.equals("sev_taguhi_3")) {

             zinvor_sev_3.setVisibility(View.GONE);
             for (int i=0; i<8; i++) {
                 for (int j=0; j<8; j++) {
                     if (matrixBord[i][j].equals("sev_taguhi_3")) {
                         matrixBord[i][j] = "datark";
                         break;
                     }
                 }
             }

         }
         else if (s.equals("sev_taguhi_4")) {

             zinvor_sev_4.setVisibility(View.GONE);
             for (int i=0; i<8; i++) {
                 for (int j=0; j<8; j++) {
                     if (matrixBord[i][j].equals("sev_taguhi_4")) {
                         matrixBord[i][j] = "datark";
                         break;
                     }
                 }
             }

         }
         else if (s.equals("sev_taguhi_5")) {

             zinvor_sev_5.setVisibility(View.GONE);
             for (int i=0; i<8; i++) {
                 for (int j=0; j<8; j++) {
                     if (matrixBord[i][j].equals("sev_taguhi_5")) {
                         matrixBord[i][j] = "datark";
                         break;
                     }
                 }
             }

         }
         else if (s.equals("sev_taguhi_6")) {

             zinvor_sev_6.setVisibility(View.GONE);
             for (int i=0; i<8; i++) {
                 for (int j=0; j<8; j++) {
                     if (matrixBord[i][j].equals("sev_taguhi_6")) {
                         matrixBord[i][j] = "datark";
                         break;
                     }
                 }
             }

         }
         else if (s.equals("sev_taguhi_7")) {

             zinvor_sev_7.setVisibility(View.GONE);
             for (int i=0; i<8; i++) {
                 for (int j=0; j<8; j++) {
                     if (matrixBord[i][j].equals("sev_taguhi_7")) {
                         matrixBord[i][j] = "datark";
                         break;
                     }
                 }
             }

         }
         else if (s.equals("sev_taguhi_8")) {

             zinvor_sev_8.setVisibility(View.GONE);
             for (int i=0; i<8; i++) {
                 for (int j=0; j<8; j++) {
                     if (matrixBord[i][j].equals("sev_taguhi_8")) {
                         matrixBord[i][j] = "datark";
                         break;
                     }
                 }
             }

         }

         else if (s.equals("spitak_zinvor_1")) {

             zinvor_spitak_1.setVisibility(View.GONE);
             for (int i=0; i<8; i++) {
                 for (int j=0; j<8; j++) {
                     if (matrixBord[i][j].equals("spitak_zinvor_1")) {
                         matrixBord[i][j] = "datark";
                         break;
                     }
                 }
             }

         }
         else if (s.equals("spitak_zinvor_2")) {

             zinvor_spitak_2.setVisibility(View.GONE);
             for (int i=0; i<8; i++) {
                 for (int j=0; j<8; j++) {
                     if (matrixBord[i][j].equals("spitak_zinvor_2")) {
                         matrixBord[i][j] = "datark";
                         break;
                     }
                 }
             }

         }
         else if (s.equals("spitak_zinvor_3")) {

             zinvor_spitak_3.setVisibility(View.GONE);
             for (int i=0; i<8; i++) {
                 for (int j=0; j<8; j++) {
                     if (matrixBord[i][j].equals("spitak_zinvor_3")) {
                         matrixBord[i][j] = "datark";
                         break;
                     }
                 }
             }

         }
         else if (s.equals("spitak_zinvor_4")) {

             zinvor_spitak_4.setVisibility(View.GONE);
             for (int i=0; i<8; i++) {
                 for (int j=0; j<8; j++) {
                     if (matrixBord[i][j].equals("spitak_zinvor_4")) {
                         matrixBord[i][j] = "datark";
                         break;
                     }
                 }
             }

         }
         else if (s.equals("spitak_zinvor_5")) {

             zinvor_spitak_5.setVisibility(View.GONE);
             for (int i=0; i<8; i++) {
                 for (int j=0; j<8; j++) {
                     if (matrixBord[i][j].equals("spitak_zinvor_5")) {
                         matrixBord[i][j] = "datark";
                         break;
                     }
                 }
             }

         }
         else if (s.equals("spitak_zinvor_6")) {

             zinvor_spitak_6.setVisibility(View.GONE);
             for (int i=0; i<8; i++) {
                 for (int j=0; j<8; j++) {
                     if (matrixBord[i][j].equals("spitak_zinvor_6")) {
                         matrixBord[i][j] = "datark";
                         break;
                     }
                 }
             }

         }
         else if (s.equals("spitak_zinvor_7")) {

             zinvor_spitak_7.setVisibility(View.GONE);
             for (int i=0; i<8; i++) {
                 for (int j=0; j<8; j++) {
                     if (matrixBord[i][j].equals("spitak_zinvor_7")) {
                         matrixBord[i][j] = "datark";
                         break;
                     }
                 }
             }

         }
         else if (s.equals("spitak_zinvor_8")) {

             zinvor_spitak_8.setVisibility(View.GONE);
             for (int i=0; i<8; i++) {
                 for (int j=0; j<8; j++) {
                     if (matrixBord[i][j].equals("spitak_zinvor_8")) {
                         matrixBord[i][j] = "datark";
                         break;
                     }
                 }
             }

         }

         else if (s.equals("spitak_navak_1")) {

             navak_spitak_1.setVisibility(View.GONE);
             for (int i=0; i<8; i++) {
                 for (int j=0; j<8; j++) {
                     if (matrixBord[i][j].equals("spitak_navak_1")) {
                         matrixBord[i][j] = "datark";
                         break;
                     }
                 }
             }

         }
         else if (s.equals("spitak_navak_2")) {

             navak_spitak_2.setVisibility(View.GONE);
             for (int i=0; i<8; i++) {
                 for (int j=0; j<8; j++) {
                     if (matrixBord[i][j].equals("spitak_navak_2")) {
                         matrixBord[i][j] = "datark";
                         break;
                     }
                 }
             }

         }
         else if (s.equals("spitak_navak_3")) {

             zinvor_spitak_1.setVisibility(View.GONE);
             for (int i=0; i<8; i++) {
                 for (int j=0; j<8; j++) {
                     if (matrixBord[i][j].equals("spitak_navak_3")) {
                         matrixBord[i][j] = "datark";
                         break;
                     }
                 }
             }

         }
         else if (s.equals("spitak_navak_4")) {

             zinvor_spitak_2.setVisibility(View.GONE);
             for (int i=0; i<8; i++) {
                 for (int j=0; j<8; j++) {
                     if (matrixBord[i][j].equals("spitak_navak_4")) {
                         matrixBord[i][j] = "datark";
                         break;
                     }
                 }
             }

         }
         else if (s.equals("spitak_navak_5")) {

             zinvor_spitak_3.setVisibility(View.GONE);
             for (int i=0; i<8; i++) {
                 for (int j=0; j<8; j++) {
                     if (matrixBord[i][j].equals("spitak_navak_5")) {
                         matrixBord[i][j] = "datark";
                         break;
                     }
                 }
             }

         }
         else if (s.equals("spitak_navak_6")) {

             zinvor_spitak_4.setVisibility(View.GONE);
             for (int i=0; i<8; i++) {
                 for (int j=0; j<8; j++) {
                     if (matrixBord[i][j].equals("spitak_navak_6")) {
                         matrixBord[i][j] = "datark";
                         break;
                     }
                 }
             }

         }
         else if (s.equals("spitak_navak_7")) {

             zinvor_spitak_5.setVisibility(View.GONE);
             for (int i=0; i<8; i++) {
                 for (int j=0; j<8; j++) {
                     if (matrixBord[i][j].equals("spitak_navak_7")) {
                         matrixBord[i][j] = "datark";
                         break;
                     }
                 }
             }

         }
         else if (s.equals("spitak_navak_8")) {

             zinvor_spitak_6.setVisibility(View.GONE);
             for (int i=0; i<8; i++) {
                 for (int j=0; j<8; j++) {
                     if (matrixBord[i][j].equals("spitak_navak_8")) {
                         matrixBord[i][j] = "datark";
                         break;
                     }
                 }
             }

         }
         else if (s.equals("spitak_navak_9")) {

             zinvor_spitak_7.setVisibility(View.GONE);
             for (int i=0; i<8; i++) {
                 for (int j=0; j<8; j++) {
                     if (matrixBord[i][j].equals("spitak_navak_9")) {
                         matrixBord[i][j] = "datark";
                         break;
                     }
                 }
             }

         }
         else if (s.equals("spitak_navak_0")) {

             zinvor_spitak_8.setVisibility(View.GONE);
             for (int i=0; i<8; i++) {
                 for (int j=0; j<8; j++) {
                     if (matrixBord[i][j].equals("spitak_navak_0")) {
                         matrixBord[i][j] = "datark";
                         break;
                     }
                 }
             }

         }

         else if (s.equals("spitak_dzi_1")) {

             dzi_spitak_1.setVisibility(View.GONE);
             for (int i=0; i<8; i++) {
                 for (int j=0; j<8; j++) {
                     if (matrixBord[i][j].equals("spitak_dzi_1")) {
                         matrixBord[i][j] = "datark";
                         break;
                     }
                 }
             }

         }
         else if (s.equals("spitak_dzi_2")) {

             dzi_spitak_2.setVisibility(View.GONE);
             for (int i=0; i<8; i++) {
                 for (int j=0; j<8; j++) {
                     if (matrixBord[i][j].equals("spitak_dzi_2")) {
                         matrixBord[i][j] = "datark";
                         break;
                     }
                 }
             }

         }
         else if (s.equals("spitak_dzi_3")) {

             zinvor_spitak_1.setVisibility(View.GONE);
             for (int i=0; i<8; i++) {
                 for (int j=0; j<8; j++) {
                     if (matrixBord[i][j].equals("spitak_dzi_3")) {
                         matrixBord[i][j] = "datark";
                         break;
                     }
                 }
             }

         }
         else if (s.equals("spitak_dzi_4")) {

             zinvor_spitak_2.setVisibility(View.GONE);
             for (int i=0; i<8; i++) {
                 for (int j=0; j<8; j++) {
                     if (matrixBord[i][j].equals("spitak_dzi_4")) {
                         matrixBord[i][j] = "datark";
                         break;
                     }
                 }
             }

         }
         else if (s.equals("spitak_dzi_5")) {

             zinvor_spitak_3.setVisibility(View.GONE);
             for (int i=0; i<8; i++) {
                 for (int j=0; j<8; j++) {
                     if (matrixBord[i][j].equals("spitak_dzi_5")) {
                         matrixBord[i][j] = "datark";
                         break;
                     }
                 }
             }

         }
         else if (s.equals("spitak_dzi_6")) {

             zinvor_spitak_4.setVisibility(View.GONE);
             for (int i=0; i<8; i++) {
                 for (int j=0; j<8; j++) {
                     if (matrixBord[i][j].equals("spitak_dzi_6")) {
                         matrixBord[i][j] = "datark";
                         break;
                     }
                 }
             }

         }
         else if (s.equals("spitak_dzi_7")) {

             zinvor_spitak_5.setVisibility(View.GONE);
             for (int i=0; i<8; i++) {
                 for (int j=0; j<8; j++) {
                     if (matrixBord[i][j].equals("spitak_dzi_7")) {
                         matrixBord[i][j] = "datark";
                         break;
                     }
                 }
             }

         }
         else if (s.equals("spitak_dzi_8")) {

             zinvor_spitak_6.setVisibility(View.GONE);
             for (int i=0; i<8; i++) {
                 for (int j=0; j<8; j++) {
                     if (matrixBord[i][j].equals("spitak_dzi_8")) {
                         matrixBord[i][j] = "datark";
                         break;
                     }
                 }
             }

         }
         else if (s.equals("spitak_dzi_9")) {

             zinvor_spitak_7.setVisibility(View.GONE);
             for (int i=0; i<8; i++) {
                 for (int j=0; j<8; j++) {
                     if (matrixBord[i][j].equals("spitak_dzi_9")) {
                         matrixBord[i][j] = "datark";
                         break;
                     }
                 }
             }

         }
         else if (s.equals("spitak_dzi_0")) {

             zinvor_spitak_8.setVisibility(View.GONE);
             for (int i=0; i<8; i++) {
                 for (int j=0; j<8; j++) {
                     if (matrixBord[i][j].equals("spitak_dzi_0")) {
                         matrixBord[i][j] = "datark";
                         break;
                     }
                 }
             }

         }

         else if (s.equals("spitak_pix_1")) {

             pix_spitak_1.setVisibility(View.GONE);
             for (int i=0; i<8; i++) {
                 for (int j=0; j<8; j++) {
                     if (matrixBord[i][j].equals("spitak_pix_1")) {
                         matrixBord[i][j] = "datark";
                         break;
                     }
                 }
             }

         }
         else if (s.equals("spitak_pix_2")) {

             pix_spitak_2.setVisibility(View.GONE);
             for (int i=0; i<8; i++) {
                 for (int j=0; j<8; j++) {
                     if (matrixBord[i][j].equals("spitak_pix_2")) {
                         matrixBord[i][j] = "datark";
                         break;
                     }
                 }
             }

         }
         else if (s.equals("spitak_pix_3")) {

             zinvor_spitak_1.setVisibility(View.GONE);
             for (int i=0; i<8; i++) {
                 for (int j=0; j<8; j++) {
                     if (matrixBord[i][j].equals("spitak_pix_3")) {
                         matrixBord[i][j] = "datark";
                         break;
                     }
                 }
             }

         }
         else if (s.equals("spitak_pix_4")) {

             zinvor_spitak_2.setVisibility(View.GONE);
             for (int i=0; i<8; i++) {
                 for (int j=0; j<8; j++) {
                     if (matrixBord[i][j].equals("spitak_pix_4")) {
                         matrixBord[i][j] = "datark";
                         break;
                     }
                 }
             }

         }
         else if (s.equals("spitak_pix_5")) {

             zinvor_spitak_3.setVisibility(View.GONE);
             for (int i=0; i<8; i++) {
                 for (int j=0; j<8; j++) {
                     if (matrixBord[i][j].equals("spitak_pix_5")) {
                         matrixBord[i][j] = "datark";
                         break;
                     }
                 }
             }

         }
         else if (s.equals("spitak_pix_6")) {

             zinvor_spitak_4.setVisibility(View.GONE);
             for (int i=0; i<8; i++) {
                 for (int j=0; j<8; j++) {
                     if (matrixBord[i][j].equals("spitak_pix_6")) {
                         matrixBord[i][j] = "datark";
                         break;
                     }
                 }
             }

         }
         else if (s.equals("spitak_pix_7")) {

             zinvor_spitak_5.setVisibility(View.GONE);
             for (int i=0; i<8; i++) {
                 for (int j=0; j<8; j++) {
                     if (matrixBord[i][j].equals("spitak_pix_7")) {
                         matrixBord[i][j] = "datark";
                         break;
                     }
                 }
             }

         }
         else if (s.equals("spitak_pix_8")) {

             zinvor_spitak_6.setVisibility(View.GONE);
             for (int i=0; i<8; i++) {
                 for (int j=0; j<8; j++) {
                     if (matrixBord[i][j].equals("spitak_pix_8")) {
                         matrixBord[i][j] = "datark";
                         break;
                     }
                 }
             }

         }
         else if (s.equals("spitak_pix_9")) {

             zinvor_spitak_7.setVisibility(View.GONE);
             for (int i=0; i<8; i++) {
                 for (int j=0; j<8; j++) {
                     if (matrixBord[i][j].equals("spitak_pix_9")) {
                         matrixBord[i][j] = "datark";
                         break;
                     }
                 }
             }

         }
         else if (s.equals("spitak_pix_0")) {

             zinvor_spitak_8.setVisibility(View.GONE);
             for (int i=0; i<8; i++) {
                 for (int j=0; j<8; j++) {
                     if (matrixBord[i][j].equals("spitak_pix_0")) {
                         matrixBord[i][j] = "datark";
                         break;
                     }
                 }
             }

         }

         else if (s.equals("spitak_taguhi")) {

             taguhi_spitak.setVisibility(View.GONE);
             for (int i=0; i<8; i++) {
                 for (int j=0; j<8; j++) {
                     if (matrixBord[i][j].equals("spitak_taguhi")) {
                         matrixBord[i][j] = "datark";
                         break;
                     }
                 }
             }
         }
         else if (s.equals("spitak_taguhi_1")) {

             zinvor_spitak_1.setVisibility(View.GONE);
             for (int i=0; i<8; i++) {
                 for (int j=0; j<8; j++) {
                     if (matrixBord[i][j].equals("spitak_taguhi_1")) {
                         matrixBord[i][j] = "datark";
                         break;
                     }
                 }
             }
         }
         else if (s.equals("spitak_taguhi_2")) {

             zinvor_spitak_2.setVisibility(View.GONE);
             for (int i=0; i<8; i++) {
                 for (int j=0; j<8; j++) {
                     if (matrixBord[i][j].equals("spitak_taguhi_2")) {
                         matrixBord[i][j] = "datark";
                         break;
                     }
                 }
             }
         }
         else if (s.equals("spitak_taguhi_3")) {

             zinvor_spitak_3.setVisibility(View.GONE);
             for (int i=0; i<8; i++) {
                 for (int j=0; j<8; j++) {
                     if (matrixBord[i][j].equals("spitak_taguhi_3")) {
                         matrixBord[i][j] = "datark";
                         break;
                     }
                 }
             }
         }
         else if (s.equals("spitak_taguhi_4")) {

             zinvor_spitak_4.setVisibility(View.GONE);
             for (int i=0; i<8; i++) {
                 for (int j=0; j<8; j++) {
                     if (matrixBord[i][j].equals("spitak_taguhi_4")) {
                         matrixBord[i][j] = "datark";
                         break;
                     }
                 }
             }
         }
         else if (s.equals("spitak_taguhi_5")) {

             zinvor_spitak_5.setVisibility(View.GONE);
             for (int i=0; i<8; i++) {
                 for (int j=0; j<8; j++) {
                     if (matrixBord[i][j].equals("spitak_taguhi_5")) {
                         matrixBord[i][j] = "datark";
                         break;
                     }
                 }
             }
         }
         else if (s.equals("spitak_taguhi_6")) {

             zinvor_spitak_6.setVisibility(View.GONE);
             for (int i=0; i<8; i++) {
                 for (int j=0; j<8; j++) {
                     if (matrixBord[i][j].equals("spitak_taguhi_6")) {
                         matrixBord[i][j] = "datark";
                         break;
                     }
                 }
             }
         }
         else if (s.equals("spitak_taguhi_7")) {

             zinvor_spitak_7.setVisibility(View.GONE);
             for (int i=0; i<8; i++) {
                 for (int j=0; j<8; j++) {
                     if (matrixBord[i][j].equals("spitak_taguhi_7")) {
                         matrixBord[i][j] = "datark";
                         break;
                     }
                 }
             }
         }
         else if (s.equals("spitak_taguhi_8")) {

             zinvor_spitak_8.setVisibility(View.GONE);
             for (int i=0; i<8; i++) {
                 for (int j=0; j<8; j++) {
                     if (matrixBord[i][j].equals("spitak_taguhi_8")) {
                         matrixBord[i][j] = "datark";
                         break;
                     }
                 }
             }
         }


         oponentDziString_1="";
         oponentDziString_2="";
         oponentDziString_3="";
         oponentDziString_4="";
         oponentDziString_5="";
         oponentDziString_6="";
         oponentDziString_7="";
         oponentDziString_8="";


         if (imageRamka.equals(imageRamkaDzi_1)) {
             String s1=matrixBord[view_i][view_j];
             matrixBord[view_i][view_j]=matrixBord[view_i-2][view_j+1];
             matrixBord[view_i-2][view_j+1]=s1;
         }
         else if (imageRamka.equals(imageRamkaDzi_2)) {
             String s1=matrixBord[view_i][view_j];
             matrixBord[view_i][view_j]=matrixBord[view_i-1][view_j+2];
             matrixBord[view_i-1][view_j+2]=s1;
         }
         else if (imageRamka.equals(imageRamkaDzi_3)) {
             String s1=matrixBord[view_i][view_j];
             matrixBord[view_i][view_j]=matrixBord[view_i+1][view_j+2];
             matrixBord[view_i+1][view_j+2]=s1;
         }
         else if (imageRamka.equals(imageRamkaDzi_4)) {
             String s1=matrixBord[view_i][view_j];
             matrixBord[view_i][view_j]=matrixBord[view_i+2][view_j+1];
             matrixBord[view_i+2][view_j+1]=s1;
         }
         else if (imageRamka.equals(imageRamkaDzi_5)) {
             String s1=matrixBord[view_i][view_j];
             matrixBord[view_i][view_j]=matrixBord[view_i+2][view_j-1];
             matrixBord[view_i+2][view_j-1]=s1;
         }
         else if (imageRamka.equals(imageRamkaDzi_6)) {
             String s1=matrixBord[view_i][view_j];
             matrixBord[view_i][view_j]=matrixBord[view_i+1][view_j-2];
             matrixBord[view_i+1][view_j-2]=s1;
         }
         if (imageRamka.equals(imageRamkaDzi_7)) {
             String s1=matrixBord[view_i][view_j];
             matrixBord[view_i][view_j]=matrixBord[view_i-1][view_j-2];
             matrixBord[view_i-1][view_j-2]=s1;
         }
         if (imageRamka.equals(imageRamkaDzi_8)) {
             String s1=matrixBord[view_i][view_j];
             matrixBord[view_i][view_j]=matrixBord[view_i-2][view_j-1];
             matrixBord[view_i-2][view_j-1]=s1;
         }


         if (clickedRamkaDzi_1.equals("1")) {
             imageRamkaDzi_1.setVisibility(View.GONE);
             clickedRamkaDzi_1="";
         }
         if (clickedRamkaDzi_2.equals("1")) {
             imageRamkaDzi_2.setVisibility(View.GONE);
             clickedRamkaDzi_2="";
         }
         if (clickedRamkaDzi_3.equals("1")) {
             imageRamkaDzi_3.setVisibility(View.GONE);
             clickedRamkaDzi_3="";
         }
         if (clickedRamkaDzi_4.equals("1")) {
             imageRamkaDzi_4.setVisibility(View.GONE);
             clickedRamkaDzi_4="";
         }
         if (clickedRamkaDzi_5.equals("1")) {
             imageRamkaDzi_5.setVisibility(View.GONE);
             clickedRamkaDzi_5="";
         }
         if (clickedRamkaDzi_6.equals("1")) {
             imageRamkaDzi_6.setVisibility(View.GONE);
             clickedRamkaDzi_6="";
         }
         if (clickedRamkaDzi_7.equals("1")) {
             imageRamkaDzi_7.setVisibility(View.GONE);
             clickedRamkaDzi_7="";
         }
         if (clickedRamkaDzi_8.equals("1")) {
             imageRamkaDzi_8.setVisibility(View.GONE);
             clickedRamkaDzi_8="";
         }


         zinvorClickRAmka2_num="";
     }


     //------------metod_taguhi_click------------------------------------------------------------------------------------------

     private void taguhiClick(ImageView imageTaguhi, int leftTaguhi, int topTaguhi, String imageName, boolean sev_spitak) {

         if (clickedRamka1.equals("1")) {
             imageRamka1.setVisibility(View.GONE);
             clickedRamka1 = "";
         }
         if (clickedRamka2.equals("1")) {
             imageRamka2.setVisibility(View.GONE);
             clickedRamka2 = "";
         }
         if (clickedRamka3.equals("1")) {
             imageRamka3.setVisibility(View.GONE);
             clickedRamka3 = "";
         }
         if (clickedRamka4.equals("1")) {
             imageRamka4.setVisibility(View.GONE);
             clickedRamka4 = "";
         }
         if (clickedRamka5.equals("1")) {
             imageRamka5.setVisibility(View.GONE);
             clickedRamka5 = "";
         }
         if (clickedRamka6.equals("1")) {
             imageRamka6.setVisibility(View.GONE);
             clickedRamka6 = "";
         }

         if (clickedRamkaDzi_1.equals("1")) {
             imageRamkaDzi_1.setVisibility(View.GONE);
             clickedRamkaDzi_1="";
         }
         if (clickedRamkaDzi_2.equals("1")) {
             imageRamkaDzi_2.setVisibility(View.GONE);
             clickedRamkaDzi_2="";
         }
         if (clickedRamkaDzi_3.equals("1")) {
             imageRamkaDzi_3.setVisibility(View.GONE);
             clickedRamkaDzi_3="";
         }
         if (clickedRamkaDzi_4.equals("1")) {
             imageRamkaDzi_4.setVisibility(View.GONE);
             clickedRamkaDzi_4="";
         }
         if (clickedRamkaDzi_5.equals("1")) {
             imageRamkaDzi_5.setVisibility(View.GONE);
             clickedRamkaDzi_5="";
         }
         if (clickedRamkaDzi_6.equals("1")) {
             imageRamkaDzi_6.setVisibility(View.GONE);
             clickedRamkaDzi_6="";
         }
         if (clickedRamkaDzi_7.equals("1")) {
             imageRamkaDzi_7.setVisibility(View.GONE);
             clickedRamkaDzi_7="";
         }
         if (clickedRamkaDzi_8.equals("1")) {
             imageRamkaDzi_8.setVisibility(View.GONE);
             clickedRamkaDzi_8="";
         }

         if (clickedRamkaTagavor_1.equals("1")) {
             imageRamkaTagavor_1.setVisibility(View.GONE);
             clickedRamkaTagavor_1="";
         }
         if (clickedRamkaTagavor_2.equals("1")) {
             imageRamkaTagavor_2.setVisibility(View.GONE);
             clickedRamkaTagavor_2="";
         }
         if (clickedRamkaTagavor_3.equals("1")) {
             imageRamkaTagavor_3.setVisibility(View.GONE);
             clickedRamkaTagavor_3="";
         }
         if (clickedRamkaTagavor_4.equals("1")) {
             imageRamkaTagavor_4.setVisibility(View.GONE);
             clickedRamkaTagavor_4="";
         }
         if (clickedRamkaTagavor_5.equals("1")) {
             imageRamkaTagavor_5.setVisibility(View.GONE);
             clickedRamkaTagavor_5="";
         }
         if (clickedRamkaTagavor_6.equals("1")) {
             imageRamkaTagavor_6.setVisibility(View.GONE);
             clickedRamkaTagavor_6="";
         }
         if (clickedRamkaTagavor_7.equals("1")) {
             imageRamkaTagavor_7.setVisibility(View.GONE);
             clickedRamkaTagavor_7="";
         }
         if (clickedRamkaTagavor_8.equals("1")) {
             imageRamkaTagavor_8.setVisibility(View.GONE);
             clickedRamkaTagavor_8="";
         }
         if (clickedRamkaTagavor_9.equals("1")) {
             imageRamkaTagavor_9.setVisibility(View.GONE);
             clickedRamkaTagavor_9="";
         }
         if (clickedRamkaTagavor_10.equals("1")) {
             imageRamkaTagavor_10.setVisibility(View.GONE);
             clickedRamkaTagavor_10="";
         }

         for (int i = 0; i < 8; i++) {
             if (clickedRamkaNavah_horizonakan[i].equals("1")) {
                 imageRamkaNavak_horizonakan[i].setVisibility(View.GONE);
                 clickedRamkaNavah_horizonakan[i] = "";
             }
             if (clickedRamkaNavah_uxxahayac[i].equals("1")) {
                 imageRamkaNavak_uxxahayac[i].setVisibility(View.GONE);
                 clickedRamkaNavah_uxxahayac[i] = "";
             }
             if (clickedRamkaPix_glxavor[i].equals("1")) {
                 imageRamkaPix_glxavor[i].setVisibility(View.GONE);
                 clickedRamkaPix_glxavor[i]="";
             }
             if (clicedRamkaPix_ojandak[i].equals("1")) {
                 imageRamkaPix_ojandak[i].setVisibility(View.GONE);
                 clicedRamkaPix_ojandak[i]="";
             }
         }

         for (int i=0; i<8; i++) {
             oponentImageString_uxxahayac[i]="";
             oponentImageString_horizonakan[i]="";
             oponentPixString_glxavor[i]="";
             oponentPixString_ojandak[i]="";
         }



         for (int i=0; i<8; i++) {
             for (int j=0; j<8; j++) {
                 if (matrixBord[i][j].equals(imageName)) {
                     view_i=i;
                     view_j=j;
                 }
             }
         }

         int sum=1;
         int sum1=1;
         int sum2=1;
         int sum3=1;
         boolean opponentFigure1=true;
         boolean opponentFigure2=true;
         boolean opponentFigure3=true;
         boolean opponentFigure4=true;

         int sum00=1;
         int sum11=1;
         int sum22=1;
         int sum33=1;
         boolean opponentFigure11=true;
         boolean opponentFigure22=true;
         boolean opponentFigure33=true;
         boolean opponentFigure44=true;
         boolean is_shax=true;

         for (int i=0; i<8; i++) {
             if (view_j-sum>=0 && opponentFigure1==true) {
                 if (sev_spitak==true)
                     is_shax=shax_spitak_tagavor_stugum(view_i,view_j-sum,imageName,true);
                 else if(sev_spitak==false)
                     is_shax=shax_sev_tagavor_stugum(view_i,view_j-sum,imageName,true);

                 if (matrixBord[view_i][view_j-sum].equals("datark")) {
                     if (is_shax==true) {
                         imageRamkaNavak_horizonakan[view_j - sum] = new ImageView(this);
                         imageRamkaNavak_horizonakan[view_j - sum].setImageResource(R.drawable.ramka);
                         params_images = new RelativeLayout.LayoutParams(widthLayoutMatrix / 8, widthLayoutMatrix / 8);
                         params_images.setMargins(leftTaguhi - 10 - sum * widthLayoutMatrix / 8,
                                 topTaguhi - 10, 0, 0);
                         rLayout.addView(imageRamkaNavak_horizonakan[view_j - sum], params_images);
                         imageClicked = imageName;
                         clickedRamkaNavah_horizonakan[view_j - sum] = "1";
                         imageRamkaNavak_horizonakan[view_j - sum].setOnClickListener(this);
                     }
                     sum++;
                 }
                 else if (matrixBord[view_i][view_j-sum].charAt(1)=='e' && sev_spitak==true && is_shax==true) {
                     imageRamkaNavak_horizonakan[view_j-sum]=new ImageView(this);
                     imageRamkaNavak_horizonakan[view_j-sum].setImageResource(R.drawable.ramka);
                     params_images = new RelativeLayout.LayoutParams(widthLayoutMatrix / 8, widthLayoutMatrix / 8);
                     params_images.setMargins(leftTaguhi - 10-sum*widthLayoutMatrix/8,
                             topTaguhi - 10, 0, 0);
                     rLayout.addView(imageRamkaNavak_horizonakan[view_j-sum], params_images);
                     imageClicked = imageName;
                     clickedRamkaNavah_horizonakan[view_j-sum] = "1";
                     opponentFigure1=false;
                     oponentImageString_horizonakan[view_j-sum]=matrixBord[view_i][view_j-sum];
                     imageRamkaNavak_horizonakan[view_j-sum].setOnClickListener(this);
                 }
                 else if (matrixBord[view_i][view_j-sum].charAt(1)=='p' && sev_spitak==false && is_shax==true) {
                     imageRamkaNavak_horizonakan[view_j-sum]=new ImageView(this);
                     imageRamkaNavak_horizonakan[view_j-sum].setImageResource(R.drawable.ramka);
                     params_images = new RelativeLayout.LayoutParams(widthLayoutMatrix / 8, widthLayoutMatrix / 8);
                     params_images.setMargins(leftTaguhi - 10-sum*widthLayoutMatrix/8,
                             topTaguhi - 10, 0, 0);
                     rLayout.addView(imageRamkaNavak_horizonakan[view_j-sum], params_images);
                     imageClicked = imageName;
                     clickedRamkaNavah_horizonakan[view_j-sum] = "1";
                     opponentFigure1=false;
                     oponentImageString_horizonakan[view_j-sum]=matrixBord[view_i][view_j-sum];
                     imageRamkaNavak_horizonakan[view_j-sum].setOnClickListener(this);
                 }

             }
             if (view_j+sum1<=7 && opponentFigure2==true) {
                 if (sev_spitak==true)
                     is_shax=shax_spitak_tagavor_stugum(view_i,view_j+sum1,imageName,true);
                 else if(sev_spitak==false)
                     is_shax=shax_sev_tagavor_stugum(view_i,view_j+sum1,imageName,true);

                 if (matrixBord[view_i][view_j+sum1].equals("datark")) {
                     if (is_shax==true) {
                         imageRamkaNavak_horizonakan[view_j + sum1] = new ImageView(this);
                         imageRamkaNavak_horizonakan[view_j + sum1].setImageResource(R.drawable.ramka);
                         params_images = new RelativeLayout.LayoutParams(widthLayoutMatrix / 8, widthLayoutMatrix / 8);
                         params_images.setMargins(leftTaguhi - 10 + sum1 * widthLayoutMatrix / 8,
                                 topTaguhi - 10, 0, 0);
                         rLayout.addView(imageRamkaNavak_horizonakan[view_j + sum1], params_images);
                         imageClicked = imageName;
                         clickedRamkaNavah_horizonakan[view_j + sum1] = "1";
                         imageRamkaNavak_horizonakan[view_j + sum1].setOnClickListener(this);
                     }
                     sum1++;
                 }
                 else if (matrixBord[view_i][view_j+sum1].charAt(1)=='e' && sev_spitak==true && is_shax==true) {

                     imageRamkaNavak_horizonakan[view_j+sum1]=new ImageView(this);
                     imageRamkaNavak_horizonakan[view_j+sum1].setImageResource(R.drawable.ramka);
                     params_images = new RelativeLayout.LayoutParams(widthLayoutMatrix / 8, widthLayoutMatrix / 8);
                     params_images.setMargins(leftTaguhi - 10+sum1*widthLayoutMatrix/8,
                             topTaguhi - 10, 0, 0);
                     rLayout.addView(imageRamkaNavak_horizonakan[view_j+sum1], params_images);
                     imageClicked = imageName;
                     clickedRamkaNavah_horizonakan[view_j+sum1] = "1";
                     opponentFigure2=false;
                     oponentImageString_horizonakan[view_j+sum1]=matrixBord[view_i][view_j+sum1];
                     imageRamkaNavak_horizonakan[view_j+sum1].setOnClickListener(this);
                 }
                 else if (matrixBord[view_i][view_j+sum1].charAt(1)=='p' && sev_spitak==false && is_shax==true) {

                     imageRamkaNavak_horizonakan[view_j+sum1]=new ImageView(this);
                     imageRamkaNavak_horizonakan[view_j+sum1].setImageResource(R.drawable.ramka);
                     params_images = new RelativeLayout.LayoutParams(widthLayoutMatrix / 8, widthLayoutMatrix / 8);
                     params_images.setMargins(leftTaguhi - 10+sum1*widthLayoutMatrix/8,
                             topTaguhi - 10, 0, 0);
                     rLayout.addView(imageRamkaNavak_horizonakan[view_j+sum1], params_images);
                     imageClicked = imageName;
                     clickedRamkaNavah_horizonakan[view_j+sum1] = "1";
                     opponentFigure2=false;
                     oponentImageString_horizonakan[view_j+sum1]=matrixBord[view_i][view_j+sum1];
                     imageRamkaNavak_horizonakan[view_j+sum1].setOnClickListener(this);
                 }

             }
             if (view_i-sum2>=0 && opponentFigure3==true) {
                 if (sev_spitak==true)
                     is_shax=shax_spitak_tagavor_stugum(view_i-sum2,view_j,imageName,true);
                 else if(sev_spitak==false)
                     is_shax=shax_sev_tagavor_stugum(view_i-sum2,view_j,imageName,true);

                 if (matrixBord[view_i-sum2][view_j].equals("datark")) {
                     if (is_shax==true) {
                         imageRamkaNavak_uxxahayac[view_i - sum2] = new ImageView(this);
                         imageRamkaNavak_uxxahayac[view_i - sum2].setImageResource(R.drawable.ramka);
                         params_images = new RelativeLayout.LayoutParams(widthLayoutMatrix / 8, widthLayoutMatrix / 8);
                         params_images.setMargins(leftTaguhi - 10,
                                 topTaguhi - 10 - sum2 * widthLayoutMatrix / 8, 0, 0);
                         rLayout.addView(imageRamkaNavak_uxxahayac[view_i - sum2], params_images);
                         imageClicked = imageName;
                         clickedRamkaNavah_uxxahayac[view_i - sum2] = "1";
                         imageRamkaNavak_uxxahayac[view_i - sum2].setOnClickListener(this);
                     }
                     sum2++;
                 }
                 else if (matrixBord[view_i-sum2][view_j].charAt(1)=='e' && sev_spitak==true && is_shax==true) {
                     imageRamkaNavak_uxxahayac[view_i-sum2]=new ImageView(this);
                     imageRamkaNavak_uxxahayac[view_i-sum2].setImageResource(R.drawable.ramka);
                     params_images = new RelativeLayout.LayoutParams(widthLayoutMatrix / 8, widthLayoutMatrix / 8);
                     params_images.setMargins(leftTaguhi - 10,
                             topTaguhi - 10-sum2*widthLayoutMatrix/8, 0, 0);
                     rLayout.addView(imageRamkaNavak_uxxahayac[view_i-sum2], params_images);
                     imageClicked = imageName;
                     clickedRamkaNavah_uxxahayac[view_i-sum2] = "1";
                     opponentFigure3=false;
                     oponentImageString_uxxahayac[view_i-sum2]=matrixBord[view_i-sum2][view_j];
                     imageRamkaNavak_uxxahayac[view_i-sum2].setOnClickListener(this);
                 }
                 else if (matrixBord[view_i-sum2][view_j].charAt(1)=='p' && sev_spitak==false && is_shax==true) {
                     imageRamkaNavak_uxxahayac[view_i-sum2]=new ImageView(this);
                     imageRamkaNavak_uxxahayac[view_i-sum2].setImageResource(R.drawable.ramka);
                     params_images = new RelativeLayout.LayoutParams(widthLayoutMatrix / 8, widthLayoutMatrix / 8);
                     params_images.setMargins(leftTaguhi - 10,
                             topTaguhi - 10-sum2*widthLayoutMatrix/8, 0, 0);
                     rLayout.addView(imageRamkaNavak_uxxahayac[view_i-sum2], params_images);
                     imageClicked = imageName;
                     clickedRamkaNavah_uxxahayac[view_i-sum2] = "1";
                     opponentFigure3=false;
                     oponentImageString_uxxahayac[view_i-sum2]=matrixBord[view_i-sum2][view_j];
                     imageRamkaNavak_uxxahayac[view_i-sum2].setOnClickListener(this);
                 }

             }
             if (view_i+sum3<=7 && opponentFigure4==true) {
                 if (sev_spitak==true)
                     is_shax=shax_spitak_tagavor_stugum(view_i+sum3,view_j,imageName,true);
                 else if(sev_spitak==false)
                     is_shax=shax_sev_tagavor_stugum(view_i+sum3,view_j,imageName,true);

                 if (matrixBord[view_i+sum3][view_j].equals("datark")) {
                     if (is_shax==true) {
                         imageRamkaNavak_uxxahayac[view_i + sum3] = new ImageView(this);
                         imageRamkaNavak_uxxahayac[view_i + sum3].setImageResource(R.drawable.ramka);
                         params_images = new RelativeLayout.LayoutParams(widthLayoutMatrix / 8, widthLayoutMatrix / 8);
                         params_images.setMargins(leftTaguhi - 10,
                                 topTaguhi - 10 + sum3 * widthLayoutMatrix / 8, 0, 0);
                         rLayout.addView(imageRamkaNavak_uxxahayac[view_i + sum3], params_images);
                         imageClicked = imageName;
                         clickedRamkaNavah_uxxahayac[view_i + sum3] = "1";
                         imageRamkaNavak_uxxahayac[view_i + sum3].setOnClickListener(this);
                     }
                     sum3++;
                 }
                 else if (matrixBord[view_i+sum3][view_j].charAt(1)=='e' && sev_spitak==true && is_shax==true) {
                     imageRamkaNavak_uxxahayac[view_i+sum3]=new ImageView(this);
                     imageRamkaNavak_uxxahayac[view_i+sum3].setImageResource(R.drawable.ramka);
                     params_images = new RelativeLayout.LayoutParams(widthLayoutMatrix / 8, widthLayoutMatrix / 8);
                     params_images.setMargins(leftTaguhi - 10,
                             topTaguhi - 10+sum3*widthLayoutMatrix/8, 0, 0);
                     rLayout.addView(imageRamkaNavak_uxxahayac[view_i+sum3], params_images);
                     imageClicked = imageName;
                     clickedRamkaNavah_uxxahayac[view_i+sum3] = "1";
                     opponentFigure4=false;
                     oponentImageString_uxxahayac[view_i+sum3]=matrixBord[view_i+sum3][view_j];
                     imageRamkaNavak_uxxahayac[view_i+sum3].setOnClickListener(this);
                 }
                 else if (matrixBord[view_i+sum3][view_j].charAt(1)=='p' && sev_spitak==false && is_shax==true) {
                     imageRamkaNavak_uxxahayac[view_i+sum3]=new ImageView(this);
                     imageRamkaNavak_uxxahayac[view_i+sum3].setImageResource(R.drawable.ramka);
                     params_images = new RelativeLayout.LayoutParams(widthLayoutMatrix / 8, widthLayoutMatrix / 8);
                     params_images.setMargins(leftTaguhi - 10,
                             topTaguhi - 10+sum3*widthLayoutMatrix/8, 0, 0);
                     rLayout.addView(imageRamkaNavak_uxxahayac[view_i+sum3], params_images);
                     imageClicked = imageName;
                     clickedRamkaNavah_uxxahayac[view_i+sum3] = "1";
                     opponentFigure4=false;
                     oponentImageString_uxxahayac[view_i+sum3]=matrixBord[view_i+sum3][view_j];
                     imageRamkaNavak_uxxahayac[view_i+sum3].setOnClickListener(this);
                 }
             }

             if (view_j-sum00>=0 && view_i-sum00>=0 && opponentFigure11==true) {
                 if (sev_spitak==true)
                     is_shax=shax_spitak_tagavor_stugum(view_i-sum00,view_j-sum00,imageName,true);
                 else if(sev_spitak==false)
                     is_shax=shax_sev_tagavor_stugum(view_i-sum00,view_j-sum00,imageName,true);

                 if (matrixBord[view_i-sum00][view_j-sum00].equals("datark")) {
                     if (is_shax==true) {
                         imageRamkaPix_glxavor[view_j - sum00] = new ImageView(this);
                         imageRamkaPix_glxavor[view_j - sum00].setImageResource(R.drawable.ramka);
                         params_images = new RelativeLayout.LayoutParams(widthLayoutMatrix / 8, widthLayoutMatrix / 8);
                         params_images.setMargins(leftTaguhi - 10 - sum00 * widthLayoutMatrix / 8,
                                 topTaguhi - 10 - sum00 * widthLayoutMatrix / 8, 0, 0);
                         rLayout.addView(imageRamkaPix_glxavor[view_j - sum00], params_images);
                         imageClicked = imageName;
                         clickedRamkaPix_glxavor[view_j - sum00] = "1";
                         imageRamkaPix_glxavor[view_j - sum00].setOnClickListener(this);
                     }
                     sum00++;
                 }
                 else if (matrixBord[view_i-sum00][view_j-sum00].charAt(1)=='e' && sev_spitak==true && is_shax==true) {
                     imageRamkaPix_glxavor[view_j-sum00]=new ImageView(this);
                     imageRamkaPix_glxavor[view_j-sum00].setImageResource(R.drawable.ramka);
                     params_images = new RelativeLayout.LayoutParams(widthLayoutMatrix / 8, widthLayoutMatrix / 8);
                     params_images.setMargins(leftTaguhi - 10-sum00*widthLayoutMatrix/8,
                             topTaguhi - 10-sum00*widthLayoutMatrix/8, 0, 0);
                     rLayout.addView(imageRamkaPix_glxavor[view_j-sum00], params_images);
                     imageClicked = imageName;
                     clickedRamkaPix_glxavor[view_j-sum00] = "1";
                     opponentFigure11=false;
                     oponentPixString_glxavor[view_j-sum00]=matrixBord[view_i-sum00][view_j-sum00];
                     imageRamkaPix_glxavor[view_j-sum00].setOnClickListener(this);
                 }
                 else if (matrixBord[view_i-sum00][view_j-sum00].charAt(1)=='p' && sev_spitak==false && is_shax==true) {
                     imageRamkaPix_glxavor[view_j-sum00]=new ImageView(this);
                     imageRamkaPix_glxavor[view_j-sum00].setImageResource(R.drawable.ramka);
                     params_images = new RelativeLayout.LayoutParams(widthLayoutMatrix / 8, widthLayoutMatrix / 8);
                     params_images.setMargins(leftTaguhi - 10-sum00*widthLayoutMatrix/8,
                             topTaguhi - 10-sum00*widthLayoutMatrix/8, 0, 0);
                     rLayout.addView(imageRamkaPix_glxavor[view_j-sum00], params_images);
                     imageClicked = imageName;
                     clickedRamkaPix_glxavor[view_j-sum00] = "1";
                     opponentFigure11=false;
                     oponentPixString_glxavor[view_j-sum00]=matrixBord[view_i-sum00][view_j-sum00];
                     imageRamkaPix_glxavor[view_j-sum00].setOnClickListener(this);
                 }

             }
             if (view_j+sum11<=7 && view_i+sum11<=7 && opponentFigure22==true) {
                 if (sev_spitak==true)
                     is_shax=shax_spitak_tagavor_stugum(view_i+sum11,view_j+sum11,imageName,true);
                 else if(sev_spitak==false)
                     is_shax=shax_sev_tagavor_stugum(view_i+sum11,view_j+sum11,imageName,true);

                 if (matrixBord[view_i+sum11][view_j+sum11].equals("datark")) {
                     if (is_shax==true) {
                         imageRamkaPix_glxavor[view_j + sum11] = new ImageView(this);
                         imageRamkaPix_glxavor[view_j + sum11].setImageResource(R.drawable.ramka);
                         params_images = new RelativeLayout.LayoutParams(widthLayoutMatrix / 8, widthLayoutMatrix / 8);
                         params_images.setMargins(leftTaguhi - 10 + sum11 * widthLayoutMatrix / 8,
                                 topTaguhi - 10 + sum11 * widthLayoutMatrix / 8, 0, 0);
                         rLayout.addView(imageRamkaPix_glxavor[view_j + sum11], params_images);
                         imageClicked = imageName;
                         clickedRamkaPix_glxavor[view_j + sum11] = "1";
                         imageRamkaPix_glxavor[view_j + sum11].setOnClickListener(this);
                     }
                     sum11++;
                 }
                 else if (matrixBord[view_i+sum11][view_j+sum11].charAt(1)=='e' && sev_spitak==true && is_shax==true) {

                     imageRamkaPix_glxavor[view_j+sum11]=new ImageView(this);
                     imageRamkaPix_glxavor[view_j+sum11].setImageResource(R.drawable.ramka);
                     params_images = new RelativeLayout.LayoutParams(widthLayoutMatrix / 8, widthLayoutMatrix / 8);
                     params_images.setMargins(leftTaguhi - 10+sum11*widthLayoutMatrix/8,
                             topTaguhi - 10+sum11*widthLayoutMatrix/8, 0, 0);
                     rLayout.addView(imageRamkaPix_glxavor[view_j+sum11], params_images);
                     imageClicked = imageName;
                     clickedRamkaPix_glxavor[view_j+sum11] = "1";
                     opponentFigure22=false;
                     oponentPixString_glxavor[view_j+sum11]=matrixBord[view_i+sum11][view_j+sum11];
                     imageRamkaPix_glxavor[view_j+sum11].setOnClickListener(this);
                 }
                 else if (matrixBord[view_i+sum11][view_j+sum11].charAt(1)=='p' && sev_spitak==false && is_shax==true) {

                     imageRamkaPix_glxavor[view_j+sum11]=new ImageView(this);
                     imageRamkaPix_glxavor[view_j+sum11].setImageResource(R.drawable.ramka);
                     params_images = new RelativeLayout.LayoutParams(widthLayoutMatrix / 8, widthLayoutMatrix / 8);
                     params_images.setMargins(leftTaguhi - 10+sum11*widthLayoutMatrix/8,
                             topTaguhi - 10+sum11*widthLayoutMatrix/8, 0, 0);
                     rLayout.addView(imageRamkaPix_glxavor[view_j+sum11], params_images);
                     imageClicked = imageName;
                     clickedRamkaPix_glxavor[view_j+sum11] = "1";
                     opponentFigure22=false;
                     oponentPixString_glxavor[view_j+sum11]=matrixBord[view_i+sum11][view_j+sum11];
                     imageRamkaPix_glxavor[view_j+sum11].setOnClickListener(this);
                 }

             }
             if (view_i-sum22>=0 && view_j+sum22<=7 && opponentFigure33==true) {
                 if (sev_spitak==true)
                     is_shax=shax_spitak_tagavor_stugum(view_i-sum22,view_j+sum22,imageName,true);
                 else if(sev_spitak==false)
                     is_shax=shax_sev_tagavor_stugum(view_i-sum22,view_j+sum22,imageName,true);

                 if (matrixBord[view_i-sum22][view_j+sum22].equals("datark")) {
                     if (is_shax==true) {
                         imageRamkaPix_ojandak[view_i - sum22] = new ImageView(this);
                         imageRamkaPix_ojandak[view_i - sum22].setImageResource(R.drawable.ramka);
                         params_images = new RelativeLayout.LayoutParams(widthLayoutMatrix / 8, widthLayoutMatrix / 8);
                         params_images.setMargins(leftTaguhi - 10 + sum22 * widthLayoutMatrix / 8,
                                 topTaguhi - 10 - sum22 * widthLayoutMatrix / 8, 0, 0);
                         rLayout.addView(imageRamkaPix_ojandak[view_i - sum22], params_images);
                         imageClicked = imageName;
                         clicedRamkaPix_ojandak[view_i - sum22] = "1";
                         imageRamkaPix_ojandak[view_i - sum22].setOnClickListener(this);
                     }
                     sum22++;
                 }
                 else if (matrixBord[view_i-sum22][view_j+sum22].charAt(1)=='e' && sev_spitak==true && is_shax==true) {
                     imageRamkaPix_ojandak[view_i-sum22]=new ImageView(this);
                     imageRamkaPix_ojandak[view_i-sum22].setImageResource(R.drawable.ramka);
                     params_images = new RelativeLayout.LayoutParams(widthLayoutMatrix / 8, widthLayoutMatrix / 8);
                     params_images.setMargins(leftTaguhi - 10+sum22*widthLayoutMatrix/8,
                             topTaguhi - 10-sum22*widthLayoutMatrix/8, 0, 0);
                     rLayout.addView(imageRamkaPix_ojandak[view_i-sum22], params_images);
                     imageClicked = imageName;
                     clicedRamkaPix_ojandak[view_i-sum22] = "1";
                     opponentFigure33=false;
                     oponentPixString_ojandak[view_i-sum22]=matrixBord[view_i-sum22][view_j+sum22];
                     imageRamkaPix_ojandak[view_i-sum22].setOnClickListener(this);
                 }
                 else if (matrixBord[view_i-sum22][view_j+sum22].charAt(1)=='p' && sev_spitak==false && is_shax==true) {
                     imageRamkaPix_ojandak[view_i-sum22]=new ImageView(this);
                     imageRamkaPix_ojandak[view_i-sum22].setImageResource(R.drawable.ramka);
                     params_images = new RelativeLayout.LayoutParams(widthLayoutMatrix / 8, widthLayoutMatrix / 8);
                     params_images.setMargins(leftTaguhi - 10+sum22*widthLayoutMatrix/8,
                             topTaguhi - 10-sum22*widthLayoutMatrix/8, 0, 0);
                     rLayout.addView(imageRamkaPix_ojandak[view_i-sum22], params_images);
                     imageClicked = imageName;
                     clicedRamkaPix_ojandak[view_i-sum22] = "1";
                     opponentFigure33=false;
                     oponentPixString_ojandak[view_i-sum22]=matrixBord[view_i-sum22][view_j+sum22];
                     imageRamkaPix_ojandak[view_i-sum22].setOnClickListener(this);
                 }

             }
             if (view_i+sum33<=7 && view_j-sum33>=0 && opponentFigure44==true) {
                 if (sev_spitak==true)
                     is_shax=shax_spitak_tagavor_stugum(view_i+sum33,view_j-sum33,imageName,true);
                 else if(sev_spitak==false)
                     is_shax=shax_sev_tagavor_stugum(view_i+sum33,view_j-sum33,imageName,true);

                 if (matrixBord[view_i+sum33][view_j-sum33].equals("datark")) {
                     if (is_shax==true) {
                         imageRamkaPix_ojandak[view_i + sum33] = new ImageView(this);
                         imageRamkaPix_ojandak[view_i + sum33].setImageResource(R.drawable.ramka);
                         params_images = new RelativeLayout.LayoutParams(widthLayoutMatrix / 8, widthLayoutMatrix / 8);
                         params_images.setMargins(leftTaguhi - 10 - sum33 * widthLayoutMatrix / 8,
                                 topTaguhi - 10 + sum33 * widthLayoutMatrix / 8, 0, 0);
                         rLayout.addView(imageRamkaPix_ojandak[view_i + sum33], params_images);
                         imageClicked = imageName;
                         clicedRamkaPix_ojandak[view_i + sum33] = "1";
                         imageRamkaPix_ojandak[view_i + sum33].setOnClickListener(this);
                     }
                     sum33++;
                 }
                 else if (matrixBord[view_i+sum33][view_j-sum33].charAt(1)=='e' && sev_spitak==true && is_shax==true) {
                     imageRamkaPix_ojandak[view_i+sum33]=new ImageView(this);
                     imageRamkaPix_ojandak[view_i+sum33].setImageResource(R.drawable.ramka);
                     params_images = new RelativeLayout.LayoutParams(widthLayoutMatrix / 8, widthLayoutMatrix / 8);
                     params_images.setMargins(leftTaguhi - 10-sum33*widthLayoutMatrix/8,
                             topTaguhi - 10+sum33*widthLayoutMatrix/8, 0, 0);
                     rLayout.addView(imageRamkaPix_ojandak[view_i+sum33], params_images);
                     imageClicked = imageName;
                     clicedRamkaPix_ojandak[view_i+sum33] = "1";
                     opponentFigure44=false;
                     oponentPixString_ojandak[view_i+sum33]=matrixBord[view_i+sum33][view_j-sum33];
                     imageRamkaPix_ojandak[view_i+sum33].setOnClickListener(this);
                 }
                 else if (matrixBord[view_i+sum33][view_j-sum33].charAt(1)=='p' && sev_spitak==false && is_shax==true) {
                     imageRamkaPix_ojandak[view_i+sum33]=new ImageView(this);
                     imageRamkaPix_ojandak[view_i+sum33].setImageResource(R.drawable.ramka);
                     params_images = new RelativeLayout.LayoutParams(widthLayoutMatrix / 8, widthLayoutMatrix / 8);
                     params_images.setMargins(leftTaguhi - 10-sum33*widthLayoutMatrix/8,
                             topTaguhi - 10+sum33*widthLayoutMatrix/8, 0, 0);
                     rLayout.addView(imageRamkaPix_ojandak[view_i+sum33], params_images);
                     imageClicked = imageName;
                     clicedRamkaPix_ojandak[view_i+sum33] = "1";
                     opponentFigure44=false;
                     oponentPixString_ojandak[view_i+sum33]=matrixBord[view_i+sum33][view_j-sum33];
                     imageRamkaPix_ojandak[view_i+sum33].setOnClickListener(this);
                 }
             }
         }

         if (clickedRamkaPix_glxavor[0].equals("1")) {
             imageRamkaPix_glxavor[0].setId(R.id.ramka_Pix_glxavor_1);
         }
         if (clickedRamkaPix_glxavor[1].equals("1")) {
             imageRamkaPix_glxavor[1].setId(R.id.ramka_Pix_glxavor_2);
         }
         if (clickedRamkaPix_glxavor[2].equals("1")) {
             imageRamkaPix_glxavor[2].setId(R.id.ramka_Pix_glxavor_3);
         }
         if (clickedRamkaPix_glxavor[3].equals("1")) {
             imageRamkaPix_glxavor[3].setId(R.id.ramka_Pix_glxavor_4);
         }
         if (clickedRamkaPix_glxavor[4].equals("1")) {
             imageRamkaPix_glxavor[4].setId(R.id.ramka_Pix_glxavor_5);
         }
         if (clickedRamkaPix_glxavor[5].equals("1")) {
             imageRamkaPix_glxavor[5].setId(R.id.ramka_Pix_glxavor_6);
         }
         if (clickedRamkaPix_glxavor[6].equals("1")) {
             imageRamkaPix_glxavor[6].setId(R.id.ramka_Pix_glxavor_7);
         }
         if (clickedRamkaPix_glxavor[7].equals("1")) {
             imageRamkaPix_glxavor[7].setId(R.id.ramka_Pix_glxavor_8);
         }


         if (clicedRamkaPix_ojandak[0].equals("1")) {
             imageRamkaPix_ojandak[0].setId(R.id.ramka_Pix_ojandak_1);
         }
         if (clicedRamkaPix_ojandak[1].equals("1")) {
             imageRamkaPix_ojandak[1].setId(R.id.ramka_Pix_ojandak_2);
         }
         if (clicedRamkaPix_ojandak[2].equals("1")) {
             imageRamkaPix_ojandak[2].setId(R.id.ramka_Pix_ojandak_3);
         }
         if (clicedRamkaPix_ojandak[3].equals("1")) {
             imageRamkaPix_ojandak[3].setId(R.id.ramka_Pix_ojandak_4);
         }
         if (clicedRamkaPix_ojandak[4].equals("1")) {
             imageRamkaPix_ojandak[4].setId(R.id.ramka_Pix_ojandak_5);
         }
         if (clicedRamkaPix_ojandak[5].equals("1")) {
             imageRamkaPix_ojandak[5].setId(R.id.ramka_Pix_ojandak_6);
         }
         if (clicedRamkaPix_ojandak[6].equals("1")) {
             imageRamkaPix_ojandak[6].setId(R.id.ramka_Pix_ojandak_7);
         }
         if (clicedRamkaPix_ojandak[7].equals("1")) {
             imageRamkaPix_ojandak[7].setId(R.id.ramka_Pix_ojandak_8);
         }



         if (clickedRamkaNavah_horizonakan[0].equals("1")) {
             imageRamkaNavak_horizonakan[0].setId(R.id.ramka_Navak_horizonakan_1);
         }
         if (clickedRamkaNavah_horizonakan[1].equals("1")) {
             imageRamkaNavak_horizonakan[1].setId(R.id.ramka_Navak_horizonakan_2);
         }
         if (clickedRamkaNavah_horizonakan[2].equals("1")) {
             imageRamkaNavak_horizonakan[2].setId(R.id.ramka_Navak_horizonakan_3);
         }
         if (clickedRamkaNavah_horizonakan[3].equals("1")) {
             imageRamkaNavak_horizonakan[3].setId(R.id.ramka_Navak_horizonakan_4);
         }
         if (clickedRamkaNavah_horizonakan[4].equals("1")) {
             imageRamkaNavak_horizonakan[4].setId(R.id.ramka_Navak_horizonakan_5);
         }
         if (clickedRamkaNavah_horizonakan[5].equals("1")) {
             imageRamkaNavak_horizonakan[5].setId(R.id.ramka_Navak_horizonakan_6);
         }
         if (clickedRamkaNavah_horizonakan[6].equals("1")) {
             imageRamkaNavak_horizonakan[6].setId(R.id.ramka_Navak_horizonakan_7);
         }
         if (clickedRamkaNavah_horizonakan[7].equals("1")) {
             imageRamkaNavak_horizonakan[7].setId(R.id.ramka_Navak_horizonakan_8);
         }


         if (clickedRamkaNavah_uxxahayac[0].equals("1")) {
             imageRamkaNavak_uxxahayac[0].setId(R.id.ramka_Navak_uxxahayac_1);
         }
         if (clickedRamkaNavah_uxxahayac[1].equals("1")) {
             imageRamkaNavak_uxxahayac[1].setId(R.id.ramka_Navak_uxxahayac_2);
         }
         if (clickedRamkaNavah_uxxahayac[2].equals("1")) {
             imageRamkaNavak_uxxahayac[2].setId(R.id.ramka_Navak_uxxahayac_3);
         }
         if (clickedRamkaNavah_uxxahayac[3].equals("1")) {
             imageRamkaNavak_uxxahayac[3].setId(R.id.ramka_Navak_uxxahayac_4);
         }
         if (clickedRamkaNavah_uxxahayac[4].equals("1")) {
             imageRamkaNavak_uxxahayac[4].setId(R.id.ramka_Navak_uxxahayac_5);
         }
         if (clickedRamkaNavah_uxxahayac[5].equals("1")) {
             imageRamkaNavak_uxxahayac[5].setId(R.id.ramka_Navak_uxxahayac_6);
         }
         if (clickedRamkaNavah_uxxahayac[6].equals("1")) {
             imageRamkaNavak_uxxahayac[6].setId(R.id.ramka_Navak_uxxahayac_7);
         }
         if (clickedRamkaNavah_uxxahayac[7].equals("1")) {
             imageRamkaNavak_uxxahayac[7].setId(R.id.ramka_Navak_uxxahayac_8);
         }


     }

     //--------------------metod tagavor_Click--------------------------------------------------------------------------

     private void tagavorClick(ImageView imageTagavor, int leftTagavor, int topTagavor, String imageName, boolean sev_spitak) {

         if (clickedRamka1.equals("1")) {
             imageRamka1.setVisibility(View.GONE);
             clickedRamka1 = "";
         }
         if (clickedRamka2.equals("1")) {
             imageRamka2.setVisibility(View.GONE);
             clickedRamka2 = "";
         }
         if (clickedRamka3.equals("1")) {
             imageRamka3.setVisibility(View.GONE);
             clickedRamka3 = "";
         }
         if (clickedRamka4.equals("1")) {
             imageRamka4.setVisibility(View.GONE);
             clickedRamka4 = "";
         }
         if (clickedRamka5.equals("1")) {
             imageRamka5.setVisibility(View.GONE);
             clickedRamka5 = "";
         }
         if (clickedRamka6.equals("1")) {
             imageRamka6.setVisibility(View.GONE);
             clickedRamka6 = "";
         }


         if (clickedRamkaDzi_1.equals("1")) {
             imageRamkaDzi_1.setVisibility(View.GONE);
             clickedRamkaDzi_1="";
         }
         if (clickedRamkaDzi_2.equals("1")) {
             imageRamkaDzi_2.setVisibility(View.GONE);
             clickedRamkaDzi_2="";
         }
         if (clickedRamkaDzi_3.equals("1")) {
             imageRamkaDzi_3.setVisibility(View.GONE);
             clickedRamkaDzi_3="";
         }
         if (clickedRamkaDzi_4.equals("1")) {
             imageRamkaDzi_4.setVisibility(View.GONE);
             clickedRamkaDzi_4="";
         }
         if (clickedRamkaDzi_5.equals("1")) {
             imageRamkaDzi_5.setVisibility(View.GONE);
             clickedRamkaDzi_5="";
         }
         if (clickedRamkaDzi_6.equals("1")) {
             imageRamkaDzi_6.setVisibility(View.GONE);
             clickedRamkaDzi_6="";
         }
         if (clickedRamkaDzi_7.equals("1")) {
             imageRamkaDzi_7.setVisibility(View.GONE);
             clickedRamkaDzi_7="";
         }
         if (clickedRamkaDzi_8.equals("1")) {
             imageRamkaDzi_8.setVisibility(View.GONE);
             clickedRamkaDzi_8="";
         }



         if (clickedRamkaTagavor_1.equals("1")) {
             imageRamkaTagavor_1.setVisibility(View.GONE);
             clickedRamkaTagavor_1="";
         }
         if (clickedRamkaTagavor_2.equals("1")) {
             imageRamkaTagavor_2.setVisibility(View.GONE);
             clickedRamkaTagavor_2="";
         }
         if (clickedRamkaTagavor_3.equals("1")) {
             imageRamkaTagavor_3.setVisibility(View.GONE);
             clickedRamkaTagavor_3="";
         }
         if (clickedRamkaTagavor_4.equals("1")) {
             imageRamkaTagavor_4.setVisibility(View.GONE);
             clickedRamkaTagavor_4="";
         }
         if (clickedRamkaTagavor_5.equals("1")) {
             imageRamkaTagavor_5.setVisibility(View.GONE);
             clickedRamkaTagavor_5="";
         }
         if (clickedRamkaTagavor_6.equals("1")) {
             imageRamkaTagavor_6.setVisibility(View.GONE);
             clickedRamkaTagavor_6="";
         }
         if (clickedRamkaTagavor_7.equals("1")) {
             imageRamkaTagavor_7.setVisibility(View.GONE);
             clickedRamkaTagavor_7="";
         }
         if (clickedRamkaTagavor_8.equals("1")) {
             imageRamkaTagavor_8.setVisibility(View.GONE);
             clickedRamkaTagavor_8="";
         }
         if (clickedRamkaTagavor_9.equals("1")) {
             imageRamkaTagavor_9.setVisibility(View.GONE);
             clickedRamkaTagavor_9="";
         }
         if (clickedRamkaTagavor_10.equals("1")) {
             imageRamkaTagavor_10.setVisibility(View.GONE);
             clickedRamkaTagavor_10="";
         }

         for (int i = 0; i < 8; i++) {
             if (clickedRamkaNavah_horizonakan[i].equals("1")) {
                 imageRamkaNavak_horizonakan[i].setVisibility(View.GONE);
                 clickedRamkaNavah_horizonakan[i] = "";
             }
             if (clickedRamkaNavah_uxxahayac[i].equals("1")) {
                 imageRamkaNavak_uxxahayac[i].setVisibility(View.GONE);
                 clickedRamkaNavah_uxxahayac[i] = "";
             }
             if (clickedRamkaPix_glxavor[i].equals("1")) {
                 imageRamkaPix_glxavor[i].setVisibility(View.GONE);
                 clickedRamkaPix_glxavor[i]="";
             }
             if (clicedRamkaPix_ojandak[i].equals("1")) {
                 imageRamkaPix_ojandak[i].setVisibility(View.GONE);
                 clicedRamkaPix_ojandak[i]="";
             }
         }

         oponentTagavorString_1="";
         oponentTagavorString_2="";
         oponentTagavorString_3="";
         oponentTagavorString_4="";
         oponentTagavorString_5="";
         oponentTagavorString_6="";
         oponentTagavorString_7="";
         oponentTagavorString_8="";

         for (int i=0; i<8; i++) {
             for (int j=0; j<8; j++) {
                 if (matrixBord[i][j].equals(imageName)) {
                     view_i=i;
                     view_j=j;
                 }
             }
         }

         boolean harvac_dashtin=true;

         if (view_i-1>=0) {

             if (sev_spitak==true) {
                 for (int i = view_j - 1; i >= 0; i--) {
                     if (matrixBord[view_i - 1][i].substring(0,matrixBord[view_i - 1][i].length()-2).equals("sev_navak")
                             || matrixBord[view_i - 1][i].substring(0,matrixBord[view_i - 1][i].length()-2).equals("sev_taguhi")
                             || matrixBord[view_i - 1][i].substring(0,matrixBord[view_i - 1][i].length()).equals("sev_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[view_i - 1][i].substring(0,matrixBord[view_i - 1][i].length()-2).equals("sev_pix")
                             || matrixBord[view_i - 1][i].substring(0,matrixBord[view_i - 1][i].length()-2).equals("sev_dzi")
                             || matrixBord[view_i - 1][i].substring(0,matrixBord[view_i - 1][i].length()-2).equals("sev_zinvor")
                             || matrixBord[view_i - 1][i].substring(0,matrixBord[view_i - 1][i].length()).equals("sev_tagavor")
                             || matrixBord[view_i - 1][i].charAt(1)=='p') {
                         break;
                     }
                 }

                 for (int i=view_j+1; i<8; i++) {
                     if (matrixBord[view_i - 1][i].substring(0,matrixBord[view_i - 1][i].length()-2).equals("sev_navak")
                             || matrixBord[view_i - 1][i].substring(0,matrixBord[view_i - 1][i].length()-2).equals("sev_taguhi")
                             || matrixBord[view_i - 1][i].substring(0,matrixBord[view_i - 1][i].length()).equals("sev_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[view_i - 1][i].substring(0,matrixBord[view_i - 1][i].length()-2).equals("sev_pix")
                             || matrixBord[view_i - 1][i].substring(0,matrixBord[view_i - 1][i].length()-2).equals("sev_dzi")
                             || matrixBord[view_i - 1][i].substring(0,matrixBord[view_i - 1][i].length()-2).equals("sev_zinvor")
                             || matrixBord[view_i - 1][i].substring(0,matrixBord[view_i - 1][i].length()).equals("sev_tagavor")
                             || matrixBord[view_i - 1][i].charAt(1)=='p') {
                         break;
                     }
                 }

                 for (int i=view_i-2; i>=0; i--) {
                     if (matrixBord[i][view_j].substring(0,matrixBord[i][view_j].length()-2).equals("sev_navak")
                             || matrixBord[i][view_j].substring(0,matrixBord[i][view_j].length()-2).equals("sev_taguhi")
                             || matrixBord[i][view_j].substring(0,matrixBord[i][view_j].length()).equals("sev_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[i][view_j].substring(0,matrixBord[i][view_j].length()-2).equals("sev_pix")
                             || matrixBord[i][view_j].substring(0,matrixBord[i][view_j].length()-2).equals("sev_dzi")
                             || matrixBord[i][view_j].substring(0,matrixBord[i][view_j].length()-2).equals("sev_zinvor")
                             || matrixBord[i][view_j].substring(0,matrixBord[i][view_j].length()).equals("sev_tagavor")
                             || matrixBord[i][view_j].charAt(1)=='p') {
                         break;
                     }
                 }

                 for (int i=view_i+1; i<=7; i++) {
                     if (matrixBord[i][view_j].substring(0,matrixBord[i][view_j].length()-2).equals("sev_navak")
                             || matrixBord[i][view_j].substring(0,matrixBord[i][view_j].length()-2).equals("sev_taguhi")
                             || matrixBord[i][view_j].substring(0,matrixBord[i][view_j].length()).equals("sev_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[i][view_j].substring(0,matrixBord[i][view_j].length()-2).equals("sev_pix")
                             || matrixBord[i][view_j].substring(0,matrixBord[i][view_j].length()-2).equals("sev_dzi")
                             || matrixBord[i][view_j].substring(0,matrixBord[i][view_j].length()-2).equals("sev_zinvor")
                             || matrixBord[i][view_j].substring(0,matrixBord[i][view_j].length()).equals("sev_tagavor")
                             || matrixBord[i][view_j].charAt(1)=='p') {
                         break;
                     }
                 }

                int i=view_i-2;
                 int j=view_j-1;
                 while (i>=0 && j>=0) {
                     if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_pix")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_taguhi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("sev_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_navak")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_dzi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_zinvor")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("sev_tagavor")
                             || matrixBord[i][j].charAt(1)=='p') {
                         break;
                     }
                     i--;
                     j--;
                 }

                 i=view_i;
                 j=view_j+1;

                 while (i<=7 && j<=7) {
                     if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_pix")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_taguhi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("sev_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_navak")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_dzi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_zinvor")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("sev_tagavor")
                             || matrixBord[i][j].charAt(1)=='p') {
                         break;
                     }
                     i++;
                     j++;
                 }

                 i=view_i-2;
                 j=view_j+1;
                 while (i>=0 && j<=7) {
                     if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_pix")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_taguhi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("sev_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_navak")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_dzi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_zinvor")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("sev_tagavor")
                             || matrixBord[i][j].charAt(1)=='p') {
                         break;
                     }
                     i--;
                     j++;
                 }

                 i=view_i;
                 j=view_j-1;
                 while (i<=7 && j>=0) {
                     if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_pix")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_taguhi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("sev_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_navak")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_dzi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_zinvor")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("sev_tagavor")
                             || matrixBord[i][j].charAt(1)=='p') {
                         break;
                     }
                     i++;
                     j--;
                 }

                 if (view_i-3>=0 && view_j+1<=7) {
                     if (matrixBord[view_i-3][view_j+1].substring(0,matrixBord[view_i-3][view_j+1].length()-2).equals("sev_dzi"))
                         harvac_dashtin=false;
                 }
                 if (view_i-3>=0 && view_j-1>=0) {
                     if (matrixBord[view_i-3][view_j-1].substring(0,matrixBord[view_i-3][view_j-1].length()-2).equals("sev_dzi"))
                         harvac_dashtin=false;
                 }
                 if (view_i-2>=0 && view_j+2<=7) {
                     if (matrixBord[view_i-2][view_j+2].substring(0,matrixBord[view_i-2][view_j+2].length()-2).equals("sev_dzi"))
                         harvac_dashtin=false;
                 }
                 if (view_i-2>=0 && view_j-2>=0) {
                     if (matrixBord[view_i-2][view_j-2].substring(0,matrixBord[view_i-2][view_j-2].length()-2).equals("sev_dzi"))
                         harvac_dashtin=false;
                 }
                 if (view_i+1<=7 && view_j+1<=7) {
                     if (matrixBord[view_i+1][view_j+1].substring(0,matrixBord[view_i+1][view_j+1].length()-2).equals("sev_dzi"))
                         harvac_dashtin=false;
                 }
                 if (view_i+1<=7 && view_j-1>=0) {
                     if (matrixBord[view_i+1][view_j-1].substring(0,matrixBord[view_i+1][view_j-1].length()-2).equals("sev_dzi"))
                         harvac_dashtin=false;
                 }
                 if (view_i<=7 && view_j+2<=7) {
                     if (matrixBord[view_i][view_j+2].substring(0,matrixBord[view_i][view_j+2].length()-2).equals("sev_dzi"))
                         harvac_dashtin=false;
                 }
                 if (view_i<=7 && view_j-2>=0) {
                     if (matrixBord[view_i][view_j-2].substring(0,matrixBord[view_i][view_j-2].length()-2).equals("sev_dzi"))
                         harvac_dashtin=false;
                 }

                 if (view_i-2>=0 && view_j-1>=0) {
                     if (matrixBord[view_i-2][view_j-1].equals("sev_tagavor"))
                         harvac_dashtin=false;
                 }
                 if (view_i-2>=0) {
                     if (matrixBord[view_i-2][view_j].equals("sev_tagavor"))
                         harvac_dashtin=false;
                 }
                 if (view_i-2>=0 && view_j+1<=7) {
                     if (matrixBord[view_i-2][view_j+1].equals("sev_tagavor"))
                         harvac_dashtin=false;
                 }

                 if (view_i-2>=0 && view_j-1>=0) {
                     if (matrixBord[view_i-2][view_j-1].substring(0,matrixBord[view_i-2][view_j-1].length()-2).equals("sev_zinvor"))
                         harvac_dashtin=false;
                 }
                 if (view_i-2>=0 && view_j+1<=7) {
                     if (matrixBord[view_i-2][view_j+1].substring(0,matrixBord[view_i-2][view_j+1].length()-2).equals("sev_zinvor"))
                         harvac_dashtin=false;
                 }
             }
             else  {

                 for (int i = view_j - 1; i >= 0; i--) {
                     if (matrixBord[view_i - 1][i].substring(0,matrixBord[view_i - 1][i].length()-2).equals("spitak_navak")
                             || matrixBord[view_i - 1][i].substring(0,matrixBord[view_i - 1][i].length()-2).equals("spitak_taguhi")
                             || matrixBord[view_i - 1][i].substring(0,matrixBord[view_i - 1][i].length()).equals("spitak_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[view_i - 1][i].substring(0,matrixBord[view_i - 1][i].length()-2).equals("spitak_pix")
                             || matrixBord[view_i - 1][i].substring(0,matrixBord[view_i - 1][i].length()-2).equals("spitak_dzi")
                             || matrixBord[view_i - 1][i].substring(0,matrixBord[view_i - 1][i].length()-2).equals("spitak_zinvor")
                             || matrixBord[view_i - 1][i].substring(0,matrixBord[view_i - 1][i].length()).equals("spitak_tagavor")
                             || matrixBord[view_i - 1][i].charAt(1)=='e') {
                         break;
                     }
                 }

                 for (int i=view_j+1; i<8; i++) {
                     if (matrixBord[view_i - 1][i].substring(0,matrixBord[view_i - 1][i].length()-2).equals("spitak_navak")
                             || matrixBord[view_i - 1][i].substring(0,matrixBord[view_i - 1][i].length()-2).equals("spitak_taguhi")
                             || matrixBord[view_i - 1][i].substring(0,matrixBord[view_i - 1][i].length()).equals("spitak_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[view_i - 1][i].substring(0,matrixBord[view_i - 1][i].length()-2).equals("spitak_pix")
                             || matrixBord[view_i - 1][i].substring(0,matrixBord[view_i - 1][i].length()-2).equals("spitak_dzi")
                             || matrixBord[view_i - 1][i].substring(0,matrixBord[view_i - 1][i].length()-2).equals("spitak_zinvor")
                             || matrixBord[view_i - 1][i].substring(0,matrixBord[view_i - 1][i].length()).equals("spitak_tagavor")
                             || matrixBord[view_i - 1][i].charAt(1)=='e') {
                         break;
                     }
                 }

                 for (int i=view_i-2; i>=0; i--) {
                     if (matrixBord[i][view_j].substring(0,matrixBord[i][view_j].length()-2).equals("spitak_navak")
                             || matrixBord[i][view_j].substring(0,matrixBord[i][view_j].length()-2).equals("spitak_taguhi")
                             || matrixBord[i][view_j].substring(0,matrixBord[i][view_j].length()).equals("spitak_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[i][view_j].substring(0,matrixBord[i][view_j].length()-2).equals("spitak_pix")
                             || matrixBord[i][view_j].substring(0,matrixBord[i][view_j].length()-2).equals("spitak_dzi")
                             || matrixBord[i][view_j].substring(0,matrixBord[i][view_j].length()-2).equals("spitak_zinvor")
                             || matrixBord[i][view_j].substring(0,matrixBord[i][view_j].length()).equals("spitak_tagavor")
                             || matrixBord[i][view_j].charAt(1)=='e') {
                         break;
                     }
                 }

                 for (int i=view_i+1; i<=7; i++) {
                     if (matrixBord[i][view_j].substring(0,matrixBord[i][view_j].length()-2).equals("spitak_navak")
                             || matrixBord[i][view_j].substring(0,matrixBord[i][view_j].length()-2).equals("spitak_taguhi")
                             || matrixBord[i][view_j].substring(0,matrixBord[i][view_j].length()).equals("spitak_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[i][view_j].substring(0,matrixBord[i][view_j].length()-2).equals("spitak_pix")
                             || matrixBord[i][view_j].substring(0,matrixBord[i][view_j].length()-2).equals("spitak_dzi")
                             || matrixBord[i][view_j].substring(0,matrixBord[i][view_j].length()-2).equals("spitak_zinvor")
                             || matrixBord[i][view_j].substring(0,matrixBord[i][view_j].length()).equals("spitak_tagavor")
                             || matrixBord[i][view_j].charAt(1)=='e') {
                         break;
                     }
                 }

                 int i=view_i-2;
                 int j=view_j-1;
                 while (i>=0 && j>=0) {
                     if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_pix")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_taguhi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("spitak_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_navak")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_dzi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_zinvor")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("spitak_tagavor")
                             || matrixBord[i][j].charAt(1)=='e') {
                         break;
                     }
                     i--;
                     j--;
                 }

                 i=view_i;
                 j=view_j+1;

                 while (i<=7 && j<=7) {
                     if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_pix")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_taguhi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("spitak_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_navak")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_dzi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_zinvor")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("spitak_tagavor")
                             || matrixBord[i][j].charAt(1)=='e') {
                         break;
                     }
                     i++;
                     j++;
                 }

                 i=view_i-2;
                 j=view_j+1;
                 while (i>=0 && j<=7) {
                     if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_pix")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_taguhi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("spitak_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_navak")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_dzi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_zinvor")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("spitak_tagavor")
                             || matrixBord[i][j].charAt(1)=='e') {
                         break;
                     }
                     i--;
                     j++;
                 }

                 i=view_i;
                 j=view_j-1;
                 while (i<=7 && j>=0) {
                     if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_pix")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_taguhi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("spitak_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_navak")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_dzi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_zinvor")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("spitak_tagavor")
                             || matrixBord[i][j].charAt(1)=='e') {
                         break;
                     }
                     i++;
                     j--;
                 }

                 if (view_i-3>=0 && view_j+1<=7) {
                     if (matrixBord[view_i-3][view_j+1].substring(0,matrixBord[view_i-3][view_j+1].length()-2).equals("spitak_dzi"))
                         harvac_dashtin=false;
                 }
                 if (view_i-3>=0 && view_j-1>=0) {
                     if (matrixBord[view_i-3][view_j-1].substring(0,matrixBord[view_i-3][view_j-1].length()-2).equals("spitak_dzi"))
                         harvac_dashtin=false;
                 }
                 if (view_i-2>=0 && view_j+2<=7) {
                     if (matrixBord[view_i-2][view_j+2].substring(0,matrixBord[view_i-2][view_j+2].length()-2).equals("spitak_dzi"))
                         harvac_dashtin=false;
                 }
                 if (view_i-2>=0 && view_j-2>=0) {
                     if (matrixBord[view_i-2][view_j-2].substring(0,matrixBord[view_i-2][view_j-2].length()-2).equals("spitak_dzi"))
                         harvac_dashtin=false;
                 }
                 if (view_i+1<=7 && view_j+1<=7) {
                     if (matrixBord[view_i+1][view_j+1].substring(0,matrixBord[view_i+1][view_j+1].length()-2).equals("spitak_dzi"))
                         harvac_dashtin=false;
                 }
                 if (view_i+1<=7 && view_j-1>=0) {
                     if (matrixBord[view_i+1][view_j-1].substring(0,matrixBord[view_i+1][view_j-1].length()-2).equals("spitak_dzi"))
                         harvac_dashtin=false;
                 }
                 if (view_i<=7 && view_j+2<=7) {
                     if (matrixBord[view_i][view_j+2].substring(0,matrixBord[view_i][view_j+2].length()-2).equals("spitak_dzi"))
                         harvac_dashtin=false;
                 }
                 if (view_i<=7 && view_j-2>=0) {
                     if (matrixBord[view_i][view_j-2].substring(0,matrixBord[view_i][view_j-2].length()-2).equals("spitak_dzi"))
                         harvac_dashtin=false;
                 }

                 if (view_i-2>=0 && view_j-1>=0) {
                     if (matrixBord[view_i-2][view_j-1].equals("spitak_tagavor"))
                         harvac_dashtin=false;
                 }
                 if (view_i-2>=0) {
                     if (matrixBord[view_i-2][view_j].equals("spitak_tagavor"))
                         harvac_dashtin=false;
                 }
                 if (view_i-2>=0 && view_j+1<=7) {
                     if (matrixBord[view_i-2][view_j+1].equals("spitak_tagavor"))
                         harvac_dashtin=false;
                 }

                 if (view_j-1>=0) {
                     if (matrixBord[view_i][view_j-1].substring(0,matrixBord[view_i][view_j-1].length()-2).equals("spitak_zinvor"))
                         harvac_dashtin=false;
                 }
                 if (view_j+1<=7) {
                     if (matrixBord[view_i][view_j+1].substring(0,matrixBord[view_i][view_j+1].length()-2).equals("spitak_zinvor"))
                         harvac_dashtin=false;
                 }

             }

             if (matrixBord[view_i-1][view_j].equals("datark") && harvac_dashtin==true) {
                 imageRamkaTagavor_1=new ImageView(this);
                 imageRamkaTagavor_1.setImageResource(R.drawable.ramka);
                 params_images = new RelativeLayout.LayoutParams(widthLayoutMatrix / 8, widthLayoutMatrix / 8);
                 params_images.setMargins(leftTagavor - 10,
                         topTagavor - 10-widthLayoutMatrix/8, 0, 0);
                 rLayout.addView(imageRamkaTagavor_1, params_images);
                 imageClicked = imageName;
                 clickedRamkaTagavor_1 = "1";
                 imageRamkaTagavor_1.setId(R.id.ramka_Tagavor_1);
                 imageRamkaTagavor_1.setOnClickListener(this);
             }
             else if (matrixBord[view_i-1][view_j].charAt(1)=='e' && sev_spitak==true && harvac_dashtin==true) {
                 imageRamkaTagavor_1=new ImageView(this);
                 imageRamkaTagavor_1.setImageResource(R.drawable.ramka);
                 params_images = new RelativeLayout.LayoutParams(widthLayoutMatrix / 8, widthLayoutMatrix / 8);
                 params_images.setMargins(leftTagavor - 10,
                         topTagavor - 10-widthLayoutMatrix/8, 0, 0);
                 rLayout.addView(imageRamkaTagavor_1, params_images);
                 imageClicked = imageName;
                 clickedRamkaTagavor_1 = "1";
                 oponentTagavorString_1=matrixBord[view_i-1][view_j];
                 imageRamkaTagavor_1.setId(R.id.ramka_Tagavor_1);
                 imageRamkaTagavor_1.setOnClickListener(this);
             }
             else if (matrixBord[view_i-1][view_j].charAt(1)=='p' && sev_spitak==false && harvac_dashtin==true) {
                 imageRamkaTagavor_1=new ImageView(this);
                 imageRamkaTagavor_1.setImageResource(R.drawable.ramka);
                 params_images = new RelativeLayout.LayoutParams(widthLayoutMatrix / 8, widthLayoutMatrix / 8);
                 params_images.setMargins(leftTagavor - 10,
                         topTagavor - 10-widthLayoutMatrix/8, 0, 0);
                 rLayout.addView(imageRamkaTagavor_1, params_images);
                 imageClicked = imageName;
                 clickedRamkaTagavor_1 = "1";
                 oponentTagavorString_1=matrixBord[view_i-1][view_j];
                 imageRamkaTagavor_1.setId(R.id.ramka_Tagavor_1);
                 imageRamkaTagavor_1.setOnClickListener(this);
             }

         }

         harvac_dashtin=true;

         if (view_i-1>=0 && view_j+1<=7) {

             if (sev_spitak==true) {
                 for (int i = view_j; i >= 0; i--) {
                     if (matrixBord[view_i - 1][i].substring(0,matrixBord[view_i - 1][i].length()-2).equals("sev_navak")
                             || matrixBord[view_i - 1][i].substring(0,matrixBord[view_i - 1][i].length()-2).equals("sev_taguhi")
                             || matrixBord[view_i - 1][i].substring(0,matrixBord[view_i - 1][i].length()).equals("sev_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[view_i - 1][i].substring(0,matrixBord[view_i - 1][i].length()-2).equals("sev_pix")
                             || matrixBord[view_i - 1][i].substring(0,matrixBord[view_i - 1][i].length()-2).equals("sev_dzi")
                             || matrixBord[view_i - 1][i].substring(0,matrixBord[view_i - 1][i].length()-2).equals("sev_zinvor")
                             || matrixBord[view_i - 1][i].substring(0,matrixBord[view_i - 1][i].length()).equals("sev_tagavor")
                             || matrixBord[view_i - 1][i].charAt(1)=='p') {
                         break;
                     }
                 }

                 for (int i=view_j+2; i<8; i++) {
                     if (matrixBord[view_i - 1][i].substring(0,matrixBord[view_i - 1][i].length()-2).equals("sev_navak")
                             || matrixBord[view_i - 1][i].substring(0,matrixBord[view_i - 1][i].length()-2).equals("sev_taguhi")
                             || matrixBord[view_i - 1][i].substring(0,matrixBord[view_i - 1][i].length()).equals("sev_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[view_i - 1][i].substring(0,matrixBord[view_i - 1][i].length()-2).equals("sev_pix")
                             || matrixBord[view_i - 1][i].substring(0,matrixBord[view_i - 1][i].length()-2).equals("sev_dzi")
                             || matrixBord[view_i - 1][i].substring(0,matrixBord[view_i - 1][i].length()-2).equals("sev_zinvor")
                             || matrixBord[view_i - 1][i].substring(0,matrixBord[view_i - 1][i].length()).equals("sev_tagavor")
                             || matrixBord[view_i - 1][i].charAt(1)=='p') {
                         break;
                     }
                 }

                 for (int i=view_i-2; i>=0; i--) {
                     if (matrixBord[i][view_j+1].substring(0,matrixBord[i][view_j+1].length()-2).equals("sev_navak")
                             || matrixBord[i][view_j+1].substring(0,matrixBord[i][view_j+1].length()-2).equals("sev_taguhi")
                             || matrixBord[i][view_j+1].substring(0,matrixBord[i][view_j+1].length()).equals("sev_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[i][view_j+1].substring(0,matrixBord[i][view_j+1].length()-2).equals("sev_pix")
                             || matrixBord[i][view_j+1].substring(0,matrixBord[i][view_j+1].length()-2).equals("sev_dzi")
                             || matrixBord[i][view_j+1].substring(0,matrixBord[i][view_j+1].length()-2).equals("sev_zinvor")
                             || matrixBord[i][view_j+1].substring(0,matrixBord[i][view_j+1].length()).equals("sev_tagavor")
                             || matrixBord[i][view_j+1].charAt(1)=='p') {
                         break;
                     }
                 }
                 for (int i=view_i; i<=7; i++) {
                     if (matrixBord[i][view_j+1].substring(0,matrixBord[i][view_j+1].length()-2).equals("sev_navak")
                             || matrixBord[i][view_j+1].substring(0,matrixBord[i][view_j+1].length()-2).equals("sev_taguhi")
                             || matrixBord[i][view_j+1].substring(0,matrixBord[i][view_j+1].length()).equals("sev_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[i][view_j+1].substring(0,matrixBord[i][view_j+1].length()-2).equals("sev_pix")
                             || matrixBord[i][view_j+1].substring(0,matrixBord[i][view_j+1].length()-2).equals("sev_dzi")
                             || matrixBord[i][view_j+1].substring(0,matrixBord[i][view_j+1].length()-2).equals("sev_zinvor")
                             || matrixBord[i][view_j+1].substring(0,matrixBord[i][view_j+1].length()).equals("sev_tagavor")
                             || matrixBord[i][view_j+1].charAt(1)=='p') {
                         break;
                     }
                 }

                 int i=view_i-2;
                 int j=view_j;
                 while (i>=0 && j>=0) {
                     if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_pix")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_taguhi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("sev_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_navak")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_dzi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_zinvor")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("sev_tagavor")
                             || matrixBord[i][j].charAt(1)=='p') {
                         break;
                     }
                     i--;
                     j--;
                 }

                 i=view_i;
                 j=view_j+2;

                 while (i<=7 && j<=7) {
                     if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_pix")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_taguhi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("sev_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_navak")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_dzi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_zinvor")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("sev_tagavor")
                             || matrixBord[i][j].charAt(1)=='p') {
                         break;
                     }
                     i++;
                     j++;
                 }

                 i=view_i-2;
                 j=view_j+2;
                 while (i>=0 && j<=7) {
                     if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_pix")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_taguhi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("sev_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_navak")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_dzi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_zinvor")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("sev_tagavor")
                             || matrixBord[i][j].charAt(1)=='p') {
                         break;
                     }
                     i--;
                     j++;
                 }

                 i=view_i+1;
                 j=view_j-1;
                 while (i<=7 && j>=0) {
                     if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_pix")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_taguhi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("sev_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_navak")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_dzi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_zinvor")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("sev_tagavor")
                             || matrixBord[i][j].charAt(1)=='p') {
                         break;
                     }
                     i++;
                     j--;
                 }

                 if (view_i-3>=0 && view_j+2<=7) {
                     if (matrixBord[view_i-3][view_j+2].substring(0,matrixBord[view_i-3][view_j+2].length()-2).equals("sev_dzi"))
                         harvac_dashtin=false;
                 }
                 if (view_i-3>=0 && view_j>=0) {
                     if (matrixBord[view_i-3][view_j].substring(0,matrixBord[view_i-3][view_j].length()-2).equals("sev_dzi"))
                         harvac_dashtin=false;
                 }
                 if (view_i-2>=0 && view_j+3<=7) {
                     if (matrixBord[view_i-2][view_j+3].substring(0,matrixBord[view_i-2][view_j+3].length()-2).equals("sev_dzi"))
                         harvac_dashtin=false;
                 }
                 if (view_i-2>=0 && view_j-1>=0) {
                     if (matrixBord[view_i-2][view_j-1].substring(0,matrixBord[view_i-2][view_j-1].length()-2).equals("sev_dzi"))
                         harvac_dashtin=false;
                 }
                 if (view_i+1<=7 && view_j+2<=7) {
                     if (matrixBord[view_i+1][view_j+2].substring(0,matrixBord[view_i+1][view_j+2].length()-2).equals("sev_dzi"))
                         harvac_dashtin=false;
                 }
                 if (view_i+1<=7 && view_j>=0) {
                     if (matrixBord[view_i+1][view_j].substring(0,matrixBord[view_i+1][view_j].length()-2).equals("sev_dzi"))
                         harvac_dashtin=false;
                 }
                 if (view_i<=7 && view_j+3<=7) {
                     if (matrixBord[view_i][view_j+3].substring(0,matrixBord[view_i][view_j+3].length()-2).equals("sev_dzi"))
                         harvac_dashtin=false;
                 }
                 if (view_i<=7 && view_j-1>=0) {
                     if (matrixBord[view_i][view_j-1].substring(0,matrixBord[view_i][view_j-1].length()-2).equals("sev_dzi"))
                         harvac_dashtin=false;
                 }

                 if (view_i-2>=0 && view_j>=0) {
                     if (matrixBord[view_i-2][view_j].equals("sev_tagavor"))
                         harvac_dashtin=false;
                 }
                 if (view_i-2>=0) {
                     if (matrixBord[view_i-2][view_j+1].equals("sev_tagavor"))
                         harvac_dashtin=false;
                 }
                 if (view_i-2>=0 && view_j+2<=7) {
                     if (matrixBord[view_i-2][view_j+2].equals("sev_tagavor"))
                         harvac_dashtin=false;
                 }
                 if (view_i-1>=0 && view_j+2<=7) {
                     if (matrixBord[view_i-1][view_j+2].equals("sev_tagavor"))
                         harvac_dashtin=false;
                 }
                 if (view_i>=0 && view_j+2<=7) {
                     if (matrixBord[view_i][view_j+2].equals("sev_tagavor"))
                         harvac_dashtin=false;
                 }




                 if (view_i-2>=0 && view_j>=0) {
                     if (matrixBord[view_i-2][view_j].substring(0,matrixBord[view_i-2][view_j].length()-2).equals("sev_zinvor"))
                         harvac_dashtin=false;
                 }
                 if (view_i-2>=0 && view_j+2<=7) {
                     if (matrixBord[view_i-2][view_j+2].substring(0,matrixBord[view_i-2][view_j+2].length()-2).equals("sev_zinvor"))
                         harvac_dashtin=false;
                 }



             }
             else  {

                 for (int i = view_j; i >= 0; i--) {
                     if (matrixBord[view_i - 1][i].substring(0,matrixBord[view_i - 1][i].length()-2).equals("spitak_navak")
                             || matrixBord[view_i - 1][i].substring(0,matrixBord[view_i - 1][i].length()-2).equals("spitak_taguhi")
                             || matrixBord[view_i - 1][i].substring(0,matrixBord[view_i - 1][i].length()).equals("spitak_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[view_i - 1][i].substring(0,matrixBord[view_i - 1][i].length()-2).equals("spitak_pix")
                             || matrixBord[view_i - 1][i].substring(0,matrixBord[view_i - 1][i].length()-2).equals("spitak_dzi")
                             || matrixBord[view_i - 1][i].substring(0,matrixBord[view_i - 1][i].length()-2).equals("spitak_zinvor")
                             || matrixBord[view_i - 1][i].substring(0,matrixBord[view_i - 1][i].length()).equals("spitak_tagavor")
                             || matrixBord[view_i - 1][i].charAt(1)=='e') {
                         break;
                     }
                 }

                 for (int i=view_j+2; i<8; i++) {
                     if (matrixBord[view_i - 1][i].substring(0,matrixBord[view_i - 1][i].length()-2).equals("spitak_navak")
                             || matrixBord[view_i - 1][i].substring(0,matrixBord[view_i - 1][i].length()-2).equals("spitak_taguhi")
                             || matrixBord[view_i - 1][i].substring(0,matrixBord[view_i - 1][i].length()).equals("spitak_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[view_i - 1][i].substring(0,matrixBord[view_i - 1][i].length()-2).equals("spitak_pix")
                             || matrixBord[view_i - 1][i].substring(0,matrixBord[view_i - 1][i].length()-2).equals("spitak_dzi")
                             || matrixBord[view_i - 1][i].substring(0,matrixBord[view_i - 1][i].length()-2).equals("spitak_zinvor")
                             || matrixBord[view_i - 1][i].substring(0,matrixBord[view_i - 1][i].length()).equals("spitak_tagavor")
                             || matrixBord[view_i - 1][i].charAt(1)=='e') {
                         break;
                     }
                 }

                 for (int i=view_i-2; i>=0; i--) {
                     if (matrixBord[i][view_j+1].substring(0,matrixBord[i][view_j+1].length()-2).equals("spitak_navak")
                             || matrixBord[i][view_j+1].substring(0,matrixBord[i][view_j+1].length()-2).equals("spitak_taguhi")
                             || matrixBord[i][view_j+1].substring(0,matrixBord[i][view_j+1].length()).equals("spitak_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[i][view_j+1].substring(0,matrixBord[i][view_j+1].length()-2).equals("spitak_pix")
                             || matrixBord[i][view_j+1].substring(0,matrixBord[i][view_j+1].length()-2).equals("spitak_dzi")
                             || matrixBord[i][view_j+1].substring(0,matrixBord[i][view_j+1].length()-2).equals("spitak_zinvor")
                             || matrixBord[i][view_j+1].substring(0,matrixBord[i][view_j+1].length()).equals("spitak_tagavor")
                             || matrixBord[i][view_j+1].charAt(1)=='e') {
                         break;
                     }
                 }
                 for (int i=view_i; i<=7; i++) {
                     if (matrixBord[i][view_j+1].substring(0,matrixBord[i][view_j+1].length()-2).equals("spitak_navak")
                             || matrixBord[i][view_j+1].substring(0,matrixBord[i][view_j+1].length()-2).equals("spitak_taguhi")
                             || matrixBord[i][view_j+1].substring(0,matrixBord[i][view_j+1].length()).equals("spitak_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[i][view_j+1].substring(0,matrixBord[i][view_j+1].length()-2).equals("spitak_pix")
                             || matrixBord[i][view_j+1].substring(0,matrixBord[i][view_j+1].length()-2).equals("spitak_dzi")
                             || matrixBord[i][view_j+1].substring(0,matrixBord[i][view_j+1].length()-2).equals("spitak_zinvor")
                             || matrixBord[i][view_j+1].substring(0,matrixBord[i][view_j+1].length()).equals("spitak_tagavor")
                             || matrixBord[i][view_j+1].charAt(1)=='e') {
                         break;
                     }
                 }


                 int i=view_i-2;
                 int j=view_j;
                 while (i>=0 && j>=0) {
                     if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_pix")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_taguhi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("spitak_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_navak")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_dzi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_zinvor")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("spitak_tagavor")
                             || matrixBord[i][j].charAt(1)=='e') {
                         break;
                     }
                     i--;
                     j--;
                 }

                 i=view_i;
                 j=view_j+2;

                 while (i<=7 && j<=7) {
                     if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_pix")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_taguhi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("spitak_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_navak")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_dzi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_zinvor")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("spitak_tagavor")
                             || matrixBord[i][j].charAt(1)=='e') {
                         break;
                     }
                     i++;
                     j++;
                 }

                 i=view_i-2;
                 j=view_j+2;
                 while (i>=0 && j<=7) {
                     if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_pix")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_taguhi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("spitak_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_navak")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_dzi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_zinvor")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("spitak_tagavor")
                             || matrixBord[i][j].charAt(1)=='e') {
                         break;
                     }
                     i--;
                     j++;
                 }

                 i=view_i+1;
                 j=view_j-1;
                 while (i<=7 && j>=0) {
                     if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_pix")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_taguhi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("spitak_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_navak")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_dzi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_zinvor")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("spitak_tagavor")
                             || matrixBord[i][j].charAt(1)=='e') {
                         break;
                     }
                     i++;
                     j--;
                 }

                 if (view_i-3>=0 && view_j+2<=7) {
                     if (matrixBord[view_i-3][view_j+2].substring(0,matrixBord[view_i-3][view_j+2].length()-2).equals("spitak_dzi"))
                         harvac_dashtin=false;
                 }
                 if (view_i-3>=0 && view_j>=0) {
                     if (matrixBord[view_i-3][view_j].substring(0,matrixBord[view_i-3][view_j].length()-2).equals("spitak_dzi"))
                         harvac_dashtin=false;
                 }
                 if (view_i-2>=0 && view_j+3<=7) {
                     if (matrixBord[view_i-2][view_j+3].substring(0,matrixBord[view_i-2][view_j+3].length()-2).equals("spitak_dzi"))
                         harvac_dashtin=false;
                 }
                 if (view_i-2>=0 && view_j-1>=0) {
                     if (matrixBord[view_i-2][view_j-1].substring(0,matrixBord[view_i-2][view_j-1].length()-2).equals("spitak_dzi"))
                         harvac_dashtin=false;
                 }
                 if (view_i+1<=7 && view_j+2<=7) {
                     if (matrixBord[view_i+1][view_j+2].substring(0,matrixBord[view_i+1][view_j+2].length()-2).equals("spitak_dzi"))
                         harvac_dashtin=false;
                 }
                 if (view_i+1<=7 && view_j>=0) {
                     if (matrixBord[view_i+1][view_j].substring(0,matrixBord[view_i+1][view_j].length()-2).equals("spitak_dzi"))
                         harvac_dashtin=false;
                 }
                 if (view_i<=7 && view_j+3<=7) {
                     if (matrixBord[view_i][view_j+3].substring(0,matrixBord[view_i][view_j+3].length()-2).equals("spitak_dzi"))
                         harvac_dashtin=false;
                 }
                 if (view_i<=7 && view_j-1>=0) {
                     if (matrixBord[view_i][view_j-1].substring(0,matrixBord[view_i][view_j-1].length()-2).equals("spitak_dzi"))
                         harvac_dashtin=false;
                 }

                 if (view_i-2>=0 && view_j>=0) {
                     if (matrixBord[view_i-2][view_j].equals("spitak_tagavor"))
                         harvac_dashtin=false;
                 }
                 if (view_i-2>=0) {
                     if (matrixBord[view_i-2][view_j+1].equals("spitak_tagavor"))
                         harvac_dashtin=false;
                 }
                 if (view_i-2>=0 && view_j+2<=7) {
                     if (matrixBord[view_i-2][view_j+2].equals("spitak_tagavor"))
                         harvac_dashtin=false;
                 }
                 if (view_i-1>=0 && view_j+2<=7) {
                     if (matrixBord[view_i-1][view_j+2].equals("spitak_tagavor"))
                         harvac_dashtin=false;
                 }
                 if (view_i>=0 && view_j+2<=7) {
                     if (matrixBord[view_i][view_j+2].equals("spitak_tagavor"))
                         harvac_dashtin=false;
                 }


                 if (view_j+2<=7) {
                     if (matrixBord[view_i][view_j+2].substring(0,matrixBord[view_i][view_j+2].length()-2).equals("spitak_zinvor"))
                         harvac_dashtin=false;
                 }

             }

             if (matrixBord[view_i-1][view_j+1].equals("datark") && harvac_dashtin==true) {
                 imageRamkaTagavor_2=new ImageView(this);
                 imageRamkaTagavor_2.setImageResource(R.drawable.ramka);
                 params_images = new RelativeLayout.LayoutParams(widthLayoutMatrix / 8, widthLayoutMatrix / 8);
                 params_images.setMargins(leftTagavor - 10+widthLayoutMatrix/8,
                         topTagavor - 10-widthLayoutMatrix/8, 0, 0);
                 rLayout.addView(imageRamkaTagavor_2, params_images);
                 imageClicked = imageName;
                 clickedRamkaTagavor_2 = "1";
                 imageRamkaTagavor_2.setId(R.id.ramka_Tagavor_2);
                 imageRamkaTagavor_2.setOnClickListener(this);
             }
             else if (matrixBord[view_i-1][view_j+1].charAt(1)=='e' && sev_spitak==true && harvac_dashtin==true) {
                 imageRamkaTagavor_2=new ImageView(this);
                 imageRamkaTagavor_2.setImageResource(R.drawable.ramka);
                 params_images = new RelativeLayout.LayoutParams(widthLayoutMatrix / 8, widthLayoutMatrix / 8);
                 params_images.setMargins(leftTagavor - 10+widthLayoutMatrix/8,
                         topTagavor - 10-widthLayoutMatrix/8, 0, 0);
                 rLayout.addView(imageRamkaTagavor_2, params_images);
                 imageClicked = imageName;
                 clickedRamkaTagavor_2 = "1";
                 oponentTagavorString_2=matrixBord[view_i-1][view_j+1];
                 imageRamkaTagavor_2.setId(R.id.ramka_Tagavor_2);
                 imageRamkaTagavor_2.setOnClickListener(this);
             }
             else if (matrixBord[view_i-1][view_j+1].charAt(1)=='p' && sev_spitak==false && harvac_dashtin==true) {
                 imageRamkaTagavor_2=new ImageView(this);
                 imageRamkaTagavor_2.setImageResource(R.drawable.ramka);
                 params_images = new RelativeLayout.LayoutParams(widthLayoutMatrix / 8, widthLayoutMatrix / 8);
                 params_images.setMargins(leftTagavor - 10+widthLayoutMatrix/8,
                         topTagavor - 10-widthLayoutMatrix/8, 0, 0);
                 rLayout.addView(imageRamkaTagavor_2, params_images);
                 imageClicked = imageName;
                 clickedRamkaTagavor_2 = "1";
                 oponentTagavorString_2=matrixBord[view_i-1][view_j+1];
                 imageRamkaTagavor_2.setId(R.id.ramka_Tagavor_2);
                 imageRamkaTagavor_2.setOnClickListener(this);
             }

         }

                 harvac_dashtin=true;

         if (view_j+1<=7) {

             if (sev_spitak==true) {
                 for (int i = view_j-1; i >= 0; i--) {
                     if (matrixBord[view_i][i].substring(0,matrixBord[view_i][i].length()-2).equals("sev_navak")
                             || matrixBord[view_i][i].substring(0,matrixBord[view_i][i].length()-2).equals("sev_taguhi")
                             || matrixBord[view_i][i].substring(0,matrixBord[view_i][i].length()).equals("sev_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[view_i][i].substring(0,matrixBord[view_i][i].length()-2).equals("sev_pix")
                             || matrixBord[view_i][i].substring(0,matrixBord[view_i][i].length()-2).equals("sev_dzi")
                             || matrixBord[view_i][i].substring(0,matrixBord[view_i][i].length()-2).equals("sev_zinvor")
                             || matrixBord[view_i][i].substring(0,matrixBord[view_i][i].length()).equals("sev_tagavor")
                             || matrixBord[view_i][i].charAt(1)=='p') {
                         break;
                     }
                 }

                 for (int i=view_j+2; i<8; i++) {
                     if (matrixBord[view_i][i].substring(0,matrixBord[view_i][i].length()-2).equals("sev_navak")
                             || matrixBord[view_i][i].substring(0,matrixBord[view_i][i].length()-2).equals("sev_taguhi")
                             || matrixBord[view_i][i].substring(0,matrixBord[view_i][i].length()).equals("sev_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[view_i][i].substring(0,matrixBord[view_i][i].length()-2).equals("sev_pix")
                             || matrixBord[view_i][i].substring(0,matrixBord[view_i][i].length()-2).equals("sev_dzi")
                             || matrixBord[view_i][i].substring(0,matrixBord[view_i][i].length()-2).equals("sev_zinvor")
                             || matrixBord[view_i][i].substring(0,matrixBord[view_i][i].length()).equals("sev_tagavor")
                             || matrixBord[view_i][i].charAt(1)=='p') {
                         break;
                     }
                 }

                 for (int i=view_i-1; i>=0; i--) {
                     if (matrixBord[i][view_j+1].substring(0,matrixBord[i][view_j+1].length()-2).equals("sev_navak")
                             || matrixBord[i][view_j+1].substring(0,matrixBord[i][view_j+1].length()-2).equals("sev_taguhi")
                             || matrixBord[i][view_j+1].substring(0,matrixBord[i][view_j+1].length()).equals("sev_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[i][view_j+1].substring(0,matrixBord[i][view_j+1].length()-2).equals("sev_pix")
                             || matrixBord[i][view_j+1].substring(0,matrixBord[i][view_j+1].length()-2).equals("sev_dzi")
                             || matrixBord[i][view_j+1].substring(0,matrixBord[i][view_j+1].length()-2).equals("sev_zinvor")
                             || matrixBord[i][view_j+1].substring(0,matrixBord[i][view_j+1].length()).equals("sev_tagavor")
                             || matrixBord[i][view_j+1].charAt(1)=='p') {
                         break;
                     }
                 }
                 for (int i=view_i+1; i<=7; i++) {
                     if (matrixBord[i][view_j+1].substring(0,matrixBord[i][view_j+1].length()-2).equals("sev_navak")
                             || matrixBord[i][view_j+1].substring(0,matrixBord[i][view_j+1].length()-2).equals("sev_taguhi")
                             || matrixBord[i][view_j+1].substring(0,matrixBord[i][view_j+1].length()).equals("sev_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[i][view_j+1].substring(0,matrixBord[i][view_j+1].length()-2).equals("sev_pix")
                             || matrixBord[i][view_j+1].substring(0,matrixBord[i][view_j+1].length()-2).equals("sev_dzi")
                             || matrixBord[i][view_j+1].substring(0,matrixBord[i][view_j+1].length()-2).equals("sev_zinvor")
                             || matrixBord[i][view_j+1].substring(0,matrixBord[i][view_j+1].length()).equals("sev_tagavor")
                             || matrixBord[i][view_j+1].charAt(1)=='p') {
                         break;
                     }
                 }

                 int i=view_i-1;
                 int j=view_j;
                 while (i>=0 && j>=0) {
                     if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_pix")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_taguhi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("sev_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_navak")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_dzi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_zinvor")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("sev_tagavor")
                             || matrixBord[i][j].charAt(1)=='p') {
                         break;
                     }
                     i--;
                     j--;
                 }

                 i=view_i+1;
                 j=view_j+2;

                 while (i<=7 && j<=7) {
                     if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_pix")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_taguhi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("sev_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_navak")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_dzi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_zinvor")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("sev_tagavor")
                             || matrixBord[i][j].charAt(1)=='p') {
                         break;
                     }
                     i++;
                     j++;
                 }

                 i=view_i-1;
                 j=view_j+2;
                 while (i>=0 && j<=7) {
                     if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_pix")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_taguhi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("sev_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_navak")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_dzi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_zinvor")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("sev_tagavor")
                             || matrixBord[i][j].charAt(1)=='p') {
                         break;
                     }
                     i--;
                     j++;
                 }

                 i=view_i+1;
                 j=view_j;
                 while (i<=7 && j>=0) {
                     if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_pix")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_taguhi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("sev_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_navak")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_dzi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_zinvor")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("sev_tagavor")
                             || matrixBord[i][j].charAt(1)=='p') {
                         break;
                     }
                     i++;
                     j--;
                 }

                 if (view_i-2>=0 && view_j+2<=7) {
                     if (matrixBord[view_i-2][view_j+2].substring(0,matrixBord[view_i-2][view_j+2].length()-2).equals("sev_dzi"))
                         harvac_dashtin=false;
                 }
                 if (view_i-2>=0 && view_j>=0) {
                     if (matrixBord[view_i-2][view_j].substring(0,matrixBord[view_i-2][view_j].length()-2).equals("sev_dzi"))
                         harvac_dashtin=false;
                 }
                 if (view_i-1>=0 && view_j+3<=7) {
                     if (matrixBord[view_i-1][view_j+3].substring(0,matrixBord[view_i-1][view_j+3].length()-2).equals("sev_dzi"))
                         harvac_dashtin=false;
                 }
                 if (view_i-1>=0 && view_j-1>=0) {
                     if (matrixBord[view_i-1][view_j-1].substring(0,matrixBord[view_i-1][view_j-1].length()-2).equals("sev_dzi"))
                         harvac_dashtin=false;
                 }
                 if (view_i+2<=7 && view_j+2<=7) {
                     if (matrixBord[view_i+2][view_j+2].substring(0,matrixBord[view_i+2][view_j+2].length()-2).equals("sev_dzi"))
                         harvac_dashtin=false;
                 }
                 if (view_i+2<=7 && view_j>=0) {
                     if (matrixBord[view_i+2][view_j].substring(0,matrixBord[view_i+2][view_j].length()-2).equals("sev_dzi"))
                         harvac_dashtin=false;
                 }
                 if (view_i+1<=7 && view_j+3<=7) {
                     if (matrixBord[view_i+1][view_j+3].substring(0,matrixBord[view_i+1][view_j+3].length()-2).equals("sev_dzi"))
                         harvac_dashtin=false;
                 }
                 if (view_i+1<=7 && view_j-1>=0) {
                     if (matrixBord[view_i+1][view_j-1].substring(0,matrixBord[view_i+1][view_j-1].length()-2).equals("sev_dzi"))
                         harvac_dashtin=false;
                 }

                 if (view_i-1>=0 && view_j+2<=7) {
                     if (matrixBord[view_i-1][view_j+2].equals("sev_tagavor"))
                         harvac_dashtin=false;
                 }
                 if (view_i>=0 && view_j+2<=7) {
                     if (matrixBord[view_i][view_j+2].equals("sev_tagavor"))
                         harvac_dashtin=false;
                 }
                 if (view_i+1<=7 && view_j+2<=7) {
                     if (matrixBord[view_i+1][view_j+2].equals("sev_tagavor"))
                         harvac_dashtin=false;
                 }

                 if (view_i-1>=0 && view_j>=0) {
                     if (matrixBord[view_i-1][view_j].substring(0,matrixBord[view_i-1][view_j].length()-2).equals("sev_zinvor"))
                         harvac_dashtin=false;
                 }
                 if (view_i-1>=0 && view_j+2<=7) {
                     if (matrixBord[view_i-1][view_j+2].substring(0,matrixBord[view_i-1][view_j+2].length()-2).equals("sev_zinvor"))
                         harvac_dashtin=false;
                 }

             }
             else  {

                 for (int i = view_j-1; i >= 0; i--) {
                     if (matrixBord[view_i][i].substring(0,matrixBord[view_i][i].length()-2).equals("spitak_navak")
                             || matrixBord[view_i][i].substring(0,matrixBord[view_i][i].length()-2).equals("spitak_taguhi")
                             || matrixBord[view_i][i].substring(0,matrixBord[view_i][i].length()).equals("spitak_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[view_i][i].substring(0,matrixBord[view_i][i].length()-2).equals("spitak_pix")
                             || matrixBord[view_i][i].substring(0,matrixBord[view_i][i].length()-2).equals("spitak_dzi")
                             || matrixBord[view_i][i].substring(0,matrixBord[view_i][i].length()-2).equals("spitak_zinvor")
                             || matrixBord[view_i][i].substring(0,matrixBord[view_i][i].length()).equals("spitak_tagavor")
                             || matrixBord[view_i][i].charAt(1)=='e') {
                         break;
                     }
                 }

                 for (int i=view_j+2; i<8; i++) {
                     if (matrixBord[view_i][i].substring(0,matrixBord[view_i][i].length()-2).equals("spitak_navak")
                             || matrixBord[view_i][i].substring(0,matrixBord[view_i][i].length()-2).equals("spitak_taguhi")
                             || matrixBord[view_i][i].substring(0,matrixBord[view_i][i].length()).equals("spitak_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[view_i][i].substring(0,matrixBord[view_i][i].length()-2).equals("spitak_pix")
                             || matrixBord[view_i][i].substring(0,matrixBord[view_i][i].length()-2).equals("spitak_dzi")
                             || matrixBord[view_i][i].substring(0,matrixBord[view_i][i].length()-2).equals("spitak_zinvor")
                             || matrixBord[view_i][i].substring(0,matrixBord[view_i][i].length()).equals("spitak_tagavor")
                             || matrixBord[view_i][i].charAt(1)=='e') {
                         break;
                     }
                 }

                 for (int i=view_i-1; i>=0; i--) {
                     if (matrixBord[i][view_j+1].substring(0,matrixBord[i][view_j+1].length()-2).equals("spitak_navak")
                             || matrixBord[i][view_j+1].substring(0,matrixBord[i][view_j+1].length()-2).equals("spitak_taguhi")
                             || matrixBord[i][view_j+1].substring(0,matrixBord[i][view_j+1].length()).equals("spitak_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[i][view_j+1].substring(0,matrixBord[i][view_j+1].length()-2).equals("spitak_pix")
                             || matrixBord[i][view_j+1].substring(0,matrixBord[i][view_j+1].length()-2).equals("spitak_dzi")
                             || matrixBord[i][view_j+1].substring(0,matrixBord[i][view_j+1].length()-2).equals("spitak_zinvor")
                             || matrixBord[i][view_j+1].substring(0,matrixBord[i][view_j+1].length()).equals("spitak_tagavor")
                             || matrixBord[i][view_j+1].charAt(1)=='e') {
                         break;
                     }
                 }
                 for (int i=view_i+1; i<=7; i++) {
                     if (matrixBord[i][view_j+1].substring(0,matrixBord[i][view_j+1].length()-2).equals("spitak_navak")
                             || matrixBord[i][view_j+1].substring(0,matrixBord[i][view_j+1].length()-2).equals("spitak_taguhi")
                             || matrixBord[i][view_j+1].substring(0,matrixBord[i][view_j+1].length()).equals("spitak_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[i][view_j+1].substring(0,matrixBord[i][view_j+1].length()-2).equals("spitak_pix")
                             || matrixBord[i][view_j+1].substring(0,matrixBord[i][view_j+1].length()-2).equals("spitak_dzi")
                             || matrixBord[i][view_j+1].substring(0,matrixBord[i][view_j+1].length()-2).equals("spitak_zinvor")
                             || matrixBord[i][view_j+1].substring(0,matrixBord[i][view_j+1].length()).equals("spitak_tagavor")
                             || matrixBord[i][view_j+1].charAt(1)=='e') {
                         break;
                     }
                 }


                 int i=view_i-1;
                 int j=view_j;
                 while (i>=0 && j>=0) {
                     if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_pix")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_taguhi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("spitak_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_navak")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_dzi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_zinvor")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("spitak_tagavor")
                             || matrixBord[i][j].charAt(1)=='e') {
                         break;
                     }
                     i--;
                     j--;
                 }

                 i=view_i+1;
                 j=view_j+2;

                 while (i<=7 && j<=7) {
                     if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_pix")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_taguhi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("spitak_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_navak")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_dzi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_zinvor")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("spitak_tagavor")
                             || matrixBord[i][j].charAt(1)=='e') {
                         break;
                     }
                     i++;
                     j++;
                 }

                 i=view_i-1;
                 j=view_j+2;
                 while (i>=0 && j<=7) {
                     if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_pix")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_taguhi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("spitak_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_navak")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_dzi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_zinvor")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("spitak_tagavor")
                             || matrixBord[i][j].charAt(1)=='e') {
                         break;
                     }
                     i--;
                     j++;
                 }

                 i=view_i+1;
                 j=view_j;
                 while (i<=7 && j>=0) {
                     if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_pix")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_taguhi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("spitak_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_navak")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_dzi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_zinvor")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("spitak_tagavor")
                             || matrixBord[i][j].charAt(1)=='e') {
                         break;
                     }
                     i++;
                     j--;
                 }

                 if (view_i-2>=0 && view_j+2<=7) {
                     if (matrixBord[view_i-2][view_j+2].substring(0,matrixBord[view_i-2][view_j+2].length()-2).equals("spitak_dzi"))
                         harvac_dashtin=false;
                 }
                 if (view_i-2>=0 && view_j>=0) {
                     if (matrixBord[view_i-2][view_j].substring(0,matrixBord[view_i-2][view_j].length()-2).equals("spitak_dzi"))
                         harvac_dashtin=false;
                 }
                 if (view_i-1>=0 && view_j+3<=7) {
                     if (matrixBord[view_i-1][view_j+3].substring(0,matrixBord[view_i-1][view_j+3].length()-2).equals("spitak_dzi"))
                         harvac_dashtin=false;
                 }
                 if (view_i-1>=0 && view_j-1>=0) {
                     if (matrixBord[view_i-1][view_j-1].substring(0,matrixBord[view_i-1][view_j-1].length()-2).equals("spitak_dzi"))
                         harvac_dashtin=false;
                 }
                 if (view_i+2<=7 && view_j+2<=7) {
                     if (matrixBord[view_i+2][view_j+2].substring(0,matrixBord[view_i+2][view_j+2].length()-2).equals("spitak_dzi"))
                         harvac_dashtin=false;
                 }
                 if (view_i+2<=7 && view_j>=0) {
                     if (matrixBord[view_i+2][view_j].substring(0,matrixBord[view_i+2][view_j].length()-2).equals("spitak_dzi"))
                         harvac_dashtin=false;
                 }
                 if (view_i+1<=7 && view_j+3<=7) {
                     if (matrixBord[view_i+1][view_j+3].substring(0,matrixBord[view_i+1][view_j+3].length()-2).equals("spitak_dzi"))
                         harvac_dashtin=false;
                 }
                 if (view_i+1<=7 && view_j-1>=0) {
                     if (matrixBord[view_i+1][view_j-1].substring(0,matrixBord[view_i+1][view_j-1].length()-2).equals("spitak_dzi"))
                         harvac_dashtin=false;
                 }

                 if (view_i-1>=0 && view_j+2<=7) {
                     if (matrixBord[view_i-1][view_j+2].equals("spitak_tagavor"))
                         harvac_dashtin=false;
                 }
                 if (view_i>=0 && view_j+2<=7) {
                     if (matrixBord[view_i][view_j+2].equals("spitak_tagavor"))
                         harvac_dashtin=false;
                 }
                 if (view_i+1<=7 && view_j+2<=7) {
                     if (matrixBord[view_i+1][view_j+2].equals("spitak_tagavor"))
                         harvac_dashtin=false;
                 }

                 if (view_i+1<=7 && view_j>=0) {
                     if (matrixBord[view_i+1][view_j].substring(0,matrixBord[view_i+1][view_j].length()-2).equals("spitak_zinvor"))
                         harvac_dashtin=false;
                 }
                 if (view_i+1<=7 && view_j+2<=7) {
                     if (matrixBord[view_i+1][view_j+2].substring(0,matrixBord[view_i+1][view_j+2].length()-2).equals("spitak_zinvor"))
                         harvac_dashtin=false;
                 }

             }


             if (matrixBord[view_i][view_j+1].equals("datark") && harvac_dashtin==true) {
                 imageRamkaTagavor_3=new ImageView(this);
                 imageRamkaTagavor_3.setImageResource(R.drawable.ramka);
                 params_images = new RelativeLayout.LayoutParams(widthLayoutMatrix / 8, widthLayoutMatrix / 8);
                 params_images.setMargins(leftTagavor - 10+widthLayoutMatrix/8,
                         topTagavor - 10, 0, 0);
                 rLayout.addView(imageRamkaTagavor_3, params_images);
                 imageClicked = imageName;
                 clickedRamkaTagavor_3 = "1";
                 imageRamkaTagavor_3.setId(R.id.ramka_Tagavor_3);
                 imageRamkaTagavor_3.setOnClickListener(this);
             }
             else if (matrixBord[view_i][view_j+1].charAt(1)=='e' && sev_spitak==true && harvac_dashtin==true) {
                 imageRamkaTagavor_3=new ImageView(this);
                 imageRamkaTagavor_3.setImageResource(R.drawable.ramka);
                 params_images = new RelativeLayout.LayoutParams(widthLayoutMatrix / 8, widthLayoutMatrix / 8);
                 params_images.setMargins(leftTagavor - 10+widthLayoutMatrix/8,
                         topTagavor - 10, 0, 0);
                 rLayout.addView(imageRamkaTagavor_3, params_images);
                 imageClicked = imageName;
                 clickedRamkaTagavor_3 = "1";
                 oponentTagavorString_3=matrixBord[view_i][view_j+1];
                 imageRamkaTagavor_3.setId(R.id.ramka_Tagavor_3);
                 imageRamkaTagavor_3.setOnClickListener(this);
             }
             else if (matrixBord[view_i][view_j+1].charAt(1)=='p' && sev_spitak==false && harvac_dashtin==true) {
                 imageRamkaTagavor_3=new ImageView(this);
                 imageRamkaTagavor_3.setImageResource(R.drawable.ramka);
                 params_images = new RelativeLayout.LayoutParams(widthLayoutMatrix / 8, widthLayoutMatrix / 8);
                 params_images.setMargins(leftTagavor - 10+widthLayoutMatrix/8,
                         topTagavor - 10, 0, 0);
                 rLayout.addView(imageRamkaTagavor_3, params_images);
                 imageClicked = imageName;
                 clickedRamkaTagavor_3 = "1";
                 oponentTagavorString_3=matrixBord[view_i][view_j+1];
                 imageRamkaTagavor_3.setId(R.id.ramka_Tagavor_3);
                 imageRamkaTagavor_3.setOnClickListener(this);
             }

         }

                 harvac_dashtin=true;

         if (view_j+1<=7 && view_i+1<=7) {

             if (sev_spitak==true) {
                 for (int i = view_j; i >= 0; i--) {
                     if (matrixBord[view_i+1][i].substring(0,matrixBord[view_i+1][i].length()-2).equals("sev_navak")
                             || matrixBord[view_i+1][i].substring(0,matrixBord[view_i+1][i].length()-2).equals("sev_taguhi")
                             || matrixBord[view_i+1][i].substring(0,matrixBord[view_i+1][i].length()).equals("sev_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[view_i+1][i].substring(0,matrixBord[view_i+1][i].length()-2).equals("sev_pix")
                             || matrixBord[view_i+1][i].substring(0,matrixBord[view_i+1][i].length()-2).equals("sev_dzi")
                             || matrixBord[view_i+1][i].substring(0,matrixBord[view_i+1][i].length()-2).equals("sev_zinvor")
                             || matrixBord[view_i+1][i].substring(0,matrixBord[view_i+1][i].length()).equals("sev_tagavor")
                             || matrixBord[view_i+1][i].charAt(1)=='p') {
                         break;
                     }
                 }

                 for (int i=view_j+2; i<8; i++) {
                     if (matrixBord[view_i+1][i].substring(0,matrixBord[view_i+1][i].length()-2).equals("sev_navak")
                             || matrixBord[view_i+1][i].substring(0,matrixBord[view_i+1][i].length()-2).equals("sev_taguhi")
                             || matrixBord[view_i+1][i].substring(0,matrixBord[view_i+1][i].length()).equals("sev_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[view_i+1][i].substring(0,matrixBord[view_i+1][i].length()-2).equals("sev_pix")
                             || matrixBord[view_i+1][i].substring(0,matrixBord[view_i+1][i].length()-2).equals("sev_dzi")
                             || matrixBord[view_i+1][i].substring(0,matrixBord[view_i+1][i].length()-2).equals("sev_zinvor")
                             || matrixBord[view_i+1][i].substring(0,matrixBord[view_i+1][i].length()).equals("sev_tagavor")
                             || matrixBord[view_i+1][i].charAt(1)=='p') {
                         break;
                     }
                 }

                 for (int i=view_i; i>=0; i--) {
                     if (matrixBord[i][view_j+1].substring(0,matrixBord[i][view_j+1].length()-2).equals("sev_navak")
                             || matrixBord[i][view_j+1].substring(0,matrixBord[i][view_j+1].length()-2).equals("sev_taguhi")
                             || matrixBord[i][view_j+1].substring(0,matrixBord[i][view_j+1].length()).equals("sev_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[i][view_j+1].substring(0,matrixBord[i][view_j+1].length()-2).equals("sev_pix")
                             || matrixBord[i][view_j+1].substring(0,matrixBord[i][view_j+1].length()-2).equals("sev_dzi")
                             || matrixBord[i][view_j+1].substring(0,matrixBord[i][view_j+1].length()-2).equals("sev_zinvor")
                             || matrixBord[i][view_j+1].substring(0,matrixBord[i][view_j+1].length()).equals("sev_tagavor")
                             || matrixBord[i][view_j+1].charAt(1)=='p') {
                         break;
                     }
                 }
                 for (int i=view_i+2; i<=7; i++) {
                     if (matrixBord[i][view_j+1].substring(0,matrixBord[i][view_j+1].length()-2).equals("sev_navak")
                             || matrixBord[i][view_j+1].substring(0,matrixBord[i][view_j+1].length()-2).equals("sev_taguhi")
                             || matrixBord[i][view_j+1].substring(0,matrixBord[i][view_j+1].length()).equals("sev_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[i][view_j+1].substring(0,matrixBord[i][view_j+1].length()-2).equals("sev_pix")
                             || matrixBord[i][view_j+1].substring(0,matrixBord[i][view_j+1].length()-2).equals("sev_dzi")
                             || matrixBord[i][view_j+1].substring(0,matrixBord[i][view_j+1].length()-2).equals("sev_zinvor")
                             || matrixBord[i][view_j+1].substring(0,matrixBord[i][view_j+1].length()).equals("sev_tagavor")
                             || matrixBord[i][view_j+1].charAt(1)=='p') {
                         break;
                     }
                 }

                 int i=view_i-1;
                 int j=view_j-1;
                 while (i>=0 && j>=0) {
                     if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_pix")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_taguhi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("sev_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_navak")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_dzi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_zinvor")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("sev_tagavor")
                             || matrixBord[i][j].charAt(1)=='p') {
                         break;
                     }
                     i--;
                     j--;
                 }

                 i=view_i+2;
                 j=view_j+2;

                 while (i<=7 && j<=7) {
                     if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_pix")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_taguhi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("sev_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_navak")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_dzi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_zinvor")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("sev_tagavor")
                             || matrixBord[i][j].charAt(1)=='p') {
                         break;
                     }
                     i++;
                     j++;
                 }

                 i=view_i;
                 j=view_j+2;
                 while (i>=0 && j<=7) {
                     if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_pix")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_taguhi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("sev_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_navak")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_dzi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_zinvor")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("sev_tagavor")
                             || matrixBord[i][j].charAt(1)=='p') {
                         break;
                     }
                     i--;
                     j++;
                 }

                 i=view_i+2;
                 j=view_j;
                 while (i<=7 && j>=0) {
                     if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_pix")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_taguhi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("sev_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_navak")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_dzi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_zinvor")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("sev_tagavor")
                             || matrixBord[i][j].charAt(1)=='p') {
                         break;
                     }
                     i++;
                     j--;
                 }

                 if (view_i-1>=0 && view_j+2<=7) {
                     if (matrixBord[view_i-1][view_j+2].substring(0,matrixBord[view_i-1][view_j+2].length()-2).equals("sev_dzi"))
                         harvac_dashtin=false;
                 }
                 if (view_i-1>=0 && view_j>=0) {
                     if (matrixBord[view_i-1][view_j].substring(0,matrixBord[view_i-1][view_j].length()-2).equals("sev_dzi"))
                         harvac_dashtin=false;
                 }
                 if (view_i>=0 && view_j+3<=7) {
                     if (matrixBord[view_i][view_j+3].substring(0,matrixBord[view_i][view_j+3].length()-2).equals("sev_dzi"))
                         harvac_dashtin=false;
                 }
                 if (view_i>=0 && view_j-1>=0) {
                     if (matrixBord[view_i][view_j-1].substring(0,matrixBord[view_i][view_j-1].length()-2).equals("sev_dzi"))
                         harvac_dashtin=false;
                 }
                 if (view_i+3<=7 && view_j+2<=7) {
                     if (matrixBord[view_i+3][view_j+2].substring(0,matrixBord[view_i+3][view_j+2].length()-2).equals("sev_dzi"))
                         harvac_dashtin=false;
                 }
                 if (view_i+3<=7 && view_j>=0) {
                     if (matrixBord[view_i+3][view_j].substring(0,matrixBord[view_i+3][view_j].length()-2).equals("sev_dzi"))
                         harvac_dashtin=false;
                 }
                 if (view_i+2<=7 && view_j+3<=7) {
                     if (matrixBord[view_i+2][view_j+3].substring(0,matrixBord[view_i+2][view_j+3].length()-2).equals("sev_dzi"))
                         harvac_dashtin=false;
                 }
                 if (view_i+2<=7 && view_j-1>=0) {
                     if (matrixBord[view_i+2][view_j-1].substring(0,matrixBord[view_i+2][view_j-1].length()-2).equals("sev_dzi"))
                         harvac_dashtin=false;
                 }

                 if (view_i>=0 && view_j+2<=7) {
                     if (matrixBord[view_i][view_j+2].equals("sev_tagavor"))
                         harvac_dashtin=false;
                 }
                 if (view_i+1<=7 && view_j+2<=7) {
                     if (matrixBord[view_i+1][view_j+2].equals("sev_tagavor"))
                         harvac_dashtin=false;
                 }
                 if (view_i+2<=7 && view_j+2<=7) {
                     if (matrixBord[view_i+2][view_j+2].equals("sev_tagavor"))
                         harvac_dashtin=false;
                 }
                 if (view_i+2<=7 && view_j+1<=7) {
                     if (matrixBord[view_i+2][view_j+1].equals("sev_tagavor"))
                         harvac_dashtin=false;
                 }
                 if (view_i+2<=7) {
                     if (matrixBord[view_i+2][view_j].equals("sev_tagavor"))
                         harvac_dashtin=false;
                 }

                 if (view_j+2<=7) {
                     if (matrixBord[view_i][view_j+2].substring(0,matrixBord[view_i][view_j+2].length()-2).equals("sev_zinvor"))
                         harvac_dashtin=false;
                 }

             }
             else  {

                 for (int i = view_j; i >= 0; i--) {
                     if (matrixBord[view_i+1][i].substring(0,matrixBord[view_i+1][i].length()-2).equals("spitak_navak")
                             || matrixBord[view_i+1][i].substring(0,matrixBord[view_i+1][i].length()-2).equals("spitak_taguhi")
                             || matrixBord[view_i+1][i].substring(0,matrixBord[view_i+1][i].length()).equals("spitak_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[view_i+1][i].substring(0,matrixBord[view_i+1][i].length()-2).equals("spitak_pix")
                             || matrixBord[view_i+1][i].substring(0,matrixBord[view_i+1][i].length()-2).equals("spitak_dzi")
                             || matrixBord[view_i+1][i].substring(0,matrixBord[view_i+1][i].length()-2).equals("spitak_zinvor")
                             || matrixBord[view_i+1][i].substring(0,matrixBord[view_i+1][i].length()).equals("spitak_tagavor")
                             || matrixBord[view_i+1][i].charAt(1)=='e') {
                         break;
                     }
                 }

                 for (int i=view_j+2; i<8; i++) {
                     if (matrixBord[view_i+1][i].substring(0,matrixBord[view_i+1][i].length()-2).equals("spitak_navak")
                             || matrixBord[view_i+1][i].substring(0,matrixBord[view_i+1][i].length()-2).equals("spitak_taguhi")
                             || matrixBord[view_i+1][i].substring(0,matrixBord[view_i+1][i].length()).equals("spitak_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[view_i+1][i].substring(0,matrixBord[view_i+1][i].length()-2).equals("spitak_pix")
                             || matrixBord[view_i+1][i].substring(0,matrixBord[view_i+1][i].length()-2).equals("spitak_dzi")
                             || matrixBord[view_i+1][i].substring(0,matrixBord[view_i+1][i].length()-2).equals("spitak_zinvor")
                             || matrixBord[view_i+1][i].substring(0,matrixBord[view_i+1][i].length()).equals("spitak_tagavor")
                             || matrixBord[view_i+1][i].charAt(1)=='e') {
                         break;
                     }
                 }

                 for (int i=view_i; i>=0; i--) {
                     if (matrixBord[i][view_j+1].substring(0,matrixBord[i][view_j+1].length()-2).equals("spitak_navak")
                             || matrixBord[i][view_j+1].substring(0,matrixBord[i][view_j+1].length()-2).equals("spitak_taguhi")
                             || matrixBord[i][view_j+1].substring(0,matrixBord[i][view_j+1].length()).equals("spitak_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[i][view_j+1].substring(0,matrixBord[i][view_j+1].length()-2).equals("spitak_pix")
                             || matrixBord[i][view_j+1].substring(0,matrixBord[i][view_j+1].length()-2).equals("spitak_dzi")
                             || matrixBord[i][view_j+1].substring(0,matrixBord[i][view_j+1].length()-2).equals("spitak_zinvor")
                             || matrixBord[i][view_j+1].substring(0,matrixBord[i][view_j+1].length()).equals("spitak_tagavor")
                             || matrixBord[i][view_j+1].charAt(1)=='e') {
                         break;
                     }
                 }
                 for (int i=view_i+2; i<=7; i++) {
                     if (matrixBord[i][view_j+1].substring(0,matrixBord[i][view_j+1].length()-2).equals("spitak_navak")
                             || matrixBord[i][view_j+1].substring(0,matrixBord[i][view_j+1].length()-2).equals("spitak_taguhi")
                             || matrixBord[i][view_j+1].substring(0,matrixBord[i][view_j+1].length()).equals("spitak_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[i][view_j+1].substring(0,matrixBord[i][view_j+1].length()-2).equals("spitak_pix")
                             || matrixBord[i][view_j+1].substring(0,matrixBord[i][view_j+1].length()-2).equals("spitak_dzi")
                             || matrixBord[i][view_j+1].substring(0,matrixBord[i][view_j+1].length()-2).equals("spitak_zinvor")
                             || matrixBord[i][view_j+1].substring(0,matrixBord[i][view_j+1].length()).equals("spitak_tagavor")
                             || matrixBord[i][view_j+1].charAt(1)=='e') {
                         break;
                     }
                 }

                 int i=view_i-1;
                 int j=view_j-1;
                 while (i>=0 && j>=0) {
                     if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_pix")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_taguhi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("spitak_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_navak")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_dzi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_zinvor")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("spitak_tagavor")
                             || matrixBord[i][j].charAt(1)=='e') {
                         break;
                     }
                     i--;
                     j--;
                 }

                 i=view_i+2;
                 j=view_j+2;

                 while (i<=7 && j<=7) {
                     if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_pix")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_taguhi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("spitak_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_navak")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_dzi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_zinvor")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("spitak_tagavor")
                             || matrixBord[i][j].charAt(1)=='e') {
                         break;
                     }
                     i++;
                     j++;
                 }

                 i=view_i;
                 j=view_j+2;
                 while (i>=0 && j<=7) {
                     if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_pix")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_taguhi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("spitak_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_navak")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_dzi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_zinvor")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("spitak_tagavor")
                             || matrixBord[i][j].charAt(1)=='e') {
                         break;
                     }
                     i--;
                     j++;
                 }

                 i=view_i+2;
                 j=view_j;
                 while (i<=7 && j>=0) {
                     if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_pix")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_taguhi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("spitak_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_navak")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_dzi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_zinvor")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("spitak_tagavor")
                             || matrixBord[i][j].charAt(1)=='e') {
                         break;
                     }
                     i++;
                     j--;
                 }

                 if (view_i-1>=0 && view_j+2<=7) {
                     if (matrixBord[view_i-1][view_j+2].substring(0,matrixBord[view_i-1][view_j+2].length()-2).equals("spitak_dzi"))
                         harvac_dashtin=false;
                 }
                 if (view_i-1>=0 && view_j>=0) {
                     if (matrixBord[view_i-1][view_j].substring(0,matrixBord[view_i-1][view_j].length()-2).equals("spitak_dzi"))
                         harvac_dashtin=false;
                 }
                 if (view_i>=0 && view_j+3<=7) {
                     if (matrixBord[view_i][view_j+3].substring(0,matrixBord[view_i][view_j+3].length()-2).equals("spitak_dzi"))
                         harvac_dashtin=false;
                 }
                 if (view_i>=0 && view_j-1>=0) {
                     if (matrixBord[view_i][view_j-1].substring(0,matrixBord[view_i][view_j-1].length()-2).equals("spitak_dzi"))
                         harvac_dashtin=false;
                 }
                 if (view_i+3<=7 && view_j+2<=7) {
                     if (matrixBord[view_i+3][view_j+2].substring(0,matrixBord[view_i+3][view_j+2].length()-2).equals("spitak_dzi"))
                         harvac_dashtin=false;
                 }
                 if (view_i+3<=7 && view_j>=0) {
                     if (matrixBord[view_i+3][view_j].substring(0,matrixBord[view_i+3][view_j].length()-2).equals("spitak_dzi"))
                         harvac_dashtin=false;
                 }
                 if (view_i+2<=7 && view_j+3<=7) {
                     if (matrixBord[view_i+2][view_j+3].substring(0,matrixBord[view_i+2][view_j+3].length()-2).equals("spitak_dzi"))
                         harvac_dashtin=false;
                 }
                 if (view_i+2<=7 && view_j-1>=0) {
                     if (matrixBord[view_i+2][view_j-1].substring(0,matrixBord[view_i+2][view_j-1].length()-2).equals("spitak_dzi"))
                         harvac_dashtin=false;
                 }

                 if (view_j+2<=7) {
                     if (matrixBord[view_i][view_j+2].equals("spitak_tagavor"))
                         harvac_dashtin=false;
                 }
                 if (view_i+1<=7 && view_j+2<=7) {
                     if (matrixBord[view_i+1][view_j+2].equals("spitak_tagavor"))
                         harvac_dashtin=false;
                 }
                 if (view_i+2<=7 && view_j+2<=7) {
                     if (matrixBord[view_i+2][view_j+2].equals("spitak_tagavor"))
                         harvac_dashtin=false;
                 }
                 if (view_i+2<=7 && view_j+1<=7) {
                     if (matrixBord[view_i+2][view_j+1].equals("spitak_tagavor"))
                         harvac_dashtin=false;
                 }
                 if (view_i+2<=7) {
                     if (matrixBord[view_i+2][view_j].equals("spitak_tagavor"))
                         harvac_dashtin=false;
                 }



                 if (view_j+2<=7 && view_i+2<=7) {
                     if (matrixBord[view_i+2][view_j+2].substring(0,matrixBord[view_i+2][view_j+2].length()-2).equals("spitak_zinvor"))
                         harvac_dashtin=false;
                 }
                 if (view_i+2<=7) {
                     if (matrixBord[view_i+2][view_j].substring(0,matrixBord[view_i+2][view_j].length()-2).equals("spitak_zinvor"))
                         harvac_dashtin=false;
                 }

             }


             if (matrixBord[view_i+1][view_j+1].equals("datark") && harvac_dashtin==true) {
                 imageRamkaTagavor_4=new ImageView(this);
                 imageRamkaTagavor_4.setImageResource(R.drawable.ramka);
                 params_images = new RelativeLayout.LayoutParams(widthLayoutMatrix / 8, widthLayoutMatrix / 8);
                 params_images.setMargins(leftTagavor - 10+widthLayoutMatrix/8,
                         topTagavor - 10+widthLayoutMatrix/8, 0, 0);
                 rLayout.addView(imageRamkaTagavor_4, params_images);
                 imageClicked = imageName;
                 clickedRamkaTagavor_4 = "1";
                 imageRamkaTagavor_4.setId(R.id.ramka_Tagavor_4);
                 imageRamkaTagavor_4.setOnClickListener(this);
             }
             else if (matrixBord[view_i+1][view_j+1].charAt(1)=='e' && sev_spitak==true && harvac_dashtin==true) {
                 imageRamkaTagavor_4=new ImageView(this);
                 imageRamkaTagavor_4.setImageResource(R.drawable.ramka);
                 params_images = new RelativeLayout.LayoutParams(widthLayoutMatrix / 8, widthLayoutMatrix / 8);
                 params_images.setMargins(leftTagavor - 10+widthLayoutMatrix/8,
                         topTagavor - 10+widthLayoutMatrix/8, 0, 0);
                 rLayout.addView(imageRamkaTagavor_4, params_images);
                 imageClicked = imageName;
                 clickedRamkaTagavor_4 = "1";
                 oponentTagavorString_4=matrixBord[view_i+1][view_j+1];
                 imageRamkaTagavor_4.setId(R.id.ramka_Tagavor_4);
                 imageRamkaTagavor_4.setOnClickListener(this);
             }
             else if (matrixBord[view_i+1][view_j+1].charAt(1)=='p' && sev_spitak==false && harvac_dashtin==true) {
                 imageRamkaTagavor_4=new ImageView(this);
                 imageRamkaTagavor_4.setImageResource(R.drawable.ramka);
                 params_images = new RelativeLayout.LayoutParams(widthLayoutMatrix / 8, widthLayoutMatrix / 8);
                 params_images.setMargins(leftTagavor - 10+widthLayoutMatrix/8,
                         topTagavor - 10+widthLayoutMatrix/8, 0, 0);
                 rLayout.addView(imageRamkaTagavor_4, params_images);
                 imageClicked = imageName;
                 clickedRamkaTagavor_4 = "1";
                 oponentTagavorString_4=matrixBord[view_i+1][view_j+1];
                 imageRamkaTagavor_4.setId(R.id.ramka_Tagavor_4);
                 imageRamkaTagavor_4.setOnClickListener(this);
             }

         }

                 harvac_dashtin=true;

         if (view_i+1<=7) {

             if (sev_spitak==true) {
                 for (int i = view_j-1; i >= 0; i--) {
                     if (matrixBord[view_i+1][i].substring(0,matrixBord[view_i+1][i].length()-2).equals("sev_navak")
                             || matrixBord[view_i+1][i].substring(0,matrixBord[view_i+1][i].length()-2).equals("sev_taguhi")
                             || matrixBord[view_i+1][i].substring(0,matrixBord[view_i+1][i].length()).equals("sev_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[view_i+1][i].substring(0,matrixBord[view_i+1][i].length()-2).equals("sev_pix")
                             || matrixBord[view_i+1][i].substring(0,matrixBord[view_i+1][i].length()-2).equals("sev_dzi")
                             || matrixBord[view_i+1][i].substring(0,matrixBord[view_i+1][i].length()-2).equals("sev_zinvor")
                             || matrixBord[view_i+1][i].substring(0,matrixBord[view_i+1][i].length()).equals("sev_tagavor")
                             || matrixBord[view_i+1][i].charAt(1)=='p') {
                         break;
                     }
                 }

                 for (int i=view_j+1; i<8; i++) {
                     if (matrixBord[view_i+1][i].substring(0,matrixBord[view_i+1][i].length()-2).equals("sev_navak")
                             || matrixBord[view_i+1][i].substring(0,matrixBord[view_i+1][i].length()-2).equals("sev_taguhi")
                             || matrixBord[view_i+1][i].substring(0,matrixBord[view_i+1][i].length()).equals("sev_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[view_i+1][i].substring(0,matrixBord[view_i+1][i].length()-2).equals("sev_pix")
                             || matrixBord[view_i+1][i].substring(0,matrixBord[view_i+1][i].length()-2).equals("sev_dzi")
                             || matrixBord[view_i+1][i].substring(0,matrixBord[view_i+1][i].length()-2).equals("sev_zinvor")
                             || matrixBord[view_i+1][i].substring(0,matrixBord[view_i+1][i].length()).equals("sev_tagavor")
                             || matrixBord[view_i+1][i].charAt(1)=='p') {
                         break;
                     }
                 }

                 for (int i=view_i-1; i>=0; i--) {
                     if (matrixBord[i][view_j].substring(0,matrixBord[i][view_j].length()-2).equals("sev_navak")
                             || matrixBord[i][view_j].substring(0,matrixBord[i][view_j].length()-2).equals("sev_taguhi")
                             || matrixBord[i][view_j].substring(0,matrixBord[i][view_j].length()).equals("sev_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[i][view_j].substring(0,matrixBord[i][view_j].length()-2).equals("sev_pix")
                             || matrixBord[i][view_j].substring(0,matrixBord[i][view_j].length()-2).equals("sev_dzi")
                             || matrixBord[i][view_j].substring(0,matrixBord[i][view_j].length()-2).equals("sev_zinvor")
                             || matrixBord[i][view_j].substring(0,matrixBord[i][view_j].length()).equals("sev_tagavor")
                             || matrixBord[i][view_j].charAt(1)=='p') {
                         break;
                     }
                 }
                 for (int i=view_i+2; i<=7; i++) {
                     if (matrixBord[i][view_j].substring(0,matrixBord[i][view_j].length()-2).equals("sev_navak")
                             || matrixBord[i][view_j].substring(0,matrixBord[i][view_j].length()-2).equals("sev_taguhi")
                             || matrixBord[i][view_j].substring(0,matrixBord[i][view_j].length()).equals("sev_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[i][view_j].substring(0,matrixBord[i][view_j].length()-2).equals("sev_pix")
                             || matrixBord[i][view_j].substring(0,matrixBord[i][view_j].length()-2).equals("sev_dzi")
                             || matrixBord[i][view_j].substring(0,matrixBord[i][view_j].length()-2).equals("sev_zinvor")
                             || matrixBord[i][view_j].substring(0,matrixBord[i][view_j].length()).equals("sev_tagavor")
                             || matrixBord[i][view_j].charAt(1)=='p') {
                         break;
                     }
                 }

                 int i=view_i;
                 int j=view_j-1;
                 while (i>=0 && j>=0) {
                     if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_pix")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_taguhi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("sev_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_navak")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_dzi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_zinvor")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("sev_tagavor")
                             || matrixBord[i][j].charAt(1)=='p') {
                         break;
                     }
                     i--;
                     j--;
                 }

                 i=view_i+2;
                 j=view_j+1;

                 while (i<=7 && j<=7) {
                     if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_pix")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_taguhi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("sev_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_navak")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_dzi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_zinvor")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("sev_tagavor")
                             || matrixBord[i][j].charAt(1)=='p') {
                         break;
                     }
                     i++;
                     j++;
                 }

                 i=view_i;
                 j=view_j+1;
                 while (i>=0 && j<=7) {
                     if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_pix")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_taguhi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("sev_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_navak")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_dzi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_zinvor")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("sev_tagavor")
                             || matrixBord[i][j].charAt(1)=='p') {
                         break;
                     }
                     i--;
                     j++;
                 }

                 i=view_i+2;
                 j=view_j-1;
                 while (i<=7 && j>=0) {
                     if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_pix")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_taguhi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("sev_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_navak")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_dzi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_zinvor")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("sev_tagavor")
                             || matrixBord[i][j].charAt(1)=='p') {
                         break;
                     }
                     i++;
                     j--;
                 }

                 if (view_i-1>=0 && view_j+1<=7) {
                     if (matrixBord[view_i-1][view_j+1].substring(0,matrixBord[view_i-1][view_j+1].length()-2).equals("sev_dzi"))
                         harvac_dashtin=false;
                 }
                 if (view_i-1>=0 && view_j-1>=0) {
                     if (matrixBord[view_i-1][view_j-1].substring(0,matrixBord[view_i-1][view_j-1].length()-2).equals("sev_dzi"))
                         harvac_dashtin=false;
                 }
                 if (view_i>=0 && view_j+2<=7) {
                     if (matrixBord[view_i][view_j+2].substring(0,matrixBord[view_i][view_j+2].length()-2).equals("sev_dzi"))
                         harvac_dashtin=false;
                 }
                 if (view_i>=0 && view_j-2>=0) {
                     if (matrixBord[view_i][view_j-2].substring(0,matrixBord[view_i][view_j-2].length()-2).equals("sev_dzi"))
                         harvac_dashtin=false;
                 }
                 if (view_i+3<=7 && view_j+1<=7) {
                     if (matrixBord[view_i+3][view_j+1].substring(0,matrixBord[view_i+3][view_j+1].length()-2).equals("sev_dzi"))
                         harvac_dashtin=false;
                 }
                 if (view_i+3<=7 && view_j-1>=0) {
                     if (matrixBord[view_i+3][view_j-1].substring(0,matrixBord[view_i+3][view_j-1].length()-2).equals("sev_dzi"))
                         harvac_dashtin=false;
                 }
                 if (view_i+2<=7 && view_j+2<=7) {
                     if (matrixBord[view_i+2][view_j+2].substring(0,matrixBord[view_i+2][view_j+2].length()-2).equals("sev_dzi"))
                         harvac_dashtin=false;
                 }
                 if (view_i+2<=7 && view_j-2>=0) {
                     if (matrixBord[view_i+2][view_j-2].substring(0,matrixBord[view_i+2][view_j-2].length()-2).equals("sev_dzi"))
                         harvac_dashtin=false;
                 }

                 if (view_i+2<=7 && view_j+1<=7) {
                     if (matrixBord[view_i+2][view_j+1].equals("sev_tagavor"))
                         harvac_dashtin=false;
                 }
                 if (view_i+2<=7) {
                     if (matrixBord[view_i+2][view_j].equals("sev_tagavor"))
                         harvac_dashtin=false;
                 }
                 if (view_i+2<=7 && view_j-1>=0) {
                     if (matrixBord[view_i+2][view_j-1].equals("sev_tagavor"))
                         harvac_dashtin=false;
                 }


                 if (view_j+1<=7) {
                     if (matrixBord[view_i][view_j+1].substring(0,matrixBord[view_i][view_j+1].length()-2).equals("sev_zinvor"))
                         harvac_dashtin=false;
                 }
                 if (view_j-1>=0) {
                     if (matrixBord[view_i][view_j-1].substring(0,matrixBord[view_i][view_j-1].length()-2).equals("sev_zinvor"))
                         harvac_dashtin=false;
                 }

             }
             else  {

                 for (int i = view_j-1; i >= 0; i--) {
                     if (matrixBord[view_i+1][i].substring(0,matrixBord[view_i+1][i].length()-2).equals("spitak_navak")
                             || matrixBord[view_i+1][i].substring(0,matrixBord[view_i+1][i].length()-2).equals("spitak_taguhi")
                             || matrixBord[view_i+1][i].substring(0,matrixBord[view_i+1][i].length()).equals("spitak_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[view_i+1][i].substring(0,matrixBord[view_i+1][i].length()-2).equals("spitak_pix")
                             || matrixBord[view_i+1][i].substring(0,matrixBord[view_i+1][i].length()-2).equals("spitak_dzi")
                             || matrixBord[view_i+1][i].substring(0,matrixBord[view_i+1][i].length()-2).equals("spitak_zinvor")
                             || matrixBord[view_i+1][i].substring(0,matrixBord[view_i+1][i].length()).equals("spitak_tagavor")
                             || matrixBord[view_i+1][i].charAt(1)=='e') {
                         break;
                     }
                 }

                 for (int i=view_j+1; i<8; i++) {
                     if (matrixBord[view_i+1][i].substring(0,matrixBord[view_i+1][i].length()-2).equals("spitak_navak")
                             || matrixBord[view_i+1][i].substring(0,matrixBord[view_i+1][i].length()-2).equals("spitak_taguhi")
                             || matrixBord[view_i+1][i].substring(0,matrixBord[view_i+1][i].length()).equals("spitak_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[view_i+1][i].substring(0,matrixBord[view_i+1][i].length()-2).equals("spitak_pix")
                             || matrixBord[view_i+1][i].substring(0,matrixBord[view_i+1][i].length()-2).equals("spitak_dzi")
                             || matrixBord[view_i+1][i].substring(0,matrixBord[view_i+1][i].length()-2).equals("spitak_zinvor")
                             || matrixBord[view_i+1][i].substring(0,matrixBord[view_i+1][i].length()).equals("spitak_tagavor")
                             || matrixBord[view_i+1][i].charAt(1)=='e') {
                         break;
                     }
                 }

                 for (int i=view_i-1; i>=0; i--) {
                     if (matrixBord[i][view_j].substring(0,matrixBord[i][view_j].length()-2).equals("spitak_navak")
                             || matrixBord[i][view_j].substring(0,matrixBord[i][view_j].length()-2).equals("spitak_taguhi")
                             || matrixBord[i][view_j].substring(0,matrixBord[i][view_j].length()).equals("spitak_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[i][view_j].substring(0,matrixBord[i][view_j].length()-2).equals("spitak_pix")
                             || matrixBord[i][view_j].substring(0,matrixBord[i][view_j].length()-2).equals("spitak_dzi")
                             || matrixBord[i][view_j].substring(0,matrixBord[i][view_j].length()-2).equals("spitak_zinvor")
                             || matrixBord[i][view_j].substring(0,matrixBord[i][view_j].length()).equals("spitak_tagavor")
                             || matrixBord[i][view_j].charAt(1)=='e') {
                         break;
                     }
                 }
                 for (int i=view_i+2; i<=7; i++) {
                     if (matrixBord[i][view_j].substring(0,matrixBord[i][view_j].length()-2).equals("spitak_navak")
                             || matrixBord[i][view_j].substring(0,matrixBord[i][view_j].length()-2).equals("spitak_taguhi")
                             || matrixBord[i][view_j].substring(0,matrixBord[i][view_j].length()).equals("spitak_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[i][view_j].substring(0,matrixBord[i][view_j].length()-2).equals("spitak_pix")
                             || matrixBord[i][view_j].substring(0,matrixBord[i][view_j].length()-2).equals("spitak_dzi")
                             || matrixBord[i][view_j].substring(0,matrixBord[i][view_j].length()-2).equals("spitak_zinvor")
                             || matrixBord[i][view_j].substring(0,matrixBord[i][view_j].length()).equals("spitak_tagavor")
                             || matrixBord[i][view_j].charAt(1)=='e') {
                         break;
                     }
                 }

                 int i=view_i;
                 int j=view_j-1;
                 while (i>=0 && j>=0) {
                     if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_pix")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_taguhi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("spitak_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_navak")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_dzi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_zinvor")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("spitak_tagavor")
                             || matrixBord[i][j].charAt(1)=='e') {
                         break;
                     }
                     i--;
                     j--;
                 }

                 i=view_i+2;
                 j=view_j+1;

                 while (i<=7 && j<=7) {
                     if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_pix")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_taguhi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("spitak_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_navak")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_dzi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_zinvor")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("spitak_tagavor")
                             || matrixBord[i][j].charAt(1)=='e') {
                         break;
                     }
                     i++;
                     j++;
                 }

                 i=view_i;
                 j=view_j+1;
                 while (i>=0 && j<=7) {
                     if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_pix")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_taguhi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("spitak_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_navak")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_dzi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_zinvor")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("spitak_tagavor")
                             || matrixBord[i][j].charAt(1)=='e') {
                         break;
                     }
                     i--;
                     j++;
                 }

                 i=view_i+2;
                 j=view_j-1;
                 while (i<=7 && j>=0) {
                     if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_pix")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_taguhi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("spitak_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_navak")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_dzi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_zinvor")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("spitak_tagavor")
                             || matrixBord[i][j].charAt(1)=='e') {
                         break;
                     }
                     i++;
                     j--;
                 }

                 if (view_i-1>=0 && view_j+1<=7) {
                     if (matrixBord[view_i-1][view_j+1].substring(0,matrixBord[view_i-1][view_j+1].length()-2).equals("spitak_dzi"))
                         harvac_dashtin=false;
                 }
                 if (view_i-1>=0 && view_j-1>=0) {
                     if (matrixBord[view_i-1][view_j-1].substring(0,matrixBord[view_i-1][view_j-1].length()-2).equals("spitak_dzi"))
                         harvac_dashtin=false;
                 }
                 if (view_i>=0 && view_j+2<=7) {
                     if (matrixBord[view_i][view_j+2].substring(0,matrixBord[view_i][view_j+2].length()-2).equals("spitak_dzi"))
                         harvac_dashtin=false;
                 }
                 if (view_i>=0 && view_j-2>=0) {
                     if (matrixBord[view_i][view_j-2].substring(0,matrixBord[view_i][view_j-2].length()-2).equals("spitak_dzi"))
                         harvac_dashtin=false;
                 }
                 if (view_i+3<=7 && view_j+1<=7) {
                     if (matrixBord[view_i+3][view_j+1].substring(0,matrixBord[view_i+3][view_j+1].length()-2).equals("spitak_dzi"))
                         harvac_dashtin=false;
                 }
                 if (view_i+3<=7 && view_j-1>=0) {
                     if (matrixBord[view_i+3][view_j-1].substring(0,matrixBord[view_i+3][view_j-1].length()-2).equals("spitak_dzi"))
                         harvac_dashtin=false;
                 }
                 if (view_i+2<=7 && view_j+2<=7) {
                     if (matrixBord[view_i+2][view_j+2].substring(0,matrixBord[view_i+2][view_j+2].length()-2).equals("spitak_dzi"))
                         harvac_dashtin=false;
                 }
                 if (view_i+2<=7 && view_j-2>=0) {
                     if (matrixBord[view_i+2][view_j-2].substring(0,matrixBord[view_i+2][view_j-2].length()-2).equals("spitak_dzi"))
                         harvac_dashtin=false;
                 }

                 if (view_j+1<=7 && view_i+2<=7) {
                     if (matrixBord[view_i+2][view_j+1].equals("spitak_tagavor"))
                         harvac_dashtin=false;
                 }
                 if (view_i+2<=7) {
                     if (matrixBord[view_i+2][view_j].equals("spitak_tagavor"))
                         harvac_dashtin=false;
                 }
                 if (view_i+2<=7 && view_j-1>=0) {
                     if (matrixBord[view_i+2][view_j-1].equals("spitak_tagavor"))
                         harvac_dashtin=false;
                 }


                 if (view_j+1<=7 && view_i+2<=7) {
                     if (matrixBord[view_i+2][view_j+1].substring(0,matrixBord[view_i+2][view_j+1].length()-2).equals("spitak_zinvor"))
                         harvac_dashtin=false;
                 }
                 if (view_j-1>=0 && view_i+2<=7) {
                     if (matrixBord[view_i+2][view_j-1].substring(0,matrixBord[view_i+2][view_j-1].length()-2).equals("spitak_zinvor"))
                         harvac_dashtin=false;
                 }
             }

             if (matrixBord[view_i+1][view_j].equals("datark") && harvac_dashtin==true) {
                 imageRamkaTagavor_5=new ImageView(this);
                 imageRamkaTagavor_5.setImageResource(R.drawable.ramka);
                 params_images = new RelativeLayout.LayoutParams(widthLayoutMatrix / 8, widthLayoutMatrix / 8);
                 params_images.setMargins(leftTagavor - 10,
                         topTagavor - 10+widthLayoutMatrix/8, 0, 0);
                 rLayout.addView(imageRamkaTagavor_5, params_images);
                 imageClicked = imageName;
                 clickedRamkaTagavor_5 = "1";
                 imageRamkaTagavor_5.setId(R.id.ramka_Tagavor_5);
                 imageRamkaTagavor_5.setOnClickListener(this);
             }
             else if (matrixBord[view_i+1][view_j].charAt(1)=='e' && sev_spitak==true && harvac_dashtin==true) {
                 imageRamkaTagavor_5=new ImageView(this);
                 imageRamkaTagavor_5.setImageResource(R.drawable.ramka);
                 params_images = new RelativeLayout.LayoutParams(widthLayoutMatrix / 8, widthLayoutMatrix / 8);
                 params_images.setMargins(leftTagavor - 10,
                         topTagavor - 10+widthLayoutMatrix/8, 0, 0);
                 rLayout.addView(imageRamkaTagavor_5, params_images);
                 imageClicked = imageName;
                 clickedRamkaTagavor_5 = "1";
                 oponentTagavorString_5=matrixBord[view_i+1][view_j];
                 imageRamkaTagavor_5.setId(R.id.ramka_Tagavor_5);
                 imageRamkaTagavor_5.setOnClickListener(this);
             }
             else if (matrixBord[view_i+1][view_j].charAt(1)=='p' && sev_spitak==false && harvac_dashtin==true) {
                 imageRamkaTagavor_5=new ImageView(this);
                 imageRamkaTagavor_5.setImageResource(R.drawable.ramka);
                 params_images = new RelativeLayout.LayoutParams(widthLayoutMatrix / 8, widthLayoutMatrix / 8);
                 params_images.setMargins(leftTagavor - 10,
                         topTagavor - 10+widthLayoutMatrix/8, 0, 0);
                 rLayout.addView(imageRamkaTagavor_5, params_images);
                 imageClicked = imageName;
                 clickedRamkaTagavor_5 = "1";
                 oponentTagavorString_5=matrixBord[view_i+1][view_j];
                 imageRamkaTagavor_5.setId(R.id.ramka_Tagavor_5);
                 imageRamkaTagavor_5.setOnClickListener(this);
             }

         }

         harvac_dashtin=true;

         if (view_i+1<=7 && view_j-1>=0) {

             if (sev_spitak==true) {
                 for (int i = view_j-2; i >= 0; i--) {
                     if (matrixBord[view_i+1][i].substring(0,matrixBord[view_i+1][i].length()-2).equals("sev_navak")
                             || matrixBord[view_i+1][i].substring(0,matrixBord[view_i+1][i].length()-2).equals("sev_taguhi")
                             || matrixBord[view_i+1][i].substring(0,matrixBord[view_i+1][i].length()).equals("sev_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[view_i+1][i].substring(0,matrixBord[view_i+1][i].length()-2).equals("sev_pix")
                             || matrixBord[view_i+1][i].substring(0,matrixBord[view_i+1][i].length()-2).equals("sev_dzi")
                             || matrixBord[view_i+1][i].substring(0,matrixBord[view_i+1][i].length()-2).equals("sev_zinvor")
                             || matrixBord[view_i+1][i].substring(0,matrixBord[view_i+1][i].length()).equals("sev_tagavor")
                             || matrixBord[view_i+1][i].charAt(1)=='p') {
                         break;
                     }
                 }

                 for (int i=view_j; i<8; i++) {
                     if (matrixBord[view_i+1][i].substring(0,matrixBord[view_i+1][i].length()-2).equals("sev_navak")
                             || matrixBord[view_i+1][i].substring(0,matrixBord[view_i+1][i].length()-2).equals("sev_taguhi")
                             || matrixBord[view_i+1][i].substring(0,matrixBord[view_i+1][i].length()).equals("sev_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[view_i+1][i].substring(0,matrixBord[view_i+1][i].length()-2).equals("sev_pix")
                             || matrixBord[view_i+1][i].substring(0,matrixBord[view_i+1][i].length()-2).equals("sev_dzi")
                             || matrixBord[view_i+1][i].substring(0,matrixBord[view_i+1][i].length()-2).equals("sev_zinvor")
                             || matrixBord[view_i+1][i].substring(0,matrixBord[view_i+1][i].length()).equals("sev_tagavor")
                             || matrixBord[view_i+1][i].charAt(1)=='p') {
                         break;
                     }
                 }

                 for (int i=view_i; i>=0; i--) {
                     if (matrixBord[i][view_j-1].substring(0,matrixBord[i][view_j-1].length()-2).equals("sev_navak")
                             || matrixBord[i][view_j-1].substring(0,matrixBord[i][view_j-1].length()-2).equals("sev_taguhi")
                             || matrixBord[i][view_j-1].substring(0,matrixBord[i][view_j-1].length()).equals("sev_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[i][view_j-1].substring(0,matrixBord[i][view_j-1].length()-2).equals("sev_pix")
                             || matrixBord[i][view_j-1].substring(0,matrixBord[i][view_j-1].length()-2).equals("sev_dzi")
                             || matrixBord[i][view_j-1].substring(0,matrixBord[i][view_j-1].length()-2).equals("sev_zinvor")
                             || matrixBord[i][view_j-1].substring(0,matrixBord[i][view_j-1].length()).equals("sev_tagavor")
                             || matrixBord[i][view_j-1].charAt(1)=='p') {
                         break;
                     }
                 }
                 for (int i=view_i+2; i<=7; i++) {
                     if (matrixBord[i][view_j-1].substring(0,matrixBord[i][view_j-1].length()-2).equals("sev_navak")
                             || matrixBord[i][view_j-1].substring(0,matrixBord[i][view_j-1].length()-2).equals("sev_taguhi")
                             || matrixBord[i][view_j-1].substring(0,matrixBord[i][view_j-1].length()).equals("sev_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[i][view_j-1].substring(0,matrixBord[i][view_j-1].length()-2).equals("sev_pix")
                             || matrixBord[i][view_j-1].substring(0,matrixBord[i][view_j-1].length()-2).equals("sev_dzi")
                             || matrixBord[i][view_j-1].substring(0,matrixBord[i][view_j-1].length()-2).equals("sev_zinvor")
                             || matrixBord[i][view_j-1].substring(0,matrixBord[i][view_j-1].length()).equals("sev_tagavor")
                             || matrixBord[i][view_j-1].charAt(1)=='p') {
                         break;
                     }
                 }

                 int i=view_i;
                 int j=view_j-2;
                 while (i>=0 && j>=0) {
                     if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_pix")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_taguhi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("sev_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_navak")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_dzi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_zinvor")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("sev_tagavor")
                             || matrixBord[i][j].charAt(1)=='p') {
                         break;
                     }
                     i--;
                     j--;
                 }

                 i=view_i+2;
                 j=view_j;

                 while (i<=7 && j<=7) {
                     if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_pix")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_taguhi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("sev_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_navak")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_dzi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_zinvor")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("sev_tagavor")
                             || matrixBord[i][j].charAt(1)=='p') {
                         break;
                     }
                     i++;
                     j++;
                 }

                 i=view_i-1;
                 j=view_j+1;
                 while (i>=0 && j<=7) {
                     if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_pix")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_taguhi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("sev_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_navak")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_dzi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_zinvor")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("sev_tagavor")
                             || matrixBord[i][j].charAt(1)=='p') {
                         break;
                     }
                     i--;
                     j++;
                 }

                 i=view_i+2;
                 j=view_j-2;
                 while (i<=7 && j>=0) {
                     if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_pix")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_taguhi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("sev_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_navak")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_dzi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_zinvor")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("sev_tagavor")
                             || matrixBord[i][j].charAt(1)=='p') {
                         break;
                     }
                     i++;
                     j--;
                 }

                 if (view_i-1>=0 && view_j<=7) {
                     if (matrixBord[view_i-1][view_j].substring(0,matrixBord[view_i-1][view_j].length()-2).equals("sev_dzi"))
                         harvac_dashtin=false;
                 }
                 if (view_i-1>=0 && view_j-2>=0) {
                     if (matrixBord[view_i-1][view_j-2].substring(0,matrixBord[view_i-1][view_j-2].length()-2).equals("sev_dzi"))
                         harvac_dashtin=false;
                 }
                 if (view_i>=0 && view_j+1<=7) {
                     if (matrixBord[view_i][view_j+1].substring(0,matrixBord[view_i][view_j+1].length()-2).equals("sev_dzi"))
                         harvac_dashtin=false;
                 }
                 if (view_i>=0 && view_j-3>=0) {
                     if (matrixBord[view_i][view_j-3].substring(0,matrixBord[view_i][view_j-3].length()-2).equals("sev_dzi"))
                         harvac_dashtin=false;
                 }
                 if (view_i+3<=7 && view_j<=7) {
                     if (matrixBord[view_i+3][view_j].substring(0,matrixBord[view_i+3][view_j].length()-2).equals("sev_dzi"))
                         harvac_dashtin=false;
                 }
                 if (view_i+3<=7 && view_j-2>=0) {
                     if (matrixBord[view_i+3][view_j-2].substring(0,matrixBord[view_i+3][view_j-2].length()-2).equals("sev_dzi"))
                         harvac_dashtin=false;
                 }
                 if (view_i+2<=7 && view_j+1<=7) {
                     if (matrixBord[view_i+2][view_j+1].substring(0,matrixBord[view_i+2][view_j+1].length()-2).equals("sev_dzi"))
                         harvac_dashtin=false;
                 }
                 if (view_i+2<=7 && view_j-3>=0) {
                     if (matrixBord[view_i+2][view_j-3].substring(0,matrixBord[view_i+2][view_j-3].length()-2).equals("sev_dzi"))
                         harvac_dashtin=false;
                 }

                 if (view_i+2<=7) {
                     if (matrixBord[view_i+2][view_j].equals("sev_tagavor"))
                         harvac_dashtin=false;
                 }
                 if (view_i+2<=7 && view_j-1>=0) {
                     if (matrixBord[view_i+2][view_j-1].equals("sev_tagavor"))
                         harvac_dashtin=false;
                 }
                 if (view_i+2<=7 && view_j-2>=0) {
                     if (matrixBord[view_i+2][view_j-2].equals("sev_tagavor"))
                         harvac_dashtin=false;
                 }
                 if (view_i+1<=7 && view_j-2>=0) {
                     if (matrixBord[view_i+1][view_j-2].equals("sev_tagavor"))
                         harvac_dashtin=false;
                 }
                 if (view_j-2>=0) {
                     if (matrixBord[view_i][view_j-2].equals("sev_tagavor"))
                         harvac_dashtin=false;
                 }


                 if (view_j-2>=0) {
                     if (matrixBord[view_i][view_j-2].substring(0,matrixBord[view_i][view_j-2].length()-2).equals("sev_zinvor"))
                         harvac_dashtin=false;
                 }
             }
             else  {

                 for (int i = view_j-2; i >= 0; i--) {
                     if (matrixBord[view_i+1][i].substring(0,matrixBord[view_i+1][i].length()-2).equals("spitak_navak")
                             || matrixBord[view_i+1][i].substring(0,matrixBord[view_i+1][i].length()-2).equals("spitak_taguhi")
                             || matrixBord[view_i+1][i].substring(0,matrixBord[view_i+1][i].length()).equals("spitak_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[view_i+1][i].substring(0,matrixBord[view_i+1][i].length()-2).equals("spitak_pix")
                             || matrixBord[view_i+1][i].substring(0,matrixBord[view_i+1][i].length()-2).equals("spitak_dzi")
                             || matrixBord[view_i+1][i].substring(0,matrixBord[view_i+1][i].length()-2).equals("spitak_zinvor")
                             || matrixBord[view_i+1][i].substring(0,matrixBord[view_i+1][i].length()).equals("spitak_tagavor")
                             || matrixBord[view_i+1][i].charAt(1)=='e') {
                         break;
                     }
                 }

                 for (int i=view_j; i<8; i++) {
                     if (matrixBord[view_i+1][i].substring(0,matrixBord[view_i+1][i].length()-2).equals("spitak_navak")
                             || matrixBord[view_i+1][i].substring(0,matrixBord[view_i+1][i].length()-2).equals("spitak_taguhi")
                             || matrixBord[view_i+1][i].substring(0,matrixBord[view_i+1][i].length()).equals("spitak_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[view_i+1][i].substring(0,matrixBord[view_i+1][i].length()-2).equals("spitak_pix")
                             || matrixBord[view_i+1][i].substring(0,matrixBord[view_i+1][i].length()-2).equals("spitak_dzi")
                             || matrixBord[view_i+1][i].substring(0,matrixBord[view_i+1][i].length()-2).equals("spitak_zinvor")
                             || matrixBord[view_i+1][i].substring(0,matrixBord[view_i+1][i].length()).equals("spitak_tagavor")
                             || matrixBord[view_i+1][i].charAt(1)=='e') {
                         break;
                     }
                 }

                 for (int i=view_i; i>=0; i--) {
                     if (matrixBord[i][view_j-1].substring(0,matrixBord[i][view_j-1].length()-2).equals("spitak_navak")
                             || matrixBord[i][view_j-1].substring(0,matrixBord[i][view_j-1].length()-2).equals("spitak_taguhi")
                             || matrixBord[i][view_j-1].substring(0,matrixBord[i][view_j-1].length()).equals("spitak_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[i][view_j-1].substring(0,matrixBord[i][view_j-1].length()-2).equals("spitak_pix")
                             || matrixBord[i][view_j-1].substring(0,matrixBord[i][view_j-1].length()-2).equals("spitak_dzi")
                             || matrixBord[i][view_j-1].substring(0,matrixBord[i][view_j-1].length()-2).equals("spitak_zinvor")
                             || matrixBord[i][view_j-1].substring(0,matrixBord[i][view_j-1].length()).equals("spitak_tagavor")
                             || matrixBord[i][view_j-1].charAt(1)=='e') {
                         break;
                     }
                 }
                 for (int i=view_i+2; i<=7; i++) {
                     if (matrixBord[i][view_j-1].substring(0,matrixBord[i][view_j-1].length()-2).equals("spitak_navak")
                             || matrixBord[i][view_j-1].substring(0,matrixBord[i][view_j-1].length()-2).equals("spitak_taguhi")
                             || matrixBord[i][view_j-1].substring(0,matrixBord[i][view_j-1].length()).equals("spitak_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[i][view_j-1].substring(0,matrixBord[i][view_j-1].length()-2).equals("spitak_pix")
                             || matrixBord[i][view_j-1].substring(0,matrixBord[i][view_j-1].length()-2).equals("spitak_dzi")
                             || matrixBord[i][view_j-1].substring(0,matrixBord[i][view_j-1].length()-2).equals("spitak_zinvor")
                             || matrixBord[i][view_j-1].substring(0,matrixBord[i][view_j-1].length()).equals("spitak_tagavor")
                             || matrixBord[i][view_j-1].charAt(1)=='e') {
                         break;
                     }
                 }

                 int i=view_i;
                 int j=view_j-2;
                 while (i>=0 && j>=0) {
                     if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_pix")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_taguhi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("spitak_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_navak")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_dzi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_zinvor")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("spitak_tagavor")
                             || matrixBord[i][j].charAt(1)=='e') {
                         break;
                     }
                     i--;
                     j--;
                 }

                 i=view_i+2;
                 j=view_j;

                 while (i<=7 && j<=7) {
                     if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_pix")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_taguhi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("spitak_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_navak")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_dzi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_zinvor")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("spitak_tagavor")
                             || matrixBord[i][j].charAt(1)=='e') {
                         break;
                     }
                     i++;
                     j++;
                 }

                 i=view_i-1;
                 j=view_j+1;
                 while (i>=0 && j<=7) {
                     if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_pix")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_taguhi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("spitak_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_navak")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_dzi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_zinvor")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("spitak_tagavor")
                             || matrixBord[i][j].charAt(1)=='e') {
                         break;
                     }
                     i--;
                     j++;
                 }

                 i=view_i+2;
                 j=view_j-2;
                 while (i<=7 && j>=0) {
                     if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_pix")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_taguhi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("spitak_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_navak")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_dzi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_zinvor")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("spitak_tagavor")
                             || matrixBord[i][j].charAt(1)=='e') {
                         break;
                     }
                     i++;
                     j--;
                 }

                 if (view_i-1>=0 && view_j<=7) {
                     if (matrixBord[view_i-1][view_j].substring(0,matrixBord[view_i-1][view_j].length()-2).equals("spitak_dzi"))
                         harvac_dashtin=false;
                 }
                 if (view_i-1>=0 && view_j-2>=0) {
                     if (matrixBord[view_i-1][view_j-2].substring(0,matrixBord[view_i-1][view_j-2].length()-2).equals("spitak_dzi"))
                         harvac_dashtin=false;
                 }
                 if (view_i>=0 && view_j+1<=7) {
                     if (matrixBord[view_i][view_j+1].substring(0,matrixBord[view_i][view_j+1].length()-2).equals("spitak_dzi"))
                         harvac_dashtin=false;
                 }
                 if (view_i>=0 && view_j-3>=0) {
                     if (matrixBord[view_i][view_j-3].substring(0,matrixBord[view_i][view_j-3].length()-2).equals("spitak_dzi"))
                         harvac_dashtin=false;
                 }
                 if (view_i+3<=7 && view_j<=7) {
                     if (matrixBord[view_i+3][view_j].substring(0,matrixBord[view_i+3][view_j].length()-2).equals("spitak_dzi"))
                         harvac_dashtin=false;
                 }
                 if (view_i+3<=7 && view_j-2>=0) {
                     if (matrixBord[view_i+3][view_j-2].substring(0,matrixBord[view_i+3][view_j-2].length()-2).equals("spitak_dzi"))
                         harvac_dashtin=false;
                 }
                 if (view_i+2<=7 && view_j+1<=7) {
                     if (matrixBord[view_i+2][view_j+1].substring(0,matrixBord[view_i+2][view_j+1].length()-2).equals("spitak_dzi"))
                         harvac_dashtin=false;
                 }
                 if (view_i+2<=7 && view_j-3>=0) {
                     if (matrixBord[view_i+2][view_j-3].substring(0,matrixBord[view_i+2][view_j-3].length()-2).equals("spitak_dzi"))
                         harvac_dashtin=false;
                 }

                 if (view_i+2<=7) {
                     if (matrixBord[view_i+2][view_j].equals("spitak_tagavor"))
                         harvac_dashtin=false;
                 }
                 if (view_i+2<=7 && view_j-1>=0) {
                     if (matrixBord[view_i+2][view_j-1].equals("spitak_tagavor"))
                         harvac_dashtin=false;
                 }
                 if (view_i+2<=7 && view_j-2>=0) {
                     if (matrixBord[view_i+2][view_j-2].equals("spitak_tagavor"))
                         harvac_dashtin=false;
                 }
                 if (view_i+1<=7 && view_j-2>=0) {
                     if (matrixBord[view_i+1][view_j-2].equals("spitak_tagavor"))
                         harvac_dashtin=false;
                 }
                 if (view_j-2>=0) {
                     if (matrixBord[view_i][view_j-2].equals("spitak_tagavor"))
                         harvac_dashtin=false;
                 }


                 if (view_i+2<=7) {
                     if (matrixBord[view_i+2][view_j].substring(0,matrixBord[view_i+2][view_j].length()-2).equals("spitak_zinvor"))
                         harvac_dashtin=false;
                 }
                 if (view_i+2<=7 && view_j-2>=0) {
                     if (matrixBord[view_i+2][view_j-2].substring(0,matrixBord[view_i+2][view_j-2].length()-2).equals("spitak_zinvor"))
                         harvac_dashtin=false;
                 }
             }


             if (matrixBord[view_i+1][view_j-1].equals("datark") && harvac_dashtin==true) {
                 imageRamkaTagavor_6=new ImageView(this);
                 imageRamkaTagavor_6.setImageResource(R.drawable.ramka);
                 params_images = new RelativeLayout.LayoutParams(widthLayoutMatrix / 8, widthLayoutMatrix / 8);
                 params_images.setMargins(leftTagavor - 10-widthLayoutMatrix/8,
                         topTagavor - 10+widthLayoutMatrix/8, 0, 0);
                 rLayout.addView(imageRamkaTagavor_6, params_images);
                 imageClicked = imageName;
                 clickedRamkaTagavor_6 = "1";
                 imageRamkaTagavor_6.setId(R.id.ramka_Tagavor_6);
                 imageRamkaTagavor_6.setOnClickListener(this);
             }
             else if (matrixBord[view_i+1][view_j-1].charAt(1)=='e' && sev_spitak==true && harvac_dashtin==true) {
                 imageRamkaTagavor_6=new ImageView(this);
                 imageRamkaTagavor_6.setImageResource(R.drawable.ramka);
                 params_images = new RelativeLayout.LayoutParams(widthLayoutMatrix / 8, widthLayoutMatrix / 8);
                 params_images.setMargins(leftTagavor - 10-widthLayoutMatrix/8,
                         topTagavor - 10+widthLayoutMatrix/8, 0, 0);
                 rLayout.addView(imageRamkaTagavor_6, params_images);
                 imageClicked = imageName;
                 clickedRamkaTagavor_6 = "1";
                 oponentTagavorString_6=matrixBord[view_i+1][view_j-1];
                 imageRamkaTagavor_6.setId(R.id.ramka_Tagavor_6);
                 imageRamkaTagavor_6.setOnClickListener(this);
             }
             else if (matrixBord[view_i+1][view_j-1].charAt(1)=='p' && sev_spitak==false && harvac_dashtin==true) {
                 imageRamkaTagavor_6=new ImageView(this);
                 imageRamkaTagavor_6.setImageResource(R.drawable.ramka);
                 params_images = new RelativeLayout.LayoutParams(widthLayoutMatrix / 8, widthLayoutMatrix / 8);
                 params_images.setMargins(leftTagavor - 10-widthLayoutMatrix/8,
                         topTagavor - 10+widthLayoutMatrix/8, 0, 0);
                 rLayout.addView(imageRamkaTagavor_6, params_images);
                 imageClicked = imageName;
                 clickedRamkaTagavor_6 = "1";
                 oponentTagavorString_6=matrixBord[view_i+1][view_j-1];
                 imageRamkaTagavor_6.setId(R.id.ramka_Tagavor_6);
                 imageRamkaTagavor_6.setOnClickListener(this);
             }
         }

                 harvac_dashtin=true;

         if (view_j-1>=0) {

             if (sev_spitak==true) {
                 for (int i = view_j-2; i >= 0; i--) {
                     if (matrixBord[view_i][i].substring(0,matrixBord[view_i][i].length()-2).equals("sev_navak")
                             || matrixBord[view_i][i].substring(0,matrixBord[view_i][i].length()-2).equals("sev_taguhi")
                             || matrixBord[view_i][i].substring(0,matrixBord[view_i][i].length()).equals("sev_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[view_i][i].substring(0,matrixBord[view_i][i].length()-2).equals("sev_pix")
                             || matrixBord[view_i][i].substring(0,matrixBord[view_i][i].length()-2).equals("sev_dzi")
                             || matrixBord[view_i][i].substring(0,matrixBord[view_i][i].length()-2).equals("sev_zinvor")
                             || matrixBord[view_i][i].substring(0,matrixBord[view_i][i].length()).equals("sev_tagavor")
                             || matrixBord[view_i][i].charAt(1)=='p') {
                         break;
                     }
                 }

                 for (int i=view_j+1; i<8; i++) {
                     if (matrixBord[view_i][i].substring(0,matrixBord[view_i][i].length()-2).equals("sev_navak")
                             || matrixBord[view_i][i].substring(0,matrixBord[view_i][i].length()-2).equals("sev_taguhi")
                             || matrixBord[view_i][i].substring(0,matrixBord[view_i][i].length()).equals("sev_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[view_i][i].substring(0,matrixBord[view_i][i].length()-2).equals("sev_pix")
                             || matrixBord[view_i][i].substring(0,matrixBord[view_i][i].length()-2).equals("sev_dzi")
                             || matrixBord[view_i][i].substring(0,matrixBord[view_i][i].length()-2).equals("sev_zinvor")
                             || matrixBord[view_i][i].substring(0,matrixBord[view_i][i].length()).equals("sev_tagavor")
                             || matrixBord[view_i][i].charAt(1)=='p') {
                         break;
                     }
                 }

                 for (int i=view_i-1; i>=0; i--) {
                     if (matrixBord[i][view_j-1].substring(0,matrixBord[i][view_j-1].length()-2).equals("sev_navak")
                             || matrixBord[i][view_j-1].substring(0,matrixBord[i][view_j-1].length()-2).equals("sev_taguhi")
                             || matrixBord[i][view_j-1].substring(0,matrixBord[i][view_j-1].length()).equals("sev_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[i][view_j-1].substring(0,matrixBord[i][view_j-1].length()-2).equals("sev_pix")
                             || matrixBord[i][view_j-1].substring(0,matrixBord[i][view_j-1].length()-2).equals("sev_dzi")
                             || matrixBord[i][view_j-1].substring(0,matrixBord[i][view_j-1].length()-2).equals("sev_zinvor")
                             || matrixBord[i][view_j-1].substring(0,matrixBord[i][view_j-1].length()).equals("sev_tagavor")
                             || matrixBord[i][view_j-1].charAt(1)=='p') {
                         break;
                     }
                 }
                 for (int i=view_i+1; i<=7; i++) {
                     if (matrixBord[i][view_j-1].substring(0,matrixBord[i][view_j-1].length()-2).equals("sev_navak")
                             || matrixBord[i][view_j-1].substring(0,matrixBord[i][view_j-1].length()-2).equals("sev_taguhi")
                             || matrixBord[i][view_j-1].substring(0,matrixBord[i][view_j-1].length()).equals("sev_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[i][view_j-1].substring(0,matrixBord[i][view_j-1].length()-2).equals("sev_pix")
                             || matrixBord[i][view_j-1].substring(0,matrixBord[i][view_j-1].length()-2).equals("sev_dzi")
                             || matrixBord[i][view_j-1].substring(0,matrixBord[i][view_j-1].length()-2).equals("sev_zinvor")
                             || matrixBord[i][view_j-1].substring(0,matrixBord[i][view_j-1].length()).equals("sev_tagavor")
                             || matrixBord[i][view_j-1].charAt(1)=='p') {
                         break;
                     }
                 }

                 int i=view_i-1;
                 int j=view_j-2;
                 while (i>=0 && j>=0) {
                     if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_pix")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_taguhi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("sev_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_navak")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_dzi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_zinvor")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("sev_tagavor")
                             || matrixBord[i][j].charAt(1)=='p') {
                         break;
                     }
                     i--;
                     j--;
                 }

                 i=view_i+1;
                 j=view_j;

                 while (i<=7 && j<=7) {
                     if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_pix")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_taguhi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("sev_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_navak")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_dzi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_zinvor")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("sev_tagavor")
                             || matrixBord[i][j].charAt(1)=='p') {
                         break;
                     }
                     i++;
                     j++;
                 }

                 i=view_i-1;
                 j=view_j;
                 while (i>=0 && j<=7) {
                     if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_pix")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_taguhi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("sev_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_navak")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_dzi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_zinvor")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("sev_tagavor")
                             || matrixBord[i][j].charAt(1)=='p') {
                         break;
                     }
                     i--;
                     j++;
                 }

                 i=view_i+1;
                 j=view_j-2;
                 while (i<=7 && j>=0) {
                     if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_pix")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_taguhi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("sev_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_navak")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_dzi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_zinvor")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("sev_tagavor")
                             || matrixBord[i][j].charAt(1)=='p') {
                         break;
                     }
                     i++;
                     j--;
                 }

                 if (view_i-2>=0 && view_j<=7) {
                     if (matrixBord[view_i-2][view_j].substring(0,matrixBord[view_i-2][view_j].length()-2).equals("sev_dzi"))
                         harvac_dashtin=false;
                 }
                 if (view_i-2>=0 && view_j-2>=0) {
                     if (matrixBord[view_i-2][view_j-2].substring(0,matrixBord[view_i-2][view_j-2].length()-2).equals("sev_dzi"))
                         harvac_dashtin=false;
                 }
                 if (view_i-1>=0 && view_j+1<=7) {
                     if (matrixBord[view_i-1][view_j+1].substring(0,matrixBord[view_i-1][view_j+1].length()-2).equals("sev_dzi"))
                         harvac_dashtin=false;
                 }
                 if (view_i-1>=0 && view_j-3>=0) {
                     if (matrixBord[view_i-1][view_j-3].substring(0,matrixBord[view_i-1][view_j-3].length()-2).equals("sev_dzi"))
                         harvac_dashtin=false;
                 }
                 if (view_i+2<=7 && view_j<=7) {
                     if (matrixBord[view_i+2][view_j].substring(0,matrixBord[view_i+2][view_j].length()-2).equals("sev_dzi"))
                         harvac_dashtin=false;
                 }
                 if (view_i+2<=7 && view_j-2>=0) {
                     if (matrixBord[view_i+2][view_j-2].substring(0,matrixBord[view_i+2][view_j-2].length()-2).equals("sev_dzi"))
                         harvac_dashtin=false;
                 }
                 if (view_i+1<=7 && view_j+1<=7) {
                     if (matrixBord[view_i+1][view_j+1].substring(0,matrixBord[view_i+1][view_j+1].length()-2).equals("sev_dzi"))
                         harvac_dashtin=false;
                 }
                 if (view_i+1<=7 && view_j-3>=0) {
                     if (matrixBord[view_i+1][view_j-3].substring(0,matrixBord[view_i+1][view_j-3].length()-2).equals("sev_dzi"))
                         harvac_dashtin=false;
                 }

                 if (view_i-1>=0 && view_j-2>=0) {
                     if (matrixBord[view_i-1][view_j-2].equals("sev_tagavor"))
                         harvac_dashtin=false;
                 }
                 if (view_j-2>=0) {
                     if (matrixBord[view_i][view_j-2].equals("sev_tagavor"))
                         harvac_dashtin=false;
                 }
                 if (view_i+1<=7 && view_j-2>=0) {
                     if (matrixBord[view_i+1][view_j-2].equals("sev_tagavor"))
                         harvac_dashtin=false;
                 }


                 if (view_i-1>=0 && view_j-2>=0) {
                     if (matrixBord[view_i-1][view_j-2].substring(0,matrixBord[view_i-1][view_j-2].length()-2).equals("sev_zinvor"))
                         harvac_dashtin=false;
                 }
                 if (view_i-1>=0) {
                     if (matrixBord[view_i-1][view_j].substring(0,matrixBord[view_i-1][view_j].length()-2).equals("sev_zinvor"))
                         harvac_dashtin=false;
                 }


             }
             else  {

                 for (int i = view_j-2; i >= 0; i--) {
                     if (matrixBord[view_i][i].substring(0,matrixBord[view_i][i].length()-2).equals("spitak_navak")
                             || matrixBord[view_i][i].substring(0,matrixBord[view_i][i].length()-2).equals("spitak_taguhi")
                             || matrixBord[view_i][i].substring(0,matrixBord[view_i][i].length()).equals("spitak_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[view_i][i].substring(0,matrixBord[view_i][i].length()-2).equals("spitak_pix")
                             || matrixBord[view_i][i].substring(0,matrixBord[view_i][i].length()-2).equals("spitak_dzi")
                             || matrixBord[view_i][i].substring(0,matrixBord[view_i][i].length()-2).equals("spitak_zinvor")
                             || matrixBord[view_i][i].substring(0,matrixBord[view_i][i].length()).equals("spitak_tagavor")
                             || matrixBord[view_i][i].charAt(1)=='e') {
                         break;
                     }
                 }

                 for (int i=view_j+1; i<8; i++) {
                     if (matrixBord[view_i][i].substring(0,matrixBord[view_i][i].length()-2).equals("spitak_navak")
                             || matrixBord[view_i][i].substring(0,matrixBord[view_i][i].length()-2).equals("spitak_taguhi")
                             || matrixBord[view_i][i].substring(0,matrixBord[view_i][i].length()).equals("spitak_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[view_i][i].substring(0,matrixBord[view_i][i].length()-2).equals("spitak_pix")
                             || matrixBord[view_i][i].substring(0,matrixBord[view_i][i].length()-2).equals("spitak_dzi")
                             || matrixBord[view_i][i].substring(0,matrixBord[view_i][i].length()-2).equals("spitak_zinvor")
                             || matrixBord[view_i][i].substring(0,matrixBord[view_i][i].length()).equals("spitak_tagavor")
                             || matrixBord[view_i][i].charAt(1)=='e') {
                         break;
                     }
                 }

                 for (int i=view_i-1; i>=0; i--) {
                     if (matrixBord[i][view_j-1].substring(0,matrixBord[i][view_j-1].length()-2).equals("spitak_navak")
                             || matrixBord[i][view_j-1].substring(0,matrixBord[i][view_j-1].length()-2).equals("spitak_taguhi")
                             || matrixBord[i][view_j-1].substring(0,matrixBord[i][view_j-1].length()).equals("spitak_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[i][view_j-1].substring(0,matrixBord[i][view_j-1].length()-2).equals("spitak_pix")
                             || matrixBord[i][view_j-1].substring(0,matrixBord[i][view_j-1].length()-2).equals("spitak_dzi")
                             || matrixBord[i][view_j-1].substring(0,matrixBord[i][view_j-1].length()-2).equals("spitak_zinvor")
                             || matrixBord[i][view_j-1].substring(0,matrixBord[i][view_j-1].length()).equals("spitak_tagavor")
                             || matrixBord[i][view_j-1].charAt(1)=='e') {
                         break;
                     }
                 }
                 for (int i=view_i+1; i<=7; i++) {
                     if (matrixBord[i][view_j-1].substring(0,matrixBord[i][view_j-1].length()-2).equals("spitak_navak")
                             || matrixBord[i][view_j-1].substring(0,matrixBord[i][view_j-1].length()-2).equals("spitak_taguhi")
                             || matrixBord[i][view_j-1].substring(0,matrixBord[i][view_j-1].length()).equals("spitak_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[i][view_j-1].substring(0,matrixBord[i][view_j-1].length()-2).equals("spitak_pix")
                             || matrixBord[i][view_j-1].substring(0,matrixBord[i][view_j-1].length()-2).equals("spitak_dzi")
                             || matrixBord[i][view_j-1].substring(0,matrixBord[i][view_j-1].length()-2).equals("spitak_zinvor")
                             || matrixBord[i][view_j-1].substring(0,matrixBord[i][view_j-1].length()).equals("spitak_tagavor")
                             || matrixBord[i][view_j-1].charAt(1)=='e') {
                         break;
                     }
                 }

                 int i=view_i-1;
                 int j=view_j-2;
                 while (i>=0 && j>=0) {
                     if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_pix")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_taguhi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("spitak_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_navak")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_dzi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_zinvor")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("spitak_tagavor")
                             || matrixBord[i][j].charAt(1)=='e') {
                         break;
                     }
                     i--;
                     j--;
                 }

                 i=view_i+1;
                 j=view_j;

                 while (i<=7 && j<=7) {
                     if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_pix")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_taguhi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("spitak_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_navak")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_dzi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_zinvor")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("spitak_tagavor")
                             || matrixBord[i][j].charAt(1)=='e') {
                         break;
                     }
                     i++;
                     j++;
                 }

                 i=view_i-1;
                 j=view_j;
                 while (i>=0 && j<=7) {
                     if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_pix")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_taguhi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("spitak_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_navak")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_dzi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_zinvor")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("spitak_tagavor")
                             || matrixBord[i][j].charAt(1)=='e') {
                         break;
                     }
                     i--;
                     j++;
                 }

                 i=view_i+1;
                 j=view_j-2;
                 while (i<=7 && j>=0) {
                     if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_pix")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_taguhi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("spitak_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_navak")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_dzi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_zinvor")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("spitak_tagavor")
                             || matrixBord[i][j].charAt(1)=='e') {
                         break;
                     }
                     i++;
                     j--;
                 }

                 if (view_i-2>=0 && view_j<=7) {
                     if (matrixBord[view_i-2][view_j].substring(0,matrixBord[view_i-2][view_j].length()-2).equals("spitak_dzi"))
                         harvac_dashtin=false;
                 }
                 if (view_i-2>=0 && view_j-2>=0) {
                     if (matrixBord[view_i-2][view_j-2].substring(0,matrixBord[view_i-2][view_j-2].length()-2).equals("spitak_dzi"))
                         harvac_dashtin=false;
                 }
                 if (view_i-1>=0 && view_j+1<=7) {
                     if (matrixBord[view_i-1][view_j+1].substring(0,matrixBord[view_i-1][view_j+1].length()-2).equals("spitak_dzi"))
                         harvac_dashtin=false;
                 }
                 if (view_i-1>=0 && view_j-3>=0) {
                     if (matrixBord[view_i-1][view_j-3].substring(0,matrixBord[view_i-1][view_j-3].length()-2).equals("spitak_dzi"))
                         harvac_dashtin=false;
                 }
                 if (view_i+2<=7 && view_j<=7) {
                     if (matrixBord[view_i+2][view_j].substring(0,matrixBord[view_i+2][view_j].length()-2).equals("spitak_dzi"))
                         harvac_dashtin=false;
                 }
                 if (view_i+2<=7 && view_j-2>=0) {
                     if (matrixBord[view_i+2][view_j-2].substring(0,matrixBord[view_i+2][view_j-2].length()-2).equals("spitak_dzi"))
                         harvac_dashtin=false;
                 }
                 if (view_i+1<=7 && view_j+1<=7) {
                     if (matrixBord[view_i+1][view_j+1].substring(0,matrixBord[view_i+1][view_j+1].length()-2).equals("spitak_dzi"))
                         harvac_dashtin=false;
                 }
                 if (view_i+1<=7 && view_j-3>=0) {
                     if (matrixBord[view_i+1][view_j-3].substring(0,matrixBord[view_i+1][view_j-3].length()-2).equals("spitak_dzi"))
                         harvac_dashtin=false;
                 }

                 if (view_i-1>=0 && view_j-2>=0) {
                     if (matrixBord[view_i-1][view_j-2].equals("spitak_tagavor"))
                         harvac_dashtin=false;
                 }
                 if (view_j-2>=0) {
                     if (matrixBord[view_i][view_j-2].equals("spitak_tagavor"))
                         harvac_dashtin=false;
                 }
                 if (view_i+1<=7 && view_j-2>=0) {
                     if (matrixBord[view_i+1][view_j-2].equals("spitak_tagavor"))
                         harvac_dashtin=false;
                 }

                 if (view_i+1<=7) {
                     if (matrixBord[view_i+1][view_j].substring(0,matrixBord[view_i+1][view_j].length()-2).equals("spitak_zinvor"))
                         harvac_dashtin=false;
                 }
                 if (view_i+1<=7 && view_j-2>=0) {
                     if (matrixBord[view_i+1][view_j-2].substring(0,matrixBord[view_i+1][view_j-2].length()-2).equals("spitak_zinvor"))
                         harvac_dashtin=false;
                 }
             }

             if (matrixBord[view_i][view_j-1].equals("datark") && harvac_dashtin==true) {
                 imageRamkaTagavor_7=new ImageView(this);
                 imageRamkaTagavor_7.setImageResource(R.drawable.ramka);
                 params_images = new RelativeLayout.LayoutParams(widthLayoutMatrix / 8, widthLayoutMatrix / 8);
                 params_images.setMargins(leftTagavor - 10-widthLayoutMatrix/8,
                         topTagavor - 10, 0, 0);
                 rLayout.addView(imageRamkaTagavor_7, params_images);
                 imageClicked = imageName;
                 clickedRamkaTagavor_7 = "1";
                 imageRamkaTagavor_7.setId(R.id.ramka_Tagavor_7);
                 imageRamkaTagavor_7.setOnClickListener(this);
             }
             else if (matrixBord[view_i][view_j-1].charAt(1)=='e' && sev_spitak==true && harvac_dashtin==true) {
                 imageRamkaTagavor_7=new ImageView(this);
                 imageRamkaTagavor_7.setImageResource(R.drawable.ramka);
                 params_images = new RelativeLayout.LayoutParams(widthLayoutMatrix / 8, widthLayoutMatrix / 8);
                 params_images.setMargins(leftTagavor - 10-widthLayoutMatrix/8,
                         topTagavor - 10, 0, 0);
                 rLayout.addView(imageRamkaTagavor_7, params_images);
                 imageClicked = imageName;
                 clickedRamkaTagavor_7 = "1";
                 oponentTagavorString_7=matrixBord[view_i][view_j-1];
                 imageRamkaTagavor_7.setId(R.id.ramka_Tagavor_7);
                 imageRamkaTagavor_7.setOnClickListener(this);
             }
             else if (matrixBord[view_i][view_j-1].charAt(1)=='p' && sev_spitak==false && harvac_dashtin==true) {
                 imageRamkaTagavor_7=new ImageView(this);
                 imageRamkaTagavor_7.setImageResource(R.drawable.ramka);
                 params_images = new RelativeLayout.LayoutParams(widthLayoutMatrix / 8, widthLayoutMatrix / 8);
                 params_images.setMargins(leftTagavor - 10-widthLayoutMatrix/8,
                         topTagavor - 10, 0, 0);
                 rLayout.addView(imageRamkaTagavor_7, params_images);
                 imageClicked = imageName;
                 clickedRamkaTagavor_7 = "1";
                 oponentTagavorString_7=matrixBord[view_i][view_j-1];
                 imageRamkaTagavor_7.setId(R.id.ramka_Tagavor_7);
                 imageRamkaTagavor_7.setOnClickListener(this);
             }

         }

                 harvac_dashtin=true;

         if (view_i-1>=0 && view_j-1>=0) {

             if (sev_spitak==true) {
                 for (int i = view_j-2; i >= 0; i--) {
                     if (matrixBord[view_i-1][i].substring(0,matrixBord[view_i-1][i].length()-2).equals("sev_navak")
                             || matrixBord[view_i-1][i].substring(0,matrixBord[view_i-1][i].length()-2).equals("sev_taguhi")
                             || matrixBord[view_i-1][i].substring(0,matrixBord[view_i-1][i].length()).equals("sev_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[view_i-1][i].substring(0,matrixBord[view_i-1][i].length()-2).equals("sev_pix")
                             || matrixBord[view_i-1][i].substring(0,matrixBord[view_i-1][i].length()-2).equals("sev_dzi")
                             || matrixBord[view_i-1][i].substring(0,matrixBord[view_i-1][i].length()-2).equals("sev_zinvor")
                             || matrixBord[view_i-1][i].substring(0,matrixBord[view_i-1][i].length()).equals("sev_tagavor")
                             || matrixBord[view_i-1][i].charAt(1)=='p') {
                         break;
                     }
                 }

                 for (int i=view_j; i<8; i++) {
                     if (matrixBord[view_i-1][i].substring(0,matrixBord[view_i-1][i].length()-2).equals("sev_navak")
                             || matrixBord[view_i-1][i].substring(0,matrixBord[view_i-1][i].length()-2).equals("sev_taguhi")
                             || matrixBord[view_i-1][i].substring(0,matrixBord[view_i-1][i].length()).equals("sev_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[view_i-1][i].substring(0,matrixBord[view_i-1][i].length()-2).equals("sev_pix")
                             || matrixBord[view_i-1][i].substring(0,matrixBord[view_i-1][i].length()-2).equals("sev_dzi")
                             || matrixBord[view_i-1][i].substring(0,matrixBord[view_i-1][i].length()-2).equals("sev_zinvor")
                             || matrixBord[view_i-1][i].substring(0,matrixBord[view_i-1][i].length()).equals("sev_tagavor")
                             || matrixBord[view_i-1][i].charAt(1)=='p') {
                         break;
                     }
                 }

                 for (int i=view_i-2; i>=0; i--) {
                     if (matrixBord[i][view_j-1].substring(0,matrixBord[i][view_j-1].length()-2).equals("sev_navak")
                             || matrixBord[i][view_j-1].substring(0,matrixBord[i][view_j-1].length()-2).equals("sev_taguhi")
                             || matrixBord[i][view_j-1].substring(0,matrixBord[i][view_j-1].length()).equals("sev_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[i][view_j-1].substring(0,matrixBord[i][view_j-1].length()-2).equals("sev_pix")
                             || matrixBord[i][view_j-1].substring(0,matrixBord[i][view_j-1].length()-2).equals("sev_dzi")
                             || matrixBord[i][view_j-1].substring(0,matrixBord[i][view_j-1].length()-2).equals("sev_zinvor")
                             || matrixBord[i][view_j-1].substring(0,matrixBord[i][view_j-1].length()).equals("sev_tagavor")
                             || matrixBord[i][view_j-1].charAt(1)=='p') {
                         break;
                     }
                 }
                 for (int i=view_i; i<=7; i++) {
                     if (matrixBord[i][view_j-1].substring(0,matrixBord[i][view_j-1].length()-2).equals("sev_navak")
                             || matrixBord[i][view_j-1].substring(0,matrixBord[i][view_j-1].length()-2).equals("sev_taguhi")
                             || matrixBord[i][view_j-1].substring(0,matrixBord[i][view_j-1].length()).equals("sev_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[i][view_j-1].substring(0,matrixBord[i][view_j-1].length()-2).equals("sev_pix")
                             || matrixBord[i][view_j-1].substring(0,matrixBord[i][view_j-1].length()-2).equals("sev_dzi")
                             || matrixBord[i][view_j-1].substring(0,matrixBord[i][view_j-1].length()-2).equals("sev_zinvor")
                             || matrixBord[i][view_j-1].substring(0,matrixBord[i][view_j-1].length()).equals("sev_tagavor")
                             || matrixBord[i][view_j-1].charAt(1)=='p') {
                         break;
                     }
                 }

                 int i=view_i-2;
                 int j=view_j-2;
                 while (i>=0 && j>=0) {
                     if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_pix")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_taguhi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("sev_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_navak")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_dzi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_zinvor")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("sev_tagavor")
                             || matrixBord[i][j].charAt(1)=='p') {
                         break;
                     }
                     i--;
                     j--;
                 }

                 i=view_i+1;
                 j=view_j+1;

                 while (i<=7 && j<=7) {
                     if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_pix")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_taguhi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("sev_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_navak")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_dzi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_zinvor")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("sev_tagavor")
                             || matrixBord[i][j].charAt(1)=='p') {
                         break;
                     }
                     i++;
                     j++;
                 }

                 i=view_i-2;
                 j=view_j;
                 while (i>=0 && j<=7) {
                     if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_pix")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_taguhi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("sev_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_navak")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_dzi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_zinvor")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("sev_tagavor")
                             || matrixBord[i][j].charAt(1)=='p') {
                         break;
                     }
                     i--;
                     j++;
                 }

                 i=view_i;
                 j=view_j-2;
                 while (i<=7 && j>=0) {
                     if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_pix")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_taguhi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("sev_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_navak")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_dzi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_zinvor")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("sev_tagavor")
                             || matrixBord[i][j].charAt(1)=='p') {
                         break;
                     }
                     i++;
                     j--;
                 }

                 if (view_i-3>=0 && view_j<=7) {
                     if (matrixBord[view_i-3][view_j].substring(0,matrixBord[view_i-3][view_j].length()-2).equals("sev_dzi"))
                         harvac_dashtin=false;
                 }
                 if (view_i-3>=0 && view_j-2>=0) {
                     if (matrixBord[view_i-3][view_j-2].substring(0,matrixBord[view_i-3][view_j-2].length()-2).equals("sev_dzi"))
                         harvac_dashtin=false;
                 }
                 if (view_i-2>=0 && view_j+1<=7) {
                     if (matrixBord[view_i-2][view_j+1].substring(0,matrixBord[view_i-2][view_j+1].length()-2).equals("sev_dzi"))
                         harvac_dashtin=false;
                 }
                 if (view_i-2>=0 && view_j-3>=0) {
                     if (matrixBord[view_i-2][view_j-3].substring(0,matrixBord[view_i-2][view_j-3].length()-2).equals("sev_dzi"))
                         harvac_dashtin=false;
                 }
                 if (view_i+1<=7 && view_j<=7) {
                     if (matrixBord[view_i+1][view_j].substring(0,matrixBord[view_i+1][view_j].length()-2).equals("sev_dzi"))
                         harvac_dashtin=false;
                 }
                 if (view_i+1<=7 && view_j-2>=0) {
                     if (matrixBord[view_i+1][view_j-2].substring(0,matrixBord[view_i+1][view_j-2].length()-2).equals("sev_dzi"))
                         harvac_dashtin=false;
                 }
                 if (view_i<=7 && view_j+1<=7) {
                     if (matrixBord[view_i][view_j+1].substring(0,matrixBord[view_i][view_j+1].length()-2).equals("sev_dzi"))
                         harvac_dashtin=false;
                 }
                 if (view_i<=7 && view_j-3>=0) {
                     if (matrixBord[view_i][view_j-3].substring(0,matrixBord[view_i][view_j-3].length()-2).equals("sev_dzi"))
                         harvac_dashtin=false;
                 }

                 if (view_j-2>=0) {
                     if (matrixBord[view_i][view_j-2].equals("sev_tagavor"))
                         harvac_dashtin=false;
                 }
                 if (view_i-1>=0 && view_j-2>=0) {
                     if (matrixBord[view_i-1][view_j-2].equals("sev_tagavor"))
                         harvac_dashtin=false;
                 }
                 if (view_i-2>=0 && view_j-2>=0) {
                     if (matrixBord[view_i-2][view_j-2].equals("sev_tagavor"))
                         harvac_dashtin=false;
                 }
                 if (view_i-2>=0 && view_j-1>=0) {
                     if (matrixBord[view_i-2][view_j-1].equals("sev_tagavor"))
                         harvac_dashtin=false;
                 }
                 if (view_i-2>=0) {
                     if (matrixBord[view_i-2][view_j].equals("sev_tagavor"))
                         harvac_dashtin=false;
                 }


                 if (view_i-2>=0 && view_j-2>=0) {
                     if (matrixBord[view_i-2][view_j-2].substring(0,matrixBord[view_i-2][view_j-2].length()-2).equals("sev_zinvor"))
                         harvac_dashtin=false;
                 }
                 if (view_i-2>=0) {
                     if (matrixBord[view_i-2][view_j].substring(0,matrixBord[view_i-2][view_j].length()-2).equals("sev_zinvor"))
                         harvac_dashtin=false;
                 }


             }
             else  {

                 for (int i = view_j-2; i >= 0; i--) {
                     if (matrixBord[view_i-1][i].substring(0,matrixBord[view_i-1][i].length()-2).equals("spitak_navak")
                             || matrixBord[view_i-1][i].substring(0,matrixBord[view_i-1][i].length()-2).equals("spitak_taguhi")
                             || matrixBord[view_i-1][i].substring(0,matrixBord[view_i-1][i].length()).equals("spitak_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[view_i-1][i].substring(0,matrixBord[view_i-1][i].length()-2).equals("spitak_pix")
                             || matrixBord[view_i-1][i].substring(0,matrixBord[view_i-1][i].length()-2).equals("spitak_dzi")
                             || matrixBord[view_i-1][i].substring(0,matrixBord[view_i-1][i].length()-2).equals("spitak_zinvor")
                             || matrixBord[view_i-1][i].substring(0,matrixBord[view_i-1][i].length()).equals("spitak_tagavor")
                             || matrixBord[view_i-1][i].charAt(1)=='e') {
                         break;
                     }
                 }

                 for (int i=view_j; i<8; i++) {
                     if (matrixBord[view_i-1][i].substring(0,matrixBord[view_i-1][i].length()-2).equals("spitak_navak")
                             || matrixBord[view_i-1][i].substring(0,matrixBord[view_i-1][i].length()-2).equals("spitak_taguhi")
                             || matrixBord[view_i-1][i].substring(0,matrixBord[view_i-1][i].length()).equals("spitak_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[view_i-1][i].substring(0,matrixBord[view_i-1][i].length()-2).equals("spitak_pix")
                             || matrixBord[view_i-1][i].substring(0,matrixBord[view_i-1][i].length()-2).equals("spitak_dzi")
                             || matrixBord[view_i-1][i].substring(0,matrixBord[view_i-1][i].length()-2).equals("spitak_zinvor")
                             || matrixBord[view_i-1][i].substring(0,matrixBord[view_i-1][i].length()).equals("spitak_tagavor")
                             || matrixBord[view_i-1][i].charAt(1)=='e') {
                         break;
                     }
                 }

                 for (int i=view_i-2; i>=0; i--) {
                     if (matrixBord[i][view_j-1].substring(0,matrixBord[i][view_j-1].length()-2).equals("spitak_navak")
                             || matrixBord[i][view_j-1].substring(0,matrixBord[i][view_j-1].length()-2).equals("spitak_taguhi")
                             || matrixBord[i][view_j-1].substring(0,matrixBord[i][view_j-1].length()).equals("spitak_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[i][view_j-1].substring(0,matrixBord[i][view_j-1].length()-2).equals("spitak_pix")
                             || matrixBord[i][view_j-1].substring(0,matrixBord[i][view_j-1].length()-2).equals("spitak_dzi")
                             || matrixBord[i][view_j-1].substring(0,matrixBord[i][view_j-1].length()-2).equals("spitak_zinvor")
                             || matrixBord[i][view_j-1].substring(0,matrixBord[i][view_j-1].length()).equals("spitak_tagavor")
                             || matrixBord[i][view_j-1].charAt(1)=='e') {
                         break;
                     }
                 }
                 for (int i=view_i; i<=7; i++) {
                     if (matrixBord[i][view_j-1].substring(0,matrixBord[i][view_j-1].length()-2).equals("spitak_navak")
                             || matrixBord[i][view_j-1].substring(0,matrixBord[i][view_j-1].length()-2).equals("spitak_taguhi")
                             || matrixBord[i][view_j-1].substring(0,matrixBord[i][view_j-1].length()).equals("spitak_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[i][view_j-1].substring(0,matrixBord[i][view_j-1].length()-2).equals("spitak_pix")
                             || matrixBord[i][view_j-1].substring(0,matrixBord[i][view_j-1].length()-2).equals("spitak_dzi")
                             || matrixBord[i][view_j-1].substring(0,matrixBord[i][view_j-1].length()-2).equals("spitak_zinvor")
                             || matrixBord[i][view_j-1].substring(0,matrixBord[i][view_j-1].length()).equals("spitak_tagavor")
                             || matrixBord[i][view_j-1].charAt(1)=='e') {
                         break;
                     }
                 }

                 int i=view_i-2;
                 int j=view_j-2;
                 while (i>=0 && j>=0) {
                     if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_pix")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_taguhi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("spitak_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_navak")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_dzi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_zinvor")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("spitak_tagavor")
                             || matrixBord[i][j].charAt(1)=='e') {
                         break;
                     }
                     i--;
                     j--;
                 }

                 i=view_i+1;
                 j=view_j+1;

                 while (i<=7 && j<=7) {
                     if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_pix")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_taguhi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("spitak_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_navak")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_dzi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_zinvor")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("spitak_tagavor")
                             || matrixBord[i][j].charAt(1)=='e') {
                         break;
                     }
                     i++;
                     j++;
                 }

                 i=view_i-2;
                 j=view_j;
                 while (i>=0 && j<=7) {
                     if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_pix")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_taguhi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("spitak_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_navak")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_dzi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_zinvor")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("spitak_tagavor")
                             || matrixBord[i][j].charAt(1)=='e') {
                         break;
                     }
                     i--;
                     j++;
                 }

                 i=view_i;
                 j=view_j-2;
                 while (i<=7 && j>=0) {
                     if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_pix")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_taguhi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("spitak_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_navak")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_dzi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_zinvor")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("spitak_tagavor")
                             || matrixBord[i][j].charAt(1)=='e') {
                         break;
                     }
                     i++;
                     j--;
                 }

                 if (view_i-3>=0 && view_j<=7) {
                     if (matrixBord[view_i-3][view_j].substring(0,matrixBord[view_i-3][view_j].length()-2).equals("spitak_dzi"))
                         harvac_dashtin=false;
                 }
                 if (view_i-3>=0 && view_j-2>=0) {
                     if (matrixBord[view_i-3][view_j-2].substring(0,matrixBord[view_i-3][view_j-2].length()-2).equals("spitak_dzi"))
                         harvac_dashtin=false;
                 }
                 if (view_i-2>=0 && view_j+1<=7) {
                     if (matrixBord[view_i-2][view_j+1].substring(0,matrixBord[view_i-2][view_j+1].length()-2).equals("spitak_dzi"))
                         harvac_dashtin=false;
                 }
                 if (view_i-2>=0 && view_j-3>=0) {
                     if (matrixBord[view_i-2][view_j-3].substring(0,matrixBord[view_i-2][view_j-3].length()-2).equals("spitak_dzi"))
                         harvac_dashtin=false;
                 }
                 if (view_i+1<=7 && view_j<=7) {
                     if (matrixBord[view_i+1][view_j].substring(0,matrixBord[view_i+1][view_j].length()-2).equals("spitak_dzi"))
                         harvac_dashtin=false;
                 }
                 if (view_i+1<=7 && view_j-2>=0) {
                     if (matrixBord[view_i+1][view_j-2].substring(0,matrixBord[view_i+1][view_j-2].length()-2).equals("spitak_dzi"))
                         harvac_dashtin=false;
                 }
                 if (view_i<=7 && view_j+1<=7) {
                     if (matrixBord[view_i][view_j+1].substring(0,matrixBord[view_i][view_j+1].length()-2).equals("spitak_dzi"))
                         harvac_dashtin=false;
                 }
                 if (view_i<=7 && view_j-3>=0) {
                     if (matrixBord[view_i][view_j-3].substring(0,matrixBord[view_i][view_j-3].length()-2).equals("spitak_dzi"))
                         harvac_dashtin=false;
                 }

                 if (view_j-2>=0) {
                     if (matrixBord[view_i][view_j-2].equals("spitak_tagavor"))
                         harvac_dashtin=false;
                 }
                 if (view_i-1>=0 && view_j-2>=0) {
                     if (matrixBord[view_i-1][view_j-2].equals("spitak_tagavor"))
                         harvac_dashtin=false;
                 }
                 if (view_i-2>=0 && view_j-2>=0) {
                     if (matrixBord[view_i-2][view_j-2].equals("spitak_tagavor"))
                         harvac_dashtin=false;
                 }
                 if (view_i-2>=0 && view_j-1>=0) {
                     if (matrixBord[view_i-2][view_j-1].equals("spitak_tagavor"))
                         harvac_dashtin=false;
                 }
                 if (view_i-2>=0) {
                     if (matrixBord[view_i-2][view_j].equals("spitak_tagavor"))
                         harvac_dashtin=false;
                 }


                 if (view_j-2>=0) {
                     if (matrixBord[view_i][view_j-2].substring(0,matrixBord[view_i][view_j-2].length()-2).equals("spitak_zinvor"))
                         harvac_dashtin=false;
                 }

             }

             if (matrixBord[view_i-1][view_j-1].equals("datark") && harvac_dashtin==true) {
                 imageRamkaTagavor_8=new ImageView(this);
                 imageRamkaTagavor_8.setImageResource(R.drawable.ramka);
                 params_images = new RelativeLayout.LayoutParams(widthLayoutMatrix / 8, widthLayoutMatrix / 8);
                 params_images.setMargins(leftTagavor - 10-widthLayoutMatrix/8,
                         topTagavor - 10-widthLayoutMatrix/8, 0, 0);
                 rLayout.addView(imageRamkaTagavor_8, params_images);
                 imageClicked = imageName;
                 clickedRamkaTagavor_8 = "1";
                 imageRamkaTagavor_8.setId(R.id.ramka_Tagavor_8);
                 imageRamkaTagavor_8.setOnClickListener(this);
             }
             else if (matrixBord[view_i-1][view_j-1].charAt(1)=='e' && sev_spitak==true && harvac_dashtin==true) {
                 imageRamkaTagavor_8=new ImageView(this);
                 imageRamkaTagavor_8.setImageResource(R.drawable.ramka);
                 params_images = new RelativeLayout.LayoutParams(widthLayoutMatrix / 8, widthLayoutMatrix / 8);
                 params_images.setMargins(leftTagavor - 10-widthLayoutMatrix/8,
                         topTagavor - 10-widthLayoutMatrix/8, 0, 0);
                 rLayout.addView(imageRamkaTagavor_8, params_images);
                 imageClicked = imageName;
                 clickedRamkaTagavor_8 = "1";
                 oponentTagavorString_8=matrixBord[view_i-1][view_j-1];
                 imageRamkaTagavor_8.setId(R.id.ramka_Tagavor_8);
                 imageRamkaTagavor_8.setOnClickListener(this);
             }
             else if (matrixBord[view_i-1][view_j-1].charAt(1)=='p' && sev_spitak==false && harvac_dashtin==true) {
                 imageRamkaTagavor_8=new ImageView(this);
                 imageRamkaTagavor_8.setImageResource(R.drawable.ramka);
                 params_images = new RelativeLayout.LayoutParams(widthLayoutMatrix / 8, widthLayoutMatrix / 8);
                 params_images.setMargins(leftTagavor - 10-widthLayoutMatrix/8,
                         topTagavor - 10-widthLayoutMatrix/8, 0, 0);
                 rLayout.addView(imageRamkaTagavor_8, params_images);
                 imageClicked = imageName;

                 clickedRamkaTagavor_8 = "1";
                 oponentTagavorString_8=matrixBord[view_i-1][view_j-1];
                 imageRamkaTagavor_8.setId(R.id.ramka_Tagavor_8);
                 imageRamkaTagavor_8.setOnClickListener(this);
             }

         }

         if ((sev_spitak==true && shax_spitak_tagavor1==true) || (sev_spitak==false && shax_sev_tagavor1==true))
         tagaorRakirovkaRamka(imageTagavor, leftTagavor, topTagavor, imageName,sev_spitak);


     }

     //-------------tagavor_rakirovka_ramka_metod---------------------------------------------------------------------

     private void tagaorRakirovkaRamka(ImageView imageTagavor, int leftTagavor, int topTagavor, String imageName, boolean sev_spitak) {


      boolean  harvac_dashtin=true;

         if ((sev_spitak==true && qayl_spitak_tagavor==true && qayl_spitak_navak_1==true)
                 || (sev_spitak==false && qayl_sev_tagavor==true && qayl_sev_navak_1==true)) {

             if (sev_spitak==true) {


                 for (int i=view_i-1; i>=0; i--) {
                     if (matrixBord[i][view_j-1].substring(0,matrixBord[i][view_j-1].length()-2).equals("sev_navak")
                             || matrixBord[i][view_j-1].substring(0,matrixBord[i][view_j-1].length()-2).equals("sev_taguhi")
                             || matrixBord[i][view_j-1].substring(0,matrixBord[i][view_j-1].length()).equals("sev_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[i][view_j-1].substring(0,matrixBord[i][view_j-1].length()-2).equals("sev_pix")
                             || matrixBord[i][view_j-1].substring(0,matrixBord[i][view_j-1].length()-2).equals("sev_dzi")
                             || matrixBord[i][view_j-1].substring(0,matrixBord[i][view_j-1].length()-2).equals("sev_zinvor")
                             || matrixBord[i][view_j-1].substring(0,matrixBord[i][view_j-1].length()).equals("sev_tagavor")
                             || matrixBord[i][view_j-1].charAt(1)=='p') {
                         break;
                     }
                 }
                 for (int i=view_i-1; i>=0; i--) {
                     if (matrixBord[i][view_j-2].substring(0,matrixBord[i][view_j-2].length()-2).equals("sev_navak")
                             || matrixBord[i][view_j-2].substring(0,matrixBord[i][view_j-2].length()-2).equals("sev_taguhi")
                             || matrixBord[i][view_j-2].substring(0,matrixBord[i][view_j-2].length()).equals("sev_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[i][view_j-2].substring(0,matrixBord[i][view_j-2].length()-2).equals("sev_pix")
                             || matrixBord[i][view_j-2].substring(0,matrixBord[i][view_j-2].length()-2).equals("sev_dzi")
                             || matrixBord[i][view_j-2].substring(0,matrixBord[i][view_j-2].length()-2).equals("sev_zinvor")
                             || matrixBord[i][view_j-2].substring(0,matrixBord[i][view_j-2].length()).equals("sev_tagavor")
                             || matrixBord[i][view_j-2].charAt(1)=='p') {
                         break;
                     }
                 }

                 int i=view_i-1;
                 int j=view_j-2;
                 while (i>=0 && j>=0) {
                     if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_pix")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_taguhi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("sev_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_navak")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_dzi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_zinvor")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("sev_tagavor")
                             || matrixBord[i][j].charAt(1)=='p') {
                         break;
                     }
                     i--;
                     j--;
                 }

                 i=view_i-1;
                 j=view_j-3;
                 while (i>=0 && j>=0) {
                     if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_pix")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_taguhi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("sev_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_navak")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_dzi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_zinvor")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("sev_tagavor")
                             || matrixBord[i][j].charAt(1)=='p') {
                         break;
                     }
                     i--;
                     j--;
                 }

                 i=view_i-1;
                 j=view_j;
                 while (i>=0 && j<=7) {
                     if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_pix")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_taguhi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("sev_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_navak")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_dzi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_zinvor")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("sev_tagavor")
                             || matrixBord[i][j].charAt(1)=='p') {
                         break;
                     }
                     i--;
                     j++;
                 }

                 i=view_i-1;
                 j=view_j-1;
                 while (i>=0 && j<=7) {
                     if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_pix")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_taguhi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("sev_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_navak")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_dzi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_zinvor")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("sev_tagavor")
                             || matrixBord[i][j].charAt(1)=='p') {
                         break;
                     }
                     i--;
                     j++;
                 }


                 if (matrixBord[view_i-1][view_j-3].substring(0,matrixBord[view_i-1][view_j-3].length()-2).equals("sev_dzi"))
                     harvac_dashtin=false;
                 if (matrixBord[view_i-2][view_j-2].substring(0,matrixBord[view_i-2][view_j-2].length()-2).equals("sev_dzi"))
                     harvac_dashtin=false;
                 if (matrixBord[view_i-2][view_j].substring(0,matrixBord[view_i-2][view_j].length()-2).equals("sev_dzi"))
                     harvac_dashtin=false;
                 if (matrixBord[view_i-1][view_j+1].substring(0,matrixBord[view_i-1][view_j+1].length()-2).equals("sev_dzi"))
                     harvac_dashtin=false;

                 if (matrixBord[view_i-1][view_j-4].substring(0,matrixBord[view_i-1][view_j-4].length()-2).equals("sev_dzi"))
                     harvac_dashtin=false;
                 if (matrixBord[view_i-2][view_j-3].substring(0,matrixBord[view_i-2][view_j-3].length()-2).equals("sev_dzi"))
                     harvac_dashtin=false;
                 if (matrixBord[view_i-2][view_j-1].substring(0,matrixBord[view_i-2][view_j-1].length()-2).equals("sev_dzi"))
                     harvac_dashtin=false;
                 if (matrixBord[view_i-1][view_j].substring(0,matrixBord[view_i-1][view_j].length()-2).equals("sev_dzi"))
                     harvac_dashtin=false;


                 if (matrixBord[view_i-1][view_j-2].equals("sev_tagavor"))
                     harvac_dashtin=false;
                 if (matrixBord[view_i-1][view_j-3].equals("sev_tagavor"))
                     harvac_dashtin=false;


                 if (matrixBord[view_i-1][view_j].substring(0,matrixBord[view_i-1][view_j].length()-2).equals("sev_zinvor"))
                     harvac_dashtin=false;
                 if (matrixBord[view_i-1][view_j-1].substring(0,matrixBord[view_i-1][view_j-1].length()-2).equals("sev_zinvor"))
                     harvac_dashtin=false;
                 if (matrixBord[view_i-1][view_j-2].substring(0,matrixBord[view_i-1][view_j-2].length()-2).equals("sev_zinvor"))
                     harvac_dashtin=false;
                 if (matrixBord[view_i-1][view_j-3].substring(0,matrixBord[view_i-1][view_j-3].length()-2).equals("sev_zinvor"))
                     harvac_dashtin=false;

             }
             else  {

                 for (int i=view_i+1; i<=7; i++) {
                     if (matrixBord[i][view_j-1].substring(0,matrixBord[i][view_j-1].length()-2).equals("spitak_navak")
                             || matrixBord[i][view_j-1].substring(0,matrixBord[i][view_j-1].length()-2).equals("spitak_taguhi")
                             || matrixBord[i][view_j-1].substring(0,matrixBord[i][view_j-1].length()).equals("spitak_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[i][view_j-1].substring(0,matrixBord[i][view_j-1].length()-2).equals("spitak_pix")
                             || matrixBord[i][view_j-1].substring(0,matrixBord[i][view_j-1].length()-2).equals("spitak_dzi")
                             || matrixBord[i][view_j-1].substring(0,matrixBord[i][view_j-1].length()-2).equals("spitak_zinvor")
                             || matrixBord[i][view_j-1].substring(0,matrixBord[i][view_j-1].length()).equals("spitak_tagavor")
                             || matrixBord[i][view_j-1].charAt(1)=='e') {
                         break;
                     }
                 }

                 for (int i=view_i+1; i<=7; i++) {
                     if (matrixBord[i][view_j-2].substring(0,matrixBord[i][view_j-2].length()-2).equals("spitak_navak")
                             || matrixBord[i][view_j-2].substring(0,matrixBord[i][view_j-2].length()-2).equals("spitak_taguhi")
                             || matrixBord[i][view_j-2].substring(0,matrixBord[i][view_j-2].length()).equals("spitak_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[i][view_j-2].substring(0,matrixBord[i][view_j-2].length()-2).equals("spitak_pix")
                             || matrixBord[i][view_j-2].substring(0,matrixBord[i][view_j-2].length()-2).equals("spitak_dzi")
                             || matrixBord[i][view_j-2].substring(0,matrixBord[i][view_j-2].length()-2).equals("spitak_zinvor")
                             || matrixBord[i][view_j-2].substring(0,matrixBord[i][view_j-2].length()).equals("spitak_tagavor")
                             || matrixBord[i][view_j-2].charAt(1)=='e') {
                         break;
                     }
                 }

                 int i=view_i+1;
                 int j=view_j;

                 while (i<=7 && j<=7) {
                     if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_pix")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_taguhi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("spitak_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_navak")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_dzi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_zinvor")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("spitak_tagavor")
                             || matrixBord[i][j].charAt(1)=='e') {
                         break;
                     }
                     i++;
                     j++;
                 }

                 i=view_i+1;
                 j=view_j-1;

                 while (i<=7 && j<=7) {
                     if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_pix")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_taguhi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("spitak_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_navak")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_dzi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_zinvor")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("spitak_tagavor")
                             || matrixBord[i][j].charAt(1)=='e') {
                         break;
                     }
                     i++;
                     j++;
                 }


                 i=view_i+1;
                 j=view_j-2;
                 while (i<=7 && j>=0) {
                     if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_pix")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_taguhi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("spitak_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_navak")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_dzi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_zinvor")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("spitak_tagavor")
                             || matrixBord[i][j].charAt(1)=='e') {
                         break;
                     }
                     i++;
                     j--;
                 }

                 i=view_i+1;
                 j=view_j-3;
                 while (i<=7 && j>=0) {
                     if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_pix")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_taguhi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("spitak_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_navak")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_dzi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_zinvor")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("spitak_tagavor")
                             || matrixBord[i][j].charAt(1)=='e') {
                         break;
                     }
                     i++;
                     j--;
                 }


                 if (matrixBord[view_i+1][view_j+1].substring(0,matrixBord[view_i+1][view_j+1].length()-2).equals("spitak_dzi"))
                     harvac_dashtin=false;
                 if (matrixBord[view_i+2][view_j].substring(0,matrixBord[view_i+2][view_j].length()-2).equals("spitak_dzi"))
                     harvac_dashtin=false;
                 if (matrixBord[view_i+2][view_j-2].substring(0,matrixBord[view_i+2][view_j-2].length()-2).equals("spitak_dzi"))
                     harvac_dashtin=false;
                 if (matrixBord[view_i+1][view_j-3].substring(0,matrixBord[view_i+1][view_j-3].length()-2).equals("spitak_dzi"))
                     harvac_dashtin=false;

                 if (matrixBord[view_i+1][view_j].substring(0,matrixBord[view_i+1][view_j].length()-2).equals("spitak_dzi"))
                     harvac_dashtin=false;
                 if (matrixBord[view_i+2][view_j-1].substring(0,matrixBord[view_i+2][view_j-1].length()-2).equals("spitak_dzi"))
                     harvac_dashtin=false;
                 if (matrixBord[view_i+2][view_j-3].substring(0,matrixBord[view_i+2][view_j-3].length()-2).equals("spitak_dzi"))
                     harvac_dashtin=false;
                 if (matrixBord[view_i+1][view_j-4].substring(0,matrixBord[view_i+1][view_j-4].length()-2).equals("spitak_dzi"))
                     harvac_dashtin=false;


                 if (matrixBord[view_i+1][view_j-2].equals("spitak_tagavor"))
                     harvac_dashtin=false;
                 if (matrixBord[view_i+1][view_j-3].equals("spitak_tagavor"))
                     harvac_dashtin=false;


                 if (matrixBord[view_i+1][view_j].substring(0,matrixBord[view_i+1][view_j].length()-2).equals("spitak_zinvor"))
                     harvac_dashtin=false;
                 if (matrixBord[view_i+1][view_j-1].substring(0,matrixBord[view_i+1][view_j-1].length()-2).equals("spitak_zinvor"))
                     harvac_dashtin=false;
                 if (matrixBord[view_i+1][view_j-2].substring(0,matrixBord[view_i+1][view_j-2].length()-2).equals("spitak_zinvor"))
                     harvac_dashtin=false;
                 if (matrixBord[view_i+1][view_j-3].substring(0,matrixBord[view_i+1][view_j-3].length()-2).equals("spitak_zinvor"))
                     harvac_dashtin=false;

             }


             if (matrixBord[view_i][view_j-1].equals("datark")
                     && matrixBord[view_i][view_j-2].equals("datark")
                     && matrixBord[view_i][view_j-3].equals("datark") && harvac_dashtin==true) {
                 imageRamkaTagavor_9=new ImageView(this);
                 imageRamkaTagavor_9.setImageResource(R.drawable.ramka);
                 params_images = new RelativeLayout.LayoutParams(widthLayoutMatrix / 8, widthLayoutMatrix / 8);
                 params_images.setMargins(leftTagavor - 10-2*widthLayoutMatrix/8,
                         topTagavor - 10, 0, 0);
                 rLayout.addView(imageRamkaTagavor_9, params_images);
                 imageClicked = imageName;
                 clickedRamkaTagavor_9 = "1";
                 imageRamkaTagavor_9.setId(R.id.ramka_Tagavor_9);
                 imageRamkaTagavor_9.setOnClickListener(this);
             }
         }


           harvac_dashtin=true;

         if ((sev_spitak==true && qayl_spitak_tagavor==true && qayl_spitak_navak_2==true)
                 || (sev_spitak==false && qayl_sev_tagavor==true && qayl_sev_navak_2==true)) {

             if (sev_spitak==true) {



                 for (int i=view_i-1; i>=0; i--) {
                     if (matrixBord[i][view_j+1].substring(0,matrixBord[i][view_j+1].length()-2).equals("sev_navak")
                             || matrixBord[i][view_j+1].substring(0,matrixBord[i][view_j+1].length()-2).equals("sev_taguhi")
                             || matrixBord[i][view_j+1].substring(0,matrixBord[i][view_j+1].length()).equals("sev_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[i][view_j+1].substring(0,matrixBord[i][view_j+1].length()-2).equals("sev_pix")
                             || matrixBord[i][view_j+1].substring(0,matrixBord[i][view_j+1].length()-2).equals("sev_dzi")
                             || matrixBord[i][view_j+1].substring(0,matrixBord[i][view_j+1].length()-2).equals("sev_zinvor")
                             || matrixBord[i][view_j+1].substring(0,matrixBord[i][view_j+1].length()).equals("sev_tagavor")
                             || matrixBord[i][view_j+1].charAt(1)=='p') {
                         break;
                     }
                 }
                 for (int i=view_i-1; i>=0; i--) {
                     if (matrixBord[i][view_j+2].substring(0,matrixBord[i][view_j+2].length()-2).equals("sev_navak")
                             || matrixBord[i][view_j+2].substring(0,matrixBord[i][view_j+2].length()-2).equals("sev_taguhi")
                             || matrixBord[i][view_j+2].substring(0,matrixBord[i][view_j+2].length()).equals("sev_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[i][view_j+2].substring(0,matrixBord[i][view_j+2].length()-2).equals("sev_pix")
                             || matrixBord[i][view_j+2].substring(0,matrixBord[i][view_j+2].length()-2).equals("sev_dzi")
                             || matrixBord[i][view_j+2].substring(0,matrixBord[i][view_j+2].length()-2).equals("sev_zinvor")
                             || matrixBord[i][view_j+2].substring(0,matrixBord[i][view_j+2].length()).equals("sev_tagavor")
                             || matrixBord[i][view_j+2].charAt(1)=='p') {
                         break;
                     }
                 }

                 int i=view_i-1;
                 int j=view_j;
                 while (i>=0 && j>=0) {
                     if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_pix")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_taguhi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("sev_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_navak")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_dzi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_zinvor")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("sev_tagavor")
                             || matrixBord[i][j].charAt(1)=='p') {
                         break;
                     }
                     i--;
                     j--;
                 }

                 i=view_i-1;
                 j=view_j+1;
                 while (i>=0 && j>=0) {
                     if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_pix")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_taguhi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("sev_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_navak")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_dzi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_zinvor")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("sev_tagavor")
                             || matrixBord[i][j].charAt(1)=='p') {
                         break;
                     }
                     i--;
                     j--;
                 }

                 i=view_i-1;
                 j=view_j+2;
                 while (i>=0 && j<=7) {
                     if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_pix")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_taguhi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("sev_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_navak")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_dzi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_zinvor")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("sev_tagavor")
                             || matrixBord[i][j].charAt(1)=='p') {
                         break;
                     }
                     i--;
                     j++;
                 }

                 i=view_i-1;
                 j=view_j+3;
                 while (i>=0 && j<=7) {
                     if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_pix")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_taguhi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("sev_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_navak")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_dzi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_zinvor")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("sev_tagavor")
                             || matrixBord[i][j].charAt(1)=='p') {
                         break;
                     }
                     i--;
                     j++;
                 }


                 if (matrixBord[view_i-1][view_j-1].substring(0,matrixBord[view_i-1][view_j-1].length()-2).equals("sev_dzi"))
                     harvac_dashtin=false;
                 if (matrixBord[view_i-2][view_j].substring(0,matrixBord[view_i-2][view_j].length()-2).equals("sev_dzi"))
                     harvac_dashtin=false;
                 if (matrixBord[view_i-2][view_j+2].substring(0,matrixBord[view_i-2][view_j+2].length()-2).equals("sev_dzi"))
                     harvac_dashtin=false;
                 if (matrixBord[view_i-1][view_j+3].substring(0,matrixBord[view_i-1][view_j+3].length()-2).equals("sev_dzi"))
                     harvac_dashtin=false;

                 if (matrixBord[view_i-1][view_j].substring(0,matrixBord[view_i-1][view_j].length()-2).equals("sev_dzi"))
                     harvac_dashtin=false;
                 if (matrixBord[view_i-2][view_j+1].substring(0,matrixBord[view_i-2][view_j+1].length()-2).equals("sev_dzi"))
                     harvac_dashtin=false;
                 if (matrixBord[view_i-2][view_j+3].substring(0,matrixBord[view_i-2][view_j+3].length()-2).equals("sev_dzi"))
                     harvac_dashtin=false;



                 if (matrixBord[view_i-1][view_j+2].equals("sev_tagavor"))
                     harvac_dashtin=false;
                 if (matrixBord[view_i-1][view_j+3].equals("sev_tagavor"))
                     harvac_dashtin=false;


                 if (matrixBord[view_i-1][view_j].substring(0,matrixBord[view_i-1][view_j].length()-2).equals("sev_zinvor"))
                     harvac_dashtin=false;
                 if (matrixBord[view_i-1][view_j+1].substring(0,matrixBord[view_i-1][view_j+1].length()-2).equals("sev_zinvor"))
                     harvac_dashtin=false;
                 if (matrixBord[view_i-1][view_j+2].substring(0,matrixBord[view_i-1][view_j+2].length()-2).equals("sev_zinvor"))
                     harvac_dashtin=false;
                 if (matrixBord[view_i-1][view_j+3].substring(0,matrixBord[view_i-1][view_j+3].length()-2).equals("sev_zinvor"))
                     harvac_dashtin=false;

             }
             else  {

                 for (int i=view_i+1; i<=7; i++) {
                     if (matrixBord[i][view_j+1].substring(0,matrixBord[i][view_j+1].length()-2).equals("spitak_navak")
                             || matrixBord[i][view_j+1].substring(0,matrixBord[i][view_j+1].length()-2).equals("spitak_taguhi")
                             || matrixBord[i][view_j+1].substring(0,matrixBord[i][view_j+1].length()).equals("spitak_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[i][view_j+1].substring(0,matrixBord[i][view_j+1].length()-2).equals("spitak_pix")
                             || matrixBord[i][view_j+1].substring(0,matrixBord[i][view_j+1].length()-2).equals("spitak_dzi")
                             || matrixBord[i][view_j+1].substring(0,matrixBord[i][view_j+1].length()-2).equals("spitak_zinvor")
                             || matrixBord[i][view_j+1].substring(0,matrixBord[i][view_j+1].length()).equals("spitak_tagavor")
                             || matrixBord[i][view_j+1].charAt(1)=='e') {
                         break;
                     }
                 }

                 for (int i=view_i+1; i<=7; i++) {
                     if (matrixBord[i][view_j+2].substring(0,matrixBord[i][view_j+2].length()-2).equals("spitak_navak")
                             || matrixBord[i][view_j+2].substring(0,matrixBord[i][view_j+2].length()-2).equals("spitak_taguhi")
                             || matrixBord[i][view_j+2].substring(0,matrixBord[i][view_j+2].length()).equals("spitak_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[i][view_j+2].substring(0,matrixBord[i][view_j+2].length()-2).equals("spitak_pix")
                             || matrixBord[i][view_j+2].substring(0,matrixBord[i][view_j+2].length()-2).equals("spitak_dzi")
                             || matrixBord[i][view_j+2].substring(0,matrixBord[i][view_j+2].length()-2).equals("spitak_zinvor")
                             || matrixBord[i][view_j+2].substring(0,matrixBord[i][view_j+2].length()).equals("spitak_tagavor")
                             || matrixBord[i][view_j+2].charAt(1)=='e') {
                         break;
                     }
                 }


                 int i=view_i+1;
                 int j=view_j+2;

                 while (i<=7 && j<=7) {
                     if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_pix")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_taguhi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("spitak_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_navak")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_dzi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_zinvor")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("spitak_tagavor")
                             || matrixBord[i][j].charAt(1)=='e') {
                         break;
                     }
                     i++;
                     j++;
                 }

                 i=view_i+1;
                 j=view_j+3;

                 while (i<=7 && j<=7) {
                     if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_pix")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_taguhi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("spitak_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_navak")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_dzi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_zinvor")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("spitak_tagavor")
                             || matrixBord[i][j].charAt(1)=='e') {
                         break;
                     }
                     i++;
                     j++;
                 }


                 i=view_i+1;
                 j=view_j;
                 while (i<=7 && j>=0) {
                     if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_pix")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_taguhi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("spitak_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_navak")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_dzi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_zinvor")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("spitak_tagavor")
                             || matrixBord[i][j].charAt(1)=='e') {
                         break;
                     }
                     i++;
                     j--;
                 }

                 i=view_i+1;
                 j=view_j+1;
                 while (i<=7 && j>=0) {
                     if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_pix")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_taguhi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("spitak_taguhi")) {
                         harvac_dashtin=false;
                         break;
                     }
                     else if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_navak")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_dzi")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_zinvor")
                             || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("spitak_tagavor")
                             || matrixBord[i][j].charAt(1)=='e') {
                         break;
                     }
                     i++;
                     j--;
                 }


                 if (matrixBord[view_i+1][view_j-1].substring(0,matrixBord[view_i+1][view_j-1].length()-2).equals("spitak_dzi"))
                     harvac_dashtin=false;
                 if (matrixBord[view_i+2][view_j].substring(0,matrixBord[view_i+2][view_j].length()-2).equals("spitak_dzi"))
                     harvac_dashtin=false;
                 if (matrixBord[view_i+2][view_j+2].substring(0,matrixBord[view_i+2][view_j+2].length()-2).equals("spitak_dzi"))
                     harvac_dashtin=false;
                 if (matrixBord[view_i+1][view_j+3].substring(0,matrixBord[view_i+1][view_j+3].length()-2).equals("spitak_dzi"))
                     harvac_dashtin=false;

                 if (matrixBord[view_i+1][view_j].substring(0,matrixBord[view_i+1][view_j].length()-2).equals("spitak_dzi"))
                     harvac_dashtin=false;
                 if (matrixBord[view_i+2][view_j+1].substring(0,matrixBord[view_i+2][view_j+1].length()-2).equals("spitak_dzi"))
                     harvac_dashtin=false;
                 if (matrixBord[view_i+2][view_j+3].substring(0,matrixBord[view_i+2][view_j+3].length()-2).equals("spitak_dzi"))
                     harvac_dashtin=false;


                 if (matrixBord[view_i+1][view_j+2].equals("spitak_tagavor"))
                     harvac_dashtin=false;
                 if (matrixBord[view_i+1][view_j+3].equals("spitak_tagavor"))
                     harvac_dashtin=false;


                 if (matrixBord[view_i+1][view_j].substring(0,matrixBord[view_i+1][view_j].length()-2).equals("spitak_zinvor"))
                     harvac_dashtin=false;
                 if (matrixBord[view_i+1][view_j+1].substring(0,matrixBord[view_i+1][view_j+1].length()-2).equals("spitak_zinvor"))
                     harvac_dashtin=false;
                 if (matrixBord[view_i+1][view_j+2].substring(0,matrixBord[view_i+1][view_j+2].length()-2).equals("spitak_zinvor"))
                     harvac_dashtin=false;
                 if (matrixBord[view_i+1][view_j+3].substring(0,matrixBord[view_i+1][view_j+3].length()-2).equals("spitak_zinvor"))
                     harvac_dashtin=false;

             }


             if (matrixBord[view_i][view_j+1].equals("datark")
                     && matrixBord[view_i][view_j+2].equals("datark")
                     && harvac_dashtin==true) {
                 imageRamkaTagavor_10=new ImageView(this);
                 imageRamkaTagavor_10.setImageResource(R.drawable.ramka);
                 params_images = new RelativeLayout.LayoutParams(widthLayoutMatrix / 8, widthLayoutMatrix / 8);
                 params_images.setMargins(leftTagavor - 10+2*widthLayoutMatrix/8,
                         topTagavor - 10, 0, 0);
                 rLayout.addView(imageRamkaTagavor_10, params_images);
                 imageClicked = imageName;
                 clickedRamkaTagavor_10 = "1";
                 imageRamkaTagavor_10.setId(R.id.ramka_Tagavor_10);
                 imageRamkaTagavor_10.setOnClickListener(this);
             }
         }
     }


     //----------------tagavor_ramka_click-----------------------------------------------------------

     private void clickTagavorRamka(ImageView imageRamka, String oponentImageString) {


        if (!oponentImageString.equals("r1") && !oponentImageString.equals("r2")) {
            if (imageClicked.equals("spitak_tagavor")) {


                tagavor_spitak.animate().translationXBy(imageRamka.getLeft()
                        - spitak_tagavor_left + 10).translationYBy(
                        imageRamka.getTop() - spitak_tagavor_top + 10).setDuration(300);

                spitak_tagavor_left += imageRamka.getLeft() - spitak_tagavor_left + 10;
                spitak_tagavor_top += imageRamka.getTop() - spitak_tagavor_top + 10;

                imageClickedColor = false;
                qayl_spitak_tagavor = false;

            } else if (imageClicked.equals("sev_tagavor")) {

                tagavor_sev.animate().translationXBy(imageRamka.getLeft()
                        - sev_tagavor_left + 10).translationYBy(
                        imageRamka.getTop() - sev_tagavor_top + 10).setDuration(300);

                sev_tagavor_left += imageRamka.getLeft() - sev_tagavor_left + 10;
                sev_tagavor_top += imageRamka.getTop() - sev_tagavor_top + 10;

                imageClickedColor = true;
                qayl_sev_tagavor = false;
            }

        }
        else if (oponentImageString.equals("r1")) {
            if (imageClicked.equals("spitak_tagavor")) {


                tagavor_spitak.animate().translationXBy(imageRamka.getLeft()
                        - spitak_tagavor_left + 10).translationYBy(
                        imageRamka.getTop() - spitak_tagavor_top + 10).setDuration(300);

                spitak_tagavor_left += imageRamka.getLeft() - spitak_tagavor_left + 10;
                spitak_tagavor_top += imageRamka.getTop() - spitak_tagavor_top + 10;

                navak_spitak_1.animate().translationXBy(imageRamka.getLeft()-spitak_navak_1_left+10+widthLayoutMatrix/8).translationYBy(
                        0).setDuration(300);

                spitak_navak_1_left+=imageRamka.getLeft()-spitak_navak_1_left+10+widthLayoutMatrix/8;

                imageClickedColor = false;
                qayl_spitak_tagavor = false;

            } else if (imageClicked.equals("sev_tagavor")) {

                tagavor_sev.animate().translationXBy(imageRamka.getLeft()
                        - sev_tagavor_left + 10).translationYBy(
                        imageRamka.getTop() - sev_tagavor_top + 10).setDuration(300);

                sev_tagavor_left += imageRamka.getLeft() - sev_tagavor_left + 10;
                sev_tagavor_top += imageRamka.getTop() - sev_tagavor_top + 10;

                navak_sev_1.animate().translationXBy(imageRamka.getLeft()-sev_navak_1_left+10+widthLayoutMatrix/8).translationYBy(
                        0).setDuration(300);

                sev_navak_1_left+=imageRamka.getLeft()-sev_navak_1_left+10+widthLayoutMatrix/8;

                imageClickedColor = true;
                qayl_sev_tagavor = false;
            }
        }
        else if (oponentImageString.equals("r2")) {
            if (imageClicked.equals("spitak_tagavor")) {


                tagavor_spitak.animate().translationXBy(imageRamka.getLeft()
                        - spitak_tagavor_left + 10).translationYBy(
                        imageRamka.getTop() - spitak_tagavor_top + 10).setDuration(300);

                spitak_tagavor_left += imageRamka.getLeft() - spitak_tagavor_left + 10;
                spitak_tagavor_top += imageRamka.getTop() - spitak_tagavor_top + 10;

                navak_spitak_2.animate().translationXBy(imageRamka.getLeft()-spitak_navak_2_left+10-widthLayoutMatrix/8).translationYBy(
                        0).setDuration(300);

                spitak_navak_2_left+=imageRamka.getLeft()-spitak_navak_2_left+10-widthLayoutMatrix/8;

                imageClickedColor = false;
                qayl_spitak_tagavor = false;

            } else if (imageClicked.equals("sev_tagavor")) {

                tagavor_sev.animate().translationXBy(imageRamka.getLeft()
                        - sev_tagavor_left + 10).translationYBy(
                        imageRamka.getTop() - sev_tagavor_top + 10).setDuration(300);

                sev_tagavor_left += imageRamka.getLeft() - sev_tagavor_left + 10;
                sev_tagavor_top += imageRamka.getTop() - sev_tagavor_top + 10;

                navak_sev_2.animate().translationXBy(imageRamka.getLeft()-sev_navak_2_left+10-widthLayoutMatrix/8).translationYBy(
                        0).setDuration(300);

                sev_navak_2_left+=imageRamka.getLeft()-sev_navak_2_left+10-widthLayoutMatrix/8;

                imageClickedColor = true;
                qayl_sev_tagavor = false;
            }
        }


         String s=oponentImageString;

         if (!s.equals("") && !s.equals("r1") && !s.equals("r2")) {
             if (s.equals("sev_zinvor_1")) {

                 zinvor_sev_1.setVisibility(View.GONE);
                 for (int i = 0; i < 8; i++) {
                     for (int j = 0; j < 8; j++) {
                         if (matrixBord[i][j].equals("sev_zinvor_1")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }


             } else if (s.equals("sev_zinvor_2")) {

                 zinvor_sev_2.setVisibility(View.GONE);
                 for (int i = 0; i < 8; i++) {
                     for (int j = 0; j < 8; j++) {
                         if (matrixBord[i][j].equals("sev_zinvor_2")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             } else if (s.equals("sev_zinvor_3")) {

                 zinvor_sev_3.setVisibility(View.GONE);
                 for (int i = 0; i < 8; i++) {
                     for (int j = 0; j < 8; j++) {
                         if (matrixBord[i][j].equals("sev_zinvor_3")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             } else if (s.equals("sev_zinvor_4")) {

                 zinvor_sev_4.setVisibility(View.GONE);
                 for (int i = 0; i < 8; i++) {
                     for (int j = 0; j < 8; j++) {
                         if (matrixBord[i][j].equals("sev_zinvor_4")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             } else if (s.equals("sev_zinvor_5")) {

                 zinvor_sev_5.setVisibility(View.GONE);
                 for (int i = 0; i < 8; i++) {
                     for (int j = 0; j < 8; j++) {
                         if (matrixBord[i][j].equals("sev_zinvor_5")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             } else if (s.equals("sev_zinvor_6")) {

                 zinvor_sev_6.setVisibility(View.GONE);
                 for (int i = 0; i < 8; i++) {
                     for (int j = 0; j < 8; j++) {
                         if (matrixBord[i][j].equals("sev_zinvor_6")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             } else if (s.equals("sev_zinvor_7")) {

                 zinvor_sev_7.setVisibility(View.GONE);
                 for (int i = 0; i < 8; i++) {
                     for (int j = 0; j < 8; j++) {
                         if (matrixBord[i][j].equals("sev_zinvor_7")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             } else if (s.equals("sev_zinvor_8")) {

                 zinvor_sev_8.setVisibility(View.GONE);
                 for (int i = 0; i < 8; i++) {
                     for (int j = 0; j < 8; j++) {
                         if (matrixBord[i][j].equals("sev_zinvor_8")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             } else if (s.equals("sev_navak_1")) {

                 navak_sev_1.setVisibility(View.GONE);
                 for (int i = 0; i < 8; i++) {
                     for (int j = 0; j < 8; j++) {
                         if (matrixBord[i][j].equals("sev_navak_1")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             } else if (s.equals("sev_navak_2")) {

                 navak_sev_2.setVisibility(View.GONE);
                 for (int i = 0; i < 8; i++) {
                     for (int j = 0; j < 8; j++) {
                         if (matrixBord[i][j].equals("sev_navak_2")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             } else if (s.equals("sev_navak_3")) {

                 zinvor_sev_1.setVisibility(View.GONE);
                 for (int i = 0; i < 8; i++) {
                     for (int j = 0; j < 8; j++) {
                         if (matrixBord[i][j].equals("sev_navak_3")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             } else if (s.equals("sev_navak_4")) {

                 zinvor_sev_2.setVisibility(View.GONE);
                 for (int i = 0; i < 8; i++) {
                     for (int j = 0; j < 8; j++) {
                         if (matrixBord[i][j].equals("sev_navak_4")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             } else if (s.equals("sev_navak_5")) {

                 zinvor_sev_3.setVisibility(View.GONE);
                 for (int i = 0; i < 8; i++) {
                     for (int j = 0; j < 8; j++) {
                         if (matrixBord[i][j].equals("sev_navak_5")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             } else if (s.equals("sev_navak_6")) {

                 zinvor_sev_4.setVisibility(View.GONE);
                 for (int i = 0; i < 8; i++) {
                     for (int j = 0; j < 8; j++) {
                         if (matrixBord[i][j].equals("sev_navak_6")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             } else if (s.equals("sev_navak_7")) {

                 zinvor_sev_5.setVisibility(View.GONE);
                 for (int i = 0; i < 8; i++) {
                     for (int j = 0; j < 8; j++) {
                         if (matrixBord[i][j].equals("sev_navak_7")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             } else if (s.equals("sev_navak_8")) {

                 zinvor_sev_6.setVisibility(View.GONE);
                 for (int i = 0; i < 8; i++) {
                     for (int j = 0; j < 8; j++) {
                         if (matrixBord[i][j].equals("sev_navak_8")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             } else if (s.equals("sev_navak_9")) {

                 zinvor_sev_7.setVisibility(View.GONE);
                 for (int i = 0; i < 8; i++) {
                     for (int j = 0; j < 8; j++) {
                         if (matrixBord[i][j].equals("sev_navak_9")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             } else if (s.equals("sev_navak_0")) {

                 zinvor_sev_8.setVisibility(View.GONE);
                 for (int i = 0; i < 8; i++) {
                     for (int j = 0; j < 8; j++) {
                         if (matrixBord[i][j].equals("sev_navak_0")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             } else if (s.equals("sev_dzi_1")) {

                 dzi_sev_1.setVisibility(View.GONE);
                 for (int i = 0; i < 8; i++) {
                     for (int j = 0; j < 8; j++) {
                         if (matrixBord[i][j].equals("sev_dzi_1")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             } else if (s.equals("sev_dzi_2")) {

                 dzi_sev_2.setVisibility(View.GONE);
                 for (int i = 0; i < 8; i++) {
                     for (int j = 0; j < 8; j++) {
                         if (matrixBord[i][j].equals("sev_dzi_2")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             } else if (s.equals("sev_dzi_3")) {

                 zinvor_sev_1.setVisibility(View.GONE);
                 for (int i = 0; i < 8; i++) {
                     for (int j = 0; j < 8; j++) {
                         if (matrixBord[i][j].equals("sev_dzi_3")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             } else if (s.equals("sev_dzi_4")) {

                 zinvor_sev_2.setVisibility(View.GONE);
                 for (int i = 0; i < 8; i++) {
                     for (int j = 0; j < 8; j++) {
                         if (matrixBord[i][j].equals("sev_dzi_4")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             } else if (s.equals("sev_dzi_5")) {

                 zinvor_sev_3.setVisibility(View.GONE);
                 for (int i = 0; i < 8; i++) {
                     for (int j = 0; j < 8; j++) {
                         if (matrixBord[i][j].equals("sev_dzi_5")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             } else if (s.equals("sev_dzi_6")) {

                 zinvor_sev_4.setVisibility(View.GONE);
                 for (int i = 0; i < 8; i++) {
                     for (int j = 0; j < 8; j++) {
                         if (matrixBord[i][j].equals("sev_dzi_6")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             } else if (s.equals("sev_dzi_7")) {

                 zinvor_sev_5.setVisibility(View.GONE);
                 for (int i = 0; i < 8; i++) {
                     for (int j = 0; j < 8; j++) {
                         if (matrixBord[i][j].equals("sev_dzi_7")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             } else if (s.equals("sev_dzi_8")) {

                 zinvor_sev_6.setVisibility(View.GONE);
                 for (int i = 0; i < 8; i++) {
                     for (int j = 0; j < 8; j++) {
                         if (matrixBord[i][j].equals("sev_dzi_8")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             } else if (s.equals("sev_dzi_9")) {

                 zinvor_sev_7.setVisibility(View.GONE);
                 for (int i = 0; i < 8; i++) {
                     for (int j = 0; j < 8; j++) {
                         if (matrixBord[i][j].equals("sev_dzi_9")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             } else if (s.equals("sev_dzi_0")) {

                 zinvor_sev_8.setVisibility(View.GONE);
                 for (int i = 0; i < 8; i++) {
                     for (int j = 0; j < 8; j++) {
                         if (matrixBord[i][j].equals("sev_dzi_0")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             } else if (s.equals("sev_pix_1")) {

                 pix_sev_1.setVisibility(View.GONE);
                 for (int i = 0; i < 8; i++) {
                     for (int j = 0; j < 8; j++) {
                         if (matrixBord[i][j].equals("sev_pix_1")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             } else if (s.equals("sev_pix_2")) {

                 pix_sev_2.setVisibility(View.GONE);
                 for (int i = 0; i < 8; i++) {
                     for (int j = 0; j < 8; j++) {
                         if (matrixBord[i][j].equals("sev_pix_2")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             } else if (s.equals("sev_pix_3")) {

                 zinvor_sev_1.setVisibility(View.GONE);
                 for (int i = 0; i < 8; i++) {
                     for (int j = 0; j < 8; j++) {
                         if (matrixBord[i][j].equals("sev_pix_3")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             } else if (s.equals("sev_pix_4")) {

                 zinvor_sev_2.setVisibility(View.GONE);
                 for (int i = 0; i < 8; i++) {
                     for (int j = 0; j < 8; j++) {
                         if (matrixBord[i][j].equals("sev_pix_4")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             } else if (s.equals("sev_pix_5")) {

                 zinvor_sev_3.setVisibility(View.GONE);
                 for (int i = 0; i < 8; i++) {
                     for (int j = 0; j < 8; j++) {
                         if (matrixBord[i][j].equals("sev_pix_5")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             } else if (s.equals("sev_pix_6")) {

                 zinvor_sev_4.setVisibility(View.GONE);
                 for (int i = 0; i < 8; i++) {
                     for (int j = 0; j < 8; j++) {
                         if (matrixBord[i][j].equals("sev_pix_6")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             } else if (s.equals("sev_pix_7")) {

                 zinvor_sev_5.setVisibility(View.GONE);
                 for (int i = 0; i < 8; i++) {
                     for (int j = 0; j < 8; j++) {
                         if (matrixBord[i][j].equals("sev_pix_7")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             } else if (s.equals("sev_pix_8")) {

                 zinvor_sev_6.setVisibility(View.GONE);
                 for (int i = 0; i < 8; i++) {
                     for (int j = 0; j < 8; j++) {
                         if (matrixBord[i][j].equals("sev_pix_8")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             } else if (s.equals("sev_pix_9")) {

                 zinvor_sev_7.setVisibility(View.GONE);
                 for (int i = 0; i < 8; i++) {
                     for (int j = 0; j < 8; j++) {
                         if (matrixBord[i][j].equals("sev_pix_9")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             } else if (s.equals("sev_pix_0")) {

                 zinvor_sev_8.setVisibility(View.GONE);
                 for (int i = 0; i < 8; i++) {
                     for (int j = 0; j < 8; j++) {
                         if (matrixBord[i][j].equals("sev_pix_0")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             } else if (s.equals("sev_taguhi")) {

                 taguhi_sev.setVisibility(View.GONE);
                 for (int i = 0; i < 8; i++) {
                     for (int j = 0; j < 8; j++) {
                         if (matrixBord[i][j].equals("sev_taguhi")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             } else if (s.equals("sev_taguhi_1")) {

                 zinvor_sev_1.setVisibility(View.GONE);
                 for (int i = 0; i < 8; i++) {
                     for (int j = 0; j < 8; j++) {
                         if (matrixBord[i][j].equals("sev_taguhi_1")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             } else if (s.equals("sev_taguhi_2")) {

                 zinvor_sev_2.setVisibility(View.GONE);
                 for (int i = 0; i < 8; i++) {
                     for (int j = 0; j < 8; j++) {
                         if (matrixBord[i][j].equals("sev_taguhi_2")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             } else if (s.equals("sev_taguhi_3")) {

                 zinvor_sev_3.setVisibility(View.GONE);
                 for (int i = 0; i < 8; i++) {
                     for (int j = 0; j < 8; j++) {
                         if (matrixBord[i][j].equals("sev_taguhi_3")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             } else if (s.equals("sev_taguhi_4")) {

                 zinvor_sev_4.setVisibility(View.GONE);
                 for (int i = 0; i < 8; i++) {
                     for (int j = 0; j < 8; j++) {
                         if (matrixBord[i][j].equals("sev_taguhi_4")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             } else if (s.equals("sev_taguhi_5")) {

                 zinvor_sev_5.setVisibility(View.GONE);
                 for (int i = 0; i < 8; i++) {
                     for (int j = 0; j < 8; j++) {
                         if (matrixBord[i][j].equals("sev_taguhi_5")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             } else if (s.equals("sev_taguhi_6")) {

                 zinvor_sev_6.setVisibility(View.GONE);
                 for (int i = 0; i < 8; i++) {
                     for (int j = 0; j < 8; j++) {
                         if (matrixBord[i][j].equals("sev_taguhi_6")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             } else if (s.equals("sev_taguhi_7")) {

                 zinvor_sev_7.setVisibility(View.GONE);
                 for (int i = 0; i < 8; i++) {
                     for (int j = 0; j < 8; j++) {
                         if (matrixBord[i][j].equals("sev_taguhi_7")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             } else if (s.equals("sev_taguhi_8")) {

                 zinvor_sev_8.setVisibility(View.GONE);
                 for (int i = 0; i < 8; i++) {
                     for (int j = 0; j < 8; j++) {
                         if (matrixBord[i][j].equals("sev_taguhi_8")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             } else if (s.equals("spitak_zinvor_1")) {

                 zinvor_spitak_1.setVisibility(View.GONE);
                 for (int i = 0; i < 8; i++) {
                     for (int j = 0; j < 8; j++) {
                         if (matrixBord[i][j].equals("spitak_zinvor_1")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             } else if (s.equals("spitak_zinvor_2")) {

                 zinvor_spitak_2.setVisibility(View.GONE);
                 for (int i = 0; i < 8; i++) {
                     for (int j = 0; j < 8; j++) {
                         if (matrixBord[i][j].equals("spitak_zinvor_2")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             } else if (s.equals("spitak_zinvor_3")) {

                 zinvor_spitak_3.setVisibility(View.GONE);
                 for (int i = 0; i < 8; i++) {
                     for (int j = 0; j < 8; j++) {
                         if (matrixBord[i][j].equals("spitak_zinvor_3")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             } else if (s.equals("spitak_zinvor_4")) {

                 zinvor_spitak_4.setVisibility(View.GONE);
                 for (int i = 0; i < 8; i++) {
                     for (int j = 0; j < 8; j++) {
                         if (matrixBord[i][j].equals("spitak_zinvor_4")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             } else if (s.equals("spitak_zinvor_5")) {

                 zinvor_spitak_5.setVisibility(View.GONE);
                 for (int i = 0; i < 8; i++) {
                     for (int j = 0; j < 8; j++) {
                         if (matrixBord[i][j].equals("spitak_zinvor_5")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             } else if (s.equals("spitak_zinvor_6")) {

                 zinvor_spitak_6.setVisibility(View.GONE);
                 for (int i = 0; i < 8; i++) {
                     for (int j = 0; j < 8; j++) {
                         if (matrixBord[i][j].equals("spitak_zinvor_6")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             } else if (s.equals("spitak_zinvor_7")) {

                 zinvor_spitak_7.setVisibility(View.GONE);
                 for (int i = 0; i < 8; i++) {
                     for (int j = 0; j < 8; j++) {
                         if (matrixBord[i][j].equals("spitak_zinvor_7")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             } else if (s.equals("spitak_zinvor_8")) {

                 zinvor_spitak_8.setVisibility(View.GONE);
                 for (int i = 0; i < 8; i++) {
                     for (int j = 0; j < 8; j++) {
                         if (matrixBord[i][j].equals("spitak_zinvor_8")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             } else if (s.equals("spitak_navak_1")) {

                 navak_spitak_1.setVisibility(View.GONE);
                 for (int i = 0; i < 8; i++) {
                     for (int j = 0; j < 8; j++) {
                         if (matrixBord[i][j].equals("spitak_navak_1")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             } else if (s.equals("spitak_navak_2")) {

                 navak_spitak_2.setVisibility(View.GONE);
                 for (int i = 0; i < 8; i++) {
                     for (int j = 0; j < 8; j++) {
                         if (matrixBord[i][j].equals("spitak_navak_2")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             } else if (s.equals("spitak_navak_3")) {

                 zinvor_spitak_1.setVisibility(View.GONE);
                 for (int i = 0; i < 8; i++) {
                     for (int j = 0; j < 8; j++) {
                         if (matrixBord[i][j].equals("spitak_navak_3")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             } else if (s.equals("spitak_navak_4")) {

                 zinvor_spitak_2.setVisibility(View.GONE);
                 for (int i = 0; i < 8; i++) {
                     for (int j = 0; j < 8; j++) {
                         if (matrixBord[i][j].equals("spitak_navak_4")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             } else if (s.equals("spitak_navak_5")) {

                 zinvor_spitak_3.setVisibility(View.GONE);
                 for (int i = 0; i < 8; i++) {
                     for (int j = 0; j < 8; j++) {
                         if (matrixBord[i][j].equals("spitak_navak_5")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             } else if (s.equals("spitak_navak_6")) {

                 zinvor_spitak_4.setVisibility(View.GONE);
                 for (int i = 0; i < 8; i++) {
                     for (int j = 0; j < 8; j++) {
                         if (matrixBord[i][j].equals("spitak_navak_6")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             } else if (s.equals("spitak_navak_7")) {

                 zinvor_spitak_5.setVisibility(View.GONE);
                 for (int i = 0; i < 8; i++) {
                     for (int j = 0; j < 8; j++) {
                         if (matrixBord[i][j].equals("spitak_navak_7")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             } else if (s.equals("spitak_navak_8")) {

                 zinvor_spitak_6.setVisibility(View.GONE);
                 for (int i = 0; i < 8; i++) {
                     for (int j = 0; j < 8; j++) {
                         if (matrixBord[i][j].equals("spitak_navak_8")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             } else if (s.equals("spitak_navak_9")) {

                 zinvor_spitak_7.setVisibility(View.GONE);
                 for (int i = 0; i < 8; i++) {
                     for (int j = 0; j < 8; j++) {
                         if (matrixBord[i][j].equals("spitak_navak_9")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             } else if (s.equals("spitak_navak_0")) {

                 zinvor_spitak_8.setVisibility(View.GONE);
                 for (int i = 0; i < 8; i++) {
                     for (int j = 0; j < 8; j++) {
                         if (matrixBord[i][j].equals("spitak_navak_0")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             } else if (s.equals("spitak_dzi_1")) {

                 dzi_spitak_1.setVisibility(View.GONE);
                 for (int i = 0; i < 8; i++) {
                     for (int j = 0; j < 8; j++) {
                         if (matrixBord[i][j].equals("spitak_dzi_1")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             } else if (s.equals("spitak_dzi_2")) {

                 dzi_spitak_2.setVisibility(View.GONE);
                 for (int i = 0; i < 8; i++) {
                     for (int j = 0; j < 8; j++) {
                         if (matrixBord[i][j].equals("spitak_dzi_2")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             } else if (s.equals("spitak_dzi_3")) {

                 zinvor_spitak_1.setVisibility(View.GONE);
                 for (int i = 0; i < 8; i++) {
                     for (int j = 0; j < 8; j++) {
                         if (matrixBord[i][j].equals("spitak_dzi_3")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             } else if (s.equals("spitak_dzi_4")) {

                 zinvor_spitak_2.setVisibility(View.GONE);
                 for (int i = 0; i < 8; i++) {
                     for (int j = 0; j < 8; j++) {
                         if (matrixBord[i][j].equals("spitak_dzi_4")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             } else if (s.equals("spitak_dzi_5")) {

                 zinvor_spitak_3.setVisibility(View.GONE);
                 for (int i = 0; i < 8; i++) {
                     for (int j = 0; j < 8; j++) {
                         if (matrixBord[i][j].equals("spitak_dzi_5")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             } else if (s.equals("spitak_dzi_6")) {

                 zinvor_spitak_4.setVisibility(View.GONE);
                 for (int i = 0; i < 8; i++) {
                     for (int j = 0; j < 8; j++) {
                         if (matrixBord[i][j].equals("spitak_dzi_6")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             } else if (s.equals("spitak_dzi_7")) {

                 zinvor_spitak_5.setVisibility(View.GONE);
                 for (int i = 0; i < 8; i++) {
                     for (int j = 0; j < 8; j++) {
                         if (matrixBord[i][j].equals("spitak_dzi_7")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             } else if (s.equals("spitak_dzi_8")) {

                 zinvor_spitak_6.setVisibility(View.GONE);
                 for (int i = 0; i < 8; i++) {
                     for (int j = 0; j < 8; j++) {
                         if (matrixBord[i][j].equals("spitak_dzi_8")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             } else if (s.equals("spitak_dzi_9")) {

                 zinvor_spitak_7.setVisibility(View.GONE);
                 for (int i = 0; i < 8; i++) {
                     for (int j = 0; j < 8; j++) {
                         if (matrixBord[i][j].equals("spitak_dzi_9")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             } else if (s.equals("spitak_dzi_0")) {

                 zinvor_spitak_8.setVisibility(View.GONE);
                 for (int i = 0; i < 8; i++) {
                     for (int j = 0; j < 8; j++) {
                         if (matrixBord[i][j].equals("spitak_dzi_0")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             } else if (s.equals("spitak_pix_1")) {

                 pix_spitak_1.setVisibility(View.GONE);
                 for (int i = 0; i < 8; i++) {
                     for (int j = 0; j < 8; j++) {
                         if (matrixBord[i][j].equals("spitak_pix_1")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             } else if (s.equals("spitak_pix_2")) {

                 pix_spitak_2.setVisibility(View.GONE);
                 for (int i = 0; i < 8; i++) {
                     for (int j = 0; j < 8; j++) {
                         if (matrixBord[i][j].equals("spitak_pix_2")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             } else if (s.equals("spitak_pix_3")) {

                 zinvor_spitak_1.setVisibility(View.GONE);
                 for (int i = 0; i < 8; i++) {
                     for (int j = 0; j < 8; j++) {
                         if (matrixBord[i][j].equals("spitak_pix_3")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             } else if (s.equals("spitak_pix_4")) {

                 zinvor_spitak_2.setVisibility(View.GONE);
                 for (int i = 0; i < 8; i++) {
                     for (int j = 0; j < 8; j++) {
                         if (matrixBord[i][j].equals("spitak_pix_4")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             } else if (s.equals("spitak_pix_5")) {

                 zinvor_spitak_3.setVisibility(View.GONE);
                 for (int i = 0; i < 8; i++) {
                     for (int j = 0; j < 8; j++) {
                         if (matrixBord[i][j].equals("spitak_pix_5")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             } else if (s.equals("spitak_pix_6")) {

                 zinvor_spitak_4.setVisibility(View.GONE);
                 for (int i = 0; i < 8; i++) {
                     for (int j = 0; j < 8; j++) {
                         if (matrixBord[i][j].equals("spitak_pix_6")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             } else if (s.equals("spitak_pix_7")) {

                 zinvor_spitak_5.setVisibility(View.GONE);
                 for (int i = 0; i < 8; i++) {
                     for (int j = 0; j < 8; j++) {
                         if (matrixBord[i][j].equals("spitak_pix_7")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             } else if (s.equals("spitak_pix_8")) {

                 zinvor_spitak_6.setVisibility(View.GONE);
                 for (int i = 0; i < 8; i++) {
                     for (int j = 0; j < 8; j++) {
                         if (matrixBord[i][j].equals("spitak_pix_8")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             } else if (s.equals("spitak_pix_9")) {

                 zinvor_spitak_7.setVisibility(View.GONE);
                 for (int i = 0; i < 8; i++) {
                     for (int j = 0; j < 8; j++) {
                         if (matrixBord[i][j].equals("spitak_pix_9")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             } else if (s.equals("spitak_pix_0")) {

                 zinvor_spitak_8.setVisibility(View.GONE);
                 for (int i = 0; i < 8; i++) {
                     for (int j = 0; j < 8; j++) {
                         if (matrixBord[i][j].equals("spitak_pix_0")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }

             } else if (s.equals("spitak_taguhi")) {

                 taguhi_spitak.setVisibility(View.GONE);
                 for (int i = 0; i < 8; i++) {
                     for (int j = 0; j < 8; j++) {
                         if (matrixBord[i][j].equals("spitak_taguhi")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }
             } else if (s.equals("spitak_taguhi_1")) {

                 zinvor_spitak_1.setVisibility(View.GONE);
                 for (int i = 0; i < 8; i++) {
                     for (int j = 0; j < 8; j++) {
                         if (matrixBord[i][j].equals("spitak_taguhi_1")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }
             } else if (s.equals("spitak_taguhi_2")) {

                 zinvor_spitak_2.setVisibility(View.GONE);
                 for (int i = 0; i < 8; i++) {
                     for (int j = 0; j < 8; j++) {
                         if (matrixBord[i][j].equals("spitak_taguhi_2")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }
             } else if (s.equals("spitak_taguhi_3")) {

                 zinvor_spitak_3.setVisibility(View.GONE);
                 for (int i = 0; i < 8; i++) {
                     for (int j = 0; j < 8; j++) {
                         if (matrixBord[i][j].equals("spitak_taguhi_3")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }
             } else if (s.equals("spitak_taguhi_4")) {

                 zinvor_spitak_4.setVisibility(View.GONE);
                 for (int i = 0; i < 8; i++) {
                     for (int j = 0; j < 8; j++) {
                         if (matrixBord[i][j].equals("spitak_taguhi_4")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }
             } else if (s.equals("spitak_taguhi_5")) {

                 zinvor_spitak_5.setVisibility(View.GONE);
                 for (int i = 0; i < 8; i++) {
                     for (int j = 0; j < 8; j++) {
                         if (matrixBord[i][j].equals("spitak_taguhi_5")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }
             } else if (s.equals("spitak_taguhi_6")) {

                 zinvor_spitak_6.setVisibility(View.GONE);
                 for (int i = 0; i < 8; i++) {
                     for (int j = 0; j < 8; j++) {
                         if (matrixBord[i][j].equals("spitak_taguhi_6")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }
             } else if (s.equals("spitak_taguhi_7")) {

                 zinvor_spitak_7.setVisibility(View.GONE);
                 for (int i = 0; i < 8; i++) {
                     for (int j = 0; j < 8; j++) {
                         if (matrixBord[i][j].equals("spitak_taguhi_7")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }
             } else if (s.equals("spitak_taguhi_8")) {

                 zinvor_spitak_8.setVisibility(View.GONE);
                 for (int i = 0; i < 8; i++) {
                     for (int j = 0; j < 8; j++) {
                         if (matrixBord[i][j].equals("spitak_taguhi_8")) {
                             matrixBord[i][j] = "datark";
                             break;
                         }
                     }
                 }
             }

         }


         oponentTagavorString_1="";
         oponentTagavorString_2="";
         oponentTagavorString_3="";
         oponentTagavorString_4="";
         oponentTagavorString_5="";
         oponentTagavorString_6="";
         oponentTagavorString_7="";
         oponentTagavorString_8="";

         if (imageRamka.equals(imageRamkaTagavor_1)) {
             String s1=matrixBord[view_i][view_j];
             matrixBord[view_i][view_j]=matrixBord[view_i-1][view_j];
             matrixBord[view_i-1][view_j]=s1;
         }
         else if (imageRamka.equals(imageRamkaTagavor_2)) {
             String s1=matrixBord[view_i][view_j];
             matrixBord[view_i][view_j]=matrixBord[view_i-1][view_j+1];
             matrixBord[view_i-1][view_j+1]=s1;
         }
         else if (imageRamka.equals(imageRamkaTagavor_3)) {
             String s1=matrixBord[view_i][view_j];
             matrixBord[view_i][view_j]=matrixBord[view_i][view_j+1];
             matrixBord[view_i][view_j+1]=s1;
         }
         else if (imageRamka.equals(imageRamkaTagavor_4)) {
             String s1=matrixBord[view_i][view_j];
             matrixBord[view_i][view_j]=matrixBord[view_i+1][view_j+1];
             matrixBord[view_i+1][view_j+1]=s1;
         }
         else if (imageRamka.equals(imageRamkaTagavor_5)) {
             String s1=matrixBord[view_i][view_j];
             matrixBord[view_i][view_j]=matrixBord[view_i+1][view_j];
             matrixBord[view_i+1][view_j]=s1;
         }
         else if (imageRamka.equals(imageRamkaTagavor_6)) {
             String s1=matrixBord[view_i][view_j];
             matrixBord[view_i][view_j]=matrixBord[view_i+1][view_j-1];
             matrixBord[view_i+1][view_j-1]=s1;
         }
         if (imageRamka.equals(imageRamkaTagavor_7)) {
             String s1=matrixBord[view_i][view_j];
             matrixBord[view_i][view_j]=matrixBord[view_i][view_j-1];
             matrixBord[view_i][view_j-1]=s1;
         }
         if (imageRamka.equals(imageRamkaTagavor_8)) {
             String s1=matrixBord[view_i][view_j];
             matrixBord[view_i][view_j]=matrixBord[view_i-1][view_j-1];
             matrixBord[view_i-1][view_j-1]=s1;
         }

         if (imageRamka.equals(imageRamkaTagavor_9)) {
             String s1=matrixBord[view_i][view_j];
             matrixBord[view_i][view_j]=matrixBord[view_i][view_j-2];
             matrixBord[view_i][view_j-2]=s1;

             s1=matrixBord[view_i][view_j-4];
             matrixBord[view_i][view_j-4]=matrixBord[view_i][view_j-1];
             matrixBord[view_i][view_j-1]=s1;
         }
         if (imageRamka.equals(imageRamkaTagavor_10)) {
             String s1=matrixBord[view_i][view_j];
             matrixBord[view_i][view_j]=matrixBord[view_i][view_j+2];
             matrixBord[view_i][view_j+2]=s1;

             s1=matrixBord[view_i][view_j+3];
             matrixBord[view_i][view_j+3]=matrixBord[view_i][view_j+1];
             matrixBord[view_i][view_j+1]=s1;
         }



         if (clickedRamkaTagavor_1.equals("1")) {
             imageRamkaTagavor_1.setVisibility(View.GONE);
             clickedRamkaTagavor_1="";
         }
         if (clickedRamkaTagavor_2.equals("1")) {
             imageRamkaTagavor_2.setVisibility(View.GONE);
             clickedRamkaTagavor_2="";
         }
         if (clickedRamkaTagavor_3.equals("1")) {
             imageRamkaTagavor_3.setVisibility(View.GONE);
             clickedRamkaTagavor_3="";
         }
         if (clickedRamkaTagavor_4.equals("1")) {
             imageRamkaTagavor_4.setVisibility(View.GONE);
             clickedRamkaTagavor_4="";
         }
         if (clickedRamkaTagavor_5.equals("1")) {
             imageRamkaTagavor_5.setVisibility(View.GONE);
             clickedRamkaTagavor_5="";
         }
         if (clickedRamkaTagavor_6.equals("1")) {
             imageRamkaTagavor_6.setVisibility(View.GONE);
             clickedRamkaTagavor_6="";
         }
         if (clickedRamkaTagavor_7.equals("1")) {
             imageRamkaTagavor_7.setVisibility(View.GONE);
             clickedRamkaTagavor_7="";
         }
         if (clickedRamkaTagavor_8.equals("1")) {
             imageRamkaTagavor_8.setVisibility(View.GONE);
             clickedRamkaTagavor_8="";
         }
         if (clickedRamkaTagavor_9.equals("1")) {
             imageRamkaTagavor_9.setVisibility(View.GONE);
             clickedRamkaTagavor_9="";
         }
         if (clickedRamkaTagavor_10.equals("1")) {
             imageRamkaTagavor_10.setVisibility(View.GONE);
             clickedRamkaTagavor_10="";
         }

         zinvorClickRAmka2_num="";
     }

     //------------------metod_zinvori_poxarinum--------------------------------------------------------------

     private void zinvorPopooxum(int num) {

         zinvor_spitak_1.setEnabled(true);
         zinvor_spitak_2.setEnabled(true);
         zinvor_spitak_3.setEnabled(true);
         zinvor_spitak_4.setEnabled(true);
         zinvor_spitak_5.setEnabled(true);
         zinvor_spitak_6.setEnabled(true);
         zinvor_spitak_7.setEnabled(true);
         zinvor_spitak_8.setEnabled(true);
         dzi_spitak_1.setEnabled(true);
         dzi_spitak_2.setEnabled(true);
         pix_spitak_1.setEnabled(true);
         pix_spitak_2.setEnabled(true);
         navak_spitak_1.setEnabled(true);
         navak_spitak_2.setEnabled(true);
         taguhi_spitak.setEnabled(true);
         tagavor_spitak.setEnabled(true);

         zinvor_sev_1.setEnabled(true);
         zinvor_sev_2.setEnabled(true);
         zinvor_sev_3.setEnabled(true);
         zinvor_sev_4.setEnabled(true);
         zinvor_sev_5.setEnabled(true);
         zinvor_sev_6.setEnabled(true);
         zinvor_sev_7.setEnabled(true);
         zinvor_sev_8.setEnabled(true);
         dzi_sev_1.setEnabled(true);
         dzi_sev_2.setEnabled(true);
         pix_sev_1.setEnabled(true);
         pix_sev_2.setEnabled(true);
         navak_sev_1.setEnabled(true);
         navak_sev_2.setEnabled(true);
         taguhi_sev.setEnabled(true);
         tagavor_sev.setEnabled(true);


         for (int i=0; i<8; i++) {
             if (matrixBord[0][i].equals("spitak_zinvor_1")) {
                 if (num==1) {
                     matrixBord[0][i] = "spitak_taguhi_1";
                     zinvor_spitak_1.setImageResource(R.drawable.taguhi_spitak);
                     zinvor_spitak_1.setId(R.id.id_taguhi_spitak1);
                 }
                 else  if (num==2) {
                     matrixBord[0][i] = "spitak_navak_3";
                     zinvor_spitak_1.setImageResource(R.drawable.navak_spitak);
                     zinvor_spitak_1.setId(R.id.id_navak_spitak_3);
                 }
                 else if (num==3) {
                     matrixBord[0][i] = "spitak_pix_3";
                     zinvor_spitak_1.setImageResource(R.drawable.pix_spitak);
                     zinvor_spitak_1.setId(R.id.id_pix_spitak_3);
                 }
                 else if (num==4) {
                     matrixBord[0][i] = "spitak_dzi_3";
                     zinvor_spitak_1.setImageResource(R.drawable.dzi_spitak);
                     zinvor_spitak_1.setId(R.id.id_dzi_spitak_3);
                 }
             }
             else   if (matrixBord[0][i].equals("spitak_zinvor_2")) {
                 if (num==1) {
                     matrixBord[0][i] = "spitak_taguhi_2";
                     zinvor_spitak_2.setImageResource(R.drawable.taguhi_spitak);
                     zinvor_spitak_2.setId(R.id.id_taguhi_spitak2);
                 }
                 else  if (num==2) {
                     matrixBord[0][i] = "spitak_navak_4";
                     zinvor_spitak_2.setImageResource(R.drawable.navak_spitak);
                     zinvor_spitak_2.setId(R.id.id_navak_spitak_4);
                 }
                 else if (num==3) {
                     matrixBord[0][i] = "spitak_pix_4";
                     zinvor_spitak_2.setImageResource(R.drawable.pix_spitak);
                     zinvor_spitak_2.setId(R.id.id_pix_spitak_4);
                 }
                 else if (num==4) {
                     matrixBord[0][i] = "spitak_dzi_4";
                     zinvor_spitak_2.setImageResource(R.drawable.dzi_spitak);
                     zinvor_spitak_2.setId(R.id.id_dzi_spitak_4);
                 }
             }
             else   if (matrixBord[0][i].equals("spitak_zinvor_3")) {
                 if (num==1) {
                     matrixBord[0][i] = "spitak_taguhi_3";
                     zinvor_spitak_3.setImageResource(R.drawable.taguhi_spitak);
                     zinvor_spitak_3.setId(R.id.id_taguhi_spitak3);
                 }
                 else  if (num==2) {
                     matrixBord[0][i] = "spitak_navak_5";
                     zinvor_spitak_3.setImageResource(R.drawable.navak_spitak);
                     zinvor_spitak_3.setId(R.id.id_navak_spitak_5);
                 }
                 else if (num==3) {
                     matrixBord[0][i] = "spitak_pix_5";
                     zinvor_spitak_3.setImageResource(R.drawable.pix_spitak);
                     zinvor_spitak_3.setId(R.id.id_pix_spitak_5);
                 }
                 else if (num==4) {
                     matrixBord[0][i] = "spitak_dzi_5";
                     zinvor_spitak_3.setImageResource(R.drawable.dzi_spitak);
                     zinvor_spitak_3.setId(R.id.id_dzi_spitak_5);
                 }
             }
             else   if (matrixBord[0][i].equals("spitak_zinvor_4")) {
                 if (num==1) {
                     matrixBord[0][i] = "spitak_taguhi_4";
                     zinvor_spitak_4.setImageResource(R.drawable.taguhi_spitak);
                     zinvor_spitak_4.setId(R.id.id_taguhi_spitak4);
                 }
                 else  if (num==2) {
                     matrixBord[0][i] = "spitak_navak_6";
                     zinvor_spitak_4.setImageResource(R.drawable.navak_spitak);
                     zinvor_spitak_4.setId(R.id.id_navak_spitak_6);
                 }
                 else if (num==3) {
                     matrixBord[0][i] = "spitak_pix_6";
                     zinvor_spitak_4.setImageResource(R.drawable.pix_spitak);
                     zinvor_spitak_4.setId(R.id.id_pix_spitak_6);
                 }
                 else if (num==4) {
                     matrixBord[0][i] = "spitak_dzi_6";
                     zinvor_spitak_4.setImageResource(R.drawable.dzi_spitak);
                     zinvor_spitak_4.setId(R.id.id_dzi_spitak_6);
                 }
             }
             else   if (matrixBord[0][i].equals("spitak_zinvor_5")) {
                 if (num==1) {
                     matrixBord[0][i] = "spitak_taguhi_5";
                     zinvor_spitak_5.setImageResource(R.drawable.taguhi_spitak);
                     zinvor_spitak_5.setId(R.id.id_taguhi_spitak5);
                 }
                 else  if (num==2) {
                     matrixBord[0][i] = "spitak_navak_7";
                     zinvor_spitak_5.setImageResource(R.drawable.navak_spitak);
                     zinvor_spitak_5.setId(R.id.id_navak_spitak_7);
                 }
                 else if (num==3) {
                     matrixBord[0][i] = "spitak_pix_7";
                     zinvor_spitak_5.setImageResource(R.drawable.pix_spitak);
                     zinvor_spitak_5.setId(R.id.id_pix_spitak_7);
                 }
                 else if (num==4) {
                     matrixBord[0][i] = "spitak_dzi_7";
                     zinvor_spitak_5.setImageResource(R.drawable.dzi_spitak);
                     zinvor_spitak_5.setId(R.id.id_dzi_spitak_7);
                 }
             }
             else   if (matrixBord[0][i].equals("spitak_zinvor_6")) {
                 if (num==1) {
                     matrixBord[0][i] = "spitak_taguhi_6";
                     zinvor_spitak_6.setImageResource(R.drawable.taguhi_spitak);
                     zinvor_spitak_6.setId(R.id.id_taguhi_spitak6);
                 }
                 else  if (num==2) {
                     matrixBord[0][i] = "spitak_navak_8";
                     zinvor_spitak_6.setImageResource(R.drawable.navak_spitak);
                     zinvor_spitak_6.setId(R.id.id_navak_spitak_8);
                 }
                 else if (num==3) {
                     matrixBord[0][i] = "spitak_pix_8";
                     zinvor_spitak_6.setImageResource(R.drawable.pix_spitak);
                     zinvor_spitak_6.setId(R.id.id_pix_spitak_8);
                 }
                 else if (num==4) {
                     matrixBord[0][i] = "spitak_dzi_8";
                     zinvor_spitak_6.setImageResource(R.drawable.dzi_spitak);
                     zinvor_spitak_6.setId(R.id.id_dzi_spitak_8);
                 }
             }
             else   if (matrixBord[0][i].equals("spitak_zinvor_7")) {
                 if (num==1) {
                     matrixBord[0][i] = "spitak_taguhi_7";
                     zinvor_spitak_7.setImageResource(R.drawable.taguhi_spitak);
                     zinvor_spitak_7.setId(R.id.id_taguhi_spitak7);
                 }
                 else  if (num==2) {
                     matrixBord[0][i] = "spitak_navak_9";
                     zinvor_spitak_7.setImageResource(R.drawable.navak_spitak);
                     zinvor_spitak_7.setId(R.id.id_navak_spitak_9);
                 }
                 else if (num==3) {
                     matrixBord[0][i] = "spitak_pix_9";
                     zinvor_spitak_7.setImageResource(R.drawable.pix_spitak);
                     zinvor_spitak_7.setId(R.id.id_pix_spitak_9);
                 }
                 else if (num==4) {
                     matrixBord[0][i] = "spitak_dzi_9";
                     zinvor_spitak_7.setImageResource(R.drawable.dzi_spitak);
                     zinvor_spitak_7.setId(R.id.id_dzi_spitak_9);
                 }
             }
             else   if (matrixBord[0][i].equals("spitak_zinvor_8")) {
                 if (num==1) {
                     matrixBord[0][i] = "spitak_taguhi_8";
                     zinvor_spitak_8.setImageResource(R.drawable.taguhi_spitak);
                     zinvor_spitak_8.setId(R.id.id_taguhi_spitak8);
                 }
                 else  if (num==2) {
                     matrixBord[0][i] = "spitak_navak_0";
                     zinvor_spitak_8.setImageResource(R.drawable.navak_spitak);
                     zinvor_spitak_8.setId(R.id.id_navak_spitak_10);
                 }
                 else if (num==3) {
                     matrixBord[0][i] = "spitak_pix_0";
                     zinvor_spitak_8.setImageResource(R.drawable.pix_spitak);
                     zinvor_spitak_8.setId(R.id.id_pix_spitak_10);
                 }
                 else if (num==4) {
                     matrixBord[0][i] = "spitak_dzi_0";
                     zinvor_spitak_8.setImageResource(R.drawable.dzi_spitak);
                     zinvor_spitak_8.setId(R.id.id_dzi_spitak_10);
                 }
             }


             else   if (matrixBord[7][i].equals("sev_zinvor_1")) {
                 if (num==1) {
                     matrixBord[7][i] = "sev_taguhi_1";
                     zinvor_sev_1.setImageResource(R.drawable.taguhi_sev);
                     zinvor_sev_1.setId(R.id.id_taguhi_sev1);
                 }
                 else  if (num==2) {
                     matrixBord[7][i] = "sev_navak_3";
                     zinvor_sev_1.setImageResource(R.drawable.navak_sev);
                     zinvor_sev_1.setId(R.id.id_navak_sev_3);
                 }
                 else if (num==3) {
                     matrixBord[7][i] = "sev_pix_3";
                     zinvor_sev_1.setImageResource(R.drawable.pix_sev);
                     zinvor_sev_1.setId(R.id.id_pix_sev_3);
                 }
                 else if (num==4) {
                     matrixBord[7][i] = "sev_dzi_3";
                     zinvor_sev_1.setImageResource(R.drawable.dzi_sev);
                     zinvor_sev_1.setId(R.id.id_dzi_sev_3);
                 }
             }
             else   if (matrixBord[7][i].equals("sev_zinvor_2")) {
                 if (num==1) {
                     matrixBord[7][i] = "sev_taguhi_2";
                     zinvor_sev_2.setImageResource(R.drawable.taguhi_sev);
                     zinvor_sev_2.setId(R.id.id_taguhi_sev2);
                 }
                 else  if (num==2) {
                     matrixBord[7][i] = "sev_navak_4";
                     zinvor_sev_2.setImageResource(R.drawable.navak_sev);
                     zinvor_sev_2.setId(R.id.id_navak_sev_4);
                 }
                 else if (num==3) {
                     matrixBord[7][i] = "sev_pix_4";
                     zinvor_sev_2.setImageResource(R.drawable.pix_sev);
                     zinvor_sev_2.setId(R.id.id_pix_sev_4);
                 }
                 else if (num==4) {
                     matrixBord[7][i] = "sev_dzi_4";
                     zinvor_sev_2.setImageResource(R.drawable.dzi_sev);
                     zinvor_sev_2.setId(R.id.id_dzi_sev_4);
                 }
             }
             else   if (matrixBord[7][i].equals("sev_zinvor_3")) {
                 if (num==1) {
                     matrixBord[7][i] = "sev_taguhi_3";
                     zinvor_sev_3.setImageResource(R.drawable.taguhi_sev);
                     zinvor_sev_3.setId(R.id.id_taguhi_sev3);
                 }
                 else  if (num==2) {
                     matrixBord[7][i] = "sev_navak_5";
                     zinvor_sev_3.setImageResource(R.drawable.navak_sev);
                     zinvor_sev_3.setId(R.id.id_navak_sev_5);
                 }
                 else if (num==3) {
                     matrixBord[7][i] = "sev_pix_5";
                     zinvor_sev_3.setImageResource(R.drawable.pix_sev);
                     zinvor_sev_3.setId(R.id.id_pix_sev_5);
                 }
                 else if (num==4) {
                     matrixBord[7][i] = "sev_dzi_5";
                     zinvor_sev_3.setImageResource(R.drawable.dzi_sev);
                     zinvor_sev_3.setId(R.id.id_dzi_sev_5);
                 }
             }
             else   if (matrixBord[7][i].equals("sev_zinvor_4")) {
                 if (num==1) {
                     matrixBord[7][i] = "sev_taguhi_4";
                     zinvor_sev_4.setImageResource(R.drawable.taguhi_sev);
                     zinvor_sev_4.setId(R.id.id_taguhi_sev4);
                 }
                 else  if (num==2) {
                     matrixBord[7][i] = "sev_navak_6";
                     zinvor_sev_4.setImageResource(R.drawable.navak_sev);
                     zinvor_sev_4.setId(R.id.id_navak_sev_6);
                 }
                 else if (num==3) {
                     matrixBord[7][i] = "sev_pix_6";
                     zinvor_sev_4.setImageResource(R.drawable.pix_sev);
                     zinvor_sev_4.setId(R.id.id_pix_sev_6);
                 }
                 else if (num==4) {
                     matrixBord[7][i] = "sev_dzi_6";
                     zinvor_sev_4.setImageResource(R.drawable.dzi_sev);
                     zinvor_sev_4.setId(R.id.id_dzi_sev_6);
                 }
             }
             else   if (matrixBord[7][i].equals("sev_zinvor_5")) {
                 if (num==1) {
                     matrixBord[7][i] = "sev_taguhi_5";
                     zinvor_sev_5.setImageResource(R.drawable.taguhi_sev);
                     zinvor_sev_5.setId(R.id.id_taguhi_sev5);
                 }
                 else  if (num==2) {
                     matrixBord[7][i] = "sev_navak_7";
                     zinvor_sev_5.setImageResource(R.drawable.navak_sev);
                     zinvor_sev_5.setId(R.id.id_navak_sev_7);
                 }
                 else if (num==3) {
                     matrixBord[7][i] = "sev_pix_7";
                     zinvor_sev_5.setImageResource(R.drawable.pix_sev);
                     zinvor_sev_5.setId(R.id.id_pix_sev_7);
                 }
                 else if (num==4) {
                     matrixBord[7][i] = "sev_dzi_7";
                     zinvor_sev_5.setImageResource(R.drawable.dzi_sev);
                     zinvor_sev_5.setId(R.id.id_dzi_sev_7);
                 }
             }
             else   if (matrixBord[7][i].equals("sev_zinvor_6")) {
                 if (num==1) {
                     matrixBord[7][i] = "sev_taguhi_6";
                     zinvor_sev_6.setImageResource(R.drawable.taguhi_sev);
                     zinvor_sev_6.setId(R.id.id_taguhi_sev6);
                 }
                 else  if (num==2) {
                     matrixBord[7][i] = "sev_navak_8";
                     zinvor_sev_6.setImageResource(R.drawable.navak_sev);
                     zinvor_sev_6.setId(R.id.id_navak_sev_8);
                 }
                 else if (num==3) {
                     matrixBord[7][i] = "sev_pix_8";
                     zinvor_sev_6.setImageResource(R.drawable.pix_sev);
                     zinvor_sev_6.setId(R.id.id_pix_sev_8);
                 }
                 else if (num==4) {
                     matrixBord[7][i] = "sev_dzi_8";
                     zinvor_sev_6.setImageResource(R.drawable.dzi_sev);
                     zinvor_sev_6.setId(R.id.id_dzi_sev_8);
                 }
             }
             else   if (matrixBord[7][i].equals("sev_zinvor_7")) {
                 if (num==1) {
                     matrixBord[7][i] = "sev_taguhi_7";
                     zinvor_sev_7.setImageResource(R.drawable.taguhi_sev);
                     zinvor_sev_7.setId(R.id.id_taguhi_sev7);
                 }
                 else  if (num==2) {
                     matrixBord[7][i] = "sev_navak_9";
                     zinvor_sev_7.setImageResource(R.drawable.navak_sev);
                     zinvor_sev_7.setId(R.id.id_navak_sev_9);
                 }
                 else if (num==3) {
                     matrixBord[7][i] = "sev_pix_9";
                     zinvor_sev_7.setImageResource(R.drawable.pix_sev);
                     zinvor_sev_7.setId(R.id.id_pix_sev_9);
                 }
                 else if (num==4) {
                     matrixBord[7][i] = "sev_dzi_9";
                     zinvor_sev_7.setImageResource(R.drawable.dzi_sev);
                     zinvor_sev_7.setId(R.id.id_dzi_sev_9);
                 }
             }
             else   if (matrixBord[7][i].equals("sev_zinvor_8")) {
                 if (num==1) {
                     matrixBord[7][i] = "sev_taguhi_8";
                     zinvor_sev_8.setImageResource(R.drawable.taguhi_sev);
                     zinvor_sev_8.setId(R.id.id_taguhi_sev8);
                 }
                 else  if (num==2) {
                     matrixBord[7][i] = "sev_navak_0";
                     zinvor_sev_8.setImageResource(R.drawable.navak_sev);
                     zinvor_sev_8.setId(R.id.id_navak_sev_10);
                 }
                 else if (num==3) {
                     matrixBord[7][i] = "sev_pix_0";
                     zinvor_sev_8.setImageResource(R.drawable.pix_sev);
                     zinvor_sev_8.setId(R.id.id_pix_sev_10);
                 }
                 else if (num==4) {
                     matrixBord[7][i] = "sev_dzi_0";
                     zinvor_sev_8.setImageResource(R.drawable.dzi_sev);
                     zinvor_sev_8.setId(R.id.id_dzi_sev_10);
                 }
             }


         }
         if (imageClickedColor==true)
             imageClickedColor=false;
         else
             imageClickedColor=true;
     }

     //-----------------shax_i stugman metod-----------------------------------------------------------------------------------

     private void shax_stugum(boolean qayl_sev_spitak) {

         shax_sev_tagavor1=true;
         shax_spitak_tagavor1=true;


        if (qayl_sev_spitak==true) {

            a2: for (int i=0; i<8; i++) {
                for (int j=0; j<8; j++) {
                    if (matrixBord[i][j].equals("sev_tagavor")) {
                        dirq_i_tagavor=i;
                        dirq_j_tagavor=j;
                        break a2;
                    }
                }
            }

            for (int i = dirq_j_tagavor - 1; i >= 0; i--) {
                if (matrixBord[dirq_i_tagavor][i].substring(0,matrixBord[dirq_i_tagavor][i].length()-2).equals("spitak_navak")
                        || matrixBord[dirq_i_tagavor][i].substring(0,matrixBord[dirq_i_tagavor][i].length()-2).equals("spitak_taguhi")
                        || matrixBord[dirq_i_tagavor][i].substring(0,matrixBord[dirq_i_tagavor][i].length()).equals("spitak_taguhi")) {

                    shax_sev_tagavor1=false;
                    Toast toast=Toast.makeText(this,R.string.toast_text_shax,Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER,0,0);
                    View toastView=toast.getView();
                    toastView.setRotation(180);
                    toast.setView(toastView);
                    toast.show();
                    return;
                }
                else if (matrixBord[dirq_i_tagavor][i].substring(0,matrixBord[dirq_i_tagavor][i].length()-2).equals("spitak_pix")
                        || matrixBord[dirq_i_tagavor][i].substring(0,matrixBord[dirq_i_tagavor][i].length()-2).equals("spitak_dzi")
                        || matrixBord[dirq_i_tagavor][i].substring(0,matrixBord[dirq_i_tagavor][i].length()-2).equals("spitak_zinvor")
                        || matrixBord[dirq_i_tagavor][i].substring(0,matrixBord[dirq_i_tagavor][i].length()).equals("spitak_tagavor")
                        || matrixBord[dirq_i_tagavor][i].charAt(1)=='e') {
                    break;
                }
            }

            for (int i=dirq_j_tagavor+1; i<8; i++) {
                if (matrixBord[dirq_i_tagavor][i].substring(0,matrixBord[dirq_i_tagavor][i].length()-2).equals("spitak_navak")
                        || matrixBord[dirq_i_tagavor][i].substring(0,matrixBord[dirq_i_tagavor][i].length()-2).equals("spitak_taguhi")
                        || matrixBord[dirq_i_tagavor][i].substring(0,matrixBord[dirq_i_tagavor][i].length()).equals("spitak_taguhi")) {

                        shax_sev_tagavor1=false;
                    Toast toast=Toast.makeText(this,R.string.toast_text_shax,Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER,0,0);
                    View toastView=toast.getView();
                    toastView.setRotation(180);
                    toast.setView(toastView);
                        toast.show();
                        return;
                }
                else if (matrixBord[dirq_i_tagavor][i].substring(0,matrixBord[dirq_i_tagavor][i].length()-2).equals("spitak_pix")
                        || matrixBord[dirq_i_tagavor][i].substring(0,matrixBord[dirq_i_tagavor][i].length()-2).equals("spitak_dzi")
                        || matrixBord[dirq_i_tagavor][i].substring(0,matrixBord[dirq_i_tagavor][i].length()-2).equals("spitak_zinvor")
                        || matrixBord[dirq_i_tagavor][i].substring(0,matrixBord[dirq_i_tagavor][i].length()).equals("spitak_tagavor")
                        || matrixBord[dirq_i_tagavor][i].charAt(1)=='e') {
                    break;
                }
            }

            for (int i=dirq_i_tagavor-1; i>=0; i--) {
                if (matrixBord[i][dirq_j_tagavor].substring(0,matrixBord[i][dirq_j_tagavor].length()-2).equals("spitak_navak")
                        || matrixBord[i][dirq_j_tagavor].substring(0,matrixBord[i][dirq_j_tagavor].length()-2).equals("spitak_taguhi")
                        || matrixBord[i][dirq_j_tagavor].substring(0,matrixBord[i][dirq_j_tagavor].length()).equals("spitak_taguhi")) {

                        shax_sev_tagavor1=false;
                    Toast toast=Toast.makeText(this,R.string.toast_text_shax,Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER,0,0);
                    View toastView=toast.getView();
                    toastView.setRotation(180);
                    toast.setView(toastView);
                        toast.show();
                        return;
                }
                else if (matrixBord[i][dirq_j_tagavor].substring(0,matrixBord[i][dirq_j_tagavor].length()-2).equals("spitak_pix")
                        || matrixBord[i][dirq_j_tagavor].substring(0,matrixBord[i][dirq_j_tagavor].length()-2).equals("spitak_dzi")
                        || matrixBord[i][dirq_j_tagavor].substring(0,matrixBord[i][dirq_j_tagavor].length()-2).equals("spitak_zinvor")
                        || matrixBord[i][dirq_j_tagavor].substring(0,matrixBord[i][dirq_j_tagavor].length()).equals("spitak_tagavor")
                        || matrixBord[i][dirq_j_tagavor].charAt(1)=='e') {
                    break;
                }
            }

            for (int i=dirq_i_tagavor+1; i<=7; i++) {
                if (matrixBord[i][dirq_j_tagavor].substring(0,matrixBord[i][dirq_j_tagavor].length()-2).equals("spitak_navak")
                        || matrixBord[i][dirq_j_tagavor].substring(0,matrixBord[i][dirq_j_tagavor].length()-2).equals("spitak_taguhi")
                        || matrixBord[i][dirq_j_tagavor].substring(0,matrixBord[i][dirq_j_tagavor].length()).equals("spitak_taguhi")) {

                        shax_sev_tagavor1=false;
                    Toast toast=Toast.makeText(this,R.string.toast_text_shax,Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER,0,0);
                    View toastView=toast.getView();
                    toastView.setRotation(180);
                    toast.setView(toastView);
                        toast.show();
                        return;

                }
                else if (matrixBord[i][dirq_j_tagavor].substring(0,matrixBord[i][dirq_j_tagavor].length()-2).equals("spitak_pix")
                        || matrixBord[i][dirq_j_tagavor].substring(0,matrixBord[i][dirq_j_tagavor].length()-2).equals("spitak_dzi")
                        || matrixBord[i][dirq_j_tagavor].substring(0,matrixBord[i][dirq_j_tagavor].length()-2).equals("spitak_zinvor")
                        || matrixBord[i][dirq_j_tagavor].substring(0,matrixBord[i][dirq_j_tagavor].length()).equals("spitak_tagavor")
                        || matrixBord[i][dirq_j_tagavor].charAt(1)=='e') {
                    break;
                }
            }

            int i=dirq_i_tagavor-1;
            int j=dirq_j_tagavor-1;
            while (i>=0 && j>=0) {
                if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_pix")
                        || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_taguhi")
                        || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("spitak_taguhi")) {

                        shax_sev_tagavor1=false;
                    Toast toast=Toast.makeText(this,R.string.toast_text_shax,Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER,0,0);
                    View toastView=toast.getView();
                    toastView.setRotation(180);
                    toast.setView(toastView);
                        toast.show();
                        return;
                }
                else if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_navak")
                        || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_dzi")
                        || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_zinvor")
                        || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("spitak_tagavor")
                        || matrixBord[i][j].charAt(1)=='e') {
                    break;
                }
                i--;
                j--;
            }

            i=dirq_i_tagavor+1;
            j=dirq_j_tagavor+1;

            while (i<=7 && j<=7) {
                if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_pix")
                        || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_taguhi")
                        || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("spitak_taguhi")) {

                        shax_sev_tagavor1=false;
                    Toast toast=Toast.makeText(this,R.string.toast_text_shax,Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER,0,0);
                    View toastView=toast.getView();
                    toastView.setRotation(180);
                    toast.setView(toastView);
                        toast.show();
                        return;
                }
                else if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_navak")
                        || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_dzi")
                        || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_zinvor")
                        || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("spitak_tagavor")
                        || matrixBord[i][j].charAt(1)=='e') {
                    break;
                }
                i++;
                j++;
            }

            i=dirq_i_tagavor-1;
            j=dirq_j_tagavor+1;
            while (i>=0 && j<=7) {
                if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_pix")
                        || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_taguhi")
                        || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("spitak_taguhi")) {

                        shax_sev_tagavor1=false;
                    Toast toast=Toast.makeText(this,R.string.toast_text_shax,Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER,0,0);
                    View toastView=toast.getView();
                    toastView.setRotation(180);
                    toast.setView(toastView);
                        toast.show();
                        return;
                }
                else if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_navak")
                        || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_dzi")
                        || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_zinvor")
                        || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("spitak_tagavor")
                        || matrixBord[i][j].charAt(1)=='e') {
                    break;
                }
                i--;
                j++;
            }

            i=dirq_i_tagavor+1;
            j=dirq_j_tagavor-1;
            while (i<=7 && j>=0) {
                if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_pix")
                        || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_taguhi")
                        || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("spitak_taguhi")) {

                        shax_sev_tagavor1=false;
                    Toast toast=Toast.makeText(this,R.string.toast_text_shax,Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER,0,0);
                    View toastView=toast.getView();
                    toastView.setRotation(180);
                    toast.setView(toastView);
                        toast.show();
                        return;
                }
                else if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_navak")
                        || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_dzi")
                        || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("spitak_zinvor")
                        || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("spitak_tagavor")
                        || matrixBord[i][j].charAt(1)=='e') {
                    break;
                }
                i++;
                j--;
            }

            if (dirq_i_tagavor-2>=0 && dirq_j_tagavor+1<=7) {
                if (matrixBord[dirq_i_tagavor-2][dirq_j_tagavor+1].substring(
                        0,matrixBord[dirq_i_tagavor-2][dirq_j_tagavor+1].length()-2).equals("spitak_dzi")) {

                        shax_sev_tagavor1=false;
                    Toast toast=Toast.makeText(this,R.string.toast_text_shax,Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER,0,0);
                    View toastView=toast.getView();
                    toastView.setRotation(180);
                    toast.setView(toastView);
                        toast.show();
                        return;
                }
            }
            if (dirq_i_tagavor-2>=0 && dirq_j_tagavor-1>=0) {
                if (matrixBord[dirq_i_tagavor-2][dirq_j_tagavor-1].substring(
                        0,matrixBord[dirq_i_tagavor-2][dirq_j_tagavor-1].length()-2).equals("spitak_dzi")) {

                        shax_sev_tagavor1=false;
                    Toast toast=Toast.makeText(this,R.string.toast_text_shax,Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER,0,0);
                    View toastView=toast.getView();
                    toastView.setRotation(180);
                    toast.setView(toastView);
                        toast.show();
                        return;
                }
            }
            if (dirq_i_tagavor-1>=0 && dirq_j_tagavor+2<=7) {
                if (matrixBord[dirq_i_tagavor-1][dirq_j_tagavor+2].substring(
                        0,matrixBord[dirq_i_tagavor-1][dirq_j_tagavor+2].length()-2).equals("spitak_dzi")) {

                        shax_sev_tagavor1=false;
                    Toast toast=Toast.makeText(this,R.string.toast_text_shax,Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER,0,0);
                    View toastView=toast.getView();
                    toastView.setRotation(180);
                    toast.setView(toastView);
                        toast.show();
                        return;
                }
            }
            if (dirq_i_tagavor-1>=0 && dirq_j_tagavor-2>=0) {
                if (matrixBord[dirq_i_tagavor-1][dirq_j_tagavor-2].substring(
                        0,matrixBord[dirq_i_tagavor-1][dirq_j_tagavor-2].length()-2).equals("spitak_dzi")) {

                        shax_sev_tagavor1=false;
                    Toast toast=Toast.makeText(this,R.string.toast_text_shax,Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER,0,0);
                    View toastView=toast.getView();
                    toastView.setRotation(180);
                    toast.setView(toastView);
                        toast.show();
                        return;
                }
            }
            if (dirq_i_tagavor+2<=7 && dirq_j_tagavor+1<=7) {
                if (matrixBord[dirq_i_tagavor+2][dirq_j_tagavor+1].substring(
                        0,matrixBord[dirq_i_tagavor+2][dirq_j_tagavor+1].length()-2).equals("spitak_dzi")) {

                        shax_sev_tagavor1=false;
                    Toast toast=Toast.makeText(this,R.string.toast_text_shax,Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER,0,0);
                    View toastView=toast.getView();
                    toastView.setRotation(180);
                    toast.setView(toastView);
                        toast.show();
                        return;
                }
            }
            if (dirq_i_tagavor+2<=7 && dirq_j_tagavor-1>=0) {
                if (matrixBord[dirq_i_tagavor+2][dirq_j_tagavor-1].substring(
                        0,matrixBord[dirq_i_tagavor+2][dirq_j_tagavor-1].length()-2).equals("spitak_dzi")) {

                        shax_sev_tagavor1=false;
                    Toast toast=Toast.makeText(this,R.string.toast_text_shax,Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER,0,0);
                    View toastView=toast.getView();
                    toastView.setRotation(180);
                    toast.setView(toastView);
                        toast.show();
                        return;
                }
            }
            if (dirq_i_tagavor+1<=7 && dirq_j_tagavor+2<=7) {
                if (matrixBord[dirq_i_tagavor+1][dirq_j_tagavor+2].substring(
                        0,matrixBord[dirq_i_tagavor+1][dirq_j_tagavor+2].length()-2).equals("spitak_dzi")) {

                        shax_sev_tagavor1=false;
                    Toast toast=Toast.makeText(this,R.string.toast_text_shax,Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER,0,0);
                    View toastView=toast.getView();
                    toastView.setRotation(180);
                    toast.setView(toastView);
                        toast.show();
                        return;
                }
            }
            if (dirq_i_tagavor+1<=7 && dirq_j_tagavor-2>=0) {
                if (matrixBord[dirq_i_tagavor+1][dirq_j_tagavor-2].substring(
                        0,matrixBord[dirq_i_tagavor+1][dirq_j_tagavor-2].length()-2).equals("spitak_dzi")) {

                        shax_sev_tagavor1=false;
                    Toast toast=Toast.makeText(this,R.string.toast_text_shax,Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER,0,0);
                    View toastView=toast.getView();
                    toastView.setRotation(180);
                    toast.setView(toastView);
                        toast.show();
                        return;
                }
            }

            if (dirq_i_tagavor+1<=7 && dirq_j_tagavor+1<=7) {
                if (matrixBord[dirq_i_tagavor+1][dirq_j_tagavor+1].substring(
                        0,matrixBord[dirq_i_tagavor+1][dirq_j_tagavor+1].length()-2).equals("spitak_zinvor")) {

                        shax_sev_tagavor1=false;
                    Toast toast=Toast.makeText(this,R.string.toast_text_shax,Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER,0,0);
                    View toastView=toast.getView();
                    toastView.setRotation(180);
                    toast.setView(toastView);
                        toast.show();
                        return;
                    }
            }
            if (dirq_i_tagavor+1<=7 && dirq_j_tagavor-1>=0) {
                if (matrixBord[dirq_i_tagavor+1][dirq_j_tagavor-1].substring(
                        0,matrixBord[dirq_i_tagavor+1][dirq_j_tagavor-1].length()-2).equals("spitak_zinvor")) {

                    shax_sev_tagavor1 = false;
                    Toast toast=Toast.makeText(this,R.string.toast_text_shax,Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER,0,0);
                    View toastView=toast.getView();
                    toastView.setRotation(180);
                    toast.setView(toastView);
                    toast.show();
                    return;
                }
            }
        }
        else {

            a2: for (int i=0; i<8; i++) {
                for (int j=0; j<8; j++) {
                    if (matrixBord[i][j].equals("spitak_tagavor")) {
                        dirq_i_tagavor=i;
                        dirq_j_tagavor=j;
                        break a2;
                    }
                }
            }


            for (int i = dirq_j_tagavor - 1; i >= 0; i--) {
                if (matrixBord[dirq_i_tagavor][i].substring(0,matrixBord[dirq_i_tagavor][i].length()-2).equals("sev_navak")
                        || matrixBord[dirq_i_tagavor][i].substring(0,matrixBord[dirq_i_tagavor][i].length()-2).equals("sev_taguhi")
                        || matrixBord[dirq_i_tagavor][i].substring(0,matrixBord[dirq_i_tagavor][i].length()).equals("sev_taguhi")) {
                    shax_spitak_tagavor1=false;
                    Toast toast=Toast.makeText(this,R.string.toast_text_shax,Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER,0,0);
                    toast.show();
                    return;
                }
                else if (matrixBord[dirq_i_tagavor][i].substring(0,matrixBord[dirq_i_tagavor][i].length()-2).equals("sev_pix")
                        || matrixBord[dirq_i_tagavor][i].substring(0,matrixBord[dirq_i_tagavor][i].length()-2).equals("sev_dzi")
                        || matrixBord[dirq_i_tagavor][i].substring(0,matrixBord[dirq_i_tagavor][i].length()-2).equals("sev_zinvor")
                        || matrixBord[dirq_i_tagavor][i].substring(0,matrixBord[dirq_i_tagavor][i].length()).equals("sev_tagavor")
                        || matrixBord[dirq_i_tagavor][i].charAt(1)=='p') {
                    break;
                }
            }

            for (int i=dirq_j_tagavor+1; i<8; i++) {
                if (matrixBord[dirq_i_tagavor][i].substring(0,matrixBord[dirq_i_tagavor][i].length()-2).equals("sev_navak")
                        || matrixBord[dirq_i_tagavor][i].substring(0,matrixBord[dirq_i_tagavor][i].length()-2).equals("sev_taguhi")
                        || matrixBord[dirq_i_tagavor][i].substring(0,matrixBord[dirq_i_tagavor][i].length()).equals("sev_taguhi")) {

                        shax_spitak_tagavor1=false;
                    Toast toast=Toast.makeText(this,R.string.toast_text_shax,Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER,0,0);
                        toast.show();
                        return;
                }
                else if (matrixBord[dirq_i_tagavor][i].substring(0,matrixBord[dirq_i_tagavor][i].length()-2).equals("sev_pix")
                        || matrixBord[dirq_i_tagavor][i].substring(0,matrixBord[dirq_i_tagavor][i].length()-2).equals("sev_dzi")
                        || matrixBord[dirq_i_tagavor][i].substring(0,matrixBord[dirq_i_tagavor][i].length()-2).equals("sev_zinvor")
                        || matrixBord[dirq_i_tagavor][i].substring(0,matrixBord[dirq_i_tagavor][i].length()).equals("sev_tagavor")
                        || matrixBord[dirq_i_tagavor][i].charAt(1)=='p') {
                    break;
                }
            }

            for (int i=dirq_i_tagavor-1; i>=0; i--) {
                if (matrixBord[i][dirq_j_tagavor].substring(0,matrixBord[i][dirq_j_tagavor].length()-2).equals("sev_navak")
                        || matrixBord[i][dirq_j_tagavor].substring(0,matrixBord[i][dirq_j_tagavor].length()-2).equals("sev_taguhi")
                        || matrixBord[i][dirq_j_tagavor].substring(0,matrixBord[i][dirq_j_tagavor].length()).equals("sev_taguhi")) {

                        shax_spitak_tagavor1=false;
                    Toast toast=Toast.makeText(this,R.string.toast_text_shax,Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER,0,0);
                        toast.show();
                        return;
                }
                else if (matrixBord[i][dirq_j_tagavor].substring(0,matrixBord[i][dirq_j_tagavor].length()-2).equals("sev_pix")
                        || matrixBord[i][dirq_j_tagavor].substring(0,matrixBord[i][dirq_j_tagavor].length()-2).equals("sev_dzi")
                        || matrixBord[i][dirq_j_tagavor].substring(0,matrixBord[i][dirq_j_tagavor].length()-2).equals("sev_zinvor")
                        || matrixBord[i][dirq_j_tagavor].substring(0,matrixBord[i][dirq_j_tagavor].length()).equals("sev_tagavor")
                        || matrixBord[i][dirq_j_tagavor].charAt(1)=='p') {
                    break;
                }
            }

            for (int i=dirq_i_tagavor+1; i<=7; i++) {
                if (matrixBord[i][dirq_j_tagavor].substring(0,matrixBord[i][dirq_j_tagavor].length()-2).equals("sev_navak")
                        || matrixBord[i][dirq_j_tagavor].substring(0,matrixBord[i][dirq_j_tagavor].length()-2).equals("sev_taguhi")
                        || matrixBord[i][dirq_j_tagavor].substring(0,matrixBord[i][dirq_j_tagavor].length()).equals("sev_taguhi")) {

                        shax_spitak_tagavor1=false;
                    Toast toast=Toast.makeText(this,R.string.toast_text_shax,Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER,0,0);
                        toast.show();
                        return;
                }
                else if (matrixBord[i][dirq_j_tagavor].substring(0,matrixBord[i][dirq_j_tagavor].length()-2).equals("sev_pix")
                        || matrixBord[i][dirq_j_tagavor].substring(0,matrixBord[i][dirq_j_tagavor].length()-2).equals("sev_dzi")
                        || matrixBord[i][dirq_j_tagavor].substring(0,matrixBord[i][dirq_j_tagavor].length()-2).equals("sev_zinvor")
                        || matrixBord[i][dirq_j_tagavor].substring(0,matrixBord[i][dirq_j_tagavor].length()).equals("sev_tagavor")
                        || matrixBord[i][dirq_j_tagavor].charAt(1)=='p') {
                    break;
                }
            }

            int i=dirq_i_tagavor-1;
            int j=dirq_j_tagavor-1;
            while (i>=0 && j>=0) {
                if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_pix")
                        || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_taguhi")
                        || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("sev_taguhi")) {

                        shax_spitak_tagavor1=false;
                    Toast toast=Toast.makeText(this,R.string.toast_text_shax,Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER,0,0);
                        toast.show();
                        return;
                }
                else if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_navak")
                        || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_dzi")
                        || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_zinvor")
                        || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("sev_tagavor")
                        || matrixBord[i][j].charAt(1)=='p') {
                    break;
                }
                i--;
                j--;
            }

            i=dirq_i_tagavor+1;
            j=dirq_j_tagavor+1;

            while (i<=7 && j<=7) {
                if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_pix")
                        || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_taguhi")
                        || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("sev_taguhi")) {

                        shax_spitak_tagavor1=false;
                    Toast toast=Toast.makeText(this,R.string.toast_text_shax,Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER,0,0);
                        toast.show();
                        return;
                }
                else if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_navak")
                        || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_dzi")
                        || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_zinvor")
                        || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("sev_tagavor")
                        || matrixBord[i][j].charAt(1)=='p') {
                    break;
                }
                i++;
                j++;
            }

            i=dirq_i_tagavor-1;
            j=dirq_j_tagavor+1;
            while (i>=0 && j<=7) {
                if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_pix")
                        || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_taguhi")
                        || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("sev_taguhi")) {

                        shax_spitak_tagavor1=false;
                    Toast toast=Toast.makeText(this,R.string.toast_text_shax,Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER,0,0);
                        toast.show();
                        return;
                }
                else if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_navak")
                        || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_dzi")
                        || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_zinvor")
                        || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("sev_tagavor")
                        || matrixBord[i][j].charAt(1)=='p') {
                    break;
                }
                i--;
                j++;
            }

            i=dirq_i_tagavor+1;
            j=dirq_j_tagavor-1;
            while (i<=7 && j>=0) {
                if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_pix")
                        || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_taguhi")
                        || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("sev_taguhi")) {

                        shax_spitak_tagavor1=false;
                    Toast toast=Toast.makeText(this,R.string.toast_text_shax,Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER,0,0);
                        toast.show();
                        return;
                }
                else if (matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_navak")
                        || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_dzi")
                        || matrixBord[i][j].substring(0,matrixBord[i][j].length()-2).equals("sev_zinvor")
                        || matrixBord[i][j].substring(0,matrixBord[i][j].length()).equals("sev_tagavor")
                        || matrixBord[i][j].charAt(1)=='p') {
                    break;
                }
                i++;
                j--;
            }

            if (dirq_i_tagavor-2>=0 && dirq_j_tagavor+1<=7) {
                if (matrixBord[dirq_i_tagavor-2][dirq_j_tagavor+1].substring(
                        0,matrixBord[dirq_i_tagavor-2][dirq_j_tagavor+1].length()-2).equals("sev_dzi")) {

                        shax_spitak_tagavor1=false;
                    Toast toast=Toast.makeText(this,R.string.toast_text_shax,Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER,0,0);
                        toast.show();
                        return;
                }
            }
            if (dirq_i_tagavor-2>=0 && dirq_j_tagavor-1>=0) {
                if (matrixBord[dirq_i_tagavor-2][dirq_j_tagavor-1].substring(
                        0,matrixBord[dirq_i_tagavor-2][dirq_j_tagavor-1].length()-2).equals("sev_dzi")) {

                        shax_spitak_tagavor1=false;
                    Toast toast=Toast.makeText(this,R.string.toast_text_shax,Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER,0,0);
                        toast.show();
                        return;
                }
            }
            if (dirq_i_tagavor-1>=0 && dirq_j_tagavor+2<=7) {
                if (matrixBord[dirq_i_tagavor-1][dirq_j_tagavor+2].substring(
                        0,matrixBord[dirq_i_tagavor-1][dirq_j_tagavor+2].length()-2).equals("sev_dzi")) {

                        shax_spitak_tagavor1=false;
                    Toast toast=Toast.makeText(this,R.string.toast_text_shax,Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER,0,0);
                        toast.show();
                        return;
                }
            }
            if (dirq_i_tagavor-1>=0 && dirq_j_tagavor-2>=0) {
                if (matrixBord[dirq_i_tagavor-1][dirq_j_tagavor-2].substring(
                        0,matrixBord[dirq_i_tagavor-1][dirq_j_tagavor-2].length()-2).equals("sev_dzi")) {

                        shax_spitak_tagavor1=false;
                    Toast toast=Toast.makeText(this,R.string.toast_text_shax,Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER,0,0);
                        toast.show();
                        return;
                }
            }
            if (dirq_i_tagavor+2<=7 && dirq_j_tagavor+1<=7) {
                if (matrixBord[dirq_i_tagavor+2][dirq_j_tagavor+1].substring(
                        0,matrixBord[dirq_i_tagavor+2][dirq_j_tagavor+1].length()-2).equals("sev_dzi")) {

                        shax_spitak_tagavor1=false;
                    Toast toast=Toast.makeText(this,R.string.toast_text_shax,Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER,0,0);
                        toast.show();
                        return;
                }
            }
            if (dirq_i_tagavor+2<=7 && dirq_j_tagavor-1>=0) {
                if (matrixBord[dirq_i_tagavor+2][dirq_j_tagavor-1].substring(
                        0,matrixBord[dirq_i_tagavor+2][dirq_j_tagavor-1].length()-2).equals("sev_dzi")) {

                        shax_spitak_tagavor1=false;
                    Toast toast=Toast.makeText(this,R.string.toast_text_shax,Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER,0,0);
                        toast.show();
                        return;
                }
            }
            if (dirq_i_tagavor+1<=7 && dirq_j_tagavor+2<=7) {
                if (matrixBord[dirq_i_tagavor+1][dirq_j_tagavor+2].substring(
                        0,matrixBord[dirq_i_tagavor+1][dirq_j_tagavor+2].length()-2).equals("sev_dzi")) {

                        shax_spitak_tagavor1=false;
                    Toast toast=Toast.makeText(this,R.string.toast_text_shax,Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER,0,0);
                        toast.show();
                        return;
                }
            }
            if (dirq_i_tagavor+1<=7 && dirq_j_tagavor-2>=0) {
                if (matrixBord[dirq_i_tagavor+1][dirq_j_tagavor-2].substring(
                        0,matrixBord[dirq_i_tagavor+1][dirq_j_tagavor-2].length()-2).equals("sev_dzi")) {

                        shax_spitak_tagavor1=false;
                    Toast toast=Toast.makeText(this,R.string.toast_text_shax,Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER,0,0);
                        toast.show();
                        return;
                }
            }

            if (dirq_i_tagavor-1>=0 && dirq_j_tagavor+1<=7) {
                if (matrixBord[dirq_i_tagavor-1][dirq_j_tagavor+1].substring(
                        0,matrixBord[dirq_i_tagavor-1][dirq_j_tagavor+1].length()-2).equals("sev_zinvor")) {

                    shax_spitak_tagavor1 = false;
                    Toast toast=Toast.makeText(this,R.string.toast_text_shax,Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER,0,0);
                    toast.show();
                    return;
                }
            }
            if (dirq_i_tagavor-1>=0 && dirq_j_tagavor-1>=0) {
                if (matrixBord[dirq_i_tagavor-1][dirq_j_tagavor-1].substring(
                        0,matrixBord[dirq_i_tagavor-1][dirq_j_tagavor-1].length()-2).equals("sev_zinvor")) {

                        shax_spitak_tagavor1=false;
                    Toast toast=Toast.makeText(this,R.string.toast_text_shax,Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER,0,0);
                        toast.show();
                        return;
                    }
            }
        }
     }

     //-----------------sev_tagavori_shaxi_stugum-qayli_hamar----------------------------------------------

     private boolean shax_sev_tagavor_stugum(int i2, int j2, String imageName, boolean zinvor_ramka_5_ramka_6_depq) {

         String[][] matrixBord1=new String[8][8];
         if (zinvor_ramka_5_ramka_6_depq==true) {
             for (int i1 = 0; i1 < 8; i1++) {
                 for (int j1 = 0; j1 < 8; j1++) {
                     if (matrixBord[i1][j1].equals(imageName)) {
                         matrixBord1[i1][j1] = "datark";
                     } else {
                         matrixBord1[i1][j1] = matrixBord[i1][j1];
                     }
                 }
             }
             matrixBord1[i2][j2] = imageName;
         }
         else {
             for (int i1 = 0; i1 < 8; i1++) {
                 for (int j1 = 0; j1 < 8; j1++) {
                     if (matrixBord[i1][j1].equals(imageName)) {
                         matrixBord1[i1][j1] = "datark";
                     } else {
                         matrixBord1[i1][j1] = matrixBord[i1][j1];
                     }
                 }
             }
             matrixBord1[i2][j2] = imageName;
             matrixBord1[i2-1][j2]="datark";
         }


         shax_sev_tagavor=true;


             a2: for (int i=0; i<8; i++) {
                 for (int j=0; j<8; j++) {
                     if (matrixBord1[i][j].equals("sev_tagavor")) {
                         dirq_i_tagavor=i;
                         dirq_j_tagavor=j;
                         break a2;
                     }
                 }
             }

             for (int i = dirq_j_tagavor - 1; i >= 0; i--) {
                 if (matrixBord1[dirq_i_tagavor][i].substring(0,matrixBord1[dirq_i_tagavor][i].length()-2).equals("spitak_navak")
                         || matrixBord1[dirq_i_tagavor][i].substring(0,matrixBord1[dirq_i_tagavor][i].length()-2).equals("spitak_taguhi")
                         || matrixBord1[dirq_i_tagavor][i].substring(0,matrixBord1[dirq_i_tagavor][i].length()).equals("spitak_taguhi")) {
                     shax_sev_tagavor=false;
                 }
                 else if (matrixBord1[dirq_i_tagavor][i].substring(0,matrixBord1[dirq_i_tagavor][i].length()-2).equals("spitak_pix")
                         || matrixBord1[dirq_i_tagavor][i].substring(0,matrixBord1[dirq_i_tagavor][i].length()-2).equals("spitak_dzi")
                         || matrixBord1[dirq_i_tagavor][i].substring(0,matrixBord1[dirq_i_tagavor][i].length()-2).equals("spitak_zinvor")
                         || matrixBord1[dirq_i_tagavor][i].substring(0,matrixBord1[dirq_i_tagavor][i].length()).equals("spitak_tagavor")
                         || matrixBord1[dirq_i_tagavor][i].charAt(1)=='e') {
                     break;
                 }
             }

             for (int i=dirq_j_tagavor+1; i<8; i++) {
                 if (matrixBord1[dirq_i_tagavor][i].substring(0,matrixBord1[dirq_i_tagavor][i].length()-2).equals("spitak_navak")
                         || matrixBord1[dirq_i_tagavor][i].substring(0,matrixBord1[dirq_i_tagavor][i].length()-2).equals("spitak_taguhi")
                         || matrixBord1[dirq_i_tagavor][i].substring(0,matrixBord1[dirq_i_tagavor][i].length()).equals("spitak_taguhi")) {

                     shax_sev_tagavor=false;
                 }
                 else if (matrixBord1[dirq_i_tagavor][i].substring(0,matrixBord1[dirq_i_tagavor][i].length()-2).equals("spitak_pix")
                         || matrixBord1[dirq_i_tagavor][i].substring(0,matrixBord1[dirq_i_tagavor][i].length()-2).equals("spitak_dzi")
                         || matrixBord1[dirq_i_tagavor][i].substring(0,matrixBord1[dirq_i_tagavor][i].length()-2).equals("spitak_zinvor")
                         || matrixBord1[dirq_i_tagavor][i].substring(0,matrixBord1[dirq_i_tagavor][i].length()).equals("spitak_tagavor")
                         || matrixBord1[dirq_i_tagavor][i].charAt(1)=='e') {
                     break;
                 }
             }

             for (int i=dirq_i_tagavor-1; i>=0; i--) {
                 if (matrixBord1[i][dirq_j_tagavor].substring(0,matrixBord1[i][dirq_j_tagavor].length()-2).equals("spitak_navak")
                         || matrixBord1[i][dirq_j_tagavor].substring(0,matrixBord1[i][dirq_j_tagavor].length()-2).equals("spitak_taguhi")
                         || matrixBord1[i][dirq_j_tagavor].substring(0,matrixBord1[i][dirq_j_tagavor].length()).equals("spitak_taguhi")) {

                   shax_sev_tagavor=false;
                 }
                 else if (matrixBord1[i][dirq_j_tagavor].substring(0,matrixBord1[i][dirq_j_tagavor].length()-2).equals("spitak_pix")
                         || matrixBord1[i][dirq_j_tagavor].substring(0,matrixBord1[i][dirq_j_tagavor].length()-2).equals("spitak_dzi")
                         || matrixBord1[i][dirq_j_tagavor].substring(0,matrixBord1[i][dirq_j_tagavor].length()-2).equals("spitak_zinvor")
                         || matrixBord1[i][dirq_j_tagavor].substring(0,matrixBord1[i][dirq_j_tagavor].length()).equals("spitak_tagavor")
                         || matrixBord1[i][dirq_j_tagavor].charAt(1)=='e') {
                     break;
                 }
             }

             for (int i=dirq_i_tagavor+1; i<=7; i++) {
                 if (matrixBord1[i][dirq_j_tagavor].substring(0,matrixBord1[i][dirq_j_tagavor].length()-2).equals("spitak_navak")
                         || matrixBord1[i][dirq_j_tagavor].substring(0,matrixBord1[i][dirq_j_tagavor].length()-2).equals("spitak_taguhi")
                         || matrixBord1[i][dirq_j_tagavor].substring(0,matrixBord1[i][dirq_j_tagavor].length()).equals("spitak_taguhi")) {

                   shax_sev_tagavor=false;
                 }
                 else if (matrixBord1[i][dirq_j_tagavor].substring(0,matrixBord1[i][dirq_j_tagavor].length()-2).equals("spitak_pix")
                         || matrixBord1[i][dirq_j_tagavor].substring(0,matrixBord1[i][dirq_j_tagavor].length()-2).equals("spitak_dzi")
                         || matrixBord1[i][dirq_j_tagavor].substring(0,matrixBord1[i][dirq_j_tagavor].length()-2).equals("spitak_zinvor")
                         || matrixBord1[i][dirq_j_tagavor].substring(0,matrixBord1[i][dirq_j_tagavor].length()).equals("spitak_tagavor")
                         || matrixBord1[i][dirq_j_tagavor].charAt(1)=='e') {
                     break;
                 }
             }

             int i=dirq_i_tagavor-1;
             int j=dirq_j_tagavor-1;
             while (i>=0 && j>=0) {
                 if (matrixBord1[i][j].substring(0,matrixBord1[i][j].length()-2).equals("spitak_pix")
                         || matrixBord1[i][j].substring(0,matrixBord1[i][j].length()-2).equals("spitak_taguhi")
                         || matrixBord1[i][j].substring(0,matrixBord1[i][j].length()).equals("spitak_taguhi")) {

                     shax_sev_tagavor=false;
                 }
                 else if (matrixBord1[i][j].substring(0,matrixBord1[i][j].length()-2).equals("spitak_navak")
                         || matrixBord1[i][j].substring(0,matrixBord1[i][j].length()-2).equals("spitak_dzi")
                         || matrixBord1[i][j].substring(0,matrixBord1[i][j].length()-2).equals("spitak_zinvor")
                         || matrixBord1[i][j].substring(0,matrixBord1[i][j].length()).equals("spitak_tagavor")
                         || matrixBord1[i][j].charAt(1)=='e') {
                     break;
                 }
                 i--;
                 j--;
             }

             i=dirq_i_tagavor+1;
             j=dirq_j_tagavor+1;

             while (i<=7 && j<=7) {
                 if (matrixBord1[i][j].substring(0,matrixBord1[i][j].length()-2).equals("spitak_pix")
                         || matrixBord1[i][j].substring(0,matrixBord1[i][j].length()-2).equals("spitak_taguhi")
                         || matrixBord1[i][j].substring(0,matrixBord1[i][j].length()).equals("spitak_taguhi")) {

             shax_sev_tagavor=false;
                 }
                 else if (matrixBord1[i][j].substring(0,matrixBord1[i][j].length()-2).equals("spitak_navak")
                         || matrixBord1[i][j].substring(0,matrixBord1[i][j].length()-2).equals("spitak_dzi")
                         || matrixBord1[i][j].substring(0,matrixBord1[i][j].length()-2).equals("spitak_zinvor")
                         || matrixBord1[i][j].substring(0,matrixBord1[i][j].length()).equals("spitak_tagavor")
                         || matrixBord1[i][j].charAt(1)=='e') {
                     break;
                 }
                 i++;
                 j++;
             }

             i=dirq_i_tagavor-1;
             j=dirq_j_tagavor+1;
             while (i>=0 && j<=7) {
                 if (matrixBord1[i][j].substring(0,matrixBord1[i][j].length()-2).equals("spitak_pix")
                         || matrixBord1[i][j].substring(0,matrixBord1[i][j].length()-2).equals("spitak_taguhi")
                         || matrixBord1[i][j].substring(0,matrixBord1[i][j].length()).equals("spitak_taguhi")) {

                    shax_sev_tagavor=false;
                 }
                 else if (matrixBord1[i][j].substring(0,matrixBord1[i][j].length()-2).equals("spitak_navak")
                         || matrixBord1[i][j].substring(0,matrixBord1[i][j].length()-2).equals("spitak_dzi")
                         || matrixBord1[i][j].substring(0,matrixBord1[i][j].length()-2).equals("spitak_zinvor")
                         || matrixBord1[i][j].substring(0,matrixBord1[i][j].length()).equals("spitak_tagavor")
                         || matrixBord1[i][j].charAt(1)=='e') {
                     break;
                 }
                 i--;
                 j++;
             }

             i=dirq_i_tagavor+1;
             j=dirq_j_tagavor-1;
             while (i<=7 && j>=0) {
                 if (matrixBord1[i][j].substring(0,matrixBord1[i][j].length()-2).equals("spitak_pix")
                         || matrixBord1[i][j].substring(0,matrixBord1[i][j].length()-2).equals("spitak_taguhi")
                         || matrixBord1[i][j].substring(0,matrixBord1[i][j].length()).equals("spitak_taguhi")) {

                     shax_sev_tagavor=false;
                 }
                 else if (matrixBord1[i][j].substring(0,matrixBord1[i][j].length()-2).equals("spitak_navak")
                         || matrixBord1[i][j].substring(0,matrixBord1[i][j].length()-2).equals("spitak_dzi")
                         || matrixBord1[i][j].substring(0,matrixBord1[i][j].length()-2).equals("spitak_zinvor")
                         || matrixBord1[i][j].substring(0,matrixBord1[i][j].length()).equals("spitak_tagavor")
                         || matrixBord1[i][j].charAt(1)=='e') {
                     break;
                 }
                 i++;
                 j--;
             }

             if (dirq_i_tagavor-2>=0 && dirq_j_tagavor+1<=7) {
                 if (matrixBord1[dirq_i_tagavor-2][dirq_j_tagavor+1].substring(
                         0,matrixBord1[dirq_i_tagavor-2][dirq_j_tagavor+1].length()-2).equals("spitak_dzi")) {

                    shax_sev_tagavor=false;
                 }

             }
             if (dirq_i_tagavor-2>=0 && dirq_j_tagavor-1>=0) {
                 if (matrixBord1[dirq_i_tagavor-2][dirq_j_tagavor-1].substring(
                         0,matrixBord1[dirq_i_tagavor-2][dirq_j_tagavor-1].length()-2).equals("spitak_dzi")) {

                   shax_sev_tagavor=false;
                 }

             }
             if (dirq_i_tagavor-1>=0 && dirq_j_tagavor+2<=7) {
                 if (matrixBord1[dirq_i_tagavor-1][dirq_j_tagavor+2].substring(
                         0,matrixBord1[dirq_i_tagavor-1][dirq_j_tagavor+2].length()-2).equals("spitak_dzi")) {

                    shax_sev_tagavor=false;
                 }

             }
             if (dirq_i_tagavor-1>=0 && dirq_j_tagavor-2>=0) {
                 if (matrixBord1[dirq_i_tagavor-1][dirq_j_tagavor-2].substring(
                         0,matrixBord1[dirq_i_tagavor-1][dirq_j_tagavor-2].length()-2).equals("spitak_dzi")) {

                    shax_sev_tagavor=false;
                 }

             }
             if (dirq_i_tagavor+2<=7 && dirq_j_tagavor+1<=7) {
                 if (matrixBord1[dirq_i_tagavor+2][dirq_j_tagavor+1].substring(
                         0,matrixBord1[dirq_i_tagavor+2][dirq_j_tagavor+1].length()-2).equals("spitak_dzi")) {

                    shax_sev_tagavor=false;
                 }

             }
             if (dirq_i_tagavor+2<=7 && dirq_j_tagavor-1>=0) {
                 if (matrixBord1[dirq_i_tagavor+2][dirq_j_tagavor-1].substring(
                         0,matrixBord1[dirq_i_tagavor+2][dirq_j_tagavor-1].length()-2).equals("spitak_dzi")) {

                     shax_sev_tagavor=false;
                 }

             }
             if (dirq_i_tagavor+1<=7 && dirq_j_tagavor+2<=7) {
                 if (matrixBord1[dirq_i_tagavor+1][dirq_j_tagavor+2].substring(
                         0,matrixBord1[dirq_i_tagavor+1][dirq_j_tagavor+2].length()-2).equals("spitak_dzi")) {

                     shax_sev_tagavor=false;
                 }

             }
             if (dirq_i_tagavor+1<=7 && dirq_j_tagavor-2>=0) {
                 if (matrixBord1[dirq_i_tagavor+1][dirq_j_tagavor-2].substring(
                         0,matrixBord1[dirq_i_tagavor+1][dirq_j_tagavor-2].length()-2).equals("spitak_dzi")) {

                     shax_sev_tagavor=false;
                 }

             }



             if (dirq_i_tagavor+1<=7 && dirq_j_tagavor+1<=7) {
                 if (matrixBord1[dirq_i_tagavor+1][dirq_j_tagavor+1].substring(
                         0,matrixBord1[dirq_i_tagavor+1][dirq_j_tagavor+1].length()-2).equals("spitak_zinvor"))

                    shax_sev_tagavor=false;
             }
             if (dirq_i_tagavor+1<=7 && dirq_j_tagavor-1>=0) {
                 if (matrixBord1[dirq_i_tagavor+1][dirq_j_tagavor-1].substring(
                         0,matrixBord1[dirq_i_tagavor+1][dirq_j_tagavor-1].length()-2).equals("spitak_zinvor"))

                    shax_sev_tagavor=false;
             }



             return shax_sev_tagavor;
     }


     //------------spitak_tagavori_shaxi_stugum_qayli_hamar----------------------------------------------------------------

     private boolean shax_spitak_tagavor_stugum(int i2, int j2, String imageName, boolean zinvor_ramka_5_ramka_6_depq) {


         String[][] matrixBord1=new String[8][8];
         if (zinvor_ramka_5_ramka_6_depq==true) {
             for (int i1 = 0; i1 < 8; i1++) {
                 for (int j1 = 0; j1 < 8; j1++) {
                     if (matrixBord[i1][j1].equals(imageName)) {
                         matrixBord1[i1][j1] = "datark";
                     } else {
                         matrixBord1[i1][j1] = matrixBord[i1][j1];
                     }
                 }
             }
             matrixBord1[i2][j2] = imageName;
         }
         else {
             for (int i1 = 0; i1 < 8; i1++) {
                 for (int j1 = 0; j1 < 8; j1++) {
                     if (matrixBord[i1][j1].equals(imageName)) {
                         matrixBord1[i1][j1] = "datark";
                     } else {
                         matrixBord1[i1][j1] = matrixBord[i1][j1];
                     }
                 }
             }
             matrixBord1[i2][j2] = imageName;
             matrixBord1[i2+1][j2]="datark";
         }


         shax_spitak_tagavor=true;



         a2: for (int i=0; i<8; i++) {
                 for (int j=0; j<8; j++) {
                     if (matrixBord1[i][j].equals("spitak_tagavor")) {
                         dirq_i_tagavor=i;
                         dirq_j_tagavor=j;
                         break a2;
                      }
                }
         }


         for (int i = dirq_j_tagavor - 1; i >= 0; i--) {
         if (matrixBord1[dirq_i_tagavor][i].substring(0,matrixBord1[dirq_i_tagavor][i].length()-2).equals("sev_navak")
         || matrixBord1[dirq_i_tagavor][i].substring(0,matrixBord1[dirq_i_tagavor][i].length()-2).equals("sev_taguhi")
         || matrixBord1[dirq_i_tagavor][i].substring(0,matrixBord1[dirq_i_tagavor][i].length()).equals("sev_taguhi")) {
         shax_spitak_tagavor=false;
         }
         else if (matrixBord1[dirq_i_tagavor][i].substring(0,matrixBord1[dirq_i_tagavor][i].length()-2).equals("sev_pix")
         || matrixBord1[dirq_i_tagavor][i].substring(0,matrixBord1[dirq_i_tagavor][i].length()-2).equals("sev_dzi")
         || matrixBord1[dirq_i_tagavor][i].substring(0,matrixBord1[dirq_i_tagavor][i].length()-2).equals("sev_zinvor")
         || matrixBord1[dirq_i_tagavor][i].substring(0,matrixBord1[dirq_i_tagavor][i].length()).equals("sev_tagavor")
         || matrixBord1[dirq_i_tagavor][i].charAt(1)=='p') {
         break;
         }
         }

         for (int i=dirq_j_tagavor+1; i<8; i++) {
         if (matrixBord1[dirq_i_tagavor][i].substring(0,matrixBord1[dirq_i_tagavor][i].length()-2).equals("sev_navak")
         || matrixBord1[dirq_i_tagavor][i].substring(0,matrixBord1[dirq_i_tagavor][i].length()-2).equals("sev_taguhi")
         || matrixBord1[dirq_i_tagavor][i].substring(0,matrixBord1[dirq_i_tagavor][i].length()).equals("sev_taguhi")) {

        shax_spitak_tagavor=false;
         }
         else if (matrixBord1[dirq_i_tagavor][i].substring(0,matrixBord1[dirq_i_tagavor][i].length()-2).equals("sev_pix")
         || matrixBord1[dirq_i_tagavor][i].substring(0,matrixBord1[dirq_i_tagavor][i].length()-2).equals("sev_dzi")
         || matrixBord1[dirq_i_tagavor][i].substring(0,matrixBord1[dirq_i_tagavor][i].length()-2).equals("sev_zinvor")
         || matrixBord1[dirq_i_tagavor][i].substring(0,matrixBord1[dirq_i_tagavor][i].length()).equals("sev_tagavor")
         || matrixBord1[dirq_i_tagavor][i].charAt(1)=='p') {
         break;
         }
         }

         for (int i=dirq_i_tagavor-1; i>=0; i--) {
         if (matrixBord1[i][dirq_j_tagavor].substring(0,matrixBord1[i][dirq_j_tagavor].length()-2).equals("sev_navak")
         || matrixBord1[i][dirq_j_tagavor].substring(0,matrixBord1[i][dirq_j_tagavor].length()-2).equals("sev_taguhi")
         || matrixBord1[i][dirq_j_tagavor].substring(0,matrixBord1[i][dirq_j_tagavor].length()).equals("sev_taguhi")) {

        shax_spitak_tagavor=false;

         }
         else if (matrixBord1[i][dirq_j_tagavor].substring(0,matrixBord1[i][dirq_j_tagavor].length()-2).equals("sev_pix")
         || matrixBord1[i][dirq_j_tagavor].substring(0,matrixBord1[i][dirq_j_tagavor].length()-2).equals("sev_dzi")
         || matrixBord1[i][dirq_j_tagavor].substring(0,matrixBord1[i][dirq_j_tagavor].length()-2).equals("sev_zinvor")
         || matrixBord1[i][dirq_j_tagavor].substring(0,matrixBord1[i][dirq_j_tagavor].length()).equals("sev_tagavor")
         || matrixBord1[i][dirq_j_tagavor].charAt(1)=='p') {
         break;
         }
         }

         for (int i=dirq_i_tagavor+1; i<=7; i++) {
         if (matrixBord1[i][dirq_j_tagavor].substring(0,matrixBord1[i][dirq_j_tagavor].length()-2).equals("sev_navak")
         || matrixBord1[i][dirq_j_tagavor].substring(0,matrixBord1[i][dirq_j_tagavor].length()-2).equals("sev_taguhi")
         || matrixBord1[i][dirq_j_tagavor].substring(0,matrixBord1[i][dirq_j_tagavor].length()).equals("sev_taguhi")) {

         shax_spitak_tagavor=false;

         }
         else if (matrixBord1[i][dirq_j_tagavor].substring(0,matrixBord1[i][dirq_j_tagavor].length()-2).equals("sev_pix")
         || matrixBord1[i][dirq_j_tagavor].substring(0,matrixBord1[i][dirq_j_tagavor].length()-2).equals("sev_dzi")
         || matrixBord1[i][dirq_j_tagavor].substring(0,matrixBord1[i][dirq_j_tagavor].length()-2).equals("sev_zinvor")
         || matrixBord1[i][dirq_j_tagavor].substring(0,matrixBord1[i][dirq_j_tagavor].length()).equals("sev_tagavor")
         || matrixBord1[i][dirq_j_tagavor].charAt(1)=='p') {
         break;
         }
         }

         int i=dirq_i_tagavor-1;
         int j=dirq_j_tagavor-1;
         while (i>=0 && j>=0) {
         if (matrixBord1[i][j].substring(0,matrixBord1[i][j].length()-2).equals("sev_pix")
         || matrixBord1[i][j].substring(0,matrixBord1[i][j].length()-2).equals("sev_taguhi")
         || matrixBord1[i][j].substring(0,matrixBord1[i][j].length()).equals("sev_taguhi")) {

             shax_spitak_tagavor=false;

         }
         else if (matrixBord1[i][j].substring(0,matrixBord1[i][j].length()-2).equals("sev_navak")
         || matrixBord1[i][j].substring(0,matrixBord1[i][j].length()-2).equals("sev_dzi")
         || matrixBord1[i][j].substring(0,matrixBord1[i][j].length()-2).equals("sev_zinvor")
         || matrixBord1[i][j].substring(0,matrixBord1[i][j].length()).equals("sev_tagavor")
         || matrixBord1[i][j].charAt(1)=='p') {
         break;
         }
         i--;
         j--;
         }

         i=dirq_i_tagavor+1;
         j=dirq_j_tagavor+1;

         while (i<=7 && j<=7) {
         if (matrixBord1[i][j].substring(0,matrixBord1[i][j].length()-2).equals("sev_pix")
         || matrixBord1[i][j].substring(0,matrixBord1[i][j].length()-2).equals("sev_taguhi")
         || matrixBord1[i][j].substring(0,matrixBord1[i][j].length()).equals("sev_taguhi")) {

        shax_spitak_tagavor=false;

         }
         else if (matrixBord1[i][j].substring(0,matrixBord1[i][j].length()-2).equals("sev_navak")
         || matrixBord1[i][j].substring(0,matrixBord1[i][j].length()-2).equals("sev_dzi")
         || matrixBord1[i][j].substring(0,matrixBord1[i][j].length()-2).equals("sev_zinvor")
         || matrixBord1[i][j].substring(0,matrixBord1[i][j].length()).equals("sev_tagavor")
         || matrixBord1[i][j].charAt(1)=='p') {
         break;
         }
         i++;
         j++;
         }

         i=dirq_i_tagavor-1;
         j=dirq_j_tagavor+1;
         while (i>=0 && j<=7) {
         if (matrixBord1[i][j].substring(0,matrixBord1[i][j].length()-2).equals("sev_pix")
         || matrixBord1[i][j].substring(0,matrixBord1[i][j].length()-2).equals("sev_taguhi")
         || matrixBord1[i][j].substring(0,matrixBord1[i][j].length()).equals("sev_taguhi")) {

        shax_spitak_tagavor=false;

         }
         else if (matrixBord1[i][j].substring(0,matrixBord1[i][j].length()-2).equals("sev_navak")
         || matrixBord1[i][j].substring(0,matrixBord1[i][j].length()-2).equals("sev_dzi")
         || matrixBord1[i][j].substring(0,matrixBord1[i][j].length()-2).equals("sev_zinvor")
         || matrixBord1[i][j].substring(0,matrixBord1[i][j].length()).equals("sev_tagavor")
         || matrixBord1[i][j].charAt(1)=='p') {
         break;
         }
         i--;
         j++;
         }

         i=dirq_i_tagavor+1;
         j=dirq_j_tagavor-1;
         while (i<=7 && j>=0) {
         if (matrixBord1[i][j].substring(0,matrixBord1[i][j].length()-2).equals("sev_pix")
         || matrixBord1[i][j].substring(0,matrixBord1[i][j].length()-2).equals("sev_taguhi")
         || matrixBord1[i][j].substring(0,matrixBord1[i][j].length()).equals("sev_taguhi")) {

        shax_spitak_tagavor=false;

         }
         else if (matrixBord1[i][j].substring(0,matrixBord1[i][j].length()-2).equals("sev_navak")
         || matrixBord1[i][j].substring(0,matrixBord1[i][j].length()-2).equals("sev_dzi")
         || matrixBord1[i][j].substring(0,matrixBord1[i][j].length()-2).equals("sev_zinvor")
         || matrixBord1[i][j].substring(0,matrixBord1[i][j].length()).equals("sev_tagavor")
         || matrixBord1[i][j].charAt(1)=='p') {
         break;
         }
         i++;
         j--;
         }

         if (dirq_i_tagavor-2>=0 && dirq_j_tagavor+1<=7) {
         if (matrixBord1[dirq_i_tagavor-2][dirq_j_tagavor+1].substring(
         0,matrixBord1[dirq_i_tagavor-2][dirq_j_tagavor+1].length()-2).equals("sev_dzi")) {

         shax_spitak_tagavor=false;

         }

         }
         if (dirq_i_tagavor-2>=0 && dirq_j_tagavor-1>=0) {
         if (matrixBord1[dirq_i_tagavor-2][dirq_j_tagavor-1].substring(
         0,matrixBord1[dirq_i_tagavor-2][dirq_j_tagavor-1].length()-2).equals("sev_dzi")) {

        shax_spitak_tagavor=false;

         }

         }
         if (dirq_i_tagavor-1>=0 && dirq_j_tagavor+2<=7) {
         if (matrixBord1[dirq_i_tagavor-1][dirq_j_tagavor+2].substring(
         0,matrixBord1[dirq_i_tagavor-1][dirq_j_tagavor+2].length()-2).equals("sev_dzi")) {

        shax_spitak_tagavor=false;

         }

         }
         if (dirq_i_tagavor-1>=0 && dirq_j_tagavor-2>=0) {
         if (matrixBord1[dirq_i_tagavor-1][dirq_j_tagavor-2].substring(
         0,matrixBord1[dirq_i_tagavor-1][dirq_j_tagavor-2].length()-2).equals("sev_dzi")) {

         shax_spitak_tagavor=false;

         }

         }
         if (dirq_i_tagavor+2<=7 && dirq_j_tagavor+1<=7) {
         if (matrixBord1[dirq_i_tagavor+2][dirq_j_tagavor+1].substring(
         0,matrixBord1[dirq_i_tagavor+2][dirq_j_tagavor+1].length()-2).equals("sev_dzi")) {

         shax_spitak_tagavor=false;

         }

         }
         if (dirq_i_tagavor+2<=7 && dirq_j_tagavor-1>=0) {
         if (matrixBord1[dirq_i_tagavor+2][dirq_j_tagavor-1].substring(
         0,matrixBord1[dirq_i_tagavor+2][dirq_j_tagavor-1].length()-2).equals("sev_dzi")) {

        shax_spitak_tagavor=false;

         }

         }
         if (dirq_i_tagavor+1<=7 && dirq_j_tagavor+2<=7) {
         if (matrixBord1[dirq_i_tagavor+1][dirq_j_tagavor+2].substring(
         0,matrixBord1[dirq_i_tagavor+1][dirq_j_tagavor+2].length()-2).equals("sev_dzi")) {

         shax_spitak_tagavor=false;

         }

         }
         if (dirq_i_tagavor+1<=7 && dirq_j_tagavor-2>=0) {
         if (matrixBord1[dirq_i_tagavor+1][dirq_j_tagavor-2].substring(
         0,matrixBord1[dirq_i_tagavor+1][dirq_j_tagavor-2].length()-2).equals("sev_dzi")) {

        shax_spitak_tagavor=false;

         }

         }

         if (dirq_i_tagavor-1>=0 && dirq_j_tagavor+1<=7) {
         if (matrixBord1[dirq_i_tagavor-1][dirq_j_tagavor+1].substring(
         0,matrixBord1[dirq_i_tagavor-1][dirq_j_tagavor+1].length()-2).equals("sev_zinvor"))

        shax_spitak_tagavor=false;

         }
         if (dirq_i_tagavor-1>=0 && dirq_j_tagavor-1>=0) {
         if (matrixBord1[dirq_i_tagavor-1][dirq_j_tagavor-1].substring(
         0,matrixBord1[dirq_i_tagavor-1][dirq_j_tagavor-1].length()-2).equals("sev_zinvor"))

         shax_spitak_tagavor=false;

         }

         return shax_spitak_tagavor;
         }

         //-----------------mat_pat_stugum_metod--------------------------------------------------------------------------------
         private boolean mat_pat_stugum(boolean sev_spitak) {

             boolean qayli_hnaravorutyun = false;
             boolean figuri_arkayutyun=false;

         a1:
         {

             String imageName = "";

             for (int k = 0; k < 9; k++) {
                 imageName = "";
                 if (k == 0) {
                     if (sev_spitak == true) {
                         imageName = "spitak_taguhi";
                     } else {
                         imageName = "sev_taguhi";
                     }
                 } else if (k == 1) {
                     if (sev_spitak == true) {
                         imageName = "spitak_taguhi_1";
                     } else {
                         imageName = "sev_taguhi_1";
                     }
                 } else if (k == 2) {
                     if (sev_spitak == true) {
                         imageName = "spitak_taguhi_2";
                     } else {
                         imageName = "sev_taguhi_2";
                     }
                 } else if (k == 3) {
                     if (sev_spitak == true) {
                         imageName = "spitak_taguhi_3";
                     } else {
                         imageName = "sev_taguhi_3";
                     }
                 } else if (k == 4) {
                     if (sev_spitak == true) {
                         imageName = "spitak_taguhi_4";
                     } else {
                         imageName = "sev_taguhi_4";
                     }
                 } else if (k == 5) {
                     if (sev_spitak == true) {
                         imageName = "spitak_taguhi_5";
                     } else {
                         imageName = "sev_taguhi_5";
                     }
                 } else if (k == 6) {
                     if (sev_spitak == true) {
                         imageName = "spitak_taguhi_6";
                     } else {
                         imageName = "sev_taguhi_6";
                     }
                 } else if (k == 7) {
                     if (sev_spitak == true) {
                         imageName = "spitak_taguhi_7";
                     } else {
                         imageName = "sev_taguhi_7";
                     }
                 } else if (k == 8) {
                     if (sev_spitak == true) {
                         imageName = "spitak_taguhi_8";
                     } else {
                         imageName = "sev_taguhi_8";
                     }
                 }


                 for (int i = 0; i < 8; i++) {
                     for (int j = 0; j < 8; j++) {
                         if (matrixBord[i][j].equals(imageName)) {
                             view_i = i;
                             view_j = j;
                             figuri_arkayutyun = true;
                         }
                     }
                 }

                 if (figuri_arkayutyun == true) {
                     int sum = 1;
                     int sum1 = 1;
                     int sum2 = 1;
                     int sum3 = 1;
                     boolean opponentFigure1 = true;
                     boolean opponentFigure2 = true;
                     boolean opponentFigure3 = true;
                     boolean opponentFigure4 = true;

                     int sum00 = 1;
                     int sum11 = 1;
                     int sum22 = 1;
                     int sum33 = 1;
                     boolean opponentFigure11 = true;
                     boolean opponentFigure22 = true;
                     boolean opponentFigure33 = true;
                     boolean opponentFigure44 = true;
                     boolean is_shax = true;

                     for (int i = 0; i < 8; i++) {
                         if (view_j - sum >= 0 && opponentFigure1 == true) {
                             if (sev_spitak == true)
                                 is_shax = shax_spitak_tagavor_stugum(view_i, view_j - sum, imageName, true);
                             else if (sev_spitak == false)
                                 is_shax = shax_sev_tagavor_stugum(view_i, view_j - sum, imageName, true);

                             if (matrixBord[view_i][view_j - sum].equals("datark")) {
                                 if (is_shax == true) {
                                     qayli_hnaravorutyun = true;
                                     break a1;
                                 }
                                 sum++;
                             } else if (matrixBord[view_i][view_j - sum].charAt(1) == 'e' && sev_spitak == true && is_shax == true) {
                                 opponentFigure1 = false;
                                 qayli_hnaravorutyun = true;
                                 break a1;

                             } else if (matrixBord[view_i][view_j - sum].charAt(1) == 'p' && sev_spitak == false && is_shax == true) {
                                 opponentFigure1 = false;
                                 qayli_hnaravorutyun = true;
                                 break a1;
                             }

                         }
                         if (view_j + sum1 <= 7 && opponentFigure2 == true) {
                             if (sev_spitak == true)
                                 is_shax = shax_spitak_tagavor_stugum(view_i, view_j + sum1, imageName, true);
                             else if (sev_spitak == false)
                                 is_shax = shax_sev_tagavor_stugum(view_i, view_j + sum1, imageName, true);

                             if (matrixBord[view_i][view_j + sum1].equals("datark")) {
                                 if (is_shax == true) {
                                     qayli_hnaravorutyun = true;
                                     break a1;
                                 }
                                 sum1++;
                             } else if (matrixBord[view_i][view_j + sum1].charAt(1) == 'e' && sev_spitak == true && is_shax == true) {
                                 opponentFigure2 = false;
                                 qayli_hnaravorutyun = true;
                                 break a1;
                             } else if (matrixBord[view_i][view_j + sum1].charAt(1) == 'p' && sev_spitak == false && is_shax == true) {
                                 opponentFigure2 = false;
                                 qayli_hnaravorutyun = true;
                                 break a1;
                             }

                         }
                         if (view_i - sum2 >= 0 && opponentFigure3 == true) {
                             if (sev_spitak == true)
                                 is_shax = shax_spitak_tagavor_stugum(view_i - sum2, view_j, imageName, true);
                             else if (sev_spitak == false)
                                 is_shax = shax_sev_tagavor_stugum(view_i - sum2, view_j, imageName, true);

                             if (matrixBord[view_i - sum2][view_j].equals("datark")) {
                                 if (is_shax == true) {
                                     qayli_hnaravorutyun = true;
                                     break a1;
                                 }
                                 sum2++;
                             } else if (matrixBord[view_i - sum2][view_j].charAt(1) == 'e' && sev_spitak == true && is_shax == true) {
                                 opponentFigure3 = false;
                                 qayli_hnaravorutyun = true;
                                 break a1;
                             } else if (matrixBord[view_i - sum2][view_j].charAt(1) == 'p' && sev_spitak == false && is_shax == true) {
                                 opponentFigure3 = false;
                                 qayli_hnaravorutyun = true;
                                 break a1;
                             }

                         }
                         if (view_i + sum3 <= 7 && opponentFigure4 == true) {
                             if (sev_spitak == true)
                                 is_shax = shax_spitak_tagavor_stugum(view_i + sum3, view_j, imageName, true);
                             else if (sev_spitak == false)
                                 is_shax = shax_sev_tagavor_stugum(view_i + sum3, view_j, imageName, true);

                             if (matrixBord[view_i + sum3][view_j].equals("datark")) {
                                 if (is_shax == true) {
                                     qayli_hnaravorutyun = true;
                                     break a1;
                                 }
                                 sum3++;
                             } else if (matrixBord[view_i + sum3][view_j].charAt(1) == 'e' && sev_spitak == true && is_shax == true) {
                                 opponentFigure4 = false;
                                 qayli_hnaravorutyun = true;
                                 break a1;
                             } else if (matrixBord[view_i + sum3][view_j].charAt(1) == 'p' && sev_spitak == false && is_shax == true) {
                                 opponentFigure4 = false;
                                 qayli_hnaravorutyun = true;
                                 break a1;
                             }
                         }


                         if (view_j - sum00 >= 0 && view_i - sum00 >= 0 && opponentFigure11 == true) {
                             if (sev_spitak == true)
                                 is_shax = shax_spitak_tagavor_stugum(view_i - sum00, view_j - sum00, imageName, true);
                             else if (sev_spitak == false)
                                 is_shax = shax_sev_tagavor_stugum(view_i - sum00, view_j - sum00, imageName, true);

                             if (matrixBord[view_i - sum00][view_j - sum00].equals("datark")) {
                                 if (is_shax == true) {
                                     qayli_hnaravorutyun = true;
                                     break a1;
                                 }
                                 sum00++;
                             } else if (matrixBord[view_i - sum00][view_j - sum00].charAt(1) == 'e' && sev_spitak == true && is_shax == true) {
                                 opponentFigure11 = false;
                                 qayli_hnaravorutyun = true;
                                 break a1;
                             } else if (matrixBord[view_i - sum00][view_j - sum00].charAt(1) == 'p' && sev_spitak == false && is_shax == true) {
                                 opponentFigure11 = false;
                                 qayli_hnaravorutyun = true;
                                 break a1;
                             }

                         }
                         if (view_j + sum11 <= 7 && view_i + sum11 <= 7 && opponentFigure22 == true) {
                             if (sev_spitak == true)
                                 is_shax = shax_spitak_tagavor_stugum(view_i + sum11, view_j + sum11, imageName, true);
                             else if (sev_spitak == false)
                                 is_shax = shax_sev_tagavor_stugum(view_i + sum11, view_j + sum11, imageName, true);

                             if (matrixBord[view_i + sum11][view_j + sum11].equals("datark")) {
                                 if (is_shax == true) {
                                     qayli_hnaravorutyun = true;
                                     break a1;
                                 }
                                 sum11++;
                             } else if (matrixBord[view_i + sum11][view_j + sum11].charAt(1) == 'e' && sev_spitak == true && is_shax == true) {
                                 opponentFigure22 = false;
                                 qayli_hnaravorutyun = true;
                                 break a1;
                             } else if (matrixBord[view_i + sum11][view_j + sum11].charAt(1) == 'p' && sev_spitak == false && is_shax == true) {
                                 opponentFigure22 = false;
                                 qayli_hnaravorutyun = true;
                                 break a1;
                             }

                         }
                         if (view_i - sum22 >= 0 && view_j + sum22 <= 7 && opponentFigure33 == true) {
                             if (sev_spitak == true)
                                 is_shax = shax_spitak_tagavor_stugum(view_i - sum22, view_j + sum22, imageName, true);
                             else if (sev_spitak == false)
                                 is_shax = shax_sev_tagavor_stugum(view_i - sum22, view_j + sum22, imageName, true);

                             if (matrixBord[view_i - sum22][view_j + sum22].equals("datark")) {
                                 if (is_shax == true) {
                                     qayli_hnaravorutyun = true;
                                     break a1;
                                 }
                                 sum22++;
                             } else if (matrixBord[view_i - sum22][view_j + sum22].charAt(1) == 'e' && sev_spitak == true && is_shax == true) {
                                 opponentFigure33 = false;
                                 qayli_hnaravorutyun = true;
                                 break a1;
                             } else if (matrixBord[view_i - sum22][view_j + sum22].charAt(1) == 'p' && sev_spitak == false && is_shax == true) {
                                 opponentFigure33 = false;
                                 qayli_hnaravorutyun = true;
                                 break a1;
                             }

                         }
                         if (view_i + sum33 <= 7 && view_j - sum33 >= 0 && opponentFigure44 == true) {
                             if (sev_spitak == true)
                                 is_shax = shax_spitak_tagavor_stugum(view_i + sum33, view_j - sum33, imageName, true);
                             else if (sev_spitak == false)
                                 is_shax = shax_sev_tagavor_stugum(view_i + sum33, view_j - sum33, imageName, true);

                             if (matrixBord[view_i + sum33][view_j - sum33].equals("datark")) {
                                 if (is_shax == true) {
                                     qayli_hnaravorutyun = true;
                                     break a1;
                                 }
                                 sum33++;
                             } else if (matrixBord[view_i + sum33][view_j - sum33].charAt(1) == 'e' && sev_spitak == true && is_shax == true) {
                                 opponentFigure44 = false;
                                 qayli_hnaravorutyun = true;
                                 break a1;
                             } else if (matrixBord[view_i + sum33][view_j - sum33].charAt(1) == 'p' && sev_spitak == false && is_shax == true) {
                                 opponentFigure44 = false;
                                 qayli_hnaravorutyun = true;
                                 break a1;
                             }
                         }
                     }
                 }
             }


             for (int k = 0; k < 10; k++) {

                 figuri_arkayutyun = false;
                 imageName = "";
                 if (k == 0) {
                     if (sev_spitak == true) {
                         imageName = "spitak_navak_1";
                     } else {
                         imageName = "sev_navak_1";
                     }
                 } else if (k == 1) {
                     if (sev_spitak == true) {
                         imageName = "spitak_navak_2";
                     } else {
                         imageName = "sev_navak_2";
                     }
                 } else if (k == 2) {
                     if (sev_spitak == true) {
                         imageName = "spitak_navak_3";
                     } else {
                         imageName = "sev_navak_3";
                     }
                 } else if (k == 3) {
                     if (sev_spitak == true) {
                         imageName = "spitak_navak_4";
                     } else {
                         imageName = "sev_navak_4";
                     }
                 } else if (k == 4) {
                     if (sev_spitak == true) {
                         imageName = "spitak_navak_5";
                     } else {
                         imageName = "sev_navak_5";
                     }
                 } else if (k == 5) {
                     if (sev_spitak == true) {
                         imageName = "spitak_navak_6";
                     } else {
                         imageName = "sev_navak_6";
                     }
                 } else if (k == 6) {
                     if (sev_spitak == true) {
                         imageName = "spitak_navak_7";
                     } else {
                         imageName = "sev_navak_7";
                     }
                 } else if (k == 7) {
                     if (sev_spitak == true) {
                         imageName = "spitak_navak_8";
                     } else {
                         imageName = "sev_navak_8";
                     }
                 } else if (k == 8) {
                     if (sev_spitak == true) {
                         imageName = "spitak_navak_9";
                     } else {
                         imageName = "sev_navak_9";
                     }
                 } else if (k == 9) {
                     if (sev_spitak == true) {
                         imageName = "spitak_navak_0";
                     } else {
                         imageName = "sev_navak_0";
                     }
                 }


                 for (int i = 0; i < 8; i++) {
                     for (int j = 0; j < 8; j++) {
                         if (matrixBord[i][j].equals(imageName)) {
                             view_i = i;
                             view_j = j;
                             figuri_arkayutyun = true;
                         }
                     }
                 }


                 if (figuri_arkayutyun == true) {
                     int sum = 1;
                     int sum1 = 1;
                     int sum2 = 1;
                     int sum3 = 1;
                     boolean opponentFigure1 = true;
                     boolean opponentFigure2 = true;
                     boolean opponentFigure3 = true;
                     boolean opponentFigure4 = true;

                     boolean is_shax = true;

                     for (int i = 0; i < 8; i++) {
                         if (view_j - sum >= 0 && opponentFigure1 == true) {


                             if (sev_spitak == true)
                                 is_shax = shax_spitak_tagavor_stugum(view_i, view_j - sum, imageName, true);
                             else if (sev_spitak == false)
                                 is_shax = shax_sev_tagavor_stugum(view_i, view_j - sum, imageName, true);

                             if (matrixBord[view_i][view_j - sum].equals("datark")) {
                                 if (is_shax == true) {
                                     qayli_hnaravorutyun = true;
                                     break a1;
                                 }
                                 sum++;
                             } else if (matrixBord[view_i][view_j - sum].charAt(1) == 'e' && sev_spitak == true && is_shax == true) {
                                 opponentFigure1 = false;
                                 qayli_hnaravorutyun = true;
                                 break a1;
                             } else if (matrixBord[view_i][view_j - sum].charAt(1) == 'p' && sev_spitak == false && is_shax == true) {
                                 opponentFigure1 = false;
                                 qayli_hnaravorutyun = true;
                                 break a1;
                             }


                         }
                         if (view_j + sum1 <= 7 && opponentFigure2 == true) {

                             if (sev_spitak == true)
                                 is_shax = shax_spitak_tagavor_stugum(view_i, view_j + sum1, imageName, true);
                             else if (sev_spitak == false)
                                 is_shax = shax_sev_tagavor_stugum(view_i, view_j + sum1, imageName, true);


                             if (matrixBord[view_i][view_j + sum1].equals("datark")) {
                                 if (is_shax == true) {
                                     qayli_hnaravorutyun = true;
                                     break a1;
                                 }
                                 sum1++;
                             } else if (matrixBord[view_i][view_j + sum1].charAt(1) == 'e' && sev_spitak == true && is_shax == true) {
                                 opponentFigure2 = false;
                                 qayli_hnaravorutyun = true;
                                 break a1;
                             } else if (matrixBord[view_i][view_j + sum1].charAt(1) == 'p' && sev_spitak == false && is_shax == true) {
                                 opponentFigure2 = false;
                                 qayli_hnaravorutyun = true;
                                 break a1;
                             }


                         }
                         if (view_i - sum2 >= 0 && opponentFigure3 == true) {

                             if (sev_spitak == true)
                                 is_shax = shax_spitak_tagavor_stugum(view_i - sum2, view_j, imageName, true);
                             else if (sev_spitak == false)
                                 is_shax = shax_sev_tagavor_stugum(view_i - sum2, view_j, imageName, true);


                             if (matrixBord[view_i - sum2][view_j].equals("datark")) {
                                 if (is_shax == true) {
                                     qayli_hnaravorutyun = true;
                                     break a1;
                                 }
                                 sum2++;
                             } else if (matrixBord[view_i - sum2][view_j].charAt(1) == 'e' && sev_spitak == true && is_shax == true) {
                                 opponentFigure3 = false;
                                 qayli_hnaravorutyun = true;
                                 break a1;
                             } else if (matrixBord[view_i - sum2][view_j].charAt(1) == 'p' && sev_spitak == false && is_shax == true) {
                                 opponentFigure3 = false;
                                 qayli_hnaravorutyun = true;
                                 break a1;
                             }

                         }
                         if (view_i + sum3 <= 7 && opponentFigure4 == true) {

                             if (sev_spitak == true)
                                 is_shax = shax_spitak_tagavor_stugum(view_i + sum3, view_j, imageName, true);
                             else if (sev_spitak == false)
                                 is_shax = shax_sev_tagavor_stugum(view_i + sum3, view_j, imageName, true);


                             if (matrixBord[view_i + sum3][view_j].equals("datark")) {
                                 if (is_shax == true) {
                                     qayli_hnaravorutyun = true;
                                     break a1;
                                 }
                                 sum3++;
                             } else if (matrixBord[view_i + sum3][view_j].charAt(1) == 'e' && sev_spitak == true && is_shax == true) {
                                 opponentFigure4 = false;
                                 qayli_hnaravorutyun = true;
                                 break a1;
                             } else if (matrixBord[view_i + sum3][view_j].charAt(1) == 'p' && sev_spitak == false && is_shax == true) {
                                 opponentFigure4 = false;
                                 qayli_hnaravorutyun = true;
                                 break a1;
                             }

                         }
                     }
                 }
             }

             for (int k = 0; k < 10; k++) {

                 figuri_arkayutyun = false;
                 imageName = "";
                 if (k == 0) {
                     if (sev_spitak == true) {
                         imageName = "spitak_pix_1";
                     } else {
                         imageName = "sev_pix_1";
                     }
                 } else if (k == 1) {
                     if (sev_spitak == true) {
                         imageName = "spitak_pix_2";
                     } else {
                         imageName = "sev_pix_2";
                     }
                 } else if (k == 2) {
                     if (sev_spitak == true) {
                         imageName = "spitak_pix_3";
                     } else {
                         imageName = "sev_pix_3";
                     }
                 } else if (k == 3) {
                     if (sev_spitak == true) {
                         imageName = "spitak_pix_4";
                     } else {
                         imageName = "sev_pix_4";
                     }
                 } else if (k == 4) {
                     if (sev_spitak == true) {
                         imageName = "spitak_pix_5";
                     } else {
                         imageName = "sev_pix_5";
                     }
                 } else if (k == 5) {
                     if (sev_spitak == true) {
                         imageName = "spitak_pix_6";
                     } else {
                         imageName = "sev_pix_6";
                     }
                 } else if (k == 6) {
                     if (sev_spitak == true) {
                         imageName = "spitak_pix_7";
                     } else {
                         imageName = "sev_pix_7";
                     }
                 } else if (k == 7) {
                     if (sev_spitak == true) {
                         imageName = "spitak_pix_8";
                     } else {
                         imageName = "sev_pix_8";
                     }
                 } else if (k == 8) {
                     if (sev_spitak == true) {
                         imageName = "spitak_pix_9";
                     } else {
                         imageName = "sev_pix_9";
                     }
                 } else if (k == 9) {
                     if (sev_spitak == true) {
                         imageName = "spitak_pix_0";
                     } else {
                         imageName = "sev_pix_0";
                     }
                 }


                 for (int i = 0; i < 8; i++) {
                     for (int j = 0; j < 8; j++) {
                         if (matrixBord[i][j].equals(imageName)) {
                             view_i = i;
                             view_j = j;
                             figuri_arkayutyun = true;
                         }
                     }
                 }

                 if (figuri_arkayutyun == true) {
                     int sum = 1;
                     int sum1 = 1;
                     int sum2 = 1;
                     int sum3 = 1;
                     boolean opponentFigure1 = true;
                     boolean opponentFigure2 = true;
                     boolean opponentFigure3 = true;
                     boolean opponentFigure4 = true;
                     boolean is_shax = true;

                     for (int i = 0; i < 8; i++) {
                         if (view_j - sum >= 0 && view_i - sum >= 0 && opponentFigure1 == true) {
                             if (sev_spitak == true)
                                 is_shax = shax_spitak_tagavor_stugum(view_i - sum, view_j - sum, imageName, true);
                             else if (sev_spitak == false)
                                 is_shax = shax_sev_tagavor_stugum(view_i - sum, view_j - sum, imageName, true);

                             if (matrixBord[view_i - sum][view_j - sum].equals("datark")) {
                                 if (is_shax == true) {
                                     qayli_hnaravorutyun = true;
                                     break a1;
                                 }
                                 sum++;
                             } else if (matrixBord[view_i - sum][view_j - sum].charAt(1) == 'e' && sev_spitak == true && is_shax == true) {
                                 opponentFigure1 = false;
                                 qayli_hnaravorutyun = true;
                                 break a1;
                             } else if (matrixBord[view_i - sum][view_j - sum].charAt(1) == 'p' && sev_spitak == false && is_shax == true) {
                                 opponentFigure1 = false;
                                 qayli_hnaravorutyun = true;
                                 break a1;
                             }

                         }
                         if (view_j + sum1 <= 7 && view_i + sum1 <= 7 && opponentFigure2 == true) {
                             if (sev_spitak == true)
                                 is_shax = shax_spitak_tagavor_stugum(view_i + sum1, view_j + sum1, imageName, true);
                             else if (sev_spitak == false)
                                 is_shax = shax_sev_tagavor_stugum(view_i + sum1, view_j + sum1, imageName, true);

                             if (matrixBord[view_i + sum1][view_j + sum1].equals("datark")) {
                                 if (is_shax == true) {
                                     qayli_hnaravorutyun = true;
                                     break a1;
                                 }
                                 sum1++;
                             } else if (matrixBord[view_i + sum1][view_j + sum1].charAt(1) == 'e' && sev_spitak == true && is_shax == true) {
                                 opponentFigure2 = false;
                                 qayli_hnaravorutyun = true;
                                 break a1;
                             } else if (matrixBord[view_i + sum1][view_j + sum1].charAt(1) == 'p' && sev_spitak == false && is_shax == true) {
                                 opponentFigure2 = false;
                                 qayli_hnaravorutyun = true;
                                 break a1;
                             }

                         }
                         if (view_i - sum2 >= 0 && view_j + sum2 <= 7 && opponentFigure3 == true) {
                             if (sev_spitak == true)
                                 is_shax = shax_spitak_tagavor_stugum(view_i - sum2, view_j + sum2, imageName, true);
                             else if (sev_spitak == false)
                                 is_shax = shax_sev_tagavor_stugum(view_i - sum2, view_j + sum2, imageName, true);

                             if (matrixBord[view_i - sum2][view_j + sum2].equals("datark")) {
                                 if (is_shax == true) {
                                     qayli_hnaravorutyun = true;
                                     break a1;
                                 }
                                 sum2++;
                             } else if (matrixBord[view_i - sum2][view_j + sum2].charAt(1) == 'e' && sev_spitak == true && is_shax == true) {
                                 opponentFigure3 = false;
                                 qayli_hnaravorutyun = true;
                                 break a1;
                             } else if (matrixBord[view_i - sum2][view_j + sum2].charAt(1) == 'p' && sev_spitak == false && is_shax == true) {
                                 opponentFigure3 = false;
                                 qayli_hnaravorutyun = true;
                                 break a1;
                             }

                         }
                         if (view_i + sum3 <= 7 && view_j - sum3 >= 0 && opponentFigure4 == true) {
                             if (sev_spitak == true)
                                 is_shax = shax_spitak_tagavor_stugum(view_i + sum3, view_j - sum3, imageName, true);
                             else if (sev_spitak == false)
                                 is_shax = shax_sev_tagavor_stugum(view_i + sum3, view_j - sum3, imageName, true);

                             if (matrixBord[view_i + sum3][view_j - sum3].equals("datark")) {
                                 if (is_shax == true) {
                                     qayli_hnaravorutyun = true;
                                     break a1;
                                 }
                                 sum3++;
                             } else if (matrixBord[view_i + sum3][view_j - sum3].charAt(1) == 'e' && sev_spitak == true && is_shax == true) {
                                 opponentFigure4 = false;
                                 qayli_hnaravorutyun = true;
                                 break a1;
                             } else if (matrixBord[view_i + sum3][view_j - sum3].charAt(1) == 'p' && sev_spitak == false && is_shax == true) {
                                 opponentFigure4 = false;
                                 qayli_hnaravorutyun = true;
                                 break a1;
                             }
                         }
                     }
                 }
             }


             for (int k = 0; k < 10; k++) {

                 figuri_arkayutyun = false;
                 imageName = "";
                 if (k == 0) {
                     if (sev_spitak == true) {
                         imageName = "spitak_dzi_1";
                     } else {
                         imageName = "sev_dzi_1";
                     }
                 } else if (k == 1) {
                     if (sev_spitak == true) {
                         imageName = "spitak_dzi_2";
                     } else {
                         imageName = "sev_dzi_2";
                     }
                 } else if (k == 2) {
                     if (sev_spitak == true) {
                         imageName = "spitak_dzi_3";
                     } else {
                         imageName = "sev_dzi_3";
                     }
                 } else if (k == 3) {
                     if (sev_spitak == true) {
                         imageName = "spitak_dzi_4";
                     } else {
                         imageName = "sev_dzi_4";
                     }
                 } else if (k == 4) {
                     if (sev_spitak == true) {
                         imageName = "spitak_dzi_5";
                     } else {
                         imageName = "sev_dzi_5";
                     }
                 } else if (k == 5) {
                     if (sev_spitak == true) {
                         imageName = "spitak_dzi_6";
                     } else {
                         imageName = "sev_dzi_6";
                     }
                 } else if (k == 6) {
                     if (sev_spitak == true) {
                         imageName = "spitak_dzi_7";
                     } else {
                         imageName = "sev_dzi_7";
                     }
                 } else if (k == 7) {
                     if (sev_spitak == true) {
                         imageName = "spitak_dzi_8";
                     } else {
                         imageName = "sev_dzi_8";
                     }
                 } else if (k == 8) {
                     if (sev_spitak == true) {
                         imageName = "spitak_dzi_9";
                     } else {
                         imageName = "sev_dzi_9";
                     }
                 } else if (k == 9) {
                     if (sev_spitak == true) {
                         imageName = "spitak_dzi_0";
                     } else {
                         imageName = "sev_dzi_0";
                     }
                 }


                 for (int i = 0; i < 8; i++) {
                     for (int j = 0; j < 8; j++) {
                         if (matrixBord[i][j].equals(imageName)) {
                             view_i = i;
                             view_j = j;
                             figuri_arkayutyun = true;
                         }
                     }
                 }

                 if (figuri_arkayutyun == true) {

                     boolean is_shax = true;


                     if (view_j + 1 <= 7 && view_i - 2 >= 0) {
                         if (sev_spitak == true)
                             is_shax = shax_spitak_tagavor_stugum(view_i - 2, view_j + 1, imageName, true);
                         else if (sev_spitak == false)
                             is_shax = shax_sev_tagavor_stugum(view_i - 2, view_j + 1, imageName, true);

                         if (matrixBord[view_i - 2][view_j + 1].equals("datark") && is_shax == true) {
                             qayli_hnaravorutyun = true;
                             break a1;
                         } else if (matrixBord[view_i - 2][view_j + 1].charAt(1) == 'e' && sev_spitak == true && is_shax == true) {
                             qayli_hnaravorutyun = true;
                             break a1;
                         } else if (matrixBord[view_i - 2][view_j + 1].charAt(1) == 'p' && sev_spitak == false && is_shax == true) {
                             qayli_hnaravorutyun = true;
                             break a1;
                         }

                     }
                     if (view_j + 2 <= 7 && view_i - 1 >= 0) {
                         if (sev_spitak == true)
                             is_shax = shax_spitak_tagavor_stugum(view_i - 1, view_j + 2, imageName, true);
                         else if (sev_spitak == false)
                             is_shax = shax_sev_tagavor_stugum(view_i - 1, view_j + 2, imageName, true);

                         if (matrixBord[view_i - 1][view_j + 2].equals("datark") && is_shax == true) {
                             qayli_hnaravorutyun = true;
                             break a1;
                         } else if (matrixBord[view_i - 1][view_j + 2].charAt(1) == 'e' && sev_spitak == true && is_shax == true) {
                             qayli_hnaravorutyun = true;
                             break a1;
                         } else if (matrixBord[view_i - 1][view_j + 2].charAt(1) == 'p' && sev_spitak == false && is_shax == true) {
                             qayli_hnaravorutyun = true;
                             break a1;
                         }

                     }
                     if (view_j + 2 <= 7 && view_i + 1 <= 7) {
                         if (sev_spitak == true)
                             is_shax = shax_spitak_tagavor_stugum(view_i + 1, view_j + 2, imageName, true);
                         else if (sev_spitak == false)
                             is_shax = shax_sev_tagavor_stugum(view_i + 1, view_j + 2, imageName, true);

                         if (matrixBord[view_i + 1][view_j + 2].equals("datark") && is_shax == true) {
                             qayli_hnaravorutyun = true;
                             break a1;
                         } else if (matrixBord[view_i + 1][view_j + 2].charAt(1) == 'e' && sev_spitak == true && is_shax == true) {
                             qayli_hnaravorutyun = true;
                             break a1;
                         } else if (matrixBord[view_i + 1][view_j + 2].charAt(1) == 'p' && sev_spitak == false && is_shax == true) {
                             qayli_hnaravorutyun = true;
                             break a1;
                         }

                     }
                     if (view_j + 1 <= 7 && view_i + 2 <= 7) {
                         if (sev_spitak == true)
                             is_shax = shax_spitak_tagavor_stugum(view_i + 2, view_j + 1, imageName, true);
                         else if (sev_spitak == false)
                             is_shax = shax_sev_tagavor_stugum(view_i + 2, view_j + 1, imageName, true);

                         if (matrixBord[view_i + 2][view_j + 1].equals("datark") && is_shax == true) {
                             qayli_hnaravorutyun = true;
                             break a1;
                         } else if (matrixBord[view_i + 2][view_j + 1].charAt(1) == 'e' && sev_spitak == true && is_shax == true) {
                             qayli_hnaravorutyun = true;
                             break a1;
                         } else if (matrixBord[view_i + 2][view_j + 1].charAt(1) == 'p' && sev_spitak == false && is_shax == true) {
                             qayli_hnaravorutyun = true;
                             break a1;
                         }

                     }
                     if (view_j - 1 >= 0 && view_i + 2 <= 7) {
                         if (sev_spitak == true)
                             is_shax = shax_spitak_tagavor_stugum(view_i + 2, view_j - 1, imageName, true);
                         else if (sev_spitak == false)
                             is_shax = shax_sev_tagavor_stugum(view_i + 2, view_j - 1, imageName, true);

                         if (matrixBord[view_i + 2][view_j - 1].equals("datark") && is_shax == true) {
                             qayli_hnaravorutyun = true;
                             break a1;
                         } else if (matrixBord[view_i + 2][view_j - 1].charAt(1) == 'e' && sev_spitak == true && is_shax == true) {
                             qayli_hnaravorutyun = true;
                             break a1;
                         } else if (matrixBord[view_i + 2][view_j - 1].charAt(1) == 'p' && sev_spitak == false && is_shax == true) {
                             qayli_hnaravorutyun = true;
                             break a1;
                         }

                     }
                     if (view_j - 2 >= 0 && view_i + 1 <= 7) {
                         if (sev_spitak == true)
                             is_shax = shax_spitak_tagavor_stugum(view_i + 1, view_j - 2, imageName, true);
                         else if (sev_spitak == false)
                             is_shax = shax_sev_tagavor_stugum(view_i + 1, view_j - 2, imageName, true);

                         if (matrixBord[view_i + 1][view_j - 2].equals("datark") && is_shax == true) {
                             qayli_hnaravorutyun = true;
                             break a1;
                         } else if (matrixBord[view_i + 1][view_j - 2].charAt(1) == 'e' && sev_spitak == true && is_shax == true) {
                             qayli_hnaravorutyun = true;
                             break a1;
                         } else if (matrixBord[view_i + 1][view_j - 2].charAt(1) == 'p' && sev_spitak == false && is_shax == true) {
                             qayli_hnaravorutyun = true;
                             break a1;
                         }

                     }
                     if (view_j - 2 >= 0 && view_i - 1 >= 0) {
                         if (sev_spitak == true)
                             is_shax = shax_spitak_tagavor_stugum(view_i - 1, view_j - 2, imageName, true);
                         else if (sev_spitak == false)
                             is_shax = shax_sev_tagavor_stugum(view_i - 1, view_j - 2, imageName, true);

                         if (matrixBord[view_i - 1][view_j - 2].equals("datark") && is_shax == true) {
                             qayli_hnaravorutyun = true;
                             break a1;
                         } else if (matrixBord[view_i - 1][view_j - 2].charAt(1) == 'e' && sev_spitak == true && is_shax == true) {
                             qayli_hnaravorutyun = true;
                             break a1;
                         } else if (matrixBord[view_i - 1][view_j - 2].charAt(1) == 'p' && sev_spitak == false && is_shax == true) {
                             qayli_hnaravorutyun = true;
                             break a1;
                         }

                     }
                     if (view_j - 1 >= 0 && view_i - 2 >= 0) {
                         if (sev_spitak == true)
                             is_shax = shax_spitak_tagavor_stugum(view_i - 2, view_j - 1, imageName, true);
                         else if (sev_spitak == false)
                             is_shax = shax_sev_tagavor_stugum(view_i - 2, view_j - 1, imageName, true);

                         if (matrixBord[view_i - 2][view_j - 1].equals("datark") && is_shax == true) {
                             qayli_hnaravorutyun = true;
                             break a1;
                         } else if (matrixBord[view_i - 2][view_j - 1].charAt(1) == 'e' && sev_spitak == true && is_shax == true) {
                             qayli_hnaravorutyun = true;
                             break a1;
                         } else if (matrixBord[view_i - 2][view_j - 1].charAt(1) == 'p' && sev_spitak == false && is_shax == true) {
                             qayli_hnaravorutyun = true;
                             break a1;
                         }
                     }
                 }
             }


             for (int k = 0; k < 8; k++) {

                 figuri_arkayutyun = false;
                 imageName = "";
                 boolean zinvor_qayl_chkatarel = true;
                 if (k == 0) {
                     if (sev_spitak == true) {
                         imageName = "spitak_zinvor_1";
                         zinvor_qayl_chkatarel = zinvor_spitak_1_qayl;
                     } else {
                         imageName = "sev_zinvor_1";
                         zinvor_qayl_chkatarel = zinvor_sev_1_qayl;
                     }
                 } else if (k == 1) {
                     if (sev_spitak == true) {
                         imageName = "spitak_zinvor_2";
                         zinvor_qayl_chkatarel = zinvor_spitak_2_qayl;
                     } else {
                         imageName = "sev_zinvor_2";
                         zinvor_qayl_chkatarel = zinvor_sev_2_qayl;
                     }
                 } else if (k == 2) {
                     if (sev_spitak == true) {
                         imageName = "spitak_zinvor_3";
                         zinvor_qayl_chkatarel = zinvor_spitak_3_qayl;
                     } else {
                         imageName = "sev_zinvor_3";
                         zinvor_qayl_chkatarel = zinvor_sev_3_qayl;
                     }
                 } else if (k == 3) {
                     if (sev_spitak == true) {
                         imageName = "spitak_zinvor_4";
                         zinvor_qayl_chkatarel = zinvor_spitak_4_qayl;
                     } else {
                         imageName = "sev_zinvor_4";
                         zinvor_qayl_chkatarel = zinvor_sev_4_qayl;
                     }
                 } else if (k == 4) {
                     if (sev_spitak == true) {
                         imageName = "spitak_zinvor_5";
                         zinvor_qayl_chkatarel = zinvor_spitak_5_qayl;
                     } else {
                         imageName = "sev_zinvor_5";
                         zinvor_qayl_chkatarel = zinvor_sev_5_qayl;
                     }
                 } else if (k == 5) {
                     if (sev_spitak == true) {
                         imageName = "spitak_zinvor_6";
                         zinvor_qayl_chkatarel = zinvor_spitak_6_qayl;
                     } else {
                         imageName = "sev_zinvor_6";
                         zinvor_qayl_chkatarel = zinvor_sev_6_qayl;
                     }
                 } else if (k == 6) {
                     if (sev_spitak == true) {
                         imageName = "spitak_zinvor_7";
                         zinvor_qayl_chkatarel = zinvor_spitak_7_qayl;
                     } else {
                         imageName = "sev_zinvor_7";
                         zinvor_qayl_chkatarel = zinvor_sev_7_qayl;
                     }
                 } else if (k == 7) {
                     if (sev_spitak == true) {
                         imageName = "spitak_zinvor_8";
                         zinvor_qayl_chkatarel = zinvor_spitak_8_qayl;
                     } else {
                         imageName = "sev_zinvor_8";
                         zinvor_qayl_chkatarel = zinvor_sev_8_qayl;
                     }
                 }


                 for (int i = 0; i < 8; i++) {
                     for (int j = 0; j < 8; j++) {
                         if (matrixBord[i][j].equals(imageName)) {
                             view_i = i;
                             view_j = j;
                             figuri_arkayutyun = true;

                         }
                     }
                 }

                 if (figuri_arkayutyun == true) {
                     boolean is_shax = true;

                     if (sev_spitak) {
                         ramka_1_i = view_i - 1;
                         ramka_1_j = view_j;
                         ramka_2_i = view_i - 2;
                         ramka_2_j = view_j;
                         ramka_3_i = view_i - 1;
                         ramka_3_j = view_j - 1;
                         ramka_4_i = view_i - 1;
                         ramka_4_j = view_j + 1;
                         ramka_5_i = view_i - 1;
                         ramka_5_j = view_j - 1;
                         ramka_6_i = view_i - 1;
                         ramka_6_j = view_j + 1;


                         if (ramka_1_i >= 0) {

                             is_shax = shax_spitak_tagavor_stugum(ramka_1_i, ramka_1_j, imageName, true);

                             if (matrixBord[ramka_1_i][ramka_1_j].equals("datark") && is_shax == true) {
                                 qayli_hnaravorutyun = true;
                                 break a1;
                             }
                         }

                         if (ramka_2_i >= 0) {
                             is_shax = shax_spitak_tagavor_stugum(ramka_2_i, ramka_2_j, imageName, true);

                             if (matrixBord[ramka_2_i][ramka_2_j].equals("datark") && matrixBord[ramka_1_i][ramka_1_j].equals("datark")
                                     && zinvor_qayl_chkatarel == true && is_shax == true) {
                                 qayli_hnaravorutyun = true;
                                 break a1;
                             }
                         }


                         if (ramka_3_i >= 0 && ramka_3_j >= 0) {
                             is_shax = shax_spitak_tagavor_stugum(ramka_3_i, ramka_3_j, imageName, true);

                             if (matrixBord[ramka_3_i][ramka_3_j].charAt(1) == 'e' && is_shax == true) {
                                 qayli_hnaravorutyun = true;
                                 break a1;
                             }
                         }

                         if (ramka_4_i >= 0 && ramka_4_j <= 7) {
                             is_shax = shax_spitak_tagavor_stugum(ramka_4_i, ramka_4_j, imageName, true);

                             if (matrixBord[ramka_4_i][ramka_4_j].charAt(1) == 'e' && is_shax == true) {
                                 qayli_hnaravorutyun = true;
                                 break a1;
                             }
                         }

                         if (view_i == 3 && ramka_5_j >= 0 && matrixBord[view_i][ramka_5_j].equals(zinvorClickRAmka2_num)) {

                             is_shax = shax_spitak_tagavor_stugum(view_i - 1, ramka_5_j, imageName, false);

                             if (is_shax == true) {
                                 qayli_hnaravorutyun = true;
                                 break a1;
                             }

                         }

                         if (view_i == 3 && ramka_6_j <= 7 && matrixBord[view_i][ramka_6_j].equals(zinvorClickRAmka2_num)) {

                             is_shax = shax_spitak_tagavor_stugum(view_i - 1, ramka_6_j, imageName, false);

                             if (is_shax == true) {
                                 qayli_hnaravorutyun = true;
                                 break a1;
                             }

                         }

                     } else {

                         ramka_1_i = view_i + 1;
                         ramka_1_j = view_j;
                         ramka_2_i = view_i + 2;
                         ramka_2_j = view_j;
                         ramka_3_i = view_i + 1;
                         ramka_3_j = view_j - 1;
                         ramka_4_i = view_i + 1;
                         ramka_4_j = view_j + 1;
                         ramka_5_i = view_i + 1;
                         ramka_5_j = view_j - 1;
                         ramka_6_i = view_i + 1;
                         ramka_6_j = view_j + 1;

                         if (ramka_1_i <= 7) {
                             is_shax = shax_sev_tagavor_stugum(ramka_1_i, ramka_1_j, imageName, true);

                             if (matrixBord[ramka_1_i][ramka_1_j].equals("datark") && is_shax == true) {
                                 qayli_hnaravorutyun = true;
                                 break a1;
                             }
                         }

                         if (ramka_2_i <= 7) {
                             is_shax = shax_sev_tagavor_stugum(ramka_2_i, ramka_2_j, imageName, true);

                             if (matrixBord[ramka_2_i][ramka_2_j].equals("datark") && matrixBord[ramka_1_i][ramka_1_j].equals("datark")
                                     && zinvor_qayl_chkatarel == true && is_shax == true) {
                                 qayli_hnaravorutyun = true;
                                 break a1;
                             }
                         }


                         if (ramka_3_i <= 7 && ramka_3_j >= 0) {
                             is_shax = shax_sev_tagavor_stugum(ramka_3_i, ramka_3_j, imageName, true);

                             if (matrixBord[ramka_3_i][ramka_3_j].charAt(1) == 'p' && is_shax == true) {
                                 qayli_hnaravorutyun = true;
                                 break a1;
                             }
                         }

                         if (ramka_4_i <= 7 && ramka_4_j <= 7) {
                             is_shax = shax_sev_tagavor_stugum(ramka_4_i, ramka_4_j, imageName, true);

                             if (matrixBord[ramka_4_i][ramka_4_j].charAt(1) == 'p' && is_shax == true) {
                                 qayli_hnaravorutyun = true;
                                 break a1;
                             }
                         }

                         if (view_i == 4 && ramka_5_j >= 0 && matrixBord[view_i][ramka_5_j].equals(zinvorClickRAmka2_num)) {
                             is_shax = shax_sev_tagavor_stugum(view_i + 1, ramka_5_j, imageName, false);

                             if (is_shax == true) {
                                 qayli_hnaravorutyun = true;
                                 break a1;
                             }

                         }

                         if (view_i == 4 && ramka_6_j <= 7 && matrixBord[view_i][ramka_6_j].equals(zinvorClickRAmka2_num)) {
                             is_shax = shax_sev_tagavor_stugum(view_i + 1, ramka_6_j, imageName, false);

                             if (is_shax == true) {
                                 qayli_hnaravorutyun = true;
                                 break a1;
                             }

                         }

                     }
                 }
             }


             //----arqa
             imageName = "";
             if (sev_spitak == true) {
                 imageName = "spitak_tagavor";
             } else {
                 imageName = "sev_tagavor";
             }

             for (int i = 0; i < 8; i++) {
                 for (int j = 0; j < 8; j++) {
                     if (matrixBord[i][j].equals(imageName)) {
                         view_i = i;
                         view_j = j;

                     }
                 }
             }

             boolean is_shax = true;


             if (view_i - 1 >= 0) {
                 if (sev_spitak==true)
                     is_shax=shax_spitak_tagavor_stugum(view_i-1,view_j,imageName,true);
                 else if(sev_spitak==false)
                     is_shax=shax_sev_tagavor_stugum(view_i-1,view_j,imageName,true);

                 if (matrixBord[view_i - 1][view_j].equals("datark") && is_shax==true) {
                     boolean b=true;
                     if (view_i-2>=0 && view_j-1>=0) {
                         if (matrixBord[view_i-2][view_j-1]=="spitak_tagavor" || matrixBord[view_i-2][view_j-1]=="sev_tagavor") {
                             b=false;
                         }
                     }
                     if (view_i-2>=0) {
                         if (matrixBord[view_i-2][view_j]=="spitak_tagavor" || matrixBord[view_i-2][view_j]=="sev_tagavor") {
                             b=false;
                         }
                     }
                     if (view_i-2>=0 && view_j+1<=7) {
                         if (matrixBord[view_i-2][view_j+1]=="spitak_tagavor" || matrixBord[view_i-2][view_j+1]=="sev_tagavor") {
                             b=false;
                         }
                     }

                         if (b==true) {
                             qayli_hnaravorutyun = true;
                             break a1;
                         }
                 } else if (matrixBord[view_i - 1][view_j].charAt(1) == 'e' && sev_spitak == true && is_shax == true) {
                     boolean b=true;
                     if (view_i-2>=0 && view_j-1>=0) {
                         if (matrixBord[view_i-2][view_j-1]=="spitak_tagavor" || matrixBord[view_i-2][view_j-1]=="sev_tagavor") {
                             b=false;
                         }
                     }
                     if (view_i-2>=0) {
                         if (matrixBord[view_i-2][view_j]=="spitak_tagavor" || matrixBord[view_i-2][view_j]=="sev_tagavor") {
                             b=false;
                         }
                     }
                     if (view_i-2>=0 && view_j+1<=7) {
                         if (matrixBord[view_i-2][view_j+1]=="spitak_tagavor" || matrixBord[view_i-2][view_j+1]=="sev_tagavor") {
                             b=false;
                         }
                     }

                     if (b==true) {
                         qayli_hnaravorutyun = true;
                         break a1;
                     }
                 } else if (matrixBord[view_i - 1][view_j].charAt(1) == 'p' && sev_spitak == false && is_shax == true) {
                     boolean b=true;
                     if (view_i-2>=0 && view_j-1>=0) {
                         if (matrixBord[view_i-2][view_j-1]=="spitak_tagavor" || matrixBord[view_i-2][view_j-1]=="sev_tagavor") {
                             b=false;
                         }
                     }
                     if (view_i-2>=0) {
                         if (matrixBord[view_i-2][view_j]=="spitak_tagavor" || matrixBord[view_i-2][view_j]=="sev_tagavor") {
                             b=false;
                         }
                     }
                     if (view_i-2>=0 && view_j+1<=7) {
                         if (matrixBord[view_i-2][view_j+1]=="spitak_tagavor" || matrixBord[view_i-2][view_j+1]=="sev_tagavor") {
                             b=false;
                         }
                     }

                     if (b==true) {
                         qayli_hnaravorutyun = true;
                         break a1;
                     }
                 }

             }

             if (view_i - 1 >= 0 && view_j+1<=7) {
                 if (sev_spitak==true)
                     is_shax=shax_spitak_tagavor_stugum(view_i-1,view_j+1,imageName,true);
                 else if(sev_spitak==false)
                     is_shax=shax_sev_tagavor_stugum(view_i-1,view_j+1,imageName,true);

                 if (matrixBord[view_i - 1][view_j+1].equals("datark") && is_shax==true) {
                     boolean b=true;
                     if (view_i-2>=0 && view_j+2<=7) {
                         if (matrixBord[view_i-2][view_j+2]=="spitak_tagavor" || matrixBord[view_i-2][view_j+2]=="sev_tagavor") {
                             b=false;
                         }
                     }
                     if (view_i-2>=0) {
                         if (matrixBord[view_i-2][view_j]=="spitak_tagavor" || matrixBord[view_i-2][view_j]=="sev_tagavor") {
                             b=false;
                         }
                     }
                     if (view_i-2>=0 && view_j+1<=7) {
                         if (matrixBord[view_i-2][view_j+1]=="spitak_tagavor" || matrixBord[view_i-2][view_j+1]=="sev_tagavor") {
                             b=false;
                         }
                     }
                     if (view_i-1>=0 && view_j+2<=7) {
                         if (matrixBord[view_i-1][view_j+2]=="spitak_tagavor" || matrixBord[view_i-1][view_j+2]=="sev_tagavor") {
                             b=false;
                         }
                     }
                     if (view_j+2<=7) {
                         if (matrixBord[view_i][view_j+2]=="spitak_tagavor" || matrixBord[view_i][view_j+2]=="sev_tagavor") {
                             b=false;
                         }
                     }

                     if (b==true) {
                         qayli_hnaravorutyun = true;
                         break a1;
                     }
                 } else if (matrixBord[view_i - 1][view_j+1].charAt(1) == 'e' && sev_spitak == true && is_shax == true) {
                     boolean b=true;
                     if (view_i-2>=0 && view_j+2<=7) {
                         if (matrixBord[view_i-2][view_j+2]=="spitak_tagavor" || matrixBord[view_i-2][view_j+2]=="sev_tagavor") {
                             b=false;
                         }
                     }
                     if (view_i-2>=0) {
                         if (matrixBord[view_i-2][view_j]=="spitak_tagavor" || matrixBord[view_i-2][view_j]=="sev_tagavor") {
                             b=false;
                         }
                     }
                     if (view_i-2>=0 && view_j+1<=7) {
                         if (matrixBord[view_i-2][view_j+1]=="spitak_tagavor" || matrixBord[view_i-2][view_j+1]=="sev_tagavor") {
                             b=false;
                         }
                     }
                     if (view_i-1>=0 && view_j+2<=7) {
                         if (matrixBord[view_i-1][view_j+2]=="spitak_tagavor" || matrixBord[view_i-1][view_j+2]=="sev_tagavor") {
                             b=false;
                         }
                     }
                     if (view_j+2<=7) {
                         if (matrixBord[view_i][view_j+2]=="spitak_tagavor" || matrixBord[view_i][view_j+2]=="sev_tagavor") {
                             b=false;
                         }
                     }

                     if (b==true) {
                         qayli_hnaravorutyun = true;
                         break a1;
                     }
                 } else if (matrixBord[view_i - 1][view_j+1].charAt(1) == 'p' && sev_spitak == false && is_shax == true) {
                     boolean b=true;
                     if (view_i-2>=0 && view_j+2<=7) {
                         if (matrixBord[view_i-2][view_j+2]=="spitak_tagavor" || matrixBord[view_i-2][view_j+2]=="sev_tagavor") {
                             b=false;
                         }
                     }
                     if (view_i-2>=0) {
                         if (matrixBord[view_i-2][view_j]=="spitak_tagavor" || matrixBord[view_i-2][view_j]=="sev_tagavor") {
                             b=false;
                         }
                     }
                     if (view_i-2>=0 && view_j+1<=7) {
                         if (matrixBord[view_i-2][view_j+1]=="spitak_tagavor" || matrixBord[view_i-2][view_j+1]=="sev_tagavor") {
                             b=false;
                         }
                     }
                     if (view_i-1>=0 && view_j+2<=7) {
                         if (matrixBord[view_i-1][view_j+2]=="spitak_tagavor" || matrixBord[view_i-1][view_j+2]=="sev_tagavor") {
                             b=false;
                         }
                     }
                     if (view_j+2<=7) {
                         if (matrixBord[view_i][view_j+2]=="spitak_tagavor" || matrixBord[view_i][view_j+2]=="sev_tagavor") {
                             b=false;
                         }
                     }

                     if (b==true) {
                         qayli_hnaravorutyun = true;
                         break a1;
                     }
                 }

             }

             if (view_j + 1 <=7) {
                 if (sev_spitak==true)
                     is_shax=shax_spitak_tagavor_stugum(view_i,view_j+1,imageName,true);
                 else if(sev_spitak==false)
                     is_shax=shax_sev_tagavor_stugum(view_i,view_j+1,imageName,true);

                 if (matrixBord[view_i][view_j+1].equals("datark") && is_shax==true) {
                     boolean b=true;
                     if (view_i-1>=0 && view_j+2<=7) {
                         if (matrixBord[view_i-1][view_j+2]=="spitak_tagavor" || matrixBord[view_i-1][view_j+2]=="sev_tagavor") {
                             b=false;
                         }
                     }
                     if (view_j+2<=7) {
                         if (matrixBord[view_i][view_j+2]=="spitak_tagavor" || matrixBord[view_i][view_j+2]=="sev_tagavor") {
                             b=false;
                         }
                     }
                     if (view_i+1<=7 && view_j+2<=7) {
                         if (matrixBord[view_i+1][view_j+2]=="spitak_tagavor" || matrixBord[view_i+1][view_j+2]=="sev_tagavor") {
                             b=false;
                         }
                     }

                     if (b==true) {
                         qayli_hnaravorutyun = true;
                         break a1;
                     }
                 } else if (matrixBord[view_i][view_j+1].charAt(1) == 'e' && sev_spitak == true && is_shax == true) {
                     boolean b=true;
                     if (view_i-1>=0 && view_j+2<=7) {
                         if (matrixBord[view_i-1][view_j+2]=="spitak_tagavor" || matrixBord[view_i-1][view_j+2]=="sev_tagavor") {
                             b=false;
                         }
                     }
                     if (view_j+2<=7) {
                         if (matrixBord[view_i][view_j+2]=="spitak_tagavor" || matrixBord[view_i][view_j+2]=="sev_tagavor") {
                             b=false;
                         }
                     }
                     if (view_i+1<=7 && view_j+2<=7) {
                         if (matrixBord[view_i+1][view_j+2]=="spitak_tagavor" || matrixBord[view_i+1][view_j+2]=="sev_tagavor") {
                             b=false;
                         }
                     }

                     if (b==true) {
                         qayli_hnaravorutyun = true;
                         break a1;
                     }
                 } else if (matrixBord[view_i][view_j+1].charAt(1) == 'p' && sev_spitak == false && is_shax == true) {
                     boolean b=true;
                     if (view_i-1>=0 && view_j+2<=7) {
                         if (matrixBord[view_i-1][view_j+2]=="spitak_tagavor" || matrixBord[view_i-1][view_j+2]=="sev_tagavor") {
                             b=false;
                         }
                     }
                     if (view_j+2<=7) {
                         if (matrixBord[view_i][view_j+2]=="spitak_tagavor" || matrixBord[view_i][view_j+2]=="sev_tagavor") {
                             b=false;
                         }
                     }
                     if (view_i+1<=7 && view_j+2<=7) {
                         if (matrixBord[view_i+1][view_j+2]=="spitak_tagavor" || matrixBord[view_i+1][view_j+2]=="sev_tagavor") {
                             b=false;
                         }
                     }

                     if (b==true) {
                         qayli_hnaravorutyun = true;
                         break a1;
                     }
                 }

             }

             if (view_i +1<=7 && view_j+1<=7) {
                 if (sev_spitak==true)
                     is_shax=shax_spitak_tagavor_stugum(view_i+1,view_j+1,imageName,true);
                 else if(sev_spitak==false)
                     is_shax=shax_sev_tagavor_stugum(view_i+1,view_j+1,imageName,true);

                 if (matrixBord[view_i + 1][view_j+1].equals("datark") && is_shax==true) {
                     boolean b=true;
                     if (view_j+2<=7) {
                         if (matrixBord[view_i][view_j+2]=="spitak_tagavor" || matrixBord[view_i][view_j+2]=="sev_tagavor") {
                             b=false;
                         }
                     }
                     if (view_i+1<=7 && view_j+2<=7) {
                         if (matrixBord[view_i+1][view_j+2]=="spitak_tagavor" || matrixBord[view_i+1][view_j+2]=="sev_tagavor") {
                             b=false;
                         }
                     }
                     if (view_i+2<=7 && view_j+2<=7) {
                         if (matrixBord[view_i+2][view_j+2]=="spitak_tagavor" || matrixBord[view_i+2][view_j+2]=="sev_tagavor") {
                             b=false;
                         }
                     }
                     if (view_i+2<=7 && view_j+1<=7) {
                         if (matrixBord[view_i+2][view_j+1]=="spitak_tagavor" || matrixBord[view_i+2][view_j+1]=="sev_tagavor") {
                             b=false;
                         }
                     }
                     if (view_i+2<=7) {
                         if (matrixBord[view_i+2][view_j]=="spitak_tagavor" || matrixBord[view_i+2][view_j]=="sev_tagavor") {
                             b=false;
                         }
                     }

                     if (b==true) {
                         qayli_hnaravorutyun = true;
                         break a1;
                     }
                 } else if (matrixBord[view_i + 1][view_j+1].charAt(1) == 'e' && sev_spitak == true && is_shax == true) {
                     boolean b=true;
                     if (view_j+2<=7) {
                         if (matrixBord[view_i][view_j+2]=="spitak_tagavor" || matrixBord[view_i][view_j+2]=="sev_tagavor") {
                             b=false;
                         }
                     }
                     if (view_i+1<=7 && view_j+2<=7) {
                         if (matrixBord[view_i+1][view_j+2]=="spitak_tagavor" || matrixBord[view_i+1][view_j+2]=="sev_tagavor") {
                             b=false;
                         }
                     }
                     if (view_i+2<=7 && view_j+2<=7) {
                         if (matrixBord[view_i+2][view_j+2]=="spitak_tagavor" || matrixBord[view_i+2][view_j+2]=="sev_tagavor") {
                             b=false;
                         }
                     }
                     if (view_i+2<=7 && view_j+1<=7) {
                         if (matrixBord[view_i+2][view_j+1]=="spitak_tagavor" || matrixBord[view_i+2][view_j+1]=="sev_tagavor") {
                             b=false;
                         }
                     }
                     if (view_i+2<=7) {
                         if (matrixBord[view_i+2][view_j]=="spitak_tagavor" || matrixBord[view_i+2][view_j]=="sev_tagavor") {
                             b=false;
                         }
                     }

                     if (b==true) {
                         qayli_hnaravorutyun = true;
                         break a1;
                     }
                 } else if (matrixBord[view_i + 1][view_j+1].charAt(1) == 'p' && sev_spitak == false && is_shax == true) {
                     boolean b=true;
                     if (view_j+2<=7) {
                         if (matrixBord[view_i][view_j+2]=="spitak_tagavor" || matrixBord[view_i][view_j+2]=="sev_tagavor") {
                             b=false;
                         }
                     }
                     if (view_i+1<=7 && view_j+2<=7) {
                         if (matrixBord[view_i+1][view_j+2]=="spitak_tagavor" || matrixBord[view_i+1][view_j+2]=="sev_tagavor") {
                             b=false;
                         }
                     }
                     if (view_i+2<=7 && view_j+2<=7) {
                         if (matrixBord[view_i+2][view_j+2]=="spitak_tagavor" || matrixBord[view_i+2][view_j+2]=="sev_tagavor") {
                             b=false;
                         }
                     }
                     if (view_i+2<=7 && view_j+1<=7) {
                         if (matrixBord[view_i+2][view_j+1]=="spitak_tagavor" || matrixBord[view_i+2][view_j+1]=="sev_tagavor") {
                             b=false;
                         }
                     }
                     if (view_i+2<=7) {
                         if (matrixBord[view_i+2][view_j]=="spitak_tagavor" || matrixBord[view_i+2][view_j]=="sev_tagavor") {
                             b=false;
                         }
                     }

                     if (b==true) {
                         qayli_hnaravorutyun = true;
                         break a1;
                     }
                 }

             }

             if (view_i + 1 <=7) {
                 if (sev_spitak==true)
                     is_shax=shax_spitak_tagavor_stugum(view_i+1,view_j,imageName,true);
                 else if(sev_spitak==false)
                     is_shax=shax_sev_tagavor_stugum(view_i+1,view_j,imageName,true);

                 if (matrixBord[view_i + 1][view_j].equals("datark") && is_shax==true) {
                     boolean b=true;
                     if (view_j+1<=7 && view_i+2<=7) {
                         if (matrixBord[view_i+2][view_j+1]=="spitak_tagavor" || matrixBord[view_i+2][view_j+1]=="sev_tagavor") {
                             b=false;
                         }
                     }
                     if (view_i+2<=7) {
                         if (matrixBord[view_i+2][view_j]=="spitak_tagavor" || matrixBord[view_i+2][view_j]=="sev_tagavor") {
                             b=false;
                         }
                     }
                     if (view_i+2<=7 && view_j-1>=0) {
                         if (matrixBord[view_i+2][view_j-1]=="spitak_tagavor" || matrixBord[view_i+2][view_j-1]=="sev_tagavor") {
                             b=false;
                         }
                     }

                     if (b==true) {
                         qayli_hnaravorutyun = true;
                         break a1;
                     }
                 } else if (matrixBord[view_i + 1][view_j].charAt(1) == 'e' && sev_spitak == true && is_shax == true) {
                     boolean b=true;
                     if (view_j+1<=7 && view_i+2<=7) {
                         if (matrixBord[view_i+2][view_j+1]=="spitak_tagavor" || matrixBord[view_i+2][view_j+1]=="sev_tagavor") {
                             b=false;
                         }
                     }
                     if (view_i+2<=7) {
                         if (matrixBord[view_i+2][view_j]=="spitak_tagavor" || matrixBord[view_i+2][view_j]=="sev_tagavor") {
                             b=false;
                         }
                     }
                     if (view_i+2<=7 && view_j-1>=0) {
                         if (matrixBord[view_i+2][view_j-1]=="spitak_tagavor" || matrixBord[view_i+2][view_j-1]=="sev_tagavor") {
                             b=false;
                         }
                     }

                     if (b==true) {
                         qayli_hnaravorutyun = true;
                         break a1;
                     }
                 } else if (matrixBord[view_i + 1][view_j].charAt(1) == 'p' && sev_spitak == false && is_shax == true) {
                     boolean b=true;
                     if (view_j+1<=7 && view_i+2<=7) {
                         if (matrixBord[view_i+2][view_j+1]=="spitak_tagavor" || matrixBord[view_i+2][view_j+1]=="sev_tagavor") {
                             b=false;
                         }
                     }
                     if (view_i+2<=7) {
                         if (matrixBord[view_i+2][view_j]=="spitak_tagavor" || matrixBord[view_i+2][view_j]=="sev_tagavor") {
                             b=false;
                         }
                     }
                     if (view_i+2<=7 && view_j-1>=0) {
                         if (matrixBord[view_i+2][view_j-1]=="spitak_tagavor" || matrixBord[view_i+2][view_j-1]=="sev_tagavor") {
                             b=false;
                         }
                     }

                     if (b==true) {
                         qayli_hnaravorutyun = true;
                         break a1;
                     }
                 }

             }

             if (view_i + 1 <=7 && view_j-1>=0) {
                 if (sev_spitak==true)
                     is_shax=shax_spitak_tagavor_stugum(view_i+1,view_j-1,imageName,true);
                 else if(sev_spitak==false)
                     is_shax=shax_sev_tagavor_stugum(view_i+1,view_j-1,imageName,true);

                 if (matrixBord[view_i + 1][view_j-1].equals("datark") && is_shax==true) {
                     boolean b=true;
                     if (view_j-2>=0 && view_i+2<=7) {
                         if (matrixBord[view_i+2][view_j-2]=="spitak_tagavor" || matrixBord[view_i+2][view_j-2]=="sev_tagavor") {
                             b=false;
                         }
                     }
                     if (view_i+2<=7) {
                         if (matrixBord[view_i+2][view_j]=="spitak_tagavor" || matrixBord[view_i+2][view_j]=="sev_tagavor") {
                             b=false;
                         }
                     }
                     if (view_i+2<=7 && view_j-1>=0) {
                         if (matrixBord[view_i+2][view_j-1]=="spitak_tagavor" || matrixBord[view_i+2][view_j-1]=="sev_tagavor") {
                             b=false;
                         }
                     }
                     if (view_i-1>=0 && view_j-2>=0) {
                         if (matrixBord[view_i-1][view_j-2]=="spitak_tagavor" || matrixBord[view_i-1][view_j-2]=="sev_tagavor") {
                             b=false;
                         }
                     }
                     if (view_j-2>=0) {
                         if (matrixBord[view_i][view_j-2]=="spitak_tagavor" || matrixBord[view_i][view_j-2]=="sev_tagavor") {
                             b=false;
                         }
                     }

                     if (b==true) {
                         qayli_hnaravorutyun = true;
                         break a1;
                     }
                 } else if (matrixBord[view_i + 1][view_j-1].charAt(1) == 'e' && sev_spitak == true && is_shax == true) {
                     boolean b=true;
                     if (view_j-2>=0 && view_i+2<=7) {
                         if (matrixBord[view_i+2][view_j-2]=="spitak_tagavor" || matrixBord[view_i+2][view_j-2]=="sev_tagavor") {
                             b=false;
                         }
                     }
                     if (view_i+2<=7) {
                         if (matrixBord[view_i+2][view_j]=="spitak_tagavor" || matrixBord[view_i+2][view_j]=="sev_tagavor") {
                             b=false;
                         }
                     }
                     if (view_i+2<=7 && view_j-1>=0) {
                         if (matrixBord[view_i+2][view_j-1]=="spitak_tagavor" || matrixBord[view_i+2][view_j-1]=="sev_tagavor") {
                             b=false;
                         }
                     }
                     if (view_i-1>=0 && view_j-2>=0) {
                         if (matrixBord[view_i-1][view_j-2]=="spitak_tagavor" || matrixBord[view_i-1][view_j-2]=="sev_tagavor") {
                             b=false;
                         }
                     }
                     if (view_j-2>=0) {
                         if (matrixBord[view_i][view_j-2]=="spitak_tagavor" || matrixBord[view_i][view_j-2]=="sev_tagavor") {
                             b=false;
                         }
                     }

                     if (b==true) {
                         qayli_hnaravorutyun = true;
                         break a1;
                     }
                 } else if (matrixBord[view_i + 1][view_j-1].charAt(1) == 'p' && sev_spitak == false && is_shax == true) {
                     boolean b=true;
                     if (view_j-2>=0 && view_i+2<=7) {
                         if (matrixBord[view_i+2][view_j-2]=="spitak_tagavor" || matrixBord[view_i+2][view_j-2]=="sev_tagavor") {
                             b=false;
                         }
                     }
                     if (view_i+2<=7) {
                         if (matrixBord[view_i+2][view_j]=="spitak_tagavor" || matrixBord[view_i+2][view_j]=="sev_tagavor") {
                             b=false;
                         }
                     }
                     if (view_i+2<=7 && view_j-1>=0) {
                         if (matrixBord[view_i+2][view_j-1]=="spitak_tagavor" || matrixBord[view_i+2][view_j-1]=="sev_tagavor") {
                             b=false;
                         }
                     }
                     if (view_i-1>=0 && view_j-2>=0) {
                         if (matrixBord[view_i-1][view_j-2]=="spitak_tagavor" || matrixBord[view_i-1][view_j-2]=="sev_tagavor") {
                             b=false;
                         }
                     }
                     if (view_j-2>=0) {
                         if (matrixBord[view_i][view_j-2]=="spitak_tagavor" || matrixBord[view_i][view_j-2]=="sev_tagavor") {
                             b=false;
                         }
                     }

                     if (b==true) {
                         qayli_hnaravorutyun = true;
                         break a1;
                     }
                 }

             }

             if (view_j - 1 >= 0) {
                 if (sev_spitak==true)
                     is_shax=shax_spitak_tagavor_stugum(view_i,view_j-1,imageName,true);
                 else if(sev_spitak==false) {
                     is_shax = shax_sev_tagavor_stugum(view_i, view_j - 1, imageName, true);
                 }

                 if (matrixBord[view_i][view_j-1].equals("datark") && is_shax==true) {
                     boolean b=true;
                     if (view_j-2>=0 && view_i+1<=7) {
                         if (matrixBord[view_i+1][view_j-2]=="spitak_tagavor" || matrixBord[view_i+1][view_j-2]=="sev_tagavor") {
                             b=false;
                         }
                     }
                     if (view_j-2>=0) {
                         if (matrixBord[view_i][view_j-2]=="spitak_tagavor" || matrixBord[view_i][view_j-2]=="sev_tagavor") {
                             b=false;
                         }
                     }
                     if (view_i-1>=0 && view_j-2>=0) {
                         if (matrixBord[view_i-1][view_j-2]=="spitak_tagavor" || matrixBord[view_i-1][view_j-2]=="sev_tagavor") {
                             b=false;
                         }
                     }

                     if (b==true) {
                         qayli_hnaravorutyun = true;
                         break a1;
                     }
                 } else if (matrixBord[view_i][view_j-1].charAt(1) == 'e' && sev_spitak == true && is_shax == true) {
                     boolean b=true;
                     if (view_j-2>=0 && view_i+1<=7) {
                         if (matrixBord[view_i+1][view_j-2]=="spitak_tagavor" || matrixBord[view_i+1][view_j-2]=="sev_tagavor") {
                             b=false;
                         }
                     }
                     if (view_j-2>=0) {
                         if (matrixBord[view_i][view_j-2]=="spitak_tagavor" || matrixBord[view_i][view_j-2]=="sev_tagavor") {
                             b=false;
                         }
                     }
                     if (view_i-1>=0 && view_j-2>=0) {
                         if (matrixBord[view_i-1][view_j-2]=="spitak_tagavor" || matrixBord[view_i-1][view_j-2]=="sev_tagavor") {
                             b=false;
                         }
                     }

                     if (b==true) {
                         qayli_hnaravorutyun = true;
                         break a1;
                     }
                 } else if (matrixBord[view_i][view_j-1].charAt(1) == 'p' && sev_spitak == false && is_shax == true) {
                     boolean b=true;
                     if (view_j-2>=0 && view_i+1<=7) {
                         if (matrixBord[view_i+1][view_j-2]=="spitak_tagavor" || matrixBord[view_i+1][view_j-2]=="sev_tagavor") {
                             b=false;
                         }
                     }
                     if (view_j-2>=0) {
                         if (matrixBord[view_i][view_j-2]=="spitak_tagavor" || matrixBord[view_i][view_j-2]=="sev_tagavor") {
                             b=false;
                         }
                     }
                     if (view_i-1>=0 && view_j-2>=0) {
                         if (matrixBord[view_i-1][view_j-2]=="spitak_tagavor" || matrixBord[view_i-1][view_j-2]=="sev_tagavor") {
                             b=false;
                         }
                     }

                     if (b==true) {
                         qayli_hnaravorutyun = true;
                         break a1;
                     }
                 }

             }

             if (view_i - 1 >= 0 && view_j-1>=0) {
                 if (sev_spitak==true)
                     is_shax=shax_spitak_tagavor_stugum(view_i-1,view_j-1,imageName,true);
                 else if(sev_spitak==false)
                     is_shax=shax_sev_tagavor_stugum(view_i-1,view_j-1,imageName,true);

                 if (matrixBord[view_i - 1][view_j-1].equals("datark") && is_shax==true) {
                     boolean b=true;
                     if (view_j-2>=0) {
                         if (matrixBord[view_i][view_j-2]=="spitak_tagavor" || matrixBord[view_i][view_j-2]=="sev_tagavor") {
                             b=false;
                         }
                     }
                     if (view_j-2>=0 && view_i-1>=0) {
                         if (matrixBord[view_i-1][view_j-2]=="spitak_tagavor" || matrixBord[view_i-1][view_j-2]=="sev_tagavor") {
                             b=false;
                         }
                     }
                     if (view_i-2>=0 && view_j-2>=0) {
                         if (matrixBord[view_i-2][view_j-2]=="spitak_tagavor" || matrixBord[view_i-2][view_j-2]=="sev_tagavor") {
                             b=false;
                         }
                     }
                     if (view_j-1>=0 && view_i-2>=0) {
                         if (matrixBord[view_i-2][view_j-1]=="spitak_tagavor" || matrixBord[view_i-2][view_j-1]=="sev_tagavor") {
                             b=false;
                         }
                     }
                     if (view_i-2>=0) {
                         if (matrixBord[view_i-2][view_j]=="spitak_tagavor" || matrixBord[view_i-2][view_j]=="sev_tagavor") {
                             b=false;
                         }
                     }

                     if (b==true) {
                         qayli_hnaravorutyun = true;
                         break a1;
                     }
                 } else if (matrixBord[view_i - 1][view_j-1].charAt(1) == 'e' && sev_spitak == true && is_shax == true) {
                     boolean b=true;
                     if (view_j-2>=0) {
                         if (matrixBord[view_i][view_j-2]=="spitak_tagavor" || matrixBord[view_i][view_j-2]=="sev_tagavor") {
                             b=false;
                         }
                     }
                     if (view_j-2>=0 && view_i-1>=0) {
                         if (matrixBord[view_i-1][view_j-2]=="spitak_tagavor" || matrixBord[view_i-1][view_j-2]=="sev_tagavor") {
                             b=false;
                         }
                     }
                     if (view_i-2>=0 && view_j-2>=0) {
                         if (matrixBord[view_i-2][view_j-2]=="spitak_tagavor" || matrixBord[view_i-2][view_j-2]=="sev_tagavor") {
                             b=false;
                         }
                     }
                     if (view_j-1>=0 && view_i-2>=0) {
                         if (matrixBord[view_i-2][view_j-1]=="spitak_tagavor" || matrixBord[view_i-2][view_j-1]=="sev_tagavor") {
                             b=false;
                         }
                     }
                     if (view_i-2>=0) {
                         if (matrixBord[view_i-2][view_j]=="spitak_tagavor" || matrixBord[view_i-2][view_j]=="sev_tagavor") {
                             b=false;
                         }
                     }

                     if (b==true) {
                         qayli_hnaravorutyun = true;
                         break a1;
                     }
                 } else if (matrixBord[view_i - 1][view_j-1].charAt(1) == 'p' && sev_spitak == false && is_shax == true) {
                     boolean b=true;
                     if (view_j-2>=0) {
                         if (matrixBord[view_i][view_j-2]=="spitak_tagavor" || matrixBord[view_i][view_j-2]=="sev_tagavor") {
                             b=false;
                         }
                     }
                     if (view_j-2>=0 && view_i-1>=0) {
                         if (matrixBord[view_i-1][view_j-2]=="spitak_tagavor" || matrixBord[view_i-1][view_j-2]=="sev_tagavor") {
                             b=false;
                         }
                     }
                     if (view_i-2>=0 && view_j-2>=0) {
                         if (matrixBord[view_i-2][view_j-2]=="spitak_tagavor" || matrixBord[view_i-2][view_j-2]=="sev_tagavor") {
                             b=false;
                         }
                     }
                     if (view_j-1>=0 && view_i-2>=0) {
                         if (matrixBord[view_i-2][view_j-1]=="spitak_tagavor" || matrixBord[view_i-2][view_j-1]=="sev_tagavor") {
                             b=false;
                         }
                     }
                     if (view_i-2>=0) {
                         if (matrixBord[view_i-2][view_j]=="spitak_tagavor" || matrixBord[view_i-2][view_j]=="sev_tagavor") {
                             b=false;
                         }
                     }

                     if (b==true) {
                         qayli_hnaravorutyun = true;
                         break a1;
                     }
                 }
             }
         }
         return qayli_hnaravorutyun;
         }

 }

