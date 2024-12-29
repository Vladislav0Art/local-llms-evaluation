package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import java.util.regex.Pattern;

import static org.junit.Assert.*;

public class GeneratedEqualsFalseTest {

    @Test
    public void equalsFalseTest() {
        AppVersion appVersion1 = AppVersion.parseName("test-ami");
        AppVersion appVersion2 = AppVersion.parseName("other-ami");
        assertFalse(appVersion1.equals(appVersion2));
    }

}