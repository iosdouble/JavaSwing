package com.swing.charp01.jframedemo;

import javax.swing.*;
import java.awt.*;

/**
 * com.swing.charp01.jframedemo
 * create by admin nihui
 * create time 2020/11/30
 * version 1.0
 **/
public class JFrameDemo extends JFrame {

    public JFrameDemo(){
        setTitle("Java 第一个 GUI程序");
        setSize(400,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel jl = new JLabel("这个是一个Label窗口");
        Container container = getContentPane();
        container.add(jl);
        setVisible(true);
    }

    public static void main(String[] args) {
        new JFrameDemo();
    }
}
