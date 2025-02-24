package com.netflix.frigga.ami;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedGetCommitTest {

    @Test
    public void getCommitTest() {
        AppVersion appVersion = new AppVersion();
        String commit = appVersion.getCommit();
        assertNotNull(commit);
    }

}