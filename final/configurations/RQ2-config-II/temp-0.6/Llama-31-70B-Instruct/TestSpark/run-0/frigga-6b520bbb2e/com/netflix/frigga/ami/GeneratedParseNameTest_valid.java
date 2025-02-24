package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedParseNameTest_valid {

    @Test
    public void parseNameTest_valid() {
        AppVersion appVersion = AppVersion.parseName("valid");
        assertEquals(appVersion.getChangelist(), "");
    }

}