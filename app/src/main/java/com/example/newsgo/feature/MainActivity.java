package com.example.newsgo.feature;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.example.newsgo.R;
import com.example.newsgo.base.mvp.BaseActivity;
import com.example.newsgo.base.mvp.BasePresenter;
import com.example.newsgo.feature.main.ui.MineFragment;
import com.example.newsgo.feature.news.ui.NewsFragment;
import com.example.newsgo.feature.picture.ui.PictureFragment;
import com.example.newsgo.feature.video.ui.VideoFragment;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

public class MainActivity extends BaseActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    @BindView(R.id.bottom_navigation)
    BottomNavigationView bottomNavigation;
    @BindView(R.id.frame_layout)
    FrameLayout frameLayout;
    private NewsFragment newsFragment;
    private PictureFragment pictureFragment;
    private VideoFragment videoFragment;
    private MineFragment mineFragment;
    List<Fragment> fragmentList;
    private int index = 0;

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void onCreate() {
        bottomNavigation.setLabelVisibilityMode(1);
        bottomNavigation.setOnNavigationItemSelectedListener(this);
        initFragments();

    }

    private void initFragments() {
        fragmentList = new ArrayList<>();
        pictureFragment = new PictureFragment();
        newsFragment = new NewsFragment();
        videoFragment = new VideoFragment();
        mineFragment = new MineFragment();
        fragmentList.add(newsFragment);
        fragmentList.add(pictureFragment);
        fragmentList.add(videoFragment);
        fragmentList.add(mineFragment);
        getSupportFragmentManager().beginTransaction()
                .add(R.id.frame_layout, newsFragment)
                .show(newsFragment)
                .commit();
    }

    @Override
    public BasePresenter initPresenter() {
        return null;
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id.news:
                switchFragment(0);
                break;
            case R.id.picture:
                switchFragment(1);
                break;
            case R.id.video:
                switchFragment(2);
                break;
            case R.id.mine:
                switchFragment(3);
                break;
        }
        return true;
    }

    public void switchFragment(int currentIndex) {
        if (index == currentIndex) {
            return;
        }
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.hide(fragmentList.get(index));
        if (fragmentList.get(currentIndex).isAdded()) {
            transaction.show(fragmentList.get(currentIndex));
        } else {
            transaction.add(R.id.frame_layout, fragmentList.get(currentIndex)).show(fragmentList.get(currentIndex));
        }
        transaction.commit();
        index = currentIndex;
    }
}
