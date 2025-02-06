package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedParseName_MultipleVersionsReturnsSingleOne {

    @Test
    public void parseName_MultipleVersionsReturnsSingleOne() {
        AppVersion version1 = AppVersion.parseName("1.0-1234");
        AppVersion result = AppVersion.parseName("2.0-5678");
        assertNull(result);
    }

}