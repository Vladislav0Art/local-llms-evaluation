package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetBuildJobName_EmptyString_ReturnsEmptyString {

    @Test
    public void getBuildJobName_EmptyString_ReturnsEmptyString() {
        assertEquals("", AppVersion.parseName("").getBuildJobName());
    }

}