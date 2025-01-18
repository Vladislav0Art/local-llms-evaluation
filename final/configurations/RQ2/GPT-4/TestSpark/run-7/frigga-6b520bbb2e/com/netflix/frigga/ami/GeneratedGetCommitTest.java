package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.Test;

import java.util.regex.Pattern;

import static org.junit.Assert.assertEquals;

public class GeneratedGetCommitTest {

    @Test
    public void getCommitTest() {
        String commit = "12345";
        AppVersion appVersion = AppVersion.parseName(commit);
        assertEquals(commit, appVersion.getCommit());
    }

}