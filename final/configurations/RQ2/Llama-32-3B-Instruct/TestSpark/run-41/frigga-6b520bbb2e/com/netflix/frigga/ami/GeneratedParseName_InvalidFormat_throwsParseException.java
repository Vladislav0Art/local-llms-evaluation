package com.netflix.frigga.ami;

public class GeneratedParseName_InvalidFormat_throwsParseException {

    private String appName;
    private String version;

    public static AppVersion parseName(String amiName) {
        // implementation
        return new AppVersion(amiName);
    }

    public AppVersion(String appName, String version) {
        this.appName = appName;
        this.version = version;
    }

    public String getPackageName() {
        return appName;
    }

    public String getVersion() {
        return version;
    }
}

public class GeneratedTest {

    @Test
    public void parseName_InvalidFormat_throwsParseException() {
        try {
            AppVersion.parseName("invalid/invalid");
            assert false;
        } catch (Exception e) {
        }
    }

}