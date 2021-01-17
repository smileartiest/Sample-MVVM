package com.smilearts.samplemvvmmodel.loginMain.viewmodel;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;

import androidx.lifecycle.ViewModel;

import com.smilearts.samplemvvmmodel.loginMain.ui.LoginModel;
import com.smilearts.samplemvvmmodel.loginMain.ui.LoginCallBacks;

public class LoginViewModel extends ViewModel {

    private LoginModel loginModel;
    private LoginCallBacks loginCallBacks;

    public LoginViewModel(LoginCallBacks loginCallBacks) {
        this.loginCallBacks = loginCallBacks;
        this.loginModel = new LoginModel();
    }

    public LoginModel getLoginModel() {
        return loginModel;
    }

    public void setLoginModel(LoginModel loginModel) {
        this.loginModel = loginModel;
    }

    public LoginCallBacks getLoginCallBacks() {
        return loginCallBacks;
    }

    public void setLoginCallBacks(LoginCallBacks loginCallBacks) {
        this.loginCallBacks = loginCallBacks;
    }

    public TextWatcher emailTextWatcher(){
        return new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }
            @Override
            public void afterTextChanged(Editable s) {
                loginModel.setEmail(s.toString());
            }
        };
    }

    public TextWatcher passwordTextWatcher(){
        return new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }
            @Override
            public void afterTextChanged(Editable s) {
                loginModel.setPassword(s.toString());
            }
        };
    }

    public void onLoginBtnClick(View view){
        if(loginModel.isValidEmail()){
            if(loginModel.isValidPassword()){
                if(getLoginModel().getEmail().equals("admin@gmail.com") && getLoginModel().getPassword().equals("admin123")){
                    loginCallBacks.isLoginSuccess("LoginSuccess");
                }else { loginCallBacks.isLoginFailed("Login failed");}
            }else { loginCallBacks.onSuccessPassword("Incorrect User or password");}
        }else { loginCallBacks.onFailureEmail("Incorrect Email id"); }
    }

}
