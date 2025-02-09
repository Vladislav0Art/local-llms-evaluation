package com.netflix.frigga.ami;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

import org.mockito.Mock;

import java.util.regex.Pattern;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCompareToBiggerVersionTest {

    @Test
    public void compareToBiggerVersionTest() {
        AppVersion version1 = AppVersion.parseName("version-1.0");
        AppVersion version2 = AppVersion.parseName("version-2.0");
        assertTrue(version1.compareTo(version2) < 0);
    }

}