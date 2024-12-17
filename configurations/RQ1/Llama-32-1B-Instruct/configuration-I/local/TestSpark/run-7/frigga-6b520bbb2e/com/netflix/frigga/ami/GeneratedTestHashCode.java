package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedTestHashCode {

    private AppVersion appVersion = new AppVersion();

    @Test
    public void testHashCode() {
        // Arrange
        String amiName = "subscriberha-1.0.0-586499";

        // Act and Assert
        int hashCode = appVersion.hashCode();
        assertEquals(123456789, hashCode);
    }

}