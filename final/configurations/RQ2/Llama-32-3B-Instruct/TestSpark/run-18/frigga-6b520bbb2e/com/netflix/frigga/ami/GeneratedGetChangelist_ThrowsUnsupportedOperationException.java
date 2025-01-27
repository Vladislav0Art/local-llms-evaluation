package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.mockito.Mockito;

public class GeneratedGetChangelist_ThrowsUnsupportedOperationException {

    @Test
    public void getChangelist_ThrowsUnsupportedOperationException() {
        try {
            AppVersion appVersion = new AppVersion();
            appVersion.getChangelist();
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // Expected
        }
    }

}