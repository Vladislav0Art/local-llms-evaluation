package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.HashMap;
import java.util.Map;

public class GeneratedGetPackageNameNullTest {

    @Test
    public void getPackageNameNullTest() {
        String amiName = "";
        AppVersion parsed = AppVersion.parseName(amiName);
        assertNull(parsed.getPackageName());
    }

}