package ru.kos.home;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        /*
	Object object = new Object();
	System.out.println(object.toString());

	MyClass myClass = new MyClass();
        System.out.println(myClass.toString());
        System.out.println(myClass.hashCode());
        */

        /*
        MyClass myClass1 = new MyClass();
        System.out.println(myClass1.toString());

        MyClass myClass2 = myClass1;
        System.out.println(myClass2.toString());

        System.out.println(myClass1==myClass2);

        System.out.println(myClass1.equals(myClass2));

        */

        // Массивы
/*
        int[] anArray1 = new int[10];
        int[] anArray2 = {0,1,2,3};
        MyClass[] objArray = new MyClass[5];

        System.out.println(anArray1.toString());
        for (int i= 0; i<anArray1.length;i++) {
            int element = anArray1[i];
            System.out.println(element);
        }
        System.out.println("-------------------------");
        System.out.println(anArray2.toString());
        for (int i= 0; i<anArray2.length;i++) {
            int element = anArray2[i];
            System.out.println(element);
        }
        System.out.println("-------------------------");
        System.out.println(objArray.toString());
        for (int i= 0; i<objArray.length;i++) {
            objArray[i] = new MyClass(i);
        }

        for (int i= 0; i<objArray.length;i++) {
            MyClass element = objArray[i];
            System.out.println(element);
        }
    */
        //-------------------------------------------

        // Строки

        String str = " ja787878VaL";
        String str1 = "";
        System.out.println(str.length());
        System.out.println(str.indexOf("VaL"));
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.isEmpty());
        System.out.println(str1.isEmpty());

        System.out.println("--------------------------");
        String str3 = "abc";
        String str4 = new String (new char[]{'a','b','c'});

        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str3==str4);
        System.out.println(str3.equals(str4));

        System.out.println(str3.contains("bc"));

        System.out.println("a"+"b"+"c");
        str+=str4;
        System.out.println(str);

        String tmp = "";
        for (int i = 0;i<20;i++) {
            tmp +=String.valueOf(i);
        }
        System.out.println(tmp.toString());

        StringBuilder stb = new StringBuilder();
        for (int i = 0;i<20;i++) {
            stb.append(i).append("_");
        }
        System.out.println(stb.toString());


        arraysHelperExample();
    }

    private static void arraysHelperExample() {
        int[] values = new int[]{1,1,2,3,5,8,13};
        System.out.println(Arrays.binarySearch(values, 2));
        System.out.println(Arrays.toString(values));
    }
}
