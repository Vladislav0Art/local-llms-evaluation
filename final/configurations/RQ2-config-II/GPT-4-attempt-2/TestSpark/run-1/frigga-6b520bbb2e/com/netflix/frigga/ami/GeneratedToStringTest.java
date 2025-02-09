package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class GeneratedToStringTest {

    @Test
    public void toStringTest() {
        AppVersion version = AppVersion.parseName("packageName-version-buildJobName-1-commit");
        assertEquals("packageName-version-buildJobName-1-commit", version.toString());
    }

}