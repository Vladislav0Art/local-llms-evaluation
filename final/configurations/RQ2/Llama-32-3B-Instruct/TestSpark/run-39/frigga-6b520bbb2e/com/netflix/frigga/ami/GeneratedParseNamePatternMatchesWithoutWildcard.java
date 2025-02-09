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
public class GeneratedParseNamePatternMatchesWithoutWildcard {

    @Mock
    private Pattern getAppVersionPatternMock;

    @Test
    public void parseNamePatternMatchesWithoutWildcard() {
        when(getAppVersionPatternMock.matcher("^[1-9][0-9]*$").match()).thenReturn(true);
        AppVersion appVersion = AppVersion.parseName("10");
        assertEquals(2, appVersion.compareTo(null));
    }

}