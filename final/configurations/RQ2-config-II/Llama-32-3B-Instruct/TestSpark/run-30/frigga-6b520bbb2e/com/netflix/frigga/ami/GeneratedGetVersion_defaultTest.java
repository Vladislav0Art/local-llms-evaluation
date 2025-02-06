package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Arrays;

public class GeneratedGetVersion_defaultTest {

    @Test
    public void getVersion_defaultTest() {
        String amiName = "1.0.2-EC2-20210122";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertNotNull(appVersion.getVersion());
    }

}