package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedHashCode_ReturnsCorrectHashCode {

    @Test
    public void hashCode_ReturnsCorrectHashCode() {
        int hashCode = AppVersion.hashCode();
        assertEquals(hashCode, 1234567890);
    }

}