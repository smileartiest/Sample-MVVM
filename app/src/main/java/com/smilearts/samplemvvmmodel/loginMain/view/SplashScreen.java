package com.smilearts.samplemvvmmodel.loginMain.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.widget.Toast;
import com.smilearts.samplemvvmmodel.factory.LoginViewModelFactory;
import com.smilearts.samplemvvmmodel.R;
import com.smilearts.samplemvvmmodel.databinding.SplashScreenBinding;
import com.smilearts.samplemvvmmodel.loginMain.ui.LoginCallBacks;
import com.smilearts.samplemvvmmodel.loginMain.viewmodel.LoginViewModel;

public class SplashScreen extends AppCompatActivity implements LoginCallBacks {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        SplashScreenBinding binding = DataBindingUtil.setContentView(this , R.layout.splash_screen);
        binding.setViewModel(ViewModelProviders.of(this , new LoginViewModelFactory(this)).get(LoginViewModel.class));

    }

    @Override
    public void onSuccessEmail(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onFailureEmail(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onSuccessPassword(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onFailurePassword(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean isLoginSuccess(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
        return true;
    }

    @Override
    public boolean isLoginFailed(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
        return false;
    }

}