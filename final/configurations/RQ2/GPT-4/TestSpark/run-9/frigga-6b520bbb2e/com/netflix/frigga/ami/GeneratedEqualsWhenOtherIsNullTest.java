package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import java.util.regex.Pattern;

import static org.junit.Assert.*;

public class GeneratedEqualsWhenOtherIsNullTest {

    @Test
    public void equalsWhenOtherIsNullTest() {
        AppVersion appVersion = AppVersion.parseName("name");
        boolean isEqual = appVersion.equals(null);
        assertFalse(isEqual);
    }

}