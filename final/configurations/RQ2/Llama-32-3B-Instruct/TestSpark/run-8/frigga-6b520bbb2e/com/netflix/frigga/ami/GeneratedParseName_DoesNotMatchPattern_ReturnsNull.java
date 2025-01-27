package com.netflix.frigga.ami;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedParseName_DoesNotMatchPattern_ReturnsNull {

    @Mock
    private Pattern getAppVersionPattern();

    @Mock
    private NameConstants NameConstants;

    @Test
    public void parseName_DoesNotMatchPattern_ReturnsNull() {
        Pattern pattern = Pattern.compile("^[a-z]+\\.[a-z]+$");
        Matcher matcher = new Matcher();
        when(NameConstants.getAppVersionParser()).thenReturn(matcher);
        when(pattern.matcher("invalid.abc")).thenReturn(matcher);
        AppVersion appVersion = AppVersion.parseName("invalid.abc");
        assertNull(appVersion);
    }

}