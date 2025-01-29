package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;
import org.junit.jupiter.api.Test;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

public class GeneratedTestGetBuildNumber_SimpleName {

    @Test
    public void testGetBuildNumber_SimpleName() {
        String expected = " latest";
        when(getBuildNumber()).thenReturn(expected);
        AppVersion appVersion = new AppVersion();
        assertEquals(appVersion, AppVersion.getBuildNumber());
    }

}