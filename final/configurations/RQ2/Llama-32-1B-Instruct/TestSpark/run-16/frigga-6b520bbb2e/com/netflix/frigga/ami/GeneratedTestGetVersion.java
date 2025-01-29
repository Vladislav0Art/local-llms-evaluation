package com.netflix.frigga.ami;

import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedTestGetVersion {

    private static final Pattern pattern = Pattern.compile("([a-zA-Z0-9]+)\\-(.*)");

    public String getAmiName() {
        return pattern.matcher(getBuildJobName()).toString();
    }
}

public class AppVersionTest {

    @Test
    public void testGetVersion() {
        AppVersion appVersion = new AppVersion("ami-name");
        assertEquals("1.0", appVersion.getVersion());
    }

}