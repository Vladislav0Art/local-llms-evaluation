package com.netflix.frigga.ami;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedParseName_MatchWithMultipleGroups {

    @Mock
    private Pattern appVersionPattern;

    @InjectMocks
    private AppVersion appVersion;

    @Test
    public void parseName_MatchWithMultipleGroups() {
        when(appVersionPattern.matcher(anyString())).thenReturn(new Matcher("subscriberha-1.0.0-586499.h150"));
        assertEquals("subscriberha-1.0.0-586499", appVersion.parseName("subscriberha-1.0.0-586499.h150").toString());
    }

}