package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Pattern;
import java.util.Random;
import java.io.IOException;
import java.util.Collections;

public class GeneratedToString_ReturnsToStringRepresentationOfAppVersion {

    @Test
    public void toString_ReturnsToStringRepresentationOfAppVersion() {
        AppVersion appVersion = new AppVersion("my-app-1.2.3");
        assertEquals("my-app-1.2.3", appVersion.toString());
    }

}