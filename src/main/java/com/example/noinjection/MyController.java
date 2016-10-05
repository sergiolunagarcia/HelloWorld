package com.example.noinjection;

/**
 * Created by sluna on 05/10/2016.
 */
public class MyController {

    private MyService myService;

    public  MyController() {

        myService = new MyService();

    }

}
