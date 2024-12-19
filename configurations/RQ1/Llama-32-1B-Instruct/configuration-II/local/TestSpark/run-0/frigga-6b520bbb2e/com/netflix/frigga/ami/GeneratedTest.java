package com.netflix.frigga.ami;

public class GeneratedTest {

    @Test
    public void testParseName() {
        AppVersion version = new AppVersion();
        String amiName = "subscriberha-1.0.0-586499";
        AppVersion parsedVersion = AppVersion.parseName(amiName);
        assertEquals("subscriberha", parsedVersion.packageName);
        assertEquals("1.0.0", parsedVersion.version);
    }

    @Test
    public void testParseName_InvalidPattern() {
        String amiName = "invalid-pattern";
        AppVersion version = AppVersion.parseName(amiName);
        assertNull(version);
    }

    @Test
    public void testNull

    amiName() {
        AppVersion version = new AppVersion();
        assertNull(version.getPackageVersion());
    }

    @Test
    public void testParseName_CommitIdAfterBuildNumber() {
        String buildJobName = "build-job-name";
        String commit = "12345";
        AppVersion parsedVersion = AppVersion.parseName("subscriberha-1.0.0-" + buildJobName + "-" + commit);
        assertEquals(buildJobName, parsedVersion.getBuildJobName());
        assertEquals(commit, parsedVersion.getCommit());
    }

    @Test
    public void testParseName_HistoricVersion() {
        String buildJobName = "build-job-name";
        String version = "h1.0.0-586499";
        AppVersion parsedVersion = AppVersion.parseName("subscriberha-" + version);
        assertEquals(buildJobName, parsedVersion.getBuildJobName());
        assertEquals(version, parsedVersion.getVersion());
    }

    @Test
    public void testParseName_RPMPackage() {
        String buildJobName = "build-job-name";
        String packageVersion = "1.0.0-586499";
        AppVersion parsedVersion = AppVersion.parseName("subscriberha-" + packageVersion);
        assertEquals(buildJobName, parsedVersion.getBuildJobName());
        assertEquals(packageVersion, parsedVersion.getVersion());
    }

    @Test
    public void testParseName_JenkinsChangelist() {
        String buildJobName = "build-job-name";
        String commit = "12345";
        AppVersion parsedVersion = AppVersion.parseName("subscriberha-1.0.0-" + buildJobName + "-" + commit);
        assertEquals(buildJobName, parsedVersion.getBuildJobName());
        assertEquals(commit, parsedVersion.getCommit());
    }

    @Test
    public void testEquals() {
        String buildJobName = "build-job-name";
        String packageVersion = "1.0.0-586499";
        AppVersion version1 = new AppVersion();
        AppVersion version2 = new AppVersion(buildJobName, packageVersion);
        assertTrue(AppVersion.equals(version1, version2));
    }

    @Test
    public void testHashCode() {
        String buildJobName = "build-job-name";
        String packageVersion = "1.0.0-586499";
        AppVersion version1 = new AppVersion();
        AppVersion version2 = new AppVersion(buildJobName, packageVersion);
        assertEquals(AppVersion.hashCode(), version1.hashCode());
    }

}