package com.swing.charp01.jpaneldemo;

import javax.swing.*;
import java.awt.*;

/**
 * com.swing.charp01.jpaneldemo
 * create by admin nihui
 * create time 2020/11/30
 * version 1.0
 **/
public class JPanelDemo {
    public static void main(String[] args) {
        JFrame jf = new JFrame("这是第二个标签");
        jf.setBounds(300,100,400,200);
        JPanel jp = new JPanel();
        JLabel jl = new JLabel("Label标签");
        jp.setBackground(Color.white);
        jp.add(jl);
        jf.add(jp);
        jf.setVisible(true);
    }
}
