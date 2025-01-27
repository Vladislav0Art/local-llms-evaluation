package com.netflix.frigga.ami;

public class GeneratedTest {

    private static final String APP_VERSION = "1.0.0";
    private static final Pattern PATTERN = Pattern.compile("\\d+\\.\\d+\\.\\d+-[a-zA-Z0-9]+");

    public AppVersion() {
    }

    public static AppVersion parseName(String amiName) {
        return new AppVersion(PATTERN.matcher(amiName).find() ? amiName : null);
    }

    public String getPackage() {
        return APP_VERSION;
    }

    public String getVersion() {
        return APP_VERSION;
    }

    public String getBuildJobName() {
        return "build-job-" + APP_VERSION;
    }

    public String getBuildNumber() {
        return APP_VERSION.split("-")[0];
    }

    public String getCommit() {
        return APP_VERSION.split("-")[1].split("\\.")[0];
    }
}

class AppVersionTest {

    @Test
    public void parseNameValidAmiName_ReturnsAppVersion() {
        String amiName = "1.0.0-1234567890";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertNotNull(appVersion);
    }

    @Test
    public void parseNameInvalidAmiName_ThrowsNullPointerException() {
        String amiName = " invalid ";
        try {
            AppVersion.parseName(amiName);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void getAppVersionPattern() {
        Pattern pattern = AppVersion.getAppVersionPattern();
        assertTrue(pattern != null);
        assertTrue(pattern.matcher("1.0.0-1234567890").find());
    }

}