package com.netflix.frigga.ami;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetBuildJobName_ReturnsBuildJobName {

    @InjectMocks
    private AppVersion appVersion;

    @Mock
    private Pattern appVersionPattern;

    @Test
    public void getBuildJobName_ReturnsBuildJobName() {
        appVersion.buildJobName = "a";
        assertEquals("a", appVersion.getBuildJobName());
    }

}