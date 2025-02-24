package com.netflix.frigga.ami;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetVersionTest {

    @Mock
    AppVersion appVersion;

    @Test
    public void getVersionTest() {
        when(appVersion.getVersion()).thenReturn("1.0.0");
        assertEquals("1.0.0", appVersion.getVersion());
    }

}