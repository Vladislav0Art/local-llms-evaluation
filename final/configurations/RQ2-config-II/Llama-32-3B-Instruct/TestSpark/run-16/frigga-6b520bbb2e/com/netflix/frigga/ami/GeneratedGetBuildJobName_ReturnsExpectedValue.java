package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedGetBuildJobName_ReturnsExpectedValue {

    @Test
    public void getBuildJobName_ReturnsExpectedValue() {
        AppVersion appVersion = new AppVersion("1.0");
        assertEquals("fregga-3.0.2", appVersion.getBuildJobName());
    }

}