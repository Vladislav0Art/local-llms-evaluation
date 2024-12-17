package com.netflix.frigga.ami;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.mockito.Mock;

public class GeneratedTestParseName {

    @Mock
    private String amiName;

    @Test
    public void testParseName() {
        AppVersion result = AppVersion.parseName(amiName);
        assertThat(result, is(null));
    }

}