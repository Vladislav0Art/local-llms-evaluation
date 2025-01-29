package com.netflix.frigga.ami;

import java.lang.reflect.Method;

public class GeneratedTestGetVersionNumberNull {

    @Test
    public void testGetVersionNumberNull() throws Exception {
        TestClass test = new TestClass();
        Method method = test.getClass().getMethod("getVersionNumber", String.class);
        Object appVersion = (Object) method.invoke(test, null);
        assertNotNull(appVersion);

        assertEquals(null, ((String) appVersion).trim());
    }

}