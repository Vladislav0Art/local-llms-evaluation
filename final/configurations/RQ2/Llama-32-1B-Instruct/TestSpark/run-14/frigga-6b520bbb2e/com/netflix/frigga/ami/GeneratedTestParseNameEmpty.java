package com.netflix.frigga.ami;

import java.lang.reflect.Method;

public class GeneratedTestParseNameEmpty {

    @Test
    public void testParseNameEmpty() throws Exception {
        TestClass test = new TestClass();
        Method method = test.getClass().getMethod("parseName", String.class);
        Object appVersion = (Object) method.invoke(test, "");
        assertNotNull(appVersion);

        assertEquals("", ((String) appVersion).trim());
    }

}