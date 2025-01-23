package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.regex.Pattern;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedParseName_NullString_ThrowsNullPointerException {

    @Test
    public void parseName_NullString_ThrowsNullPointerException() {
        try {
            AppVersion.parseName(null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // Expected
        }
    }

}