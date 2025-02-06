package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedEquals_ThrowsNullPointerException {

    @Test
    public void equals_ThrowsNullPointerException() {
        assertThrows(NullPointerException.class, () -> AppVersion.parseName("ami-1234567890").equals(null));
    }

}