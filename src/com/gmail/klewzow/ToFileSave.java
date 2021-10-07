package com.gmail.klewzow;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
@Target(value = {ElementType.TYPE })
@Retention(RUNTIME)
 
public @interface ToFileSave {
	String path() default "text.txt";
}
