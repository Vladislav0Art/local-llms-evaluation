package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCompareTo_LessThanVersion_ReturnsNegative {

    @Test
    public void compareTo_LessThanVersion_ReturnsNegative() {
        AppVersion version1 = AppVersion.parseName("ami-123456789012");
        AppVersion version2 = AppVersion.parseName("ami-123456789011");
        assertTrue(version1.compareTo(version2) < 0);
    }

}