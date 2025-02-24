package com.netflix.frigga.ami;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

public class GeneratedGetAppVersionPatternTest {

    @Test
    public void getAppVersionPatternTest() {
        AppVersion appVersion = new AppVersion();
        Pattern expectedPattern = Mockito.mock(Pattern.class);
        when(appVersion.getAppVersionPattern()).thenReturn(expectedPattern);
        Pattern actualPattern = appVersion.getAppVersionPattern();
        assertEquals(expectedPattern, actualPattern);
    }

}