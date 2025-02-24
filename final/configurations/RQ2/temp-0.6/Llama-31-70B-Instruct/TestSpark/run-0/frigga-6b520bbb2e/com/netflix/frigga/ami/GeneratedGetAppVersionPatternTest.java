package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetAppVersionPatternTest {

    @Test
    public void getAppVersionPatternTest() {
        AppVersion appVersion = new AppVersion();
        Pattern appVersionPattern = appVersion.getAppVersionPattern();
        assertNotNull(appVersionPattern);
    }

}