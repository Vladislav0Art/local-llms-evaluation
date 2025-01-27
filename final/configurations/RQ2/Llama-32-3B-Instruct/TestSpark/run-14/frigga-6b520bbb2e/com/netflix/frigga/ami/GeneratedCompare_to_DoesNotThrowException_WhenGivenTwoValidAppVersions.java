package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.netflix.frigga.NameConstants;
import org.mockito.Mockito;

public class GeneratedCompare_to_DoesNotThrowException_WhenGivenTwoValidAppVersions {

    @Test
    public void compare_to_DoesNotThrowException_WhenGivenTwoValidAppVersions() {
        AppVersion appVersion1 = new AppVersion("1.2.3-4", "com.example.app");
        AppVersion appVersion2 = new AppVersion("5.6.7-8", "com.example.app2");
        int result = appVersion1.compareTo(appVersion2);
        assertEquals(-1, result);
    }

}