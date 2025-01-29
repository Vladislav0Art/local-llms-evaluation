package com.netflix.frigga.ami;

import java.lang.reflect.Method;

public class GeneratedTestParseName_NullString {

    @Test
    public void testParseName_NullString() throws Exception {
        TestClass test = new TestClass();
        Method method = test.getClass().getMethod("parseName", String.class);
        AppVersion appVersion = (AppVersion) method.invoke(test, null);
        assertNull(appVersion);
    }

}