package com.netflix.frigga.ami;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestEquals {

    @Mock
    private Pattern appVersionPattern;

    @InjectMocks
    private AppVersion appVersion;

    @Test
    public void testEquals() {
        AppVersion other = new AppVersion();
        other.setPackageName("subscriberha");
        other.setVersion("1.0.0-586499");
        other.setBuildJobName("job");
        other.setBuildNumber("123");
        other.setCommit("456");
        assertEquals(appVersion, other);
    }

}