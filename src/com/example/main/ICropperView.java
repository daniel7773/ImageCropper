package com.example.main;

interface ICropperView {

    CropperPresenter getPresenter();

    void setPresenter(CropperPresenter loginPresenter);

    void updateModelFromView();

    void updateViewFromModel();

    void open();

    void close();

    void userRejected();

    void invalidCrop();
}
