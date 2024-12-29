package com.netflix.frigga.ami;

public class GeneratedTestGetCommitMessage {

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
    public void testGetCommitMessage() {
        AppVersion appVersion = new AppVersion();
        assertEquals("Initial commit", AppVersionHelper.getCommitMessage());
    }

}