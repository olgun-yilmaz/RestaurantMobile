package com.olgunyilmaz.restaurantxml;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.olgunyilmaz.restaurantxml.databinding.FragmentStartBinding;


public class StartFragment extends Fragment {

    private FragmentStartBinding binding;
    Button restaurantButton;
    Button customerButton;



    public StartFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentStartBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();

        customerButton = binding.customerButton;
        customerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToCustomer(view);
            }
        });

        restaurantButton = binding.restaurantButton;
        restaurantButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToRestaurant(view);
            }
        });


        // Inflate the layout for this fragment
        return view;
    }

    public void goToRestaurant(View view){
        signUp(view);
    }

    public void goToCustomer(View view){
        signUp(view);
    }

    private void signUp(View view){
        FragmentTransaction fragmentTransaction = getActivity().getSupportFragmentManager().beginTransaction();
        SignUpFragment signUpFragment = new SignUpFragment();
        fragmentTransaction.replace(R.id.fragmentContainerView,signUpFragment).commit();
    }
}