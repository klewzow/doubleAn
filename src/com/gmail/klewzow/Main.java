package com.gmail.klewzow;

import java.io.File;
import java.lang.reflect.Method;

public class Main {

	public static void main(String[] args) {
		TextContainer text = new TextContainer("This my text.");

		Class<?> cls = text.getClass();

		if (cls.isAnnotationPresent(ToFileSave.class)) {
			String path = cls.getAnnotation(ToFileSave.class).path();
			Method[] metods = cls.getDeclaredMethods();
			for (Method method : metods) {
				if (method.isAnnotationPresent(Save.class)) {
					try {
						method.invoke(text, new File("text.txt"));
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		} else {
			System.out.println("Annotation not Found");
		}
 	}

}
