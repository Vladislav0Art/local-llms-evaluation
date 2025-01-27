package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Random;

public class GeneratedParseName_MissingPrefix_ReturnsNull {

    @Test
    public void parseName_MissingPrefix_ReturnsNull() {
        String amiName = "ami-0c123456";
        assertNull(AppVersion.parseName(amiName));
    }

}