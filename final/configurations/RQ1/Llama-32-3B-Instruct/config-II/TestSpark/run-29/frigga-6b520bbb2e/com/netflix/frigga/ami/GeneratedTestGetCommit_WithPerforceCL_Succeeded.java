package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedTestGetCommit_WithPerforceCL_Succeeded {

    @Test
    public void testGetCommit_WithPerforceCL_Succeeded() {
        String amiName = "subscriberha-1.0.0-586499";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertEquals("586499", appVersion.getCommit());
    }

}