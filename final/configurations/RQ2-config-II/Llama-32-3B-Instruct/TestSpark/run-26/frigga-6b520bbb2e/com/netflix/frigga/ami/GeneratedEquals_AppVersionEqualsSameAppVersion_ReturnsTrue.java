package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedEquals_AppVersionEqualsSameAppVersion_ReturnsTrue {

    @Test
    public void equals_AppVersionEqualsSameAppVersion_ReturnsTrue() {
        AppVersion appVersion1 = new AppVersion("com.netflix.frigga", "1.0", "1234567890");
        AppVersion appVersion2 = new AppVersion("com.netflix.frigga", "1.0", "1234567890");
        assertTrue(appVersion1.equals(appVersion2));
    }

}