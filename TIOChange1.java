package com.phillyphyre;

public class TIOChange1 {

    public static void main(String[] args) {

        double q;
        double di;
        double n;
        double p;

        double ds;

        TextIO.putln("Welcome to Virtual Coin Counter v0.0");
        TextIO.putln("Let's start by counting your quarters:   ");
        q = TextIO.getlnDouble() * 25;
        TextIO.putln("Awesome. Now your dimes:       ");
        di = TextIO.getlnDouble() * 10;
        TextIO.putln("Halfway there. Nickles, please:        ");
        n = TextIO.getlnDouble() * 5;
        TextIO.putln("Now we just need to count your pennies:   ");
        p = TextIO.getlnDouble();

        ds = (q + di + n + p)/100;

        TextIO.putf("If we counted correctly, your coins add up to $%1.2f%n", ds);
        TextIO.putln("Thank you for counting with VCC v0!!");


    }
}
