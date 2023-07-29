package com.aurionpro.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

import com.aurionpro.model.Accountant;
import com.aurionpro.model.Employee;

public class ReflectionTest {
     public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException {
    	 String className = args[0];
    	  
    	  Class<?> tempClass = Class.forName(className);
    	  System.out.println("*******************************************************");
    	  
    	  Field[] declaredFields = tempClass.getDeclaredFields();
    	  
    	  for(Field f:declaredFields) {
    	   System.out.println(f);
    	  }
    	  
    	  System.out.println("*******************************************************");
    	  
    	  Method[] methods = tempClass.getMethods();
    	  
    	  for(Method m:methods) {
    	   System.out.println(m);
    	  }
    	  
    	  System.out.println("*******************************************************");
    	  
    	  Class<? super Accountant> superClass = Accountant.class.getSuperclass();
    	  System.out.println(superClass.getSimpleName());
     }
}