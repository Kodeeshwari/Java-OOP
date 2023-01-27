package College;

public class helloworld {
    public static void main(String[] args){
        System.out.println("My created first class hello world class");
        System.out.println("   *   \n" +
                " ***** \n" +
                "*******");
        //this is comment
        /* multi line comment*/
        // how to create variables
        String x = "java class";
        int year = 2023;
        double sal = 100.5;
        float num = 10.9f;
        char grade='A';
        boolean status=true;
        System.out.println("String variable " + x);
        System.out.println("current year" + year);
        System.out.println("Dream salary" + sal);
        System.out.println("float number variable " + num);
        System.out.println("my grade" + grade);
        System.out.println("status " + status);

        //this year 2023 and the slaary is 100.5
        System.out.println("Current year is " + year + " my expected dream salary is " + sal+ " and I will get " + grade +" in my java class. It is "+status);




        //byte variable
        byte a = 126;
        System.out.println(a);
        a++;
        System.out.println(a);
        a++;
        System.out.println(a);
        a++;
        System.out.println(a);

        char c = 'G';
        int i = 89;
        byte b = 4;
        short s = 56;
        double d = 4.355453532;
        float f = 4.7333434f;
        long l = 12121;


        System.out.println("char: " + c);
        System.out.println("integer: " + i);
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("long: " + l);

    }
}
