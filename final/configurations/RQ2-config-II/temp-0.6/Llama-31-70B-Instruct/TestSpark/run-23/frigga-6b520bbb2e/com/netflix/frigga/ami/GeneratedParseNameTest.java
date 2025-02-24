package com.netflix.frigga.ami;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.netflix.frigga.NameConstants;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedParseNameTest {

    @Test
    public void parseNameTest() {
        String amiName = "amiName";
        AppVersion mockAppVersion = mock(AppVersion.class);
        when(mockAppVersion.parseName(amiName)).thenReturn(mockAppVersion);
        AppVersion appVersion = mockAppVersion.parseName(amiName);
        assertEquals(mockAppVersion, appVersion);
    }

}