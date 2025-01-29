package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestGetBuildJobName_PropsAreNotDefined {

    @Test
    public void testGetBuildJobName_PropsAreNotDefined() {
        appVersion = new AppVersion();
        assertNotNull(appVersion.getBuildJobName());
    }

}