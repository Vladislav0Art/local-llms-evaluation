package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetBuildNumber_ValidVersionReturnCorrectBuildNumber {

    @Test
    public void getBuildNumber_ValidVersionReturnCorrectBuildNumber() {
        AppVersion version = new AppVersion("ami-1234", 12, 34);
        assertEquals(34L, Long.parseLong(version.getBuildNumber()));
    }

}