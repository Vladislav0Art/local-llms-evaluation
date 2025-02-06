package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedGetPackageName_ReturnsPackageName {

    @Test
    public void getPackageName_ReturnsPackageName() {
        AppVersion appVersion = new AppVersion("com.netflix.frigga", "1.0", "1234567890");
        assertEquals("com.netflix.frigga", appVersion.getPackageName());
    }

}