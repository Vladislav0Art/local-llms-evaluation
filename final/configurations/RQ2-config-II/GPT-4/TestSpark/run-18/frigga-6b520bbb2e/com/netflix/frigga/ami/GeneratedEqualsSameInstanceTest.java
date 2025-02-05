package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import java.util.regex.Pattern;

import static org.junit.Assert.*;

public class GeneratedEqualsSameInstanceTest {

    @Test
    public void equalsSameInstanceTest() {
        AppVersion version = AppVersion.parseName("testVersion");
        assertTrue(version.equals(version));
    }

}