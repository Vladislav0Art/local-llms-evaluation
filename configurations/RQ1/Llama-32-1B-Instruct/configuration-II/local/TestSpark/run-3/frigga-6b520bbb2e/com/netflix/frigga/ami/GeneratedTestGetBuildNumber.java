package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class GeneratedTestGetBuildNumber {

    private AppVersion appVersion = new AppVersion();

    @Test
    public void testGetBuildNumber() {
        StringamiName = "subscriberha-1.0.0-586499";
        appVersion.setBuildNumber(amiName);
        assertThat(appVersion.getBuildNumber(), is("1.0.0-586499"));
    }

}