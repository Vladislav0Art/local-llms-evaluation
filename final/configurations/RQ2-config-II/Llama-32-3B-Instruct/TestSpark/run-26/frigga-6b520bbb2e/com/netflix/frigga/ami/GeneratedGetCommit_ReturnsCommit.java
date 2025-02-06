package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedGetCommit_ReturnsCommit {

    @Test
    public void getCommit_ReturnsCommit() {
        AppVersion appVersion = new AppVersion("com.netflix.frigga", "1.0", "1234567890");
        assertEquals("1234567890", appVersion.getCommit());
    }

}