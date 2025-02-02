package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.lang.reflect.Field;

public class GeneratedGivenValidAMITagMatchesPattern {

    private AppVersion parseName(String amiName) {
        return new AppVersion().parseName(amiName);
    }

    @Test
    public void givenValidAMITagMatchesPattern() {
        Matcher matcher = Pattern.compile(
                "([" + AppVersion.NameConstants.NAME_HYPHEN_CHARS
                        + "]+)-([0-9.a-zA-Z~]+)-(\\w+)(?:[.](\\w+))?(?:\\/([" + AppVersion.NameConstants.NAME_HYPHEN_CHARS + "]+)\\/([0-9]+))?").matcher("subscriberha-1.0.0-h150");
        assertTrue(matcher.matches());
    }

}