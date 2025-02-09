package com.netflix.frigga.ami;

public class GeneratedTestAppVersion {

    private String packageName;
    private int buildNumber;
    private int commitId;
    private String changelist;

    public static class Matcher extends org.junit.jupiter.api.matchers.Matcher<String> {
        private String pattern;

        public Matcher(String pattern) {
            super(pattern);
            this.pattern = pattern;
        }

        @Override
        public boolean matches(String input) {
            return input.matches(this.pattern);
        }
    }

    public AppVersion(String packageName, int buildNumber, int commitId, String changelist) {
        this.packageName = packageName;
        this.buildNumber = buildNumber;
        this.commitId = commitId;
        this.changelist = changelist;
    }

    public static class NameConstants {
        public static final String AMI_APP_NAME = "ami-app";
        public static final String AMI_VERSION = "v1.0.0-1234567890";
        public static final String BUILD_JOB_NAME = "buildJobName";
        public static final int BUILD_NUMBER = 1;
        public static final String COMMIT = "abc123";
    }

    public String getPackageName() {
        return packageName;
    }

    public int getBuildNumber() {
        return buildNumber;
    }

    public int getCommitId() {
        return commitId;
    }

    public String getChangelist() {
        return changelist;
    }

    public static AppVersion createAppVersion(String packageName, int buildNumber, int commitId) {
        return new AppVersion(packageName, buildNumber, commitId, null);
    }
}

public class AppVersionTest {

    @Test
    public void testAppVersion() {
        AppVersion appVersion = AppVersion.createAppVersion(AppVersion.NameConstants.AMI_APP_NAME, AppVersion.NameConstants.BUILD_NUMBER, AppVersion.NameConstants.COMMIT);
        assertEquals(AppVersion.NameConstants.AMI_APP_NAME, appVersion.getPackageName());
        assertEquals(AppVersion.NameConstants.BUILD_NUMBER, appVersion.getBuildNumber());
        assertEquals(AppVersion.NameConstants.COMMIT, appVersion.getCommitId());
        assertNull(appVersion.getChangelist());
    }

}