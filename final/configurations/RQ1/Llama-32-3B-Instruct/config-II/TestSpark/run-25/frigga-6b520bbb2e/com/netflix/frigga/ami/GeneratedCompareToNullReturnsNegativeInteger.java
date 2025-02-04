package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedCompareToNullReturnsNegativeInteger {

    @Test
    public void compareToNullReturnsNegativeInteger() {
        AppVersion first = new AppVersion();
        AppVersion second = null;
        assertEquals(-1, first.compareTo(second));
    }

}