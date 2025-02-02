package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class GeneratedParseName_SimpleMatches_ReturnsParsedAppVersion {

    @Test
    public void parseName_SimpleMatches_ReturnsParsedAppVersion() {
        Pattern pattern = Pattern.compile(".*-([0-9]+).*(.*)-(.*)");
        Matcher matcher = pattern.matcher("test123-test456-compute");
        assertEquals(4, matcher.groupCount());
        String packageName = matcher.group(1);
        String version = matcher.group(2);
        String buildJobName = matcher.group(3);
        assertTrue(packageName.matches("\\d+"));
    }

}