package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void parseNameValidNameTest() {
        String validAmiName = "baseos-packagebase-0.0.4-h12.18121234";
        AppVersion appVersion = AppVersion.parseName(validAmiName);
        assertNotNull(appVersion);
        assertEquals("baseos", appVersion.getPackageName());
        assertEquals("0.0.4", appVersion.getVersion());
    }

    @Test
    public void parseNameInValidNameTest() {
        String invalidAmiName = "invalid-ami-name";
        AppVersion.parseName(invalidAmiName);
    }

    @Test
    public void compareToTest() {
        AppVersion appVersion1 = AppVersion.parseName("baseos-packagebase-0.0.4-h12.18121234");
        AppVersion appVersion2 = AppVersion.parseName("baseos-packagebase-0.0.6-h14.18141516");
        assertTrue(appVersion1.compareTo(appVersion2) < 0);
    }

    @Test
    public void getAppVersionPatternTest() {
        assertTrue(AppVersion.getAppVersionPattern() instanceof Pattern);
    }

    @Test
    public void hashCodeTest() {
        AppVersion appVersion1 = AppVersion.parseName("baseos-packagebase-0.0.4-h12.18121234");
        AppVersion appVersion2 = AppVersion.parseName("baseos-packagebase-0.0.4-h12.18121234");
        assertEquals(appVersion1.hashCode(), appVersion2.hashCode());
    }

    @Test
    public void equalsTest() {
        AppVersion appVersion1 = AppVersion.parseName("baseos-packagebase-0.0.4-h12.18121234");
        AppVersion appVersion2 = AppVersion.parseName("baseos-packagebase-0.0.4-h12.18121234");
        assertTrue(appVersion1.equals(appVersion2));
    }

    @Test
    public void toStringTest() {
        String amiName = "baseos-packagebase-0.0.4-h12.18121234";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertEquals(amiName, appVersion.toString());
    }

}