package com.netflix.frigga.ami;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

import org.mockito.Mock;

import java.util.regex.Pattern;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetBuildJobNameTest {

    @Test
    public void getBuildJobNameTest() {
        AppVersion appVersion = AppVersion.parseName("version-1.0-BuildJob");
        assertEquals("BuildJob", appVersion.getBuildJobName());
    }

}