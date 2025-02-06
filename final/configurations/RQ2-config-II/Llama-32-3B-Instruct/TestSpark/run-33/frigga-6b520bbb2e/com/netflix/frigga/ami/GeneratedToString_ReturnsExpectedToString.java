package com.netflix.frigga.ami;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedToString_ReturnsExpectedToString {

    @Mock
    private Pattern pattern;

    @Test
    public void toString_ReturnsExpectedToString() {
        String expectedString = "test-version-string";
        AppVersion appVersion = new AppVersion(expectedString);
        assertEquals(expectedString, appVersion.toString());
    }

}