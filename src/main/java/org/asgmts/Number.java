package org.asgmts;

class Number {
    private int num;

    public void setNum(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public boolean prime () {
        if (num <= 1)
            return false;
        else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0)
                    return false;
            }
            return true;
        }
    }
}
