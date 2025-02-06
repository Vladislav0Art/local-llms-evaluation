package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetChangelist_ThrowsNullPointerExceptionOnDeprecatedMethod {

    @Test
    public void getChangelist_ThrowsNullPointerExceptionOnDeprecatedMethod() {
        try {
            AppVersion appVersion = new AppVersion();
            appVersion.getChangelist();
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // Expected
        }
    }

}