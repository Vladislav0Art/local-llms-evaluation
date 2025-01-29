package com.netflix.frigga.ami;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@RunWith(MockitoJUnitRunner.class)
public class Generated[MethodUnderTest]

_equals_ReturnsTrueIfEqual {

    @Mock
    private String parseNameResult;

    public static AppVersion AppVersion = new AppVersion();

    @Test
    public void [MethodUnderTest]_equals_ReturnsTrueIfEqual() {
        MockitoAnnotations.initMocks(this);
        when(AppVersion.appName()).thenReturn("ami-name-1");
        when(AppVersion.getBuildNumber()).thenReturn("ami-build-number-1");
        AppVersion.appName = "ami-name-2";
        when(AppVersion.getBuildJobName()).thenReturn("ami-build-job-2");
        AppVersion.appBuildJobName() = "ami-build-job-2";

        Assert.assertTrue(AppVersion.equals(AppVersion.class));

        verify(AppVersion.class).equals(AppVersion.class);
    }

}