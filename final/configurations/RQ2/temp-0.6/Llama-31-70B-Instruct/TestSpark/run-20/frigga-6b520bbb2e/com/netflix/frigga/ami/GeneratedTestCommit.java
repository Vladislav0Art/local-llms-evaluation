package com.netflix.frigga.ami;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedTestCommit {

    AppVersion appVersion;

    @Before
    public void setup() {
        appVersion = new AppVersion();
    }

    @Test
    public void testCommit() {
        String commit = "commit";
        appVersion.setCommit(commit);
        assertEquals(commit, appVersion.getCommit());
    }

}