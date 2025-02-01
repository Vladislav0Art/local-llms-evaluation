package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Matcher;

public class GeneratedParseNameInvalidTextTest {

    @Test
    public void parseNameInvalidTextTest() {
        String text = "sub-1.0.0-586499.h150/JENKINS/build123";
        Assert.assertNull(AppVersion.parseName(text));
    }

}