package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestGetVersion_InvalidProp {

    @Test
    public void testGetVersion_InvalidProp() {
        appVersion = new AppVersion();
        assertNull(appVersion.getBuildNumber());
    }

}