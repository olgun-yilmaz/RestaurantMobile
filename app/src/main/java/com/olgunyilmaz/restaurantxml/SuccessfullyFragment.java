package com.olgunyilmaz.restaurantxml;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.olgunyilmaz.restaurantxml.databinding.FragmentSuccessfullyBinding;

public class SuccessfullyFragment extends Fragment {
    private FragmentSuccessfullyBinding binding;
    Button login2Button;


    public SuccessfullyFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentSuccessfullyBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();

        login2Button = binding.login2Button;
        login2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                login(view);
            }
        });

        // Inflate the layout for this fragment
        return view;
    }

    public void login(View view){
        FragmentTransaction fragmentTransaction = getActivity().getSupportFragmentManager().beginTransaction();
        LoginFragment loginFragment = new LoginFragment();
        fragmentTransaction.replace(R.id.fragmentContainerView,loginFragment).commit();
    }
}