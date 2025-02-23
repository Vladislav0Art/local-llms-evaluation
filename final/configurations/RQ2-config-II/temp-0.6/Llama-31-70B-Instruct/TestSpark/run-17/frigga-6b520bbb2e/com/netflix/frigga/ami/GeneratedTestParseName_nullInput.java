package com.netflix.frigga.ami;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.regex.Pattern;

import org.junit.Test;

public class GeneratedTestParseName_nullInput {

    @Test
    public void testParseName_nullInput() {
        AppVersion result = AppVersion.parseName(null);
        assertNull(result);
    }

}