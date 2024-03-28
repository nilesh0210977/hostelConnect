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


public class CouncilCulturalSecy extends AppCompatActivity
        {

    private androidx.appcompat.app.ActionBar culturalActionBar;
    private PagerAdapter adapter;
    private UltraViewPager.Orientation gravity_indicator;
    private ArrayList<CouncilUserClass> culturalList;

            @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.council_warden);

        UltraViewPager ultraViewPager = (UltraViewPager) findViewById(R.id.council_view_pager);
        culturalList =new ArrayList<>();
        CouncilUserClass danceSecy=new CouncilUserClass("Aman Kumar","Institute Dance Secretary",""," 122cs0019@iiitk.ac.in",R.drawable.aman);
        CouncilUserClass filmSecy=new CouncilUserClass("Prateek Verma","Institute Film and Media Secretary",""," 122cs0026@iiitk.ac.in",R.drawable.prateek);
        CouncilUserClass musicSecy=new CouncilUserClass("Abhijeet singh","Institute Music Secretary","","122ad0010@iiitk.ac.in",R.drawable.abhijeet);
        CouncilUserClass artSecy=new CouncilUserClass("sugunaSri","Institute Fine Arts Secretary","","122cs0004@iiitk.ac.in",R.drawable.suguna);
        culturalList.add(danceSecy);
        culturalList.add(filmSecy);
        culturalList.add(musicSecy);
        culturalList.add(artSecy);

        //main code starts here
        ultraViewPager.setScrollMode(UltraViewPager.ScrollMode.HORIZONTAL);
        adapter = new UltraPagerAdapter(true,this, culturalList);
        ultraViewPager.setAdapter(adapter);

        ultraViewPager.setMultiScreen(0.8f);
        ultraViewPager.setItemRatio(1f);
        ultraViewPager.setRatio(0.75f);
        ultraViewPager.setAutoMeasureHeight(true);
        gravity_indicator = UltraViewPager.Orientation.HORIZONTAL;
        ultraViewPager.setPageTransformer(false, new UltraDepthScaleTransformer());



    }



    protected void onResume() {
        super.onResume();

    }

    public boolean onCreateOptionsMenu(Menu menu) {

        culturalActionBar = getSupportActionBar();
        assert culturalActionBar != null;
        culturalActionBar.setHomeButtonEnabled(true);
        culturalActionBar.setDisplayHomeAsUpEnabled(true);
        culturalActionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#5cae80")));
        culturalActionBar.setTitle(Html.fromHtml("<font color='#ffffff'>Council</font>"));
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
