package com.netflix.frigga.ami;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedGetAppVersionPatternTest {

    private AppVersion appVersion;

    @Test
    public void getAppVersionPatternTest() {
        Pattern expectedPattern = Pattern.compile("");

        Pattern actualPattern = AppVersion.getAppVersionPattern();

        assertEquals(expectedPattern, actualPattern);
    }

}