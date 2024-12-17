package com.netflix.frigga.ami;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.mockito.Mock;

public class GeneratedTestGetChangelist {

    @Mock
    private String amiName;

    @Test
    public void testGetChangelist() {
        String amiName = "123 package 1.2.3 changelist-abc";
        AppVersion result = AppVersion.parseName(amiName);
        assertThat(result.getChangelist(), is("changelist-abc"));
    }

}