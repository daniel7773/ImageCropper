package com.example.main;

class LoginPresenter implements ILoginPresenter {

    LoginModel loginModel;
    ILoginView loginView;
    private Runnable onLogin;

    @Override
    public LoginModel getModel() {
        return loginModel;
    }

    @Override
    public void setModel(LoginModel loginModel) {
        this.loginModel = loginModel;
    }

    @Override
    public ILoginView getView() {
        return loginView;
    }

    @Override
    public void setView(ILoginView loginView) {
        this.loginView = loginView;
    }

    @Override
    public void setOnLogin(Runnable onLogin) {
        this.onLogin = onLogin;
    }

    @Override
    public void run() {
        loginModel.setUser("previousUser");
        loginView.setPresenter(this);
        loginView.updateViewFromModel();
        loginView.open();
    }

    @Override
    public void login() {
        loginView.updateModelFromView();
        if (loginModel.getUser().equalsIgnoreCase("root")) {
            loginView.close();
            loginView.setPresenter(null);// for memory sanity.
            onLogin.run();
        } else {
            loginView.userRejected();
        }
    }
}
