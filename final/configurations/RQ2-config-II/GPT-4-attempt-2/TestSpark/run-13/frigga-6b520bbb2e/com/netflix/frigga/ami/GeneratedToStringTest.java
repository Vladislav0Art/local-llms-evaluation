package com.netflix.frigga.ami;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

import org.mockito.Mock;

import java.util.regex.Pattern;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedToStringTest {

    @Test
    public void toStringTest() {
        String amiName = "version-1.0";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertEquals(amiName, appVersion.toString());
    }

}