package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.regex.Pattern;

public class GeneratedGetAppVersionPattern_CorrectPatternTest {

    @Test
    public void getAppVersionPattern_CorrectPatternTest() {
        Pattern pattern = AppVersion.getAppVersionPattern();
        assertNotNull(pattern);
        assertTrue(pattern.matcher("1.0.2-20180808T1439Z").matches());
    }

}