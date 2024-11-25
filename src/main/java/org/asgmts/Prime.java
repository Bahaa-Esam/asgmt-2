package org.asgmts;

class Prime extends Number {
    public void checkP() {
        int num = getNum();
        if (prime())
            System.out.println(num + " is a Prime");
        else
            System.out.println(num + " isn't a Prime");
    }
}
