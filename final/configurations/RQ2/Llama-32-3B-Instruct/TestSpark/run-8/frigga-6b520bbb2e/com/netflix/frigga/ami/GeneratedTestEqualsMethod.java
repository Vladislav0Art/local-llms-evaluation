package com.netflix.frigga.ami;

public class GeneratedTestEqualsMethod {

    private String version;
    private String buildJobNumber;

    public AppVersion(String version, String buildJobNumber) {
        this.version = version;
        this.buildJobNumber = buildJobNumber;
    }

    public String getVersion() {
        return version;
    }

    public String getBuildJobNumber() {
        return buildJobNumber;
    }
}

public class AppVersionComparator implements Comparator<AppVersion> {

    @Override
    public int compare(AppVersion o1, AppVersion o2) {
        if (o1.getBuildJobNumber().equals(o2.getBuildJobNumber())) {
            return o1.getVersion().compareTo(o2.getVersion());
        } else {
            return o1.getBuildJobNumber().compareTo(o2.getBuildJobNumber());
        }
    }
}

public class TestAppVersion {

    @Test
    public void testEqualsMethod() {
        AppVersion appVersion1 = new AppVersion("test", "build-456");
        AppVersion appVersion2 = new AppVersion("test", "build-456");

        assertTrue(appVersion1.equals(appVersion2));

        appVersion1 = new AppVersion("test", "build-456");
        AppVersion appVersion3 = new AppVersion("test.123", "build-456");

        assertFalse(appVersion1.equals(appVersion3));
    }

}