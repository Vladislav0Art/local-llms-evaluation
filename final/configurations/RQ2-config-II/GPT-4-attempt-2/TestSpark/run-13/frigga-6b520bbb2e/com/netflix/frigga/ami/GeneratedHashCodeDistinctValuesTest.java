package com.netflix.frigga.ami;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

import org.mockito.Mock;

import java.util.regex.Pattern;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedHashCodeDistinctValuesTest {

    @Test
    public void hashCodeDistinctValuesTest() {
        AppVersion appVersion1 = AppVersion.parseName("version-1.0");
        AppVersion appVersion2 = AppVersion.parseName("version-1.1");
        assertTrue(appVersion1.hashCode() != appVersion2.hashCode());
    }

}