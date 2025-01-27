package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Random;

public class GeneratedGetBuildJobName_ReturnsSameAsGetVersion {

    @Test
    public void getBuildJobName_ReturnsSameAsGetVersion() {
        String amiName = "ami-0c123456abcdefg";
        assertEquals(AppVersion.parseName(amiName).getVersion(), AppVersion.parseName(amiName).getBuildJobName());
    }

}