package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCompareTo_SameVersion_ReturnsZero {

    @Test
    public void compareTo_SameVersion_ReturnsZero() {
        AppVersion version1 = AppVersion.parseName("ami-123456789012");
        AppVersion version2 = AppVersion.parseName("ami-123456789012");
        assertEquals(0, version1.compareTo(version2));
    }

}