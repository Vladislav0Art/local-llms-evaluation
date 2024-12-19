package com.netflix.frigga.ami;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.mockito.Mock;

public class GeneratedTestGetPackageNameAndVersion {

    @Mock
    private String amiName;

    @Test
    public void testGetPackageNameAndVersion() {
        String amiName = "123 package 1.2.3";
        AppVersion result = AppVersion.parseName(amiName);
        assertThat(result.getPackageName(), is("package"));
        assertThat(result.getVersion(), is("1.2.3"));
    }

}