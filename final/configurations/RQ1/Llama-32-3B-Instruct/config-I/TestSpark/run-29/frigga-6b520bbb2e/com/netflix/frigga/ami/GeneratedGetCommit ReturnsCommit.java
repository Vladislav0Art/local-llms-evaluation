package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class GeneratedGetCommit ReturnsCommit {

    @Test
    public void getCommit

    ReturnsCommit() {
        String amiName = "subscriberha-1.0.0-586499.h150";
        AppVersion result = AppVersion.parseName(amiName);
        assertEquals("h150", result.getCommit());
    }

}