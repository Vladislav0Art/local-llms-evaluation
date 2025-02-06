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
public class GeneratedParseName_NoMatch_ReturnsNull {

    @Mock
    private Pattern pattern;

    @Test
    public void parseName_NoMatch_ReturnsNull() {
        when(pattern.matcher("non-matching-name")).thenReturn(Matcher.reset());
        AppVersion appVersion = AppVersion.parseName("non-matching-name");
        assertNull(appVersion);
    }

}