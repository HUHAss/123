LoginFrom:

package com.wechat.loginform;

import com.classbook.chapter.eight.Register;
import com.wechat.utils.WechatUtils;
import com.wechat.wecharform.WeCherForm;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//登录的窗口类
public class LoginForm extends JFrame {

    private JPanel panelLogin;
    private JLabel userLable;
    private JTextField userText;
    private JLabel passwordLabel;
    private JPasswordField passwordText;
    private JButton loginButton;
    private JButton registerButton;

    public JButton getLoginButton() {
        return loginButton;
    }
    public JButton getRegisterButton(){
        return registerButton;
    }

    //构造方法
    public LoginForm() {
        final String COMMAND_LOGIN = "LOGIN";
        final String COMMAND_REGISTER = "REGISTER";
        setTitle("Login Form");
        setSize(350,180);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panelLogin = new JPanel();
        panelLogin.setLayout(null);

        userLable = new JLabel("User:");
        userLable.setBounds(10,20,80,25);
        panelLogin.add(userLable);

        userText = new JTextField();
        userText.setBounds(100,20,165,25);
        panelLogin.add(userText);

        passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(10,50,80,25);
        panelLogin.add(passwordLabel);

        passwordText = new JPasswordField();
        passwordText.setBounds(100,50,165,25);
        panelLogin.add(passwordText);

        loginButton = new JButton("Login");
        loginButton.setBounds(10,80,100,25);
        //loginButton.setActionCommand(COMMAND_LOGIN);
        panelLogin.add(loginButton);
        loginButton.addActionListener(new LoginEventAction());

        registerButton = new JButton("Register");
        registerButton.setBounds(150,80,100,25);
        //registerButton.setActionCommand(COMMAND_REGISTER);
        panelLogin.add(registerButton);

        /*
        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //获取动作命令
                String command = e.getActionCommand();
                if(command.equals(COMMAND_LOGIN)){
                    System.out.println("OK 登录按钮被点击");
                    //JOptionPane.showMessageDialog(null,"请输入账号密码","出错了",JOptionPane.ERROR_MESSAGE);
                    //创建一个新的窗口
                    WeCherForm loginSucceed = new WeCherForm();
                }
                else if(command.equals(COMMAND_REGISTER)){
                    System.out.println("OK 注册按钮被点击");
                    //创建一个注册的新窗口
                    Register registerForm = new Register();
                }
                else{
                    System.out.println("Cancel 按钮被点击");
                }
            }
        };
        loginButton.addActionListener(actionListener);
        registerButton.addActionListener(actionListener);
        */
        add(panelLogin);

    }

    class LoginEventAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String username = userText.getText();
            //将字符数组转成字符串
            String password = String.valueOf(passwordText.getPassword());
            WechatUtils wechatUtils = new WechatUtils();
            int result = wechatUtils.loginStatus(username,password);
            switch (result){
                case 1 :
                    WeCherForm weCherForm = new WeCherForm();
                    weCherForm.setFrameWeCherVisible(true);
                    setFrameLoginVisible(false);
                    break;
                case 2 :
                    System.out.println("密码错误");
                    break;
                case 0 :
                    System.out.println("用户名错误，请先注册");
                    break;
            }
        }
    }

    public void setFrameLoginVisible(boolean visible) {
        setVisible(visible);
    }
}

RegisterFrom:

package com.wechat.registerform;

import com.wechat.utils.RegisterUtils;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//注册的窗口类
public class RegisterForm extends JFrame{
    private JPanel registerPanel;
    private JLabel usernameLabel;
    private JTextField usernameTextField;
    private JLabel emailLabel;
    private JTextField emailTextField;
    private JLabel passwordLable;
    private JTextField passwordTextField;
    private JLabel otarizePasswordLable;
    private JTextField otarizePasswordTextField;

    private JButton registerButton;
    private JButton backButton;

    public JButton getBackButton() {
        return backButton;
    }
    public JButton getregisterButton(){
        return registerButton;
    }
    //构造方法
    public RegisterForm(){

        setTitle("Register Form");
        setSize(380,250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        registerPanel = new JPanel();
        registerPanel.setLayout(null);

        usernameLabel = new JLabel("username:");
        usernameLabel.setBounds(10,20,80,25);
        registerPanel.add(usernameLabel);

        usernameTextField = new JTextField();
        usernameTextField.setBounds(120,20,165,25);
        registerPanel.add(usernameTextField);

        emailLabel = new JLabel("e-mail:");
        emailLabel.setBounds(10,50,80,25);
        registerPanel.add(emailLabel);

        emailTextField = new JTextField();
        emailTextField.setBounds(120,50,165,25);
        registerPanel.add(emailTextField);

        passwordLable = new JLabel("password:");
        passwordLable.setBounds(10,80,80,25);
        registerPanel.add(passwordLable);

        passwordTextField = new JTextField();
        passwordTextField.setBounds(120,80,165,25);
        registerPanel.add(passwordTextField);

        otarizePasswordLable = new JLabel("otarize-password:");
        otarizePasswordLable.setBounds(10,110,120,25);
        registerPanel.add(otarizePasswordLable);

        otarizePasswordTextField = new JTextField();
        otarizePasswordTextField.setBounds(120,110,165,25);
        registerPanel.add(otarizePasswordTextField);

        registerButton = new JButton("Register");
        registerButton.setBounds(20,140,110,25);
        registerPanel.add(registerButton);
        registerButton.addActionListener(new RegisterAction());

        backButton = new JButton("back");
        backButton.setBounds(160,140,110,25);
        registerPanel.add(backButton);

        add(registerPanel);
    }

    class RegisterAction implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            boolean result;
            String name, e_mail ,password ,otarizePassword;
            name = usernameTextField.getText();
            e_mail = emailTextField.getText();
            password = passwordTextField.getText();
            otarizePassword = otarizePasswordTextField.getText();
            if(password.equals(otarizePassword)){
                RegisterUtils registerUtils = new RegisterUtils();
                result = registerUtils.registerStatus(name,e_mail,password);
                System.out.println("注册成功");
                setFrameRegisterVisible(false);
            }
            else{
                System.out.println("两次密码不一致，请重新输入");
            }
        }
    }

    public void setFrameRegisterVisible(boolean visible) {
        setVisible(visible);
    }
}


RegisterSucceed:

package com.wechat.registerform;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//注册成功的窗口类
public class RegisterSucceed extends JFrame {
    private JPanel registersucceed;
    private JButton ToLoginButton;

    public JButton getToLoginButton() {
        return ToLoginButton;
    }

    public RegisterSucceed(){
        setTitle("Register Succeed");
        setSize(300,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        registersucceed = new JPanel();
        registersucceed.setLayout(null);

        ToLoginButton = new JButton("go login");
        ToLoginButton.setBounds(50,50,120,30);
        registersucceed.add(ToLoginButton);
        ToLoginButton.addActionListener(new RegisterAction());

        add(registersucceed);
    }

    class RegisterAction implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            setFrameRegisterSucceedVisible(false);
        }
    }

    public void setFrameRegisterSucceedVisible(boolean visible) {
        setVisible(visible);
    }
}

RegisterUtils:

package com.wechat.utils;

import java.io.*;

public class RegisterUtils {
    public boolean registerStatus(String username, String e_mail , String password ){
        boolean result = false;
        String filename = "./users/" + username + ".txt";
        File file = new File(filename);
        try {
            file.createNewFile();
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            String message = username + "\n" + password + "\n" + e_mail;
            bw.write(message);
            bw.close();
            result = true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}


WechatUtils:

package com.wechat.utils;

import java.io.*;

//用户名密码正确返回1，用户名错误返回0，密码错误返回2
public class WechatUtils {
    public int loginStatus(String username,String userPassword){
        int result = 1 ;
        String filename = "./users/" + username + ".txt";
        File file = new File(filename);
        if (file.exists()){
            try {
                BufferedReader br = new BufferedReader(new FileReader(file));
                String name = br.readLine();
                String password = br.readLine();
                br.close();
                if (!username.equals(name)){
                    return 0;
                }
                if (!userPassword.equals(password)) {
                    return 2;
                }
                if (username.equals(name) && userPassword.equals(password)){
                    return 1;
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        return 0;
    }
}

WeCherFrom:

package com.wechat.wecharform;

import javax.swing.*;

//登录成功的窗口类
public class WeCherForm extends JFrame {

    //构造方法
    public WeCherForm(){
        setTitle("Login Succeed");
        setSize(450,250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void setFrameWeCherVisible(boolean visible) {
        setVisible(visible);
    }
}

Manage:

package com.wechat;

import com.wechat.loginform.LoginForm;
import com.wechat.registerform.RegisterForm;
import com.wechat.registerform.RegisterSucceed;
import com.wechat.wecharform.WeCherForm;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//主函数
public class Manage {

    public static void main(String[] args) {
        //四个窗口对象
        final LoginForm loginForm = new LoginForm();
        final RegisterForm registerForm = new RegisterForm();
        final RegisterSucceed registerSucceed = new RegisterSucceed();
        //final WeCherForm weCherForm = new WeCherForm();
        loginForm.setFrameLoginVisible(true);

        //点击注册跳到注册界面
        loginForm.getRegisterButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //loginForm.dispose();
                registerForm.setFrameRegisterVisible(true);
            }
        });
        //点击back返回登录界面
        registerForm.getBackButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                registerForm.setFrameRegisterVisible(false);
                loginForm.setFrameLoginVisible(true);
            }
        });

        //点击go login 返回登录界面
       registerSucceed.getToLoginButton().addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               loginForm.setFrameLoginVisible(true);
               registerSucceed.setFrameRegisterSucceedVisible(false);
           }
       });

    }

}





