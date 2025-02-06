package com.netflix.frigga.ami;

public class GeneratedTest {


    private AppVersion appVersion;
    private String amiName;

    @Test
    public void parseName_[
    EmptyString]

    Test() {
        amiName = "";
        appVersion = AppVersion.parseName(amiName);
        assert null == appVersion;
    }

    @Test
    public void parseName_[
    ValidString]

    Test() {
        amiName = "1.0";
        appVersion = AppVersion.parseName(amiName);
        assertNotNull(appVersion);
    }

    @Test
    public void compareTo_[
    SameAppVersion]

    Test() {
        appVersion = new AppVersion("1.0");
        AppVersion other = new AppVersion("1.0");
        int result = appVersion.compareTo(other);
        assertEquals(0, result);
    }

    @Test
    public void compareTo_[
    DifferentAppVersion]

    Test() {
        appVersion = new AppVersion("2.0");
        AppVersion other = new AppVersion("1.0");
        int result = appVersion.compareTo(other);
        assertTrue(result < 0);
    }

    @Test
    public void getAppVersionPattern() {
        Pattern pattern = AppVersion.getAppVersionPattern();
        assertNotNull(pattern);
    }

    @Test
    public void getPackageName_[
    AnyString]

    Test() {
        String packageName = "any-name";
        appVersion = new AppVersion(packageName);
        assertEquals(packageName, appVersion.getPackageName());
    }

    @Test
    public void getVersion_[
    AnyString]

    Test() {
        String version = "1.0";
        appVersion = new AppVersion(version);
        assertEquals(version, appVersion.getVersion());
    }

    @Test
    public void getBuildJobName_[
    EmptyString]

    Test() {
        amiName = "";
        appVersion = AppVersion.parseName(amiName);
        assert null == appVersion.getBuildJobName();
    }

    @Test
    public void getBuildNumber_[
    AnyString]

    Test() {
        String buildNumber = "12345";
        appVersion = new AppVersion(buildNumber);
        assertEquals(buildNumber, appVersion.getBuildNumber());
    }

    @Test
    public void getCommit_[
    EmptyString]

    Test() {
        amiName = "";
        appVersion = AppVersion.parseName(amiName);
        assert null == appVersion.getCommit();
    }

    @Test
    public void toString_[
    AnyString]

    Test() {
        String packageName = "any-name";
        String version = "1.0";
        String buildNumber = "12345";
        appVersion = new AppVersion(packageName, version, buildNumber);
        assertNotNull(appVersion.toString());
    }

    @Test
    public void hashCode_[
    SameAppVersion]

    Test() {
        appVersion = new AppVersion("1.0");
        int hash1 = appVersion.hashCode();
        appVersion = new AppVersion("1.0");
        int hash2 = appVersion.hashCode();
        assertEquals(hash1, hash2);
    }

    @Test
    public void equals_[
    SameAppVersion]

    Test() {
        appVersion = new AppVersion("1.0");
        boolean result = appVersion.equals(appVersion);
        assertTrue(result);
    }

}