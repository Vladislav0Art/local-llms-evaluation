package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void test_parseName() {
        AppVersion appVersion = new AppVersion();
        String expectedAmzn = "ami-abc123";
        Matcher matcher = Pattern.compile("([A-Z]+)(.*)").matcher(appVersion.getPackage());
        assertEquals(1, matcher.findIndex());
        assertEquals("ami", matcher.group(1));
        assertEquals("abc123", matcher.group(2));
    }

    @Test
    public void test_getPackageName() {
        AppVersion appVersion = new AppVersion();
        String expectedAmzn = "ami-abc123";
        assertEquals(NameConstants.AMI_NAME.toLowerCase(), appVersion.getPackage());
    }

    @Test
    public void test_getVersion() {
        AppVersion appVersion = new AppVersion();
        String version = appVersion.getVersion();
        assertEquals("1.0.0", version);
    }

    @Test
    public void test_getBuildJobName() {
        AppVersion appVersion = new AppVersion();
        String expectedAmzn = "ami-abc123";
        assertEquals(NameConstants.AMI_BUILD_JOB_NAME.toLowerCase(), appVersion.getBuildJobName());
    }

    @Test
    public void test_getBuildNumber() {
        AppVersion appVersion = new AppVersion();
        String buildNumber = appVersion.getBuildNumber();
        assertEquals("1", buildNumber);
    }

    @Test
    public void test_getCommit() {
        AppVersion appVersion = new AppVersion();
        String commit = appVersion.getCommit();
        assertEquals(NameConstants.AMI_COMMIT.toLowerCase(), commit);
    }

    @Test
    public void test_getChangelist() {
        AppVersion appVersion = new AppVersion();
        String changelist = appVersion.getChangelist();
        assertEquals(null, changelist);
    }

    @Test
    public void testToString() {
        AppVersion appVersion = new AppVersion();
        String expectedAmzn = "ami-abc123";
        assertEquals(NameConstants.AMI_NAME + "-" + NameConstants.AMI_BUILD_JOB_NAME + "-" + NameConstants.AMI_BUILD_NUMBER + "-" + NameConstants.AMI_COMMIT, appVersion.toString());
    }

    @Test
    public void test_hashCode() {
        AppVersion appVersion = new AppVersion();
        int hashcode = appVersion.hashCode();
        assertEquals(0, hashcode);
    }

    @Test
    public void test_equals() {
        AppVersion appVersion1 = new AppVersion();
        AppVersion appVersion2 = new AppVersion();

        // Test for equals with different package names
        assertTrue(appVersion1.equals("ami-abc123"));
        assertFalse(appVersion1.equals("ami-bc123"));

        // Test for equals with same package name and version
        assertEquals(appVersion1, appVersion2);

        // Test for equals with different packages
        assertEquals(appVersion2, appVersion1);
    }

}