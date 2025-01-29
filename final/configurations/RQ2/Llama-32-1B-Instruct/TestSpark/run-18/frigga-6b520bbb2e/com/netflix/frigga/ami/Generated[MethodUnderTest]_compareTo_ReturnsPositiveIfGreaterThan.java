package com.netflix.frigga.ami;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@RunWith(MockitoJUnitRunner.class)
public class Generated[MethodUnderTest]

_compareTo_ReturnsPositiveIfGreaterThan {

    @Mock
    private String parseNameResult;

    public static AppVersion AppVersion = new AppVersion();

    @Test
    public void [MethodUnderTest]_compareTo_ReturnsPositiveIfGreaterThan() {
        MockitoAnnotations.initMocks(this);
        when(parseNameResult).thenReturn("ami-name-1");
        when(AppVersion.appName).thenReturn("ami-name-3");
        AppVersion.appName = "ami-name-4";
        int expected = 2;
        Assert.assertEquals(expected, AppVersion.compareVersions());

        verify(parseNameResult).parseName("ami-name-4");
    }

}