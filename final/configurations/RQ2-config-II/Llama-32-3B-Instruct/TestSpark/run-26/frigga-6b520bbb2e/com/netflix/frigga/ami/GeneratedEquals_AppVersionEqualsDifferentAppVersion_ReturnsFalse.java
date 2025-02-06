package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedEquals_AppVersionEqualsDifferentAppVersion_ReturnsFalse {

    @Test
    public void equals_AppVersionEqualsDifferentAppVersion_ReturnsFalse() {
        AppVersion appVersion1 = new AppVersion("com.netflix.frigga", "1.0", "1234567890");
        AppVersion appVersion2 = new AppVersion("com.netflix.frigga", "2.0", "9876543210");
        assertFalse(appVersion1.equals(appVersion2));
    }

}