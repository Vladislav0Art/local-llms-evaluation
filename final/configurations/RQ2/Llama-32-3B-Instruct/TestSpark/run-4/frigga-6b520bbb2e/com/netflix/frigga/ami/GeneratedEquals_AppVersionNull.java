package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedEquals_AppVersionNull {

    @Test
    public void equals_AppVersionNull() {
        String amiName1 = "ami-0c123456789012345678901234567890";
        AppVersion appVersion1 = AppVersion.parseName(amiName1);
        assertEquals(false, appVersion1.equals(null));
    }

}