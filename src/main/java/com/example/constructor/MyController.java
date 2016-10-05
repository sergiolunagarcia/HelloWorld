package com.example.constructor;

/**
 * Created by sluna on 05/10/2016.
 */
public class MyController {

    private MyService myService;

    public MyController(MyService myService) {

        this.myService = myService;

    }

    public Object controllerMethod() {

        return new Object();

    }

}
