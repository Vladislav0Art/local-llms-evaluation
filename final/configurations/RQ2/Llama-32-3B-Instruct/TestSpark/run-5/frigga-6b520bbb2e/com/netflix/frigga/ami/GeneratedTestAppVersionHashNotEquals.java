package com.netflix.frigga.ami;

public class GeneratedTestAppVersionHashNotEquals {

    @Test
    public void testAppVersionHashNotEquals() {
        AppVersion appVersion1 = new AppVersion("2.0", "commit1", "buildJobName", "packageName");
        AppVersion appVersion2 = new AppVersion("3.0", "commit2", "buildJobName", "packageName");

        int hash1 = 123;
        int hash2 = 456;

        assertFalse(appVersion1.hashCode() == appVersion2.hashCode());

    }
}

public class AppVersion {
    private String version;
    private String commit;
    private String buildJobName;
    private String packageName;

    public AppVersion(String version, String commit, String buildJobName, String packageName) {
        this.version = version;
        this.commit = commit;
        this.buildJobName = buildJobName;
        this.packageName = packageName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AppVersion appVersion = (AppVersion) o;

        return Objects.equals(version, appVersion.version) &&
                Objects.equals(commit, appVersion.commit) &&
                Objects.equals(buildJobName, appVersion.buildJobName) &&
                Objects.equals(packageName, appVersion.packageName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(version, commit, buildJobName, packageName);
    }

}