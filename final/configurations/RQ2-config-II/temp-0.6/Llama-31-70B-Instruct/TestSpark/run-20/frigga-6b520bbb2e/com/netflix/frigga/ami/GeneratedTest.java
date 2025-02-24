package com.netflix.frigga.ami;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private AppVersion appVersion;

    @Test
    public void parseNameTest() {
        String amiName = "amiName";
        AppVersion expected = new AppVersion();
        Mockito.when(appVersion.parseName(amiName)).thenReturn(expected);

        AppVersion actual = appVersion.parseName(amiName);

        assertEquals(expected, actual);
    }

    @Test
    public void compareToTest() {
        AppVersion other = new AppVersion();
        int expected = 0;
        Mockito.when(appVersion.compareTo(other)).thenReturn(expected);

        int actual = appVersion.compareTo(other);

        assertEquals(expected, actual);
    }

    @Test
    public void getAppVersionPatternTest() {
        Pattern expected = Pattern.compile(".*");
        Mockito.when(appVersion.getAppVersionPattern()).thenReturn(expected);

        Pattern actual = appVersion.getAppVersionPattern();

        assertEquals(expected, actual);
    }

    @Test
    public void getPackageNameTest() {
        String expected = "packageName";
        Mockito.when(appVersion.getPackageName()).thenReturn(expected);

        String actual = appVersion.getPackageName();

        assertEquals(expected, actual);
    }

}