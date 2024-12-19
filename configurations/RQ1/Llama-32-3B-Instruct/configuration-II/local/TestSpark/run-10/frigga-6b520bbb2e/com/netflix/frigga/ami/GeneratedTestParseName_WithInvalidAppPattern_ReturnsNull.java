package com.netflix.frigga.ami;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestParseName_WithInvalidAppPattern_ReturnsNull {

    @Mock
    private String amiName;

    @InjectMocks
    private AppVersion appVersion;

    @Test
    public void testParseName_WithInvalidAppPattern_ReturnsNull() {
        when(APP_VERSION_PATTERN.matcher(amiName).matches()).thenReturn(false);
        AppVersion parsedName = AppVersion.parseName(amiName);
        assertNull(parsedName);
    }

}