package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedTest {

    public static AppVersion parseName(String amiString) {
        // Implementation
        return new AppVersion();
    }

    public String getPackageName() {
        return "netflix.frigga.ami";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;

        AppVersion appVersion = (AppVersion) obj;

        return true;
    }
}

public class AppVersionTest {

    @Test
    public void parseName_ParsesValidAmiString() {
        String amiName = "1.0-ami-havana";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertNotNull(appVersion);
    }

    @Test
    public void parseName_ParsesInvalidAmiString() {
        String amiName = "invalid-ami-string";
        Mockito.when(AppVersion.parseName(Mockito.anyString())).thenReturn(null);
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertNull(appVersion);
    }

    @Test
    public void parseName_ParsesEmptyAmiString() {
        String amiName = "";
        Mockito.when(AppVersion.parseName(Mockito.anyString())).thenReturn(null);
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertNull(appVersion);
    }

    @Test
    public void getPackageName_ReturnsExpectedValue() {
        String amiName = "1.0-ami-havana";
        AppVersion appVersion = AppVersion.parseName(amiName);
        String packageName = appVersion.getPackageName();
        assertEquals("com.amazonaws.services.ec2", packageName);
    }

    @Test
    public void getVersion_ReturnsExpectedValue() {
        String amiName = "1.0-ami-havana";
        AppVersion appVersion = AppVersion.parseName(amiName);
        String version = appVersion.getVersion();
        assertEquals("1.0", version);
    }

    @Test
    public void getBuildJobName_ReturnsExpectedValue() {
        String amiName = "1.0-ami-havana";
        AppVersion appVersion = AppVersion.parseName(amiName);
        String buildJobName = appVersion.getBuildJobName();
        assertEquals("havana", buildJobName);
    }

    @Test
    public void getBuildNumber_ReturnsExpectedValue() {
        String amiName = "1.0-ami-havana";
        AppVersion appVersion = AppVersion.parseName(amiName);
        String buildNumber = appVersion.getBuildNumber();
        assertEquals("2", buildNumber);
    }

    @Test
    public void getCommit_ReturnsExpectedValue() {
        String amiName = "1.0-ami-havana";
        AppVersion appVersion = AppVersion.parseName(amiName);
        String commit = appVersion.getCommit();
        assertNotNull(commit);
    }

    @Test
    public void getChangelist_ReturnsDeprecatedMethod() {
        String amiName = "1.0-ami-havana";
        AppVersion appVersion = AppVersion.parseName(amiName);
        String changelist = appVersion.getChangelist();
        assertEquals("DEPRECATED", changelist);
    }

    @Test
    public void toString_ReturnsExpectedString() {
        String amiName = "1.0-ami-havana";
        AppVersion appVersion = AppVersion.parseName(amiName);
        String toStringValue = appVersion.toString();
        assertNotNull(toStringValue);
    }

    @Test
    public void hashCode_ReturnsUniqueHashCode() {
        String amiName = "1.0-ami-havana";
        AppVersion appVersion = AppVersion.parseName(amiName);
        int hashcode = appVersion.hashCode();
        assertNotEquals(hashcode, 0);
    }

    @Test
    public void getPackageName_ReturnsExpectedValue() {
        String amiName = "1.0-ami-havana";
        AppVersion appVersion = AppVersion.parseName(amiName);
        String expectedPackage = "netflix.frigga.ami";
        assertEquals(expectedPackage, appVersion.getPackageName());
    }

    @Test
    public void getPackageName_ParsesInvalidAmiString() {
        String amiName = "invalid-ami-string";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertNotEquals("netflix.frigga.ami", appVersion.getPackageName());
    }

}