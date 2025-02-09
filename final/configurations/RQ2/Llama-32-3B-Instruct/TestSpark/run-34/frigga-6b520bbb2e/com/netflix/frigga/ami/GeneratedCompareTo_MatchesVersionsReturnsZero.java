package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedCompareTo_MatchesVersionsReturnsZero {

    @Test
    public void compareTo_MatchesVersionsReturnsZero() {
        AppVersion appVersion1 = new AppVersion("ami-123");
        AppVersion appVersion2 = new AppVersion("ami-456");
        assertEquals(0, appVersion1.compareTo(appVersion2));
    }

}