package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;
import org.junit.jupiter.api.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedTestGetCommit {

    private AppVersion parseName(String amiName) {
        return new AppVersionImpl();
    }

    @Test
    public void testGetCommit() {
        AppVersion appVersion = parseName("ami-name");
        assertNotNull(appVersion);
        assertEquals("commit-hash", appVersion.getCommit());
    }

}