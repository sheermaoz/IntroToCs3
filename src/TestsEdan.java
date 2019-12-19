import java.math.BigInteger;

public class TestsEdan {

    //decler consts
    static final BigInteger [] PRIMES = {new BigInteger("11"),new BigInteger("729367")};
    static final BigInteger [] NOT_PRIMES = {BigInteger.ZERO,BigInteger.ONE,new BigInteger("77"),new BigInteger("7293672"),new BigInteger("8057445192"),new BigInteger("6754968981732"),new BigInteger("7471794246945412")};


    //Part 1 test
    public static boolean sumTest1() {
        BigInteger bigInt = new BigInteger("-10");
        BigInteger sum = Part1.sumSmaller(bigInt);
        return sum.equals(new BigInteger("0"));
    }

    public static boolean sumTest2() {
        BigInteger bigInt = new BigInteger("0");
        BigInteger sum = Part1.sumSmaller(bigInt);
        return sum.equals(new BigInteger("0"));
    }

    public static boolean sumTest3() {
        BigInteger bigInt = new BigInteger("7");
        BigInteger sum = Part1.sumSmaller(bigInt);
        return sum.equals(new BigInteger("21"));
    }

    public static boolean sumTest4() {
        BigInteger bigInt = new BigInteger("99999");
        BigInteger sum = Part1.sumSmaller(bigInt);
        return sum.equals(new BigInteger("4999850001"));
    }

    public static void randomCheck() {
        Part1.printRandoms(5);
    }

    public static boolean randomPrimeTest1() {
        BigInteger rnd = Part1.randomPrime(8);
        return isPrime(rnd);
    }

    public static boolean randomPrimeTest2() {
        BigInteger rnd = Part1.randomPrime(50);
        return isPrime(rnd);
    }

    public static boolean randomPrimeTest3() {
        BigInteger rnd = Part1.randomPrime(37);
        return isPrime(rnd);
    }

    public static boolean randomPrimeTest4() {
        BigInteger rnd = Part1.randomPrime(17);
        return isPrime(rnd);
    }

    public static boolean randomPrimeTest5() {
        BigInteger rnd ;

        for (int i=0;i<20;i++)
        {
            rnd = Part1.randomPrime(6);
            if (isPrime(rnd) == false)
            {
                System.out.println("failed test randomPrimeTest5 the number "+ rnd.toString() + " is not prime" );
                return false;
            }
        }
        return true;
    }

    //Part 2 Tests
    public static boolean changeTest1() {
        int[] coins1 = {3, 4, 7};
        int n1 = 14;
        int n2 = 2;
        int n3 = 57;

        return Part2.change(coins1, n1) & !Part2.change(coins1, n2) & Part2.change(coins1, n3);
    }

    public static boolean changeTest2() {
        int[] coins1 = { 2, 3, 13};
        int n1 = 142;
        int n2 = 585;
        int n3 = 301;

        return Part2.change(coins1, n1) & Part2.change(coins1, n2) & Part2.change(coins1, n3);
    }

    public static boolean changeLimitedTest1() {
        int[] coins = {1, 7, 12, 19};
        int n = 20;
        int numOfUse = 2;
        return Part2.changeLimited(coins, n, numOfUse);
    }

    public static boolean changeLimitedTest2() {
        int[] coins = {1, 7, 10, 12};
        int n = 8;
        int numOfUse = 3;
        return !Part2.changeLimited(coins, n, numOfUse);
    }

    public static boolean changeLimitedTest3() {
        int[] coins = {1, 7, 10, 12};
        int n = 8;
        int numOfUse = 2;
        return Part2.changeLimited(coins, n, numOfUse);
    }

    public static boolean countChangeLimitedTest1() {
        int[] coins = {1, 2, 3};
        int n = 4;
        int numToUse = 2;
        return (Part2.countChangeLimited(coins, n, numToUse) == 2);
    }

    public static boolean countChangeLimitedTest2() {
        int[] countChangeLimited2 = {5, 10, 20, 50, 100};
        int n = 100;
        int numOfCoinsToUse = 5;

        return Part2.countChangeLimited(countChangeLimited2, n, numOfCoinsToUse) == 3;
    }

    public static boolean countChangeLimitedTest3() {
        int[] countChangeLimited3 = {5, 10, 50};
        int n = 65;
        int numOfCoinsToUse = 2;

        return Part2.countChangeLimited(countChangeLimited3, n, numOfCoinsToUse) == 0;
    }

    public static boolean changeInCubaTest1() {
        return Part2.changeInCuba(1) == 3;
    }

    public static boolean changeInCubaTest2() {
        return Part2.changeInCuba(2) == 7;
    }

    public static boolean changeInCubaTest3() {
        return Part2.changeInCuba(20) == 8689;
    }

    public static boolean changeInCubaTest4() {
        return Part2.changeInCuba(50) == 1655256;
    }

    public static boolean changeInCubaTest5() {
        return Part2.changeInCuba(73) == 22845463;
    }

    public static boolean changeInCubaTest6() {
        return Part2.changeInCuba(14) == 1678;
    }


    //Bit and NumberOfBits Tests
    public static boolean bitToIntTest1() {
        Bit bit = new Bit(true);
        return bit.toInt() == 1;
    }

    public static boolean bitToIntTest2() {
        Bit bit = new Bit(false);
        return bit.toInt() == 0;
    }

    public static boolean bitToStringTest1() {
        Bit bit = new Bit(false);
        return bit.toString().equals("0");
    }

    public static boolean bitToStringTest2() {
        Bit bit = new Bit(true);
        return bit.toString().equals("1");
    }

    public static boolean numAsBitsNullTest() {
        boolean gotExcepted = false;
        Bit[] bits = null;
        try {
            NumberAsBits num1 = new NumberAsBits(bits);
        } catch (Exception e) {
            gotExcepted = true;
        } finally {
            return gotExcepted;
        }
    }

    public static boolean nullInTheArray() {
        boolean gotExcepted = false;
        Bit[] bits = {new Bit(true), new Bit(true), new Bit(true), null, new Bit(false)};
        try {
            NumberAsBits num1 = new NumberAsBits(bits);
        } catch (Exception e) {
            gotExcepted = true;
        } finally {
            return gotExcepted;
        }
    }
    public static boolean emptyBits(){
        boolean gotExcepted = false;
        Bit[] bits = {};
        try {
            NumberAsBits num1 = new NumberAsBits(bits);
        } catch (Exception e) {
            gotExcepted = true;
        } finally {
            return gotExcepted;
        }
    }

    public static boolean toStringTest1() {
        Bit[] bits = {new Bit(false), new Bit(false), new Bit(false), new Bit(false), new Bit(false), new Bit(false), new Bit(true), new Bit(true)};
        NumberAsBits num1 = new NumberAsBits(bits);
        return num1.toString().equals("3");
    }

    public static boolean toStringTest2() {
        Bit[] bits = {new Bit(true), new Bit(false), new Bit(true), new Bit(false), new Bit(false), new Bit(false), new Bit(true), new Bit(true)};
        NumberAsBits num1 = new NumberAsBits(bits);
        return num1.toString().equals("163");
    }

    public static boolean toStringTest3() {
        Bit[] bits = {new Bit(false), new Bit(false), new Bit(false), new Bit(true), new Bit(false), new Bit(false), new Bit(true), new Bit(false)};
        NumberAsBits num1 = new NumberAsBits(bits);
        return num1.toString().equals("18");
    }

    public static boolean toStringTest4() {
        Bit[] bits = {new Bit(false), new Bit(false), new Bit(false), new Bit(false), new Bit(false), new Bit(true), new Bit(true), new Bit(true)};
        NumberAsBits num1 = new NumberAsBits(bits);
        return num1.toString().equals("7");
    }

    public static boolean toStringTest5() {
        Bit[] bits = {new Bit(false), new Bit(true), new Bit(true), new Bit(true), new Bit(true), new Bit(true), new Bit(true), new Bit(true)};
        NumberAsBits num1 = new NumberAsBits(bits);
        return num1.toString().equals("127");
    }

    public static boolean toStringTest6() {
        Bit[] bits = {new Bit(true), new Bit(true), new Bit(false), new Bit(false), new Bit(true), new Bit(true), new Bit(false), new Bit(true),
                new Bit(true), new Bit(false), new Bit(true), new Bit(true), new Bit(true), new Bit(false), new Bit(false), new Bit(true)};
        NumberAsBits num1 = new NumberAsBits(bits);
        return num1.toString().equals("52665");
    }

    public static boolean toBase2Test1() {
        Bit[] bits = {new Bit(false), new Bit(false), new Bit(false), new Bit(false), new Bit(false), new Bit(false), new Bit(true), new Bit(true)};
        NumberAsBits num1 = new NumberAsBits(bits);
        return num1.base2().equals("00000011");
    }

    public static boolean toBase2Test2() {
        Bit[] bits = {new Bit(true), new Bit(false), new Bit(true), new Bit(false), new Bit(false), new Bit(false), new Bit(true), new Bit(true)};
        NumberAsBits num1 = new NumberAsBits(bits);
        return num1.base2().equals("10100011");
    }

    public static boolean toBase2Test3() {
        Bit[] bits = {new Bit(false), new Bit(false), new Bit(false), new Bit(true), new Bit(false), new Bit(false), new Bit(true), new Bit(false)};
        NumberAsBits num1 = new NumberAsBits(bits);
        return num1.base2().equals("00010010");
    }

    public static boolean toBase2Test4() {
        Bit[] bits = {new Bit(false), new Bit(false), new Bit(false), new Bit(false), new Bit(false), new Bit(true), new Bit(true), new Bit(true)};
        NumberAsBits num1 = new NumberAsBits(bits);
        return num1.base2().equals("00000111");
    }

    public static boolean toBase2Test5() {
        Bit[] bits = {new Bit(false), new Bit(true), new Bit(true), new Bit(true), new Bit(true), new Bit(true), new Bit(true), new Bit(true)};
        NumberAsBits num1 = new NumberAsBits(bits);
        return num1.base2().equals("01111111");
    }

    public static boolean toBase2Test6() {
        Bit[] bits = {new Bit(true), new Bit(true), new Bit(false), new Bit(false), new Bit(true), new Bit(true), new Bit(false), new Bit(true),
                new Bit(true), new Bit(false), new Bit(true), new Bit(true), new Bit(true), new Bit(false), new Bit(false), new Bit(true)};
        NumberAsBits num1 = new NumberAsBits(bits);
        return num1.base2().equals("1100110110111001");
    }

    public static void test_ohad_1_3_isPrime_true() {

        for(int i=0;i<PRIMES.length;i++) {
            ohadInfra.report("is_prime_" + PRIMES[i], Part1.isPrime(PRIMES[i]));
        }
    }

    public static void test_ohad_1_3_isPrime_false() {
        for(int i=0;i<NOT_PRIMES.length;i++) {
            ohadInfra.report("is_prime_" + NOT_PRIMES[i], !Part1.isPrime(NOT_PRIMES[i]));
        }
    }

    public static void test_ohad_number_as_bits_to_string_2() {
        Bit bits []  = {new Bit(true),new Bit(false)};
        NumberAsBits nab = new NumberAsBits(bits);
        ohadInfra.report("test_ohad_number_as_bits_to_string_2",nab.toString().equals("2"));
    }

    public static void test_ohad_number_as_bits_to_string_537845674378() {
        Bit [] bits = bits_from_string("111110100111010000110011011000110001010");
        NumberAsBits nab = new NumberAsBits(bits);
        ohadInfra.report("test_ohad_number_as_bits_to_string_2",nab.toString().equals("537845674378"));
    }
    public static void test_ohad_number_as_bits_toString_787061080478274202282() {
        Bit [] bits = bits_from_string("1010101010101010101010101010101010101010101010101010101010101010101010");
        NumberAsBits nab = new NumberAsBits(bits);
        ohadInfra.report("test_ohad_number_as_bits_to_string_2",nab.toString().equals("787061080478274202282"));
    }

    public static void test_ohad_number_as_bits_base2_537845674378() {
        Bit [] bits = bits_from_string("111110100111010000110011011000110001010");
        NumberAsBits nab = new NumberAsBits(bits);
        ohadInfra.report("test_ohad_number_as_bits_to_string_2",nab.base2().equals("111110100111010000110011011000110001010"));
    }

    public static void test_ohad_number_as_bits_base2_787061080478274202282() {
        Bit [] bits = bits_from_string("1010101010101010101010101010101010101010101010101010101010101010101010");
        NumberAsBits nab = new NumberAsBits(bits);
        ohadInfra.report("test_ohad_number_as_bits_to_string_2",nab.base2().equals("1010101010101010101010101010101010101010101010101010101010101010101010"));
    }



    public static void test_ohad_number_as_bits_base2_8() {
        Bit [] bits = bits_from_string("1000");
        NumberAsBits nab = new NumberAsBits(bits);
        ohadInfra.report("test_ohad_number_as_bits_to_string_2",nab.base2().equals("1000"));
    }

    public static Bit[] bits_from_string(String bin_str)
    {
        int num_of_bits =bin_str.length();
        Bit []  bits = new Bit[num_of_bits];
        for(int i =0 ; i<num_of_bits;i++)
        {
            if(bin_str.charAt(i) == '1')
                bits[i] = new Bit(true);
            else
                bits[i] = new Bit(false);
        }
        return bits;
    }


    public static void main(String[] args) {

        test_ohad_1_3_isPrime_true();
        test_ohad_1_3_isPrime_false();

        ohadInfra.report("sumSmaller test1", sumTest1());
        ohadInfra.report("sumSmaller test2", sumTest2());
        ohadInfra.report("sumSmaller test3", sumTest3());
        ohadInfra.report("sumSmaller test4", sumTest4());

        randomCheck();

        ohadInfra.report("random Prime test1", randomPrimeTest1());
        //test 2 and test 3 may take a little while
//        report("random Prime test2", randomPrimeTest2());
//        report("random Prime test3", randomPrimeTest3());
        ohadInfra.report("random Prime test4", randomPrimeTest4());
        ohadInfra.report("random Prime test5", randomPrimeTest5());

        ohadInfra.report("change test1", changeTest1());
        ohadInfra.report("change test2", changeTest2());

        ohadInfra.report("change limited test1", changeLimitedTest1());
        ohadInfra.report("change limited test2", changeLimitedTest2());
        ohadInfra.report("change limited test3", changeLimitedTest3());

        ohadInfra.report("count change limited test1", countChangeLimitedTest1());
        ohadInfra.report("count change limited test2", countChangeLimitedTest2());
        ohadInfra.report("count change limited test3", countChangeLimitedTest3());

        ohadInfra.report("change in Cuba test1", changeInCubaTest1());
        ohadInfra.report("change in Cuba test2", changeInCubaTest2());
        ohadInfra.report("change in Cuba test3", changeInCubaTest3());
       // test 4 and test 5 may take a little while
        ohadInfra.report("change in Cuba test4", changeInCubaTest4());
        ohadInfra.report("change in Cuba test5", changeInCubaTest5());
        ohadInfra.report("change in Cuba test6", changeInCubaTest6());

        ohadInfra.report("Bit toInt test1", bitToIntTest1());
        ohadInfra.report("Bit toInt test2", bitToIntTest2());

        ohadInfra.report("Bit toInt test1", bitToStringTest1());
        ohadInfra.report("Bit toInt test2", bitToStringTest2());

        ohadInfra.report("bits is null test", numAsBitsNullTest());
        ohadInfra.report("null in the array bits", nullInTheArray());
        ohadInfra.report("empty bits array", emptyBits());

        test_ohad_number_as_bits_to_string_2();
        test_ohad_number_as_bits_to_string_537845674378();
        test_ohad_number_as_bits_base2_8();
        test_ohad_number_as_bits_base2_537845674378();
        test_ohad_number_as_bits_base2_787061080478274202282();
        test_ohad_number_as_bits_toString_787061080478274202282();

        ohadInfra.report("toString test1", toStringTest1());
        ohadInfra.report("toString test2", toStringTest2());
        ohadInfra.report("toString test3", toStringTest3());
        ohadInfra.report("toString test4", toStringTest4());
        ohadInfra.report("toString test5", toStringTest5());
        ohadInfra.report("toString test6", toStringTest6());

        ohadInfra.report("toBase2 test1", toBase2Test1());
        ohadInfra.report("toBase2 test2", toBase2Test2());
        ohadInfra.report("toBase2 test3", toBase2Test3());
        ohadInfra.report("toBase2 test4", toBase2Test4());
        ohadInfra.report("toBase2 test5", toBase2Test5());
        ohadInfra.report("toBase2 test6", toBase2Test6());
        ohadInfra.print_final_report();

    }

    public static boolean isPrime(BigInteger n) {
        boolean ans = true;
        //Task 1.3
        for (BigInteger i = new BigInteger("2"); ans && i.compareTo(n)==-1; i = i.add(new BigInteger("1"))) {
            if (n.remainder(i).equals(new BigInteger("0"))) {
                ans = false;
            }
        }
        return ans;


    }
}
