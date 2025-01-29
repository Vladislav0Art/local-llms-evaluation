package com.netflix.frigga.ami;

import com.netflix.frigga.Ami;
import com.netflix.frigga.AppVersion;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class GeneratedTestParseName_DoesntThrowExceptionIfInvalidAmiName {

    private AppVersion appVersion;
    private String expectedName;

    @BeforeEach
    public void setup() {
        expectedName = "my-ami-name";
        appVersion = AppVersion.parseName(expectedName);
    }

    @Test
    public void testParseName_DoesntThrowExceptionIfInvalidAmiName() {
        String invalidName = "invalid-ami-name";
        AppVersion.parseName(invalidName);
        // No exception is expected
    }

}