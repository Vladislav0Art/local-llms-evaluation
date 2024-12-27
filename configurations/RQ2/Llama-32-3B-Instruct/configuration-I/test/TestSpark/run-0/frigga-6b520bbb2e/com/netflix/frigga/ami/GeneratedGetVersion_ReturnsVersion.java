package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Pattern;
import java.util.Random;
import java.util.Collections;
import java.io.IOException;

public class GeneratedGetVersion_ReturnsVersion {

    @Test
    public void getVersion_ReturnsVersion() {
        AppVersion appVersion = new AppVersion();
        assertEquals("", appVersion.getVersion());
    }

}