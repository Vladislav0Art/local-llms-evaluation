package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetPackageName_EmptyString_ReturnsEmptyString {

    @Test
    public void getPackageName_EmptyString_ReturnsEmptyString() {
        AppVersion version = AppVersion.parseName("");
        assertEquals("", version.getPackageName());
    }

}