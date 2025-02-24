package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedParseNameTest_null {

    @Test
    public void parseNameTest_null() {
        AppVersion appVersion = AppVersion.parseName(null);
        assertEquals(appVersion.getBuildJobName(), "");
    }

}