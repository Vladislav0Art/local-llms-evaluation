package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetVersion_NonEmptyString ReturnsNonEmptyString {

    @Test
    public void getVersion_NonEmptyString

    ReturnsNonEmptyString() {
        String version = "1.0";
        AppVersion result = new AppVersion(version);
        assertEquals(version, result.getVersion());
    }

}