package org.epam3.mainCalc;

import org.epam3.operate.operate;

public class mainCalc extends Exception{
	
    private static final long serialVersionUID = 1L;
    private final float fnumber, snumber;
    private final char work;
    private final operate opr;

    public mainCalc(final float fno, final char operate, final float sno)
    {
        work = operate;
        fnumber = fno;
        snumber = sno;

        opr = new operate();
    }

    public float displayResult()
    {
        if(work == '+')
            return opr.addition(fnumber,snumber);
        else if(work == '-')
            return opr.subtraction(fnumber,snumber);
        else if(work == '/')
            return opr.division(fnumber,snumber);
        else if(work == '*')
            return opr.multiplication(fnumber,snumber);
        else if(work == '%')
            return opr.remainder(fnumber,snumber);
        else
            throw new ArithmeticException();
    }
}
