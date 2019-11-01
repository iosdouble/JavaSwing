package com.swing.charp01;

import javax.swing.*;
import java.awt.*;

/**
 * @Classname Main
 * @Description TODO
 * @Date 2019/11/1 10:21 AM
 * @Created by nihui
 */
public class Main {
    public static void main(String[] args) {
        //创建一个顶层容器
        //创建窗口
        JFrame jf = new JFrame("这是一个测试窗口");
        //设置大小
        jf.setSize(250,250);
        //设置窗口位置为屏幕中心
        jf.setLocationRelativeTo(null);

        //设置退出程序方式
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //创建中间层容器

        JPanel panel = new JPanel();

        //创建一个基本组件
        JButton btn = new JButton("登陆");
        panel.add(btn);

        //把 面板容器作为窗口内容设置到窗口中
        jf.setContentPane(panel);

        //设置窗口状态为显示
        jf.setVisible(true);


    }
}
