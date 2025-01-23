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
public class GeneratedCompareTo_GreaterVersion_ReturnsPositive {

    @Test
    public void compareTo_GreaterVersion_ReturnsPositive() {
        AppVersion version1 = AppVersion.parseName("ami-name-1.2.3");
        AppVersion version2 = AppVersion.parseName("ami-name-1.2.4");
        int result = version1.compareTo(version2);
        assertTrue(result > 0);
    }

}