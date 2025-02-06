package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedParseName_ValidAmarthostname_ReturnsAppVersionObject {

    @Test
    public void parseName_ValidAmarthostname_ReturnsAppVersionObject() {
        String amiName = "ami-0c103043abf3aef9f6c5b15d8d42ad4e";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertNotNull(appVersion);
    }

}