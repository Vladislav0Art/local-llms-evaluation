package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Random;

public class GeneratedCompareTo_DifferentCommitValues_ReturnsNegativeValue {

    @Test
    public void compareTo_DifferentCommitValues_ReturnsNegativeValue() {
        AppVersion appVersion1 = new AppVersion("ami-0c123456abcdefg");
        AppVersion appVersion2 = new AppVersion("ami-0c123456abcdefh");
        assertEquals(-1, appVersion1.compareTo(appVersion2));
    }

}