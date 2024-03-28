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


public class CouncilEmergency extends AppCompatActivity
        {

            @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.council_warden);

        UltraViewPager ultraViewPager = (UltraViewPager) findViewById(R.id.council_view_pager);
                ArrayList<CouncilUserClass> emergencyList = new ArrayList<>();
        CouncilUserClass plumber=new CouncilUserClass("Shivam Raj","Plumbing Maintenance","1234567890","",R.drawable.shivam);
        CouncilUserClass electrician=new CouncilUserClass("gokul","Electrical Maintenance","1234567890","",R.drawable.shivam);
        CouncilUserClass housekeeping1=new CouncilUserClass("Ravi","HouseKeeping","1234567890","",R.drawable.shivam);
        CouncilUserClass housekeeping2=new CouncilUserClass("Shreya pandey","HouseKeeping","1234567890","",R.drawable.shivam);
        CouncilUserClass securitySupervisor1=new CouncilUserClass("Vansh","Security Supervisor","1234567890","",R.drawable.shivam);
        CouncilUserClass securitySup=new CouncilUserClass("Prateesh","Security Superintendent","1234567890","",R.drawable.i1);
        CouncilUserClass medicalEmergency=new CouncilUserClass("IIITDMK Ambulance","Medical emergency","1234567890","",R.drawable.i1);
        CouncilUserClass lib=new CouncilUserClass("Gokul","Librarian","1234567890","",R.drawable.i1);
        CouncilUserClass mainGate=new CouncilUserClass("IIITDMK Main Gate","Security","1234567890","",R.drawable.i1);
        CouncilUserClass sportsInst1=new CouncilUserClass("Yashwanth","Sports Instructor","1234567890","",R.drawable.i1);
        emergencyList.add(plumber);
        emergencyList.add(electrician);
        emergencyList.add(housekeeping1);
        emergencyList.add(housekeeping2);
        emergencyList.add(securitySupervisor1);
        emergencyList.add(securitySup);
        emergencyList.add(medicalEmergency);
        emergencyList.add(lib);
        emergencyList.add(mainGate);
        emergencyList.add(sportsInst1);

        //main code starts here
        ultraViewPager.setScrollMode(UltraViewPager.ScrollMode.HORIZONTAL);
                PagerAdapter adapter = new UltraPagerAdapter(true, this, emergencyList);
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

        androidx.appcompat.app.ActionBar emergencyActionBar = getSupportActionBar();
        assert emergencyActionBar != null;
        emergencyActionBar.setHomeButtonEnabled(true);
        emergencyActionBar.setDisplayHomeAsUpEnabled(true);
        emergencyActionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#5cae80")));
        emergencyActionBar.setTitle(Html.fromHtml("<font color='#ffffff'>Council</font>"));
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
