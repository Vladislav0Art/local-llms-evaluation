package com.netflix.frigga.ami;

import java.lang.reflect.Method;

public class GeneratedTestGetCommit {

    @Test
    public void testGetCommit() throws Exception {
        TestClass test = new TestClass();
        Method method = test.getClass().getMethod("getCommit");
        AppVersion appVersion = (AppVersion) method.invoke(test);
        assertEquals("ami-abc123", appVersion.getCommit());
    }
}

class TestClass {

    public String parseName(String str) throws Exception {
        return str;
    }

    public String getPackageName() throws Exception {
        return "ami-abc123";
    }

    public String getVersionNumber() throws Exception {
        return "ami-abc123";
    }

    public String getBuildJobName() throws Exception {
        return "ami-abc123";
    }

    public String getCommit() throws Exception {
        return "ami-abc123";
    }

}