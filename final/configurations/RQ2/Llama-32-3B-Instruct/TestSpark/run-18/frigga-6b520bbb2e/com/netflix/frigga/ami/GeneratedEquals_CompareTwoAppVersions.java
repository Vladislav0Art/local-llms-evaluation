package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.mockito.Mockito;

public class GeneratedEquals_CompareTwoAppVersions {

    @Test
    public void equals_CompareTwoAppVersions() {
        String amiName = "1.0-ami-havana";
        AppVersion appVersion1 = AppVersion.parseName(amiName);
        AppVersion appVersion2 = new AppVersion();
        assertTrue(appVersion1.equals(appVersion2));
    }

}