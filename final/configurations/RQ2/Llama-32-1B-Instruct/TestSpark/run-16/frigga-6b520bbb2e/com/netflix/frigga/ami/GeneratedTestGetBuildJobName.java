package com.netflix.frigga.ami;

import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedTestGetBuildJobName {

    private static final Pattern pattern = Pattern.compile("([a-zA-Z0-9]+)\\-(.*)");

    public String getAmiName() {
        return pattern.matcher(getBuildJobName()).toString();
    }
}

public class AppVersionTest {

    @Test
    public void testGetBuildJobName() {
        AppVersion appVersion = new AppVersion("ami-name");
        assertEquals("build-job-name", appVersion.getBuildJobName());
    }

}