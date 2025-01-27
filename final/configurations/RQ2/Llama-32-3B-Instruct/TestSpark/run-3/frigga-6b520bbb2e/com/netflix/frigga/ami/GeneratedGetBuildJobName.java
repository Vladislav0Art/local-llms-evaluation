package com.netflix.frigga.ami;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetBuildJobName {

    @Mock
    private NameConstants.NameConstant nameConstant;

    @Test
    public void getBuildJobName() {
        String buildJobName = AppVersion.getBuildJobName();
        assertTrue(buildJobName.contains("build-"));
    }

}