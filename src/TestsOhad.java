import java.math.BigInteger;
import java.util.Arrays;



public class TestsOhad {
    //decler consts
    static final BigInteger [] PRIMES = {new BigInteger("11"),new BigInteger("729367"),new BigInteger("805744519"),new BigInteger("675496898173"),new BigInteger("747179424694541")};
    static final BigInteger [] NOT_PRIMES = {BigInteger.ZERO,BigInteger.ONE,new BigInteger("77"),new BigInteger("7293672"),new BigInteger("8057445192"),new BigInteger("6754968981732"),new BigInteger("7471794246945412")};

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

    public static void test_NumberAsBits_3_4_null_arr() {
        Bit [] bits = null;
        try {
            NumberAsBits nab = new NumberAsBits(bits);
        } catch (IllegalArgumentException e) {
            ohadInfra.report("test_NumberAsBits_3_4_null_arr",true);
            return;
        }
        ohadInfra.report("test_NumberAsBits_3_4_null_arr",false);

    }

    public static void test_NumberAsBits_3_4_empty_arr() {
        Bit [] bits = {};
        try {
            NumberAsBits nab = new NumberAsBits(bits);
        } catch (IllegalArgumentException e) {
            ohadInfra.report("test_NumberAsBits_3_4_empty_arr",true);
            return;
        }
        ohadInfra.report("test_NumberAsBits_3_4_empty_arr",false);

    }

    public static void test_NumberAsBits_3_4_null_inside_arr() {
        Bit [] bits = {new Bit(true),null};
        try {
            NumberAsBits nab = new NumberAsBits(bits);
        } catch (IllegalArgumentException e) {
            ohadInfra.report("test_NumberAsBits_3_4_null_inside_arr",true);
            return;
        }
        ohadInfra.report("test_NumberAsBits_3_4_null_inside_arr",false);

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
        test_ohad_number_as_bits_to_string_2();
        test_ohad_number_as_bits_to_string_537845674378();
        test_ohad_number_as_bits_base2_8();
        test_ohad_number_as_bits_base2_537845674378();
        test_ohad_number_as_bits_base2_787061080478274202282();
        test_ohad_number_as_bits_toString_787061080478274202282();
        test_NumberAsBits_3_4_null_arr();
        test_NumberAsBits_3_4_empty_arr();
        test_NumberAsBits_3_4_null_inside_arr();
       test_ohad_1_3_isPrime_true();
       test_ohad_1_3_isPrime_false();
        ohadInfra.print_final_report();


    }
}

