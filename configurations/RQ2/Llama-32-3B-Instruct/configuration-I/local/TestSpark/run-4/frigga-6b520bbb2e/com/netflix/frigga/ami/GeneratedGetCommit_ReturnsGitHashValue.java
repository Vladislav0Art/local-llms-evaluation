package com.netflix.frigga.ami;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetCommit_ReturnsGitHashValue {

    @Mock
    private Pattern getAppVersionPattern();

    @Test
    public void getCommit_ReturnsGitHashValue() {
        AppVersion appVersion = new AppVersion("1.2.3-abcde", null);
        assertEquals("abcde", appVersion.getCommit());
    }

}