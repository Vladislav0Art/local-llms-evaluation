package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedGetAppVersionPattern_ReturnsAppVersionPattern {

    @Test
    public void getAppVersionPattern_ReturnsAppVersionPattern() {
        when(AppVersion.getAppVersionPattern()).thenReturn(Pattern.compile("^[a-zA-Z]+\\.[0-9]+$"));
    }

}