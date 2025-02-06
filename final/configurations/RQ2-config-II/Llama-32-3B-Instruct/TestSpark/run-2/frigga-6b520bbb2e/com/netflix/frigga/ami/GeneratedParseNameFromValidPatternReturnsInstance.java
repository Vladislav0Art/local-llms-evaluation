package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import com.netflix.frigga.ami.AppVersion;
import com.netflix.frigga.NameConstants;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedParseNameFromValidPatternReturnsInstance {

    @Test
    public void parseNameFromValidPatternReturnsInstance() {
        String amiName = "myapp/1.2.3-1234";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertNotNull(appVersion);
        assertEquals("myapp", appVersion.getPackageName());
        assertEquals("1.2.3", appVersion.getVersion());
    }

}