package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class GeneratedTestGetChangelist {

    @Test
    public void testGetChangelist() {
        String[] args = {"ami-12345678", "abcde"};
        AppVersion appVersion = new AppVersion("ami-12345678");
        assertThat(appVersion.getChangelist(), is(args[0]));
        assertThat(appVersion.getBuildJobName(), is(null));
    }

}