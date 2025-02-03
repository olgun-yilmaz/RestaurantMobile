package com.olgunyilmaz.restaurantxml;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.olgunyilmaz.restaurantxml.databinding.FragmentSignUpBinding;


public class SignUpFragment extends Fragment {
    private FragmentSignUpBinding binding;
    Button signUpButton;
    TextView loginButton;

    public SignUpFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentSignUpBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();

        signUpButton = binding.signUpButton;
        signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                signUp(view);
            }
        });


        loginButton = binding.loginButton;
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                login(view);
            }
        });

        // Inflate the layout for this fragment
        return view;
    }

    public void signUp(View view){
        FragmentTransaction fragmentTransaction = getActivity().getSupportFragmentManager().beginTransaction();
        SuccessfullyFragment successfullyFragment = new SuccessfullyFragment();
        fragmentTransaction.replace(R.id.fragmentContainerView,successfullyFragment).commit();

    }

    public void login(View view){
        FragmentTransaction fragmentTransaction = getActivity().getSupportFragmentManager().beginTransaction();
        LoginFragment loginFragment = new LoginFragment();
        fragmentTransaction.replace(R.id.fragmentContainerView,loginFragment).commit();

    }
}