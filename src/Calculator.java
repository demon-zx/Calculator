//package calculator;

import javax.swing.*;

public class Calculator {
    public static void main(String[] arguments) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Laskin();
            }
        });
    }
}