package com.netflix.frigga.ami;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

import org.mockito.Mock;

import java.util.regex.Pattern;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetCommitTest {

    @Test
    public void getCommitTest() {
        AppVersion appVersion = AppVersion.parseName("version-1.0-a1b2c3");
        assertEquals("a1b2c3", appVersion.getCommit());
    }

}