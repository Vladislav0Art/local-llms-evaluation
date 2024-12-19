package com.netflix.frigga.ami;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.mockito.Mock;

public class GeneratedTestParseNameWithNoVersion {

    @Mock
    private String amiName;

    @Test
    public void testParseNameWithNoVersion() {
        AppVersion result = AppVersion.parseName("123 package");
        assertThat(result.getPackageName(), is("package"));
        assertThat(result.getVersion(), is(null));
        assertThat(result.getBuildJobName(), is(null));
        assertThat(result.getBuildNumber(), is(null));
        assertThat(result.getCommit(), is(null));
    }

}