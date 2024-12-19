package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestParseNameInvalid {

    private static final Pattern APP_VERSION_PATTERN = Pattern.compile(
            "([" + NameConstants.NAME_HYPHEN_CHARS
                    + "]+)-([0-9.a-zA-Z~]+)-(\\w+)(?:[.](\\w+))?(?:\\/([" + NameConstants.NAME_HYPHEN_CHARS + "]+)\\/([0-9]+))?");

    @Mock
    private String amiName;

    @Before
    public void setup() {
        // No need to set up anything here, the tests are separate from the class under test.
    }

    @Test
    public void testParseNameInvalid() {
        AppVersion appVersion = new AppVersion();
        Matcher matcher = APP_VERSION_PATTERN.matcher("test");
        assertNotNull(matcher);
        appVersion.parseName(matcher.toString());
        // No assert needed here, the matcher is not used to verify anything.
    }

}