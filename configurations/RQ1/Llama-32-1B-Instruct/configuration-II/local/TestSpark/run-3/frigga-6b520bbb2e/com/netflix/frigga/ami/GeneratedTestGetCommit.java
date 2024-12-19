package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class GeneratedTestGetCommit {

    private AppVersion appVersion = new AppVersion();

    @Test
    public void testGetCommit() {
        StringamiName = "subscriberha-1.0.0-586499";
        appVersion.setCommit(amiName);
        assertThat(appVersion.getCommit(), is("1.0.0-586499"));
    }

}