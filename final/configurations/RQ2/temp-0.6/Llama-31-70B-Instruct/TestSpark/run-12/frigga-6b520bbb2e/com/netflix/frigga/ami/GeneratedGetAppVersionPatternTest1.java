package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedGetAppVersionPatternTest1 {

    @Test
    public void getAppVersionPatternTest1() {
        AppVersion appVersion = new AppVersion();

        Pattern result = appVersion.getAppVersionPattern();

        assertNotNull(result);
    }

}