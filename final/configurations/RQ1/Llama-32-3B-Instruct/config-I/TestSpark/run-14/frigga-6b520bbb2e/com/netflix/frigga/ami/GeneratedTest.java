package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Public
    public void testParseName_WithValidAppPattern_ReturnsParsedAppVersion() {
        AppVersion parsedName = AppVersion.parseName("subscriberha-1.0.0-586499");
        assertNotNull(parsedName);
        assertEquals("subscriberha", parsedName.getPackageName());
        assertEquals("1.0.0-586499", parsedName.getVersion());
    }

    @Public
    public void testParseName_WithoutValidAppPattern_ReturnsNull() {
        AppVersion parsedName = AppVersion.parseName("subscriberha-abc");
        assertNull(parsedName);
    }

    @Public
    public void testGetPackageName_ForValidAppPattern_ReturnsPackageName() {
        String amiName = "subscriberha-1.0.0-586499";
        AppVersion parsedName = AppVersion.parseName(amiName);
        assertNotNull(parsedName.getPackageName());
        assertEquals("subscriberha", parsedName.getPackageName(), "should be 'subscriberha'");
    }

    @Public
    public void testGetPackageName_ForInvalidAppPattern_ReturnsNull() {
        String amiName = "subscriberha-abc";
        AppVersion parsedName = AppVersion.parseName(amiName);
        assertNull(parsedName.getPackageName());
    }

    @Public
    public void testGetVersion_ForValidAppPattern_ReturnsVersion() {
        String amiName = "subscriberha-1.0.0-586499";
        AppVersion parsedName = AppVersion.parseName(amiName);
        assertNotNull(parsedName.getVersion());
        assertEquals("1.0.0-586499", parsedName.getVersion(), "should be '1.0.0-586499'");
    }

    @Public
    public void testGetVersion_ForInvalidAppPattern_ReturnsNull() {
        String amiName = "subscriberha-abc";
        AppVersion parsedName = AppVersion.parseName(amiName);
        assertNull(parsedName.getVersion());
    }

    @Public
    public void testMultipleCallsToParseName() {
        AppVersion parsedName1 = AppVersion.parseName("subscriberha-1.0.0-586499");
        AppVersion parsedName2 = AppVersion.parseName("subscriberha-1.0.0-586500");
        assertNotNull(parsedName1.getPackageName());
        assertNotNull(parsedName2.getPackageName());
        assertEquals("subscriberha", parsedName1.getPackageName(), "should be 'subscriberha'");
        assertEquals("1.0.0-586500", parsedName2.getVersion(), "should be '1.0.0-586500'");
    }

}