package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.HashMap;
import java.util.Map;

public class GeneratedGetCommitEmptyStringTest {

    @Test
    public void getCommitEmptyStringTest() {
        String amiName = "";
        AppVersion parsed = AppVersion.parseName(amiName);
        assertEquals("", parsed.getCommit());
    }

}