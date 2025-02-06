package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import com.netflix.frigga.ami.AppVersion;
import com.netflix.frigga.NameConstants;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetVersionReturnsCorrectValue {

    @Test
    public void getVersionReturnsCorrectValue() {
        AppVersion appVersion = new AppVersion();
        appVersion.setVersion("1.2.3");
        assertEquals("1.2.3", appVersion.getVersion());
    }

}