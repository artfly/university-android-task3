package com.noveogroup.task3;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.Toast;
import butterknife.Bind;
import butterknife.ButterKnife;
import com.noveogroup.task3.base.BaseToolbarActivity;


public class SplitToolbarActivity extends BaseToolbarActivity implements Toolbar.OnMenuItemClickListener {
    @Bind(R.id.simple_toolbar)
    Toolbar toolbar;
    @Bind(R.id.bottom_toolbar)
    Toolbar bottomToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_split_toolbar);
        ButterKnife.bind(this);
        setSupportActionBar(toolbar);
        bottomToolbar.inflateMenu(R.menu.menu_bottom);
        bottomToolbar.setOnMenuItemClickListener(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ButterKnife.unbind(this);
    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.share:
            case R.id.voice:
                Toast.makeText(this, item.getTitle(), Toast.LENGTH_SHORT).show();
                return true;
            default:
                return false;
        }
    }
}
