package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedGetChangelist_DecomplementedReturnsExpectedValue {

    @Test
    public void getChangelist_DecomplementedReturnsExpectedValue() {
        AppVersion appVersion = new AppVersion("1.0");
        assertNotNull(appVersion.getChangelist());
    }

}