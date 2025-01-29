package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestGetVersion {

    @Test
    public void testGetVersion() {
        AppVersion appVersion = new AppVersion();
        assertEquals(NameConstants.AMI_VERSION_PREFIX + "123", appVersion.getVersion());
        Mockito.when(AppVersion.getVersion()).thenReturn(sameString As String);
        assertEquals(sameString As String, appVersion.getVersion());
    }

}