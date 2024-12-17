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
public class GeneratedTestParseNameInvalid {

    @Mock
    private Pattern appVersionPattern;

    @InjectMocks
    private AppVersion appVersion;

    @Test
    public void testParseNameInvalid() {
        String amiName = "invalid";
        when(appVersionPattern.matcher(amiName)).thenReturn(new Matcher() {
            @Override
            public boolean matches() {
                return true;
            }

            @Override
            public int groupCount() {
                return 0;
            }

            @Override
            public String group(int index) {
                throw new IllegalArgumentException("Invalid group");
            }
        });
        AppVersion parsed = AppVersion.parseName(amiName);
        assertNull(parsed.getPackageName());
        assertNull(parsed.getVersion());
        assertNull(parsed.getBuildNumber());
        assertNull(parsed.getCommit());
    }

}