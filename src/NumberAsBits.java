/*
I, Sheer Maoz (204901409), assert that the work I submitted is entirely my own.
I have not received any part from any other student in the class,
nor did I give parts of it for use to others.
I realize that if my work is found to contain code that is not originally my own,
 a formal case will be opened against me with the BGU disciplinary committee.
*/
import java.math.BigInteger;


public class NumberAsBits {
    /*
    The class represents a number as bits.
    */

    private Bit[] bits;

    public NumberAsBits(Bit[] bits) 
    {
        if (bits == null || bits.length == 0)
        {
            throw new IllegalArgumentException("The array is invalid");
        }

        this.bits = new Bit[bits.length];
        for (int i = 0; i < bits.length; i++)
        {
            if (bits[i] == null)
            {
                throw new IllegalArgumentException("The array is invalid");
            }
            this.bits[i] = new Bit(bits[i].toInt() == 1);
            
          
        }
        //Task 3.4
    }

    public String toString() 
    { 
        /*
        The function returns the decimal value of the number.
        */

        String ans ="";
        BigInteger sum = BigInteger.ZERO;
        BigInteger two = new BigInteger("2");
        for (int i = 0; i < this.bits.length; i++)
        {
            if (this.bits[i].toInt() == 1)
            {
                sum = sum.add(two.pow(this.bits.length-1-i));
            }
            
        }
        ans = sum.toString();

        //Task 3.5
        return ans;
    }

    public String base2() 
    {
        /*
        The function returns the binary value of the number.
        */

        String ans ="";
        for (int i =0; i < this.bits.length; i++)
        {
            ans=ans + this.bits[i].toString();
        }
        //Task 3.6
        return ans;
    }
}


