package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class GeneratedTestToString {

    @Test
    public void testToString() {
        String[] args = {"ami-12345678", "abcde"};
        AppVersion appVersion = new AppVersion("ami-12345678");
        assertThat(appVersion.toString(), is(args[0]));
        assertThat(appVersion.hashCode(), is(0));
    }

}