package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class GeneratedTestGetBuildJobName {

    private AppVersion appVersion = new AppVersion();

    @Test
    public void testGetBuildJobName() {
        StringamiName = "subscriberha-1.0.0-586499";
        appVersion.setBuildJobName(amiName);
        assertThat(appVersion.getBuildJobName(), is("subscriberha-1.0.0-586499"));
    }

}