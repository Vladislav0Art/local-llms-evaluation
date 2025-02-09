package com.netflix.frigga.ami;

public class GeneratedTestAppVersionCreation {

    private int major;
    private int minor;

    public AppVersion(int major, int minor) {
        this.major = major;
        this.minor = minor;
    }

    public static String getChangelist() {
        return "1.0";
    }
}

public class GeneratedTest {

    @Test
    public void testAppVersionCreation() {
        AppVersion version1 = new AppVersion(1, 0);
        AppVersion version2 = new AppVersion(2, 3);

        assertEquals("1.0", AppVersion.getChangelist());
        assertEquals("1.0", AppVersion.getChangelist());
    }

}