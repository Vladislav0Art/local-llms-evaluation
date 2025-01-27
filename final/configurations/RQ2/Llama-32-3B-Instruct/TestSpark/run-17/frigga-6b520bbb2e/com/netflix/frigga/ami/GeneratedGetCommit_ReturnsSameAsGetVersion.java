package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Random;

public class GeneratedGetCommit_ReturnsSameAsGetVersion {

    @Test
    public void getCommit_ReturnsSameAsGetVersion() {
        String amiName = "ami-0c123456abcdefg";
        assertEquals(AppVersion.parseName(amiName).getVersion(), AppVersion.parseName(amiName).getCommit());
    }

}