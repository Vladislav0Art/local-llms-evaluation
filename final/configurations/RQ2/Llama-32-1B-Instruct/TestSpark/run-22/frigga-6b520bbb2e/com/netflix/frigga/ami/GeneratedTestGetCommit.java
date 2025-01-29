package com.netflix.frigga.ami;

import org.junit.Test;

public class GeneratedTestGetCommit {

    @Test
    public void testGetCommit() {
        String commit = "commit";
        AppVersion.commit = commit;
        assertEquals(commit, AppVersion.getCommit());
    }

}