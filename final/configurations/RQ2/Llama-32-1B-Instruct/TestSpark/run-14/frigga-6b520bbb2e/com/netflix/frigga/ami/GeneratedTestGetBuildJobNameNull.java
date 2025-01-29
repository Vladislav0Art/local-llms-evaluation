package com.netflix.frigga.ami;

import java.lang.reflect.Method;

public class GeneratedTestGetBuildJobNameNull {

    @Test
    public void testGetBuildJobNameNull() throws Exception {
        TestClass test = new TestClass();
        Method method = test.getClass().getMethod("getBuildJobName", String.class);
        Object appVersion = (Object) method.invoke(test, null);
        assertNotNull(appVersion);

        assertEquals(null, ((String) appVersion).trim());
    }

}