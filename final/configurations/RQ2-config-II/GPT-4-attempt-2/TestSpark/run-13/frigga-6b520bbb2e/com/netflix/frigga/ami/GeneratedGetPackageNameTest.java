package com.netflix.frigga.ami;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

import org.mockito.Mock;

import java.util.regex.Pattern;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetPackageNameTest {

    @Test
    public void getPackageNameTest() {
        AppVersion appVersion = AppVersion.parseName("version-1.0");
        assertEquals("version", appVersion.getPackageName());
    }

}