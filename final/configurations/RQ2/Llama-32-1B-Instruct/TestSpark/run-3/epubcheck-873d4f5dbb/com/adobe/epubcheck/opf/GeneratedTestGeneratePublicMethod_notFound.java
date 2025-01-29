package com.adobe.epubcheck.opf;

import java.lang.reflect.Method;

public class GeneratedTestGeneratePublicMethod_notFound {

    public static int generatePublicMethod(String methodName) throws Exception {
        // implementation of the method
        if (methodName.equals("generatePublicMethod")) {
            return 7;
        } else {
            throw new UnsupportedOperationException();
        }
    }

    public static void main(String[] args) throws Exception {
        System.out.println(generatePublicMethod("generatePublicMethod"));
    }
}

public class MockObjectHandlerTest {

    @Test
    public void testGeneratePublicMethod_notFound() throws Exception {
        Method method = GeneratedClass.class.getMethod("generatePublicMethod", String.class);
        Class<?> clazz = GeneratedClass.class;
        Object result = method.invoke(null, "testGeneratePublicMethod");
        Assert.assertEquals(-1, (int) result);
    }

}