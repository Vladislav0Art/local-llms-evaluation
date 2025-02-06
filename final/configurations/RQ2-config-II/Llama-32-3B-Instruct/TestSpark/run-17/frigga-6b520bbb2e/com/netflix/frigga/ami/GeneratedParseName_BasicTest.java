package com.netflix.frigga.ami;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedParseName_BasicTest {

    @Mock
    private String amiName;

    @Test
    public void parseName_BasicTest() {
        when(AppVersion.parseName(amiName)).thenReturn(new AppVersion("test", "test"));
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertEquals("test", appVersion.getPackageName());
        assertTrue(appVersion.getVersion().matches("\\d+")); // Simple regex to match version number
    }

}