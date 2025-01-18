package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import java.util.regex.Pattern;

import static org.junit.Assert.*;

public class GeneratedEqualsWhenOtherIsNotNullTest {

    @Test
    public void equalsWhenOtherIsNotNullTest() {
        AppVersion appVersion = AppVersion.parseName("name");
        AppVersion other = AppVersion.parseName("other");
        boolean isEqual = appVersion.equals(other);
        assertFalse(isEqual);
    }

}