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
public class GeneratedGetChangelist_AmiNameContainsChangelist {

    @Mock
    private NameConstants nameConstants;

    @InjectMocks
    private AppVersion appVersion;

    @Test
    public void getChangelist_AmiNameContainsChangelist() {
        @Deprecated
                when(nameConstants.getChangelistRegex()).thenReturn(".*changelist\\d+$");
        Matcher matcher = Pattern.compile(appVersion.getAppVersionPattern().pattern()).matcher("changelist456");
        assertTrue(matcher.find());
        assertEquals("changelist456", appVersion.getChangelist());
    }

}