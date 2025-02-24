package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedGetBuildNumberTest1 {

    @Test
    public void getBuildNumberTest1() {
        AppVersion appVersion = new AppVersion();

        String result = appVersion.getBuildNumber();

        assertNotNull(result);
    }

}