package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestGetBuildNumber_PropsAreNotDefined {

    @Test
    public void testGetBuildNumber_PropsAreNotDefined() {
        appVersion = new AppVersion();
        assertNull(appVersion.getBuildNumber());
    }

}