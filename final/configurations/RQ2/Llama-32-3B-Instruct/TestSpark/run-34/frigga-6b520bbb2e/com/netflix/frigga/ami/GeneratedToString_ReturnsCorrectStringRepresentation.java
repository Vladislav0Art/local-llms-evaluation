package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedToString_ReturnsCorrectStringRepresentation {

    @Test
    public void toString_ReturnsCorrectStringRepresentation() {
        AppVersion appVersion = new AppVersion("ami-123");
        String expected = "ami-123 (build-job-name: build-number, commit-hash)";
        assertEquals(expected, appVersion.toString());
    }

}