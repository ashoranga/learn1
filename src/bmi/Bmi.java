/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmi;

import javax.swing.JOptionPane;

/**
 *
 * @author MERC-LAB-01
 */
public class Bmi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("BMI is " + calBmi(60, 1.6));
        System.out.println("BMI z " + calBmi2(60, 1.6));
        System.out.println(getLargerVal());

    }

    public static double calBmi(double wt, double ht) {
        double bmi;
        bmi = wt / ht * ht;
        return bmi;
    }

    public static double calBmi2(double wt, double ht) {
        return (wt / ht * ht);
    }

    public static double getLargerVal() {
        int val;
        int val1;
        int val2;
        
        val1 = Integer.parseInt(JOptionPane.showInputDialog("value 1") );
        val2=Integer.parseInt(JOptionPane.showInputDialog("Value 2"));
        if (val1 > val2) {
            val = val1;
        }else val= val2;        
        return val;
    }

}

