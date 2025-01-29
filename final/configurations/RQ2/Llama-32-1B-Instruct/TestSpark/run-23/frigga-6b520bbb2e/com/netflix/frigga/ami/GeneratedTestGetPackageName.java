package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestGetPackageName {

    @Test
    public void testGetPackageName() {
        AppVersion appVersion = new AppVersion();
        assertEquals(NameConstants.AMI_VERSION_PREFIX + "123", appVersion.getPackageName());
        Mockito.when(AppVersion.getPackageName()).thenReturn(sameString As String);
        assertEquals(sameString As String, appVersion.getPackageName());
    }

}