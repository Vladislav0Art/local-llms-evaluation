package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCompareTo_SameVersion_ReturnsZero {

    @Test
    public void compareTo_SameVersion_ReturnsZero() {
        AppVersion version1 = AppVersion.parseName("ami-name-1.2.3");
        AppVersion version2 = AppVersion.parseName("ami-name-1.2.3");
        int result = version1.compareTo(version2);
        assertEquals(0, result);
    }

}