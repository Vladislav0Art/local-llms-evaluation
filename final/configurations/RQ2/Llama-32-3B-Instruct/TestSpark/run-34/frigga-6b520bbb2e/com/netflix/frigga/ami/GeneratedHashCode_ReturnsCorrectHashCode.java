package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedHashCode_ReturnsCorrectHashCode {

    @Test
    public void hashCode_ReturnsCorrectHashCode() {
        AppVersion appVersion1 = new AppVersion("ami-123");
        AppVersion appVersion2 = new AppVersion("ami-456");
        assertNotEquals(appVersion1.hashCode(), appVersion2.hashCode());
    }

}