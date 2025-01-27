package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.mockito.Mockito;

public class GeneratedGetChangelist_ReturnsDeprecatedMethod {

    @Test
    public void getChangelist_ReturnsDeprecatedMethod() {
        String amiName = "1.0-ami-havana";
        AppVersion appVersion = AppVersion.parseName(amiName);
        String changelist = appVersion.getChangelist();
        assertEquals("DEPRECATED", changelist);
    }

}