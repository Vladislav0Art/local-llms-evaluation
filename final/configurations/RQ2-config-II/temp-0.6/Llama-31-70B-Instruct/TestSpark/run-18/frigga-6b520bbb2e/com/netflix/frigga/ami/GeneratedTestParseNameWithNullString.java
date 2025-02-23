package com.netflix.frigga.ami;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.netflix.frigga.ami.AppVersion;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class GeneratedTestParseNameWithNullString {

    @Test
    public void testParseNameWithNullString() {
        AppVersion parsedName = AppVersion.parseName(null);
        assertNull(parsedName);
    }

}