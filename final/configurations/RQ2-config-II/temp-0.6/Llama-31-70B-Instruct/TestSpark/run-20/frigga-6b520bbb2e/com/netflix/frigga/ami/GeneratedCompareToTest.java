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
public class GeneratedCompareToTest {

    @Mock
    private AppVersion appVersion;

    @Test
    public void compareToTest() {
        AppVersion other = new AppVersion();
        int expected = 0;
        Mockito.when(appVersion.compareTo(other)).thenReturn(expected);

        int actual = appVersion.compareTo(other);

        assertEquals(expected, actual);
    }

}