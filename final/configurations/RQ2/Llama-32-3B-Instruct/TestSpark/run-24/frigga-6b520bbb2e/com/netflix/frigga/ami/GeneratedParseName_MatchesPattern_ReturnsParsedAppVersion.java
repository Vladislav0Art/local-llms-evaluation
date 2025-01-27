package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedParseName_MatchesPattern_ReturnsParsedAppVersion {

    @Test
    public void parseName_MatchesPattern_ReturnsParsedAppVersion() {
        String amiName = NameConstants.AMI_1_2_3;
        AppVersion parsed = AppVersion.parseName(amiName);
        assertNotNull(parsed);
    }

}