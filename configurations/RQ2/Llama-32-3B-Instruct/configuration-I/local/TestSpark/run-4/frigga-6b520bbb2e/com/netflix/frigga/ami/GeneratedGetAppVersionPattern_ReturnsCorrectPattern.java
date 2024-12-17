package com.netflix.frigga.ami;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetAppVersionPattern_ReturnsCorrectPattern {

    @Mock
    private Pattern getAppVersionPattern();

    @Test
    public void getAppVersionPattern_ReturnsCorrectPattern() {
        when(getAppVersionPattern()).thenReturn(Pattern.compile("^\\d+\\.\\d+\\.\\d+-[a-zA-Z0-9]+$"));
        assertEquals(true, getAppVersionPattern().matcher("1.2.3-abcde").matches());
    }

}