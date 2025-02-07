package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetPackageName_ValidString_ReturnsPackageName {

    @Test
    public void getPackageName_ValidString_ReturnsPackageName() {
        AppVersion version = AppVersion.parseName("ami-123456789012");
        assertEquals("ami", version.getPackageName());
    }

}