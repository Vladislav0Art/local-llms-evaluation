package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class GeneratedTestGetVersion {

    @Test
    public void testGetVersion() {
        String[] args = {"ami-12345678", "abcde"};
        AppVersion appVersion = new AppVersion("ami-12345678");
        assertThat(appVersion.getVersion(), is(args[0]));
        assertThat(appVersion.getBuildNumber(), is(null));
    }

}