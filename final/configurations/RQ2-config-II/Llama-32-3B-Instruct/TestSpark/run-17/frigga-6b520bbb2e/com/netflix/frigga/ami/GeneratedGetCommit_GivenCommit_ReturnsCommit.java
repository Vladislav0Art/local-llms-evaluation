package com.netflix.frigga.ami;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetCommit_GivenCommit_ReturnsCommit {

    @Mock
    private String amiName;

    @Test
    public void getCommit_GivenCommit_ReturnsCommit() {
        AppVersion appVersion = new AppVersion("test", "test");
        assertEquals("test", appVersion.getCommit());
    }

}