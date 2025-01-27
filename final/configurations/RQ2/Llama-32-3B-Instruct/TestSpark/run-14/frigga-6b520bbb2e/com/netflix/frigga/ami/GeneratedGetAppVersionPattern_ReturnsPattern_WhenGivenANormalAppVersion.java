package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.netflix.frigga.NameConstants;
import org.mockito.Mockito;

public class GeneratedGetAppVersionPattern_ReturnsPattern_WhenGivenANormalAppVersion {

    @Test
    public void getAppVersionPattern_ReturnsPattern_WhenGivenANormalAppVersion() {
        Matcher matcher = Pattern.compile("[0-9]+\\.[0-9]+\\.[0-9]-[a-z]+").matcher("1.2.3-4");
        assertTrue(matcher.matches());
    }

}