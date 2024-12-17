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
public class GeneratedTestToString {

    @Mock
    private Pattern appVersionPattern;

    @InjectMocks
    private AppVersion appVersion;

    @Test
    public void testToString() {
        appVersion.setPackageName("subscriberha");
        appVersion.setVersion("1.0.0-586499");
        appVersion.setBuildJobName("job");
        appVersion.setBuildNumber("123");
        appVersion.setCommit("456");
        String expected = "AppVersion [packageName=subscriberha, version=1.0.0-586499, buildJobName=job, buildNumber=123, changelist=456]";
        assertEquals(expected, appVersion.toString());
    }

}