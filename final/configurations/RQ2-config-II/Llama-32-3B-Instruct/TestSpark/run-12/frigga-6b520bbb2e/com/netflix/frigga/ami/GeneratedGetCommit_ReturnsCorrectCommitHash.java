package com.netflix.frigga.ami;

public class GeneratedGetCommit_ReturnsCorrectCommitHash {

    @Test
    public void getCommit_ReturnsCorrectCommitHash() {
        String amiName = "my-ami-name-1234";
        // Mock commit hash, as it is not easily testable without mocking the entire build process
        assertEquals("mock-commit-hash", AppVersion.parseName(amiName).getCommit());
    }

}