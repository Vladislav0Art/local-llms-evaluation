package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Matcher;

public class GeneratedParseNameValidTextTest {

    @Test
    public void parseNameValidTextTest() {
        Assert.assertNotNull(AppVersion.parseName("subscriberha-1.0.0-h586499.h150/JENKINS/150"));
    }

}