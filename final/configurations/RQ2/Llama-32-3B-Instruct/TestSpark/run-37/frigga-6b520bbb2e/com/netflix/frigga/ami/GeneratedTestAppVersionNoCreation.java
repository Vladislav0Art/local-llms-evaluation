package com.netflix.frigga.ami;

public class GeneratedTestAppVersionNoCreation {

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
    public void testAppVersionNoCreation() {
        AppVersion version1 = new AppVersion(1, 0);
        AppVersion version2 = new AppVersion(1, 0);

        String changelist = AppVersion.getChangelist();
        assertTrue(changelist.contains("1.0"));
        assertTrue(changelist.contains("1.0"));
    }

}