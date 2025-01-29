package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestToString {

    @Test
    public void testToString() {
        AppVersion appVersion = new AppVersion();
        String expectedString = NameConstants.AMI_VERSION_PREFIX + "123";
        Mockito.when(AppVersion.toString()).thenReturn(expectedString);
        assertEquals(expectedString, appVersion.toString());
    }

}