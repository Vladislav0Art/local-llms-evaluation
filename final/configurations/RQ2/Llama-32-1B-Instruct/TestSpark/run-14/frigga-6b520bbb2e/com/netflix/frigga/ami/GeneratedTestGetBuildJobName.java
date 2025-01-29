package com.netflix.frigga.ami;

import java.lang.reflect.Method;

public class GeneratedTestGetBuildJobName {

    @Test
    public void testGetBuildJobName() throws Exception {
        TestClass test = new TestClass();
        Method method = test.getClass().getMethod("getBuildJobName", String.class);
        Object appVersion = (Object) method.invoke(test, "ami-abc123");
        assertNotNull(appVersion);

        assertEquals("ami-abc123", ((String) appVersion).trim());
    }

}