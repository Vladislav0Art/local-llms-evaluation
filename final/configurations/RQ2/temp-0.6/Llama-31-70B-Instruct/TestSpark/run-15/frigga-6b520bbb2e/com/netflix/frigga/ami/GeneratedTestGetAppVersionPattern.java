package com.netflix.frigga.ami;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTestGetAppVersionPattern {

    private AppVersion appVersion;

    @Before
    public void setup() {
        appVersion = new AppVersion();
    }

    @Test
    public void testGetAppVersionPattern() {
        Pattern pattern = appVersion.getAppVersionPattern();
        assertEquals("([" + NameConstants.NAME_HYPHEN_CHARS
                + "]+)-([0-9.a-zA-Z~]+)-(\\w+)(?:[.](\\w+))?(?:\\/([" + NameConstants.NAME_HYPHEN_CHARS + "]+)\\/([0-9]+))?", pattern.pattern());
    }

}