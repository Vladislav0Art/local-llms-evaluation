package com.netflix.frigga.ami;

public class GeneratedTestGetChangelist {

    public String packageName() {
        return "com.example.app";
    }

    public String buildJobName() {
        return "build-app";
    }

    public String commit() {
        return "1234567890abcdef";
    }

    public String changelist() {
        return "1234567890abcdef";
    }
}

public class AppVersionHelper {
    public static String packageName(AppVersion appVersion) {
        return appVersion.packageName();
    }

    public static String buildJobName(AppVersion appVersion) {
        return appVersion.buildJobName();
    }

    public static String commit(AppVersion appVersion) {
        return appVersion.commit();
    }

    public static String changelist(AppVersion appVersion) {
        return appVersion.changelist();
    }
}

public class TestAppVersion {

    @Test
    public void testGetChangelist() {
        AppVersion appVersion = new AppVersion();
        assertEquals("1234567890abcdef", TestAppVersion.changelist(appVersion));
    }

}