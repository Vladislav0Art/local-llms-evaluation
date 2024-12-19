package com.netflix.frigga.ami;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.mockito.Mock;

public class GeneratedTestParseNameWithValidInput {

    @Mock
    private String amiName;

    @Test
    public void testParseNameWithValidInput() {
        AppVersion result = AppVersion.parseName("123 package 1.2.3");
        assertThat(result.getPackageName(), is("package"));
        assertThat(result.getVersion(), is("1.2.3"));
        assertThat(result.getBuildJobName(), is(null));
        assertThat(result.getBuildNumber(), is(null));
        assertThat(result.getCommit(), is(null));
    }

}