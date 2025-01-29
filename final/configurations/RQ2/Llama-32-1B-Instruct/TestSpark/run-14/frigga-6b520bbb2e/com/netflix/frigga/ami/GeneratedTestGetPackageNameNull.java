package com.netflix.frigga.ami;

import java.lang.reflect.Method;

public class GeneratedTestGetPackageNameNull {

    @Test
    public void testGetPackageNameNull() throws Exception {
        TestClass test = new TestClass();
        Method method = test.getClass().getMethod("getPackageName", String.class);
        Object appVersion = (Object) method.invoke(test, null);
        assertNotNull(appVersion);

        assertEquals(null, ((String) appVersion).trim());
    }

}