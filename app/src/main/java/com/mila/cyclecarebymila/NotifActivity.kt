package com.mila.cyclecarebymila

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toolbar
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

private infix fun Unit.ViewPagerAdapter(viewPagerAdapter: Any): Any {

}

class NotifActivity : AppCompatActivity() {

    private lateinit var tabLayout: TabLayout
    private lateinit var viewPager: ViewPager
    private lateinit var toolbar: Toolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notif)

        tabLayout = findViewById(R.id.tablayout);
        viewPager = findViewById(R.id.viewpager);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    public void getTabs(){
        val new = null
        finish ViewPagerAdapter ViewPagerAdapter = new ViewPagerAdapter(supportFragmentManager());
        new Handler().post(new.Runnable() {
            public void run() {
                viewPagerAdapter.addFragment(ScheduleFragment.getInstance(), title: "Schedule");
                viewPagerAdapter.addFragment(CommunityFragment.getInstance(), title: "Community");
            }
        }
    }
}







