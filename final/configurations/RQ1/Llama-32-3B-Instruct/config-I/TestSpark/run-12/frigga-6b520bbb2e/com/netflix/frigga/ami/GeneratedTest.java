package com.netflix.frigga.ami;

public class GeneratedTest {

    private String commit;
    private int changelist;
    private String buildNumber;
    private String buildJobName;

    public AppVersion() {
    }

    public void setCommit(String commit) {
        this.commit = commit;
    }

    public void setChangelist(int changelist) {
        this.changelist = changelist;
    }

    public void setBuildNumber(String buildNumber) {
        this.buildNumber = buildNumber;
    }

    public void setBuildJobName(String buildJobName) {
        this.buildJobName = buildJobName;
    }
}

public class AppVersionTest {

    @Test
    public void testAppVersion() {
        AppVersion appVersion = new AppVersion();
        appVersion.setCommit("123");
        appVersion.setChangelist(456);
        appVersion.setBuildNumber("789");
        appVersion.setBuildJobName("abc");

        assertEquals("123", appVersion.getCommit());
        assertEquals(456, appVersion.getChangelist());
        assertEquals("789", appVersion.getBuildNumber());
        assertEquals("abc", appVersion.getBuildJobName());
    }

}