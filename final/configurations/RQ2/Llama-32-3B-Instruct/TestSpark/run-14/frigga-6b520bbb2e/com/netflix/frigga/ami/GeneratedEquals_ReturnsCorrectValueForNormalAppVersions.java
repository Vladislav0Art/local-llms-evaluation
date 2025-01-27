package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.netflix.frigga.NameConstants;
import org.mockito.Mockito;

public class GeneratedEquals_ReturnsCorrectValueForNormalAppVersions {

    @Test
    public void equals_ReturnsCorrectValueForNormalAppVersions() {
        AppVersion appVersion1 = new AppVersion("1.2.3-4", "com.example.app");
        AppVersion appVersion2 = new AppVersion("1.2.3-4", "com.example.app");
        boolean result = appVersion1.equals(appVersion2);
        assertTrue(result);
    }

}