package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedHashCode_ReturnsExpectedValue {

    @Test
    public void hashCode_ReturnsExpectedValue() {
        int hashcode = AppVersion.hashCode();
        // assuming it's a hash code, not an object id
        assertTrue(hashcode != 0); // if equals uses hash code for equality
    }

}