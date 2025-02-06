package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedParseName_SameVersionReturnsSameObject {

    @Test
    public void parseName_SameVersionReturnsSameObject() {
        AppVersion version1 = AppVersion.parseName("1.0-1234");
        AppVersion version2 = AppVersion.parseName("1.0-1234");
        assertEquals(version1, version2);
    }

}