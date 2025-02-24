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
public class GeneratedGetAppVersionPatternTest {

    @Mock
    private AppVersion appVersion;

    @Test
    public void getAppVersionPatternTest() {
        Pattern expected = Pattern.compile(".*");
        Mockito.when(appVersion.getAppVersionPattern()).thenReturn(expected);

        Pattern actual = appVersion.getAppVersionPattern();

        assertEquals(expected, actual);
    }

}