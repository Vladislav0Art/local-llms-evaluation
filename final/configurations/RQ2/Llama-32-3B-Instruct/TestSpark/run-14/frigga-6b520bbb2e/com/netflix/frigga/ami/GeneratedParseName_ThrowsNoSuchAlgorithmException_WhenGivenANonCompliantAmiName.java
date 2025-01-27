package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.netflix.frigga.NameConstants;
import org.mockito.Mockito;

public class GeneratedParseName_ThrowsNoSuchAlgorithmException_WhenGivenANonCompliantAmiName {

    @Test
    public void parseName_ThrowsNoSuchAlgorithmException_WhenGivenANonCompliantAmiName() {
        String amiName = "abc.def.ghi-jkl";
        try {
            AppVersion.parseName(amiName);
            fail("Expected exception not thrown");
        } catch (Exception e) {
            assertTrue(e instanceof java.lang.NoSuchAlgorithmException);
        }
    }

}