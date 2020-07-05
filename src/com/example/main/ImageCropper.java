package com.example.main;

import javax.swing.*;

public class ImageCropper {
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                CropperModel loginModel = new CropperModel();
                CropperPresenter loginPresenter = new CropperPresenter();
                loginPresenter.setModel(loginModel);
                ICropperView loginView = new CropperView();
                loginPresenter.setView(loginView);
                loginPresenter.setOnLogin(new Runnable() {

                    @Override
                    public void run() {
                        JOptionPane.showMessageDialog(null, "Welcome user!");
                    }
                });
                loginPresenter.run();
            }
        });
    }
}
