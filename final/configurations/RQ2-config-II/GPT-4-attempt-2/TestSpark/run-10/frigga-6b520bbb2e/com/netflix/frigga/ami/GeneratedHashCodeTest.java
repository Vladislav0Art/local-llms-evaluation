package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedHashCodeTest {

    @Test
    public void hashCodeTest() {
        AppVersion appVersion = AppVersion.parseName("app-1.0.0-h1.build1-abcdef");
        int hashCode = appVersion.hashCode();
        assertEquals(hashCode, appVersion.hashCode());
    }

}