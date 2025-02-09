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
public class GeneratedHashCode_WhenAllFieldsAreAvailable_ReturnsHashCode {

    @Mock
    private Pattern getAppVersionPatternMock;

    @Mock
    private String amiNameMock;

    @Test
    public void hashCode_WhenAllFieldsAreAvailable_ReturnsHashCode() {
        AppVersion appVersion = new AppVersion();
        String packageName = "test-package";
        when(appVersion.getVersion()).thenReturn(packageName);
        when(appVersion.getBuildNumber()).thenReturn("test-build-number");
        when(appVersion.getCommit()).thenReturn("test-commit");
        assertEquals(15, appVersion.hashCode());
    }

}