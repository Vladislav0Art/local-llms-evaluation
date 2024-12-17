package com.netflix.frigga.ami;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.mockito.Mock;

public class GeneratedTestCompareToDifferentVersions {

    @Mock
    private String amiName;

    @Test
    public void testCompareToDifferentVersions() {
        AppVersion version1 = new AppVersion("1.2.3");
        AppVersion version2 = new AppVersion("4.5.6");
        int result = version1.compareTo(version2);
        assertThat(result, is(-1));
    }

}