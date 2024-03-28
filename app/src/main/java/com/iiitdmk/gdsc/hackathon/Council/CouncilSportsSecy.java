package com.iiitdmk.gdsc.hackathon.Council;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import androidx.core.app.NavUtils;
import androidx.viewpager.widget.PagerAdapter;
import androidx.appcompat.app.AppCompatActivity;
import android.text.Html;
import android.view.Menu;
import android.view.MenuItem;

import com.iiitdmk.gdsc.hackathon.R;
import com.tmall.ultraviewpager.UltraViewPager;
import com.tmall.ultraviewpager.transformer.UltraDepthScaleTransformer;

import java.util.ArrayList;


public class CouncilSportsSecy extends AppCompatActivity
        {

            @Override

            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.council_warden);

        UltraViewPager ultraViewPager = (UltraViewPager) findViewById(R.id.council_view_pager);
                ArrayList<CouncilUserClass> sportsList = new ArrayList<>();
        CouncilUserClass footballSecy=new CouncilUserClass("Rikhou","Institute Football Secretary","1234567890"," 122cs0059@iiitk.ac.in",R.drawable.ft);
        CouncilUserClass cricketSecy=new CouncilUserClass("Vedant","Institute Cricket Secretary","1234567890"," 122cs0059@iiitk.ac.in",R.drawable.ck1);
        CouncilUserClass volleyballSecy=new CouncilUserClass("Gaurav","Institute Volleyball Secretary","1234567890"," 122cs0059@iiitk.ac.in",R.drawable.vol);
        CouncilUserClass badmintonSecy=new CouncilUserClass("Rohan ","Institute Badminton Secretary","1234567890","122cs0059@iiitk.ac.in",R.drawable.badt);
        CouncilUserClass athleticsSecy=new CouncilUserClass("Anupriya","Institute Athletics Secretary","1234567890"," 122cs0059@iiitk.ac.in",R.drawable.ath);
        CouncilUserClass basketballSecy=new CouncilUserClass("Chirag","Institute Basketball Secretary","1234567890","122cs0059@iiitk.ac.in",R.drawable.bask);

        sportsList.add(footballSecy);
        sportsList.add(cricketSecy);
        sportsList.add(volleyballSecy);
        sportsList.add(badmintonSecy);
        sportsList.add(athleticsSecy);
        sportsList.add(basketballSecy);

        //main code starts here
        ultraViewPager.setScrollMode(UltraViewPager.ScrollMode.HORIZONTAL);
                PagerAdapter adapter = new UltraPagerAdapter(true, this, sportsList);
        ultraViewPager.setAdapter(adapter);

        ultraViewPager.setMultiScreen(0.8f);
        ultraViewPager.setItemRatio(1f);
        ultraViewPager.setRatio(0.75f);
        ultraViewPager.setAutoMeasureHeight(true);
                UltraViewPager.Orientation gravity_indicator = UltraViewPager.Orientation.HORIZONTAL;
        ultraViewPager.setPageTransformer(false, new UltraDepthScaleTransformer());



    }



    protected void onResume() {
        super.onResume();

    }

    public boolean onCreateOptionsMenu(Menu menu) {

        androidx.appcompat.app.ActionBar sportsActionBar = getSupportActionBar();
        assert sportsActionBar != null;
        sportsActionBar.setHomeButtonEnabled(true);
        sportsActionBar.setDisplayHomeAsUpEnabled(true);
        sportsActionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#5cae80")));
        sportsActionBar.setTitle(Html.fromHtml("<font color='#ffffff'>Council</font>"));
        return super.onCreateOptionsMenu(menu);

    }

    public boolean onOptionsItemSelected(MenuItem item) {

        super.onOptionsItemSelected(item);

        switch (item.getItemId()) {
            case android.R.id.home:
                NavUtils.navigateUpFromSameTask(this);
                return true;
        }
        return true;

    }


}
