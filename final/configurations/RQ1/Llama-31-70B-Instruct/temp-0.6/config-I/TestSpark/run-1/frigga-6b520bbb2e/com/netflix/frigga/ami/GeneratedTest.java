package com.netflix.frigga.ami;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;

import com.netflix.frigga.NameConstants;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private AppVersion appVersion;

    @Test
    public void parseNameReturnsNullWhenAmiNameIsNull() {
        assertThat(AppVersion.parseName(null), is(nullValue()));
    }

    @Test
    public void parseNameReturnsNullWhenAmiNameDoesNotMatchPattern() {
        assertThat(AppVersion.parseName("invalid_ami_name"), is(nullValue()));
    }

    @Test
    public void parseNameReturnsAppVersionObjectWhenAmiNameMatchesPattern() {
        String amiName = "subscriberha-1.0.0-586499";
        AppVersion parsedAppVersion = AppVersion.parseName(amiName);

        assertThat(parsedAppVersion.getPackageName(), is("subscriberha"));
        assertThat(parsedAppVersion.getVersion(), is("1.0.0"));
        assertThat(parsedAppVersion.getBuildNumber(), is("586499"));
    }

}