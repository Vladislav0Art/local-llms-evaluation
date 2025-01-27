package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedEqualsNullAppVersion_ReturnsFalse {

    @Test
    public void equalsNullAppVersion_ReturnsFalse() {
        AppVersion appVersion1 = new AppVersion("1.0.0-1234567890");
        assertTrue(!appVersion1.equals(null));
    }

}