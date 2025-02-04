package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.*;

public class GeneratedCompareTo_DifferentPackagesReturnsNegative {

    @Test
    public void compareTo_DifferentPackagesReturnsNegative() {
        AppVersion one = new AppVersion();
        one.packageName = "one";
        one.version = "1.0.0-586499";
        one.buildJobName = "hudson job";
        one.buildNumber = "123";
        AppVersion two = new AppVersion();
        two.packageName = "two";
        two.version = "2.0.0-586499";
        int result = one.compareTo(two);
        assertLessThan(0, result);
    }

}