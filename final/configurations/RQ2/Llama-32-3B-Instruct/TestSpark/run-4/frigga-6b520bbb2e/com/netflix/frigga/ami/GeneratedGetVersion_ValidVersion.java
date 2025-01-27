package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetVersion_ValidVersion {

    @Test
    public void getVersion_ValidVersion() {
        String amiName = "ami-0c123456789012345678901234567890";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertNotNull(appVersion.getVersion());
    }

}