package com.netflix.frigga.ami;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetBuildJobName_ReturnsCorrectJobName {

    @Mock
    private String amiName;

    @Mock
    private Pattern pattern;

    @Test
    public void getBuildJobName_ReturnsCorrectJobName() {
        String jobName = "frigga-build";
        when(com.netflix.frigga.ami.AppVersion.parseName(anyString())).thenReturn(new AppVersion("1", "2", "3"));
        AppVersion appVersion = new AppVersion("1", "2", "3");
        assertEquals(jobName, appVersion.getBuildJobName());
    }

}