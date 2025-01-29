package com.netflix.frigga.ami;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@RunWith(MockitoJUnitRunner.class)
public class Generated[MethodUnderTest]

_getBuildNumber_ReturnsAppBuildNumber {

    @Mock
    private String parseNameResult;

    public static AppVersion AppVersion = new AppVersion();

    @Test
    public void [MethodUnderTest]_getBuildNumber_ReturnsAppBuildNumber() {
        MockitoAnnotations.initMocks(this);
        when(AppVersion.appBuildNumber()).thenReturn("ami-build-number-1");
        String expected = "ami-build-number-1";
        Assert.assertEquals(expected, AppVersion.getBuildNumber());

        verify(AppVersion.class).getBuildNumber();
    }

}