package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import com.netflix.frigga.ami.AppVersion;

public class GeneratedAppVersionPatternTest {

    @Test
    public void appVersionPatternTest() {
        AppVersion appVersion = new AppVersion();
        Pattern actual = appVersion.getAppVersionPattern();
        assertNotNull(actual);
    }

}