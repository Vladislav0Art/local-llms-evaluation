package com.netflix.frigga.ami;

public class GeneratedTestCompare {

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
    public void testCompare() {
        AppVersion appVersion1 = new AppVersion("test", "build-456");
        AppVersion appVersion2 = new AppVersion("test", "build-789");

        AppVersionComparator comparator = new AppVersionComparator();
        int compareResult = comparator.compare(appVersion1, appVersion2);
        assertEquals(-1, compareResult);

        appVersion1 = new AppVersion("test", "build-456");
        appVersion2 = new AppVersion("test.123", "build-456");

        compareResult = comparator.compare(appVersion1, appVersion2);
        assertEquals(0, compareResult);

        appVersion1 = new AppVersion("test", "build-456");
        appVersion2 = new AppVersion("test", "commit-789");

        compareResult = comparator.compare(appVersion1, appVersion2);
        assertEquals(-1, compareResult);
    }

}