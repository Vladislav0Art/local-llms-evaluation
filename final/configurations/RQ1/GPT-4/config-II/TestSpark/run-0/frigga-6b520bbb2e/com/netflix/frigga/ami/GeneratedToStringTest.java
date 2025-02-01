package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Matcher;

public class GeneratedToStringTest {

    @Test
    public void toStringTest() {
        AppVersion appVersion = AppVersion.parseName("subscriberha-1.0.0-h586499.h150/JENKINS/150");
        String expected = "AppVersion [packageName=subscriberha, version=1.0.0, " +
                "buildJobName=JENKINS, buildNumber=150, changelist=h150]";
        Assert.assertEquals(expected, appVersion.toString());
    }

}