package com.netflix.frigga.ami;

import static org.junit.Assert.*;

import org.junit.Test;

import static org.mockito.Mockito.*;
import static org.mockito.ArgumentMatchers.*;

public class GeneratedTestParseName_invalid {

    @Test
    public void testParseName_invalid() {
        String amiName = "invalid-name";
        AppVersion parsedName = AppVersion.parseName(amiName);
        assertNull(parsedName);
    }

}