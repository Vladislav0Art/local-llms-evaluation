package com.netflix.frigga.ami;

public class GeneratedTestGetAppVersionWithNullPackageAndVersionAndBuildNumberAndChangelist {

    @Test
    public void testGetAppVersionWithNullPackageAndVersionAndBuildNumberAndChangelist() {
        String packageName = "";
        long version = 1L;
        String buildJobName = "jenkins-job";
        int buildNumber = null;
        String changelist = "";

        AppVersion appVersion = new AppVersion(packageName, version, buildJobName, buildNumber, changelist);
        System.out.println(appVersion.getPackageName());
        System.out.println(appVersion.getVersion());
        System.out.println(appVersion.getBuildJobName());
        System.out.println(appVersion.getBuildNumber());
        System.out.println(appVersion.getChangelist());
    }

}