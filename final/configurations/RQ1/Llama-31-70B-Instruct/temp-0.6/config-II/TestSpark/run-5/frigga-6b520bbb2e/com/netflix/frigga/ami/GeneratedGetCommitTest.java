package com.netflix.frigga.ami;

import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetCommitTest {

    @Test
    public void getCommitTest() {
        AppVersion appVersion = new AppVersion();
        assertNull(appVersion.getCommit());
    }

}