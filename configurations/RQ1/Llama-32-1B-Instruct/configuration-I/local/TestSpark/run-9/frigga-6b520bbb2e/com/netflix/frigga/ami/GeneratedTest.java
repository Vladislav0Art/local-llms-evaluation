package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GeneratedTest {

    private AppVersion appVersion;

    @BeforeEach
    public void setup() {
        appVersion = new AppVersion();
    }

    @Test
    public void testParseName_Simple() {
        String amiName = "subscriberha-1.0.0-586499";
        appVersion = AppVersion.parseName(amiName);
        assertEquals("subscriberha-1.0.0-586499", appVersion.getPackageName());
        assertEquals(" subscriberha-1.0.0-586499", appVersion.getVersion());
    }

    @Test
    public void testParseName_MultiplePatterns() {
        String amiName = "subscriberha-1.0.0-586499.h150";
        appVersion = AppVersion.parseName(amiName);
        assertEquals("subscriberha-1.0.0-586499", appVersion.getPackageName());
        assertEquals(" subscriberha-1.0.0-586499", appVersion.getVersion());
    }

    @Test
    public void testParseName_EmptyString() {
        String amiName = "";
        try {
            AppVersion.parseName(amiName);
            fail("Expected exception not thrown");
        } catch (Exception e) {
            // expected
        }
    }

    @Test
    public void testParseName_NonExistentPattern() {
        String amiName = "subscriberha-1.0.0-586499-123456";
        appVersion = AppVersion.parseName(amiName);
        fail("Expected exception not thrown");
    }

    @Test
    public void testGetPackageName_NestedProperties() {
        appVersion = new AppVersion();
        appVersion.setChangelist("changelist", "value");
        assertEquals("subscriberha-1.0.0-586499-changelist=value", appVersion.getPackageName());
    }

    @Test
    public void testGetPackageName_WithoutNestedProperties() {
        appVersion = new AppVersion();
        assertEquals("subscriberha-1.0.0-586499", appVersion.getPackageName());
    }

    @Test
    public void testGetBuildJobName_NestedProperties() {
        appVersion = new AppVersion();
        appVersion.setChangelist("changelist", "value");
        assertEquals("jenkins job=changelist=value", appVersion.getBuildJobName());
    }

    @Test
    public void testGetBuildJobName_WithoutNestedProperties() {
        appVersion = new AppVersion();
        assertEquals("jenkins job=", appVersion.getBuildJobName());
    }

    @Test
    public void testGetBuildNumber_NestedProperties() {
        appVersion = new AppVersion();
        appVersion.setChangelist("changelist", "value");
        assertEquals("jenkins build number=changelist=value", appVersion.getBuildNumber());
    }

    @Test
    public void testGetBuildNumber_WithoutNestedProperties() {
        appVersion = new AppVersion();
        assertEquals("jenkins build number=", appVersion.getBuildNumber());
    }

    @Test
    public void testGetCommit_NestedProperties() {
        appVersion = new AppVersion();
        appVersion.setChangelist("changelist", "value");
        assertEquals("jenkins commit=changelist=value", appVersion.getCommit());
    }

    @Test
    public void testGetCommit_WithoutNestedProperties() {
        appVersion = new AppVersion();
        assertEquals("jenkins commit=", appVersion.getCommit());
    }

    @Test
    public void testToString_NestedProperties() {
        appVersion = new AppVersion();
        appVersion.setChangelist("changelist", "value");
        assertEquals("AppVersion [packageName=subscriberha-1.0.0-586499, version=changelist=value, buildJobName=jenkins job=changelist=value, buildNumber=jenkins commit=changelist=value]", appVersion.toString());
    }

    @Test
    public void testToString_WithoutNestedProperties() {
        appVersion = new AppVersion();
        assertEquals("AppVersion [packageName=subscriberha-1.0.0-586499, version=changelist=value, buildJobName=jenkins job=changelist=value, buildNumber=jenkins commit=changelist=value]", appVersion.toString());
    }

    @Test
    public void testEquals_NestedProperties() {
        AppVersion other = new AppVersion();
        other.setChangelist("changelist", "value");
        other.setBuildJobName("jenkins job=changelist=value", "buildNumber=jenkins commit=changelist=value");
        assertEquals(other, appVersion);
    }

    @Test
    public void testEquals_WithoutNestedProperties() {
        AppVersion other = new AppVersion();
        other.setChangelist("changelist", "value");
        assertEquals(appVersion, other);
    }

}