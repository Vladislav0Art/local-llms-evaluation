package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedTestGetCommit {

    private AppVersion appVersion;

    @Test
    public void testGetCommit() {
        String mockName = "mockCommit";
        appVersion.parseName(mockName);
        assertEquals("mockCommit", appVersion.getCommit());
    }

}