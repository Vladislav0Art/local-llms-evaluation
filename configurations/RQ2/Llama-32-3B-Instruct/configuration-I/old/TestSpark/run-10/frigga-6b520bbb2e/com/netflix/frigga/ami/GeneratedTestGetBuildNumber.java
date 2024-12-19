package com.netflix.frigga.ami;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.mockito.Mock;

public class GeneratedTestGetBuildNumber {

    @Mock
    private String amiName;

    @Test
    public void testGetBuildNumber() {
        String amiName = "123 package 1.2.3 build-123";
        AppVersion result = AppVersion.parseName(amiName);
        assertThat(result.getBuildNumber(), is("123"));
    }

}