package com.netflix.frigga.ami;

import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedTestParseName {

    private static final Pattern pattern = Pattern.compile("([a-zA-Z0-9]+)\\-(.*)");

    public String getAmiName() {
        return pattern.matcher(getBuildJobName()).toString();
    }
}

public class AppVersionTest {

    @Test
    public void testParseName() {
        AppVersion appVersion = new AppVersion("ami-name");
        assertEquals("ami-name", appVersion.getAmiName());
    }

}