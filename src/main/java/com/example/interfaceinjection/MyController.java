package com.example.interfaceinjection;

/**
 * Created by sluna on 05/10/2016.
 */
public class MyController {

    private MyService myService;

    public void setMyService(MyService myService) {

        this.myService = myService;

    }

    public Object controllerMethod() {

        return new Object();

    }

}
