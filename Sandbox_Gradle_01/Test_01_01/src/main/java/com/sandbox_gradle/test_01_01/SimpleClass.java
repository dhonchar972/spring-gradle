package com.sandbox_gradle.test_01_01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("simpleClass")
public class SimpleClass {
    private final String text;
    private final String aboba;
    private String value;

    public SimpleClass(String text, String aboba){
        System.out.println("/////////////////////////////////////////////////////////////////////////////////////////");
        System.out.println("SimpleClass, constructor initialisation start!!!");
        System.out.println("/////////////////////////////////////////////////////////////////////////////////////////");
        this.text = text;
        System.out.println("/////////////////////////////////////////////////////////////////////////////////////////");
        System.out.println("SimpleClass, first constructor parameter set!!!");
        System.out.println("/////////////////////////////////////////////////////////////////////////////////////////");
        this.aboba = aboba;
        System.out.println("/////////////////////////////////////////////////////////////////////////////////////////");
        System.out.println("SimpleClass, constructor initialisation ended!!! " + text + " " + aboba);
        System.out.println("/////////////////////////////////////////////////////////////////////////////////////////");
    }

    @Autowired
    public void setValue(String value) {
        System.out.println("/////////////////////////////////////////////////////////////////////////////////////////");
        System.out.println("SimpleClass, setValue call!!!");
        System.out.println("/////////////////////////////////////////////////////////////////////////////////////////");
        this.value = value;
        System.out.println("/////////////////////////////////////////////////////////////////////////////////////////");
        System.out.println("SimpleClass, setValue ended!!!" + value);
        System.out.println("/////////////////////////////////////////////////////////////////////////////////////////");
    }

    public String getValue(){
        System.out.println("/////////////////////////////////////////////////////////////////////////////////////////");
        System.out.println("SimpleClass, getValue called!!!");
        System.out.println("/////////////////////////////////////////////////////////////////////////////////////////");
        return value;
    }
}
