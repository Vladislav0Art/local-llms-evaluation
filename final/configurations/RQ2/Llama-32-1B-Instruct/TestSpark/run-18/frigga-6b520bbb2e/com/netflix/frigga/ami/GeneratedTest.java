package com.netflix.frigga.ami;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private String parseNameResult;

    public static AppVersion AppVersion = new AppVersion();

    @Test
    public void [MethodUnderTest]

    _parseName_ReturnsParsedString() {
        MockitoAnnotations.initMocks(this);
        when(parseNameResult).thenReturn("ami-name-123");
        AppVersion.appName = "ami-name-123";
        String expected = "ami-name-123";
        Assert.assertEquals(expected, AppVersion.getParseName());

        verify(parseNameResult).parseName("ami-name-123");
    }

    @Test
    public void [MethodUnderTest]

    _compareTo_ReturnsNegativeIfLessThan() {
        MockitoAnnotations.initMocks(this);
        when(parseNameResult).thenReturn("ami-name-1");
        when(AppVersion.appName).thenReturn("ami-name-2");
        AppVersion.appName = "ami-name-3";
        int expected = -1;
        Assert.assertEquals(expected, AppVersion.compareVersions());

        verify(parseNameResult).parseName("ami-name-3");
    }

    @Test
    public void [MethodUnderTest]

    _compareTo_ReturnsZeroIfEqual() {
        MockitoAnnotations.initMocks(this);
        when(parseNameResult).thenReturn("ami-name-1");
        when(AppVersion.appName).thenReturn("ami-name-1");
        AppVersion.appName = "ami-name-2";
        int expected = 0;
        Assert.assertEquals(expected, AppVersion.compareVersions());

        verify(parseNameResult).parseName("ami-name-2");
    }

    @Test
    public void [MethodUnderTest]

    _compareTo_ReturnsPositiveIfGreaterThan() {
        MockitoAnnotations.initMocks(this);
        when(parseNameResult).thenReturn("ami-name-1");
        when(AppVersion.appName).thenReturn("ami-name-3");
        AppVersion.appName = "ami-name-4";
        int expected = 2;
        Assert.assertEquals(expected, AppVersion.compareVersions());

        verify(parseNameResult).parseName("ami-name-4");
    }

    @Test
    public void [MethodUnderTest]

    _compareTo_ReturnsZeroIfLessOrEqual() {
        MockitoAnnotations.initMocks(this);
        when(parseNameResult).thenReturn("ami-name-1");
        when(AppVersion.appName).thenReturn("ami-name-1");
        AppVersion.appName = "ami-name-2";
        int expected = 0;
        Assert.assertEquals(expected, AppVersion.compareVersions());

        verify(parseNameResult).parseName("ami-name-2");
    }

    @Test
    public void [MethodUnderTest]

    _getParseName_ReturnsParsedString() {
        MockitoAnnotations.initMocks(this);
        when(parseNameResult).thenReturn("ami-name-123");
        String expected = "ami-name-123";
        Assert.assertEquals(expected, AppVersion.getParseName());

        verify(parseNameResult).parseName("ami-name-123");
    }

    @Test
    public void [MethodUnderTest]

    _getPackageName_ReturnsAppName() {
        MockitoAnnotations.initMocks(this);
        when(AppVersion.appName).thenReturn("ami-name-1");
        String expected = "ami-name-1";
        Assert.assertEquals(expected, AppVersion.getPackageName());

        verify(AppVersion.class).getPackageName();
    }

    @Test
    public void [MethodUnderTest]

    _getBuildJobName_ReturnsAppBuildJobName() {
        MockitoAnnotations.initMocks(this);
        when(AppVersion.appBuildJobName()).thenReturn("ami-build-job-1");
        String expected = "ami-build-job-1";
        Assert.assertEquals(expected, AppVersion.getBuildJobName());

        verify(AppVersion.class).getBuildJobName();
    }

    @Test
    public void [MethodUnderTest]

    _getBuildNumber_ReturnsAppBuildNumber() {
        MockitoAnnotations.initMocks(this);
        when(AppVersion.appBuildNumber()).thenReturn("ami-build-number-1");
        String expected = "ami-build-number-1";
        Assert.assertEquals(expected, AppVersion.getBuildNumber());

        verify(AppVersion.class).getBuildNumber();
    }

    @Test
    public void [MethodUnderTest]

    _getCommit_ReturnsAppCommit() {
        MockitoAnnotations.initMocks(this);
        when(AppVersion.appCommit()).thenReturn("ami-commit-123");
        String expected = "ami-commit-123";
        Assert.assertEquals(expected, AppVersion.getCommit());

        verify(AppVersion.class).getCommit();
    }

    @Test
    public void [MethodUnderTest]

    _getChangelist_ReturnsAppChangelist() {
        MockitoAnnotations.initMocks(this);
        when(AppVersion.appChangelist()).thenReturn("ami-changelist-1");
        String expected = "ami-changelist-1";
        Assert.assertEquals(expected, AppVersion.getChangelist());

        verify(AppVersion.class).getChangelist();
    }

    @Test
    public void [MethodUnderTest]

    _toString_ReturnsAppString() {
        MockitoAnnotations.initMocks(this);
        when(AppVersion.appBuildJobName()).thenReturn("ami-build-job-1");
        String expected = "ami-build-job-1";
        Assert.assertEquals(expected, AppVersion.toString());

        verify(AppVersion.class).toString();
    }

    @Test
    public void [MethodUnderTest]

    _hashCode_ReturnsAppHashCode() {
        MockitoAnnotations.initMocks(this);
        when(AppVersion.appName()).thenReturn("ami-name-1");
        String expected = "ami-name-1";
        Assert.assertEquals(expected, AppVersion.hashCode());

        verify(AppVersion.class).hashCode();
    }

    @Test
    public void [MethodUnderTest]

    _equals_ReturnsTrueIfEqual() {
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