package com.netflix.frigga.ami;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetChangelist_ReturnsCorrectChangelist {

    @Mock
    private NameConstants nameConstants;

    public static final String AMI_NAME = "ami-name";
    public static final String PACKAGES = "packages";
    public static final int VERSION = 1;
    public static final String BUILD_JOB_NAME = "build-job-name";
    public static final String BUILD_NUMBER = "build-number";
    public static final String COMMIT = "commit";

    @Test
    public void getChangelist_ReturnsCorrectChangelist() {
        @Deprecated
        String changelist = "changelist";
        when(nameConstants.getChangelist()).thenReturn(changelist);
        AppVersion appVersion = new AppVersion();
        assertEquals(changelist, appVersion.getChangelist());
    }

}