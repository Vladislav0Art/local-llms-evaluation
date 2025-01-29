package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class GeneratedTestParseName {

    @Test
    public void testParseName() {
        String amiName = "ami-12345678-abcde";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertThat(appVersion.getPackageName(), is("ami-12345678"));
        assertThat(appVersion.getVersion(), is("abcde"));
    }

}