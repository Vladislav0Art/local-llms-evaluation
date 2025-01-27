package com.netflix.frigga.ami;

public class GeneratedConstructAppVersionWithCommit {

    @Test
    public void constructAppVersionWithCommit() {
        String commit = "test-commit";
        AppVersion appVersion = new AppVersion("", "", commit);
        assertEquals(commit, appVersion.getCommit());
    }

}