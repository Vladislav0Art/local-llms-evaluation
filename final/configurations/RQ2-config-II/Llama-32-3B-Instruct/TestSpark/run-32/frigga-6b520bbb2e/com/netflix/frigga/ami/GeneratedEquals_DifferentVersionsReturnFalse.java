package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedEquals_DifferentVersionsReturnFalse {

    @Test
    public void equals_DifferentVersionsReturnFalse() {
        AppVersion version1 = new AppVersion("ami-1234", 12, 34);
        AppVersion version2 = new AppVersion("ami-5678", 23, 45);
        assertFalse(version1.equals(version2));
    }

}