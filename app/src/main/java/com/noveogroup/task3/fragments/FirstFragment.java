package com.noveogroup.task3.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.noveogroup.task3.R;

/**
 * Created by arty on 14.03.16.
 */
public class FirstFragment extends Fragment {
    public static FirstFragment newInstance() {
        FirstFragment firstFragment = new FirstFragment();
        Bundle parameters = new Bundle();
        firstFragment.setArguments(parameters);
        return firstFragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_first, container, false);
    }
}
