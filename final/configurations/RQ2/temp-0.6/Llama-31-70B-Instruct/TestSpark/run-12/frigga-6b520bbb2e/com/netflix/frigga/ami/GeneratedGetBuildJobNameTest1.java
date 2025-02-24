package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedGetBuildJobNameTest1 {

    @Test
    public void getBuildJobNameTest1() {
        AppVersion appVersion = new AppVersion();

        String result = appVersion.getBuildJobName();

        assertNotNull(result);
    }

}