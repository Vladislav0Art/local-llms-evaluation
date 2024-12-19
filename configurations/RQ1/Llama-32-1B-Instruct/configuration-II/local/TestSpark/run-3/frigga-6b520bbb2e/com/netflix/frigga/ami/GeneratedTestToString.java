package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class GeneratedTestToString {

    private AppVersion appVersion = new AppVersion();

    @Test
    public void testToString() {
        StringamiName = "subscriberha-1.0.0-586499";
        appVersion.setPackageName(amiName);
        appVersion.setVersion(amiName);
        appVersion.setBuildJobName(amiName);
        appVersion.setBuildNumber(amiName);
        appVersion.setCommit(amiName);

        String expected = "AppVersion [packageName=subscriberha-1.0.0-586499, version=1.0.0-586499, buildJobName=h150, buildNumber=1.0.0-586499, changelist=1.0.0-586499]";
        assertThat(appVersion.toString(), is(expected));
    }

}