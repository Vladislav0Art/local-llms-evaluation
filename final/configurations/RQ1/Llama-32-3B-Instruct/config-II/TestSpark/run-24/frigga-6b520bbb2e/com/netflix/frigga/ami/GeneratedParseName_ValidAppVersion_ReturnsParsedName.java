package com.netflix.frigga.ami;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedParseName_ValidAppVersion_ReturnsParsedName {

    @InjectMocks
    private AppVersion appVersion;

    @Mock
    private Pattern appVersionPattern;

    @Test
    public void parseName_ValidAppVersion_ReturnsParsedName() {
        String amiName = "subscriberha-1.0.0-586499";
        when(appVersionPattern.matcher(amiName).matches()).thenReturn(true);
        AppVersion parsedName = AppVersion.parseName(amiName);

        assertNotNull(parsedName);
        assertEquals("subscriberha", parsedName.packageName);
        assertEquals("1.0.0-586499", parsedName.version);
    }

}