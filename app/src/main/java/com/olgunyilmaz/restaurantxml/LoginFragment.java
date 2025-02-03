package com.olgunyilmaz.restaurantxml;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.olgunyilmaz.restaurantxml.databinding.FragmentLoginBinding;

public class LoginFragment extends Fragment {
    private FragmentLoginBinding binding;
    TextView forgotPasswordButton;
    Button continueButton;
    Button facebookButton;
    Button googleButton;
    TextView registerButton;


    public LoginFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentLoginBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();

        forgotPasswordButton = binding.forgotPasswordButton;
        forgotPasswordButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToForgotPassword(view);
            }
        });

        continueButton = binding.continueButton;
        continueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                login(view);
            }
        });

        googleButton = binding.googleButton;
        googleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goWithGoogle(view);
            }
        });

        facebookButton = binding.facebookButton;
        facebookButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goWithFacebook(view);
            }
        });

        registerButton = binding.registerButton;
        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                register(view);
            }
        });

        // Inflate the layout for this fragment
        return view;
    }

    public void goToForgotPassword(View view){
        FragmentTransaction fragmentTransaction = getActivity().getSupportFragmentManager().beginTransaction();
        ForgotPasswordFragment passwordFragment = new ForgotPasswordFragment();
        fragmentTransaction.replace(R.id.fragmentContainerView,passwordFragment).commit();

    }

    public void login(View view){
        FragmentTransaction fragmentTransaction = getActivity().getSupportFragmentManager().beginTransaction();
        MainScreenFragment mainScreenFragment = new MainScreenFragment();
        fragmentTransaction.replace(R.id.fragmentContainerView,mainScreenFragment).commit();

    }

    public void goWithGoogle(View view){
        login(view);
    }

    public void goWithFacebook(View view){
        login(view);
    }

    public void register(View view){
        FragmentTransaction fragmentTransaction = getActivity().getSupportFragmentManager().beginTransaction();
        SignUpFragment signUpFragment = new SignUpFragment();
        fragmentTransaction.replace(R.id.fragmentContainerView,signUpFragment).commit();

    }

}