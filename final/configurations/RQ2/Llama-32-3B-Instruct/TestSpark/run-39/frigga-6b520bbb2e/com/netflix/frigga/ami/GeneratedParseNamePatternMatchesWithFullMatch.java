package com.netflix.frigga.ami;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedParseNamePatternMatchesWithFullMatch {

    @Mock
    private Pattern getAppVersionPatternMock;

    @Test
    public void parseNamePatternMatchesWithFullMatch() {
        when(getAppVersionPatternMock.matcher("^1.9.*$").match()).thenReturn(true);
        AppVersion appVersion = AppVersion.parseName("1.9.x");
        assertEquals(1, appVersion.compareTo(null));
    }

}