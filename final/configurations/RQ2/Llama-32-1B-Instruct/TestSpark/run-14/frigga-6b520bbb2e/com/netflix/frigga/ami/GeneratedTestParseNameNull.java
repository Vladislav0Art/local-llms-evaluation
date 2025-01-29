package com.netflix.frigga.ami;

import java.lang.reflect.Method;

public class GeneratedTestParseNameNull {

    @Test
    public void testParseNameNull() throws Exception {
        TestClass test = new TestClass();
        Method method = test.getClass().getMethod("parseName", String.class);
        Object appVersion = (Object) method.invoke(test, null);
        assertNotNull(appVersion);

        assertEquals(null, ((String) appVersion).trim());
    }

}