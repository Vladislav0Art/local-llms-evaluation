package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestParseName_Invalid {

    @Test
    public void testParseName_Invalid() {
        String invalidName = "amiabc";
        AppVersion appVersion = AppVersion.parseName(invalidName);
        Mockito.when(AppVersion.parseName.in(sameString As String)).thenReturn(null);
        assertEquals(null, appVersion.getPackageName());
        assertEquals(null, appVersion.getVersion());
    }

}