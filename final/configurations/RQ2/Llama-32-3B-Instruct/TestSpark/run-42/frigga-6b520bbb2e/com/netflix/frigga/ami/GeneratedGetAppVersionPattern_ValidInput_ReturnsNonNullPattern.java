package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedGetAppVersionPattern_ValidInput_ReturnsNonNullPattern {

    @Test
    public void getAppVersionPattern_ValidInput_ReturnsNonNullPattern() {
        Pattern pattern = AppVersion.getAppVersionPattern();
        assertNotNull(pattern);
    }

}