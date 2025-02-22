package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestParseNameNull {

    @Test
    public void testParseNameNull() {
        // Test that parseName returns null when given a null input
        assertNull(AppVersion.parseName(null));
    }

}