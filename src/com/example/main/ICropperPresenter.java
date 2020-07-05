package com.example.main;

interface ICropperPresenter {

    CropperModel getModel();

    void setModel(CropperModel loginModel);

    ICropperView getView();

    void setView(ICropperView loginView);

    void setOnLogin(Runnable onLogin);

    void setOnCropping(Runnable onCropping);

    void run();

    void login();

    void crop();
}
