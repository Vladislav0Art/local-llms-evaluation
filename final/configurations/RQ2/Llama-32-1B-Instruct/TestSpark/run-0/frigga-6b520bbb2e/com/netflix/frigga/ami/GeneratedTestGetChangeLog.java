package com.netflix.frigga.ami;

public class GeneratedTestGetChangeLog {

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
    public void testGetChangeLog() {
        AppVersion appVersion = new AppVersion();
        assertEquals("First changeset", AppVersionHelper.getChangeLog());
    }
}

public class TestAppVersionClass {
    static public void testPackageVersion() {
        AppVersion appVersion = new AppVersion();
        System.out.println(AppVersionHelper.packageName(appVersion));
    }

    static public void testBuildJobName() {
        AppVersion appVersion = new AppVersion();
        System.out.println(AppVersionHelper.buildJobName(appVersion));
    }

    static public void testCommitMessage() {
        AppVersion appVersion = new AppVersion();
        System.out.println(AppVersionHelper.getCommitMessage());
    }

    static public void testChangeLog() {
        AppVersion appVersion = new AppVersion();
        System.out.println(AppVersionHelper.getChangeLog());
    }
}

}