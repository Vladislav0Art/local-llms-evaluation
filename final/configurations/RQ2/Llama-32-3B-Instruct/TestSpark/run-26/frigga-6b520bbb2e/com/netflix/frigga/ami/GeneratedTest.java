package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void parseName_ValidName_ReturnsParsedAppVersion() {
        String amiName = "1.0-ami.x86_64";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertEquals("1.0", appVersion.getVersion());
        assertEquals("x86_64", appVersion.getBuildJobName());
    }

    @Test
    public void parseName_InvalidName_ThrowsNullPointerException() {
        String amiName = null;
        try {
            AppVersion.parseName(amiName);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            assertEquals(e, null);
        }
    }

    @Test
    public void parseName_EmptyString_ThrowsNullPointerException() {
        String amiName = "";
        try {
            AppVersion.parseName(amiName);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            assertEquals(e, null);
        }
    }

    @Test
    public void parseName_WildcardPattern_ReturnsParsedAppVersionWithWildcard() {
        String amiName = "1.0-ami.x86_64";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertEquals("1.0", appVersion.getVersion());
        assertEquals("x86_64", appVersion.getBuildJobName());
    }

    @Test
    public void compareVersions_LowerVersionReturnsTrue() {
        AppVersion version1 = new AppVersion();
        AppVersion version2 = new AppVersion();

        version1.setVersion("0.9");
        version2.setVersion("1.0");

        assertEquals(true, version1.compareTo(version2));
    }

    @Test
    public void compareVersions_EqualVersionReturnsFalse() {
        AppVersion version1 = new AppVersion();
        AppVersion version2 = new AppVersion();

        version1.setVersion("1.0");
        version2.setVersion("1.0");

        assertEquals(false, version1.compareTo(version2));
    }

    @Test
    public void compareVersions_HigherVersionReturnsTrue() {
        AppVersion version1 = new AppVersion();
        AppVersion version2 = new AppVersion();

        version1.setVersion("1.9");
        version2.setVersion("1.0");

        assertEquals(true, version1.compareTo(version2));
    }

    @Test
    public void getAppVersionPattern_ReturnsCorrectPattern() {
        String pattern = AppVersion.getAppVersionPattern().pattern();
        assertEquals("\\d+\\.\\d+-([a-zA-Z]+)-[a-zA-Z_]+-[0-9]+", pattern);
    }

    @Test
    public void getPackageName_ReturnsCorrectPackageName() {
        String packageName = AppVersion.parseName("1.0-ami.x86_64").getPackageName();
        assertEquals(NameConstants.AMI_PACKAGE, packageName);
    }

    @Test
    public void getVersion_ReturnsCorrectVersion() {
        String version = new AppVersion().getVersion();
        assertEquals("", version);
    }

    @Test
    public void getBuildJobName_ReturnsCorrectBuildJobName() {
        String buildJobName = new AppVersion().getBuildJobName();
        assertEquals("x86_64", buildJobName);
    }

    @Test
    public void getBuildNumber_ReturnsCorrectBuildNumber() {
        String buildNumber = new AppVersion().getBuildNumber();
        assertEquals("", buildNumber);
    }

    @Test
    public void getCommit_ReturnsCorrectCommit() {
        String commit = new AppVersion().getCommit();
        assertEquals("Commit", commit);
    }

}