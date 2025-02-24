package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedGetCommitTest1 {

    @Test
    public void getCommitTest1() {
        AppVersion appVersion = new AppVersion();

        String result = appVersion.getCommit();

        assertNotNull(result);
    }

}