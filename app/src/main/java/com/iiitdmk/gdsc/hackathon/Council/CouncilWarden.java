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


public class CouncilWarden extends AppCompatActivity
        {

    private androidx.appcompat.app.ActionBar wardenActionBar;
    private PagerAdapter adapter;
    private UltraViewPager.Orientation gravity_indicator;
    private ArrayList<CouncilUserClass> wardenList;

            @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.council_warden);

        UltraViewPager ultraViewPager = (UltraViewPager) findViewById(R.id.council_view_pager);
        wardenList=new ArrayList<>();

        CouncilUserClass Kalam=new CouncilUserClass("Abhishek","Kalam Hostel Warden","1234567890","warden_kalam@iiitk.ac.in",R.drawable.w2);
        CouncilUserClass MVHR=new CouncilUserClass("Anmol","MVHR Hostel Warden","1234567890","warden_mvhr@iiitk.ac.in",R.drawable.w2);
        CouncilUserClass SRKH=new CouncilUserClass("Harshith","SRKH Hostel Warden","1234567890","warden_srkh@iiitk.ac.in",R.drawable.w2);
        CouncilUserClass Kalpana=new CouncilUserClass("Varshita","Kalpana Hostel Warden","1234567890","warden_kalpana@iitdh.ac.in",R.drawable.w1);

        wardenList.add(Kalam);
        wardenList.add(MVHR);
        wardenList.add(SRKH);
        wardenList.add(Kalpana);


        //main code starts here
        ultraViewPager.setScrollMode(UltraViewPager.ScrollMode.HORIZONTAL);
        adapter = new UltraPagerAdapter(true,this,wardenList);
        ultraViewPager.setAdapter(adapter);

        ultraViewPager.setMultiScreen(0.8f);
        ultraViewPager.setItemRatio(1.0f);
        ultraViewPager.setRatio(0.75f);
        ultraViewPager.setAutoMeasureHeight(true);
        gravity_indicator = UltraViewPager.Orientation.HORIZONTAL;
        ultraViewPager.setPageTransformer(false, new UltraDepthScaleTransformer());



    }



    protected void onResume() {
        super.onResume();

    }

    public boolean onCreateOptionsMenu(Menu menu) {

        wardenActionBar = getSupportActionBar();
        assert wardenActionBar != null;
        wardenActionBar.setHomeButtonEnabled(true);
        wardenActionBar.setDisplayHomeAsUpEnabled(true);
        wardenActionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#5cae80")));
        wardenActionBar.setTitle(Html.fromHtml("<font color='#ffffff'>Council</font>"));
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
