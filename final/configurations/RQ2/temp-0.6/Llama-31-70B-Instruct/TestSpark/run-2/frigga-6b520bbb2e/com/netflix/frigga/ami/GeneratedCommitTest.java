package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import com.netflix.frigga.ami.AppVersion;

public class GeneratedCommitTest {

    @Test
    public void commitTest() {
        AppVersion appVersion = new AppVersion();
        String actual = appVersion.getCommit();
        assertNotNull(actual);
    }

}