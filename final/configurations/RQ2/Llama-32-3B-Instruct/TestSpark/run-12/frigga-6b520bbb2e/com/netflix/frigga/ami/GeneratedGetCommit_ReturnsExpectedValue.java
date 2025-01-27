package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetCommit_ReturnsExpectedValue {

    @Test
    public void getCommit_ReturnsExpectedValue() {
        String commit = AppVersion.getCommit();
        assertNotNull(commit);
    }

}