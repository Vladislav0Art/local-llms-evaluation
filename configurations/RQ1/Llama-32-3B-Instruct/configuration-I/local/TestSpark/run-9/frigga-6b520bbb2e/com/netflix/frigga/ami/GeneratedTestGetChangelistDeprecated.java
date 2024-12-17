package com.netflix.frigga.ami;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestGetChangelistDeprecated {

    @Mock
    private Pattern appVersionPattern;

    @InjectMocks
    private AppVersion appVersion;

    @Test
    public void testGetChangelistDeprecated() {
        appVersion.setChangelist("123");
        assertEquals("123", appVersion.getChangelist());
        assertThrows(IllegalStateException:: class,() -> appVersion.getChangelist());
    }

}