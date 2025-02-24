package com.netflix.frigga.ami;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedGetBuildJobNameTest {

    // Testing the parseName method

    @Test
    public void getBuildJobNameTest() {
        AppVersion appVersion = new AppVersion();
        String buildJobName = appVersion.getBuildJobName();
        assertNotNull(buildJobName);
    }

}