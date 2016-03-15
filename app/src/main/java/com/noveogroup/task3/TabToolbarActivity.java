package com.noveogroup.task3;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v7.widget.Toolbar;
import butterknife.Bind;
import butterknife.ButterKnife;
import com.noveogroup.task3.base.BaseToolbarActivity;
import com.noveogroup.task3.fragments.FirstFragment;
import com.noveogroup.task3.fragments.SecondFragment;


public class TabToolbarActivity extends BaseToolbarActivity {
    @Bind(R.id.tab_toolbar)
    Toolbar toolbar;
    @Bind(R.id.tabs)
    TabLayout tabs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_toolbar);
        ButterKnife.bind(this);
        setSupportActionBar(toolbar);
        tabs.addTab(tabs.newTab().setText(R.string.first));
        tabs.addTab(tabs.newTab().setText(R.string.second));
        tabs.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                if (tab.getText() != null && tab.getText().equals
                        (getResources().getString(R.string.first))) {
                    getFragmentManager()
                            .beginTransaction()
                            .replace(R.id.tab_fragment, FirstFragment.newInstance())
                            .commit();
                } else if (tab.getText() != null && tab.getText().equals
                        (getResources().getString(R.string.second))) {
                    getFragmentManager()
                            .beginTransaction()
                            .replace(R.id.tab_fragment, SecondFragment.newInstance())
                            .commit();
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ButterKnife.unbind(this);
    }
}
