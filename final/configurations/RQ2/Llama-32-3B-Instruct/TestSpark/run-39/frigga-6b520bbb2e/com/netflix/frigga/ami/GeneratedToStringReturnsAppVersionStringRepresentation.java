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
public class GeneratedToStringReturnsAppVersionStringRepresentation {

    @Mock
    private Pattern getAppVersionPatternMock;

    @Test
    public void toStringReturnsAppVersionStringRepresentation() {
        String expected = "com.netflix.frigga.ami/1.9.x";
        AppVersion appVersion = new AppVersion();
        assertEquals(expected, appVersion.toString());
    }

}