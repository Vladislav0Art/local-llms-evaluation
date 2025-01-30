package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void parseNameReturnsNullOnNullInputTest() {
        assertNull(AppVersion.parseName(null));
    }

    @Test
    public void parseNameReturnsNullOnNonMatchedInputTest() {
        assertNull(AppVersion.parseName("invalid.text"));
    }

    @Test
    public void parseNameReturnsCorrectOnMatchedInputTest() {
        String input = "myPackage-1.2.3-586499.h150/WE-WAPP-myPackage/150";
        AppVersion result = AppVersion.parseName(input);
        assertNotNull(result);
        assertEquals("myPackage", result.getPackageName());
        assertEquals("1.2.3", result.getVersion());
        assertEquals("586499", result.getBuildNumber());
        assertEquals("h150", result.getCommit());
        assertEquals("WE-WAPP-myPackage", result.getBuildJobName());
    }

    @Test
    public void compareToSelfReturnsZeroTest() {
        AppVersion app = AppVersion.parseName("myPackage-1.2.3-586499.h150/WE-WAPP-myPackage/150");
        assertEquals(0, app.compareTo(app));
    }

    @Test
    public void compareToNullReturnsPositiveTest() {
        AppVersion app = AppVersion.parseName("myPackage-1.2.3-586499.h150/WE-WAPP-myPackage/150");
        assertEquals(1, app.compareTo(null));
    }

    @Test
    public void getAppVersionPatternTest() {
        assertNotNull(AppVersion.getAppVersionPattern());
    }

    @Test
    public void testToStringTest() {
        AppVersion app = AppVersion.parseName("myPackage-1.2.3-586499.h150/WE-WAPP-myPackage/150");
        assertTrue(app.toString().charAt(0) == 'A');
    }

    @Test
    public void testHashCodeTest() {
        AppVersion app = AppVersion.parseName("myPackage-1.2.3-586499.h150/WE-WAPP-myPackage/150");
        AppVersion app2 = AppVersion.parseName("myPackage-1.2.3-586499.h150/WE-WAPP-myPackage/150");
        assertTrue(app.equals(app2) && app2.equals(app));
        assertTrue(app.hashCode() == app2.hashCode());
    }

    @Test
    public void compareToDiffersOnPackageNameTest() {
        AppVersion app1 = AppVersion.parseName("myPackage1-1.2.3-586499.h150/WE-WAPP-myPackage/150");
        AppVersion app2 = AppVersion.parseName("myPackage2-1.2.3-586499.h150/WE-WAPP-myPackage/150");
        assertNotEquals(0, app1.compareTo(app2));
    }

}