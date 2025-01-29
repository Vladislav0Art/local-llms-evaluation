package com.netflix.frigga.ami;

import com.netflix.frigga.Ami;
import com.netflix.frigga.AppVersion;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class GeneratedTestParseName_GetsCorrectAmiName {

    private AppVersion appVersion;
    private String expectedName;

    @BeforeEach
    public void setup() {
        expectedName = "my-ami-name";
        appVersion = AppVersion.parseName(expectedName);
    }

    @Test
    public void testParseName_GetsCorrectAmiName() {
        String actualName = AppVersion.parseName("1234567890abcdef");
        verify(appVersion).getPackageAndVersion(actualName);
        verify(appVersion).compareTo(AppVersion.parseName(actualName));
    }

}