package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.HashMap;
import java.util.Map;

public class GeneratedGetBuildJobNameNullTest {

    @Test
    public void getBuildJobNameNullTest() throws Exception {
        String amiName = "";
        AppVersion parsed = AppVersion.parseName(amiName);
        assertEquals(null, parsed.getBuildJobName());
    }

}