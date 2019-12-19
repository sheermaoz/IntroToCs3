/*
I, Sheer Maoz (204901409), assert that the work I submitted is entirely my own.
I have not received any part from any other student in the class,
nor did I give parts of it for use to others.
I realize that if my work is found to contain code that is not originally my own,
 a formal case will be opened against me with the BGU disciplinary committee.
*/
public class Bit {
    /*
    The class represnts a bit.
    */

    private boolean value;

    public Bit(boolean value)
    {
        this.value = value;
        //Task 3.1
    }

    public int toInt()
    {
        /*
        The function returns 1 if the bit is true,
            and 0 otherwise.
        */ 
        int ans = 0;
        if (this.value)
        {
            ans = 1;
        }
        //Task 3.2
        return ans;

    }

    public String toString()
    {
        /*
        The function retuns "1" if the bit is true,
            and "0" otherwise.
        */

        String ans = "0";
        if (this.value)
        {
            ans = "1";
        }
        //Task 3.3
        return ans;
    }
}

