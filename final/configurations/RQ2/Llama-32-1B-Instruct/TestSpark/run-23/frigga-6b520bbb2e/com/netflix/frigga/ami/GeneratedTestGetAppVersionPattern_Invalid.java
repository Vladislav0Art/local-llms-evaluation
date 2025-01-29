package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestGetAppVersionPattern_Invalid {

    @Test
    public void testGetAppVersionPattern_Invalid() {
        Mockito.when(AppVersion.getAppVersionPattern().matches(sameString As String)).thenReturn(false);
        assertFalse(AppVersion.getAppVersionPattern().matches("AMAZON-ECS-"));
    }

}