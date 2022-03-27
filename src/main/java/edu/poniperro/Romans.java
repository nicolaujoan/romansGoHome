package edu.poniperro;

public enum Romans {
    I(1), V(5), X(10), L(50), C(100), D(500), M(1000),
    CD(400), CM(900), XL(40), XC(90), IV(4), IX(9);

    private int decimalValue;

    Romans(int decimalvalue) {
        this.decimalValue = decimalvalue;
    }

    public int getDecimalValue() {
        return this.decimalValue;
    }

}

