package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedBuildBuildJobNameReturnsCorrectBuildJobName {

    @Test
    public void buildBuildJobNameReturnsCorrectBuildJobName() {
        assertEquals("alias-amzn2-ami-hvm-x86-64-gp2", new AppVersionBuilder().buildBuildJobName()).getBuildJobName();
    }

}