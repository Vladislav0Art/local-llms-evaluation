package com.netflix.frigga.ami;

public class GeneratedTest {

    @Test
    public void testAppVersionHash() {
        AppVersion appVersion1 = new AppVersion("2.0", "commit1", "buildJobName", "packageName");
        AppVersion appVersion2 = new AppVersion("2.0", "commit1", "buildJobName", "packageName");

        int hash1 = appVersion1.hashCode();
        int hash2 = appVersion2.hashCode();

        assertEquals(hash1, hash2);
    }

    @Test
    public void testAppVersionEquals() {
        AppVersion appVersion1 = new AppVersion("2.0", "commit1", "buildJobName", "packageName");
        AppVersion appVersion2 = new AppVersion("2.0", "commit1", "buildJobName", "packageName");

        assertTrue(appVersion1.equals(appVersion2));
    }

    @Test
    public void testAppVersionNotEquals() {
        AppVersion appVersion1 = new AppVersion("2.0", "commit1", "buildJobName", "packageName");
        AppVersion appVersion2 = new AppVersion("2.0", "commit2", "buildJobName", "packageName");

        assertFalse(appVersion1.equals(appVersion2));
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
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof AppVersion))
            return false;
        AppVersion other = (AppVersion) obj;
        return Objects.equals(version, other.version)
                && Objects.equals(commit, other.commit)
                && Objects.equals(buildJobName, other.buildJobName)
                && Objects.equals(packageName, other.packageName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(version, commit, buildJobName, packageName);
    }

    public static class HashCodeComparator implements Comparator<AppVersion> {
        @Override
        public int compare(AppVersion o1, AppVersion o2) {
            int hash1 = o1.hashCode();
            int hash2 = o2.hashCode();

            return Integer.compare(hash1, hash2);
        }
    }
}

public class TestAppVersionUtil {

    public static void main(String[] args) {
        TestAppVersion testAppVersion = new TestAppVersion();
        testAppVersion.testAppVersionHash();
        testAppVersion.testAppVersionEquals();
        testAppVersion.testAppVersionNotEquals();
    }

}