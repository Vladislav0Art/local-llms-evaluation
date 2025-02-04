package com.netflix.frigga.ami;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetBuildNumber_NullReturnsNull {

    @InjectMocks
    private AppVersion appVersion;

    @Mock
    private Pattern appVersionPattern;

    @Test
    public void getBuildNumber_NullReturnsNull() {
        assertNull(appVersion.getBuildNumber());
    }

}