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
public class GeneratedGetPackageNameTest {

    @Mock
    private AppVersion appVersion;

    @Test
    public void getPackageNameTest() {
        String expected = "packageName";
        Mockito.when(appVersion.getPackageName()).thenReturn(expected);

        String actual = appVersion.getPackageName();

        assertEquals(expected, actual);
    }

}