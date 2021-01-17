package com.smilearts.samplemvvmmodel.loginMain.ui;

public interface LoginCallBacks {

    public void onSuccessEmail(String message);
    public void onFailureEmail(String message);
    public void onSuccessPassword(String message);
    public void onFailurePassword(String message);
    public boolean isLoginSuccess(String message);
    public boolean isLoginFailed(String message);

}
