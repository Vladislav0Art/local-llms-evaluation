package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Random;

public class GeneratedGetBuildNumber_ReturnsLastSixCharactersOfVersion {

    @Test
    public void getBuildNumber_ReturnsLastSixCharactersOfVersion() {
        String amiName = "ami-0c123456abcdefg";
        assertEquals("abcdefg", AppVersion.parseName(amiName).getBuildNumber());
    }

}