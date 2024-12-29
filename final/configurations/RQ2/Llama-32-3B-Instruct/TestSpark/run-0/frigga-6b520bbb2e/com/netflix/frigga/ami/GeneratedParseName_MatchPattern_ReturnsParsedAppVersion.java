package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedParseName_MatchPattern_ReturnsParsedAppVersion {

    @Test
    public void parseName_MatchPattern_ReturnsParsedAppVersion() {
        String amiName = "ami-abcdefg-hijklmnopqrstuvwxyza";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertNotNull(appVersion);
    }

}