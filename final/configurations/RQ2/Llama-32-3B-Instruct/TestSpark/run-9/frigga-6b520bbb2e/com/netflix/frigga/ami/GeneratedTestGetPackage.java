package com.netflix.frigga.ami;

public class GeneratedTestGetPackage {

    @Test
    public void testGetPackage() {
        AppVersion appVersion = new AppVersion("1.2.3");
        assertEquals("1.2.3", appVersion.getPackageName());
    }
}

public class AppVersion {

    private String packageName;
    private String version;

    public static AppVersion parseName(String amiName) {
        // implementation
        return null;
    }

    public String getPackageName() {
        return packageName;
    }

    public String getVersion() {
        return version;
    }

}