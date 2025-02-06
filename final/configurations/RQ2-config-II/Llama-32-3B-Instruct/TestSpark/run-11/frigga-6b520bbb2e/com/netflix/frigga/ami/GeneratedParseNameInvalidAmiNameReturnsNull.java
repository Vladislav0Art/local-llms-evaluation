package com.netflix.frigga.ami;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedParseNameInvalidAmiNameReturnsNull {

    @Mock
    private Pattern getAppVersionPatternMock();

    @Test
    public void parseNameInvalidAmiNameReturnsNull() {
        String amiName = "invalid-ami-name";
        when(getAppVersionPatternMock()).thenReturn(Pattern.compile(".*-([a-zA-Z0-9]+).*"));
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertNull(appVersion);
    }

}