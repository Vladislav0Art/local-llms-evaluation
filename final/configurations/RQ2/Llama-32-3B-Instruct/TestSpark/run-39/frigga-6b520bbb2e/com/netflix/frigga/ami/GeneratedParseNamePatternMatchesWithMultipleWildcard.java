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
public class GeneratedParseNamePatternMatchesWithMultipleWildcard {

    @Mock
    private Pattern getAppVersionPatternMock;

    @Test
    public void parseNamePatternMatchesWithMultipleWildcard() {
        when(getAppVersionPatternMock.matcher("^([1-9][0-9]*)([.].*)+$").match()).thenReturn(true);
        AppVersion appVersion = AppVersion.parseName("10.x.y");
        assertEquals(4, appVersion.compareTo(null));
    }

}