package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.netflix.frigga.NameConstants;
import org.mockito.Mockito;

public class GeneratedHashCode_DoesNotThrowException_WhenGivenANormalAppVersion {

    @Test
    public void hashCode_DoesNotThrowException_WhenGivenANormalAppVersion() {
        AppVersion appVersion = new AppVersion("1.2.3-4", "com.example.app");
        int expectedHash = 1234 + 42;
        assertEquals(expectedHash, appVersion.hashCode());
    }

}