package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetChangelist_ValidAminame_ReturnsExpectedChangelist {

    @Test
    public void getChangelist_ValidAminame_ReturnsExpectedChangelist() {
        AppVersion appVersion = new AppVersion("0.9.1-EC2-X86_64-GP2");
        String expectedChangelist = "EC2-X86_64-GP2";
        assertEquals(expectedChangelist, appVersion.getChangelist());
    }

}