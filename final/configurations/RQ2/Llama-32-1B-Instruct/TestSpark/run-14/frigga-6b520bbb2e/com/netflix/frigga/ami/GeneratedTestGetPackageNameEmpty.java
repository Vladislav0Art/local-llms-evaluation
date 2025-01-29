package com.netflix.frigga.ami;

import java.lang.reflect.Method;

public class GeneratedTestGetPackageNameEmpty {

    @Test
    public void testGetPackageNameEmpty() throws Exception {
        TestClass test = new TestClass();
        Method method = test.getClass().getMethod("getPackageName", String.class);
        Object appVersion = (Object) method.invoke(test, "");
        assertNotNull(appVersion);

        assertEquals("", ((String) appVersion).trim());
    }

}