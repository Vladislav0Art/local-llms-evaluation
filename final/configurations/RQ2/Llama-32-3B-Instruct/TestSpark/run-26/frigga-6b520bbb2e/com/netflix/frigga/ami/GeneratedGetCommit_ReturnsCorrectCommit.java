package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedGetCommit_ReturnsCorrectCommit {

    @Test
    public void getCommit_ReturnsCorrectCommit() {
        String commit = new AppVersion().getCommit();
        assertEquals("Commit", commit);
    }

}