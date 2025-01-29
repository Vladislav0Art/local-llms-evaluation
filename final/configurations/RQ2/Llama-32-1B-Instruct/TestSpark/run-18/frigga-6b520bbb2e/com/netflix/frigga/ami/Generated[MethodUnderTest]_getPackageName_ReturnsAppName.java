package com.netflix.frigga.ami;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@RunWith(MockitoJUnitRunner.class)
public class Generated[MethodUnderTest]

_getPackageName_ReturnsAppName {

    @Mock
    private String parseNameResult;

    public static AppVersion AppVersion = new AppVersion();

    @Test
    public void [MethodUnderTest]_getPackageName_ReturnsAppName() {
        MockitoAnnotations.initMocks(this);
        when(AppVersion.appName).thenReturn("ami-name-1");
        String expected = "ami-name-1";
        Assert.assertEquals(expected, AppVersion.getPackageName());

        verify(AppVersion.class).getPackageName();
    }

}