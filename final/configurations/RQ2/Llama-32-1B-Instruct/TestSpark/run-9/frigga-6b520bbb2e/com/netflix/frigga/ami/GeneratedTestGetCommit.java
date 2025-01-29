package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;
import org.junit.Test;

public class GeneratedTestGetCommit {

    @Test
    public void testGetCommit() {
        // Create a mock for AppVersion and get its commit
        AppVersion appVersion = mock(AppVersion.class);
        String expectedCommit = "commit-message";
        when(appVersion.getCommit()).thenReturn(expectedCommit);
        assertEquals(expectedCommit, appVersion.getCommit());
    }

}