package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Pattern;

public class GeneratedEqualsNullTest {

    @Test
    public void equalsNullTest() {
        String amiName = "subscriberha-1.0.0-586499.h150/WE-WAPP-subscriberha/150";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertFalse(appVersion.equals(null));
    }

}