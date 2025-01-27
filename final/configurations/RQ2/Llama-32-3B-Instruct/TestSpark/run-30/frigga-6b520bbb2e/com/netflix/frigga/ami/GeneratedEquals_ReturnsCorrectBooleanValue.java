package com.netflix.frigga.ami;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedEquals_ReturnsCorrectBooleanValue {

    @Mock
    private NameConstants nameConstants;

    public static final String AMI_NAME = "ami-name";
    public static final String PACKAGES = "packages";
    public static final int VERSION = 1;
    public static final String BUILD_JOB_NAME = "build-job-name";
    public static final String BUILD_NUMBER = "build-number";
    public static final String COMMIT = "commit";

    @Test
    public void equals_ReturnsCorrectBooleanValue() {
        AppVersion appVersion1 = new AppVersion();
        AppVersion appVersion2 = new AppVersion();
        boolean result = appVersion1.equals(appVersion2);
        assertFalse(result);
    }

}