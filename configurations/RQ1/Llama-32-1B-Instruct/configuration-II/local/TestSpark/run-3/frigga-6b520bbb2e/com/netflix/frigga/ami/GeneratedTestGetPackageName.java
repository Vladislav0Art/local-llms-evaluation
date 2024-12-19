package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class GeneratedTestGetPackageName {

    private AppVersion appVersion = new AppVersion();

    @Test
    public void testGetPackageName() {
        StringamiName = "subscriberha-1.0.0-586499";
        appVersion.setPackageName(amiName);
        assertThat(appVersion.getPackageName(), is("subscriberha-1.0.0-586499"));
    }

}