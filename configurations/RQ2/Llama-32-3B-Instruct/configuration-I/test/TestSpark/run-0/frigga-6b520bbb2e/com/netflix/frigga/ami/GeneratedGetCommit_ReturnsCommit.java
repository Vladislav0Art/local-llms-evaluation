package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Pattern;
import java.util.Random;
import java.util.Collections;
import java.io.IOException;

public class GeneratedGetCommit_ReturnsCommit {

    @Test
    public void getCommit_ReturnsCommit() {
        AppVersion appVersion = new AppVersion("my-app-1.2.3");
        assertEquals("1234567890", appVersion.getCommit());
    }

}