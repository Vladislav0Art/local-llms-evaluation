package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetChangelist_ReturnsExpectedChangelistId Test {

    @Test
    public void getChangelist_ReturnsExpectedChangelistId

    Test() {
        AppVersion appVersion = new AppVersion("1.0-123456789");
        assertEquals("12345", appVersion.getChangelist());
    }

}