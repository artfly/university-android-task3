package com.noveogroup.task3;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.*;
import android.widget.AdapterView;
import android.widget.Spinner;
import butterknife.Bind;
import butterknife.ButterKnife;
import com.noveogroup.task3.base.BaseToolbarActivity;
import com.noveogroup.task3.fragments.FirstFragment;
import com.noveogroup.task3.fragments.SecondFragment;


public class SpinnerToolbarActivity extends BaseToolbarActivity {
    @Bind(R.id.spinner)
    Spinner spinner;
    @Bind(R.id.spinner_toolbar)
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner_toolbar);
        ButterKnife.bind(this);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String item = (String) parent.getItemAtPosition(position);
                if (item.equals(getResources().getString(R.string.first))) {
                    getFragmentManager()
                            .beginTransaction()
                            .replace(R.id.spinner_fragment, FirstFragment.newInstance())
                            .commit();
                } else if (item.equals(getResources().getString(R.string.second))) {
                    getFragmentManager()
                            .beginTransaction()
                            .replace(R.id.spinner_fragment, SecondFragment.newInstance())
                            .commit();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        setSupportActionBar(toolbar);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ButterKnife.unbind(this);
    }
}
