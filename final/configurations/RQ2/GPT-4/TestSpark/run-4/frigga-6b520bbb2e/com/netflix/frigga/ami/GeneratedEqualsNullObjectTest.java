package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Pattern;

public class GeneratedEqualsNullObjectTest {

    @Test
    public void equalsNullObjectTest() {
        AppVersion appVersion = AppVersion.parseName("com.netflix.server-1.0-h12.170042ebd");
        assertFalse(appVersion.equals(null));
    }

}