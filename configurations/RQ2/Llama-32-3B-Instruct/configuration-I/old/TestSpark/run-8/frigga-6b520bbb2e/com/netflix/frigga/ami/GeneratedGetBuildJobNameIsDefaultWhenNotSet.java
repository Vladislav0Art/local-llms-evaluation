package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedGetBuildJobNameIsDefaultWhenNotSet {

    @Test
    public void getBuildJobNameIsDefaultWhenNotSet() {
        AppVersion appVersion = new AppVersion();
        assertNotNull(appVersion.getBuildJobName());
        assertTrue(appVersion.getBuildJobName().contains("default"));
    }

}