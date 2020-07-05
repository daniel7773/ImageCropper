package com.example.main;

import javax.swing.*;

public class ImageCropper {
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                LoginModel loginModel = new LoginModel();
                LoginPresenter loginPresenter = new LoginPresenter();
                loginPresenter.setModel(loginModel);
                ILoginView loginView = new MyLoginView();
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
