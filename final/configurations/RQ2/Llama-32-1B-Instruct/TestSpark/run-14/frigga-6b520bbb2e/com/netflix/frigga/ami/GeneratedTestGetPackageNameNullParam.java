package com.netflix.frigga.ami;

import java.lang.reflect.Method;

public class GeneratedTestGetPackageNameNullParam {

    @Test
    public void testGetPackageNameNullParam() throws Exception {
        TestClass test = new TestClass();
        Method method = test.getClass().getMethod("getPackageName", String.class);
        Object[] args = {null};
        try {
            (Object) method.invoke(test, args);
            fail("Expected NullPointerException");
        } catch (Exception e) {
            pass;
        }
    }

}