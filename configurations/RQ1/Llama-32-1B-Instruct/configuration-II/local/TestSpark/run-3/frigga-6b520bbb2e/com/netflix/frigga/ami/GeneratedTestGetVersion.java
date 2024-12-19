package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class GeneratedTestGetVersion {

    private AppVersion appVersion = new AppVersion();

    @Test
    public void testGetVersion() {
        StringamiName = "subscriberha-1.0.0-586499";
        appVersion.setVersion(amiName);
        assertThat(appVersion.getVersion(), is("1.0.0-586499"));
    }

}