package com.netflix.frigga.ami;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetCommit_WhenBuildJobNameIsAvailable_ReturnsCommit {

    @Mock
    private Pattern getAppVersionPatternMock;

    @Mock
    private String amiNameMock;

    @Test
    public void getCommit_WhenBuildJobNameIsAvailable_ReturnsCommit() {
        AppVersion appVersion = new AppVersion();
        String buildJobName = "test-build-job-name";
        when(appVersion.getBuildJobName()).thenReturn(buildJobName);
        assertEquals(buildJobName, appVersion.getCommit());
    }

}