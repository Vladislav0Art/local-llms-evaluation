package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Pattern;
import java.util.Random;
import java.util.Collections;
import java.io.IOException;

public class GeneratedGetPackageName_ReturnsPackageName {

    @Test
    public void getPackageName_ReturnsPackageName() {
        AppVersion appVersion = new AppVersion("my-app");
        assertEquals("my-app", appVersion.getPackageName());
    }

}