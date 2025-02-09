package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class GeneratedTest {

    @Test
    public void parseNameTest() {
        AppVersion appVersion = AppVersion.parseName("myAmiName-mine-1-h123");
        assertEquals("myAmiName", appVersion.getPackageName());
        assertEquals("mine-1-h123", appVersion.getVersion());
    }

    @Test
    public void compareToTest_SameVersions() {
        AppVersion appVersion1 = AppVersion.parseName("myAmiName-mine-1-h123");
        AppVersion appVersion2 = AppVersion.parseName("myAmiName-mine-1-h123");

        assertEquals(0, appVersion1.compareTo(appVersion2));
    }

    @Test
    public void getAppVersionPatternTest() {
        Pattern pattern = AppVersion.getAppVersionPattern();
        Matcher matcher = pattern.matcher("myAmiName-mine-1-h123");
        assertEquals(true, matcher.matches());
    }

    @Test
    public void getPackageNameTest() {
        AppVersion appVersion = AppVersion.parseName("myAmiName-mine-1-h123");
        assertEquals("myAmiName", appVersion.getPackageName());
    }

    @Test
    public void getVersionTest() {
        AppVersion appVersion = AppVersion.parseName("myAmiName-mine-1-h123");
        assertEquals("mine-1-h123", appVersion.getVersion());
    }

    @Test
    public void hashCodeTest() {
        AppVersion appVersion1 = AppVersion.parseName("myAmiName-mine-1-h123");
        AppVersion appVersion2 = AppVersion.parseName("myAmiName-mine-1-h123");
        assertNotEquals(appVersion1.hashCode(), appVersion2.hashCode());
    }

    @Test
    public void equalsTest() {
        AppVersion appVersion1 = AppVersion.parseName("myAmiName-mine-1-h123");
        AppVersion appVersion2 = AppVersion.parseName("myAmiName-mine-1-h123");
        AppVersion appVersion3 = AppVersion.parseName("myAmiName-mine-2-h123");

        assertEquals(true, appVersion1.equals(appVersion2));
        assertEquals(false, appVersion1.equals(appVersion3));
        assertEquals(false, appVersion1.equals(new Object()));
    }

    @Test
    public void toStringTest() {
        AppVersion appVersion = AppVersion.parseName("myAmiName-mine-1-h123");
        assertEquals("AppVersion{myAmiName-mine-1-h123}", appVersion.toString());
    }

}