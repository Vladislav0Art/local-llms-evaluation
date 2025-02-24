package com.netflix.frigga.ami;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.netflix.frigga.NameConstants;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTest {

    @Test
    public void parseNameTest() {
        String amiName = "amiName";
        AppVersion mockAppVersion = mock(AppVersion.class);
        when(mockAppVersion.parseName(amiName)).thenReturn(mockAppVersion);
        AppVersion appVersion = mockAppVersion.parseName(amiName);
        assertEquals(mockAppVersion, appVersion);
    }

    @Test
    public void compareToTest() {
        AppVersion appVersion1 = new AppVersion();
        AppVersion appVersion2 = new AppVersion();
        int expected = 0;
        int actual = appVersion1.compareTo(appVersion2);
        assertEquals(expected, actual);
    }

    @Test
    public void getAppVersionPatternTest() {
        Pattern appVersionPattern = Pattern.compile("[a-zA-Z0-9_-]+-v[0-9]+");
        AppVersion appVersion = new AppVersion();
        Pattern actualPattern = appVersion.getAppVersionPattern();
        assertEquals(appVersionPattern, actualPattern);
    }

}