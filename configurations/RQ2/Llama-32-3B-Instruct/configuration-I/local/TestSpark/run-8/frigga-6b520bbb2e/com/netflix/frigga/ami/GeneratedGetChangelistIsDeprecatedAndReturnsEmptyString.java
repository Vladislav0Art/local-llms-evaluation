package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedGetChangelistIsDeprecatedAndReturnsEmptyString {

    @Test
    public void getChangelistIsDeprecatedAndReturnsEmptyString() {
        AppVersion appVersion = new AppVersion();
        assertNotNull(appVersion.getChangelist());
        assertEquals("", appVersion.getChangelist());
    }

}