package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedParseName_MultipleWordsName_ReturnsParsedAppVersion {

    @Test
    public void parseName_MultipleWordsName_ReturnsParsedAppVersion() {
        String name = "1.2-123456";
        AppVersion result = AppVersion.parseName(name);
        assertEquals(1, result.getVersion());
        assertEquals(2, result.getBuildJobName().charAt(0));
        assertEquals("123456", result.getCommit());
    }

}