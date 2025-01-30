package com.netflix.frigga.ami;

import org.junit.Test;

import java.util.regex.Pattern;

import static org.junit.Assert.*;

public class GeneratedEqualsNullTest {

    @Test
    public void equalsNullTest() {
        AppVersion appVersion = AppVersion.parseName("app-1.1.1-build2/WE-APP-app/2");
        assertFalse(appVersion.equals(null));
    }

}