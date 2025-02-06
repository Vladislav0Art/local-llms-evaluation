package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetBuildJobName_EmptyString ReturnsEmptyString {

    @Test
    public void getBuildJobName_EmptyString

    ReturnsEmptyString() {
        AppVersion result = new AppVersion();
        assertEquals("", result.getBuildJobName());
    }

}