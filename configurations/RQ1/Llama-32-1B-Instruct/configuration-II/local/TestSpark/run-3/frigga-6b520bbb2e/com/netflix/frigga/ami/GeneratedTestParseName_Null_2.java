package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class GeneratedTestParseName_Null_2 {

    private AppVersion appVersion = new AppVersion();

    @Test
    public void testParseName_Null_2() {
        String amiName = null;
        AppVersion parsedName = AppVersion.parseName(amiName);
        assertThat(parsedName.packageName, is(null));
        assertThat(parsedName.version, is(null));
    }

}