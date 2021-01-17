package com.smilearts.samplemvvmmodel.factory;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.smilearts.samplemvvmmodel.loginMain.ui.LoginCallBacks;
import com.smilearts.samplemvvmmodel.loginMain.viewmodel.LoginViewModel;

public class LoginViewModelFactory extends ViewModelProvider.NewInstanceFactory {

    private LoginCallBacks loginCallBacks;

    public LoginViewModelFactory(LoginCallBacks loginCallBacks) {
        this.loginCallBacks = loginCallBacks;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        return (T) new LoginViewModel(loginCallBacks);
    }
}
