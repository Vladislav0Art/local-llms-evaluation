package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import com.netflix.frigga.ami.AppVersion;
import com.netflix.frigga.NameConstants;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedHashCodeReturnsCorrectHashcode {

    @Test
    public void hashCodeReturnsCorrectHashcode() {
        AppVersion appVersion = new AppVersion();
        appVersion.setPackageName("myapp");
        appVersion.setVersion("1.2.3-1234");
        appVersion.setBuildJobName("build123");
        appVersion.setBuildNumber("12345");
        appVersion.setCommit("abcdefg");

        assertNotNull(appVersion.hashCode());
    }

}