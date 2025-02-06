package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Arrays;
import java.util.Collections;

import com.netflix.frigga.NameConstants;
import org.mockito.Mockito;
import org.mockito.MockingDetails;

public class GeneratedParseName_InvalidFormatTest {

    @Test
    public void parseName_InvalidFormatTest() {
        String amiName = "1.9.0-EC2-Ubuntu-16.04-amzn2-x86_64";
        try {
            AppVersion.parseName(amiName);
            fail("Expected exception not thrown");
        } catch (Exception e) {
            // Expected
        }
    }

}