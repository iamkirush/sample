package com.sgic.sp;
import java.util.*;

public class FruitList {
 private List friutList;

public void setFriutList(List friutList) {
	this.friutList = friutList;
}

public void getName() {
	System.out.println(friutList);
}

public void init() {
	System.out.println("Initialized");
}

public void destroy() {
	System.out.println("Destroyed");
}
 
}
