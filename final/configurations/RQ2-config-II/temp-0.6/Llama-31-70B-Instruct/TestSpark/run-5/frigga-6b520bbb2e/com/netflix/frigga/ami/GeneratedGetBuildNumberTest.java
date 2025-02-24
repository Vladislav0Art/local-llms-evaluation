package com.netflix.frigga.ami;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetBuildNumberTest {

    @Mock
    AppVersion appVersion;

    @Test
    public void getBuildNumberTest() {
        when(appVersion.getBuildNumber()).thenReturn("1");
        assertEquals("1", appVersion.getBuildNumber());
    }

}