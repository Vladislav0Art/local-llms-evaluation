package com.netflix.frigga.ami;

import static org.junit.Assert.*;

import org.junit.Test;

import static org.mockito.Mockito.*;
import static org.mockito.ArgumentMatchers.*;

public class GeneratedTestParseName_null {

    @Test
    public void testParseName_null() {
        AppVersion parsedName = AppVersion.parseName(null);
        assertNull(parsedName);
    }

}