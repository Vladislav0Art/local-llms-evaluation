package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedEquals_DoesNotMatchDifferentBuildNumbers Test {

    @Test
    public void equals_DoesNotMatchDifferentBuildNumbers

    Test() {
        AppVersion version1 = new AppVersion("1.0-123456789");
        AppVersion version2 = new AppVersion("1.0-123456780");
        assertFalse(version1.equals(version2));
    }

}