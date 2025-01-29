package com.netflix.frigga.ami;

import java.lang.reflect.Method;

public class GeneratedTestGetPackageName {

    @Test
    public void testGetPackageName() throws Exception {
        TestClass test = new TestClass();
        Method method = test.getClass().getMethod("getPackageName", String.class);
        Object appVersion = (Object) method.invoke(test, "ami-abc123");
        assertNotNull(appVersion);

        assertEquals("ami-abc123", ((String) appVersion).trim());
    }

}