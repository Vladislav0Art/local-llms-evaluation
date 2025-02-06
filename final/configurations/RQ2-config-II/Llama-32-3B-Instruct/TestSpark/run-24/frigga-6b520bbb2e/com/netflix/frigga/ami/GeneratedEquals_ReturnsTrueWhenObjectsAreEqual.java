package com.netflix.frigga.ami;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedEquals_ReturnsTrueWhenObjectsAreEqual {

    @Mock
    private Pattern getAppVersionPatternMock;

    @Mock
    private String amiNameMock;

    public static final String APP_VERSION_PATTERN = "app_version";

    @Test
    public void equals_ReturnsTrueWhenObjectsAreEqual() {
        AppVersion first = new AppVersion();
        AppVersion second = new AppVersion();
        when(AppVersion.parseName(amiNameMock)).thenReturn(first);
        when(AppVersion.parseName("test-ami-name")).thenReturn(second);
        assertTrue(first.equals(second));
    }

}