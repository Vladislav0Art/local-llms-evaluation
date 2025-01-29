package com.netflix.frigga.ami;

import java.lang.reflect.Method;

public class GeneratedTestGetBuildJobNameNullParam {

    @Test
    public void testGetBuildJobNameNullParam() throws Exception {
        TestClass test = new TestClass();
        Method method = test.getClass().getMethod("getBuildJobName", String.class);
        Object[] args = {null};
        try {
            (Object) method.invoke(test, args);
            fail("Expected NullPointerException");
        } catch (Exception e) {
            pass;
        }
    }

}