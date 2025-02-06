package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetChangelist_DeprecatedTest {

    @Test
    public void getChangelist_DeprecatedTest() {
        try {
            AppVersion.getChangelist();
            fail("Expected ChangelistNotFoundException");
        } catch (ChangelistNotFoundException e) {
            // Expected
        }
    }

}