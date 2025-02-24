package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import com.netflix.frigga.ami.AppVersion;

public class GeneratedBuildJobNameTest {

    @Test
    public void buildJobNameTest() {
        AppVersion appVersion = new AppVersion();
        String actual = appVersion.getBuildJobName();
        assertNotNull(actual);
    }

}