package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import com.netflix.frigga.ami.AppVersion;
import com.netflix.frigga.NameConstants;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedEqualsReturnsCorrectComparison {

    @Test
    public void equalsReturnsCorrectComparison() {
        AppVersion appVersion1 = new AppVersion();
        appVersion1.setPackageName("myapp");
        appVersion1.setVersion("1.2.3-1234");
        appVersion1.setBuildJobName("build123");
        appVersion1.setBuildNumber("12345");
        appVersion1.setCommit("abcdefg");

        AppVersion appVersion2 = new AppVersion();
        appVersion2.setPackageName("myapp");
        appVersion2.setVersion("1.2.3-1234");
        appVersion2.setBuildJobName("build123");
        appVersion2.setBuildNumber("12345");
        appVersion2.setCommit("abcdefg");

        assertTrue(appVersion1.equals(appVersion2));
    }

}