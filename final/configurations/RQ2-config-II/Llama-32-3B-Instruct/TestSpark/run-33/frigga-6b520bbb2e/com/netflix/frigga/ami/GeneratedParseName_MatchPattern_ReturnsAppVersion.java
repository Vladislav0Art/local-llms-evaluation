package com.netflix.frigga.ami;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedParseName_MatchPattern_ReturnsAppVersion {

    @Mock
    private Pattern pattern;

    @Test
    public void parseName_MatchPattern_ReturnsAppVersion() {
        when(pattern.matcher(NameConstants.AMI_NAME)).thenReturn(Matcher.matches());
        AppVersion appVersion = AppVersion.parseName(NameConstants.AMI_NAME);
        assertNotNull(appVersion);
    }

}