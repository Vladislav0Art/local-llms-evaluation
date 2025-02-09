package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetChangelist_ReturnsDeprecatedValue {

    @Test
    public void getChangelist_ReturnsDeprecatedValue() {
        AppVersion appVersion = new AppVersion("ami-123");
        assertNotNull(appVersion.getChangelist()); // deprecated method, but should return value
    }

}