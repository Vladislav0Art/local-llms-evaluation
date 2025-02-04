package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.*;

public class GeneratedParseName_NonMatchingPattern_ReturnsNull {

    @Test
    public void parseName_NonMatchingPattern_ReturnsNull() {
        String amiName = "nonmatchingpattern";
        AppVersion result = AppVersion.parseName(amiName);
        assertNull(result);
    }

}