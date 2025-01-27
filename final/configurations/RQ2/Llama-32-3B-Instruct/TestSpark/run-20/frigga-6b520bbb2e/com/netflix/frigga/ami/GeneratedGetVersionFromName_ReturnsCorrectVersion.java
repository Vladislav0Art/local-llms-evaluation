package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedGetVersionFromName_ReturnsCorrectVersion {

    @Test
    public void getVersionFromName_ReturnsCorrectVersion() {
        assertEquals("1.0", AppVersion.parseName("1.0-2012021501234-alias-amzn2-ami-hvm-x86-64-gp2").getVersion());
    }

}