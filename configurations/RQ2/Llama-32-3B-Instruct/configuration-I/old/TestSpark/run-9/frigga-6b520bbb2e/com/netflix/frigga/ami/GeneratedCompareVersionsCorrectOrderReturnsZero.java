package com.netflix.frigga.ami;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.regex.Pattern;

public class GeneratedCompareVersionsCorrectOrderReturnsZero {

    @Test
    public void compareVersionsCorrectOrderReturnsZero() {
        AppVersion appVersion1 = new AppVersion("1.0-2.0");
        AppVersion appVersion2 = new AppVersion("2.0-3.0");
        int result = appVersion1.compareTo(appVersion2);
        // Test implementation
    }

}