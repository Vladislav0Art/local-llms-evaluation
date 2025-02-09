package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetCommit_ValidAminame_ReturnsExpectedCommit {

    @Test
    public void getCommit_ValidAminame_ReturnsExpectedCommit() {
        AppVersion appVersion = new AppVersion("0.9.1-EC2-X86_64-GP2");
        String expectedCommit = "ec2";
        assertEquals(expectedCommit, appVersion.getCommit());
    }

}