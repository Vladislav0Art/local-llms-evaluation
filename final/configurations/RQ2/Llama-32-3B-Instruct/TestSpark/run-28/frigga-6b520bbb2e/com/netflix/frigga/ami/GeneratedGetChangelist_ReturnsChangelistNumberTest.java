package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetChangelist_ReturnsChangelistNumberTest {

    @Test
    public void getChangelist_ReturnsChangelistNumberTest() {
        AppVersion appVersion = new AppVersion("0.9.2-0");
        assertEquals("12345", appVersion.getChangelist());
    }

}