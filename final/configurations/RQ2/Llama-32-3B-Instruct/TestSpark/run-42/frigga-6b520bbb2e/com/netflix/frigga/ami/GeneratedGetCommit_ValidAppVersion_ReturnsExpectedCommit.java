package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedGetCommit_ValidAppVersion_ReturnsExpectedCommit {

    @Test
    public void getCommit_ValidAppVersion_ReturnsExpectedCommit() {
        AppVersion appVersion = new AppVersion("ami-1234abcde7890fghi123");
        String commit = appVersion.getCommit();
        assertNotNull(commit);
    }

}