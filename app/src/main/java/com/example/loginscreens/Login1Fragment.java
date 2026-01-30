package com.example.loginscreens;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import com.example.loginscreens.databinding.FragmentLogin1Binding;

public class Login1Fragment extends Fragment {

    private FragmentLogin1Binding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        binding = FragmentLogin1Binding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        NavController nav = Navigation.findNavController(view);

        binding.btnLogin.setOnClickListener(v -> {
            String user = "";
            String pass = "";

            if (binding.etUser.getText() != null) {
                user = binding.etUser.getText().toString().trim();
            }

            if (binding.etPass.getText() != null) {
                pass = binding.etPass.getText().toString().trim();
            }

            if (user.isEmpty()) {
                Toast.makeText(getContext(), "Informe o usuário.", Toast.LENGTH_SHORT).show();
                return;
            }

            if (pass.isEmpty()) {
                Toast.makeText(getContext(), "Informe a senha.", Toast.LENGTH_SHORT).show();
                return;
            }

            Toast.makeText(getContext(), "Login OK (exemplo)", Toast.LENGTH_SHORT).show();
        });

        binding.tvGoTela2.setOnClickListener(v -> nav.navigate(R.id.action_login1_to_login2));
        binding.tvGoTela3.setOnClickListener(v -> nav.navigate(R.id.action_login1_to_login3));
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
