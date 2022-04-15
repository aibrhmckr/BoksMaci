package com.company;

public class Main {

    public static void main(String[] args) {
	Fighter f1 = new Fighter("Ali",12,85,100,50);
    Fighter f2 = new Fighter("Jack",12,85  ,85,50);
    Match match1=new Match(f1,f2,85,100);
    match1.run();
    }
}
