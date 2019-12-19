/*
I, Sheer Maoz (204901409), assert that the work I submitted is entirely my own.
I have not received any part from any other student in the class,
nor did I give parts of it for use to others.
I realize that if my work is found to contain code that is not originally my own,
 a formal case will be opened against me with the BGU disciplinary committee.
*/
class Part2{

    public static boolean change(int [] coins, int n)
    {
        /*
        The function receives a number, n,
            and an array of coin values, coins.
        The function returns true if it is possible to make change
            to n using the values in coins.
        The function assumes that n >= 0,
            and that coins is sorted and all values are positive.
        */
      
        //Task 2.1
        return change(coins, n, 0);
    }

    public static boolean change(int [] coins, int n, int i)
    {
        /*
        The function receives a number, n,
            an array of coin values, coins,
            and an index, i.
        The function returns true if it is possible to make change
            to n using the values in coins.
        The function assumes that n >= 0,
            and that coins is sorted and all values are positive.
        */
        boolean output;
        if (i == coins.length | i < 0)
        {
            output = false;
        }
        else if (n == 0)
        { 
            output = true;
        }
        else if (n < 0)
        {
            output = false;
        }
        else 
        {
            output = (change(coins, n - coins[i], i) | change(coins, n, i+1));
        }
        return output;
    }

    public static boolean changeLimited(int[] coins, int n, int numOfCoinsToUse)
    {
        /*
        The function receives a number, n,
            an array of coin values, coins,
            and a number of coins to use, numOfCoinsToUse.
        The function returns true if it is possible to make change
            to n using exactly numOfCoinsToUse coins of the values in coins.
        The function assumes that n >= 0,
            that numOfCoinsToUse >= 0,
            and that coins is sorted and all values are positive.
        */

        //Task 2.2
        return changeLimited(coins, n, numOfCoinsToUse, 0);
    }

    public static boolean changeLimited(int [] coins, int n, int numOfCoinsToUse, int i)
    {
        /*
        The function receives a number, n,
            an array of coin values, coins,
            a number of coins to use, numOfCoinsToUse,
            and an index, i.
        The function returns true if it is possible to make change
            to n using exactly numOfCoinsToUse coins of the values in coins.
        The function assumes that n >= 0,
            that numOfCoinsToUse >= 0,
            and that coins is sorted and all values are positive.
        */

        boolean output;
        if (n == 0 & numOfCoinsToUse == 0)
        {
            output = true;
        }
        else if (n==0 & numOfCoinsToUse != 0)
        {
            output = false;
        }
        else if (n > 0 & numOfCoinsToUse == 0)
        {
            output = false;
        }
        else if (i == coins.length | i < 0 | n < 0)
        {
            output = false;
        }
        else 
        {
            output = changeLimited(coins, n-coins[i], numOfCoinsToUse-1, i) | changeLimited(coins, n, numOfCoinsToUse, i+1);
        }
        return output;
    }

    public static void printChangeLimited(int[] coins, int n, int numOfCoinsToUse)
    {
        /*
        The function receives a number, n,
            an array of coin values, coins,
            and a number of coins, numOfCoinsToUse.
        The function prints a solution of making change to n 
            using exactly numOfCoinsToUse coins of the values in coins.
        The function assumes that n >= 0,
            that numOfCoinsToUse >= 0,
            and that coins is sorted and all values are positive.
        */

        printChangeLimited(coins, n, numOfCoinsToUse, 0, "", true);
        //Task 2.3
    }

    public static boolean printChangeLimited(int[] coins, int n, int numOfCoinsToUse,int i, String output, boolean toPrint)
    {
        /*
        The function receives a number, n,
            an array of coin values, coins,
            a number of coins to use, numOfCoinsToUse,
            and an index, i.
        The function prints a solution of making change to n 
            using exactly numOfCoinsToUse coins of the values in coins.
        The function assumes that n >= 0,
            that numOfCoinsToUse >= 0,
            and that coins is sorted and all values are positive.
        */

        boolean found = false;
        if (n == 0 & numOfCoinsToUse == 0 & toPrint)
        {
            found = true;
            System.out.println(output.substring(1));
        }
        else if (n==0 & numOfCoinsToUse != 0)
        {
            output = "";
        }
        else if (n > 0 & numOfCoinsToUse == 0)
        {
            output = "";
        }
        else if (i == coins.length | i < 0 | n < 0)
        {
            output = "";
        }
        else 
        {
            found = printChangeLimited(coins, n-coins[i], numOfCoinsToUse-1, i, output + "," + String.valueOf(coins[i]), toPrint) ||
                printChangeLimited(coins, n, numOfCoinsToUse, i+1, output, toPrint);
        }

       return found;
    }

    public static int countChangeLimited(int[] coins, int n, int numOfCoinsToUse)
    {
        /*
        The function receives a number, n,
            an array of coin values, coins,
            and a number of coins to use, numOfCoinsToUse.
        The function returns the number of solutions of making change to n 
            using exactly numOfCoinsToUse coins of the values in coins.
        The function assumes that n >= 0,
            that numOfCoinsToUse >= 0,
            and that coins is sorted and all values are positive.
        */
        
        int ans = 0;
        ans = countChangeLimited(coins, n, numOfCoinsToUse, 0);
        //Task 2.4
        return ans;
    }

    public static int countChangeLimited(int [] coins, int n, int numOfCoinsToUse, int i)
    {
        /*
        The function receives a number, n,
            an array of coin values, coins,
            a number of coins to use, numOfCoinsToUse,
            and an index, i.
        The function returns the number of solutions of making change to n 
            using exactly numOfCoinsToUse coins of the values in coins.
        The function assumes that n >= 0,
            that numOfCoinsToUse >= 0,
            and that coins is sorted and all values are positive.
        */

        int output;
        
        if (n == 0 & numOfCoinsToUse == 0)
        {
            output = 1;
        }
        else if (n==0 & numOfCoinsToUse != 0)
        {
            output = 0;
        }
        else if (n > 0 & numOfCoinsToUse == 0)
        {
            output = 0;
        }
        else if (i == coins.length | i < 0 | n < 0)
        {
            output = 0;
        }
        else 
        {
            output = countChangeLimited(coins, n-coins[i], numOfCoinsToUse-1, i) + 
                countChangeLimited(coins, n, numOfCoinsToUse, i+1);
        }
        return output;
    }

    public static void printAllChangeLimited(int[] coins, int n, int numOfCoinsToUse)
    {
        /*
        The function receives a number, n,
            an array of coin values, coins,
            a number of coins to use, numOfCoinsToUse.
        The function prints all solutions of making change to n 
            using exactly numOfCoinsToUse coins of the values in coins.
        The function assumes that n >= 0,
            that numOfCoinsToUse >= 0,
            and that coins is sorted and all values are positive.
        */

        //Task 2.5
        printAllChangeLimited(coins, n, numOfCoinsToUse, 0, "");
    }

    public static void printAllChangeLimited(int[] coins, int n, int numOfCoinsToUse,int i, String output)
    {
        /*
        The function receives a number, n,
            an array of coin values, coins,
            a number of coins to use, numOfCoinsToUse,
            and an index, i.
        The function prints all solutions of making change to n 
            using exactly numOfCoinsToUse coins of the values in coins.
        The function assumes that n >= 0,
            that numOfCoinsToUse >= 0,
            and that coins is sorted and all values are positive.
        */
        
        if (n == 0 & numOfCoinsToUse == 0)
        {
            System.out.println(output.substring(1));
        }
        else if (n==0 & numOfCoinsToUse != 0)
        {
            output = "";
        }
        else if (n > 0 & numOfCoinsToUse == 0)
        {
            output = "";
        }
        else if (i == coins.length)
        {
            output = "";
        }
        else if (n < 0)
        {
            output = "";
        }
        else 
        {
            printAllChangeLimited(coins, n-coins[i], numOfCoinsToUse-1, i, output  + "," + coins[i]);
            printAllChangeLimited(coins, n, numOfCoinsToUse, i+1, output);
        }
    }


    public static int changeInCuba(int cuc)
    {
        /*
        The function receives a number, cuc.
        The function returns the number of ways to change cuc, using 
            both money systems in Cuba.
        The funcion assumes cuc > 0.
        */
        int ans = 0;
        int[] coins = {1,3,5,10,20,50,100};
        ans = changeInCuba(coins, 3*cuc, 0);
        //Task 2.6
        return ans;
    }

    public static int changeInCuba(int [] coins, int n, int i)
    {
        /*
        The function receives a number, n,
            an array of coin values, coins,
            and an index, i.
        The function returns the number of ways to change cuc, using 
            both money systems in Cuba.
        The function assumes that n > 0,
            and that all values in coins are positive.
        */

        int output;
        if (i == coins.length | i < 0 | n < 0)
        {
            output = 0;
        }
        else if (n == 0)
        { 
            output = 1;
        }
        else
        {
            output = changeInCuba(coins, n, i+1) + changeInCuba(coins, n - coins[i], i) + changeInCubaTriple(coins, n - 3*coins[i], i);
        }
        return output;
    }

    public static int changeInCubaTriple(int [] coins, int n, int i)
    {
        /*
        The function receives a number, n,
            an array of coin values, coins,
            and an index, i.
        The function returns the number of ways to change cuc, using 
            both money systems in Cuba.
        The function assumes that n > 0,
            and that all values in coins are positive.
        */

        int output;
        if (i == coins.length | i < 0 | n < 0)
        {
            output = 0;
        }
        else if (n == 0)
        { 
            output = 1;
        }
        else
        {
            output = changeInCuba(coins, n, i+1) + changeInCubaTriple(coins, n - 3*coins[i], i);
        }
        return output;
    }

    public static void main(String[] args){
         //tests for part 2.1
        int []changee1 = {1,5,10};
        int n = 7;
        System.out.println("change test 1:expected true, got " + change(changee1,n));
        int []cchange2 = {2,10,20,100};
        n = 15;
        System.out.println("change test 2: expected false, got " + change(cchange2,n)+"\n");

        // tests for part 2.2
        int []changeLimited1 = {1,12,17,19};
        n = 20;
        int numOfCoinsToUse = 2;
        System.out.println("ChangeLimited test 1: expected true, got " + changeLimited(changeLimited1,n ,numOfCoinsToUse));
        int []changeLimited2 = {5,7,12};
        n = 8;
        numOfCoinsToUse = 2;
        System.out.println("ChangeLimited test 2: expected false, got " + changeLimited(changeLimited2,n ,numOfCoinsToUse));
        int []changeLimited3 = {1,7,12,10};
        n = 10;
        numOfCoinsToUse = 5;
        System.out.println("ChangeLimited test 3: expected false, got " + changeLimited(changeLimited3,n ,numOfCoinsToUse)+"\n");
        
        // tests for part 2.3
        int []printChangeLimited1 = {1,2,3};
        n = 4;
        numOfCoinsToUse = 2;
        System.out.println("PrintChangeLimited test 1: expected 2,2 or 1,3 , got ");
        printChangeLimited(printChangeLimited1,n ,numOfCoinsToUse);
        int []printChangeLimited2 = {1,7,12};
        n = 10;
        numOfCoinsToUse = 5;
        System.out.println("PrintChangeLimited test 2: expected printing nothing, got ");
        printChangeLimited(printChangeLimited2,n ,numOfCoinsToUse);
        System.out.println("");

        //tests for part 2.4
        int []countChangeLimited1 = {1,2,3};
        n = 4;
        numOfCoinsToUse = 2;
        System.out.println("CountChangeLimited test 1: expected 2, got " + countChangeLimited(countChangeLimited1,n ,numOfCoinsToUse));
        int []countChangeLimited2 = {5,10,20,50,100};
        n = 100;
        numOfCoinsToUse = 5;
        System.out.println("CountChangeLimited test 2: expected 3, got " + countChangeLimited(countChangeLimited2,n ,numOfCoinsToUse));
        int []countChangeLimited3 ={5,10,50};
        n = 65;
        numOfCoinsToUse = 2;
        System.out.println("CountChangeLimited test 3: expected 0, got " + countChangeLimited(countChangeLimited3,n ,numOfCoinsToUse)+"\n");
        
        //tests for part 2.5
        int []printAllChangeLimited1 = {1,2,3};
        n = 4;
        numOfCoinsToUse = 2;
        System.out.println("PrintAllChangeLimited test 1: expected : \n 2,2 \n 1,3 \n or \n 1,3 \n 2,2 , got " );
        printAllChangeLimited(printAllChangeLimited1,n ,numOfCoinsToUse);
        int []printAllChangeLimited2 = {1,5,10,20};
        n = 13;
        numOfCoinsToUse = 2;
        System.out.println("PrintAllChangeLimited  test 2: expected printing nothing, got ");
        printAllChangeLimited(printAllChangeLimited2,n ,numOfCoinsToUse);
        System.out.println("");

        //tests for part 2.6
        System.out.println("ChangeInCuba 1");
        System.out.println(changeInCuba(1));
        System.out.println("ChangeInCuba 2");
        System.out.println(changeInCuba(2));
        System.out.println("ChangeInCuba 20");
        System.out.println(changeInCuba(20));
        System.out.println("ChangeInCuba 25");
        System.out.println(changeInCuba(25));
        System.out.println("ChangeInCuba 30");
        System.out.println(changeInCuba(30));
        System.out.println("ChangeInCuba 40");
        System.out.println(changeInCuba(40));
        System.out.println("ChangeInCuba 50");
        System.out.println(changeInCuba(50));
    }
}
