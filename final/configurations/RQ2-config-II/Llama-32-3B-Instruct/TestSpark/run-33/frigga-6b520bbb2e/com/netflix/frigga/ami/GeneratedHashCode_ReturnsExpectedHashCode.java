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
public class GeneratedHashCode_ReturnsExpectedHashCode {

    @Mock
    private Pattern pattern;

    @Test
    public void hashCode_ReturnsExpectedHashCode() {
        int expectedHashcode = 12345;
        AppVersion appVersion = new AppVersion("expected-hash-value");
        assertEquals(expectedHashcode, appVersion.hashCode());
    }

}