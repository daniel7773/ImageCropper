package com.example.main;

interface ILoginPresenter {

    LoginModel getModel();

    void setModel(LoginModel loginModel);

    ILoginView getView();

    void setView(ILoginView loginView);

    void setOnLogin(Runnable onLogin);

    void run();

    void login();
}
