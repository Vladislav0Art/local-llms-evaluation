package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedGetChangelist_DeprecatedReturnsNull {

    @Test
    public void getChangelist_DeprecatedReturnsNull() {
        AppVersion appVersion = new AppVersion("ami-1234abcde7890fghi123");
        assertEquals(null, appVersion.getChangelist());
    }

}