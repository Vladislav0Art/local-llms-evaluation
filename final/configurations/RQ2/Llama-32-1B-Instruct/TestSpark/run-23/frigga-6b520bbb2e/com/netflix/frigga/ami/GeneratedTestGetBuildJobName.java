package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestGetBuildJobName {

    @Test
    public void testGetBuildJobName() {
        AppVersion appVersion = new AppVersion();
        assertEquals(NameConstants.AMI_VERSION_PREFIX + "123", appVersion.getBuildJobName());
        Mockito.when(AppVersion.getBuildJobName()).thenReturn(sameString As String);
        assertEquals(sameString As String, appVersion.getBuildJobName());
    }

}