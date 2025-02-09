package com.netflix.frigga.ami;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetBuildNumberAlwaysReturnsNameConstantsBUILD_NUMBER {

    @Mock
    private Pattern getAppVersionPatternMock;

    @Test
    public void getBuildNumberAlwaysReturnsNameConstantsBUILD_NUMBER() {
        AppVersion appVersion = new AppVersion();
        assertEquals(NameConstants.BUILD_NUMBER, appVersion.getBuildNumber());
    }

}