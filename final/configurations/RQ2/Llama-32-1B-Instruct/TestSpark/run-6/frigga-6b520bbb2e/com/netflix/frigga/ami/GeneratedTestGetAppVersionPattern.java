package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;
import org.junit.jupiter.api.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedTestGetAppVersionPattern {

    private AppVersion parseName(String amiName) {
        return new AppVersionImpl();
    }

    @Test
    public void testGetAppVersionPattern() {
        Pattern pattern = getAppVersionPattern();
        Matcher matcher = pattern.matcher("ami-name");
        assertTrue(matcher.matches());
    }

}