package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedEquals_ObjectOfDifferentClasses_ReturnsFalse {

    @Test
    public void equals_ObjectOfDifferentClasses_ReturnsFalse() {
        AppVersion obj1 = new AppVersion();
        Object obj2 = "invalid";
        assertFalse(obj1.equals(obj2));
    }

}