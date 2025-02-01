package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetAppVersionPatternTest {

    @Test
    public void getAppVersionPatternTest() {
        String expectedPattern = "pattern";
        assertEquals(expectedPattern, AppVersion.getAppVersionPattern().pattern());
    }

}