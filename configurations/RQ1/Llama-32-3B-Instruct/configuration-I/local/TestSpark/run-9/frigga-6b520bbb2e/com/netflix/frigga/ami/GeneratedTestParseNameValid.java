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
public class GeneratedTestParseNameValid {

    @Mock
    private Pattern appVersionPattern;

    @InjectMocks
    private AppVersion appVersion;

    @Test
    public void testParseNameValid() {
        String amiName = "subscriberha-1.0.0-586499";
        when(appVersionPattern.matcher(amiName)).thenReturn(new Matcher() {
            @Override
            public boolean matches() {
                return true;
            }

            @Override
            public int groupCount() {
                return 6;
            }

            @Override
            public String group(int index) {
                switch (index) {
                    case 0:
                        return "subscriberha";
                    case 1:
                        return "1.0.0-586499";
                    case 2:
                        return null;
                    default:
                        throw new IllegalArgumentException("Invalid group");
                }
            }
        });
        AppVersion parsed = AppVersion.parseName(amiName);
        assertEquals("subscriberha", parsed.getPackageName());
        assertEquals("1.0.0-586499", parsed.getVersion());
        assertNull(parsed.getBuildNumber());
        assertNull(parsed.getCommit());
    }

}