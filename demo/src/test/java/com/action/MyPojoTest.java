package com.action;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MyPojoTest {
@Test
public void set() {
	MyPojo myPojo = new MyPojo();
	myPojo.setA(1);
	assertEquals(1, myPojo.getA());
}
@Test
public void get() {
	MyPojo myPojo = new MyPojo();
	myPojo.setA(1);
	assertEquals(1, myPojo.getA());
}
}
