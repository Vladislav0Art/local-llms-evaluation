package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import java.util.regex.Pattern;

import static org.junit.Assert.*;

public class GeneratedEqualsTest {

    @Test
    public void equalsTest() {
        AppVersion appVersion1 = AppVersion.parseName("test-ami");
        AppVersion appVersion2 = AppVersion.parseName("test-ami");
        assertTrue(appVersion1.equals(appVersion2));
    }

}