package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedTestParseName_NullAmiName_ReturnsNull {

    @Test
    public void testParseName_NullAmiName_ReturnsNull() {
        String amiName = null;
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertNull(appVersion);
    }

}