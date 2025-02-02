package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedGetChangelist_ValidAppVersion_ReturnsChangelist {

    @Test
    public void getChangelist_ValidAppVersion_ReturnsChangelist() {
        AppVersion appVersion = new AppVersion();
        appVersion.changelist = "abcdefg";
        assertEquals("abcdefg", appVersion.getChangelist());
    }

}