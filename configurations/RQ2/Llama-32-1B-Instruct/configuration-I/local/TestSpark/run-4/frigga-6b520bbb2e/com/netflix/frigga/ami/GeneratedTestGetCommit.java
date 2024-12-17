package com.netflix.frigga.ami;

public class GeneratedTestGetCommit {

    private static String amiName;

    @Test
    public void TestGetCommit() {
        when(parseName.amiName()).thenReturn("commit1");
        assertEquals("commit1", appVersion.getCommit());
    }

    @BeforeClass
    public static void init() {
        amitest("", "");
    }

    private void amitest(String ami, String version) {
        appVersion = new AppVersion();
        amitest(ami, version);
    }

}