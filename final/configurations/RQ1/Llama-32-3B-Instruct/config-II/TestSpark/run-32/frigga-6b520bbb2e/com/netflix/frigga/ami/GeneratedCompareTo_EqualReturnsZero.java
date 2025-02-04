package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.*;

public class GeneratedCompareTo_EqualReturnsZero {

    @Test
    public void compareTo_EqualReturnsZero() {
        AppVersion one = new AppVersion();
        one.packageName = "one";
        one.version = "1.0.0-586499";
        one.buildJobName = "hudson job";
        one.buildNumber = "123";
        AppVersion two = one;
        int result = one.compareTo(two);
        assertEquals(0, result);
    }

}