package org.traccar.protocol;

import java.nio.ByteBuffer;
import java.util.Arrays;

public class GeneratedTestGetTestDataSize {

    public static void main(String[] args) {
        public MethodA methodA = new MethodA();
        public MethodB methodB = new MethodB();

        System.out.println(methodA.getTestData().substring(0, 10));
        System.out.println(methodB.getTestData());
    }

    @Test
    public void testGetTestDataSize() throws Exception {
        // Assuming you have a class with getTestData()
        String[] testData = methodA.getTestData();
        if (testData == null || Arrays.asList(testData).isEmpty()) {
            fail("getTestData returned null or empty.");
        } else {
            System.out.println(testData.length());
        }
    }

}