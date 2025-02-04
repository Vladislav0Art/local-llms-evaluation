package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedCompareToSameObjectsReturnsZero {

    @Test
    public void compareToSameObjectsReturnsZero() {
        AppVersion first = new AppVersion();
        AppVersion second = first;
        assertEquals(0, first.compareTo(second));
    }

}