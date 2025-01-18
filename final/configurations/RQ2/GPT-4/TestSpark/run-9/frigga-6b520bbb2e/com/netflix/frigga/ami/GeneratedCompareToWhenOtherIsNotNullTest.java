package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import java.util.regex.Pattern;

import static org.junit.Assert.*;

public class GeneratedCompareToWhenOtherIsNotNullTest {

    @Test
    public void compareToWhenOtherIsNotNullTest() {
        AppVersion appVersion = AppVersion.parseName("name");
        AppVersion other = AppVersion.parseName("other");
        int result = appVersion.compareTo(other);
        assertTrue(result == 0 || result == -1);
    }

}