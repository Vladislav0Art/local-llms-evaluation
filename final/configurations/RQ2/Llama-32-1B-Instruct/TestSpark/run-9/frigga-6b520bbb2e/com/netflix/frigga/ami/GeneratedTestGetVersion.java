package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;
import org.junit.Test;

public class GeneratedTestGetVersion {

    @Test
    public void testGetVersion() {
        // Create a mock for AppVersion and get its version
        AppVersion appVersion = mock(AppVersion.class);
        String expectedVersion = "1.0.0";
        when(appVersion.getVersion()).thenReturn(expectedVersion);
        assertEquals(expectedVersion, appVersion.getVersion());
    }

}