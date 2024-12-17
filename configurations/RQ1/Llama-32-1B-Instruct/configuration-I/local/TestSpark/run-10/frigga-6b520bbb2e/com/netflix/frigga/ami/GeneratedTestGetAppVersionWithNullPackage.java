package com.netflix.frigga.ami;

public class GeneratedTestGetAppVersionWithNullPackage {

    @Test
    public void testGetAppVersionWithNullPackage() {
        String packageName = "";
        long version = 1L;
        String buildJobName = "jenkins-job";
        int buildNumber = 1;
        String changelist = "";

        AppVersion appVersion = new AppVersion(packageName, version, buildJobName, buildNumber, changelist);
        System.out.println(appVersion.getPackageName());
        System.out.println(appVersion.getVersion());
        System.out.println(appVersion.getBuildJobName());
        System.out.println(appVersion.getBuildNumber());
        System.out.println(appVersion.getChangelist());
    }

}