package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedTestGetBuildJobName_NameWithoutHypenAndNumber_ReturnsEmptyString {

    @Test
    public void testGetBuildJobName_NameWithoutHypenAndNumber_ReturnsEmptyString() {
        String amiName = "subscriberha";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertEquals("", appVersion.getBuildJobName());
    }

}