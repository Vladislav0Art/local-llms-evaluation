package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedHashCode {

    @Test
    public void hashCode() {
        AppVersion appVersion1 = AppVersion.parseName("amarth-1234567890");
        AppVersion appVersion2 = AppVersion.parseName("amarth-9876543210");
        assertNotEquals(appVersion1.hashCode(), appVersion2.hashCode());
    }

}