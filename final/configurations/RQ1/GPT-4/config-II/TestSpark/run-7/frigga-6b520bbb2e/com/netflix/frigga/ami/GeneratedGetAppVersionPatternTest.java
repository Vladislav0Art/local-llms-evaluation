package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class GeneratedGetAppVersionPatternTest {

    @Test
    public void getAppVersionPatternTest() {
        assertEquals(AppVersion.APP_VERSION_PATTERN, AppVersion.getAppVersionPattern());
    }

}