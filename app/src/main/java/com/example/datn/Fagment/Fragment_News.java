package com.example.datn.Fagment;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toolbar;

import com.example.datn.R;

public class Fragment_News extends Fragment {

    View convertiew;
    ViewHolder holder = null;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if(convertiew==null)
        {
            convertiew = inflater.inflate(R.layout.activity_fragment__news,container,false);
            addControls();

        }
        else
        {
            holder = (ViewHolder) convertiew.getTag();
        }

        addEvents();
        return convertiew;
    }
    public class ViewHolder
    {

    }
    public void addControls()
    {
        holder = new ViewHolder();
        convertiew.setTag(holder);
    }
    public void addEvents()
    {

    }
}