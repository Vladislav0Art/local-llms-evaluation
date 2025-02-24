package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedParseNameTest_empty {

    @Test
    public void parseNameTest_empty() {
        AppVersion appVersion = AppVersion.parseName("");
        assertEquals(appVersion.getCommit(), "");
    }

}