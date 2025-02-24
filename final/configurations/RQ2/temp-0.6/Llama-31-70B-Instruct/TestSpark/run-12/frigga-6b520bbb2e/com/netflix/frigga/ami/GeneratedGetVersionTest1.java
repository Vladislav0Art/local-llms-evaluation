package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedGetVersionTest1 {

    @Test
    public void getVersionTest1() {
        AppVersion appVersion = new AppVersion();

        String result = appVersion.getVersion();

        assertNotNull(result);
    }

}