package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedParseName_ValidFormat_ReturnsExpectedAppVersion {

    @Test
    public void parseName_ValidFormat_ReturnsExpectedAppVersion() {
        String valid = NameConstants.FREGGA_AMI_3_0_2;
        AppVersion expected = new AppVersion(valid);
        assertEquals(expected, AppVersion.parseName(valid));
    }

}