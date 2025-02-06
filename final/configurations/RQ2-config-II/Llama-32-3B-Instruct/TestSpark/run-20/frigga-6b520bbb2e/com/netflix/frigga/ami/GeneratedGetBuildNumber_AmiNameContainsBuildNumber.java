package com.netflix.frigga.ami;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetBuildNumber_AmiNameContainsBuildNumber {

    @Mock
    private NameConstants nameConstants;

    @InjectMocks
    private AppVersion appVersion;

    @Test
    public void getBuildNumber_AmiNameContainsBuildNumber() {
        when(nameConstants.getBuildNumberRegex()).thenReturn(".*\\d+$");
        Matcher matcher = Pattern.compile(appVersion.getAppVersionPattern().pattern()).matcher("123");
        assertTrue(matcher.find());
        assertEquals("123", appVersion.getBuildNumber());
    }

}