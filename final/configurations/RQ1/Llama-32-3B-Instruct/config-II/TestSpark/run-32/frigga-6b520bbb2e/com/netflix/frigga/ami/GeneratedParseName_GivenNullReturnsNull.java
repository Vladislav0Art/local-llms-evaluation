package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.*;

public class GeneratedParseName_GivenNullReturnsNull {

    @Test
    public void parseName_GivenNullReturnsNull() {
        AppVersion result = AppVersion.parseName(null);
        assertNull(result);
    }

}