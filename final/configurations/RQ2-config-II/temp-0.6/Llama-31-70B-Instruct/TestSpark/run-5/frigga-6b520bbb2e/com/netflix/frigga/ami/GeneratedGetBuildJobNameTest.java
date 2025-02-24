package com.netflix.frigga.ami;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetBuildJobNameTest {

    @Mock
    AppVersion appVersion;

    @Test
    public void getBuildJobNameTest() {
        when(appVersion.getBuildJobName()).thenReturn("test");
        assertEquals("test", appVersion.getBuildJobName());
    }

}