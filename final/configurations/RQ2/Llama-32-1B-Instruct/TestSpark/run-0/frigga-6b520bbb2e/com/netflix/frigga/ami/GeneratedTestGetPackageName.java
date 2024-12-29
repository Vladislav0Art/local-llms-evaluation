package com.netflix.frigga.ami;

public class GeneratedTestGetPackageName {

    static public String packageName(AppVersion appVersion) {
        return appVersion.getPackageName();
    }

    static public String buildJobName(AppVersion appVersion) {
        return appVersion.getBuildJobName();
    }

    static public String getCommitMessage() {
        return "Initial commit";
    }

    static public String getChangeLog() {
        return "First changeset";
    }
}

public class TestAppVersion {

    @Test
    public void testGetPackageName() {
        AppVersion appVersion = new AppVersion();
        assertEquals("com.example.app", AppVersionHelper.packageName(appVersion));
    }

}