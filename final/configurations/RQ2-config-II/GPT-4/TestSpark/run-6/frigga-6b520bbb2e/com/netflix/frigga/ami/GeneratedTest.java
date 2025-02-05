package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void parseNameValidAmiNameTest() {
        AppVersion appVersion = AppVersion.parseName("myapp-1.0.0-h0.abcdefgh");
        assertNotNull(appVersion);
        assertEquals("myapp", appVersion.getPackageName());
        assertEquals("1.0.0", appVersion.getVersion());
        assertEquals("h0.abcdefgh", appVersion.getBuildJobName());
    }

    @Test
    public void parseNameInvalidAmiNameTest() {
        AppVersion.parseName("invalid");
    }

    @Test
    public void getAppVersionPatternTest() {
        assertNotNull(AppVersion.getAppVersionPattern());
    }

    @Test
    public void getPackageNameTest() {
        AppVersion appVersion = AppVersion.parseName("myapp-1.0.0-h0.abcdefgh");
        assertEquals("myapp", appVersion.getPackageName());
    }

    @Test
    public void getVersionTest() {
        AppVersion appVersion = AppVersion.parseName("myapp-1.0.0-h0.abcdefgh");
        assertEquals("1.0.0", appVersion.getVersion());
    }

    @Test
    public void getBuildJobNameTest() {
        AppVersion appVersion = AppVersion.parseName("myapp-1.0.0-h0.abcdefgh");
        assertEquals("h0.abcdefgh", appVersion.getBuildJobName());
    }

    @Test
    public void getBuildNumberTest() {
        AppVersion appVersion = AppVersion.parseName("myapp-1.0.0-h0.32");
        assertEquals("32", appVersion.getBuildNumber());
    }

    @Test
    public void getCommitTest() {
        AppVersion appVersion = AppVersion.parseName("myapp-1.0.0-h0.32.abcdefgh");
        assertEquals("abcdefgh", appVersion.getCommit());
    }

    @Test
    public void getChangelistTest() {
        AppVersion appVersion = AppVersion.parseName("myapp-1.0.0-h0.32.abcdefgh");
        assertEquals("abcdefgh", appVersion.getChangelist());
    }

    @Test
    public void compareToTest() {
        AppVersion appVersion1 = AppVersion.parseName("myapp-1.0.0-h0.32.abcdefgh");
        AppVersion appVersion2 = AppVersion.parseName("myapp-1.0.1-h0.32.abcdefgh");
        assertTrue(appVersion1.compareTo(appVersion2) < 0);
    }

    @Test
    public void equalsSameObjectTest() {
        AppVersion appVersion = AppVersion.parseName("myapp-1.0.0-h0.32.abcdefgh");
        assertTrue(appVersion.equals(appVersion));
    }

    @Test
    public void equalsNullTest() {
        AppVersion appVersion = AppVersion.parseName("myapp-1.0.0-h0.32.abcdefgh");
        assertFalse(appVersion.equals(null));
    }

    @Test
    public void equalsDifferentTypeTest() {
        AppVersion appVersion = AppVersion.parseName("myapp-1.0.0-h0.32.abcdefgh");
        assertFalse(appVersion.equals(new Object()));
    }

    @Test
    public void equalsSameValuesTest() {
        AppVersion appVersion1 = AppVersion.parseName("myapp-1.0.0-h0.32.abcdefgh");
        AppVersion appVersion2 = AppVersion.parseName("myapp-1.0.0-h0.32.abcdefgh");
        assertTrue(appVersion1.equals(appVersion2));
    }

    @Test
    public void hashCodeTest() {
        AppVersion appVersion = AppVersion.parseName("myapp-1.0.0-h0.32.abcdefgh");
        assertEquals(2048147974, appVersion.hashCode());
    }

    @Test
    public void toStringTest() {
        AppVersion appVersion = AppVersion.parseName("myapp-1.0.0-h0.32.abcdefgh");
        assertEquals("AppVersion{packageName='myapp', version='1.0.0', buildJobName='h0', buildNumber='32', commit='abcdefgh'}", appVersion.toString());
    }

}