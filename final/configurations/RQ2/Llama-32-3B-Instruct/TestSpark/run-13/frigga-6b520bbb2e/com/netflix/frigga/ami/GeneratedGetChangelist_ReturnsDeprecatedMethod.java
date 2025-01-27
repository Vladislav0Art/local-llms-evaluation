package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetChangelist_ReturnsDeprecatedMethod {

    @Test
    public void getChangelist_ReturnsDeprecatedMethod() {
        AppVersion appVersion = new AppVersion();
        assertNull(appVersion.getChangelist());
    }

}