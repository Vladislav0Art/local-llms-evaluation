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
public class GeneratedGetCommitAlwaysReturnsNameConstantsCOMMIT {

    @Mock
    private Pattern getAppVersionPatternMock;

    @Test
    public void getCommitAlwaysReturnsNameConstantsCOMMIT() {
        AppVersion appVersion = new AppVersion();
        assertEquals(NameConstants.COMMIT, appVersion.getCommit());
    }

}