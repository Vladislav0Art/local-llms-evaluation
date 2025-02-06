package com.netflix.frigga.ami;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetBuildJobNameReturnsBuildJobName {

    @Mock
    private Pattern getAppVersionPatternMock();

    @Test
    public void getBuildJobNameReturnsBuildJobName() {
        AppVersion appVersion = new AppVersion("ami-name", "build-number", "commit-hash");
        String buildJobName = appVersion.getBuildJobName();
        assertTrue(buildJobName.equals(NameConstants.BUILD_JOB_NAME));
    }

}