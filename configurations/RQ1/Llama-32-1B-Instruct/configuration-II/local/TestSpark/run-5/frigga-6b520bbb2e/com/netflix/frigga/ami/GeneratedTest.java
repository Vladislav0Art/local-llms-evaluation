package com.netflix.frigga.ami;

public class GeneratedTest {

    @Test
    public void testParseName() {
        // Test parsing a valid app version pattern
        String input = "subscriberha-1.0.0-586499";
        AppVersion expected = new AppVersion();
        expected.packageName = "subscriberha";
        expected.version = "1.0.0";
        expected.buildJobName = null;
        expected.buildNumber = null;
        expected.commit = "586499";

        AppVersion actual = AppVersion.parseName(input);
        assertNotEquals(null, actual);
        assertEquals(expected.packageName, actual.packageName);
        assertEquals(expected.version, actual.version);
    }

    @Test
    public void testParseNameInvalidPattern() {
        // Test parsing an app version pattern that is not a valid regex
        String input = "invalid-pattern";
        AppVersion expected = new AppVersion();
        expected.packageName = null;
        expected.version = null;

        AppVersion actual = AppVersion.parseName(input);
        assertNotEquals(expected, actual);
    }

    @Test
    public void testParseNameNoPattern() {
        // Test parsing an app version pattern with no regex
        String input = "subscriberha-1.0.0";
        AppVersion expected = new AppVersion();
        expected.packageName = "subscriberha";
        expected.version = "1.0.0";

        AppVersion actual = AppVersion.parseName(input);
        assertNotEquals(expected, actual);
    }

    @Test
    public void testParseNameNoVersion() {
        // Test parsing an app version pattern with no version
        String input = "subscriberha-586499";
        AppVersion expected = new AppVersion();
        expected.packageName = "subscriberha";
        expected.buildJobName = null;
        expected.buildNumber = null;

        AppVersion actual = AppVersion.parseName(input);
        assertNotEquals(expected, actual);
    }

    @Test
    public void testGetPackageName() {
        // Test getting the package name of an app version pattern with a valid regex
        String input = "subscriberha-1.0.0";
        AppVersion expected = new AppVersion();
        expected.packageName = "subscriberha";

        String actual = AppVersion.getPackageName(input);
        assertEquals(expected.packageName, actual);
    }

    @Test
    public void testGetPackageNames() {
        // Test getting the package names of multiple app version patterns with a valid regex
        String input1 = "subscriberha-1.0.0";
        String input2 = "subscriberha-1.0.0-586499";

        AppVersion expected = new AppVersion();
        expected.packageName = "subscriberha";
        expected.buildJobName = null;
        expected.buildNumber = null;

        AppVersion actual1 = AppVersion.getPackageName(input1);
        assertEquals(expected.packageName, actual1);

        AppVersion actual2 = AppVersion.getPackageName(input2);
        assertEquals(expected.packageName, actual2);
    }

    @Test
    public void testGetVersion() {
        // Test getting the version of an app version pattern with a valid regex
        String input = "subscriberha-1.0.0-586499";
        AppVersion expected = new AppVersion();
        expected.version = "1.0.0";

        String actual = AppVersion.getVersion(input);
        assertEquals(expected.version, actual);
    }

    @Test
    public void testGetVersions() {
        // Test getting the versions of multiple app version patterns with a valid regex
        String input1 = "subscriberha-1.0.0";
        String input2 = "subscriberha-1.0.0-586499";

        AppVersion expected = new AppVersion();
        expected.packageName = "subscriberha";
        expected.buildJobName = null;
        expected.buildNumber = null;

        AppVersion actual1 = AppVersion.getVersion(input1);
        assertEquals(expected.version, actual1);

        AppVersion actual2 = AppVersion.getVersion(input2);
        assertEquals(expected.version, actual2);
    }

    @Test
    public void testGetBuildJobName() {
        // Test getting the build job name of an app version pattern with a valid regex
        String input = "subscriberha-1.0.0-586499";
        AppVersion expected = new AppVersion();
        expected.buildJobName = null;

        String actual = AppVersion.getBuildJobName(input);
        assertEquals(expected.buildJobName, actual);
    }

    @Test
    public void testGetBuildNumbers() {
        // Test getting the build numbers of multiple app version patterns with a valid regex
        String input1 = "subscriberha-1.0.0";
        String input2 = "subscriberha-1.0.0-586499";

        AppVersion expected = new AppVersion();
        expected.buildJobName = null;
        expected.buildNumber = null;

        AppVersion actual1 = AppVersion.getBuildNumber(input1);
        assertEquals(expected.buildNumber, actual1);

        AppVersion actual2 = AppVersion.getBuildNumber(input2);
        assertEquals(expected.buildNumber, actual2);
    }

    @Test
    public void testGetCommit() {
        // Test getting the commit of an app version pattern with a valid regex
        String input = "subscriberha-1.0.0";
        AppVersion expected = new AppVersion();
        expected.commit = "586499";

        String actual = AppVersion.getCommit(input);
        assertEquals(expected.commit, actual);
    }

    @Test
    public void testGetChangelist() {
        // Test getting the changelist of an app version pattern with a valid regex
        String input = "subscriberha-1.0.0";
        AppVersion expected = new AppVersion();
        expected.commit = null;

        String actual = AppVersion.getChangelist(input);
        assertEquals(expected.commit, actual);
    }

    @Test
    public void testToString() {
        // Test the toString method of an app version pattern with a valid regex
        String input = "subscriberha-1.0.0";
        AppVersion expected = new AppVersion();
        expected.packageName = "subscriberha";
        expected.version = "1.0.0";

        String actual = AppVersion.toString(input);
        assertEquals(expected.toString(), actual);
    }

    @Test
    public void testEquals() {
        // Test the equals method of an app version pattern with a valid regex
        String input1 = "subscriberha-1.0.0";
        String input2 = "subscriberha-1.0.0";

        AppVersion expected1 = new AppVersion();
        expected1.packageName = "subscriberha";
        expected1.buildJobName = null;
        expected1.buildNumber = null;

        AppVersion actual1 = AppVersion.getPackageName(input1);
        assertEquals(expected1, actual1);

        AppVersion actual2 = AppVersion.getPackageName(input2);
        assertEquals(expected1, actual2);
    }

}