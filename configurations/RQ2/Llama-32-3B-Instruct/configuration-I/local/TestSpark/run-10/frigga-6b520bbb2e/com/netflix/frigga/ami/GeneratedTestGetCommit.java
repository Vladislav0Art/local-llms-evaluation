package com.netflix.frigga.ami;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.mockito.Mock;

public class GeneratedTestGetCommit {

    @Mock
    private String amiName;

    @Test
    public void testGetCommit() {
        String amiName = "123 package 1.2.3 commit-abc";
        AppVersion result = AppVersion.parseName(amiName);
        assertThat(result.getCommit(), is("commit-abc"));
    }

}