package com.netflix.frigga.ami;

import java.lang.reflect.Method;

public class GeneratedTestGetVersionNumberEmpty {

    @Test
    public void testGetVersionNumberEmpty() throws Exception {
        TestClass test = new TestClass();
        Method method = test.getClass().getMethod("getVersionNumber", String.class);
        Object appVersion = (Object) method.invoke(test, "");
        assertNotNull(appVersion);

        assertEquals("", ((String) appVersion).trim());
    }

}