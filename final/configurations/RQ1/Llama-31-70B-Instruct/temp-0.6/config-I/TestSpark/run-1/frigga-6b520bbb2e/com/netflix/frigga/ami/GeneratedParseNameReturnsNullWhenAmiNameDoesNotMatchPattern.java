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
public class GeneratedParseNameReturnsNullWhenAmiNameDoesNotMatchPattern {

    @Mock
    private AppVersion appVersion;

    @Test
    public void parseNameReturnsNullWhenAmiNameDoesNotMatchPattern() {
        assertThat(AppVersion.parseName("invalid_ami_name"), is(nullValue()));
    }

}