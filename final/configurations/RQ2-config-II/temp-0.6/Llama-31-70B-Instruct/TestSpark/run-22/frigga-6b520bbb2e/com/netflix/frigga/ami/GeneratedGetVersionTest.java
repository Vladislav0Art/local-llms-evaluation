package com.netflix.frigga.ami;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

public class GeneratedGetVersionTest {

    @Test
    public void getVersionTest() {
        AppVersion appVersion = new AppVersion();
        String expectedVersion = "version";
        when(appVersion.getVersion()).thenReturn(expectedVersion);
        String actualVersion = appVersion.getVersion();
        assertEquals(expectedVersion, actualVersion);
    }

}