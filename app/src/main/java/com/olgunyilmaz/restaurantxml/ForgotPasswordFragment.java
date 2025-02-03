package com.olgunyilmaz.restaurantxml;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.olgunyilmaz.restaurantxml.databinding.FragmentForgotPasswordBinding;


public class ForgotPasswordFragment extends Fragment {
    private FragmentForgotPasswordBinding binding;
    Button submitButton;


    public ForgotPasswordFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentForgotPasswordBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();

        submitButton = binding.submitButton;
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                submit(view);
            }
        });

        // Inflate the layout for this fragment
        return view;
    }

    public void submit(View view){
        FragmentTransaction fragmentTransaction = getActivity().getSupportFragmentManager().beginTransaction();
        ResetPasswordFragment resetPasswordFragment = new ResetPasswordFragment();
        fragmentTransaction.replace(R.id.fragmentContainerView,resetPasswordFragment).commit();

    }
}