package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestGetAppVersionPattern_PatternIsDefined {

    @Test
    public void testGetAppVersionPattern_PatternIsDefined() {
        Pattern pattern = AppVersion.getAppVersionPattern();
        assertNotNull(pattern);
    }

}