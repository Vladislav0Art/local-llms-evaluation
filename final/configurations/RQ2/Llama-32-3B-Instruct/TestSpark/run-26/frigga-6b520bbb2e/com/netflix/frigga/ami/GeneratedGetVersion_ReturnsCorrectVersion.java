package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedGetVersion_ReturnsCorrectVersion {

    @Test
    public void getVersion_ReturnsCorrectVersion() {
        String version = new AppVersion().getVersion();
        assertEquals("", version);
    }

}