package com.netflix.frigga.ami;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

import org.mockito.Mock;

import java.util.regex.Pattern;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCompareToEqualVersionsTest {

    @Test
    public void compareToEqualVersionsTest() {
        AppVersion version1 = AppVersion.parseName("version-1.0");
        AppVersion version2 = AppVersion.parseName("version-1.0");
        assertEquals(0, version1.compareTo(version2));
    }

}