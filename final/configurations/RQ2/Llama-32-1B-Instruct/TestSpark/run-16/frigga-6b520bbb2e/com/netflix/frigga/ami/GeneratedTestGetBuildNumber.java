package com.netflix.frigga.ami;

import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedTestGetBuildNumber {

    private static final Pattern pattern = Pattern.compile("([a-zA-Z0-9]+)\\-(.*)");

    public String getAmiName() {
        return pattern.matcher(getBuildJobName()).toString();
    }
}

public class AppVersionTest {

    @Test
    public void testGetBuildNumber() {
        AppVersion appVersion = new AppVersion("ami-name");
        assertEquals("1.0", appVersion.getBuildNumber());
    }

}