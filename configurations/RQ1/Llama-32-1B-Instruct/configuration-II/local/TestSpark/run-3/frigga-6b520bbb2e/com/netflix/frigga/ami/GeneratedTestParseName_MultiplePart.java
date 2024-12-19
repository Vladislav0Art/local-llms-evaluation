package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class GeneratedTestParseName_MultiplePart {

    private AppVersion appVersion = new AppVersion();

    @Test
    public void testParseName_MultiplePart() {
        String amiName = "subscriberha-1.0.0-586499.h150";
        AppVersion parsedName = AppVersion.parseName(amiName);
        assertThat(parsedName.packageName, is("subscriberha-"));
        assertThat(parsedName.version, is("1.0.0-586499"));
        assertThat(parsedName.buildJobName, is("h150"));
    }

}