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
public class SecondFragment extends Fragment {
    public static SecondFragment newInstance() {
        SecondFragment secondFragment = new SecondFragment();
        Bundle parameters = new Bundle();
        secondFragment.setArguments(parameters);
        return secondFragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_second, container, false);
    }
}
