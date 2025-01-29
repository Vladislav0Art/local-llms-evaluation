package com.netflix.frigga.ami;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedTestGetCommit {

    @Test
    public void testGetCommit() {
        AppVersion appVersion = new AppVersion(AppVersion.parseName("test-commit"));
        assertEquals("test-commit", appVersion.getCommit());
    }

}