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
public class GeneratedGetCommit_AmiNameContainsCommit {

    @Mock
    private NameConstants nameConstants;

    @InjectMocks
    private AppVersion appVersion;

    @Test
    public void getCommit_AmiNameContainsCommit() {
        when(nameConstants.getCommitRegex()).thenReturn(".*committable\\d+$");
        Matcher matcher = Pattern.compile(appVersion.getAppVersionPattern().pattern()).matcher("commitable456");
        assertTrue(matcher.find());
        assertEquals("commitable456", appVersion.getCommit());
    }

}