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
public class GeneratedParseNameTest {

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

}