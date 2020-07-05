package com.example.main;

class CropperPresenter implements ICropperPresenter {

    CropperModel loginModel;
    CropperModel cropperModel;
    ICropperView loginView;
    ICropperView cropperView;
    private Runnable onLogin;
    private Runnable onCropping;

    @Override
    public CropperModel getModel() {
        return loginModel;
    }

    @Override
    public void setModel(CropperModel loginModel) {
        this.loginModel = loginModel;
    }

    @Override
    public ICropperView getView() {
        return loginView;
    }

    @Override
    public void setView(ICropperView loginView) {
        this.loginView = loginView;
    }

    @Override
    public void setOnLogin(Runnable onLogin) {
        this.onLogin = onLogin;
    }

    @Override
    public void setOnCropping(Runnable onCropping) {
        this.onCropping = onCropping;
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

    @Override
    public void crop() {
        //TODO: add cropping of image and image in method params
    }
}
