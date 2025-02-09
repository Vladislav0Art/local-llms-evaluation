package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void parseNameGivenNullNameTest() {
        AppVersion result = AppVersion.parseName(null);
        assertNull(result);
    }

    @Test
    public void parseNameGivenNonQualifiedAmiNameTest() {
        AppVersion result = AppVersion.parseName("non-qualified-name");
        assertNull(result);
    }

    @Test
    public void parseNameGivenQualifiedAmiNameTest() {
        AppVersion result = AppVersion.parseName("my-package-0.0.1-h1.b1-abcdef");
        assertNotNull(result);
    }

    @Test
    public void compareToSameInstancesTest() {
        AppVersion version = AppVersion.parseName("my-package-0.0.1-h1.b1-abcdef");
        assertEquals(0, version.compareTo(version));
    }

    @Test
    public void getAppVersionPatternTest() {
        assertNotNull(AppVersion.getAppVersionPattern());
    }

    @Test
    public void getPackageNameTest() {
        AppVersion version = AppVersion.parseName("my-package-0.0.1-h1.b1-abcdef");
        assertEquals("my-package", version.getPackageName());
    }

    @Test
    public void getVersionTest() {
        AppVersion version = AppVersion.parseName("my-package-0.0.1-h1.b1-abcdef");
        assertEquals("0.0.1", version.getVersion());
    }

    @Test
    public void getBuildJobNameTest() {
        AppVersion version = AppVersion.parseName("my-package-0.0.1-h1.b1-abcdef");
        assertEquals("h1.b1", version.getBuildJobName());
    }

    @Test
    public void getBuildNumberTest() {
        AppVersion version = AppVersion.parseName("my-package-0.0.1-h1.b1-abcdef");
        assertNull(version.getBuildNumber());
    }

    @Test
    public void getCommitTest() {
        AppVersion version = AppVersion.parseName("my-package-0.0.1-h1.b1-abcdef");
        assertEquals("abcdef", version.getCommit());
    }

    @Test
    public void getChangelistTest() {
        AppVersion version = AppVersion.parseName("my-package-0.0.1-h1.b1-abcdef");
        assertNull(version.getChangelist());
    }

    @Test
    public void toStringTest() {
        AppVersion version = AppVersion.parseName("my-package-0.0.1-h1.b1-abcdef");
        assertNotNull(version.toString());
    }

    @Test
    public void hashCodeTest() {
        AppVersion version = AppVersion.parseName("my-package-0.0.1-h1.b1-abcdef");
        assertNotNull(version.hashCode());
    }

    @Test
    public void equalsSameInstancesTest() {
        AppVersion version = AppVersion.parseName("my-package-0.0.1-h1.b1-abcdef");
        assertTrue(version.equals(version));
    }

}