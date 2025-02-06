package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetCommit_ReturnsCommit {

    @Test
    public void getCommit_ReturnsCommit() {
        AppVersion appVersion = new AppVersion();
        assertEquals("commitValue", appVersion.getCommit());
    }

}