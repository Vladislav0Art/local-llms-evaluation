package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.mockito.Mockito;

public class GeneratedHashCode_ReturnsUniqueHashCode {

    @Test
    public void hashCode_ReturnsUniqueHashCode() {
        String amiName = "1.0-ami-havana";
        AppVersion appVersion = AppVersion.parseName(amiName);
        int hashcode = appVersion.hashCode();
        assertNotEquals(hashcode, 0);
    }

}