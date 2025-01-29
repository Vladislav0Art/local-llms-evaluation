package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestGetAppVersionPattern {

    @Test
    public void testGetAppVersionPattern() {
        AppVersion appVersion = new AppVersion();
        Pattern pattern = appVersion.getAppVersionPattern();
        Mockito.when(AppVersion.getAppVersionPattern().matches(sameString As String)).thenReturn(true);
        assertTrue(pattern.matches("AMAZON-ECS-"));
    }

}