package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetCommitNotSetTest {

    @Test
    public void getCommitNotSetTest() {
        AppVersion appVersion = new AppVersion();
        assertNull(appVersion.getCommit());
    }

}