package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import java.util.regex.Pattern;

import static org.junit.Assert.*;

public class GeneratedCompareToWhenOtherIsNullTest {

    @Test
    public void compareToWhenOtherIsNullTest() {
        AppVersion appVersion = AppVersion.parseName("name");
        int result = appVersion.compareTo(null);
        assertEquals(1, result);
    }

}