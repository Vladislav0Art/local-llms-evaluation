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
public class GeneratedParseName_MatchesPattern_ReturnsParsedAppVersionWithBuildInfo {

    @Mock
    private Pattern getAppVersionPattern();

    @Mock
    private NameConstants NameConstants;

    @Test
    public void parseName_MatchesPattern_ReturnsParsedAppVersionWithBuildInfo() {
        Pattern pattern = Pattern.compile("^[a-z]+\\.[a-z]+-build-[0-9]+$");
        Matcher matcher = new Matcher();
        when(NameConstants.getAppVersionParser()).thenReturn(matcher);
        when(pattern.matcher("test.123-build-456")).thenReturn(matcher);
        AppVersion appVersion = AppVersion.parseName("test.123-build-456");
        assertEquals("test", appVersion.getPackageName());
        assertEquals("123", appVersion.getVersion());
        assertEquals("build-456", appVersion.getBuildJobName());
    }

}