package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Arrays;

public class GeneratedGetCommit_AnyValidNameReturnsCorrectCommit {

    @Test
    public void getCommit_AnyValidNameReturnsCorrectCommit() {
        String amiName = "1.0.0-RC2";
        AppVersion appVersion = new AppVersion(amiName);
        assertNotNull(appVersion.getCommit());
    }

}