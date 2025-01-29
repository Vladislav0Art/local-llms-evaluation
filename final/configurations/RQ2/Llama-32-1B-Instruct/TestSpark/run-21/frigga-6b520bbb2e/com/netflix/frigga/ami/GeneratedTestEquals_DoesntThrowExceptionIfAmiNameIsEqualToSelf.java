package com.netflix.frigga.ami;

import com.netflix.frigga.Ami;
import com.netflix.frigga.AppVersion;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class GeneratedTestEquals_DoesntThrowExceptionIfAmiNameIsEqualToSelf {

    private AppVersion appVersion;
    private String expectedName;

    @BeforeEach
    public void setup() {
        expectedName = "my-ami-name";
        appVersion = AppVersion.parseName(expectedName);
    }

    @Test
    public void testEquals_DoesntThrowExceptionIfAmiNameIsEqualToSelf() {
        AppVersion otherAppVersion = new AppVersion(AppVersion.parseName("1234567890abcdef"));
        boolean result = appVersion.equals(otherAppVersion);
        assert (result);
    }

}