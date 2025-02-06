package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetPackageName_SimpleAppVersion_ReturnsPackageName {

    private AppVersion appVersion;

    @Test
    public void getPackageName_SimpleAppVersion_ReturnsPackageName() {
        appVersion = AppVersion.parseName("ami-1234");
        assertEquals(NameConstants.APP_VERSION, appVersion.getPackageName());
    }

}