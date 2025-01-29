package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestGetBuildNumber {

    @Test
    public void testGetBuildNumber() {
        AppVersion appVersion = new AppVersion();
        assertEquals(NameConstants.AMI_VERSION_PREFIX + "123", appVersion.getBuildNumber());
        Mockito.when(AppVersion.getBuildNumber()).thenReturn(sameString As String);
        assertEquals(sameString As String, appVersion.getBuildNumber());
    }

}