package com.netflix.frigga.ami;

import org.junit.Test;

import java.util.regex.Pattern;

import static org.junit.Assert.*;

public class GeneratedGetAppVersionPatternTest {

    @Test
    public void getAppVersionPatternTest() {
        Pattern expected = Pattern.compile("([a-zA-Z0-9\\.\\-]+)-([0-9.a-zA-Z~]+)-([a-zA-Z0-9]+)"
                + "(?:[.](\\w+))?(?:\\/([a-zA-Z0-9\\.\\-]+)\\/([0-9]+))?");

        assertEquals(expected.pattern(), AppVersion.getAppVersionPattern().pattern());
    }

}