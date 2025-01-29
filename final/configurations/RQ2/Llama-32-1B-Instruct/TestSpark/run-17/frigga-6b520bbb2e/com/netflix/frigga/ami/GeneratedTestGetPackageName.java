package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class GeneratedTestGetPackageName {

    @Test
    public void testGetPackageName() {
        String[] args = {"ami-12345678", "xyz"};
        AppVersion appVersion = new AppVersion("ami-12345678");
        assertThat(appVersion.getPackageName(), is(args[0]));
        assertThat(appVersion.getVersion(), is(null));
    }

}