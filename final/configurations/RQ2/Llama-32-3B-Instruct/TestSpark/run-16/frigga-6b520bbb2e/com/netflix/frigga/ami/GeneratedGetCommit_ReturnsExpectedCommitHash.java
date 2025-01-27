package com.netflix.frigga.ami;

public class GeneratedGetCommit_ReturnsExpectedCommitHash {

    @Test
    public void getCommit_ReturnsExpectedCommitHash() {
        String commit = AppVersion.getCommit();
        assertNotNull(commit);
        assertTrue(commit.length() == 40); // expected length of a SHA-256 hash
    }

}