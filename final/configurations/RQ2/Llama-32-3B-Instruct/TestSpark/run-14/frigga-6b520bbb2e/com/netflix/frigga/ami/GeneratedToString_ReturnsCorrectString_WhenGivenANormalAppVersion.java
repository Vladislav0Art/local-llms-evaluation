package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.netflix.frigga.NameConstants;
import org.mockito.Mockito;

public class GeneratedToString_ReturnsCorrectString_WhenGivenANormalAppVersion {

    @Test
    public void toString_ReturnsCorrectString_WhenGivenANormalAppVersion() {
        AppVersion appVersion = new AppVersion("1.2.3-4", "com.example.app");
        String expected = "build-1234@com.example.app, 1.2.3-4";
        assertEquals(expected, appVersion.toString());
    }

}