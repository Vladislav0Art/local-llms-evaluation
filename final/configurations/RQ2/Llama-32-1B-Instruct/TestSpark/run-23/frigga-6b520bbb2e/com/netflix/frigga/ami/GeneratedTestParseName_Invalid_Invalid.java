package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestParseName_Invalid_Invalid {

    @Test
    public void testParseName_Invalid_Invalid() {
        String invalidName = "ami123";
        Mockito.when(AppVersion.parseName.in(sameString As String)).thenReturn(null);
        assertEquals(null, AppVersion.parseName(invalidName).getPackageName());
        assertEquals(null, AppVersion.parseName(invalidName).getVersion());
    }

}