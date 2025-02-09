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
public class GeneratedEqualsSameObjectReturnsTrue {

    @Mock
    private Pattern getAppVersionPatternMock;

    @Test
    public void equalsSameObjectReturnsTrue() {
        AppVersion appVersion1 = new AppVersion();
        AppVersion appVersion2 = appVersion1;
        assertTrue(appVersion1.equals(appVersion2));
    }

}