package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.mockito.Mockito.*;

public class GeneratedParseName_MissingPackage_ReturnsNull {

    @Test
    public void parseName_MissingPackage_ReturnsNull() {
        String amiName = "my-version";
        AppVersion parsedAppVersion = AppVersion.parseName(amiName);
        assertNull(parsedAppVersion);
    }

}