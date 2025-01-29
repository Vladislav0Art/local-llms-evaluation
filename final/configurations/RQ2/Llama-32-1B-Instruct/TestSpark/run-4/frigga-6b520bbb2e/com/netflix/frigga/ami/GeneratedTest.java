package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedTest {

    @Test
    public void [AppVersion][Scenario]

    testParseName() {
        AppVersion appVersion = AppVersion.parseName("ami-abc123");
        Assert.assertTrue(appVersion != null);
        Assert.assertEquals(NameConstants.AMI_NAME, appVersion.getPackageName());
        Assert.assertEquals("abc", appVersion.getVersion());
    }

    @Test
    public void [AppVersion][Scenario]

    testParseNameNotFound() {
        AppVersion appVersion = AppVersion.parseName("ami-fgh789");
        Assert.assertTrue(appVersion == null);
    }

    @Test
    public void [AppVersion][Scenario]

    testGetPackageName() {
        AppVersion appVersion = new AppVersion();
        appVersion.setPackageName("example-123");
        Assert.assertEquals("example", appVersion.getPackageName());
    }

    @Test
    public void [AppVersion][Scenario]

    testGetVersion() {
        AppVersion appVersion = new AppVersion();
        appVersion.setVersion("1.0.0");
        Assert.assertEquals("1.0.0", appVersion.getVersion());
    }

    @Test
    public void [AppVersion][Scenario]

    testGetBuildJobName() {
        AppVersion appVersion = new AppVersion();
        appVersion.setBuildJobName("build-job-123");
        Assert.assertEquals("build-job-123", appVersion.getBuildJobName());
    }

    @Test
    public void [AppVersion][Scenario]

    testGetBuildNumber() {
        AppVersion appVersion = new AppVersion();
        appVersion.setBuildNumber("2023-02-15T12:00:01.000Z");
        Assert.assertEquals(2023, appVersion.getBuildNumber().length());
    }

    @Test
    public void [AppVersion][Scenario]

    testGetCommit() {
        AppVersion appVersion = new AppVersion();
        appVersion.setCommit("abc123");
        Assert.assertEquals("abc123", appVersion.getCommit());
    }

    @Test
    public void [AppVersion][Scenario]

    testGetChangelist() {
        // Currently deprecated, no need to test this method
        // System.out.println(AppVersion.getChangelist());
    }

    @Test
    public void [AppVersion][Scenario]

    testToString() {
        AppVersion appVersion = new AppVersion();
        String expected = "ami-abc123";
        Assert.assertEquals(expected, appVersion.toString());
    }

    @Test
    public void [AppVersion][Scenario]

    testGetHashCode() {
        AppVersion appVersion = new AppVersion();
        int hashCode = appVersion.hashCode();
        Assert.assertTrue(hashCode >= 0);
    }

}