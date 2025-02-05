package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import java.util.regex.Pattern;

import static org.junit.Assert.*;

public class GeneratedEqualsNullObjectTest {

    @Test
    public void equalsNullObjectTest() {
        AppVersion appVersion = new AppVersion();
        assertFalse(appVersion.equals(null));
    }

}