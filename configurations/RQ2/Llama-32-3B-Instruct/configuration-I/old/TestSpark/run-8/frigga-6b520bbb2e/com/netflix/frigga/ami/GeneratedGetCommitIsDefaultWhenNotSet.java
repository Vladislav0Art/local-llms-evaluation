package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedGetCommitIsDefaultWhenNotSet {

    @Test
    public void getCommitIsDefaultWhenNotSet() {
        AppVersion appVersion = new AppVersion();
        assertNotNull(appVersion.getCommit());
        assertTrue(appVersion.getCommit().contains("default"));
    }

}