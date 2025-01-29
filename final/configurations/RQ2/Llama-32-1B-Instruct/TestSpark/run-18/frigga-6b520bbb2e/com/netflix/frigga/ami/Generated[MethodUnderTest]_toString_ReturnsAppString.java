package com.netflix.frigga.ami;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@RunWith(MockitoJUnitRunner.class)
public class Generated[MethodUnderTest]

_toString_ReturnsAppString {

    @Mock
    private String parseNameResult;

    public static AppVersion AppVersion = new AppVersion();

    @Test
    public void [MethodUnderTest]_toString_ReturnsAppString() {
        MockitoAnnotations.initMocks(this);
        when(AppVersion.appBuildJobName()).thenReturn("ami-build-job-1");
        String expected = "ami-build-job-1";
        Assert.assertEquals(expected, AppVersion.toString());

        verify(AppVersion.class).toString();
    }

}