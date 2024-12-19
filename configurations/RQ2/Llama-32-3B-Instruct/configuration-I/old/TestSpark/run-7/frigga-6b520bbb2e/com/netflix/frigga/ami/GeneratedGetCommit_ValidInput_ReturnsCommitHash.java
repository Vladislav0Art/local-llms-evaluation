package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Pattern;
import java.util.HashMap;
import java.util.Map;

public class GeneratedGetCommit_ValidInput_ReturnsCommitHash {

    @Test
    public void getCommit_ValidInput_ReturnsCommitHash() {
        String amiName = "git-hash-abc123def456";
        String commitHash = "git-hash-abc123def456";
        assertEquals(commitHash, new AppVersion(amiName).getCommit());
    }

}