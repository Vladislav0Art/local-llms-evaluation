package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;

public class GeneratedGetCommit_ReturnsCorrectString {

    @Test
    public void getCommit_ReturnsCorrectString() {
        AppVersion appVersion = new AppVersion(1, 2, 3);
        assertTrue(appVersion.getCommit().equals("abcd1234"));
    }

}