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
public class GeneratedEquals_WhenAllFieldsAreAvailable_ReturnsEquals {

    @Mock
    private Pattern getAppVersionPatternMock;

    @Mock
    private String amiNameMock;

    @Test
    public void equals_WhenAllFieldsAreAvailable_ReturnsEquals() {
        AppVersion appVersion = new AppVersion();
        String packageName = "test-package";
        when(appVersion.getVersion()).thenReturn(packageName);
        when(appVersion.getBuildNumber()).thenReturn("test-build-number");
        when(appVersion.getCommit()).thenReturn("test-commit");
        AppVersion otherAppVersion = new AppVersion();
        assertEquals(true, appVersion.equals(otherAppVersion));
    }

}