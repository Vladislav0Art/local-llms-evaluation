package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import com.netflix.frigga.ami.AppVersion;

public class GeneratedBuildNumberTest {

    @Test
    public void buildNumberTest() {
        AppVersion appVersion = new AppVersion();
        String actual = appVersion.getBuildNumber();
        assertNotNull(actual);
    }

}