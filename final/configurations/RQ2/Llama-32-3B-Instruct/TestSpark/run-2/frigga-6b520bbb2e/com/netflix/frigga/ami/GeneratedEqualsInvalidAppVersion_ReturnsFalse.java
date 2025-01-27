package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedEqualsInvalidAppVersion_ReturnsFalse {

    @Test
    public void equalsInvalidAppVersion_ReturnsFalse() {
        AppVersion appVersion1 = new AppVersion("1.0.0-1234567890");
        AppVersion appVersion2 = new AppVersion(" invalid ");
        assertFalse(appVersion1.equals(appVersion2));
    }

}