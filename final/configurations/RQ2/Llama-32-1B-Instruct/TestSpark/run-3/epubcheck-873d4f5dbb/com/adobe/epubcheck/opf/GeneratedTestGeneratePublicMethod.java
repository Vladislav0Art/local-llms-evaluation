package com.adobe.epubcheck.opf;

import java.lang.reflect.Method;

public class GeneratedTestGeneratePublicMethod {

    public static int generatePublicMethod(String methodName) throws Exception {
        // implementation of the method
        if (methodName.equals("generatePublicMethod")) {
            return 7;
        } else {
            throw new UnsupportedOperationException();
        }
    }

    public static Object getAssert() throws Exception {
        // implementation of the assert method
        return null;
    }

    public static void main(String[] args) throws Exception {
        System.out.println(generatePublicMethod("generatePublicMethod"));
        Assert.assertEquals(7, (int) generatePublicMethod("testGeneratePublicMethod"));
        Object result = getAssert();
        Assert.assertTrue((boolean) result);
    }
}

public class MockObjectHandlerTest {

    @Test
    public void testGeneratePublicMethod() {
        System.out.println(GeneratedClass.generatePublicMethod("generatePublicMethod"));
    }

}