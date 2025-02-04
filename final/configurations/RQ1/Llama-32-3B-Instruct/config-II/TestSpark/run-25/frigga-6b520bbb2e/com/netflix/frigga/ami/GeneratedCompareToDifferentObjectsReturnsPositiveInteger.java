package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedCompareToDifferentObjectsReturnsPositiveInteger {

    @Test
    public void compareToDifferentObjectsReturnsPositiveInteger() {
        AppVersion first = new AppVersion("A", "1.0.0-586499");
        AppVersion second = new AppVersion("B", "2.0.0-587499");
        assertEquals(1, first.compareTo(second));
    }

}