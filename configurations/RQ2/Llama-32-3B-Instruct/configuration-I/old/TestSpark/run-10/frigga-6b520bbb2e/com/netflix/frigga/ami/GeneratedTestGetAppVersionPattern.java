package com.netflix.frigga.ami;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.mockito.Mock;

public class GeneratedTestGetAppVersionPattern {

    @Mock
    private String amiName;

    @Test
    public void testGetAppVersionPattern() {
        Pattern pattern = AppVersion.getAppVersionPattern();
        assertThat(pattern, is(Pattern.compile("\\d+\\.\\d+\\.\\d+")));
    }

}