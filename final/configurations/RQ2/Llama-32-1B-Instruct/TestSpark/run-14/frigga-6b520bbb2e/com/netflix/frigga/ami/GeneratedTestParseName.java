package com.netflix.frigga.ami;

import java.lang.reflect.Method;

public class GeneratedTestParseName {

    @Test
    public void testParseName() throws Exception {
        TestClass test = new TestClass();
        Method method = test.getClass().getMethod("parseName", String.class);
        Object appVersion = (Object) method.invoke(test, "ami-abc123");
        assertNotNull(appVersion);

        assertEquals("ami-abc123", ((String) appVersion).trim());
    }

}