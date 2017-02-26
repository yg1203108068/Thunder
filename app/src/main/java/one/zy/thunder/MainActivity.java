package one.zy.thunder;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CardView cardView1 = (CardView)findViewById(R.id.cardView1);
        cardView1.setRadius(2);//设置图片圆角的半径大小
        cardView1.setCardElevation(2);//设置阴影部分大小
        cardView1.setContentPadding(2,2,2,2);//设置图片距离阴影大小

        CardView cardView2 = (CardView)findViewById(R.id.cardView2);
        cardView2.setRadius(2);//设置图片圆角的半径大小
        cardView2.setCardElevation(2);//设置阴影部分大小
        cardView2.setContentPadding(2,2,2,2);//设置图片距离阴影大小

        CardView cardView3 = (CardView)findViewById(R.id.cardView2);
        cardView3.setRadius(2);//设置图片圆角的半径大小
        cardView3.setCardElevation(2);//设置阴影部分大小
        cardView3.setContentPadding(2,2,2,2);//设置图片距离阴影大小

        CardView cardView4 = (CardView)findViewById(R.id.cardView2);
        cardView4.setRadius(2);//设置图片圆角的半径大小
        cardView4.setCardElevation(2);//设置阴影部分大小
        cardView4.setContentPadding(2,2,2,2);//设置图片距离阴影大小

        CardView cardView5 = (CardView)findViewById(R.id.cardView2);
        cardView5.setRadius(2);//设置图片圆角的半径大小
        cardView5.setCardElevation(2);//设置阴影部分大小
        cardView5.setContentPadding(2,2,2,2);//设置图片距离阴影大小

        CardView cardView6 = (CardView)findViewById(R.id.cardView2);
        cardView6.setRadius(2);//设置图片圆角的半径大小
        cardView6.setCardElevation(2);//设置阴影部分大小
        cardView6.setContentPadding(2,2,2,2);//设置图片距离阴影大小

        CardView cardView7 = (CardView)findViewById(R.id.cardView2);
        cardView7.setRadius(2);//设置图片圆角的半径大小
        cardView7.setCardElevation(2);//设置阴影部分大小
        cardView7.setContentPadding(2,2,2,2);//设置图片距离阴影大小

        CardView cardView8 = (CardView)findViewById(R.id.cardView2);
        cardView8.setRadius(2);//设置图片圆角的半径大小
        cardView8.setCardElevation(2);//设置阴影部分大小
        cardView8.setContentPadding(2,2,2,2);//设置图片距离阴影大小

        // 标题栏
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // 右下角悬浮按钮
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
