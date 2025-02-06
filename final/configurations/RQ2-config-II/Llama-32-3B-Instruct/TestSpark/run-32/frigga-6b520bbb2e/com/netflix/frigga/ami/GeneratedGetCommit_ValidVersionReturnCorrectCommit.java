package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetCommit_ValidVersionReturnCorrectCommit {

    @Test
    public void getCommit_ValidVersionReturnCorrectCommit() {
        AppVersion version = new AppVersion("ami-1234", 12, 34);
        assertEquals("commit-1234", version.getCommit());
    }

}