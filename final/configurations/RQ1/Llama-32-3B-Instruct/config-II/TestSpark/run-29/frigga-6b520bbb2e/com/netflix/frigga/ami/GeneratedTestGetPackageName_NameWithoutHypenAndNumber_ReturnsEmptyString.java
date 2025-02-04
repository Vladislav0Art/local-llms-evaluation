package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedTestGetPackageName_NameWithoutHypenAndNumber_ReturnsEmptyString {

    @Test
    public void testGetPackageName_NameWithoutHypenAndNumber_ReturnsEmptyString() {
        String amiName = "subscriberha";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertEquals("", appVersion.getPackageName());
    }

}