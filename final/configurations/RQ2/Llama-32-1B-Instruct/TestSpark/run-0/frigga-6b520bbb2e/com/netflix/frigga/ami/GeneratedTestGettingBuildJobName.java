package com.netflix.frigga.ami;

public class GeneratedTestGettingBuildJobName {

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
    public void testGettingBuildJobName() {
        AppVersion appVersion = new AppVersion();
        assertEquals("build-app", AppVersionHelper.buildJobName(appVersion));
    }

}