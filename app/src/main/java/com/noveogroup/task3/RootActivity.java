package com.noveogroup.task3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class RootActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_root);
        ButterKnife.bind(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ButterKnife.unbind(this);
    }

    @OnClick(R.id.simple_toolbar_button)
    public void showSimpleToolbar(View view) {
        startActivity(new Intent(this, SimpleToolbarActivity.class));
    }

    @OnClick(R.id.toolbar_with_up_button)
    public void showToolbarUp(View view) {
        startActivity(new Intent(this, UpToolbarActivity.class));
    }

    @OnClick(R.id.split_toolbar_button)
    public void showSplitToolbar(View view) {
        startActivity(new Intent(this, SplitToolbarActivity.class));
    }

    @OnClick(R.id.tab_toolbar_button)
    public void showToolbarTabs(View view) {
        startActivity(new Intent(this, TabToolbarActivity.class));
    }

    @OnClick(R.id.spinner_toolbar_button)
    public void showToolbarSpinner(View view) {
        startActivity(new Intent(this, SpinnerToolbarActivity.class));
    }

}
