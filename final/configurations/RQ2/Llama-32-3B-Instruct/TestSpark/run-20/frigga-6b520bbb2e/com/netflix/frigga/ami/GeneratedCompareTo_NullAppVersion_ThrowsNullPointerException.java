package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedCompareTo_NullAppVersion_ThrowsNullPointerException {

    @Test
    public void compareTo_NullAppVersion_ThrowsNullPointerException() {
        try {
            new AppVersion().compareTo(null);
            fail();
        } catch (NullPointerException e) {
            // Expected exception
        }
    }

}