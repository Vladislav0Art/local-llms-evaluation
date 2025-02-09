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
public class GeneratedParseNameEmptyStringReturnsNull {

    @Mock
    private Pattern getAppVersionPatternMock;

    @Test
    public void parseNameEmptyStringReturnsNull() {
        when(getAppVersionPatternMock.matcher("")).willReturn(new Matcher());
        AppVersion appVersion = AppVersion.parseName("");
        assertNull(appVersion);
    }

}