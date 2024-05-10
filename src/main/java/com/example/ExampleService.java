package com.example;

public class ExampleService {

    public String exampleMethod(){
        return "Example Response";
    }

    public String exampleMethod(String name){
        return "Hello " + name + ", thank you for sending the message";
    }
}
