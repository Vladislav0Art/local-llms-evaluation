package com.netflix.frigga.ami;

import java.lang.reflect.Method;

public class GeneratedTestGetVersionNumberNullParam {

    @Test
    public void testGetVersionNumberNullParam() throws Exception {
        TestClass test = new TestClass();
        Method method = test.getClass().getMethod("getVersionNumber", String.class);
        Object[] args = {null};
        try {
            (Object) method.invoke(test, args);
            fail("Expected NullPointerException");
        } catch (Exception e) {
            pass;
        }
    }

}