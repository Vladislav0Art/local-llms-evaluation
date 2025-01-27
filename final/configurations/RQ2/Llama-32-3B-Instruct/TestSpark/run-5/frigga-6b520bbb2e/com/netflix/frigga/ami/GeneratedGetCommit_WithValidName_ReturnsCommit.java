package com.netflix.frigga.ami;

public class GeneratedGetCommit_WithValidName_ReturnsCommit {

    @Test
    public void getCommit_WithValidName_ReturnsCommit() {
        String commit = "12345";
        String amiName = "my-ami-" + commit;
        AppVersion appVersion = new AppVersion(amiName);
        assertEquals(commit, appVersion.getCommit());
    }

}