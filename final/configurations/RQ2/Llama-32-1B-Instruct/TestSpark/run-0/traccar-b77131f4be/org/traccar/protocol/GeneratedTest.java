package org.traccar.protocol;

import org.junit.Test;

public class GeneratedTest {

    @Test
    public void testPublicMethod() {
        PublicClass obj = new PublicClass();
        System.out.println("Public method result: " + obj.method()); // Output: 0

        AnotherPublicClass anotherObj = new AnotherPublicClass();
        System.out.println("Another public method result: " + anotherObj.method()); // Output: 1
    }
}

class PublicClass {
    public int method() {
        return 0;
    }
}

class AnotherPublicClass extends PublicClass {
    @Override
    public int method() {
        return 1;
    }

}