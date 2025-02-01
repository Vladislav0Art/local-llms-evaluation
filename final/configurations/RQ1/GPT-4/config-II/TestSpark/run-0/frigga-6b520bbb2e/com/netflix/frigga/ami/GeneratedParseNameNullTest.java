package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Matcher;

public class GeneratedParseNameNullTest {

    @Test
    public void parseNameNullTest() {
        Assert.assertNull(AppVersion.parseName(null));
    }

}