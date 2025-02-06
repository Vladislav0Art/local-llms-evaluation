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
public class GeneratedCompareTo_SameVersionsOrderedCorrectly {

    @Mock
    private String amiName;

    @Mock
    private Pattern pattern;

    @Test
    public void compareTo_SameVersionsOrderedCorrectly() {
        AppVersion version1 = new AppVersion("1", "2", "3");
        AppVersion version2 = new AppVersion("1", "2", "4");
        when(com.netflix.frigga.ami.AppVersion.parseName(anyString())).thenReturn(version1);
        int result = version1.compareTo(version2);
        assertTrue(result < 0);
    }

}