package com.netflix.frigga.ami;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.mockito.Mock;

public class GeneratedTestCompareToSameVersions {

    @Mock
    private String amiName;

    @Test
    public void testCompareToSameVersions() {
        AppVersion version1 = new AppVersion("1.2.3");
        AppVersion version2 = new AppVersion("1.2.3");
        int result = version1.compareTo(version2);
        assertThat(result, is(0));
    }

}