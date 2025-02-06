package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetCommit_SimpleAppVersion_ReturnsCommit {

    private AppVersion appVersion;

    @Test
    public void getCommit_SimpleAppVersion_ReturnsCommit() {
        appVersion = AppVersion.parseName("ami-1234");
        assertEquals("1234", appVersion.getCommit());
    }

}