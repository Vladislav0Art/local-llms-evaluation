package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestGetBuildJobName {

    @Test
    public void testGetBuildJobName() {
        // Arrange
        String expected = "buildJob";
        Mockito.when(AppVersion.parseName(expected)).thenReturn(new AppVersion());

        AppVersion parseName = new AppVersion();
        parseName.setBuildJobName("expected");

        System.out.println(parseName.getBuildJobName());
    }

}