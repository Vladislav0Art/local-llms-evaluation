package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Matcher;

public class GeneratedCompareToTest {

    @Test
    public void compareToTest() {
        AppVersion version1 = AppVersion.parseName("subscriberha-1.0.0-h586499.h150/JENKINS/150");
        AppVersion version2 = AppVersion.parseName("subscriberha-1.0.0-h586500.h150/JENKINS/150");
        Assert.assertTrue(version1.compareTo(version2) < 0);
    }

}