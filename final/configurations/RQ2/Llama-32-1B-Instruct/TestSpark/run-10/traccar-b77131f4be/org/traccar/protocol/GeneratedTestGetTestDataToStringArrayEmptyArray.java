package org.traccar.protocol;

import java.nio.ByteBuffer;
import java.util.Arrays;

public class GeneratedTestGetTestDataToStringArrayEmptyArray {

    public static void main(String[] args) {
        public MethodA methodA = new MethodA();
        public MethodB methodB = new MethodB();

        System.out.println(methodA.getTestData().substring(0, 10));
        System.out.println(methodB.getTestData());
    }

    @Test
    public void testGetTestDataToStringArrayEmptyArray() throws Exception {
        // Assuming you have a class with getTestData()
        String[] testData = methodA.getTestData();
        if (testData != null && Arrays.asList(testData).size() > 0) {
            fail("getTestData returned non-null array.");
        } else {
            System.out.println(null);
        }
    }

    public static String[] getTestData() throws Exception {
        return Arrays.asList(methodA.getTestData());
    }

    public static int[] getTestDataInt() throws Exception {
        return methodA.getTestData();
    }

    public static long[] getTestDataLong() throws Exception {
        return methodA.getTestData();
    }
}

class MethodA {
    private byte[] testData;

    public byte[] getTestData() {
        if (testData == null) {
            throw new IllegalStateException("getTestData is not called yet");
        } else {
            return testData;
        }
    }

    public int[] getTestDataInt() {
        if (testData == null) {
            throw new IllegalStateException("getTestData is not called yet");
        } else {
            byte[] bytes = Arrays.copyOf(testData, testData.length);
            return Arrays.stream(bytes).mapToLong(b -> b & 0xFF).toArray();
        }
    }

    public long[] getTestDataLong() {
        if (testData == null) {
            throw new IllegalStateException("getTestData is not called yet");
        } else {
            byte[] bytes = Arrays.copyOf(testData, testData.length);
            return Arrays.stream(bytes).mapToLong(b -> b & 0xFFFFFFFFFFFFFFFFL).toArray();
        }
    }

    public void testMethod() throws Exception {
        System.out.println(getTestData());
    }

}