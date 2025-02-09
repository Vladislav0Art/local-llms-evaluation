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
public class GeneratedGetChangelist_WhenDeprecatedIsCalled_ReturnsDeprecatedChangelist {

    @Mock
    private Pattern getAppVersionPatternMock;

    @Mock
    private String amiNameMock;

    @Test
    public void getChangelist_WhenDeprecatedIsCalled_ReturnsDeprecatedChangelist() {
        AppVersion appVersion = new AppVersion();
        String changelist = "test-changelist";
        when(appVersion.getBuildNumber()).thenReturn(changelist);
        assertEquals(changelist, appVersion.getChangelist());
    }

}