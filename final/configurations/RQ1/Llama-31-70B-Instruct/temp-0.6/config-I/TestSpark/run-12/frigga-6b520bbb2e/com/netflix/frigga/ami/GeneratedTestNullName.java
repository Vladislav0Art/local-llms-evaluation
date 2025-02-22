package com.netflix.frigga.ami;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

public class GeneratedTestNullName {

    @Test
    public void testNullName() {
        AppVersion parsedName = AppVersion.parseName(null);
        assertEquals(null, parsedName);
    }

}