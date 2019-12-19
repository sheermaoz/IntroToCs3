public  class ohadInfra {

    static int test_counter = 0;
    static int pass_counter = 0;
    static int fail_counter = 0;
    static String tests_failed = "";

    public static void report(String testcase, boolean res) {

        _update_test_counter(testcase,res);
        System.out.println(testcase + ": " + (res ? "ok" : "WRONG !!!! :( "));
    }

    private static void _update_test_counter(String testcase, boolean res)
    {
        test_counter++;
        if (res)
            pass_counter++;
        else
        {
            fail_counter++;
            tests_failed+=testcase;
            tests_failed+=",";
        }
    }


    public static void _print_arr(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
    }

    public  static void print_final_report()
    {
        System.out.println("####################### Summary ################################ ");
        double final_grade = ((double)pass_counter/test_counter)*100;
        System.out.println("your final grade is " + final_grade);
        if(fail_counter!=0) {
            System.out.println("you have failed " + fail_counter);
            System.out.println("you have failed the following tests ");
            System.out.println(tests_failed);
        }

        //_give_verbal_grade(final_grade);


    }

    private static void _give_verbal_grade(double final_grade)
    {
        if (final_grade == 100)
            System.out.println("perfect 100 , you have passed all of the tests");
        if(final_grade >70 && final_grade<100)
            System.out.println("you have failed a few tests");
        if(final_grade<50)
            System.out.println("you have failed most of the tests");
        else
            if(final_grade==0)
                System.out.println("you have failed every possible test.......... be ashamed ");
    }
}
