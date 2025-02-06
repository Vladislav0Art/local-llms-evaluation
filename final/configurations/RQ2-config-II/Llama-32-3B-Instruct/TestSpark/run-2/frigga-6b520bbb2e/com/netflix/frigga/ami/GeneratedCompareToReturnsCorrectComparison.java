package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import com.netflix.frigga.ami.AppVersion;
import com.netflix.frigga.NameConstants;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedCompareToReturnsCorrectComparison {

    @Test
    public void compareToReturnsCorrectComparison() {
        AppVersion appVersion1 = new AppVersion();
        appVersion1.setPackageName("myapp");
        appVersion1.setVersion("1.2.3");
        appVersion1.setBuildJobName("build123");
        appVersion1.setBuildNumber("12345");
        appVersion1.setCommit("abcdefg");

        AppVersion appVersion2 = new AppVersion();
        appVersion2.setPackageName("myapp2");
        appVersion2.setVersion("1.2.3-4567");
        appVersion2.setBuildJobName("build789");
        appVersion2.setBuildNumber("98765");
        appVersion2.setCommit("ghijklm");

        assertEquals(-1, appVersion1.compareTo(appVersion2));
    }

}