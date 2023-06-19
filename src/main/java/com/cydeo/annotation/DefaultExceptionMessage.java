package com.cydeo.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


// this is how we can create our custom annotation in Java
// first we add @Target second @Retention
@Target(ElementType.METHOD) // we will put annotation above method
@Retention(RetentionPolicy.RUNTIME) // once the exception happen in the method our custom exception will be executed
public @interface DefaultExceptionMessage {

    String defaultMessage() default "";
}