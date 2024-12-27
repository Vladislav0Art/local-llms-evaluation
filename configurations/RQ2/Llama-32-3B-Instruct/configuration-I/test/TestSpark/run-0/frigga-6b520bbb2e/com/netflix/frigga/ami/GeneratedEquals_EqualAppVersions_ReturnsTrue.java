package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Pattern;
import java.util.Random;
import java.io.IOException;
import java.util.Collections;

public class GeneratedEquals_EqualAppVersions_ReturnsTrue {

    @Test
    public void equals_EqualAppVersions_ReturnsTrue() {
        AppVersion appVersion1 = new AppVersion("my-app-1.2.3");
        AppVersion appVersion2 = new AppVersion("my-app-1.2.3");
        assertTrue(appVersion1.equals(appVersion2));
    }

}