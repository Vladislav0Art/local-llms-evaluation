package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedEquals_MatchesVersionsReturnsTrue {

    @Test
    public void equals_MatchesVersionsReturnsTrue() {
        AppVersion appVersion1 = new AppVersion("ami-123");
        AppVersion appVersion2 = new AppVersion("ami-123");
        assertTrue(appVersion1.equals(appVersion2));
    }

}