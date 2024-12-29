package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedGetCommit_ReturnsCommitHash {

    @Test
    public void getCommit_ReturnsCommitHash() {
        AppVersion appVersion = new AppVersion("abcdefg");
        assertNotNull(appVersion.getCommit());
    }

}