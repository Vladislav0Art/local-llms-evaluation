package com.netflix.frigga.ami;

import com.netflix.frigga.Ami;
import com.netflix.frigga.AppVersion;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class GeneratedTestGetPackageAndVersion_GetsCorrectDetails {

    private AppVersion appVersion;
    private String expectedName;

    @BeforeEach
    public void setup() {
        expectedName = "my-ami-name";
        appVersion = AppVersion.parseName(expectedName);
    }

    @Test
    public void testGetPackageAndVersion_GetsCorrectDetails() {
        verify(appVersion).getPackageName();
        verify(appVersion).getVersion();
        verify(appVersion).getBuildJobName();
        verify(appVersion).getBuildNumber();
        verify(appVersion).getCommit();
        verify(appVersion).getChangelist();
    }

}