package com.gmail.klewzow;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
@Target(value = {ElementType.METHOD})
@Retention(RUNTIME)
public @interface Save { }
