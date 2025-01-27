package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedParseName_AmiName_ParsesSuccessfully {

    @Test
    public void parseName_AmiName_ParsesSuccessfully() {
        String amiName = "ami-0e4a7d9f-2d64-43c5-bb11-8a7d81ea5604";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertNotNull(appVersion);
    }

}