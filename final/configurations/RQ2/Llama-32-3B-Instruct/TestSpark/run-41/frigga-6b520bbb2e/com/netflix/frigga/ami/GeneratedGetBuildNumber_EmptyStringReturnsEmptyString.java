package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetBuildNumber_EmptyStringReturnsEmptyString {

    @Test
    public void getBuildNumber_EmptyStringReturnsEmptyString() {
        assertEquals("", AppVersion.parseName("[]").getBuildNumber());
    }

}