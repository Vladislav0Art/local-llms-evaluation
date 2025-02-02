package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedGetCommit_ValidAppVersion_ReturnsCommit {

    @Test
    public void getCommit_ValidAppVersion_ReturnsCommit() {
        AppVersion appVersion = new AppVersion();
        appVersion.commit = "abc123def456";
        assertEquals("abc123def456", appVersion.getCommit());
    }

}