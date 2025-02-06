package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedEquals_ObjectIsNull_ReturnsFalse {

    @Test
    public void equals_ObjectIsNull_ReturnsFalse() {
        AppVersion obj1 = new AppVersion();
        AppVersion obj2 = null;
        assertFalse(obj1.equals(obj2));
    }

}