package com.netflix.frigga.ami;

public class GeneratedTestPrintMessage {

    @Test
    public void testPrintMessage() {
        PublicClass publicClass = new PublicClass();
        publicClass.printMessage();
    }
}

public class PublicClass {

    public static void printMessage() {
        System.out.println("Hello World");
    }

    public int testPublicMethod() {
        return 0;
    }

    public int getPrivateVariable() {
        return privateVariable;
    }

}