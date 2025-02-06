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

public class GeneratedParseName_MissingValueTest {

    @Test
    public void parseName_MissingValueTest() {
        String amiName = null;
        try {
            AppVersion.parseName(amiName);
            fail("Expected exception not thrown");
        } catch (NullPointerException e) {
            // Expected
        }
    }

}