/*
I, Sheer Maoz (204901409), assert that the work I submitted is entirely my own.
I have not received any part from any other student in the class,
nor did I give parts of it for use to others.
I realize that if my work is found to contain code that is not originally my own,
 a formal case will be opened against me with the BGU disciplinary committee.
*/
import java.math.BigInteger;
import java.util.Random;

class Part1{

    public static BigInteger sumSmaller(BigInteger n)
    {
        /*
        The function receives a BigInteger, n.
        The function returns the sum of all positive numbers smaller than n.
        The function assumes that n is a number.
        */

        BigInteger sum =  new BigInteger("0");
        for (BigInteger i = BigInteger.ONE; n.compareTo(i) == 1; i = i.add(BigInteger.ONE))
        {
            sum = sum.add(new BigInteger(String.valueOf(i)));
        }
        //Task 1.1
        return sum;
    }

    public static void printRandoms(int n)
    {
        /*
        The function receives a number, n.
        The function prints "n" random BigIntegers.
        The function assumes that n >= 0.
        */

        Random rand = new Random();
        for (int i = 0; i < n; i++)
        {
            System.out.println(rand.nextInt());
        }
        
        //Task 1.2
    }

    public static   boolean isPrime(BigInteger n)
    {
        /*
        The function receives a BigInteger, n.
        The function returns true if n is prime.
        The function assumes that n >= 0.
        */

        boolean ans= true;
        BigInteger mod;
        if (n.compareTo(new BigInteger("2")) == -1)
        {
            ans = false;
        }
        for (BigInteger i = new BigInteger("2"); n.compareTo(i.multiply(i)) != -1 & ans; i=i.add(BigInteger.ONE) )
        {
            mod  = n.remainder(i);
            if(mod.equals(BigInteger.ZERO))
            {
                ans = false;
            }
        }
        //Task 1.3
        
        return ans;
    }

    public static BigInteger randomPrime(int n)
    {
        /*
        The function receives a number, n.
        The function returns a random prime BigInteger.
        The function assumes that n > 1.
        */

        Random rnd = new Random();
        BigInteger randBig = new BigInteger(n ,rnd);
        while ((!isPrime(randBig)))
        {
            randBig = new BigInteger(n, rnd);
        }
        //Task 1.4
        return randBig;
    }

    public static void main(String[] args) {
        // test for part 1.1
        BigInteger biMinus = new BigInteger("-10");
        System.out.println("sumSmaller test expected 0 - got " + sumSmaller(biMinus));
    
        BigInteger bi0 = new BigInteger("0");
        System.out.println("sumSmaller test expected 0 - got " + sumSmaller(bi0));
    
        BigInteger bi7 = new BigInteger("7");
        System.out.println("sumSmaller test expected 21 - got " + sumSmaller(bi7));
    
        BigInteger biHigh = new BigInteger("99999");
        System.out.println("sumSmaller test expected 4999850001 - got " + sumSmaller(biHigh)+"\n");
        
        //test for part 1.2
        System.out.println("printRandoms 5");
        printRandoms(5);
        System.out.println("");

        //test for part 1.3
        BigInteger biVeryHigh = new BigInteger("2147521927");
        System.out.println("isPrime test expectet true got " + isPrime(biVeryHigh));
        biVeryHigh = new BigInteger("2147521921");
        System.out.println(("isPrime test expectet false got " +  isPrime(biVeryHigh))+"\n");
        
        //test for part 1.4
        System.out.println("randomPrime test");
        System.out.println(randomPrime(20));
        System.out.println(randomPrime(40));
    }
}
