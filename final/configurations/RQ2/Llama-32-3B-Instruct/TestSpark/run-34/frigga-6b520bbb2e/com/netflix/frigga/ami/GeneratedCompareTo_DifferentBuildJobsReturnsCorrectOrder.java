package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedCompareTo_DifferentBuildJobsReturnsCorrectOrder {

    @Test
    public void compareTo_DifferentBuildJobsReturnsCorrectOrder() {
        AppVersion appVersion1 = new AppVersion("ami-123");
        AppVersion appVersion2 = new AppVersion("ami-456");
        assertTrue(appVersion1.compareTo(appVersion2) < 0);
    }

}