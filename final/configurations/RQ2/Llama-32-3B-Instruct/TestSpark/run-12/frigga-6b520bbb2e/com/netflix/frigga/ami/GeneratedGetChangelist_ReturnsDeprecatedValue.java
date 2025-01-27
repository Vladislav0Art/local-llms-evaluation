package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetChangelist_ReturnsDeprecatedValue {

    @Test
    public void getChangelist_ReturnsDeprecatedValue() {
        String changelist = AppVersion.getChangelist();
        assertTrue(changelist != null); // deprecated, so this test might fail depending on the implementation
    }

}