package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.*;

public class GeneratedParseName_GivenEmptyStringReturnsNull {

    @Test
    public void parseName_GivenEmptyStringReturnsNull() {
        AppVersion result = AppVersion.parseName("");
        assertNull(result);
    }

}