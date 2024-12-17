package com.netflix.frigga.ami;

public class GeneratedTestEquals {

    @Test
    public void testEquals() {
        AppVersion appVersion1 = new AppVersion();
        AppVersion appVersion2 = new AppVersion();

        assertFalse(AppVersion.equals(null));
        assertFalse(AppVersion.equals("subscriberha-1.0.0-586499"));
        assertTrue(AppVersion.equals(appVersion1));

        assertFalse(AppVersion.equals(123));
        assertFalse(AppVersion.equals(new Object()));
    }

}